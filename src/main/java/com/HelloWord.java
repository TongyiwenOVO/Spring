package com;

public class HelloWord {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "HelloWord{" +
                "username='" + username + '\'' +
                '}';
    }

    public void work(){
        System.out.println(this.username+"正在工作");
    }
}
