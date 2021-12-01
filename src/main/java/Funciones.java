public class Funciones {

    public boolean esPrimo(int num){
        if(num==0 || num==1)
            return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public boolean esBiciesto(int anio){
        if ( (anio%4==0) && ( (anio%100!=0) || (anio%400==0) ) ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean multiploDe3(int num){
        if (num%3==0){
            return true;
        }else{
            return false;
        }
    }


}
