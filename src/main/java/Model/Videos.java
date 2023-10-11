package Model;

public class Videos {
    int id;
    String name, videoText, context;

    public Videos(){
        super();
    }

    public Videos(int id, String name, String videoText, String context) {
        this.id = id;
        this.name = name;
        this.videoText = videoText;
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoText() {
        return videoText;
    }

    public void setVideoText(String videoText) {
        this.videoText = videoText;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
