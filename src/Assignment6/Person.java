package Assignment6;

class Person {

    String name;
    String phoneNumber;
    String birthday;
    String jerseyNumber;

    public Person (String name, String phoneNumber, String birthday, String jerseyNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getJerseyNumber() {
        return jerseyNumber;
    }
    public void setName() {
        this.name = name;
    }
    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }
    public void setBirthday() {
        this.birthday = birthday;
    }
    public void setJerseyNumber() {
        this.jerseyNumber = jerseyNumber;
    }


}