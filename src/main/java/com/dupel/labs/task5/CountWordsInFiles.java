package com.dupel.labs.task5;

import com.dupel.labs.task2.WordCounter;

import java.io.*;

public class CountWordsInFiles {
    public static final String workingDirectory = "TextFiles/";
    private static String wholeText;

    private static void generateFiles() throws IOException {
        // Create files and read Strings to them

        StringBuilder stringToWrite = new StringBuilder("");

        for (int index = 1; index <= 10; index++) {
            // Generate new file name
            final StringBuilder filename = new StringBuilder(workingDirectory).append("file").append(String.valueOf(index)).append(".txt");
            File textFile = new File(filename.toString());

            //if (textFile.createNewFile()) {
              //  System.out.println(filename.toString() + " File Created");

                // Generate text to write
                if (index % 2 != 0) {
                    Character charFromIndex = (char) (index + 65);
                    stringToWrite = new StringBuilder(Character.toString(charFromIndex)).append(Character.toString(charFromIndex));
                }

                // Write using stream
                FileOutputStream outputStream = new FileOutputStream(textFile);
                outputStream.write(stringToWrite.toString().getBytes());
                outputStream.close();
            }
     }


    private static String mergeFilesToString()  throws IOException {
        StringBuilder textResult = new StringBuilder("");
        for (int index = 1; index <= 10; index++) {
            StringBuilder filename = new StringBuilder(workingDirectory).append("file").append(String.valueOf(index)).append(".txt");
            File file = new File(filename.toString());
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                textResult.append(line).append(" ");
            }

            reader.close();
        }

        return textResult.toString();
    }

    public static void main(String[] args) throws IOException {

        //generateFiles();
        String mergedText = mergeFilesToString();

        System.out.println("\n   Here are " + WordCounter.count(mergedText) + " unique words in the files in sum");
    }
}
