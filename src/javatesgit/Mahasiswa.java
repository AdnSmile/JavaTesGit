
package javatesgit;

/**
 *
 * @author nessa
 */
public class Mahasiswa {
    private String nama, npm;
    private double ipk;

    public Mahasiswa(String nama, String npm, double ipk) {
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
    }
    
    public void showData(){
        System.out.println("Nama : " + nama);
        System.out.println("NPM  : " + npm);
        System.out.println("IPK  : " + ipk);
    }
}
