import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        all_tasks funk = new all_tasks();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Выберите задание(1/2/3/4)");
        System.out.print(": ");
        int choose_task = scanner.nextInt();
        switch (choose_task) {
            case 1: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {
                        int x, z;
                        System.out.print("Введите число x: ");
                        x = scanner.nextInt();
                        z = funk.sumLastNums(x);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + z);
                        break;

                    }
                    case 4: {
                        int a;
                        System.out.print("введите a: ");
                        a = scanner.nextInt();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + funk.isPositive(a));
                        break;
                    }
                    case 6: {
                        char x;
                        String s;
                        boolean z;
                        System.out.print("введите a: ");
                        s = scanner.next();
                        x = s.charAt(0);
                        z = funk.isUpperCase(x);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + z);
                        break;
                    }
                    case 8: {
                        int a, b;
                        boolean z;
                        System.out.print("введите a: ");
                        a = scanner.nextInt();
                        System.out.print("введите b: ");
                        b = scanner.nextInt();
                        z = funk.isDivisor(a, b);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + z);
                        break;
                    }
                    case 10: {
                        int temp, res = 0;
                        for (int i = 0; i < 5; i++) {
                            System.out.print("Введите число " + (i + 1) + ": ");
                            temp = scanner.nextInt();
                            res = funk.lastNumSum(temp, res);
                        }
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Итого: " + res);
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }// Задача 1
            case 2: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {
                        int x, y, z;
                        boolean s = false;
                        System.out.println("введите x");
                        x = scanner.nextInt();
                        System.out.println("введите y");
                        y = scanner.nextInt();
                        System.out.println("введите z");
                        z = scanner.nextInt();
                        s = funk.sum3(x, y, z);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + s);
                        break;
                    }
                    case 4: {
                        int a, b;
                        System.out.print("введите x: ");
                        a = scanner.nextInt();
                        System.out.print("введите y: ");
                        b = scanner.nextInt();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + funk.sum2(a, b));
                        break;
                    }
                    case 6: {
                        int x;
                        String z;
                        System.out.print("введите x: ");
                        x = scanner.nextInt();
                        z = funk.age(x);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + z);
                        break;
                    }
                    case 8: {
                        int temp;
                        System.out.print("Введите число: ");
                        temp = scanner.nextInt();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        funk.day(temp);
                        break;
                    }
                    case 10: {
                        String temp;
                        System.out.print("Введите число: ");
                        temp = scanner.nextLine();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        funk.printDays(temp);
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }// Задача 2
            case 3: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {
                        int a;
                        System.out.print("введите число: ");
                        a =  scanner.nextInt();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + funk.reverselistNums(a));
                        break;
                    }
                    case 4: {
                        int a, b;
                        System.out.print("введите x: ");
                        a = scanner.nextInt();
                        System.out.print("введите y: ");
                        b = scanner.nextInt();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + funk.pow(a, b));
                        break;
                    }
                    case 6: {
                        int x;
                        boolean z;
                        System.out.print("введите число: ");
                        x = scanner.nextInt();
                        z = funk.equalNum(x);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + z);
                        break;
                    }
                    case 8: {
                        int x;
                        System.out.print("введите число: ");
                        x = scanner.nextInt();
                        System.out.println("-----------------------------------------------------------------------------------------");
                        funk.leftTriangle(x);
                        break;
                    }
                    case 10: {
                        System.out.println("-----------------------------------------------------------------------------------------");
                        funk.guessGame();
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }// Задача 3
            case 4: {
                int switch_choose;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Выберите задачу(2/4/6/8/10)");
                System.out.print(": ");
                switch_choose = scanner.nextInt();
                switch (switch_choose) {
                    case 2: {
                        int x, res;
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.println("Введите " + size + " элементов:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        System.out.println("Введите элемент: ");
                        x = scanner.nextInt();
                        res = funk.findLast(arr, x);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("Результат: " + res);
                        break;
                    }
                    case 4: {
                        int pos, x;
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.println("Введите " + size + " элементов:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        System.out.println("Введите позицию: ");
                        pos = scanner.nextInt();
                        System.out.println("Введите элемент: ");
                        x = scanner.nextInt();
                        arr = funk.add(arr, x, pos);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        for (int i : arr){
                            System.out.println(i + " ");
                        }
                        break;
                    }
                    case 6: {
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.println("Введите " + size + " элементов:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        funk.reverse(arr);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        for (int i : arr){
                            System.out.println(i + " ");
                        }
                        break;
                    }
                    case 8: {
                        System.out.print("Введите размер массива: ");
                        int size1 = scanner.nextInt();
                        int[] arr1 = new int[size1];
                        System.out.println("Введите " + size1 + " элементов:");
                        for (int i = 0; i < size1; i++) {
                            arr1[i] = scanner.nextInt();
                        }
                        System.out.print("Введите размер массива: ");
                        int size2 = scanner.nextInt();
                        int[] arr2 = new int[size2];
                        System.out.println("Введите " + size2 + " элементов:");
                        for (int i = 0; i < size2; i++) {
                            arr2[i] = scanner.nextInt();
                        }
                        int[] arr3 = new int[size1 + size2];
                        arr3 = funk.concat(arr1, arr2);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        for (int i : arr3){
                            System.out.println(i + " ");
                        }
                        break;
                    }
                    case 10: {
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.println("Введите " + size + " элементов:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        arr = funk.deleteNegative(arr);
                        System.out.println("-----------------------------------------------------------------------------------------");
                        for (int i : arr){
                            System.out.println(i + " ");
                        }
                        break;
                    }
                    default: {
                        System.out.println("Нет задачи в задании");
                        break;
                    }
                }
                break;
            }// Задача 4
            default: {
                System.out.println("нет в списке");

            }
        }
    }
}