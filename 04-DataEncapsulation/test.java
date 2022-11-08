public class test {
    public static void main(String[] args){
        DrivingLicense l = new DrivingLicense();
        l.setName("sanek");
        l.setSurname("Łoś");
        l.setCategory("B");
        l.setCity("Krakow");
        l.setPostal("12-345");
        l.setLicenseNumber("321321321312");
        l.setYearOfIssue(2019);
        l.DisplayData();
        System.out.println(l.getCategory());

    }
}
