package assignment1;

import java.util.Scanner;

public class CodeSample1 {


        static String[] date;
        static String[] transactionTime;
        static String[] category;
        static double[] price;
        static int[] quantity;
        static double[] rating;
        static int[] duration;
        public static void printTransaction(int no){
            System.out.println("\t When: "+date[no]+" "+transactionTime[no]);
            System.out.println("\t Category: "+category[no]);
            String output1 = String.format("\t Price: %.2f",(float) price[no]);
            System.out.println(output1);
            System.out.println("\t Rating: "+rating[no]);
        }



        public static int findMax() {
            double max = price[0];
            int x = 0;
            for (int i = 0; i < price.length; i++) {
                if (price[i] >= max) {
                    max = price[i];
                    x = i;
                }
            }
            return x;
        }

        public static int findMin() {
            double min = price[0];
            int x = 0;
            for (int i = 0; i < price.length; i++) {
                if (price[i] <= min) {
                    min = price[i];
                    x = i;
                }
            }
            return x;
        }
        public static void findBook(){
            int quantitySum=0;
            double ratingSum=0;
            double priceSum = 0;
            int durationSum = 0;
            int count = 0;
            for (int i = 0; i < price.length; i++) {

                if(category[i].equals("book")){
                    count = count + 1;
                    quantitySum = quantitySum + quantity[i];
                    ratingSum = ratingSum + rating[i];
                    priceSum = priceSum + price[i]*quantity[i];
                    durationSum = durationSum + duration[i];
                }


            }
            System.out.println("Averages by book");
            System.out.println("\t Quantity: "+ quantitySum);
            String output3 = String.format("\t Price: %.2f",(float) priceSum/quantitySum);
            String output2 = String.format("\t Rating: %.2f",(float) ratingSum/count);
            String output1 = String.format("\t Duration: %.2f",(float) durationSum/count);
            System.out.println(output3);
            System.out.println(output2);
            System.out.println(output1);
        }

        public static void findJewelry(){
            int quantitySum=0;
            double ratingSum=0;
            double priceSum = 0;
            int durationSum = 0;
            int count = 0;
            for (int i = 0; i < price.length; i++) {

                if(category[i].equals("jewelry")){
                    count = count + 1;
                    quantitySum = quantitySum + quantity[i];
                    ratingSum = ratingSum + rating[i];
                    priceSum = priceSum + price[i]*quantity[i];
                    durationSum = durationSum + duration[i];
                }


            }
            System.out.println("Averages by jewelry");
            System.out.println("\t Quantity: "+ quantitySum);
            String output3 = String.format("\t Price: %.2f",(float) priceSum/quantitySum);
            String output2 = String.format("\t Rating: %.2f",(float) ratingSum/count);
            String output1 = String.format("\t Duration: %.2f",(float) durationSum/count);
            System.out.println(output3);
            System.out.println(output2);
            System.out.println(output1);
        }
        public static void findPhone(){
            int quantitySum=0;
            double ratingSum=0;
            double priceSum = 0;
            int durationSum = 0;
            int count = 0;
            for (int i = 0; i < price.length; i++) {

                if(category[i].equals("phone")){
                    count = count + 1;
                    quantitySum = quantitySum + quantity[i];
                    ratingSum = ratingSum + rating[i];
                    priceSum = priceSum + price[i]*quantity[i];
                    durationSum = durationSum + duration[i];
                }


            }
            System.out.println("Averages by phone");
            System.out.println("\t Quantity: "+ quantitySum);
            String output3 = String.format("\t Price: %.2f",(float) priceSum/quantitySum);
            String output2 = String.format("\t Rating: %.2f",(float) ratingSum/count);
            String output1 = String.format("\t Duration: %.2f",(float) durationSum/count);
            System.out.println(output3);
            System.out.println(output2);
            System.out.println(output1);


        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            int transactions = input.nextInt();
            date = new String[transactions];
            transactionTime = new String[transactions];
            category = new String[transactions];
            price = new double[transactions];
            quantity = new int[transactions];
            rating = new double[transactions];
            duration = new int[transactions];



            for (int i = 0; i < transactions; i++) {
                date[i] = input.next();
                transactionTime[i] = input.next();
                category[i] = input.next();
                price[i] = input.nextDouble();
                quantity[i] = input.nextInt();
                rating[i] = input.nextDouble();
                duration[i] = input.nextInt();
            }


            int MaxIndex = findMax();
            System.out.println("Highest per unit sale:");
            printTransaction(MaxIndex);
            int MinIndex = findMin();
            System.out.println("Lowest per unit sale:");
            printTransaction(MinIndex);
            //int AverageByBook =
            findBook();
            findJewelry();
            findPhone();


        }


    }


