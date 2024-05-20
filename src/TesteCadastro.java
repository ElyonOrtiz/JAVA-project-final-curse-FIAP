import java.util.Calendar;


public class TesteCadastro {
    public static void main(String[] args) {
        //Instancia o DAO
        ColaboradorDAO dao = new ColaboradorDAO();

        //Instancia o Colaborador
        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Pedro");
        colaborador.setEmail("pedro@fiap.com.br");
        colaborador.setSalario(5000);
        colaborador.setDataContratacao(Calendar.getInstance());

        //Cadastra no banco de dados
        dao.cadastrar(colaborador);

        System.out.println("Cadastrado!");
    }

}