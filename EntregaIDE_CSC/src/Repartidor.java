public class Repartidor extends Usuario {
private String zonaReparto;
private EstadoRepartidor estado;
public Repartidor(String nombre, String email, String telefono, String
zonaReparto) {
super(nombre, email, telefono);
this.zonaReparto = zonaReparto;
this.estado = EstadoRepartidor.DISPONIBLE;
}
public EstadoRepartidor getEstado() { return estado; }
public void setEstado(EstadoRepartidor estado) { this.estado = estado; }
public boolean isDisponible() {
return this.estado == EstadoRepartidor.DISPONIBLE;
}
public String getZonaReparto() {
	return zonaReparto;
}
public void setZonaReparto(String zonaReparto) {
	this.zonaReparto = zonaReparto;
}
}