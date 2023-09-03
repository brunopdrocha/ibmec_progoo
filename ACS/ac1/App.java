public class App{
    public static void main(String[] args) {
        
        //1
        calcularMedia(8.0,7.0,5.0);
        calcularMedia(6.0,5.0,5.0);
        //2

        System.out.println("-=--=--=-=-=-=-=-=-=-=");
        mostrarNumeros();

        
        //3
        System.out.println("-=--=--=-=-=-=-=-=-=-=");
        ePrimo(10);
        ePrimo(7);
    
        //4
         System.out.println("-=--=--=-=-=-=-=-=-=-=");
         diaSemana(1);
         diaSemana(10);

         //5
         System.out.println("-=--=--=-=-=-=-=-=-=-=");
          eBissexto(1900);
          eBissexto(2012);  
          eBissexto(2000);
    }

    

        //Exercicio 1 
        //Faça um método que receba como parâmetros as três notas da disciplina (AP1, AP2 e AC)
        //e mostre a média. A média é calculada de acordo com a fórmula M = (AP1 + AP2) * 0.4 + AC * 0.2.
         public static double calcularMedia(double ap1,double ap2,double ac){
            double m =((ap1+ap2)*0.4+(ac*0.2));
            
        if (m >= 7) {
            System.out.println("Você foi APROVADO");
        } else {
            System.out.println("Você está de RECUPERAÇÃO");
        }
            return m;
         }
         
        
            
        
         //Exercicio 2 
         //Implemente um método que exiba todos os números de 150 a 200.
         
        public static void mostrarNumeros() {
            for (int i = 150; i <= 200; i++) {
                System.out.println(i);
        }}
         
         //Exercicio 3
         //Elabore um método ePrimo(int num) que retorna se um número num é primo ou não.
         // Caso o número não seja primo, liste todos os números pelos quais ele é divisível.

         public static void ePrimo (int num){
            int i;
           
            for (i=2;i<=num-1;i++){
                if(num % i ==0){
                    System.out.println("N eh primo");
                   return ;
                }
            }
            
           
           System.out.println("Eh primo");
           return;
         }

         //Exercicio 4
         //Implemente um método que receba como parâmetro um número 
         //inteiro e exiba o dia correspondente da semana (1-Domingo, 2- Segunda, etc.),
         // se digitar outro valor deve aparecer o texto “valor inválido”.
        

         public static void diaSemana(int opcao){

            switch (opcao){
                case 1:
                    System.out.print("Domingo");
                    break;
                case 2:
                    System.out.print("Segunda");
                    break;
                case 3:
                    System.out.print("Terca");
                    break;  
                case 4:
                    System.out.print("Quarta");
                    break;  
                case 5:
                    System.out.print("Quinta");
                    break;
                case 6:
                    System.out.print("Sexta");
                    break;
                case 7:
                    System.out.print("Sabado");
                    break;
                default:
                    System.out.println("Valor invalido");
            }
        }
            //Exercicio 5
            //Elabore um método eBissexto(int ano) 
            //que receba como parâmetro um número correspondente 
            //a um determinado ano e em seguida informe se este ano é ou não bissexto.
            // Um ano é bissexto se ele é múltiplo de quatro. No entanto anos múltiplos de 
            //100 que não são múltiplos de 400 não são bissextos. Então 1995 não é bissexto, 
            //2012 é bissexto, 1900 não é bissexto e 2000 é bissexto.

          public static void eBissexto(int ano) {
            int c1, c2, c3;
            c1 = ano % 4;
            c2 = ano % 100;
            c3 = ano % 400;

        if (c1 > 0) {
            System.out.println("O ano não é bissexto.");
        } else if ((c2 == 0 && c3 == 0) ) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }      
    }    


    }//Final do codigo


