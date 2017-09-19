package pl.kaczla.app.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER_INFO")
public class UserInfo implements Serializable {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "id", referencedColumnName = "id"),
            @JoinColumn(name = "type", referencedColumnName = "type")
    })
    @JsonBackReference
    @MapsId
    private User user;

    @EmbeddedId
    private UserPK userPK;

    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;

    public UserInfo() {
    }

    public UserPK getUserPK() {
        return userPK;
    }

    public void setUserPK(UserPK userPK) {
        this.userPK = userPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userPK=" + userPK +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
