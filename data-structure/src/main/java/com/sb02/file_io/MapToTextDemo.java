package com.sb02.file_io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MapToTextDemo {
    public static void main(String[] agrs) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);
        saveInFile(stockMap, "stock.txt");

        Map<String, Integer> loadedMap = loadFromFile("stock.txt");
        System.out.println(loadedMap);
    }

    public static void saveInFile(Map<String, Integer> stockMap, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("stock.txt"))) {
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Integer> loadFromFile(String filename) {
        Map<String, Integer> result = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("stock.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(":");
                String key = tokens[0];
                Integer value = Integer.parseInt(tokens[1]);
                result.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
