package academy.devdojo.maratonajava.introducao;
// casting forca a variavel
public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short long, boolean
        int idade = (int) 10000000000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salarioFlout = (float)2500.0D;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0058';

        String nome = "Rafael Gomes ";

        System.out.println("A idade é de"+nome+ "é " +idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(salarioFlout);

    }
}
