public class tasks2 {
    public static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    // 1. Функция для нахождения максимума
//    public static int max(int a, int b) {
//        if (a == b) {
//            throw new IllegalArgumentException("Числа равны");
//        }
//        return Math.max(a, b);
//    }

    // 2. Калькулятор деления
//            public static double divide(double a, double b) {
//            if (b == 0) {
//                throw new ArithmeticException("Недопустимо деление на ноль");
//            }
//            return (double) a / b;
//        }

    // 3. Конвертер строк в числа
//    public static int stringToInt(String str) {
//        try {
//            return Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            throw new NumberFormatException("Невозможно конвертировать строку в число");
//        }
//    }

    // 4. Проверка возраста
//    public static int checkAge(int age) {
//        if (age < 0 || age > 150) {
//            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150");
//        }
//        return age;
//    }

    // 5. Нахождение корня
//    public static double squareRoot(double number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Нельзя извлечь корень из отрицательного числа");
//        }
//        return Math.sqrt(number);
//    }

    // 6. Факториал
//    public static long factorial(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
//        }
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }

//    // 7. Проверка массива на нули
//    public static boolean checkArrayForZeros(int[] array) {
//        for (int num : array) {
//            if (num == 0) {
//                throw new IllegalArgumentException("Массив содержит нули");
//            }
//        }
//        return true;
//    }

    // 8. Калькулятор возведения в степень
//    public static double power(double base, int exponent) {
//        if (exponent < 0) {
//            throw new IllegalArgumentException("Степень не может быть отрицательной");
//        }
//        return Math.pow(base, exponent);
//    }

//        // 9. Обрезка строки
//    public static String trimString(String str, int length) {
//        if (length > str.length()) {
//            throw new IllegalArgumentException("Длина обрезки больше длины строки");
//        }
//        return str.substring(0, length);
//    }

    // 10. Поиск элемента в массиве
//    public static int findElement(int[] array, int element) {
//        for (int i : array) {
//            if (i == element) {
//                return i;
//            }
//        }
//        throw new IllegalArgumentException("Элемент не найден");
//    }

    // 11. Конвертация в двоичную систему
//    public static String toBinary(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Число должно быть неотрицательным");
//        }
//        return Integer.toBinaryString(number);
//    }

    // 12. Проверка делимости
//    public static boolean isDivisible(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Недопустимо деление на ноль");
//        }
//        return a % b == 0;
//    }

    // 13. Чтение элемента списка
//    public static <T> T getElementAtIndex(List<T> list, int index) {
//        if (index < 0 || index >= list.size()) {
//            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
//        }
//        return list.get(index);
//    }

    // 14. Парольная проверка
//        public static void checkPassword(String password) throws WeakPasswordException {
//            if (password.length() < 8) {
//                throw new WeakPasswordException("Пароль должен содержать не менее 8 символов.");
//            }
//            System.out.println("Пароль достаточно сильный.");
//        }
    // 15. Проверка даты
//    public static boolean checkDate(String date) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        try {
//            LocalDate.parse(date, formatter);
//        } catch (DateTimeParseException e) {
//            throw new DateTimeParseException("Некорректная дата", date, 0);
//        }
//        return true;
//    }
    // 16. Конкатенация строк
//        public static String concatenateStrings(String str1, String str2) {
//            if (str1 == null || str2 == null) {
//                throw new NullPointerException("Одна из строк равна null");
//            }
//            return str1 + str2;
//        }
    // 17. Остаток от деления
//        public static int remainder(int a, int b) {
//            if (b == 0) {
//                throw new ArithmeticException("Недопустимо деление на ноль");
//            }
//            return a % b;
//        }
    // 18. Квадратный корень
//    public static double sqrt(double number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Нельзя извлечь квадратный корень из отрицательного числа");
//        }
//        return Math.sqrt(number);
//    }
    // 19. Конвертер температуры
//    public static double celsiusToFahrenheit(double celsius) {
//        if (celsius < -273.15) {
//            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
//        }
//        return celsius * 9/5 + 32;
//    }
    // 20. Проверка строки на пустоту
//        public static String stringCheck(String str1, String str2) {
//            if (str1 == null || str2 == null || str1 == "" || str2 == "") throw new NullPointerException("Конкатенация строк невозможна");
//            return str1 + str2;
//        }
    public static void main(String[] args) {
        // 1.
//     System.out.println(max(1, 1));
        // 2.
//     System.out.println(divide(1.0, 0));
        // 3.
//     System.out.println(stringToInt("a"));
        // 4.
//     System.out.println(checkAge(800));
        // 5.
//        System.out.println(squareRoot(-1));
        // 6.
//             System.out.println(factorial(-1));
        // 7.
//        int[] array = {1, 2, 3, 4, 0};
//        System.out.println(checkArrayForZeros(array));
        // 8.
//        System.out.println(power(2, 3));
        // 9.
//        System.out.println(trimString("123456", 5));
        // 10.
//        int[] array = {1, 2, 3, 4, 0};
//        System.out.println(findElement(array, 6));
        // 11.
//        System.out.println(toBinary(-1));
        // 12.
//     System.out.println(isDivisible(6, 2));
        // 13.
//        List<Integer> Numbers = List.of(1, 2, 3);
//        System.out.println(getElementAtIndex(Numbers, 4));
        // 14.
//        try {
//            checkPassword("1234567"); // Исключение
//        } catch (WeakPasswordException e) {
//            System.out.println(e.getMessage());
//        }
        // 15.
//        System.out.println(checkDate("13.09.2020"));
        // 16.
//        System.out.println(concatenateStrings(null, "asd"));
        // 17.
//        System.out.println(remainder(1, 0));
        // 18.
//        System.out.println(sqrt(144));
        // 19.
//        System.out.println(celsiusToFahrenheit(0));
        // 20.
//        System.out.println(stringCheck("", "2"));
    }
}