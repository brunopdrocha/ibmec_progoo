package ac2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        
        //declaracao de variaveis
        double x,y,z;
        int opcao = 1;

        //leitor de dados
        Scanner leitor = new Scanner(System.in);
        
        
        do {
            //leitura do primeiro numero
            System.out.println("Digite o primeiro numero");
            x=leitor.nextDouble();
            
            while(opcao!=0){

                //Informacao ao usuario
                System.out.println("1=Soma");
                System.out.println("2=Subtrair");
                System.out.println("3=Multiplicar");
                System.out.println("4=Dividir");
                System.out.println("5=Limpar memoria");
                System.out.println("0=Sair da Calculadora");
            
         
            opcao = leitor.nextInt();
           
            //funcao soma
            if (opcao==1){
                System.out.println("Digite o segundo numero");
                y=leitor.nextDouble();
                z=Soma(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }
        
            //funcao subtrair
            
            if(opcao==2){
            
                System.out.println("Digite o segundo numero");
                y=leitor.nextDouble();
                z=Subtrair(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }

            //funcao multiplicar

            if(opcao==3){
                System.out.println("Digite o segundo numero");
                y=leitor.nextDouble();    
                z=Multiplicar(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }

            //funcao dividir

            if(opcao==4){

                System.out.println("Digite o segundo numero");
                y=leitor.nextDouble();    
                z=Dividir(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }

            //funcao limpar memoria

            if(opcao==5){
                x=0;
                System.out.println("Numero apagado da memoria");
                System.out.println(x);
                break;
            
            }
        

        
        }

        } while(opcao != 0);//fim do loop
        
        leitor.close();
    } // Código main
    
    public static double Soma(double valor1, double valor2) {
        return valor1 + valor2;
    }
    
    public static double Subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }
    
    public static double Dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }
    
    public static double Multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }
}
