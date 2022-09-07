public enum Sexo {
    M("Masculino"), F("Feminino");

    private String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String printSexo() {
        return this.sexo;
    }

}
