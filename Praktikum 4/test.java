/**
 * CitizenPrinter.java
 * Mencetak informasi Citizenship dan kelas turunannya (American, Japanese, Indonesian) dari beberapa warga.
 * @author 18220032 Rifki Kaida
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
        this.citizenshipList.add(citizenship);
    }

    /**
     * Get Citizenship. Getter dari citizenshipList
     */
    public List<Citizenship> getCitizenshipList() {
        return this.citizenshipList;

        // Lengkapi getter


    }

    /**
     * Print Citizenship List. Cetak informasi dan lakukan aksi dari citizenship yang ada.  
     */
    public void printCitizenshipList() {
        for (Citizenship citizenship : this.citizenshipList) {
            // Lengkapi Print Citizenship List, hint: 
            // - gunakan instanceof untuk mengetahui tipe dari objek
            // - gunakan type casting untuk memanggil metode kelas turunan
            // - gunakan System.out.println()
            if (citizenshipList instanceof American) {
                System.out.println("American");
                American orang = (American) citizenshipList;
                System.out.println(orang.getGivenName()  + orang.getSurname() );
                orang.speak();
                System.out.println(orang.getState());

            } else if (citizenshipList instanceof Japanese) {
                System.out.println("Japanese");
                Japanese orang = (Japanese) citizenshipList;
                System.out.println(orang.getGivenName()  + orang.getSurname() );
                orang.speak();
                System.out.println(orang.getFavouriteAnime());
            } else if (citizenshipList instanceof Indonesian) {
                System.out.println("Indonesian");
                Indonesian orang = (Indonesian) citizenshipList;
                System.out.println(orang.getGivenName()  + orang.getSurname() );
                orang.speakLocalLanguage();

            }


        }
    }
}