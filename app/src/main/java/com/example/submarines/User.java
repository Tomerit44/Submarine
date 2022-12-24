package com.example.submarines;

public class User
{
    protected String name;
    protected String bdate;
    protected int phone;

    public User(String name, String bdate,int phone)
    {
        this.name=name;
        this.bdate=bdate;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User:" +"\n"+
                "name: " + name + "\n" +
                "bdate: " + bdate +"\n" +
                "phone: " + phone;
    }
}
