
class Sum{
   static int add(int a, int b){
    return a+b;
   }

   static int add(int a, int b, int c){
    return a+b+c;
   }


}

class CompileTimePolymorphism {
    public static void main(String[] args){
        System.out.println(Sum.add(5, 6));
        System.out.println(Sum.add(3, 5, 7));
    }
   
}
