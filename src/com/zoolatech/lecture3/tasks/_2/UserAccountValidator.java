package com.zoolatech.lecture3.tasks._2;

import java.util.ArrayList;

public class UserAccountValidator implements Validator {
    UserAccount userAccount;

    public UserAccountValidator(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public boolean isValid(UserAccount userAccount) {
        ArrayList<Validator> userAccountValidators = new ArrayList<>();
        userAccountValidators.add(new StringIsNotEmptyValidation(userAccount.firstName()));
        userAccountValidators.add(new EmailValidation(userAccount.userEmail()));
        userAccountValidators.add(new PhoneNumberValidation(userAccount.phoneNumber()));
        userAccountValidators.add(new NumberInTheRangeValidation(userAccount.birthMonth()));
        userAccountValidators.add(new NumberIsBiggerThanValueValidation(userAccount.birthDay()));
        userAccountValidators.add(new NumberIsLessThanValueValidation(userAccount.birthMonth()));

        for (Validator validator : userAccountValidators) {
            if (!validator.isValid(userAccount)) {
                System.out.println("Access denied");
                return false;
            }
        }
        System.out.println("Access granted");
        return true;
    }
}