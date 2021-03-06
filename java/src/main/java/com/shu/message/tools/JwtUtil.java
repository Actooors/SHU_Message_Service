package com.shu.message.tools;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: management
 * @description: token工具
 * @author: ggmr
 * @create: 2018-07-29 18:33
 */
public class JwtUtil {
    private final static byte[] ENCODE_KEY = "message".getBytes();
    private static JWTVerifier jwtVerifier;

    public static String createJwt(String subject, String userName) throws UnsupportedEncodingException {
        Date currentDate = new Date();
        // 过期时间5天
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        Algorithm algorithm = Algorithm.HMAC512(ENCODE_KEY);
        System.out.print(encode(userName));
        return JWT.create()
                .withIssuedAt(currentDate)
                .withExpiresAt(calendar.getTime())
                .withSubject(subject)
                .withClaim("userName", encode(userName))
                .sign(algorithm);
    }

    public static String parseJwt(String jwt) throws JWTVerificationException {
        Algorithm algorithm  = Algorithm.HMAC512(ENCODE_KEY);
        if (jwtVerifier == null){
            jwtVerifier = JWT.require(algorithm).build();
        }
        jwtVerifier.verify(jwt);
        return JWT.decode(jwt).getSubject();
    }

    static String encode(String url)
    {
        try {
            String encodeURL= URLEncoder.encode( url, "UTF-8" );

            return encodeURL;

        } catch (UnsupportedEncodingException e) {

            return "Issue while encoding" +e.getMessage();

        }

    }

}
