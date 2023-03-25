package Tutorials.fileio.ioexample;

public class Cliente {

    private final String name;
    private String email;

    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static Cliente ClienteEmailAutomatico(String name) {
        String email = name.toLowerCase() + "@email.com";
        return new Cliente(name, email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente [Name:" + this.name + ", E-mail:" + this.email + "]";
    }
}
