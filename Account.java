class InsuffintIndsException extends Exception{
InsuffintIndsException(String msg){
    
}
}

class Account{
    public void withdrawlAmount(int amount){
        int acc_Bal=3000;
         
         if(acc_Bal<amount){
            System.out.println("amout");
         }
         else{
            System.out.println("enjoy");
         }

    }
             public static void main(String args[]){
            Account n1 = new Account();
            n1.withdrawlAmount(600);
         }

}