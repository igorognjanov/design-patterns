package com.test.creational.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String country;
    private final boolean newsletter;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.country = builder.country;
        this.newsletter = builder.newsletter;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String country;
        private boolean newsletter;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder newsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
