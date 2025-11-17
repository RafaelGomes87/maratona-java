package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebica = idade >= 18;
        // !

        if (isAutorizadoComprarBebica) {
                 System.out.println("Autorizado a comprar bebida alcólica");
            }else{
                System.out.println("Não Autorizado a comprar bebida alcólica");

        }

        if(!isAutorizadoComprarBebica){  // por ser assim if(isAutorizadoComprarBebica == false)
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
            System.out.println("Fora do if");
    }
}
