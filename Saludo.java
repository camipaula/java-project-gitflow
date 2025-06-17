public class Saludo {
    public String generarSaludo(String nombre) {
        if (nombre == null | | nombre. isEmpty() ) {
        return "iHola, Invitado!";
        }
        return "iHola, " + nombre + "!";
}