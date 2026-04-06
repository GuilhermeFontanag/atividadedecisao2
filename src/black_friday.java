void main() {
    double valor = 0;
    double todo = 0 ;
    int codigo;
    IO.println("informe o valor");
    valor = Double.parseDouble(IO.readln());
    IO.println("informe o metodo de pagamento");
    IO.println("1 - a vista (em especie)  10% off");
    IO.println("2 - cartao de debito  5% off");
    IO.println("3 - cartao de credito  3% off");
    IO.println("4 - pix  7,5% off");
    codigo = Integer.parseInt(IO.readln());
        switch (codigo){
            case 1:
            todo = (valor * 0.90);
            break;

            case 2:
            todo = (valor * 0.95);
            break;

            case 3:
            todo = (valor * 0.97);
            break;

            case 4:
            todo = (valor * 0.925);
            break;

            default:
            IO.print("codigo invalido");
            return;
    }
 IO.println("o valor total é " + todo);
}