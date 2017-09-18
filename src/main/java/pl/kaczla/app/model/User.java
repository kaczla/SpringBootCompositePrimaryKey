package pl.kaczla.app.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "USER")
public class User implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    @JsonManagedReference
    private UserInfo info;

    @EmbeddedId
    private UserPK userPK;

    @Column(name = "LOGIN", nullable = false)
    private String login;
    @Column(name = "EMAIL", nullable = false)
    private String email;

    public User() {
    }

    public UserPK getUserPK() {
        return userPK;
    }

    public void setUserPK(UserPK userPK) {
        this.userPK = userPK;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "info=" + info +
                ", id=" + userPK +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
