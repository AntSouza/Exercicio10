public class ConversorDeTemperatura {
    
    public double conversorParaCelsius(double f)throws MenorQueZeroAbsolutoException{
        if(f<(-459.67)){
            throw new MenorQueZeroAbsolutoException("Menor que zero abosluto!");
        }
        
        return (f-32)/1.8;
    }
    
    
    public double conversorParaFahrenheit(double c)throws MenorQueZeroAbsolutoException{
        if(c<(-273.15)){
            throw new MenorQueZeroAbsolutoException("Menor que zero absoluto!");
        }
        return (1.8*c) + 32;        
    }
}
