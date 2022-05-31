import java.util.Scanner;

public class MultiArray {
    static int[][] multiarray = new int[12][12];

    public static void main(String[] args) {

        for (int i = 0; i < multiarray.length; i++) {
            for (int j = 0; j < multiarray[i].length; j++) {
                multiarray[i][j] = 1;
            }
        }
        prints(third_()); ////<----


    }

    public static void prints(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] patternRows() {
        for (int i = 0; i < multiarray.length; i += 2) {
            for (int j = 0; j < multiarray[i].length; j++) {
                multiarray[i][j] = 0;
            }
        }
        return multiarray;
    }

    public static int[][] patternCheckered() {
        for (int i = 0; i < multiarray.length; i += 2) {
            for (int j = 0; j < multiarray[i].length; j += 2) {
                multiarray[i][j] = 0;
                multiarray[i+1][j+1] = 0;
                multiarray[i][j + 1] = 8;
                multiarray[i + 1][j] = 8;
            }
        }
        return multiarray;
    }

    public static int[][] third() {
        int count = 1;
        for (int i = 0; i < multiarray.length; i++) {
            for (int j = 0; j < multiarray[i].length; j++) {
                multiarray[i][j] = 0;
                if (count%3==0) {
                    multiarray[i][j] = 3;
                }
                count ++;
            }
        }
        return multiarray;
    }
    public static int[][] third_() { //works with any array
        for (int i = 0; i < multiarray.length; i++) {
            for (int j = 0; j < multiarray[i].length; j++) {
                multiarray[i][j] = 0;
                if((i)%3==0&&(j+1)%3==0) {   multiarray[i][j]=3;} //1
                if ((i + 1) % 3 == 0 && j % 3 == 0) { multiarray[i][j] = 3;} //3
                if ((i + 2) % 3 == 0 && (j + 2) % 3 == 0) {multiarray[i][j] = 3;} //2
            }
        }
        return multiarray;
    }

    public static int[][] userChoice() {
        int count =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        int first = Integer.valueOf(sc.nextLine());
        System.out.println("second number:");
        int second = Integer.valueOf(sc.nextLine());
        System.out.println("third number:");
         int third = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < multiarray.length; i++) {
            for (int j = 0; j < multiarray[i].length; j++) {
                if (count%1==0) multiarray[i][j] = first;
                if (count%2==0) multiarray[i][j] = second;
                if (count%3==0) multiarray[i][j] = third;
                count++;
                if (count == 3) {count=0;}
                }
            }
        return multiarray;

        }

        static int sumArray(int[][] ar){
            int sum =0;
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    sum+=ar[i][j];
                }
            }
            return sum;
    }

    }



