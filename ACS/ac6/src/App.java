import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String nomeArq = "C:\\Users\\BADU\\Desktop\\gith\\ibmec_progoo\\ACS\\ac6\\src\\alunos.txt";
        File arq = new File(nomeArq);
        Scanner opcao = new Scanner(System.in);

        StringBuilder conteudo = new StringBuilder(); // Arquivo inicial case 1 e 3
        StringBuilder novoConteudo = new StringBuilder(); // Arquivo para editar case 2 e 4
        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Incluir lista");
            System.out.println("2. Remover da lista");
            System.out.println("3. Ver lista");
            System.out.println("4. Editar");
            System.out.println("5. Sair");

            int escolha = opcao.nextInt();
            opcao.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = opcao.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = opcao.nextInt();
                    opcao.nextLine();
                    System.out.print("Curso: ");
                    String curso = opcao.nextLine();

                    conteudo.append(nome).append(" ").append(matricula).append(" ").append(curso).append("\n");

                    try (FileWriter fileWriter = new FileWriter(arq, true);
                            BufferedWriter writer = new BufferedWriter(fileWriter)) {

                        writer.write(conteudo.toString());
                        System.out.println("Aluno adicionado ao arquivo.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.print("Digite a matrícula do aluno que deseja remover: ");
                    int matriculaRemover = opcao.nextInt();
                    opcao.nextLine();

                    try (BufferedReader reader = new BufferedReader(new FileReader(arq))) {
                        String linha;
                        while ((linha = reader.readLine()) != null) {
                            if (!linha.contains(" " + matriculaRemover + " ")) {

                                novoConteudo.append(linha).append("\n");
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    conteudo = novoConteudo;

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arq))) {
                        writer.write(conteudo.toString());
                        System.out.println("Aluno removido do arquivo.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try (BufferedReader reader = new BufferedReader(new FileReader(arq))) {
                        String linha;
                        while ((linha = reader.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    System.out.print("Digite a matrícula do aluno que deseja editar: ");
                    int matriculaEditar = opcao.nextInt();
                    opcao.nextLine(); // Consumir a nova linha deixada pelo nextInt

                    try (BufferedReader reader = new BufferedReader(new FileReader(arq))) {
                        String linha;
                        while ((linha = reader.readLine()) != null) {
                            if (linha.contains(" " + matriculaEditar + " ")) {

                                System.out.print("Novo nome: ");
                                String novoNome = opcao.nextLine();
                                System.out.print("Nova matrícula: ");
                                int novaMatricula = opcao.nextInt();
                                opcao.nextLine();
                                System.out.print("Novo curso: ");
                                String novoCurso = opcao.nextLine();

                                linha = novoNome + " " + novaMatricula + " " + novoCurso;
                            }
                            novoConteudo.append(linha).append("\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    conteudo = novoConteudo;

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arq))) {
                        writer.write(conteudo.toString());
                        System.out.println("Informações do aluno editadas.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    opcao.close();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arq))) {
                        writer.write(conteudo.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;

                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }
}
