package dispositivo;

//Classe iPhone implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public static void main(String[] args) {
		// Criando uma instância de iPhone
		iPhone meuIPhone = new iPhone();

		// Testando funcionalidades do Reprodutor Musical
		meuIPhone.selecionarMusica("Imagine - John Lennon");
		meuIPhone.tocar();
		meuIPhone.pausar();

		// Testando funcionalidades do Aparelho Telefônico
		meuIPhone.ligar("123-456-7890");
		meuIPhone.atender();
		meuIPhone.iniciarCorreioVoz();

		// Testando funcionalidades do Navegador na Internet
		meuIPhone.exibirPagina("www.exemplo.com");
		meuIPhone.adicionarNovaAba();
		meuIPhone.atualizarPagina();
	}

	// Implementação dos métodos de IReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
	}

	// Implementação dos métodos de IAparelhoTelefonico
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

	// Implementação dos métodos de INavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}
}