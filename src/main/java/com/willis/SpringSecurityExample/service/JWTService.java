package com.willis.SpringSecurityExample.service;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JWTService {

    public static String generateToken(String username) {
        Map<String, Object> claims = new HashMap();
        return Jwts.builder()
                .claims()
                .add(claims)
                .subject()
    }
}
