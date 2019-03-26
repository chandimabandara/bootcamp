import java.util.Scanner;

public class Frog {

   
    int count=0;
    int time = 0;
    public void calculateNoOFJump(int distance) {

        while (distance > 0) {

            if (distance >= 5 && distance != 5) {
                distance = distance - 5;
                count++;
                time = time + 2;

                if (distance >= 3 && distance != 3) {
                    distance = distance - 3;
                    count++;
                    time = time + 3;
                    if (distance >= 2 && distance != 2) {
                        distance = distance - 2;
                        count++;
                        time = time + 5;

                    }

                }
            } else if (distance == 5) {
                distance = distance - 5;
                count++;

            } else if (distance == 2) {
                distance = distance - 2;
                count++;
            } else if (distance == 3) {
                distance = distance - 3;
                count++;

            }
        }
        System.out.println("No of jumping: " + count);
        System.out.println("Resting Time is: " + time);
    }
    public static void main(String[] args) {
        Frog f = new Frog();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance");
        int value = scanner.nextInt();
        f.calculateNoOFJump(value);
    }
}
