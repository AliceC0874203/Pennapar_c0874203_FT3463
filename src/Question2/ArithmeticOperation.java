package Question2;

abstract class ArithmeticExp {

    public static int evaluate(ArithmeticExp term) {
        if (Number.class.equals(term.getClass())) {
            return ((Number) term).value;
        } else if (Sum.class.equals(term.getClass())) {
            return evaluate(((Sum) term).left) + evaluate(((Sum) term).right);
        } else if (Product.class.equals(term.getClass())) {
            return evaluate(((Product) term).left) * evaluate(((Product) term).right);
        }
        return 0;    //error, should never happen
    }
}
/** main class */
class ArithmeticOperation {
//name class change it move -> test

    /** Constants for representing the types*/
    public static void main(String [] args) {
        // constructing the expression 3 + 2 * 5
        ArithmeticExp term = new Sum(new Number(3),
                new Product(
                        new Number(2),
                        new Number(5)
                )
        );

        System.out.println(ArithmeticExp.evaluate(term));
    }
}
