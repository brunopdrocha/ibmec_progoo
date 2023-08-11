package RevisaoLinguagemJava;
public class App{
 
    public static void main(String[] args)throws Exception {
        /*
        Este eh um comentario 
        de bloco. Posso escrever varias linhas
        */
        System.out.println("Hello World");

        // Tipo de Dados 
        // <tipoVar> ,nomeVar> = <valor>
        String nome = "Pedrocha";

        //Inteiro
        byte a=50;                 //8 bits --> 128 a 127
        short b=15750;                //16 bits --> 32.768 A 32.767
        int c=10500000;                  //32 bits --> Padrao
        long d=156000000;                 //64 bits

        //Decimais
            float e = 4.87f;    // 32 bits
            double f = -105.48; // 64 bits --> Padrao

        //booleano -->1 bit
        boolean teste = true;
        boolean outroTeste= false;


        //texto

        char letra = 'a' ; //uso de aspas simples. Ocupa 2 Bits e usa UNICODE
        String outroNome = "Pedrocha"; //Uso de aspas duplas ; N eh um tipo de dado primitivo!

        //Type Casting
        f=(double) b;
        System.out.println(e);
        c= (int) e;
        System.out.println(c);
        System.out.println(e);

        //Operadors

        //Aritmeticos
        float x=10;
        float y=5;
        float z=-3;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        //Atribuicao
        x+=2; // h= h + 2
        z-=1.5; // z - 1.5

        System.out.println("------------------");
        System.out.println(x);
        System.out.println(x++); //Uso da variavel e depois Incremto do valor x
        System.out.println(x);
        System.out.println(++x); //Uso do incremento e depois a varivel

        c= 2;
        int w = ++c;
         System.out.println(w);
        
        w = c--;
         System.out.println(w);

        //Comparacao
        System.out.println("------------------");
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x>y);        
        System.out.println(x<y);

        //logicos
          System.out.println("------------------");
        System.out.println(!false);         //NOT
        System.out.println(true && false);  //AND
        System.out.println(true||false);    //OR
        

        //Estruturas de decisao
        
        //if-else
        System.out.println("-=-=-=-=-=--=-=-=-=");
        int idade = 19;
        
        if (idade >18){
            System.out.println("Voce eh maior de idade");
        
        }else if (idade <0){
            System.out.println("Idade invalida");

        }else{
            System.out.println("Voce eh menor de idade");
        }

        //Nao eh boa Pratica
        if (idade >18);
            System.out.println("Voce eh maior de idade");

       //Switch 
       System.out.println("-=-=-=-=-=--=-=-=-=");
       String opcao ="c";
    
       switch (opcao){
        case "a":
            System.out.println("Opcao A");
            break;
        case "b":
            System.out.println("Opcao B");
            break;
           
        case "c":
            System.out.println("Opcao C");
            break;    

        default :
            System.out.println("Valor invalido");
        }

        //Estrutura de Repeticao
        //for 

        for (int i=0;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        int i ;

        for (i=0;i<=5;i++){
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        
        for(i=0;i<10;i++){
            i++;
            if(i==3){
                continue; //Interrompe a interacao

            }
            if(i==5){
                break; //Interrompe o for
            }  
        }
    
        //while

        while(i>0){
            System.out.println(i--);
        }
       }

    }
    
    
    