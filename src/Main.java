public class Main {
    public static void main(String[] args) {
        
        Sistema.executar();

        String[] tecnologiasJoao = {"Java", "Amonguas"};
        Desenvolvedor joao = new Desenvolvedor("João", 123, 40, 50.0f, tecnologiasJoao);

        System.out.println(joao.toString());


    }
}
