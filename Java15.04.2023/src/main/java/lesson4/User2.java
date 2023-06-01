package lesson4;

public class User2 {
    private String login;
    private String password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("пользователь с логином " + login + " и паролем " + password);
            }
        }
        Query query = new Query();
        query.printToLog();

    }

    public static void main(String[] args) {
        User2 user2 = new User2("Oleg", "ytuh");
        user2.createQuery();


    }

}

