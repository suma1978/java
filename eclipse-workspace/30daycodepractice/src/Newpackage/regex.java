package Newpackage;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class regex {
	
	
	public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       // String emailRegEx = "^[a-z0-9]{1,20}+.+@gmail\\.com$";
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList();
        for (int i = 0; i < num; i++){
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
                list.add(name);
                System.out.println(name);
            }
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }

}
