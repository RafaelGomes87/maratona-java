package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[]args) {
        // Doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou dor 500 pro DevDojo";
        String mensagemNaoDoar = " Ainda não tenho condições,mas vou ter!";
        //(condição) ? verdadeiro : falso   Operador ternário

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
