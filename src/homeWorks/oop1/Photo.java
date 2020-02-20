package homeWorks.oop1;

public class Photo {
    private String name;

    public Photo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Photo: \n" + "Имя: " + name;
    }
}
