void main() {
    double litros = 0;
    double valor = 0;
    IO.println("bem vindo ao posto de gasolina, informe sua opção");
    IO.println(String.format("A - alcool %n B - alcool"));
    String tipo =IO.readln();
    switch (tipo){
        case "A":
            IO.println("informe quantos litros de alcool o senhor deseja");
            litros=Double.parseDouble(IO.readln());
            if (litros<20){
                valor = ((litros*2.89) * 0.97);
            }else if(litros>20){
                valor = ((litros*2.89) * 0.95);
            }
            break;
        case "B":
            IO.println("informe quantos litros de gasolina voce deseja");
            litros=Double.parseDouble(IO.readln());
            if (litros<20){
                valor = ((litros*4.95) * 0.96);
            }else if(litros>20){
                valor = ((litros*4.95) * 0.94);
            }
        break;
    }
    IO.println("o preço sera " + valor);



}