import java.util.*;
class Bank{
    private int id;
    private String name;
    private String type;
    private String city;
    private String state;
    private int zip;

    Bank(int id, String name, String type, String city, String state, int zip){
        this.id = id;
        this.name = name;
        this.type = type;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getId(){
        return id;
    }
    public String Name(){
        return name;
    }
    public String Type(){
        return type;
    }
    public String City(){
        return city;
    }
    public String State(){
        return state;
    }

    public int getZip(){
        return zip;
    }


    public String toString(){
        return id+" "+name+" "+type+" "+city+" "+state+" "+zip;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

}

class Demo1{
    public static void main(String[] args) {
        List<Bank> c = new ArrayList<Bank>();

        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.print("Enter your choice : ");
            ch = s.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Id : ");
                    int id = s.nextInt();
                    System.out.print("Enter Name : ");
                    String name = s1.nextLine();
                    System.out.print("Enter Type : ");
                    String type = s1.nextLine();
                    System.out.print("Enter City : ");
                    String city = s1.nextLine();
                    System.out.print("Enter State : ");
                    String state = s1.nextLine();
                    System.out.print("Enter Zip : ");
                    int zip = s.nextInt();

                    c.add(new Bank(id,name,type,city,state,zip));
                break;

                case 2:
                    System.out.println("-----------------");
                    Iterator<Bank> i = c.iterator();
                    while(i.hasNext()){
                        Bank b = i.next();
                        System.out.println(b);
                    }
                    System.out.println("-----------------");
                break;

                case 3:
                    boolean found = false;
                    System.out.println("Enter City to search :");
                    city = s1.nextLine();
                    System.out.println("-----------------");
                    i = c.iterator();
                    while(i.hasNext()) {
                        Bank b = i.next();
                        if (b.getCity() == city) {
                            System.out.println(b);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("-----------------");
                    break;
            }
        }while(ch!=0);
    }
}