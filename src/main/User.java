package com.customsite.helloworld;

/**
 * Created by julian.bishop on 11/21/15.
 */
public class User {

    private String m_user;
    private String m_password;

    public User (String user, String password) {
        m_user = user;
        m_password = password;
    }

    public String getUsername() {
        return m_user;
    }

    public java.lang.String getPassword() {
        return m_password;
    }
}
