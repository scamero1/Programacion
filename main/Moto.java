class Moto extends Vehiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        if (getVelocidad() > 120) {
            setVelocidad(120);
        }
    }
}