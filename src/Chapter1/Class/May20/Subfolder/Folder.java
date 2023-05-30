package Chapter1.Class.May20.Subfolder;

public class Folder {
    public  String name;
    public Folder subfolder;

    public Folder(String name, Folder subfolder) {
        this.name = name;
        this.subfolder = subfolder;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subfolder=" + subfolder +
                '}';
    }
}
