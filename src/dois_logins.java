void main() {
    String informe = "";
    String usuario ="";
    int senha = 0;
    IO.println("escreva o nome do usuario");
    usuario = IO.readln();
    IO.println("escreva a sua senha");
    senha = Integer.parseInt(IO.readln());
    if (usuario.equals("atila") && senha == 12345) {
        informe = "bem vindo ";

    }else if (usuario.equals("olivi") && senha == 54321){
    informe = "bem vindo";
}else{
    informe = "usuario e senha nao conferem";
    }
    IO.println(informe);
}