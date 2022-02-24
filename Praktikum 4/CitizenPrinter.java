/**
 * CitizenPrinter.java
 * [jelaskan kegunaan file ini]
 * @author 18220026 Annel Rashka Perdana
 */
import java.util.ArrayList;
import java.util.List;

public class CitizenPrinter {
    private List<Citizenship> citizenshipList = new ArrayList<Citizenship>();

    /**
     * Add Citizen. Menambahkan citizenship ke array
     *
     * @param citizenship objek Citizenship
     */
    public void addCitizen(Citizenship citizenship) {
        // Tambahkan citizenship ke list, gunakan metode add dari java.util.List
        citizenshipList.add(citizenship);
    }

    /**
     * Get Citizenship. Getter dari citizenshipList
     */
    public List<Citizenship> getCitizenshipList() {
        // Lengkapi getter
        return this.citizenshipList;
    }

    /**
     * Print Citizenship List. Cetak informasi dan lakukan aksi dari citizenship yang ada.  
     */
    public void printCitizenshipList() {
        for (Citizenship citizenship : this.citizenshipList) {
            // Lengkapi Print Citizenship List, hint: 
            // - gunakan instanceof untuk mengetahui tipe dari objek
            // - gunakan type casting untuk memanggil metode kelas turunan
            if (citizenship instanceof American){
                System.out.println("American");
                System.out.printf("%1$s %2$s%n", citizenship.getSurname(),citizenship.getGivenName());
                citizenship.speak();
                System.out.println(((American) citizenship).getState());
            }
            else if (citizenship instanceof Indonesian){
                System.out.println("Indonesian");
                System.out.printf("%1$s %2$s%n", citizenship.getSurname(),citizenship.getGivenName());
                citizenship.speak();
                ((Indonesian) citizenship).speakLocalLanguage();
            }
            else if (citizenship instanceof Japanese){
                System.out.println("Japanese");
                System.out.printf("%1$s %2$s%n", citizenship.getSurname(),citizenship.getGivenName());
                citizenship.speak();
                System.out.println(((Japanese) citizenship).getFavouriteAnime());
            }
        }
    }
}