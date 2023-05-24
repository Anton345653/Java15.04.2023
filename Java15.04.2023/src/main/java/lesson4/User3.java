package lesson4;

public class User3 {
    private static String login;
    private static String password;

    public User3(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        User3.Query query = new User3.Query();
        query.printToLog();
    }

    public static class Query {
        public void printToLog() {
            System.out.println("пользователь с логином " + login + " и паролем " + password);
        }
    }

    public static void main(String[] args) {
        User3 user3 = new User3("Oleg", "ytuh");
        user3.createQuery();
        User3.Query query = new User3.Query();
        query.printToLog();
    }
}
