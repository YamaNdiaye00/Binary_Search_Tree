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
        tree1.inorderTraversal(tree1.root);
        System.out.println();


//        BufferedWriter BW1A = new BufferedWriter(new FileWriter("search(1)A.txt"));
//        long[] search1timesA = new long[100000];
//        for (int i = 0; i < 100000; i++) {
//            long start = System.nanoTime();
//            tree1.search(1);
//            search1timesA[i] = System.nanoTime() - start;
//        }
//        BW1A.write("CPU times for search(1) in tree1 100000times in nanoseconds.");
//        BW1A.newLine();
//        for (long i : search1timesA) {
//            BW1A.write(i + "ns");
//            BW1A.newLine();
//        }
//        BW1A.close();
//
//        BufferedWriter BW15A = new BufferedWriter(new FileWriter("search(15)A.txt"));
//        long[] search15timesA = new long[100000];
//        for (int i = 0; i < 100000; i++) {
//            long start = System.nanoTime();
//            tree1.search(15);
//            search15timesA[i] = System.nanoTime() - start;
//        }
//        BW15A.write("CPU times for search(15) in tree1 100000times in nanoseconds.");
//        BW15A.newLine();
//        for (long i : search15timesA) {
//            BW15A.write(i + "ns");
//            BW15A.newLine();
//        }
//        BW15A.close();
//
        tree1.remove(5);
        tree1.inorderTraversal(tree1.root);
        System.out.println();
        tree1.remove(15);
        tree1.inorderTraversal(tree1.root);
        System.out.println();
        tree1.remove(1);
        tree1.inorderTraversal(tree1.root);
        System.out.println();
//        tree1.insert(2);
//        tree1.inorderTraversal(tree1.root);
//        System.out.println();
//
//        BST tree2 = new BST();
//        tree2.insert(8);
//        tree2.insert(4);
//        tree2.insert(12);
//        tree2.insert(2);
//        tree2.insert(6);
//        tree2.insert(10);
//        tree2.insert(14);
//        tree2.insert(1);
//        tree2.insert(3);
//        tree2.insert(5);
//        tree2.insert(7);
//        tree2.insert(9);
//        tree2.insert(11);
//        tree2.insert(13);
//        tree2.insert(15);
//        tree2.inorderTraversal(tree2.root);
//        System.out.println();
//
//        tree2.remove(8);
//        tree2.inorderTraversal(tree2.root);
//        System.out.println();
    }
}
