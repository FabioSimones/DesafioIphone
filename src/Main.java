import entidades.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("(48) 99475-5842");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://web.dio.me");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.selecionarMusica("Iron Maiden - Blood Brothers");
        iphone.tocar();
        iphone.pausar();
    }
}
