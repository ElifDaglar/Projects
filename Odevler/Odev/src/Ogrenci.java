public class Ogrenci {
    private String name;
    private String department;
    private double gano;
    private String studentNumber;
    private int entryYear;
    private int departmentCode;
    private int entryTurn;



    public Ogrenci() {
    }


    public Ogrenci(String name, String department) {
        this.name = name;
        this.department = department;

    }

    public Ogrenci(String name, String department, String studentNumber, double gano) {
       this(name,department,studentNumber,gano,0,0,0);
    }
    public Ogrenci(Ogrenci ogrenci){
        this(ogrenci.name,ogrenci.department,ogrenci.studentNumber,ogrenci.gano, ogrenci.entryYear,
                ogrenci.departmentCode,ogrenci.entryTurn);

    }
public Ogrenci(String name,String department,String studentNumber,double gano,int entryYear,int departmentCode,int entryTurn){
    this.name = name;
    this.department = department;
    this.studentNumber = studentNumber;
    this.gano = gano;
    this.entryYear=entryYear;
    this.departmentCode=departmentCode;
    this.entryTurn=entryTurn;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getEntryTurn() {
        return entryTurn;
    }

    public void setEntryTurn(int entryTurn) {
        this.entryTurn = entryTurn;
    }
    public Ogrenci(double gano) throws IllegalAccessException {
        if (gano < 0 || gano > 4) {
            this.gano = gano;
            throw new IllegalAccessException("Gano 0-4 arasında olmalıdır!");

        }
    }

    public String ogrenciNoOlustur(String entryYear) {
        String departmentCode = "104";
        String entryTurn = "001";
        String studentNum = entryYear + departmentCode + entryTurn;
        return studentNum;
    }


    public String toString() {
        return String.format("%s %s %s %.2f ", name, department, studentNumber, gano); //Stringleri formatladım
    }


    public void harcHesapla(int extendedYear) {
        double tuitionFee = 160;
        double totalTuitionFee = (extendedYear * tuitionFee);

        System.out.println("3.öğrencinin ödeyeceği harç: " + totalTuitionFee);

    }


    public void harcHesapla(int extendedYear, double numberOfLectures) {
        double totalTuitionFee = 0;
        double tuitionFee = 80;
        totalTuitionFee = (extendedYear * tuitionFee * numberOfLectures);

        System.out.println("4.öğrencinin ödeyeceği harç: " + totalTuitionFee);
    }


}
