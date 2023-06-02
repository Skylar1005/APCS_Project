public class Champion {
    public String champion;
    public String gender;
    public String position;
    public String species;
    public String resource;
    public String rangetype;
    public String region;
    public int releaseyear;
    public Champion(String champion, String gender, String position, String species, String resource, String rangetype, String region, int releaseyear){
        this.champion = champion;
        this.gender = gender;
        this.position = position;
        this.species = species;
        this.resource = resource;
        this.rangetype = rangetype;
        this.region = region;
        this.releaseyear = releaseyear;
    }
    public String getChampion(){
        return champion;
    }
}
