class Cow extends Cattle{
      public void eat( Mammal m ){
            
            System.out.println("Cow eats hay");
            super.eat(m); 
      }
      public void eat1( Mammal m ){
            super.eat1(m);
            System.out.println("Cow eats a lot of Hay");
            
      }
}
