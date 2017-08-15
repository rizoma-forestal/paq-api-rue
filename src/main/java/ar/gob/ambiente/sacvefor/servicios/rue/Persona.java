
package ar.gob.ambiente.sacvefor.servicios.rue;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular las Personas provenientes del servicio de RUE
 * físicas o jurídicas que puedan tener vículo con el proceso de gestión
 * de productos forestales:
 * Productores, intermediarios, transportistas, gestores, exportadores, etc.
 * @author rincostante
 */

@XmlRootElement
public class Persona implements Serializable {

    private Long id;
    /**
     * Id de la Provincia que carga, obtenida del Servicio territorial
     */
    private Long idProvinciaGt;
    /**
     * Nombre de la Provincia de origen de la carga.
     */
    private String provinciaGestion;
    private TipoPersona tipo;    
    private TipoSociedad tipoSociedad;     
    private TipoEntidad entidad; 
    
    /**
     * En los casos de las razones sociales será el domicilio legal, en el caso de 
     * productores y titulares que sean personas físicas, será su domicilio real,
     * en el caso de choferes, por ejemplo, no será necesario domicilio alguno.
     */
    private Domicilio domicilio;
    private String nombreCompleto;  
    private String razonSocial;   
    private Long cuit;
    private String correoElectronico;       
    private Date fechaAlta; 
    
    /******************
     * Constructores **
     ******************/    
    public Persona() {
        this.id = Long.valueOf(0);
        this.idProvinciaGt = Long.valueOf(0);
        this.provinciaGestion = "default";
        this.tipo = TipoPersona.FISICA;
        this.tipoSociedad = new TipoSociedad();
        this.domicilio = new Domicilio();
        this.nombreCompleto = "default";
        this.razonSocial = "default";
        this.cuit = Long.valueOf(0);
        this.correoElectronico = "default";
        this.fechaAlta = new Date();
    }    
    
    public Persona(Long id, Long idProvinciaGt, String provinciaGestion, TipoPersona tipo, TipoSociedad tipoSociedad, 
            Domicilio domicilio, String nombreCompleto, String razonSocial, Long cuit, String correoElectronico, Date fechaAlta) {
        this.id = id;
        this.idProvinciaGt = idProvinciaGt;
        this.provinciaGestion = provinciaGestion;
        this.tipo = tipo;
        this.tipoSociedad = tipoSociedad;
        this.domicilio = domicilio;
        this.nombreCompleto = nombreCompleto;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.correoElectronico = correoElectronico;
        this.fechaAlta = fechaAlta;
    }      
      
    /**********************
     * Métodos de acceso **
     **********************/  
    public Long getIdProvinciaGt() {
        return idProvinciaGt;
    }
    
    public void setIdProvinciaGt(Long idProvinciaGt) {
        this.idProvinciaGt = idProvinciaGt;
    }

    public TipoPersona getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getProvinciaGestion() {
        return provinciaGestion;
    }

    public void setProvinciaGestion(String provinciaGestion) {
        this.provinciaGestion = provinciaGestion;
    }

    public TipoSociedad getTipoSociedad() {
        return tipoSociedad;
    }

    public void setTipoSociedad(TipoSociedad tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }

    public TipoEntidad getEntidad() {
        return entidad;
    }

    public void setEntidad(TipoEntidad entidad) {
        this.entidad = entidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" provinciaGestion: ").append(provinciaGestion).
                append(" tipo: ").append(tipo.getNombre()).
                append(" tipoSociedad: ").append(tipoSociedad.getNombre()).
                append(" entidad: ").append(entidad.getNombre()).
                append(" domicilioCalle: ").append(domicilio.getCalle()).
                append(" domicilioNuemero: ").append(domicilio.getNumero()).
                append(" domicilioDepto: ").append(domicilio.getDepto()).
                append(" domicilioPiso: ").append(domicilio.getPiso()).
                append(" domicilioLocalidad: ").append(domicilio.getLocalidad()).
                append(" domicilioDepartamento: ").append(domicilio.getDepartamento()).
                append(" domicilioProvincia: ").append(domicilio.getProvincia()).
                append(" nombreCompleto: ").append(nombreCompleto).
                append(" razonSocial: ").append(razonSocial).
                append(" cuit: ").append(cuit).
                append(" correoElectronico: ").append(correoElectronico).
                append(" fechaAlta: ").append(fechaAlta).toString();
    }
    
}
