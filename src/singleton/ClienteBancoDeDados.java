package singleton;

public class ClienteBancoDeDados {

	public static void main(String[] args) {
		BancoDeDados bd = BancoDeDados.getInstance(); //Exibir� a mensagem de banco criado.
		
		BancoDeDados bdNovo = BancoDeDados.getInstance(); //N�o exibir� a mensagem de banco criado pois j� h� uma inst�ncia anterior.
	}

}
