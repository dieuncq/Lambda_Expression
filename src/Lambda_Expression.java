public class Lambda_Expression {
    Welcoming lambda_Welcoming = s_Message -> System.out.println("\n" + s_Message);
    PlusIntegers plus_Integers = (Integers) -> {
        Integer i_Result = 0;
        for (int x = 0; x < Integers.length; x++) {
            i_Result += Integers[x];
        }
        return i_Result;
    };
}

class Lambda_Expression_Exercise {
    public static void Exercise() {
        Lambda_Expression lambda_Item = new Lambda_Expression();
        lambda_Item.lambda_Welcoming.Explaination("This is the Lambda Expression");

        Integer i_Integers = lambda_Item.plus_Integers.Plus(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("i_Integers after added: " + i_Integers);
    }
}

@FunctionalInterface
interface Welcoming {
    void Explaination(String s_Message);
}

@FunctionalInterface
interface PlusIntegers {
    int Plus(int ...args);
}
