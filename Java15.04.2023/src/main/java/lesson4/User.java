package lesson4;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("пользователь с логином " + login + " и паролем " + password);
        }
    }

    public static void main(String[] args) {
        User user = new User("Oleg", "ytuh");
        user.createQuery();
        Query query = new User("Egor", "678").new Query();
        query.printToLog();
    }
}
