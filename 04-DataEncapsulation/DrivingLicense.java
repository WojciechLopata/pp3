public class DrivingLicense {
    private String name;
    private  String surname;
    private  String postalCode;
    private  String city;
    private  String licenseNumber;
    private  int yearOfIssue;
    private  String category;
    public void DisplayData(){
            System.out.println(getName()+" "+getSurname()+" "+getPostal()+" "+getCity()+" "+getLicenseNumber()+" "+getYear()+" "+getCategory());

    }
    public String getName(){
        return name;
    }
    public void setName(String dName){
        dName=dName.substring(0,1).toUpperCase()+dName.substring(1).toLowerCase();
        this.name=dName;
    }
    public void setSurname(String name){
        this.surname=name;

    }
    public void setPostal(String name){
        this.postalCode=name;
        
    }
    public void setCity(String name){
        this.city=name;
        
    }
    public void setLicenseNumber(String name){
        this.licenseNumber=name;
        
    }
    public void setYearOfIssue(int name){
        if(name>=2022 && name<=1980){

        
        this.yearOfIssue=name;
        }
    }
    public void setCategory(String name){
        this.category=name;
        
    }
    public String getCategory(){
            return category;
    }
    public int getYear(){
        return yearOfIssue;
}
public String getLicenseNumber(){
    return licenseNumber;
}
public String getCity(){
    return city;
}
public String getPostal(){
    return postalCode;
}
public String getSurname(){
    return surname;
}






  
  
}

