import java.util.*;

class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }
}

public class Problem2 {

    // Bubble Sort (ascending risk)
    static void bubbleSort(ArrayList<Client> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).riskScore > list.get(j + 1).riskScore) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    // Insertion Sort (desc risk + balance)
    static void insertionSort(ArrayList<Client> list) {
        int n = list.size();

        for (int i = 1; i < n; i++) {
            Client key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                  (list.get(j).riskScore < key.riskScore ||
                  (list.get(j).riskScore == key.riskScore &&
                   list.get(j).balance < key.balance))) {

                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    // Top 10
    static void topRisk(ArrayList<Client> list) {
        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).riskScore);
        }
    }
}