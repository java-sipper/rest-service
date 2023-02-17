package com.superhumanai.restservice;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.ZoneId;


public class OauthTokenService {
	
	@Getter
    private String accessToken;
    private LocalDateTime tokenExpiryTime;
    private static long TOKEN_EXPIRY_TIME_MARGIN=120;
    private ZoneId timeZone=ZoneId.of("UTC");

    synchronized public String getOauthToken(){
        if(StringUtils.isBlank(this.accessToken)||null==tokenExpiryTime||tokenExpiryTime.isBefore(LocalDateTime.now(timeZone))){
        	fetchOauthToken();
        }
        return this.accessToken;
    }

	private void fetchOauthToken() {
		//get token response form authorization server
		//set token to this.accessToken;
		this.accessToken="fdfdf";
		//set expiry time to tokenExpiryTime in utc
		setTokenExpiryTime(180-TOKEN_EXPIRY_TIME_MARGIN);
		
	}

	private void setTokenExpiryTime(long miliSeconds) {
		this.tokenExpiryTime=LocalDateTime.now(timeZone).plusSeconds(miliSeconds);	
	}
}
