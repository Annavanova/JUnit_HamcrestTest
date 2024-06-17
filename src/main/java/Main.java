public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 6);
        int b = calc.minus.apply(5, 1);
       // int c = calc.devide.apply(a, b); // В методе Calculator исправила функцию деления на 0,
        // т.к. именно там может возникнуть ошибка
        try { int c = calc.devide.apply(a, b);
            calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException y) {
            y.printStackTrace();
        }

      /*  calc.println.accept(a);
        calc.println.accept(b);*/
    }
}
