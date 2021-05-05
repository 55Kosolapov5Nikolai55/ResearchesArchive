package Kosolapov.Nikolai;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void getData(String path) throws IOException {    // THROWING OF EXCEPTION IN METHOD'S SIGNATURE
        File fileToRead = new File(path);
        FileReader dataReader = new FileReader(fileToRead);
        Scanner fileScanner = new Scanner(dataReader);
        while (fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
    }

    public static Object[] copyArray(Object[] original) {

        Object[] copy = new Object[original.length];

        for(int copyIndex = 0; copyIndex <= original.length; copyIndex ++){ // ARRAY INDEX OUT OF BOUNDS EXCEPTION
            copy[copyIndex] = original[copyIndex];
        }
        return copy;
    }

    public static String[] fileDataToArray(String path) {
        File fileToRead = new File(path);
        LinkedList<String> dataList = new LinkedList<>();
        try {
            Scanner dataScanner = new Scanner(fileToRead);          // TRY - CATCH CONSTRUCTION IN METHOD
            while (dataScanner.hasNextLine()) {
                dataList.add(dataScanner.nextLine());
            }
        } catch (FileNotFoundException fileNFE) {
            FileNotFoundException fnf = new FileNotFoundException();
            fnf.initCause(fileNFE.getCause());
            System.out.println("FILE NOT FOUND EXCEPTION !");
            System.out.println(fnf.getCause());
        }
        String[] dataArray = new String[dataList.size()];
        for(int fillArray = 0; fillArray < dataArray.length; fillArray ++){
            dataArray[fillArray] = dataList.get(fillArray);
        }
        return  dataArray;
    }

    public static File writeArrayToFile(String path , String[] array) throws  IOException{
        File fileToSaveArrayElements = new File(path);
        FileWriter fileW = new FileWriter(fileToSaveArrayElements);
        for(int writeIndex = 0; writeIndex < array.length; writeIndex ++){
            fileW.write(array[writeIndex] + "\n");
        }
        fileW.flush();
        fileW.close();
        return fileToSaveArrayElements;
    }

    public static void displayArray(Object[] arrayToDisplay){
        for(int displayIndex = 0; displayIndex < arrayToDisplay.length; displayIndex ++){
            System.out.println(arrayToDisplay[displayIndex]);
        }
    }

    public static void main(String[] args) {

        // Unchecked Exceptions :

        try {
            System.out.println(1000 / 0); // ARITHMETIC EXCEPTION: PROGRAMMER'S MISTAKE
            Object[] copy = copyArray(fileDataToArray("EXCEPTIONS")); // FILE NOT FOUND EXCEPTION (Incorrect path: EXCEPTIONS , Correct path: EXCEPTION)
            displayArray(copy);
        }catch (ArrayIndexOutOfBoundsException oOB){
            ArrayIndexOutOfBoundsException aoob = new ArrayIndexOutOfBoundsException();
            aoob.initCause(oOB);
            System.out.println("Programmer's mistake: Array Index Out Of Bounds Exceptions");
            System.out.println(aoob.getCause());
        }catch (ArithmeticException arithmeticEXC){
            ArithmeticException arithmeticE = new ArithmeticException("Divide By Zero");
            arithmeticE.initCause(arithmeticEXC);
            System.out.println("Arithmetic exception");
            System.out.println(arithmeticE.getCause());

        }

        // Checked Exceptions :

        try {
            getData("EXCEPTION");
        }catch (FileNotFoundException fileNFE){
            FileNotFoundException fnf = new FileNotFoundException();
            fnf.initCause(fileNFE);
            System.out.println("File Not Found Exception !");
            System.out.println(fnf.getCause());
        }catch (IOException IOexc){
            IOException IOE = new IOException();
            IOE.initCause(IOexc.getCause());
            System.out.println("Input/Output exceptions");
            System.out.println(IOE.getCause());

        } finally {
            System.out.println("Data was read !");
        }


        // Using 'throw' in try-catch construction :

        try {
            Scanner scUserInput = new Scanner(System.in);
            float  numericInput = scUserInput.nextFloat();
            if (numericInput == 0) {
                throw new ArithmeticException("User's input is equal  to zero !");
            }else {
                System.out.println(1000 / numericInput);
            }
            scUserInput.close();
        }catch (ArithmeticException arithmeticEXC){
            ArithmeticException a = new ArithmeticException();
            a.initCause(arithmeticEXC.getCause());
            if(a.getMessage() == null){
                System.out.println(Arrays.toString(a.getStackTrace()));
            }
            System.out.println(arithmeticEXC.getMessage());
        }

        // Using try - catch - finally construction in difficult situation:

        File fileToSave = new File("EXCEPTION1");

        try{
            String[] elements =  fileDataToArray("EXCEPTION");
            writeArrayToFile(fileToSave.getPath() , elements);
            getData(fileToSave.getPath());
        }catch (IOException ioExc){

            System.out.println(ioExc.getMessage());

        }finally {

            System.out.println("!");

        }
    }
}
