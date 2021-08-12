package com.example.app.db;

import io.realm.RealmObject;

public class AppUser extends RealmObject {
    private String email;
    private String password;

    public AppUser(String email, String password){
        this.email = email;
        this.password = password;
    }
    public AppUser(){

    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
