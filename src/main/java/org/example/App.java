package org.example;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);
        String wordSeparate = "", wordCombine = "", wordCombineV = "", wordCombineM = "", wordCombineC = "";
        do {
            String word = entrada.nextLine();
            String firstIndicator = word.substring(0, 1);
            String secondIndicator = word.substring(2, 3);
            if (firstIndicator.contains("S")) {
                wordSeparate = word.substring(4);
                String[] separate = wordSeparate.split("(?=[A-Z])");
                wordSeparate = "";
                for (int i = 0; i < separate.length; i++) {
                    wordSeparate += separate[i] + " ";
                }
                wordSeparate = wordSeparate.toLowerCase();
                wordSeparate = wordSeparate.replaceAll("[()]", "");
                System.out.println(wordSeparate);
            }
            if (firstIndicator.contains("C")) {
                wordCombine = word.substring(4);
                switch (secondIndicator)
                {
                    case "M":
                        wordCombineM = wordCombine;
                        String[] separate = wordCombineM.split(" ");
                        wordCombineM = separate[0];
                        for (int i = 1; i < separate.length; i++) {
                            String upper = separate[i].substring(0, 1);
                            upper = upper.toUpperCase();
                            separate[i] = separate[i].substring(1);
                            wordCombineM += upper + "" + separate[i];
                        }
                        wordCombineM += "()";
                        System.out.println(wordCombineM);
                        break;
                    case "C":
                        wordCombineC = wordCombine;
                        String[] separatea = wordCombineC.split(" ");
                        wordCombineC = "";
                        for (int i = 0; i < separatea.length; i++) {
                            String upper = separatea[i].substring(0, 1);
                            upper = upper.toUpperCase();
                            separatea[i] = separatea[i].substring(1);
                            wordCombineC += upper + "" + separatea[i];
                        }
                        System.out.println(wordCombineC);
                        break;
                    case "V":
                        wordCombineV = wordCombine;
                        String[] separateb = wordCombineV.split(" ");
                        wordCombineV = separateb[0];
                        for (int i = 1; i < separateb.length; i++) {
                            String upper = separateb[i].substring(0, 1);
                            upper = upper.toUpperCase();
                            separateb[i] = separateb[i].substring(1);
                            wordCombineV += upper + "" + separateb[i];
                        }
                        System.out.println(wordCombineV);
                }
            }
        } while (true);
    }
}
