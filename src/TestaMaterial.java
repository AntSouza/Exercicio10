public class TestaMaterial {
    public static void main(String[] args){
      try{
          Material y1 = new Material("Platina",-12);
         
      }catch(QuantidadeInvalidaException ex){
          System.out.println(ex.getMessage());
      }         
    }
}
