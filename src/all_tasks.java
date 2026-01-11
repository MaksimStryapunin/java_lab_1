import java.util.Random;
import java.util.Scanner;

public class all_tasks { //Вариант 2
    //Задание 1
    public int sumLastNums(int x) { // 2
        int a, b;
        a = x % 10;
        b = (x % 100) / 10;
        return a + b;
    }

    public boolean isPositive(int x) { // 4
        boolean res = false;
        if (x > 0) {
            res = true;
        }
        return res;
    }

    public boolean isUpperCase(char x) { // 6
        if (x >= 'A' && x <= 'Z')
            return true;
        else return false;
    }

    public boolean isDivisor(int a, int b) { // 8
        if (a % b == 0 || b % a == 0)
            return true;
        else return false;
    }

    public int lastNumSum(int a, int b) { // 10
        return a % 10 + b % 10;
    }

    //Задание 2
    public boolean sum3(int x, int y, int z) { // 2
        if ((x + y == z) || (x + z == y) || (z + y == x)) {
            return true;
        } else {
            return false;
        }
    }

    public int sum2(int x, int y) { // 4
        int z = x + y;
        if (z >= 10 && z <= 19) {
            return 20;
        } else {
            return z;
        }
    }

    public String age(int x) { // 6
        String res;
        if (x != 11 && x % 10 == 1) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x == 12 || x == 13 || x == 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public String day(int x) { // 10
        switch (x) {
            case 1: {
                return "понедельник";
            }
            case 2: {
                return "вторник";
            }
            case 3: {
                return "среда";
            }
            case 4: {
                return "четверг";
            }
            case 5: {
                return "пятница";
            }
            case 6: {
                return "суббота";
            }
            case 7: {
                return "воскресенье";
            }
            default: {
                return "это не день недели";
            }
        }
    }

    public void printDays(String x) { // 10
        switch (x) {
            case "понедельник": {
                System.out.println("понедельник" + "вторник" + "среда" + "четверг" + "пятница" + "суббота" + "воскресенье");
            }
            case "вторник": {
                System.out.println("вторник" + "среда" + "четверг" + "пятница" + "суббота" + "воскресенье");
            }
            case "среда": {
                System.out.println("среда" + "четверг" + "пятница" + "суббота" + "воскресенье");
            }
            case "четверг": {
                System.out.println("четверг" + "пятница" + "суббота" + "воскресенье");
            }
            case "пятница": {
                System.out.println("пятница" + "суббота" + "воскресенье");
            }
            case "суббота": {
                System.out.println("суббота" + "воскресенье");
            }
            case "воскресенье": {
                System.out.println("воскресенье");
            }
            default: {
                System.out.println("это не день недели");
            }
        }
    }

    // Задание 3
    public String reverselistNums(int x) { // 2
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += (" " + i);
        }
        return res;
    }
    public int pow(int x, int y) { // 4
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
    public boolean equalNum(int x) { //6
        int temp = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != temp) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
    public void leftTriangle(int x) { // 8
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number, user_number, couner = 1;
        number = random.nextInt(10);
        user_number = -1;
        System.out.print("ведите число от 0 до 9: ");
        while(true){
            user_number = scanner.nextInt();
            if (user_number == number){
                System.out.print(" Вы угадали!");
                break;
            }
            else {
                System.out.print(" Вы не угадали, введите число от 0 до 9: ");
                couner ++;
            }
        }
        System.out.print(" Вы отгадали число за " +couner);
        if (1 == couner){
            System.out.print(" попытку");
        }
        else  if ((couner % 10 <= 4) && (couner % 10 >= 2)){
            System.out.print(" попытки");
        }
        else  if ((couner % 10 >= 5)){
            System.out.print(" попыток");
        }
    }
    // Задание 3
    public int findLast(int[] arr, int x) { // 2
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public int[] add(int[] arr, int x, int pos) { // 4
        if (pos < 0 || pos > arr.length) {
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    public void reverse(int[] arr) {
        int[] arr1 = new int[arr.length];
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[temp] = arr[i];
            temp++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }
    }
    public int[] concat(int[] arr1, int[] arr2) { // 8
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            result[index++] = num;
        }
        for (int num : arr2) {
            result[index++] = num;
        }
        return result;
    }
    public int[] deleteNegative(int[] arr) { // 10
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            }
        }
        int[] arr1 = new int[count];
        int i = 0;
        for (int j : arr) {
            if (j >= 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }
}