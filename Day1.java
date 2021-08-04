import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int iInput = Integer.parseInt(scan.nextLine());
        double dInput = Double.parseDouble(scan.nextLine());
        String sInput = scan.nextLine();
        
        System.out.println(i + iInput);
        System.out.println(d + dInput);
        System.out.println(s + sInput);

        scan.close();
    }
}