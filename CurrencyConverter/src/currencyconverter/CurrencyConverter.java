package currencyconverter;
public class CurrencyConverter {
    double[] exchangeRates = {63.0 , 3.0 , 3.0 , 595.0 , 18.0 , 107.0 , 2.0};  
    String[] money = {"rupee: " , "dirham: " , "real: " , "chilean_peso: " , "mexican_peso: " , "_yen: " , "$australian: "};
    void printCurrencies() { 
         for(int i = 0; i < exchangeRates.length; i++){
        System.out.println(money[i] + exchangeRates[i]);
    }
}
    public static void main(String[ ] args) {
         CurrencyConverter cc = new CurrencyConverter();
         cc.printCurrencies();
    }
}
