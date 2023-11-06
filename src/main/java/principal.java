import dao.PessoaDao;
import model.Pessoa;

public class principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Fernando Collor Fi da Mae");
        p.setCpf("01233367800");
        p.setEndereco("Rua Fiat Alba, 989");
        PessoaDao pdao= new PessoaDao();
        p = pdao.inserirPessoa(p);
        System.err.println("Valores Inseridos: ");
        System.err.println("ID: "+p.getId());
        System.err.println("Nome: "+p.getNome());
        System.err.println("CPF: "+p.getCpf());
        System.err.println("Endereco: "+p.getEndereco());
    }
}
