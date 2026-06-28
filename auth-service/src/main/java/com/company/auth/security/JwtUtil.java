package com.company.auth.security;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	private JwtUtil() {
		/* This utility class should not be instantiated */
	}

	private static final String SECRET = "mysecretkeymysecretkeymysecretkey123";

	private static final Key KEY = new SecretKeySpec(SECRET.getBytes(), SignatureAlgorithm.HS256.getJcaName());

	public static String generateToken(String username, String role) {

		return Jwts.builder()
				.setSubject(username)
				.claim("role", role)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 3600000))
				.signWith(KEY)
				.compact();
	}
}