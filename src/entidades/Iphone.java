package entidades;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Chamada sendo feita para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Você atendeu a chamada recebida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Chamada não atendida a tempo, deixe sua mensagem no correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Direcionando para página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música selecionada.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música em reprodução: " + musica);
    }
}
