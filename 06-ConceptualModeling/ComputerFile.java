public class ComputerFile{
    String name;
    int sizeInBytes;
    boolean isHidden;
    boolean isOpen;
    String modifyDate;
    public ComputerFile(String name, int sizeInBytes, boolean isHidden, boolean isOpen, String modifyDate) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
        this.isHidden = isHidden;
        this.isOpen = isOpen;
        this.modifyDate = modifyDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSizeInBytes() {
        return sizeInBytes;
    }
    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
    public boolean isHidden() {
        return isHidden;
    }
    public void setHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public String getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }
    public void open(){
        this.isOpen=true;
    }
    public void close(){
        this.isOpen=false;
    }
    public void rename(String name){
        this.name=name;
    }
    
    




}