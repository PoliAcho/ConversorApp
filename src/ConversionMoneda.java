public class ConversionMoneda {

    public static double conversion(String codigoPaisDesde,
                                    double importe,
                                    String codigoPaisHasta) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.buscaMoneda(codigoPaisDesde);
        return (moneda.conversion_rates().get(codigoPaisHasta).doubleValue() * importe);
    }
}
