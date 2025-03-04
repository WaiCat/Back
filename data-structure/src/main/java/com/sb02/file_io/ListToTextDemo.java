package com.sb02.file_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListToTextDemo {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "cherry");
        listToText(items, "items.txt");

        List<String> loadItems = textToList("items.txt");
        System.out.println(loadItems);
    }

    public static List<String> textToList(String filename) {
        List<String> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                items.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return items;
    }

    public static void listToText(List<String> items, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String item : items) {
                bw.write(item);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
