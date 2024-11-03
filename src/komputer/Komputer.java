/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Komputer to edit this template
 */
package komputer;


public class Komputer {
    private String brand;
    private String model;
    private String disk;
    private int disksize;
    private int ram;
            
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand1){
    this.brand = brand1;
    }

    public String getModel(){
        return model;
    }
    
    public void setModel(String model1){
        this.model = model1;
    }
    public String getDisk(){
        return disk;
    }
    
    public void setDisk(String disk1){
        this.disk = disk1;
    }
    public int getDiskSize(){
        return disksize;
    }
    
    public void setDiskSize(int diskSize){
        this.disksize = diskSize;
    }
    public int getRam(){
        return ram;
    }
    
    public void setRam(int ramSize){
        this.ram = ramSize;
    }
    
}
