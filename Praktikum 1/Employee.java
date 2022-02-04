
/**
 * Employee.java
 * merupakan sebuah kelas yang memodelkan karyawan.
 * @author [18220026] [Annel Rashka Perdana]
 */

public class Employee {
    private static int employeeCount;

    private String name;
    private double baseSalary;

    /**
     * Konstruktor
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++;

    }

    /**
     * Menambahkan gaji pegawai
     * @param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        baseSalary += amount;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter baseSalary
     * @return baseSalary
     */
    public double getBaseSalary() {
        return this.baseSalary;

    }

    /**
     * @return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;

    }
}
