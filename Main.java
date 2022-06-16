public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        // в результате опрерации вычитания int b = 0, а деление на ноль невозможно, поэтому возникает ошибка.
        //чтобы опустить ошибку в операции деления я сделала проверку при помощи тернарного оператора.
        // Если делителем будет 0, тогда и результат от операции деления у меня возвращает 0.

        calc.println.accept(c);

    }
}
