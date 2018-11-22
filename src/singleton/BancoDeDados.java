package singleton;

public class BancoDeDados {
	private static BancoDeDados instance;

	private BancoDeDados() {

	}

	public static BancoDeDados getInstance() {
		if (instance == null) {

			/*
			 * A palavra reservada synchronized permite que somente um processo por vez acesse o trecho de código dentro do bloco, ocorrendo um controle
			 * maior quando há presença de Threads no sistema. Isso evitaria ter dois bancos instanciados e problemas no sistema.
			 */
			synchronized (BancoDeDados.class) {
				instance = new BancoDeDados();
				System.out.println("Instância do banco criada!");
			}

		}

		return instance;
	}

}
