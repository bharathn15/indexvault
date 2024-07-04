package com.index.vault.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Data
@Document(collection = "user")
public class User {
    @Id
    private String  usr_id;
    private boolean sign_up;
    private String  sign_up_dt;
    private String  mail;
    private int     pin;
    private String  usr_name;
    private String  pwd;
    private boolean log_in;
    private String  log_in_dt;
    private String  log_out_dt;
    private String  role = "user";
    private String  mail_otp;
     

    private String responseCode;
    private String message;
}
