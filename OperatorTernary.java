public class OperatorTernary{
    public static void main(String[] args) {
        boolean hujan = false;

        System.out.println(hujan == true ? "Bawa Payung" : "Tidak Perlu bawa Payung");

        String nama = "Qn";
        String akses = nama == "Ilham" ? "Selamat Datang Ilham" : "Anda Bukan Ilham , Siapa Anda";
        System.out.println(akses);
    }
}