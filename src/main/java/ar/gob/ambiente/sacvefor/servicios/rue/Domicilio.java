
package ar.gob.ambiente.sacvefor.servicios.rue;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Domiclios de las Personas provenientes del servicio de RUE
 * Compone a la entidad Persona
 * @author rincostante
 */
@XmlRootElement
public class Domicilio implements Serializable {

    private Long id;
    /**
     * Id de la Localidad del Domicilio, obtenida del Servicio territorial
     */    
    private Long idLocalidadGt;
    private String calle;
    private String numero;
    private String piso;
    private String depto;    
    /**
     * Nombre de la localidad cacheado del servicio gestion territorial.
     */
    private String localidad;
    /**
     * Nombre del departamento cacheado del servicio gestion territorial.
     */
    private String departamento;
    /**
     * Nombre de la provincia cacheado del servicio gestion territorial.
     */
    private String provincia;     

    /******************
     * Constructores **
     ******************/     
    public Domicilio(){
        this.id = Long.valueOf(0);
        this.idLocalidadGt = Long.valueOf(0);
        this.calle = "default";
        this.numero = "default";
        this.piso = "default";
        this.depto = "default";
        this.localidad = "default";
        this.departamento = "default";
        this.provincia = "default";
    }   

    public Domicilio(Long id, Long idLocalidadGt, String calle, String numero, String piso, String depto, String localidad, 
            String departamento, String provincia){
        this.id = id;
        this.idLocalidadGt = idLocalidadGt;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.depto = depto;
        this.localidad = localidad;
        this.departamento = departamento;
        this.provincia = provincia;
    }     
         
    /**********************
     * Métodos de acceso **
     **********************/   
    public Long getIdLocalidadGt() {
        return idLocalidadGt;
    }
      
    public void setIdLocalidadGt(Long idLocalidadGt) {
        this.idLocalidadGt = idLocalidadGt;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
        if (!(object instanceof Domicilio)) {
            return false;
        }
        Domicilio other = (Domicilio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" calle: ").append(calle).
                append(" piso: ").append(piso).
                append(" depto: ").append(depto).
                append(" localidad: ").append(localidad).
                append(" departamento: ").append(departamento).
                append(" provincia: ").append(provincia).toString();
    }
    
}
