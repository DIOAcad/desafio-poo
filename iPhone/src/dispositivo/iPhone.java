package dispositivo;

//Classe iPhone implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public static void main(String[] args) {
		// Criando uma inst�ncia de iPhone
		iPhone meuIPhone = new iPhone();

		// Testando funcionalidades do Reprodutor Musical
		meuIPhone.selecionarMusica("Imagine - John Lennon");
		meuIPhone.tocar();
		meuIPhone.pausar();

		// Testando funcionalidades do Aparelho Telef�nico
		meuIPhone.ligar("123-456-7890");
		meuIPhone.atender();
		meuIPhone.iniciarCorreioVoz();

		// Testando funcionalidades do Navegador na Internet
		meuIPhone.exibirPagina("www.exemplo.com");
		meuIPhone.adicionarNovaAba();
		meuIPhone.atualizarPagina();
	}

	// Implementa��o dos m�todos de IReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Reproduzindo m�sica...");
	}

	@Override
	public void pausar() {
		System.out.println("M�sica pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("M�sica selecionada: " + musica);
	}

	// Implementa��o dos m�todos de IAparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}

	// Implementa��o dos m�todos de INavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo p�gina: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("P�gina atualizada.");
	}
}