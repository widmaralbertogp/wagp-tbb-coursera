// ======================================
// MAIN TEST CLASS
// ======================================
public class App 
{
    public static void main(String[] args)
    {
      // Crear un Engine
        Engine v6Engine = new Engine("V6", 3.5);

        // Crear un Sedan concreto
        Sedan mySedan = new Sedan("ABC-123",v6Engine,"Honda","Accord","Blue",2022,4 );
        mySedan.startEngine();}}       