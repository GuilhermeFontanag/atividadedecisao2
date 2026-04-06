void main() {
    IO.println("informe a distancia desejada(em km)");
    String informe = "";
    double distancia = Double.parseDouble(IO.readln());
    if(distancia<200){
        informe = String.valueOf((0.50*distancia));
    }else{
        informe = String.valueOf((0.45*distancia));
    }
    IO.println("o preço da viagem sera " + informe);











}