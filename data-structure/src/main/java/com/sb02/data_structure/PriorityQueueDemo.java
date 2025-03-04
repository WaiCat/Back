package com.sb02.data_structure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Task 객체의 priority 필드를 기준으로 우선순위를 정하는 PriorityQueue(min heap)
        PriorityQueue<Task> tasks = new PriorityQueue<>(
                Comparator.comparingInt(Task::getPriority)
        );
        tasks.add(new Task("Task1", 1));
        tasks.add(new Task("Task2", 3));
        tasks.add(new Task("Task3", 2));
        tasks.add(new Task("Task4", 0));

        while (!tasks.isEmpty()) {
            Task task = tasks.poll();
            System.out.println(task.getName());
        }
    }

    public static class Task {
        private String name;
        private int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public int getPriority() {
            return priority;
        }
    }

}
