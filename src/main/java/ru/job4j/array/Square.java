package ru.job4j.array;

    public class Square {
            public static int[] calculate(int bound) {
            int[] rst = new int[bound];
                for (int a = 0; a < bound; a++) {
                    rst[a] = a * a;
                }

                return rst;
    }

            public static void main(String[] args) {
            int[] array = calculate(4);
            for (int index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
        }
    }
