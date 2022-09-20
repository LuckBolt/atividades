package calculadora;

		import java.io.PrintStream;
		import java.util.Arrays;
		import java.util.Scanner;

		public class att1 {

		    private static final Scanner entrada = new Scanner(System.in);
		    private static final PrintStream saida = System.out;

		    public static void main(String[] args) {
		        try {
		            calculadora programa = new calculadora();
		            programa.executar();
		        } catch (Throwable t) {
		            t.printStackTrace();
		        }
		    }

		    @SuppressWarnings("unused")
			private void executar() {
		        Operacao operacao = null;
		        while (operacao == null) {
		            saida.print("Digite a operação desejada " + Arrays.toString(Operacao.operadores()) + ": ");
		            String operador = entrada.nextLine();
		            operacao = Operacao.porOperador(operador);
		            if (operacao == null) {
		                saida.println("Operação inválida, Tente novamente!");
		            }
		        }
		        saida.println("Digite um valor: ");
		        double n1 = Double.parseDouble(entrada.nextLine());
		        saida.println("Digite um valor: ");
		        double n2 = Double.parseDouble(entrada.nextLine());

		        double resultado = operacao.executar(n1, n2);
		        saida.println("O resultado da " + operacao.nome + " é: " + resultado);
		    }
		}
	
