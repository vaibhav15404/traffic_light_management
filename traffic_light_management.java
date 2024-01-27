import java.util.*;
import java.util.concurrent.TimeUnit;

public class traffic_light_management {

  static String RESET = "\u001B[0m";
  static String RED = "\u001B[31m";
  static String GREEN = "\u001B[32m";
  static String YELLOW = "\u001B[33m";

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int arr[] = new int[4];
    int n = 1;
    while (n != -1) {
      int count = 0;
      HashMap<Integer, Integer> map = new HashMap<>();
      System.out.println("Enter traffic count in four lanes");
      for (int i = 0; i < 4; i++) {
        arr[i] = scan.nextInt();
        map.put(arr[i], i);
      }

      Arrays.sort(arr);

      for (int i = 0; i < 4; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      long time = 0;
      TimeUnit t = TimeUnit.SECONDS;
      for (int i = 3; i >= 0; i--) {
        if (arr[i] >= 100) {
          try {
            time = 6;
            count++;

            for (int j = 0; j < 4; j++) {
              if (j == i) {
                System.out.print(
                  GREEN + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              } else if (j == (i - 1)) {
                System.out.print(
                  YELLOW + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              } else {
                System.out.print(
                  RED + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              }
            }
            System.out.println();
            t.sleep(time);
          } catch (Exception e) {
            System.out.println("error occured in >=100");
          }
        } else if (arr[i] >= 50 && arr[i] < 100) {
          try {
            count++;
            time = 4;

            for (int j = 0; j < 4; j++) {
              if (j == i) {
                System.out.print(
                  GREEN + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              } else if (j == (i - 1)) {
                System.out.print(
                  YELLOW + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              }  else {
                System.out.print(
                  RED + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              }
            }
            System.out.println();
            t.sleep(time);
          } catch (Exception e) {
            System.out.println("error occured in >=100");
          }
        } else if (arr[i] < 50) {
          try {
            count++;
            time = 3;

            for (int j = 0; j < 4; j++) {
              if (j == i) {
                System.out.print(
                  GREEN + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              } else if (j == (i - 1)) {
                System.out.print(
                  YELLOW + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              }  else {
                System.out.print(
                  RED + " " + ((int) map.get(arr[j]) + 1) + " Lane  " + RESET
                );
              }
            }
            System.out.println();
            t.sleep(time);
          } catch (Exception e) {
            System.out.println("error occured in >=100");
          }
        } else {}
      }
      if (count == 4) {
        System.out.println("If you want to run again type 1 otherwise type -1");
        n = scan.nextInt();
      }
    }
  }
}
