package uz.doniyorbek7376.moviecatalogservice.models;

public class CatalogItem {
    private String name;
    private String description;
    private Integer rating;

    public CatalogItem(String name, String description, Integer rating) {
        this.setName(name);
        this.setDescription(description);
        this.setRating(rating);
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
