import java.util.Objects;
import java.util.Scanner;
public class Tugas3 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] gaji = {5000000, 6500000, 9500000};
    int[] persenLembur = {30, 32, 34, 36, 38};
    
    System.out.println("=== Menghitung penghasilan karyawan ===");
    System.out.println("Masukan golongan karyawan(A/B/C): ");
    String golongan = input.next().toUpperCase();
    System.out.println("Masukan jam lembur: ");
    int jamLembur = input.nextByte();

    int gajiPokok = 0;
    int gajiLembur = 0;

    switch (golongan) {
      case "A":
        gajiPokok = gaji[0];
        break;
      case "B":
        gajiPokok = gaji[1];
        break;
      case "C":
        gajiPokok = gaji[2];
        break;
      default:
        System.out.println("Golongan tidak valid.");
        System.exit(0);
    }

    if (jamLembur == 1) {
      gajiLembur = (gajiPokok * persenLembur [0])/100;
    }else

    if (jamLembur == 2) {
      gajiLembur = (gajiPokok * persenLembur [1])/100;
    }else

    if (jamLembur == 3) {
      gajiLembur = (gajiPokok * persenLembur [2])/100;
    }else

    if (jamLembur == 4) {
      gajiLembur = (gajiPokok * persenLembur [3])/100;
    }else

    if (jamLembur >= 5) {
      gajiLembur = (gajiPokok * persenLembur [4])/100;

    }
    int totalPenghasilan = gajiPokok + gajiLembur;

    System.out.println("Gaji Pokok : Rp. "+ gajiPokok);
    System.out.println("Gaji Lembur : Rp. "+ gajiLembur);
    System.out.println("----------------------------- +");
    System.out.println("Total gaji : Rp. "+ totalPenghasilan);
    System.out.println("=================================");
  }
}