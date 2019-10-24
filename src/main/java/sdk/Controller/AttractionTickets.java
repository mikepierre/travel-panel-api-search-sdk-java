public class AttractionTickets{

    /**
     * Get YAML File
     * @param service - Get the yaml service file you are trying to call
     * @return Response Object
     */
    private Map<String, Object> getYaml()
    {
        Yaml yaml = new Yaml();
        InputStream inputStream = (InputStream) 
        this.getClass().getClassLoader().
        getResourceAsStream("../Controller/app.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
        
        return obj;
    }
}