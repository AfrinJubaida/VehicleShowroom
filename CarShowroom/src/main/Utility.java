/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author afrin
 */
public class Utility {
    public static char getChoice(String prompt) {
        System.out.println(prompt);
        Scanner in = new Scanner(System.in);
        char ch = in.next().toLowerCase().charAt(0);
        return ch;
    }
    
    public static boolean promptYes() {
        Scanner sc = new Scanner(System.in);
        String resp = sc.next().toLowerCase();
        return resp.equals("y");
    }
}
