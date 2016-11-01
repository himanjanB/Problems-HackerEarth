package com.module.basics;

import java.util.Scanner;
 

public class OracleProblem {

      public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int numberOfCustomers = scan.nextInt();

            scan.nextLine();

            int numberOfPrefferedCustomers = 0;

            int numberOfNotPrefferedCustomers = 0;

            int residualTime = 0;

            int previousCookingTime = 0;

 

            for (int i = 0; i < numberOfCustomers; i++) {

                  String line = scan.nextLine();

                  String[] lineArray = line.split(" ");

                  int isAPrefferedCustomer = Integer.parseInt(lineArray[3]);

                  boolean result = getResult(lineArray, residualTime, previousCookingTime);

 

                  if (result) {

                        residualTime = Integer.parseInt(lineArray[0]);

                        previousCookingTime = Integer.parseInt(lineArray[1]);

                        if (isAPrefferedCustomer == 1) {

                              numberOfPrefferedCustomers++;

                        } else {

                              numberOfNotPrefferedCustomers++;

                        }

                  }

            }

 

            System.out.println(numberOfPrefferedCustomers + " " + numberOfNotPrefferedCustomers);

            scan.close();

      }

 

      /*

      * 0 3 7 1 
      * 1 4 5 1 
      * 1 2 7 0

      */

 

      private static boolean getResult(String[] lineArray, int residualTime, int previousCookingTime) {

            int arrivalTime = Integer.parseInt(lineArray[0]);

            int orderTime = Integer.parseInt(lineArray[1]);

            int patienceTime = Integer.parseInt(lineArray[2]);

            int usedTime = 0;

 

            usedTime = arrivalTime - residualTime;

            orderTime = (previousCookingTime - usedTime) + orderTime;

 

            if (patienceTime > orderTime) {

                  return true;

            } else {

                  return false;

            }

      }

}

 