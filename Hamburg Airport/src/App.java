public class App {

    static Terminal[] _terminals;
    static Bahn[] _bahnen;
    static Pilot[] _piloten;
    static Airline[] _airlines;
    static Flugzeug[] _flugzeuge;
    static Fluglinie[] _fluglinien;
    static Passagier[] _passagiere;
    static Flug[] _fluege;
    static Startzeit[] _startzeiten;
    int [] passagier = {200; 5; 2; 3; 25};

    public static void main(String[] args) throws Exception {
        
        // Initialisieren der Arrays
        _fluege = new Flug[10];

        _startzeiten = new Startzeit[4];

        _terminals = new Terminal[3];

        _bahnen = new Bahn[4];

        _piloten = new Pilot[5];

        _airlines = new Airline[4];

        _flugzeuge = new Flugzeug[3];

        _fluglinien = new Fluglinie[4];

        _passagiere = new Passagier[200];

        // Demodaten für die Arrays

        _startzeiten[0] = new Startzeit("6:00");
        _startzeiten[1] = new Startzeit("9:00");
        _startzeiten[2] = new Startzeit("16:00");
        _startzeiten[3] = new Startzeit("22:00");

        _terminals[0] = new Terminal("Terminal 1");
        _terminals[1] = new Terminal("Terminal 2");
        _terminals[2] = new Terminal("Terminal 3");

        _bahnen[0] = new Bahn("Bahn 1");
        _bahnen[1] = new Bahn("Bahn 2");
        _bahnen[2] = new Bahn("Bahn 3");
        _bahnen[3] = new Bahn("Bahn 4");

        _piloten[0] = new Pilot("Dieter", "Dussel");
        _piloten[1] = new Pilot("Helmut", "Hohlkopf");
        _piloten[2] = new Pilot("Rainer", "Zufall");
        _piloten[3] = new Pilot("Karl-Heinrich", "Petersen");
        _piloten[4] = new Pilot("Ernst", "Vogelblume");

        _airlines[0] = new Airline("Lufthansa");
        _airlines[1] = new Airline("British Airways");
        _airlines[2] = new Airline("Air France");
        _airlines[3] = new Airline("");

        _flugzeuge[0] = new Flugzeug("Aero Commander", "001", 3, 2);
        _flugzeuge[1] = new Flugzeug("Aerocar Incorporated", "002", 4, 3);
        _flugzeuge[2] = new Flugzeug("Aermacchi", "003", 3, 2);

        _fluglinien[0] = new Fluglinie("Hamburg - London");
        _fluglinien[1] = new Fluglinie("Hamburg - Paris");
        _fluglinien[2] = new Fluglinie("Hamburg - Berlin");

        _passagiere[0] = new Passagier("Norbert", "Eierkopf");
        _passagiere[1] = new Passagier("Ernst", "Wahnsinn");
        _passagiere[2] = new Passagier("Detlef", "Hosendoof");
        _passagiere[3] = new Passagier("Carlos", "Carlos");
        
        Menu menu = new Menu();
        menu.startMenu();
        
    }

    // Methode zum überprüfen ob noch plätze frei sind in den Flugzeugen
    public static int min(int [] passagier){
        // Wert muss größer sein als das was im Array steht
        int min = 201;
        for(int i = 0; i < passagier.length; i++){
            if(passagier[i]<min)min=passagier[i];
        }
        return min;
    }

    public static int max(int [] passagier){
        int max = 100;
        for(int i = 0; i < passagier.length; i++){
            if(passagier[i]>max)max=passagier[i];
        }
        return max;
    }


    // Funktion um alle Objekte zählen zu können!
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for(Object a : array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i++;
        }
    }

    // Methoden zum zählen der einzelnen Objekte aus verschiedenen Klassen
    public static void addFlug(Flug fluege){
        addObject(fluege, getAllFluege());
    }

    public static Flug[] getAllFluege(){
        return _fluege;
    }

    public static void addStartzeit(Startzeit startzeiten){
        addObject(startzeiten, getAllStartzeiten());
    }

    public static Startzeit[] getAllStartzeiten(){
        return _startzeiten;
    }

    public static void addTerminal(Terminal terminals){
        addObject(terminals, getAllTerminals());
    }

    public static Terminal[] getAllTerminals(){
        return _terminals;
    }

    public static void addAirline(Airline airlines){
        addObject(airlines, getAllAirlines());
    }

    public static Airline[] getAllAirlines(){
        return _airlines;
    }

    public static void addBahn(Bahn bahnen){
        addObject(bahnen, getAllBahnen());
    }

    public static Bahn[] getAllBahnen(){
        return _bahnen;
    }

    public static  void addFluglinien(Fluglinie fluglinien){
        addObject(fluglinien, getAllFluglinien());
    }

    public static Fluglinie[] getAllFluglinien(){
        return _fluglinien;
    }

    public static void addPilot(Pilot piloten){
        addObject(piloten, getAllPiloten());
    }

    public static Pilot[] getAllPiloten(){
        return _piloten;
    }

    public static void addPassagiere(Passagier passagiere){
        addObject(passagiere, getAllPassagiere());
    }
    
    public static Passagier[] getAllPassagiere(){
        return _passagiere;
    }
}
