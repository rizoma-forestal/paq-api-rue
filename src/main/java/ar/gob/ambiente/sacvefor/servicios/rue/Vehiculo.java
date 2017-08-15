
package ar.gob.ambiente.sacvefor.servicios.rue;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Vehículos provenientes del servicio de RUE
 * @author rincostante
 */
@XmlRootElement
public class Vehiculo implements Serializable {

    private Long id;
    private String matricula;    
    private Modelo modelo; 
    private int anio;    
    private Date fechaAlta;
    private Long idTitular;
    /**
     * Id de la Provincia que carga, obtenida del Servicio territorial
     */
    private Long idProvinciaGt;    
    /**
     * Nombre de la provincia cacheado del servicio gestion territorial.
     */
    private String provinciaGestion;
    
    /**
     * Titular del Vehículo
     */
    private Persona empresa;
    
    /******************
     * Constructores **
     ******************/
    public Vehiculo(){
        this.id = Long.valueOf(0);
        this.matricula = "default";
        this.modelo = new Modelo();
        this.anio = 0;
        this.idTitular = Long.valueOf(0);
        this.fechaAlta = new Date();
        this.provinciaGestion = "default";
        this.idProvinciaGt = Long.valueOf(0);
        this.empresa = new Persona();
    }
    
    public Vehiculo(Long id, String matricula, Modelo modelo, int anio, Long idTitular, Date fechaAlta, String provinciaGestion, Long idProvinciaGt, Persona empresa){
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.anio = anio;
        this.idTitular = idTitular;
        this.fechaAlta = fechaAlta;
        this.provinciaGestion = provinciaGestion;
        this.idProvinciaGt = idProvinciaGt;
        this.empresa = empresa;
    }    
      
    /**********************
     * Métodos de acceso **
     **********************/  
    public Persona getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Persona empresa) {
        this.empresa = empresa;
    }

    public Long getIdProvinciaGt() {
        return idProvinciaGt;
    }
  
    public void setIdProvinciaGt(Long idProvinciaGt) {
        this.idProvinciaGt = idProvinciaGt;
    }

    public Long getIdTitular() {
        return idTitular;
    }
  
    public void setIdTitular(Long idTitular) {
        this.idTitular = idTitular;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvinciaGestion() {
        return provinciaGestion;
    }

    public void setProvinciaGestion(String provinciaGestion) {
        this.provinciaGestion = provinciaGestion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" matricula: ").append(matricula).
                append(" modelo: ").append(modelo.getNombre()).
                append(" anio: ").append(anio).
                append(" fechaAlta: ").append(fechaAlta).
                append(" provinciaGestion: ").append(provinciaGestion).toString();
    }
    
}
