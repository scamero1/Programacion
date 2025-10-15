class Carro extends Vehiculo {
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() - 10);
    }
}