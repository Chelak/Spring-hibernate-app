package app.basepackage.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 7/26/2015.
 */
@Entity
@Table(name = "hobby")
public class Hobby implements Serializable
{
    private String hobbyId;
    private Set<Contact> contacts = new HashSet<Contact>();
    @Id
    @Column(name = "HOBBY_ID")
    public String getHobbyId() {
        return this.hobbyId;
    }
    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }
    public String toString() {
        return "Hobby :" + getHobbyId();
    }


    @ManyToMany
    @JoinTable(name = "contact_hobby_detail",
            joinColumns = @JoinColumn(name = "HOBBY_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTACT_ID"))
    public Set<Contact> getContacts() {
        return this.contacts;
    }
    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
}
