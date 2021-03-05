package sk.stuba.fei.uim.oop.trieda;

import sk.stuba.fei.uim.oop.utility.KeyboardInput;

public class Uloha_1_2 {
    public static void spustiUlohu(){
        int pocet = 10;
        Student[] trieda = new Student[pocet];

        trieda[0] = new Student(1,"Jano","Breza",19);
        trieda[1] = new Student(15,"Adam","Sedlak",18);
        trieda[2] = new Student(10,"Rene","Bavorsky",17);
        trieda[3] = new Student(4,"Tomas","Babinec",16);
        trieda[4] = new Student(5,"Erik","Peteraj",15);
        trieda[5] = new Student(8,"Fero","Ostrekovsky",14);
        trieda[6] = new Student(7,"Jana","Pelegrinska",13);
        trieda[7] = new Student(20,"Elena","Sustekova",12);
        trieda[8] = new Student(9,"Katka","Hrachova",11);
        trieda[9] = new Student(111,"Tono","Sonorov",10);

        System.out.println("Toto je trieda: ");
        vypisTriedu(trieda);
        System.out.println("\n");

        zoradTriedu(trieda);
        System.out.println("Toto je trieda zoradena: ");
        vypisTriedu(trieda);
        System.out.println("\n");
    }

    public static void zoradTriedu(Student arr[]){
        clearScreen();
        System.out.println("Podla ktoreho parametra chces zoradit triedu? (zadaj cislo): ");
        System.out.println("1 - Id \n2 - Meno \n3 - Priezvisko \n4 - Vek");
        int moznost = KeyboardInput.readInt("Zadaj moznost");
        System.out.println("Smer zoradenia: ");
        System.out.println("1 - Vzostupne \n2 - Zostupne");
        int smer = KeyboardInput.readInt("Zadaj moznost");
        bubbleSort(arr,moznost,smer);

    }

    public static void bubbleSort(Student arr[], int moznost, int smer){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++) {
                switch (moznost) {
                    case 1:
                        if (smer == 1){
                            if (arr[j].getId()>arr[j+1].getId())
                            {
                                Student temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        else if (smer == 2){
                            if (arr[j].getId() < arr[j + 1].getId()) {
                                Student temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                        break;

                    case 2:
                        if (smer == 1){
                            if (arr[j].getMeno().compareTo(arr[j+1].getMeno()) > 0 )
                            {
                                Student temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        } else if (smer ==2){
                            if (arr[j].getMeno().compareTo(arr[j+1].getMeno()) < 0 )
                            {
                                Student temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        break;

                    case 3:
                        if (smer == 1){
                            if (arr[j].getPriezvisko().compareTo(arr[j+1].getPriezvisko()) > 0 )
                            {
                                Student temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        } else if (smer ==2){
                            if (arr[j].getPriezvisko().compareTo(arr[j+1].getPriezvisko()) < 0 )
                            {
                                Student temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        break;

                    case 4:
                        if (smer == 1){
                            if (arr[j].getVek()>arr[j+1].getVek())
                            {
                                Student temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        else if (smer == 2){
                            if (arr[j].getVek() < arr[j + 1].getVek()) {
                                Student temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                        break;
                }
            }

    }


    public static void vypisTriedu(Student arr[]){
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i].getId()+", "+arr[i].getMeno() +" "+arr[i].getPriezvisko()+", "+arr[i].getVek()+". ");
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }



}
