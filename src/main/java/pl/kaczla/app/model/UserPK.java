package pl.kaczla.app.model;

import java.io.Serializable;

public class UserPK implements Serializable {

    private Long id;
    private String type;

    public UserPK() {
    }

    public UserPK(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPK userPK = (UserPK) o;

        if (!id.equals(userPK.id)) return false;
        return type.equals(userPK.type);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserPK{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    public boolean valid() {
        return id == null || type == null || type.isEmpty();
    }
}
