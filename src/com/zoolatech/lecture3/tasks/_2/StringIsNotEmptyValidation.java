package com.zoolatech.lecture3.tasks._2;

public class StringIsNotEmptyValidation implements Validator {
    private String firstName;
    public StringIsNotEmptyValidation(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean isValid(UserAccount userAccount) {
        boolean check = true;
        System.out.println("Checking that the string is not empty: " + check);
        return check;
    }
}
