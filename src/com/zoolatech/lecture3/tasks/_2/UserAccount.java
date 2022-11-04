package com.zoolatech.lecture3.tasks._2;

import java.util.Objects;

public record UserAccount(int userId, String firstName, String lastName, String country,
                          String userEmail, String phoneNumber, int birthDay, int birthMonth) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return userId == that.userId && birthDay == that.birthDay && birthMonth == that.birthMonth &&
                Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) &&
                Objects.equals(country, that.country) && Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, country, userEmail, phoneNumber, birthDay, birthMonth);
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                '}';
    }
}