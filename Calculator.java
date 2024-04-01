class Calculator{

    float addition(float operand_1, float operand_2){
        return(operand_1 + operand_2);
    }

    float subtraction(float operand_1, float operand_2){
        return(operand_1 - operand_2);
    }

    float multiplication(float operand_1, float operand_2){
        return(operand_1 * operand_2);
    }

    float division(float operand_1, float operand_2){
        return(operand_1 / operand_2);
    }

    // float square(float operand_1){
    //     return(operand_1 * operand_1);
    // }

    // float cube(float operand_1){
    //     return(operand_1 * operand_1 * operand_1);
    // }

//
    public static void main(String[] args){
        float operand_1 = 10;
        float operand_2 = 5;
        Calculator calc = new Calculator();

        float add_result = calc.addition(operand_1,operand_2);
        System.out.println("Result of Addition is: " + add_result);

        float sub_result = calc.subtraction(operand_1,operand_2);
        System.out.println("Result of Subtraction is: " + sub_result);

        float mul_result = calc.multiplication(operand_1,operand_2);
        System.out.println("Result of Multiplication is: " + mul_result);

        float div_result = calc.division(operand_1,operand_2);
        System.out.println("Result of Division is: " + div_result);
        
        Extended_Calci calc1 = new Extended_Calci();
        float sqr_result = calc1.square(operand_1);
        System.out.println("Result of Square is: " + sqr_result);

        float cube_result = calc1.cube(operand_1);
        System.out.println("Result of cube is: " + cube_result);
    }
}
