class Excep_SOF{
    //public static void main(String args[]){
        public static void m1(){
            System.out.println(m2);
        }

        public static void m2(){
            System.out.println(m3);
        }

        public static void m3(){
            System.out.println(m1);
        }
        public static void main(String args[]){
            Excep_SOF r1=new Excep_SOF();
            m1();
        }
    
}