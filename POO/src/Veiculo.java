public class Veiculo {
    String cor;
    String modelo;
    int capacidadeLitros;

    Veiculo() {

    }
    
    Veiculo(String cor, String modelo, int capacidadeLitros) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeLitros = capacidadeLitros; 
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    int getCapacidadeLitros(){
        return capacidadeLitros;
    }

    double valorTanque (double valorCombustivel) {
        return capacidadeLitros * valorCombustivel;
    }
}
