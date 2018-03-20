public class Invoice {
    private String title, address, postcode;
    public Invoice(){
        title="亞大資工站";
        address="台中市霧峰區";
        postcode="41354";
    }
    public Invoice( String add1,String name,String code){
        title=name;
        address=add1;
        postcode=code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(String title) {
        return title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress(String address ) {
        return address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode(String postcode) {
        return postcode;
    }
    public String getTitle(){ return title;}
    public String getAddress(){ return  address;}
    public String getPostcode(){ return  postcode; }
    public  void showInfo(){
        System.out.println("========================");
        System.out.println("title:"+this.title);
        System.out.println("address:"+this.address);
        System.out.println("postcode:"+this.postcode);
        System.out.println("========================");
    }
}
