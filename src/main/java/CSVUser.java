import com.opencsv.bean.CsvBindByName;

public class CSVUser {
    @CsvBindByName
    private String name;
    @CsvBindByName(column = "email", required = true)
    private String email;
    @CsvBindByName(column = "phone")
    private String phoneNo;
//    @CsvBindByName
//    private String country;

    /*@Override
    public String toString(){
        return "CSVUser{" + "name='" + name + '\'' + ", email='" + email + '\'' + ",phoneNo='" + phoneNo + '\'' +
                ",country='" + country + '\'' + '}';*/
         public CSVUser(String name, String email, String phoneNo) {
            this.name = name;
            this.email = email;
            this.phoneNo = phoneNo;
        }

    public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhoneNum(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        @Override
        public String toString() {

            return name + "," + email + "," + phoneNo;
        }
}
