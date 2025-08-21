package excecoes;

public class CodigoJaExisteException extends Exception {

    public CodigoJaExisteException(String mensagem) {
        super(mensagem);
    }
}