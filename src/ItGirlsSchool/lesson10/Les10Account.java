package ItGirlsSchool.lesson10;
import java.util.HashMap;

public class Les10Account {
    String login;
    String password;
    String passwordConfirm;
    HashMap<String, String> map = new HashMap<>();

    public Les10Account(String login, String password, String passwordConfirm) {
        this.login = checkLogin(login);
        this.password = checkPassword(password, passwordConfirm);
        map.put(login, password);
    }

    public String checkLogin(String log) {
        try {
            if (log != null && log.length() > 5 && log.length() < 20) {
                System.out.println("password for login is ok");
            } else {
                throw new WrongLoginException();
            }
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException catched " + e);
        }
        return log;
    }

    public String checkPassword(String pasw, String paswConfirm) {
        try {
            if (pasw != null && pasw.length() > 8 && pasw.length() < 20 && pasw.equals(paswConfirm)) {
                System.out.println("password  is ok");
            } else {
                throw new WrongLPasswordException();
            }
        } catch (WrongLPasswordException e) {
            System.out.println("WrongPasswordException catched " + e);
        }
        return pasw;
    }

    public String checkLoginAndPassword(String log, String pass) {
        try {
            if (map.containsKey(log)) {
                System.out.println("login as key exists in map");
            } else {
                throw new WrongLoginOrPasswordException();
            }
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("WrongLoginOrPasswordException catched");
        }
        return "You successfuly logged in";
    }
}
    class WrongLoginException extends Exception {
    }

    class WrongLPasswordException extends Exception {
    }

    class WrongLoginOrPasswordException extends Exception {
    }

