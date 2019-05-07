import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;

// Class with OKAPI connector
public class OkapiConnector {
	int response_code;

	public static class ReportError extends Exception {
		private static final long serialVersionUID = 2526489312574632854L;

		public ReportError(String message) {
			super(message);
		}

	}

	// Routine to initialize OKAPI
	public String Init(String username, String password) {
		String accessTokenTransport = "blank";
		String authURL = "https://okapi-development.eu.auth0.com/oauth/token/";
		HttpURLConnection auth = null;

		try {
			JSONObject request_token_payload_json = new JSONObject();
			request_token_payload_json.put("grant_type", "password");
			request_token_payload_json.put("username", username);
			request_token_payload_json.put("password", password);
			request_token_payload_json.put("audience", "https://api.okapiorbits.space/picard");
			request_token_payload_json.put("scope",
					"('pass_predictions pass_prediction_requests' 'neptune_propagation neptune_propagation_request' 'pass_predictions_long pass_prediction_requests_long')");
			request_token_payload_json.put("client_id", "jrk0ZTrTuApxUstXcXdu9r71IX5IeKD3");
			String requestTokenPayloadString = request_token_payload_json.toString();

			// Create connection
			URL url = new URL(authURL);
			auth = (HttpURLConnection) url.openConnection();
			auth.setRequestMethod("POST");
			auth.setRequestProperty("Content-Type", "application/json");
			auth.setUseCaches(false);
			auth.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(auth.getOutputStream());
			wr.writeBytes(requestTokenPayloadString);
			wr.flush();
			wr.close();

			// Get Response
			if (auth.getResponseCode() >= 300) {
				InputStream is_err = auth.getErrorStream();
				BufferedReader rd_err = new BufferedReader(new InputStreamReader(is_err));
				StringBuffer response = new StringBuffer();
				String line;
				while ((line = rd_err.readLine()) != null) {
					response.append(line);
					response.append('\r');
				}
				rd_err.close();
				String err_message = response.toString();
				if (auth.getResponseCode() == 400) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 403) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 408) {
					JSONObject error = new JSONObject();
					error.put("message", "Got timeout when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 422) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 429) {
					JSONObject error = new JSONObject();
					error.put("message",
							"Your send_request0 account has been blocked after 10 failed logins, check your e-mail.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else if (auth.getResponseCode() == 520) {
					JSONObject error = new JSONObject();
					error.put("message", "Got unknown exception, maybe wrong URL.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				} else {
					JSONObject error = new JSONObject();
					error.put("message", "Got HTTPError when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", auth.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + auth.getResponseCode());
				}

			}

			InputStream is = auth.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			JSONObject response_json = new JSONObject(response.toString());
			accessTokenTransport = response_json.getString("access_token");
			System.out.println("Authentication successful");
			return accessTokenTransport;
		} catch (ReportError e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (auth != null) {
				auth.disconnect();
			}
		}
		return accessTokenTransport;
	}

	// Routine to send a service execution request to the server
	public String SendRequest(String sendURL, String body_string, String access_token_transport) {
		String requestId = "blank";
		HttpURLConnection sendRequest = null;

		try {
			// Create connection
			URL url = new URL(sendURL);
			sendRequest = (HttpURLConnection) url.openConnection();
			sendRequest.setRequestMethod("POST");
			sendRequest.setRequestProperty("Content-Type", "application/json");
			sendRequest.setRequestProperty("access_token", access_token_transport);
			sendRequest.setUseCaches(false);
			sendRequest.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(sendRequest.getOutputStream());
			wr.writeBytes(body_string);
			wr.flush();
			wr.close();

			// Get Response
			if (sendRequest.getResponseCode() >= 300) {
				StringBuffer response = new StringBuffer();
				String err_message = response.toString();
				if (sendRequest.getResponseCode() == 401) {
					JSONObject error = new JSONObject();
					error.put("message", "You are unathorized.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 408) {
					JSONObject error = new JSONObject();
					error.put("message", "Got timeout when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 422) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 500) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else if (sendRequest.getResponseCode() == 520) {
					JSONObject error = new JSONObject();
					error.put("message", "Got unknown exception, maybe wrong URL.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				} else {
					JSONObject error = new JSONObject();
					error.put("message", "Got HTTPError when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", sendRequest.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + sendRequest.getResponseCode());
				}

			}

			InputStream is = sendRequest.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			JSONObject response_json = new JSONObject(response.toString());
			requestId = response_json.getString("request_id");

			System.out.println("send_request successful, with request ID:" + requestId);
			return requestId;
		} catch (ReportError e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sendRequest != null) {
				sendRequest.disconnect();
			}
		}
		return requestId;
	}

	public String GetResults(String getURL, String accessTokenTransport) {
		String results_transport = "blank";
		HttpURLConnection getResults = null;

		try {
			// Create connection
			URL url = new URL(getURL);
			getResults = (HttpURLConnection) url.openConnection();
			getResults.setRequestMethod("GET");
			getResults.setRequestProperty("Content-Type", "application/json");
			getResults.setRequestProperty("access_token", accessTokenTransport);

			// Get Response
			response_code = getResults.getResponseCode();
			if (getResults.getResponseCode() >= 300) {
				StringBuffer response = new StringBuffer();
				String err_message = response.toString();
				if (getResults.getResponseCode() == 401) {
					JSONObject error = new JSONObject();
					error.put("message", "You are unathorized.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 408) {
					JSONObject error = new JSONObject();
					error.put("message", "Got timeout when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 422) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 500) {
					JSONObject error = new JSONObject();
					error.put("message", err_message);
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else if (getResults.getResponseCode() == 520) {
					JSONObject error = new JSONObject();
					error.put("message", "Got unknown exception, maybe wrong URL.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				} else {
					JSONObject error = new JSONObject();
					error.put("message", "Got HTTPError when sending request.");
					error.put("status", "FATAL");
					error.put("web_status", getResults.getResponseCode());
					System.out.println(error.toString());
					throw new ReportError("ERROR: " + getResults.getResponseCode());
				}

			}

			InputStream is = getResults.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();

			results_transport = response.toString();
			return results_transport;
		} catch (ReportError e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (getResults != null) {
				getResults.disconnect();
			}
		}
		return results_transport;
	}

}