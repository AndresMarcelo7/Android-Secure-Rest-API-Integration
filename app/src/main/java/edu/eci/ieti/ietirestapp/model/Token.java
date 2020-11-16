package edu.eci.ieti.ietirestapp.model;

public class Token {
    private String accessToken;

    public Token(String token) {
        this.accessToken = token;
    }

    public Token() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String token) {
        this.accessToken = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + accessToken + '\'' +
                '}';
    }
}
