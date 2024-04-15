public class Task {


    String name;
    String description;
    String date;
    String priority_level;
    boolean isCompleted;

    public Task(String name, String description, String date, String priority_level) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.priority_level = priority_level;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPriority_level() {
        return priority_level;
    }

    public void setPriority_level(String priority_level) {
        this.priority_level = priority_level;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted() {
        isCompleted = true;
    }

    public void display() {
        System.out.println("name:" + name + "Description:" + description + "Date" + date + "priority level" + priority_level);
        if (isCompleted) {
            System.out.print("Is completed: YES");
        } else {
            System.out.println("is completed: NO");
        }
    }
}




