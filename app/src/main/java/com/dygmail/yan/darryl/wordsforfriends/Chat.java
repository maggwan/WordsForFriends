package com.dygmail.yan.darryl.wordsforfriends;

/**
 * Referenced AndroidChat firebase example
 */
public class Chat {

    //initialize message and username vars
    private String message;
    private String username;

    //constructor
    @SuppressWarnings("unused")
    private Chat() {

    }

    Chat(String mes, String user) { //Chat class w/ previously defined vars
        this.message = mes;
        this.username = user;
    }

    public String getMessage() {return message;
    }

    public String getUsername() {return username;
    }

}
