public class CarrinhoDeCompras {

    private Pagamento estrategiaPagamento;

    public void setEstrategiaPagamento(Pagamento estrategia) {
        this.estrategiaPagamento = estrategia;
    }

    public void finalizarCompra(double valor) {
        if (estrategiaPagamento != null) {
            estrategiaPagamento.realizarPagamento(valor);
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
