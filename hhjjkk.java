public class hhjjkk{

    static void test1(int age){
        System.out.println(age);
    }
    static void test2(int age){
        System.out.println(age);
    }
    static void test(){

        test1(15);
        test2(21);
    }
    static int sum(int num1,int num2){
        int o=num1+num2;

        return o ;
    }

    static String name(String names){
        System.out.println(names);
        return names;

    }
        

    public static void main(String[] args) {

        name("nouro");


        int i=sum(3,5);

        System.out.println(i);
        int nom[]={90,63,54,52,54};

         try{
            System.out.println(nom[8]);
         }
         catch(Exception error){
            System.out.println(error.getMessage());
         }
         finally{
            System.out.println(nom[1]);
         }
         







         oop man1= new oop();
         man1.name="nouro";
         man1.color="blak";
         man1.info="rech";
         man1.age=21;

         oop man2=new oop();
         man2.name="software engniring";
         man2.color="blue";
         man2.info="dream";
         man2.age=8;


         oop man3=new oop();
         man3.name="java";
         man3.color="grren";
         man3.info="money";
         man3.age=1991;


         System.out.println(man1.name+"\t"+man1.color+"\t"+man1.info+"\t"+man1.age);

         System.out.println(man2.name+"\t"+man2.color+"\t"+man2.info+"\t"+man2.age);

         System.out.println(man3.name+"\t"+man3.color+"\t"+man3.info+"\t"+man3.age);
         
       
         oop pr=new oop();
         pr.mans();



         String task="nouro";
         int ll=task.length();
         char slo [] =task.toCharArray();
         for (int le=0;le<ll;le++){
 
            
            System.out.println(slo[le]);


         }

         












        }
        
        
        


}











