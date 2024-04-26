import java.util.HashMap;

public record Moneda(
        String result,
        String documentation,
        String terms_of_use,
        double time_last_update_unix,
        String time_last_update_utc,
        double time_next_update_unix,
        String time_next_update_utc,
        String base_code,
        HashMap<String, Double> conversion_rates) {
}
