package com.sb02.data_structure;

public class SimpleHashFunction {
    public static void main(String[] args) {
        int hash1 = simpleHash("Hello");
        System.out.println(hash1);

        int hash2 = simpleHash("안녕하세요.");
        System.out.println(hash2);

        int hash3 = simpleHash("asdjf");
        System.out.println(hash3);
    }

    public static int simpleHash(String key) {
        int hash = 0;
        for (char ch : key.toCharArray()) {
            hash += ch;
        }
        return hash % 10;
    }
}
