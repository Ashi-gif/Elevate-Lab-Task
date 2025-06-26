public class Users {
    private int userId;
    private String name;

    public Users(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return userId + ": " + name;
    }
}
