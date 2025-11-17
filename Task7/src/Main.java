import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static int SIZE = 8;
    static int[][] colors = new int[SIZE][SIZE];
    static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        printMatrix(matrixRandom(colors));
        printMatrix(reverseMatrix( 270));
//        System.out.println("Исходная матрица:");
//        matrix(colors);
//        System.out.println("          ");
//        reverseMatrix(90);
//        System.out.println("    ");
//        reverseMatrix(180);
//        System.out.println("      ");
//        reverseMatrix(270);
//        while (true) {
//            System.out.println("""
//
//                    Выберете угол поворота исходной матрицы:
//                    1. 90 градусов.
//                    2. 180 градусов.
//                    3. 270 градусов.
//                    Для выходы введите 'end'
//
//                    """);
//            Scanner scanner = new Scanner(System.in);
//            String s = scanner.nextLine();
//
//            if (s.equalsIgnoreCase("end")){
//                System.out.println("Вы вышли из матрицы");
//                break;
//            }
//
//            switch (Integer.parseInt(s)) {
//                case 1 -> {
//                    System.out.println("90 градусов");
//                    matrix90();
//                }
//                case 2 -> {
//                    System.out.println("180 градусов");
//                    matrix180();
//                }
//                case 3 -> {
//                    System.out.println("270 градусов");
//                    matrix270();
//                }
//            }
//        }

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("     ");
    }

    public static int[][] matrixRandom(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);

            }
        }
        return matrix;
    }
    public static int[][] reverseMatrix( int corner) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (corner) {
                    case 90 -> rotatedColors[j][i] = colors[SIZE - 1 - i][j];
                    case 180 -> rotatedColors[j][i] = colors[SIZE - 1 - j][SIZE - 1 - i];
                    case 270 -> rotatedColors[j][i] = colors[i][SIZE - 1 - j];
                }
            }

        }
        return rotatedColors;
    }


//    public static void matrix90() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                rotatedColors[j][i] = colors[SIZE - 1 - j][i];
//
//                System.out.format("%4d", rotatedColors[j][i]);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void matrix180() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                rotatedColors[j][i] = colors[SIZE - 1 - i][SIZE - 1 - j];
//
//                System.out.format("%4d", rotatedColors[j][i]);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void matrix270() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                rotatedColors[j][i] = colors[j][SIZE - 1 - i];
//
//                System.out.format("%4d", rotatedColors[j][i]);
//            }
//            System.out.println();
//        }
//    }


}

