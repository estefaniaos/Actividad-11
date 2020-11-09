package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Square s = new Square();
        s.setAttributes(5);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());*/
        boolean activeMenu = true, unanswered = true;
        Scanner write = new Scanner(System.in);
        int option, choice;

        while (activeMenu){
            System.out.println("Selecciona la figura que deseas");
            System.out.println("1) Cuadrado      2) Círculo      3)Triángulo");
            option = write.nextInt();

            switch (option){
                case 1:
                    double side;
                    Square s = new Square();
                    System.out.println("Ingresa la medida del lado");
                    side = write.nextDouble();
                    s.setAttributes(side);
                    while (unanswered){
                        System.out.println("¿Qué dato deseas saber? 1) Area    2)Perimetro");
                        choice = write.nextInt();
                        if(choice == 1){
                            System.out.println("Area del cuadrado: " + s.getArea());
                            unanswered = false;
                        }else if(choice == 2){
                            System.out.println("Perimetro del cuadrado: " + s.getPerimeter());
                            unanswered = false;
                        }else{
                            System.out.println("Ingresa una opción válida");
                        }
                    }
                    activeMenu = false;
                    break;
                case 2:
                    double radius;
                    Circle c = new Circle();
                    System.out.println("Ingresa la medida del radio");
                    radius = write.nextDouble();
                    c.setAttributes(radius);
                    while (unanswered){
                        System.out.println("¿Qué dato deseas saber? 1) Area    2)Perimetro");
                        choice = write.nextInt();
                        if(choice == 1){
                            System.out.println("Area del circulo: " + c.getArea());
                            unanswered = false;
                        }else if(choice == 2){
                            System.out.println("Perimetro del circulo: " + c.getPerimeter());
                            unanswered = false;
                        }else{
                            System.out.println("Ingresa una opción válida");
                        }
                    }
                    activeMenu = false;
                    break;
                case 3:
                    double base, height;
                    double sides[] = new double[3];
                    Triangle t = new Triangle();

                    while (unanswered){
                        System.out.println("¿Qué dato deseas saber? 1) Area    2)Perimetro");
                        choice = write.nextInt();
                        if(choice == 1){
                            System.out.println("Ingresa la medida de la base:");
                            base = write.nextDouble();
                            System.out.println("Ingresa la altura:");
                            height = write.nextDouble();
                            t.setAreaAttributes(base, height);
                            System.out.println("Area del triángulo: " + t.getArea());
                            unanswered = false;
                        }else if(choice == 2){
                            for (int i = 0; i < 3; i++) {
                                System.out.println("Ingresa la medida del lado " + (i+1) + ":");
                                sides[i] = write.nextDouble();
                            }
                            t.setPerimeterAttributes(sides);
                            System.out.println("Perimetro del triángulo: " + t.getPerimeter());
                            unanswered = false;
                        }else{
                            System.out.println("Ingresa una opción válida");
                        }
                    }
                    activeMenu = false;
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;



            }

        }
    }


}
