//Objec Class
public class TesEmployee {
    private String nama;
   private double gaji;

    //Construct
    public TesEmployee(){
        nama = "";
        gaji = 0.00;
    }
    //Constructor parameter
    public TesEmployee (String nama , double gaji) {
        this.nama = nama;
        this.gaji= gaji;
    }
    

    //method
    public void println() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ini Data Dari Karyawan");
        System.out.println("Nama : "+ nama);
        System.out.println("Gaji : "+ gaji);
        System.out.println("-------------------------------------------------------------------------");
    }
    /**
     * @return String return the name
     */
    public String getName() {
        return nama;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.nama = name;
    }

    /**
     * @return double return the salary
     */
    public double getGaji() {
        return gaji;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double gaji) {
        this.gaji = gaji;
    }
    // Method menghasilkan value
    public String print2() {
        return "Employee : " + nama
        + "\nSalary : " + "Rp." + gaji;
    }
}


     
