class Persona{
    //atributos de la clase
     
      public int edad;
      public double peso,talla;
      //...
    
    Persona asignar(int e,double p,double t){
        edad=e;
        peso=p;
        talla=t;
        return this;
      }
      /**
       * @return
       */
      public double imc(){
        return peso/(talla*talla);
      }}