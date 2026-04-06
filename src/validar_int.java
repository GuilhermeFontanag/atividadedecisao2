void main() {
    String informe = "";
    int var;
    IO.println("digite a variavel String");
    var = Integer.parseInt(IO.readln());
    String num = Integer.toString(var);
    if (num.trim().isEmpty()){
        informe = "dado invalido";
    }else{
        informe = String.valueOf(var);
    }

    IO.println("o valor informado " + informe);
}