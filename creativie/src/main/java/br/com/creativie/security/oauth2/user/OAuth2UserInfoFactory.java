package br.com.creativie.security.oauth2.user;

import java.util.Map;

import br.com.creativie.exception.OAuth2AuthenticationProcessingException;
import br.com.creativie.model.AuthProvider;

public class OAuth2UserInfoFactory {

	 public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
	        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
	            return new GoogleOAuth2UserInfo(attributes);
	        } else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
	            return new FacebookOAuth2UserInfo(attributes);
	        } else {
	            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
	        }
	    }
}
