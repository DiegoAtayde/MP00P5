class Main {
  public static void main(String[] args) {

    Circulo cir=new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f);//->primer resolucion
    System.out.println(cir);
    cir.setRadio((float) 7.33);
    System.out.println(cir);
    float var=-8.66f;
    cir.setRadio(var);
    System.out.println(cir);

    System.out.println("***********Composicion***********");
    Persona persona1=new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha=new Fecha(2,1,2021);
    persona1.setNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getFNacimiento().getAnio());
    
    System.out.println("##########Composicion2##########");
    Persona persona2=new Persona("Rafael","Zavala",8,4,1998);
    System.out.println(persona2);

    System.out.println("#########Actividad extra##########");
    Persona persona3=new Persona("Juan", "Salazar",7,5,1985);
    Persona persona4=new Persona("Marco", "Gutierrez",21,11,1991);
    Persona persona5=new Persona("Valeria", "Aguilar",13,10,2000);
    Persona persona6=new Persona("Ramon", "Salazar",16,6,2016);
    Coche coche1=new Coche("Honda",2010,"azul",3,true,200,persona3,persona4,persona5,persona6);
    System.out.println(coche1);
    
  }
}