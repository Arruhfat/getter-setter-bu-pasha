//  Objec Class

public class Guru {
        int id;
        String nama,mapel,alamat;


        // Constructor nama dgn nama class
        public Guru() {
            id = 0;
            nama = "";
            mapel = "";
            alamat = "";
        }



            //Constructor Parameter
            public Guru (int id ,String nama, String mapel, String alamat){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
            }
        //method
        public void println(){
        System.out.println("ini data dari guru" + nama);
        System.out.println("id : " + id);
        System.out.println("Mapel" + mapel);
        System.out.println("Alamat" + alamat);
        }        
                /**
     * @return String return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return String return the mapel
     */
    public String getMapel() {
        return mapel;
    }

    /**
     * @param mapel the mapel to set
     */
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    /**
     * @return String return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    public String print2() {
        return "ID: " + id
        + "\nNama: " + nama
        + "\nMata Pelajaran: " + mapel
        + "\nAlamat: " + alamat;
        
    }

 }
