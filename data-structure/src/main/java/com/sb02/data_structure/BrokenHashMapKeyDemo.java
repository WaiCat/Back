package com.sb02.data_structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class BrokenHashMapKeyDemo {

    public static void main(String[] args) {
        CustomKey key1 = new CustomKey("someKey", 1, 1.0);
        CustomKey key2 = new CustomKey("someKey", 1, 1.0);
        CustomKey key3 = new CustomKey("otherKey", 1, 1.1);

        HashSet<CustomKey> set = new HashSet<>();
        set.add(key1);
        set.add(key2);
        set.add(key3);
        // key1, key2는 hashCode()값이가 같고 equals() 결과가 true이므로 HashSet에는 key1만 저장됩니다.

        HashMap<CustomKey, String> map = new HashMap<>();
        map.put(key1, "value1");

        String found = map.get(key1);
        System.out.println("Key 1 Found: " + found);
        System.out.println(key1.hashCode());

        // key1의 intValue1을 변경하면 hashCode() 결과가 달라지고, HashMap에서 key1을 찾을 수 없게 됩니다.
        key1.setIntValue1(2);
        String notFound = map.get(key1);
        System.out.println("Key 1 Found: " + notFound);
        System.out.println(key1.hashCode());
    }

    public static class CustomKey {
        private final String strValue1;
        private int intValue1;
        private final double doubleValue1;

        public CustomKey(String strValue1, int intValue1, double doubleValue1) {
            this.strValue1 = strValue1;
            this.intValue1 = intValue1;
            this.doubleValue1 = doubleValue1;
        }

        public void setIntValue1(int intValue1) {
            // 멤버 변수인 intValue1이 변경되었을 때, hashCode() 결과의 변화와 그로 인한 HashSet, HashMap 동작 변화를 확인하세요.
            this.intValue1 = intValue1;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof CustomKey customKey)) return false;
            return intValue1 == customKey.intValue1
                    && Double.compare(doubleValue1, customKey.doubleValue1) == 0
                    && Objects.equals(strValue1, customKey.strValue1);
        }

        @Override
        public int hashCode() {
            return Objects.hash(strValue1, intValue1, doubleValue1);
        }
    }
}
