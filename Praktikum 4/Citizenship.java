/**
 * [Name file]
 * [Jelaskan kegunaan class ini]
 * @author 18220026 Annel Rashka Perdana
 */

public abstract class Citizenship {
    private String surname;
    private String givenName;

    public Citizenship(String surname, String givenName) {
        // Konstruktor
        this.surname = surname;
        this.givenName = givenName;
    }

    public String getSurname() {
        // Mengembalikan atribut surname
        return this.surname;
    }

    public String getGivenName() {
        // Mengembalikan atribut givenName
        return this.givenName;
    }

    public abstract void speak();
}