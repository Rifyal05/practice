/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputer;

import static java.nio.file.Files.size;
import javax.swing.JOptionPane;


public class DataKomputer implements AppInterface{
    
    private final Komputer[] komputer;
    private String size;
    
    public DataKomputer(){
        komputer = new Komputer[1000];
    }

    @Override
    public int pilihanMenu() {
        String p;
        p = JOptionPane.showInputDialog(null,""
                + "<html>"
                + "=============Pilihan=============<br>"
                + "1 &rarr; Tamba Data Komputer<br>"
                + "2 &rarr; Cari berdasarkan Brand Komputer<br>"
                + "3 &rarr; Cari berdasarkan Model komputer<br>"
                + "4 &rarr; Keluar Aplikasi<br>"
                + "================================"
                + "<b>Ketik Pilihan Anda:</b>"
                + "</html>",
                "Menu Pilihan",
                JOptionPane.QUESTION_MESSAGE);
        int pilihan = Integer.parseInt(p);
        return pilihan;
                
                
    }

    @Override
    public void add() {
        Komputer kom = new Komputer();
        String brand = JOptionPane.showInputDialog(null,"Ketik Brand : ", "" 
                + "Brand", JOptionPane.QUESTION_MESSAGE);
        kom.setBrand(brand);
        
        String model = JOptionPane.showInputDialog(null, "Ketik Model: ",""
        + "Model", JOptionPane.QUESTION_MESSAGE);
        kom.setModel(model);
        
        String disk = JOptionPane.showInputDialog(null, "Tipe Disk (SSD/Hardisk): ",""
        + "Tipe Disk", JOptionPane.QUESTION_MESSAGE);
        kom.setDisk(disk);
        
        String size = JOptionPane.showInputDialog(null,"Kapasitas Disk (angka): ", ""
        + " Kapasitas disk (dalam GB)",JOptionPane.QUESTION_MESSAGE);
        int diskSize = Integer.parseInt(size);
        kom.setDiskSize(diskSize);
        
        String ram = JOptionPane.showInputDialog(null, "Kapasitas RAM (Angka): ",""
        + "Ukuran RAM (dalam GB)", JOptionPane.QUESTION_MESSAGE);
        int ramSize = Integer.parseInt(ram);
        kom.setRam(ramSize);
        
        for (int i = 0; i< komputer.length; i++){
            if(komputer[i]==null){
                komputer[i] = kom;
                break;
            }
        }
        viewData(kom);
    }

    @Override
    public String keyword(String type) {
        String key = JOptionPane.showInputDialog(null,"Ketik "
        + type + "komputer",
        type, JOptionPane.QUESTION_MESSAGE);
        return key;
    }

    @Override
    public Komputer searchByBrand(String brand) {
        Komputer komp  = null;
        for (Komputer k : komputer){
            if (k != null && brand.equalsIgnoreCase(k.getBrand())){
                komp = k;
                break;
            }
        }
        return komp;
    }

    @Override
    public Komputer searchByModel(String model) {
        Komputer komp = null;
        for (Komputer k : komputer){
            if(k != null && model.equalsIgnoreCase(k.getModel())){
                komp = k;
                break;
            }
        }
        return komp;
    }

    @Override
    public void viewData(Komputer k) {
        if (k == null){
            JOptionPane.showMessageDialog(null,"data tidak ditemukan");
            }
        else{
            JOptionPane.showMessageDialog(null,
                    "Brand\t\t : " + k.getBrand() +
                    "\nModel\t\t : " + k.getModel() +
                    "\nDiskType\t\t : " + k.getDisk() +
                    "\nDiskSize\t\t : " + k.getDiskSize() +
                    "\nRAM size\t\t : " + k.getRam(),
                    "Data Komputer",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }
    
}
