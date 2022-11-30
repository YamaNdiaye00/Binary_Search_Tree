import java.util.Arrays;
import java.io.*;

public class RunME {
    public static void main(String[] args) throws IOException {
        BST tree1 = new BST();
        tree1.insert(1);
        tree1.insert(2);
        tree1.insert(3);
        tree1.insert(4);
        tree1.insert(5);
        tree1.insert(6);
        tree1.insert(7);
        tree1.insert(8);
        tree1.insert(9);
        tree1.insert(10);
        tree1.insert(11);
        tree1.insert(12);
        tree1.insert(13);
        tree1.insert(14);
        tree1.insert(15);
        System.out.println("Traversing tree1");
        tree1.inorderTraversal(tree1.root);
        System.out.println();

        long start1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            tree1.search(1);
        }
        long duration1 = System.nanoTime() - start1;

        System.out.println("Search(1) 100000 times in tree1: " + duration1 + "ns");

        long start2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            tree1.search(15);
        }

        long duration2 = System.nanoTime() - start2;

        System.out.println("Search(15) 100000 times in tree1: " + duration2 + "ns");


        tree1.remove(5);
        System.out.println("Traversing tree1 after removing 5");
        tree1.inorderTraversal(tree1.root);
        System.out.println();
        tree1.remove(15);
        System.out.println("Traversing tree1 after removing 15");
        tree1.inorderTraversal(tree1.root);
        System.out.println();
        tree1.remove(1);
        System.out.println("Traversing tree1 after removing 1");
        tree1.inorderTraversal(tree1.root);
        System.out.println();
        System.out.println("Traversing tree1 after inserting 2");
        tree1.insert(2);
        tree1.inorderTraversal(tree1.root);
        System.out.println();

        BST tree2 = new BST();
        tree2.insert(8);
        tree2.insert(4);
        tree2.insert(12);
        tree2.insert(2);
        tree2.insert(6);
        tree2.insert(10);
        tree2.insert(14);
        tree2.insert(1);
        tree2.insert(3);
        tree2.insert(5);
        tree2.insert(7);
        tree2.insert(9);
        tree2.insert(11);
        tree2.insert(13);
        tree2.insert(15);
        System.out.println("Traversing tree2");
        tree2.inorderTraversal(tree2.root);
        System.out.println();

        long start3 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            tree2.search(1);
        }
        long duration3 = System.nanoTime() - start3;

        System.out.println("Search(1) 100000 times in tree2: " + duration3 + "ns");

        long start4 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            tree2.search(15);
        }

        long duration4 = System.nanoTime() - start4;

        System.out.println("Search(15) 100000 times in tree2: " + duration4 + "ns");


        tree2.remove(8);
        System.out.println("Traversing tree2 after removing 8");
        tree2.inorderTraversal(tree2.root);
        System.out.println();
    }
}
