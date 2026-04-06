void main() {
    String informe = "";
    String var = "";
    IO.println("digite a variavel String");
    var = IO.readln();
    if (var == null || var.trim().isEmpty() ){
        informe = "dado invalido";
    }else{
    informe = String.valueOf(var);
    }
 IO.println(informe);
}