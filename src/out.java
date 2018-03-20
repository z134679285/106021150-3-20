public class out {
    private String name;
    private String gender;
    private String department
    private int english,chinese,math;
    public out(String name1, String gender1, String department1,int english1,int chinese1,int math1){
        name=name1;
        gender=gender1;
        department=department1;
        english=english1;
        chinese=chinese1;
        math=math1;
    }
    public void showInfo(){
        System.out.println(this.name+"\t\t"+this.gender+"\t\t"+this.department+"\t\t"+this.english+"\t\t"+this.chinese+"\t\t"+this.math);
    }
}