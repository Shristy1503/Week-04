package reflection.intermediate_level.access_andmodify_staticfield;

class Configuration {
    // Private static field
    private static String API_KEY = "ORIGINAL_KEY";

    // Method to get the API_KEY
    public static String getApiKey() {
        return API_KEY;
    }
}
