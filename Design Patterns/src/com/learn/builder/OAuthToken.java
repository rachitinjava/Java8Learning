package com.learn.builder;

public class OAuthToken {

	public static class Builder {

		private String clientId;
		private String username;
		private String password;
		private String type;

		public Builder() {

		}

		public Builder clientId(String clientId) {
			this.clientId = clientId;
			return this;
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public OAuthToken build() {
			return new OAuthToken(clientId, username, password, type);
		}

	}

	public String getClientId() {
		return clientId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getType() {
		return type;
	}

	private String clientId;
	private String username;
	private String password;
	private String type;

	private OAuthToken(String clientId, String username, String password, String type) {
		this.clientId = clientId;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	@Override
	public String toString() {
		return "OAuthToken [clientId=" + clientId + ", username=" + username + ", password=" + password + ", type="
				+ type + "]";
	}

}
