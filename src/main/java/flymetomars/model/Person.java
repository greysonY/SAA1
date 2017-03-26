package flymetomars.model;

import com.google.common.base.Objects;
import validator.Validator;

import java.util.HashSet;
import java.util.Set;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by yli on 10/03/15.
 */
public class Person extends SeriablizableEntity {
    private String firstName;
    private String lastName;
    private String email;
    protected String userName;
    private String password;

    private Set<Expertise> expertise;
    private Set<Mission> missionRegistered;
    private Set<Invitation> invitationsReceived;
    private Set<Equipment> equipmentOwned;
    private Set<Person> willingPerson;
    private Set<Person> unwillingPerson;


    private Validator validator;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equal(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }


    /**
     * Default person constructor
     */
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.userName = "";
        this.password = "";
        expertise = new HashSet<Expertise>();
        missionRegistered = new HashSet<Mission>();
        invitationsReceived = new HashSet<Invitation>();
        equipmentOwned = new HashSet<Equipment>();
        willingPerson = new HashSet<Person>();
        unwillingPerson = new HashSet<Person>();
        validator = new Validator();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        validator.checkForNullEmpty(userName);
        validator.checkUsername(userName);
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validator.checkForNullEmpty(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validator.checkForNullEmpty(lastName);
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validator.checkForNullEmpty(password);
        validator.checkPassword(password);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validator.checkForNullEmpty(email);
        validator.checkEmailFormat(email);
        this.email = email;
    }

    public Set<Mission> getMissionRegistered() {
        return missionRegistered;
    }

    public void setMissionRegistered(Set<Mission> missionRegistered) {
        this.missionRegistered = missionRegistered;
    }

    public Set<Invitation> getInvitationsReceived() {
        return invitationsReceived;
    }

    public void setInvitationsReceived(Set<Invitation> invitationsReceived) {
        this.invitationsReceived = invitationsReceived;
    }

    public Set<Expertise> getExpertise() {
        return expertise;
    }

    public void setExpertise(Set<Expertise> expertise) {
        this.expertise = expertise;
    }

    public Set<Equipment> getEquipmentOwned() {
        return equipmentOwned;
    }

    public void setEquipmentOwned(Set<Equipment> equipmentOwned) {
        this.equipmentOwned = equipmentOwned;
    }

    public Set<Person> getWillingPerson() {
        return willingPerson;
    }

    public void setWillingPerson(Set<Person> willingPerson) {
        this.willingPerson = willingPerson;
    }

    public Set<Person> getUnwillingPerson() {
        return unwillingPerson;
    }

    public void setUnwillingPerson(Set<Person> unwillingPerson) {
        this.unwillingPerson = unwillingPerson;
    }
}
