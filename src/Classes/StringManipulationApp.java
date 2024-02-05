package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulationApp 
{
    private List<String> listArray = new ArrayList<String>();
    private String[] StringArray;
    private String[] ReversedStringArray;


    public void Main()
    {
        StringArrayManipulator(new String[10]);
    }

    private void StringArrayManipulator(String[] stringArray) 
   {
       this.StringArray = stringArray;

       AddString("Hello");
       AddString("My");
       AddString("Name");
       AddString("is");
       AddString("Arthur!");

       printArray(StringArray);

       System.out.println(" ");
       findLongestString();
       findShortestString();

       System.out.println(" ");
       ReverseString(StringArray);
       printArray(ReversedStringArray);

       System.out.println("Add new element to array");
       AddString("GoodBye!");


       printArray(StringArray);
   }

    private void ReverseString(String[] inStringArray)
    {
        System.out.println("Every word in array reversed: ");

        ReversedStringArray = inStringArray;

        for(int i = 0; i < ReversedStringArray.length; i++)
        {
            char[] charArray = ReversedStringArray[i].toCharArray();

            ReversedStringArray[i] = "";

            for(int j = charArray.length - 1; j >= 0; j--)
            {
                ReversedStringArray[i] += charArray[j];
            }
        }
    }


    private void ModifyOriginalArray()
    {
        StringArray = new String[listArray.size()];
        listArray.toArray(StringArray);
    }

    private void AddString(String newString)
    {
        listArray.add(newString);
        ModifyOriginalArray();
    }


   private void printArray(String[] inStringArray) 
   {
        System.out.println(" ");

        System.out.println(Arrays.toString(inStringArray));
   }


   private int findLongestString() 
   {
       int maxLength = 0;

       var longestWord = "";

       for (String str : StringArray) 
       {
           if (str.length() > maxLength) 
           {
               maxLength = str.length();
               longestWord = str;
           }
       }

       System.out.println("The longest word is: " + longestWord);
       System.out.println("It have a " + maxLength + " symbols.");
       return maxLength;
   }


   private int findShortestString() 
   {
       int minLength = 1;

       var shortestWord = StringArray[0];

       for(int i = 0; i < StringArray.length; i++)
       {
            if(StringArray[i].length() < shortestWord.length())
            {
                shortestWord = StringArray[i];
                minLength = shortestWord.length();
            }
       }

       System.out.println("The shortest word is: " + shortestWord);
       System.out.println("It have a " + minLength + " symbols.");
       return minLength;
   }
}
