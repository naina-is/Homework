package basic;

public class MethodsHw {
//    ***************NON-RETURN TYPE METHOD***************

//    ********No Parameters*********
    public void classNames() {
        String studentName = "Naina";
        String professorName = "Mahmud";

        System.out.println("The professor is named " + professorName + " and the student is named " + studentName);
    }

    public void date() {
        int month = 4;
        int day = 17;
        int year = 2022;

        System.out.println("The date is " + month + "/" + day + "/" + year);
    }

    public void fruits() {
        String fruit1 = "Strawberries";
        String fruit2 = "Oranges";
        String fruit3 = "Blueberries";

        System.out.println(fruit1 + ", " + fruit2 + ", and " + fruit3);
    }

    public void multiply() {
        double num1 = 32.44;
        double num2 = 4323.55;

        System.out.println(num1 * num2);
    }

    public void alphabet() {
        char first = 'a';
        char second = 'b';
        char third = 'c';
        char fourth = 'd';

        System.out.println(first + second + third + fourth);
    }


    //    ********Parameters*********
    public void math(int int1, int int2, int int3) {
        int total = int1 + int2 + int3;
        System.out.println("Total: " + total);
    }

    public void personalInformation(String name, int phoneNumber, String address) {
        System.out.println("Personal Information: ");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public void decimals(double decimal1, float decimal2) {
        float total = (float) (decimal1 + decimal2);
        System.out.println(total);
    }

    public void makeupProducts(String lipstick, String concealer, String facePowder) {
        System.out.println("Types of Makeup:");
        System.out.println("Lipstick: " + lipstick);
        System.out.println("Concealer: " + concealer);
        System.out.println("Face Powder: " + facePowder);
    }

    public void plantTypes(String flowers, String trees) {
        System.out.println("I like " + flowers + " flowers and "  + trees + " trees");
    }


    //    ***************RETURN TYPE METHOD***************

//    ********Without Parameters*********
    public int numbers() {
        System.out.println("These are numbers:");
        int number1 = 1;
        int number2 = 3;
        int number3 = 5;

        int numberTotal = number1 + number2 + number3;
        System.out.println(number1 + ", " + number2 + ", " + number3);

        return numberTotal;
    }

    public String countries() {
        String country1 = "United States";
        String country2 = "Italy";
        String country3 = "Bangladesh";
        String country4 = "Mexico";

        String allCountries = country1 + ", " + country2 + ", " + country3 + ", " + country4;
        System.out.println(allCountries);
        return allCountries;
    }

    public boolean isThereClassTomorrow() {
        boolean classTomorrow = true;

        System.out.println("True/False: Is there class tomorrow? " + classTomorrow);
        return classTomorrow;
    }

    public double testScores() {
        double grade1 = 95.6;
        double grade2 = 99.15;
        double grade3 = 91.38;
        double grade4 = 66.5;

        double averageGrades = (grade1+grade2+grade3+grade4)/4;
        System.out.println("The grades for this weeks test are: " + grade1 + ", " + grade2 +", " + grade3 + ", and " + grade4);
        System.out.println("The average was " + averageGrades);
        return averageGrades;
    }

    public char letters() {
        char  first = 'a';
        char second = 'b';
        char third = 'c';

        char firstThreeLetters = 'a' + 'b' + 'c';

        return firstThreeLetters;
    }

//    ********Parameters*********
    public int doAddition(int n1, int n2, int n3) {
        System.out.println("Sum: " + (n1 + n2 + n3));
        return n1 + n2 + n3;
    }

    public String isIftarReady(String iftarFood, String time) {
        String iftarTime = time;
        System.out.println("Iftar Food: " + iftarFood);
        System.out.println("Time: " + time);
        System.out.println("Is it Iftar Time?");
        if (time == "7:30PM" ) {
            System.out.println("It is Iftar time");
        } else {
            System.out.println("It is not Iftar time");
        }
        return time;
    }

    public boolean isIftarAvailable (String iftarFood, char fasting, boolean iftarAvailable) {
        System.out.println(iftarFood + ", " + fasting + ", " + "availability: " + iftarAvailable);

        return iftarAvailable;
    }


    public double calculator(double n1, double n2, double n3) {
        double product = n1 * n2 * n3;
        System.out.println(n1 + "*" + n2 + "*" + n3);
        System.out.println("= "+product);
        return product;
    }

    public byte clock(byte hours, byte minutes) {
        byte time = 24;
        System.out.println("It is " + hours + ":" + minutes);
        return time;
    }

//    ********************MAIN METHOD************************
    public static void main(String[] args) {
    MethodsHw methodsHw = new MethodsHw();
//  non-return method without parameters
    methodsHw.classNames();
    System.out.println("-------------------------------------------------------------");
    methodsHw.date();
    System.out.println("-------------------------------------------------------------");
    methodsHw.fruits();
    System.out.println("-------------------------------------------------------------");
    methodsHw.multiply();
    System.out.println("-------------------------------------------------------------");
    methodsHw.alphabet();
    System.out.println("-------------------------------------------------------------");
//  non-return method with parameters
    methodsHw.math(20,13,4);
    System.out.println("-------------------------------------------------------------");
    methodsHw.personalInformation("Naina", 1234567890, "Queens, NY");
    System.out.println("-------------------------------------------------------------");
    methodsHw.decimals(79.12, (float) 105.667754234);
    System.out.println("-------------------------------------------------------------");
    methodsHw.makeupProducts("NYX Matte Lipstick", "Benefit Pro Concealer", "Laura Mercier Setting Powder");
    System.out.println("-------------------------------------------------------------");
    methodsHw.plantTypes("Tulip", "Oak");
    System.out.println("-------------------------------------------------------------");

//  return method without parameters
    methodsHw.numbers();
    System.out.println("-------------------------------------------------------------");
    methodsHw.countries();
    System.out.println("-------------------------------------------------------------");
    methodsHw.isThereClassTomorrow();
    System.out.println("-------------------------------------------------------------");
    methodsHw.testScores();
    System.out.println("-------------------------------------------------------------");
    methodsHw.letters();
    System.out.println("-------------------------------------------------------------");

//  return method with parameters
    methodsHw.isIftarReady("Dates, Fruits, Rice, meat", "7:30PM");
    System.out.println("-------------------------------------------------------------");
    methodsHw.isIftarAvailable("Dates, Chickpeas, Sandwiches", 'Y', true);
    System.out.println("-------------------------------------------------------------");
    methodsHw.calculator(10.56,22.093,41.3422);
    System.out.println("-------------------------------------------------------------");
    methodsHw.clock((byte) 10, (byte) 32);
    }


}
