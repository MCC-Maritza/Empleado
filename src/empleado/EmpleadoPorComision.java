package empleado;

/**
 *
 * @author maryse
 */
// Fig. 9.4: EmpleadoPorComision.java
// La clase EmpleadoPorComision representa a un empleado por comisión.
public class EmpleadoPorComision extends Object {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas semanales totales
    private double tarifaComision; // porcentaje de comisión
// constructor con cinco argumentos

    public EmpleadoPorComision(String nombre, String apellido, String nss,
            double ventas, double tarifa) {
// la llamada implícita al constructor del objeto ocurre aquí
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas); // valida y almacena las ventas brutas
        establecerTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    } // ﬁn del constructor de EmpleadoPorComision con cinco argumentos
// establece el primer nombre

    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    } // ﬁn del método establecerPrimerNombre
// devuelve el primer nombre

    public String obtenerPrimerNombre() {
        return primerNombre;
    } // ﬁn del método obtenerPrimerNombre
// establece el apellido paterno

    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    } // ﬁn del método establecerApellidoPaterno
// devuelve el apellido paterno

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    } // ﬁn del método obtenerApellidoPaterno
// establece el número de seguro social

    public void establecerNumeroSeguroSocial(String nss) {
        numeroSeguroSocial = nss; // debe validar
    } // ﬁn del método establecerNumeroSeguroSocial
// devuelve el número de seguro social

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    } // ﬁn del método obtenerNumeroSeguroSocial
// establece el monto de ventas totales del empleado por comisión

    public void establecerVentasBrutas(double ventas) {
        ventasBrutas = (ventas < 0.0) ? 0.0 : ventas;
    } // ﬁn del método establecerVentasBrutas
// devuelve el monto de ventas totales del empleado por comisión

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    } // ﬁn del método obtenerVentasBrutas
// establece la tarifa del empleado por comisión

    public void establecerTarifaComision(double tarifa) {
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
    } // ﬁn del método establecerTarifaComision
// devuelve la tarifa del empleado por comisión

    public double obtenerTarifaComision() {
        return tarifaComision;
    } // ﬁn del método obtenerTarifaComision
// calcula el salario del empleado por comisión

    public double ingresos() {
        return tarifaComision * ventasBrutas;
    } // ﬁn del método ingresos
// devuelve representación String del objeto EmpleadoPorComision

    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "empleado por comision", primerNombre, apellidoPaterno,
                "numero de seguro social", numeroSeguroSocial,
                "ventas brutas", ventasBrutas,
                "tarifa de comision", tarifaComision);
    } // ﬁn del método toString
} // ﬁn de la clase EmpleadoPorComision
