class Vehiculo {
    private String marca;
    private int combustible;
    private int velocidad;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.combustible = 100;
        this.velocidad = 0;
    }

    public void acelerar() {
        this.velocidad += 10;
        this.combustible -= 5;
    }

    public void frenar() {
        this.velocidad -= 10;
        if (this.velocidad <= 0) {
            this.velocidad = 0;
        }
    }

    public void recargar() {
        this.combustible = 100;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getCombustible() {
        return this.combustible;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setCombustible(int nuevaCombustible) {
        this.combustible = nuevaCombustible;
    }

    public void setVelocidad(int nuevaVel) {
        this.velocidad = nuevaVel;
    }

    @Override
    public String toString() {
        return "El vehiculo de marca " + this.marca + " va a " + this.velocidad + "km/h, y le quedan " + this.combustible + " unidades de gasolina.";
    }
}