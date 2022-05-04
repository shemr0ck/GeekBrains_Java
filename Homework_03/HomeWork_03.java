package Homework_03;

public class HomeWork_03 {
        public static void main(String[] args)
        {
            int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int[] array6 = {0, 10, 1, 5, 25, 2, 3, 4, 15, -1, 8, 9, 2, 3};
            System.out.println("ArrayTaskOne: ");
            ArrayTaskOne(array1);
            System.out.println("ArrayTaskTwo: ");
            ArrayTaskTwo(100);
            System.out.println("ArrayTaskThree: ");
            ArrayTaskThree(array3);
            System.out.println("ArrayTaskFour: ");
            ArrayTaskFour();
            System.out.println("ArrayTaskFive: ");
            ArrayTaskFive(3, 5);
            System.out.println("ArrayTaskSix: ");
            ArrayTaskSix(array6);
        }

        public static void ArrayTaskOne(int[] array1)
        {
            for (int i = 0; i < array1.length; i++)
            {
                if (array1[i] == 0)
                {
                    array1[i] = 1;
                } else
                {
                    array1[i] = 0;
                }
                System.out.println(array1[i] + " ");
            }
        }

        public static void ArrayTaskTwo(int size)
        {
            int[] array2 = new int[size];
            for (int i = 0; i < array2.length; i++)
            {
                array2[i] = i + 1;
                System.out.println("array2[" + i + "] =" + array2[i] + " ");
            }
        }

        public static void ArrayTaskThree(int[] array3)
        {
            for (int i = 0; i < array3.length; i++)
            {
                if (array3[i] < 6)
                {
                    array3[i] = array3[i] * 2;
                }
                System.out.println("array3[" + i + "] =" + array3[i] + " ");
            }
        }

        public static void ArrayTaskFour()
        {
            int[][] array4 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
            };
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (i == j)
                    {
                        array4[i][j] = 1;
                    }
                    System.out.print(array4[i][j] + " | ");
                }
            }
            System.out.println();
        }

        public static void ArrayTaskFive(int len, int initialValue)
        {
            int[] array5 = new int[len];
            for (int i = 0; i < len; i++)
            {
                array5[i] = initialValue;
                System.out.println("array5[" + i + "] =" + array5[i] + " ");
            }
        }

        public static void ArrayTaskSix(int[] array6)
        {
            int min = array6[0];
            int max = array6[0];

            for (int i = 0; i < array6.length; i++)
            {
                if (array6[i] < min)
                {
                    min = array6[i];
                }
            }
            for (int i = 0; i < array6.length; i++)
            {
                if (array6[i] > max)
                {
                    max = array6[i];
                }
            }
            System.out.println("minimum element = "+ min);
            System.out.println("maximum element = "+ max);
        }
    }
