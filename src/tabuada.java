void main() {
    double num = 0;
    IO.println("informe o numero desejado");
    num = Double.parseDouble(IO.readln());
    for (double i = 1; 10 >= i; i++){
        IO.println(+ i +  " * " + num + " = " + (i*num)) ;
    }
}