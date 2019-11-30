package main.gigacode2019;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class G_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Tree> tree = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();

            Tree t = new Tree(parent, child);
            tree.put(parent, t);
        }

        System.out.println(tree);
    }

    static class Tree {

        int parent;
        int child;

        public Tree(int parent, int child) {
            this.parent = parent;
            this.child = child;
        }
        
        @Override
        public String toString() {
            return this.parent + ":" + this.child;
        }
    }
}
