package com.java.linklist;

public record CitizenData(String name, Integer age, String address) {
    @Override
    public String toString() {
        return "Citizen name: " + name + " age: " + age + " address: " + address;
    }
}
