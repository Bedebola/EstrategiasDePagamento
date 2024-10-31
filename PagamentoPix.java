public class PagamentoPix implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("-------------- NOTA FISCAL ------------------\n");
        System.out.println("Total ----------------------------------- R$150");
        System.out.println("Forma de Pagamento ------------------------ PIX\n\n");
    }
}

