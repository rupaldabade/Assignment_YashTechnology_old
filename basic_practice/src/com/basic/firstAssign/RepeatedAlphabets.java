package com.basic.firstAssign;
//4) WAP to print the number of alphabets repeated in the given string.

public class RepeatedAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello world";  
        int count;  
          
        //Converts given string into character array  
        char strArry[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <strArry.length; i++) {  
            count = 1;  
            for(int j = i+1; j <strArry.length; j++) {  
                if(strArry[i] == strArry[j] && strArry[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    strArry[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && strArry[i] != '0')  
                System.out.println(strArry[i]);  
        }  
    }  

}
