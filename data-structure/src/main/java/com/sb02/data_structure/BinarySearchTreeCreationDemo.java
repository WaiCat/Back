package com.sb02.data_structure;

public class BinarySearchTreeCreationDemo {
    public static void main(String[] args) {
        TreeNode tree = insertNode(null, 10);
        tree = insertNode(tree, 5);
        tree = insertNode(tree, 15);
        tree = insertNode(tree, 3);
        tree = insertNode(tree, 7);
        tree = insertNode(tree, 12);
        tree = insertNode(tree, 1);

        // System.out.println() 함수 호출 부분에 breakpoint를 설정하고 디버깅을 실행하여 결과를 확인하세요.
        System.out.println(".");
    }

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else if (value > root.value) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }
}
