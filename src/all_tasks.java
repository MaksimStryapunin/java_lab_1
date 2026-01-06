public class all_tasks { //Вариант 2
    //Задание 1
    public int sumLastNums (int x) { // 2
        int a, b;
        a = x % 10;
        b = (x % 100) / 10;
        return a + b;
    }
    public boolean isPositive (int x){ // 4
        boolean res = false;
        if (x > 0){
            res = true;
        }
        return res;
    }
    public boolean isUpperCase(char x){ // 6
        if (x >= 'A' && x <= 'Z')
            return true;
        else return false;
    }
    public boolean isDivisor(int a, int b) { // 8
        if (a % b == 0 || b % a == 0)
            return true;
        else return false;
    }
    public int lastNumSum(int a, int b){ // 10
        return a % 10 + b % 10;
    }
    //Задание 2
    public boolean sum3 (int x, int y, int z) { // 2
        if ((x + y == z) || (x + z == y) || (z + y == x)){
            return true;
        }
        else {
            return false;
        }
    }
    public int sum2 (int x, int y){ // 4
        int z = x + y;
        if (z >= 10 && z <= 19){
            return 20;
        }
        else {
            return z;
        }
    }
    public String age (int x){ // 6
        String res;
        if (x != 11 && x%10 == 1){
            return x + " год";
        }
        else if ((x%10 == 2 || x%10 == 3 || x%10 == 4) && (x == 12 || x == 13 || x == 14)){
            return  x + " года";
        }
        else {
            return x + " лет";
        }
    }
    public String day (int x){ // 8
        switch (x){
            case 1:{return "понедельник";}
            case 2:{return "вторник";}
            case 3:{return "среда";}
            case 4:{return "четверг";}
            case 5:{return "пятница";}
            case 6:{return "суббота";}
            case 7:{return "воскресенье";}
            default:{return "это не день недели";}
        }
    }
    public void printDays (String x){ // 10

    }
}
