void main() {
    String informe = "";
    double u, r, i = 0;
    IO.println("bem vindo ao programa de calculo");
    String grandeza[] = {"0","1","2","3","4"};

    IO.println(String.format("CALCULO DE GRANDEZAS FISICAS %n 1. Tensão (em Volt) %n 2. Resistência (em Ohm) %n 3. Corrente (em Ampére) %n 4. Sair do programa"));

    do {
        IO.println("informe qual grandeza deseja calcular");
        String escreva = IO.readln();
            //tensao
        if (escreva.equals(grandeza[1])) {
            IO.print("informe a resistencia");
            r = Double.parseDouble(IO.readln());
            IO.print("informe a corrente ");
            i = Double.parseDouble(IO.readln());
            u = r * i;
            informe = String.valueOf(u);
            break;
               //resistencia
        } else if (escreva.equals(grandeza[2])) {
            IO.print("informe a tensao e a corrente ");
            u = Double.parseDouble(IO.readln());
            IO.print("informe a corrente ");
            i = Double.parseDouble(IO.readln());
            r = u / i;
            informe = String.valueOf(r);
            break;
               //corrente
        } else if (escreva.equals(grandeza[3])) {
            IO.print("informe a tensao ");
            u = Double.parseDouble(IO.readln());
            IO.print("informe a resistencia ");
            r = Double.parseDouble(IO.readln());
            i = u / r;
            informe = String.valueOf(i);
          break;
        //sair do programa
        } else if (escreva.equals(grandeza[4])) {
            return;

        } else {
            IO.println("opção invalida");
        }
    } while (true);
    IO.println("o resultado sera " + informe);
}




