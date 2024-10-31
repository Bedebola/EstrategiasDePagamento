import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();

        int opcaoPagamento;
        double meuCarrinho = 150.00;

        System.out.println("Sua compra totalizou o valor de R$ "+meuCarrinho+" por favor, selecione o método de pagamento: ");
        System.out.println("1-Cartão\n"+
                           "2-Boleto\n"+
                           "3-PIX\n");
        opcaoPagamento = scan.nextInt();

        switch (opcaoPagamento){
            case 1:
                novoCarrinho.setEstrategiaPagamento(new PagamentoCartao());
                novoCarrinho.finalizarCompra(meuCarrinho);
                break;
            case 2:
                novoCarrinho.setEstrategiaPagamento(new PagamentoBoleto());
                novoCarrinho.finalizarCompra(meuCarrinho);
                break;
            case 3:
                novoCarrinho.setEstrategiaPagamento(new PagamentoPix());
                novoCarrinho.finalizarCompra(meuCarrinho);
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
