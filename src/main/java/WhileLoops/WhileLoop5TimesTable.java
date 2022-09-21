package WhileLoops;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author m2003744
 */
public class WhileLoop5TimesTable {

    public static void main(String[] args) {
        int n = 5;
        int range = 15;
        System.out.println("Five Times Table with Range 1 to 15");
        int i = 1;
        while (i <= range) {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        }
    }
}
