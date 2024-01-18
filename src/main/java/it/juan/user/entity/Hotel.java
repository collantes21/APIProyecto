package it.juan.user.entity;




import javax.persistence.*;


@Entity
@Table(name="Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idHotel")
    private int idHotel;


    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="categoria")
    private String categoria;

    @Column(name="tiene_piscina")
    private boolean tiene_piscina;

    @Column(name="localidad")
    private String localidad;


    public Hotel() {
    }

    public Hotel(int idHotel, String nombre, String descripcion, String categoria, boolean tiene_piscina, String localidad) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.tiene_piscina = tiene_piscina;
        this.localidad = localidad;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isTiene_piscina() {
        return tiene_piscina;
    }

    public void setTiene_piscina(boolean tiene_piscina) {
        this.tiene_piscina = tiene_piscina;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}