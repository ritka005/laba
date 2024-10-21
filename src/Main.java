import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main q = new Main();
        Scanner in = new Scanner(System.in);
        //1(1.1)
        System.out.print("Введите число: ");
        try {
            double x11 = in.nextDouble();
            if (x11 < -1000000 || x11 > 1000000) {  // Проверка на допустимый диапазон значений
                System.out.println("Ошибка: число должно быть в диапазоне от -1 000 000 до 1 000 000."+"\n");
                return;
            }
            double fractionalPart = q.fraction(x11);
            System.out.println("Дробная часть: " + fractionalPart+"\n");
            in.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенное значение не является числом."+"\n");}

        //2(1.3)
        System.out.print("Введите число: ");
        char inputChar = in.nextLine().charAt(0);
        int result = q.charToNum(inputChar);
        if (result == -1) {
            System.out.println("Ошибка: введенный символ не является цифрой или число отрицательное."+"\n");
        } else {
            System.out.println("Соответствующее число: " + result+"\n");}

        //3(1.5)
        System.out.print("Введите число: ");
        try {
            int number = in.nextInt();
            boolean is2Digits = q.is2Digits(number);
            System.out.println("Число " + number + " является двузначным: " + is2Digits+"\n");}
        catch (InputMismatchException e) {
            System.out.println("Ошибка: введенное значение не является числом."+"\n");}

        //4(1.7)
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число num: ");
        int num = in.nextInt();
        boolean isInRange= q.isInRange(a, b, num);
        System.out.println("Число " + num + " входит в диапазон :" + isInRange+"\n");

        //5(1.9)
        System.out.print("Введите число a: ");
        int a19 = in.nextInt();
        System.out.print("Введите число b: ");
        int b19 = in.nextInt();
        System.out.print("Введите число c: ");
        int c19 = in.nextInt();
        boolean isEqual= q.isEqual(a19, b19, c19);
        System.out.println("Числа " + a19 + " " + b19 + " " + c19 + " равны : " + isEqual+"\n");

        //6(2.1)
        System.out.print("Введите число x: ");
        int x = in.nextInt();
        int abs = q.abs(x);
        System.out.println("Модуль числа " + x + " равен : " + abs+"\n");

        //7(2.3)
        System.out.print("Введите число x: ");
        int x23 = in.nextInt();
        boolean is35 = q.is35(x);
        System.out.println("Число " + x23 + " нацело делится на 3 или на 5, но не одновременно: " + is35 +"\n");

        //8(2.5)
        System.out.print("Введите число x: ");
        int x25 = in.nextInt();
        System.out.print("Введите число y: ");
        int y25 = in.nextInt();
        System.out.print("Введите число z: ");
        int z25 = in.nextInt();
        int max3 = q.max3 (x25,y25,z25);
        System.out.println("Максимальное число: " + max3+"\n");

        //9(2.7)
        System.out.print("Введите число x: ");
        int x27 = in.nextInt();
        System.out.print("Введите число y: ");
        int y27 = in.nextInt();
        int sum2 = q.sum2(x27, y27);
        System.out.print("Сумма " + x27 + " + " + y27 + " равна: " + sum2+"\n"+"\n");

        //10(2.9)
        System.out.print("Введите число x: ");
        int x29 = in.nextInt();
        String day = q.day(x29);
        System.out.print("День недели: " + day+"\n"+"\n");

        //11(3.1)
        System.out.print("Введите число x: ");
        int x31 = in.nextInt();
        String listNums = q.listNums(x31);
        System.out.print("Строка: " + listNums+"\n"+"\n");

        //*12(3.3)
        System.out.print("Введите число x: ");
        int x33 = in.nextInt();
        String chet = q.chet(x33);
        System.out.print("Строка: " + chet+"\n"+"\n");

        //13(3.5)
        System.out.print("Введите число x: ");
        int x35 = in.nextInt();
        int numLen = q.numLen(x35);
        System.out.print("Количество знаков: " + numLen+"\n"+"\n");

        //14(3.7)
        System.out.println("Квадрат из \"*\"\nВведите размер стороны квадрата:");
        boolean check37;
        int a37;
        if ((check37=in.hasNextInt()) && ((a37 = in.nextInt()) > 0)) {
            q.square(a37);
        } else System.out.println("Ошибка: неверный ввод"+"\n"+"\n");

        //15(3.9)
        System.out.println("Треугольник из \"*\"\nВведите высоту:");
        boolean check39;
        int a39;
        if ((check39=in.hasNextInt()) && ((a39 = in.nextInt()) > 0)) {
            q.rightTriangle(a39);
        } else System.out.println("Неверный ввод"+"\n"+"\n");

        //16(4.1)
        System.out.print("Введите количество элементов в массиве: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("Ошибка: количество элементов в массиве не может быть отрицательным.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();}
        System.out.print("Введите число x: ");
        try {
            int x41 = in.nextInt();
            int findFirst = q.findFirst(arr, x41);
            System.out.println("Индекс первого вхождения числа в массив: " + findFirst+"\n");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: необходимо вводить целые числа!"+"\n");
            return;}

        //17(4.3)
        System.out.print("Введите количество элементов в массиве: ");
        int n43 = 0;
        try {
            n43 = in.nextInt();
            if (n43 <= 0) {
                System.out.println("Ошибка: количество элементов должно быть положительным числом.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное число.");
            return;
        }
        int[] arr43 = new int[n43];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n43; i++) {
            try {
                arr43[i] = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено некорректное значение элемента массива.");
                return;
            }
        }
        int maxAbs = q.maxAbs(arr43);
        System.out.println("Наибольшее по модулю: " + maxAbs + "\n");

        //18(4.5)
        System.out.print("Введите количество элементов в массиве: ");
        int n45 = in.nextInt();
        int[] arr45 = new int[n45];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n45; i++) {
            arr45[i] = in.nextInt();
        }
        System.out.print("Введите количество элементов в массиве, который нужно вставить: ");
        int k45 = in.nextInt(); //?
        int[] ins = new int[k45];
        System.out.println("Введите элементы этого массива:");
        for (int i = 0; i < k45; i++) {
            ins[i] = in.nextInt();
        }
        System.out.print("Введите число: ");
        int pos = in.nextInt();
        int[] add = q.add (arr45, ins,pos);
        System.out.println("Новый массив: " + Arrays.toString(add)+"\n");

        //19(4.7)
        System.out.print("Введите количество элементов в массиве: ");
        int n47 = in.nextInt();
        int[] arr47 = new int[n47];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n47; i++) {
            arr47[i] = in.nextInt();
        }
        int[] reverseBack = q.reverseBack (arr47);
        System.out.println("Значения массива записаны задом наперед: "+ Arrays.toString(reverseBack)+"\n");

        //20(4.9)
        System.out.print("Введите количество элементов в массиве: ");
        int n49 = in.nextInt();
        int[] arr49 = new int[n49];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n49; i++) {
            arr49[i] = in.nextInt();
        }
        System.out.print("Введите число x: ");
        int x49 = in.nextInt();
        int[] findAll = q.findAll(arr49, x49);
        System.out.println("Индексы всех вхождений данного числа в массив: "+Arrays.toString(findAll));
    }

    //1(1.1)
    public double fraction(double x11) {
        return Math.abs(x11) - Math.floor(Math.abs(x11));
    }
    //2(1.3)
    public int charToNum(char x13) {
        if (x13 >= '0' && x13 <= '9') {// Проверяем, что символ находится в диапазоне '0' - '9'
            return x13 - '0';// Вычитаем код символа '0' из кода символа x, чтобы получить соответствующее число
        } else {
            return -1;// Если символ не является цифрой, возвращаем -1
        }
    }
    //3(1.5)
    public boolean is2Digits(int x) {
        //Проверяем, что число x находится в диапазоне [10, 99] или [-10, -99]
        return x >= 10 && x <= 99 || x <= -10 && x >= -99;
        }

    //4(1.7)
    public boolean isInRange(int a, int b, int num) {
        return num >= a && num <= b || num >= b && num <= a; //Проверяем, входит ли число num в диапaзон [a,b] или [b,a]
    }
    //5(1.9)
    public boolean isEqual(int a19, int b19, int c19) {
        return a19 == b19 && b19 == c19; // Проверяем, равны ли числа a, b, c
    }
    //6(2.1)
    public int abs(int x) {
        if (x <= 0) { //Если x отрицательный, умножаем на -1, иначе оставляем так
            return x * (-1);
        } else {
            return x;
        }
    }
    //7(2.3)
    public boolean is35(int x23){
        return (x23%3==0 || x23%5==0) && x23%15!=0; //Проверяем делится ли x нацело на 3 или на 5, но не одновременно
    }
    //8(2.5)
    public int max3 (int x25, int y25, int z25){
        if (x25 >= y25 && x25 >= z25){ //Проверяем, x максимальное
            return x25;
        }
        if (y25 >= x25 && y25 >= z25){ //Проверяем, y максимальное
            return y25;
        }
        else { //Иначе, z максимальное
            return z25;
        }
    }
    //9(2.7)
    public int sum2 (int x27, int y27){
        if (10 <= x27 + y27 && x27 + y27 <= 19){ // Проверяем, сумма x и y входит в диапазон [10, 19]
            return 20;
        }
        else {
            return x27 + y27;
        }
    }
    //10(2.9)
    public String day (int x29){
        return switch (x29) {
            case 1 -> ("Понедельник");
            case 2 -> ("Вторник");
            case 3 -> ("Среда");
            case 4 -> ("Четверг");
            case 5 -> ("Пятница");
            case 6 -> ("Суббота");
            case 7 -> ("Воскресенье");
            default -> ("это не день недели");
        };
    }
    //11(3.1)
    public String listNums (int x31){
        if (x31 < 0) {  //Если x<0, возвращаем пустую строку
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x31; i++) {
            sb.append(i);
            if (i < x31) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    //12(3.3)
    public String chet (int x33){
        if (x33 < 0) {  //Если x<0, возвращаем пустую строку
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x33; i+=2) {
            sb.append(i);
            if (i < x33 - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    //13(3.5)
    public int numLen (long x35){
        if (x35 == 0) {
            return 1; // Если x равно 0, то количество цифр равно 1
        }

        int count = 0;
        while (x35 != 0) {
            count++;
            x35 /= 10; // Удаляем последнюю цифру из числа x
        }

        return count;
    }
    //14(3.7)
    public void square (int x) {
        for (int i = 0; i<x; i++) {
            for (int k = 1; k<x; k++) {
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
    //15(3.9)
    public void rightTriangle (int x39){
        for (int i = 1; i <= x39; i++) { // Выводим необходимое количество пробелов
            for (int j = 1; j <= x39 - i; j++) {
                System.out.print(" ");
            } // Выводим символы '*' в соответствии с номером строки
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //16(4.1)
    public int findFirst(int[] arr, int x41) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x41) {
                return i;
            }
        }
        return -1;
    }
    //17(4.3)
    public int maxAbs (int[] arr43){
        int maxi = 0; //Переменная хранения максимального значения, со значением 0

        for (int num : arr43) {
            int absValue = Math.abs(num); //Модуль
            if (absValue > maxi) {  //Проверяем, если модуль числа больше максимального, записываем его вместо предыдущего максимума
                maxi = absValue;
            }
        }

        return maxi;
    }
    //18(4.5)
    public int[] add (int[] arr45, int[] ins, int pos){
        // Создаем новый массив с размером большим, чем размер arr на длину ins
        int[] result = new int[arr45.length + ins.length];
        // Копируем элементы из arr в новый массив до позиции pos
        if (pos >= 0) System.arraycopy(arr45, 0, result, 0, pos);
        // Копируем элементы из ins в новый массив, начиная с позиции pos
        System.arraycopy(ins, 0, result, pos, ins.length);
        // Копируем оставшиеся элементы из arr в новый массив, начиная с позиции pos + длина ins
        if (arr45.length - pos >= 0) System.arraycopy(arr45, pos, result, pos + ins.length, arr45.length - pos);
        return result;
    }
    //19(4.7)
    public int[] reverseBack (int[] arr47){
        int[] r = new int[arr47.length];
        for (int i = 0, j = arr47.length - 1; i < arr47.length; i++, j--) {
            r[i] = arr47[j];
        }
        return r;
    }
    //20(4.9)
    public int[] findAll (int[] arr49, int x49){
        // Подсчитываем количество вхождений числа x в массив arr
        int count = 0;
        for (int j : arr49) {
            if (j == x49) {
                count++;
            }
        }
        // Создаем новый массив для хранения индексов вхождений
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr49.length; i++) {
            if (arr49[i] == x49) {
                result[index++] = i;
            }
        }

        return result;
    }
}