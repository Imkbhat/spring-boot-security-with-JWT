package com.luv2code.springsecurityjwt.json;

import java.io.Serializable;

import lombok.Data;
@Data
public class JwtResponse implements Serializable {

	private final String token;

}