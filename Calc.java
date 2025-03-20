import java.util.*;
public class Calc {
    Scanner scan = new Scanner(System.in);
    public Calc() {
        eingabeEinlesen();
    }
    public void eingabeEinlesen() {
        int zahl1, zahl2;
        String operator;
        int erg = 0;
        System.out.println("Eingabe der ersten Zahl: ");
        zahl1 = scan.nextInt();
        System.out.println("Eingabe +, -, *, /: ");
        operator = scan.next();


        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            System.out.println("Eingabe der zweiten Zahl: ");
            zahl2 = scan.nextInt();

            switch(operator) {
                case "+":
                    erg = zahl1 + zahl2;
                    break;
                case "-":
                    erg = zahl1 - zahl2;
                    break;
                case "*":
                    erg = zahl1 * zahl2;
                    break;
                case "/":
                    if(zahl2 == 0 || zahl1 == 0){
                       System.out.println("Es wurde eine Division mit 0 durchgeführt, was mathematisch nicht machtbar ist!");
                       return;
                    }else {

                    erg = zahl1 / zahl2;
                    break;}
            }

            System.out.println("Das Ergebnis lautet: "+erg);
        } else {
            System.out.println("Es wurde kein gültiger Operator eingegeben!");
        }



    }
    public static void main(String[] args) {
        Calc rechner = new Calc();
    }
}
