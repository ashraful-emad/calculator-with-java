public class Start {
    public static void main(String[] args) {
        ScientificCalculator empty = new ScientificCalculator();
        ScientificCalculator objOne = new ScientificCalculator(10,22);

        objOne.setValue1(10);
        objOne.setValue2(5);

        System.out.println("---------------------CALCULATOR----------------------------");
        System.out.println("Value one                           = " + objOne.getValue1());
        System.out.println("Value two                           = " + objOne.getValue2());
		System.out.println("Addition                            = " + objOne.add());
		System.out.println("Subtraction                         = " + objOne.subtract());
		System.out.println("Multiplication                      = " + objOne.multiply());
		System.out.println("Divide                              = " + objOne.divide());
        System.out.println(objOne.getValue1() +" to the power "+ objOne.getValue2() + " is equals to  = " + objOne.toThePow());
	    System.out.println("-----------------------------------------------------------");

    }
}
