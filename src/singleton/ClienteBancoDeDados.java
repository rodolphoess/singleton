package singleton;

public class ClienteBancoDeDados {

	public static void main(String[] args) {
		BancoDeDados bd = BancoDeDados.getInstance(); //Exibirá a mensagem de banco criado.
		
		BancoDeDados bdNovo = BancoDeDados.getInstance(); //Não exibirá a mensagem de banco criado pois já há uma instância anterior.
	}

}
