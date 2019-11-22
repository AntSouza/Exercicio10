public class TestaConversor {
    public static void main(String[] args){
        ConversorDeTemperatura teste = new ConversorDeTemperatura();
        
        try{
            teste.conversorParaCelsius(-515.12);
            teste.conversorParaFahrenheit(-289.12);
        }catch(MenorQueZeroAbsolutoException ex){
            System.out.println(ex.getMessage());
        }
    }
}
