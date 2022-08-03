package br.com.letscode.bb.exception;

import br.com.letscode.bb.exemploclosable.ClasseComClosable;
import br.com.letscode.bb.exemploclosable.ClasseSemClosable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteException {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            //int naoRola = 0 / 0;
        }catch (ArithmeticException e){
            System.out.println("Ocorreu um erro ".concat(e.getMessage()));
        }finally {
            scanner.close();
        }

        try(Scanner scanner2 = new Scanner(System.in)){
            // corpo
        }catch (ArithmeticException e){
            System.out.println("Ocorreu um erro ".concat(e.getMessage()));
        }

        try(ClasseComClosable classeComClosable = new ClasseComClosable()){
            classeComClosable.metodo();
        }catch (ArithmeticException | IOException e){
            System.out.println("Ocorreu um erro ".concat(e.getMessage()));
        }

        /*try(ClasseSemClosable classeSemClosable = new ClasseSemClosable()){
            classeSemClosable.metodo();
        }catch (ArithmeticException | IOException e){
            System.out.println("Ocorreu um erro ".concat(e.getMessage()));
        }*/

    }
}
