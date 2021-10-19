import java.util.Scanner;

public class Menu {
    
    Scanner _scanner;

    public Menu(){
        set_scanner(new Scanner(System.in));
    }


    public void startMenu(){
        System.out.println("Bitte Wählen sie aus");
        System.out.println("(1) Neuer Flug");
        System.out.println("(2) Alle Terminals");
        System.out.println("(3) Alle Airlines");
        System.out.println("(4) Alle Bahnen");
        System.out.println("(5) Alle Fluglinien");
        System.out.println("(6) Alle Flugzeuge");
        System.out.println("(7) Alle Piloten");
        System.out.println("(8) Alle Passagiere");
        System.out.println("(9) Alle Flüge");
        
        String choice = get_scanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);


        if (choice.equals("1")){
            System.out.println("noch nicht implementiert");
        }

        else if(choice.equals("2")){
            showTerminals();
        }

        else if(choice.equals("3")){
            showAirlines();
        }

        else if(choice.equals("4")){
            showBahnen();
        }

        else {
            System.out.println("Bitte nur 1-4 eingeben!");
        }
        
        startMenu();
    }


    public void createFluegeMenu(){
        System.out.println("Bitte wählen Sie einen Preis aus");

        //String preis = get_scanner().next();
        //int preisfinal = Integer.valueOf(preis);

        int i = 0;
        System.out.println("Bitte wählen Sie ein Auto aus: ");

        for (Terminal terminal : App.getAllTerminals()){
            if(terminal != null){
                System.out.println(i + " - " + terminal.get_name());
                i++;
            }
        }

        String terminal_choice = get_scanner().next();
        int terminal_index = Integer.valueOf(terminal_choice);

        System.out.println(App.getAllTerminals() [terminal_index]);

        for (Airline airline : App.getAllAirlines()){
            if(airline != null){
                System.out.println(i + " - " + airline.get_name());
                i++;
            }
        }

        String airline_choice = get_scanner().next();
        int airline_index = Integer.valueOf(airline_choice);

        System.out.println(App.getAllAirlines() [airline_index]);


        for (Fluglinie fluglinie : App.getAllFluglinien()){
            if(fluglinie != null){
                System.out.println(i + " - " + fluglinie.get_name());
                i++;
            }
        }

        String fluglinie_choice = get_scanner().next();
        int fluglinie_index = Integer.valueOf(fluglinie_choice);

        System.out.println(App.getAllFluglinien() [fluglinie_index]);

        for (Pilot pilot : App.getAllPiloten()){
            if(pilot != null){
                System.out.println(i + " - " + pilot.get_vorname() + " - " + pilot.get_nachname());
                i++;
            }
        }

        String pilot_choice = get_scanner().next();
        int pilot_index = Integer.valueOf(pilot_choice);

        System.out.println(App.getAllPiloten() [pilot_index]);


        for (Passagier passagier : App.getAllPassagiere()){
            if(passagier != null){
                System.out.println(i + " - " + passagier.get_vorname() + " - " + passagier.get_nachname());
                i++;
            }
        }

        String passagier_choice = get_scanner().next();
        int passagier_index = Integer.valueOf(passagier_choice);

        System.out.println(App.getAllPassagiere() [passagier_index]);

        for (Bahn bahn : App.getAllBahnen()){
            if(bahn != null){
                System.out.println(i + " - " + bahn.get_name());
                i++;
            }
        }

        String bahn_choice = get_scanner().next();
        int bahn_index = Integer.valueOf(bahn_choice);

        System.out.println(App.getAllBahnen() [bahn_index]);

        for(Startzeit startzeit : getAllStartzeiten()){
            if(startzeit != null){
                System.out.println(i + " - " + startzeit.get_name());
            }
        }

        String startzeit_choice = get_scanner().next();
        int startzeit_index = Integer.valueOf(startzeit_choice);

        System.out.println(App.getAllStartzeiten() [startzeit_index]);


        App.addFlug(new Flug(App.getAllTerminals()[terminal_index], App.getAllAirlines()[airline_index], App.getAllFluglinien()[fluglinie_index], App.getAllStartzeiten() [startzeit_index], App.getAllPiloten()[pilot_index], App.getAllPassagiere()[passagier_index], App.getAllBahnen()[bahn_index], int min, int max);
    }

    public void showTerminals(){
        for(Terminal terminal : App.getAllTerminals()){
            if(terminal != null){
                System.out.println(terminal.get_name());
            }
        }
    }

    public void showAirlines(){
        for(Airline airlines : App.getAllAirlines()){
            if(airlines != null){
                System.out.println(airlines.get_name());
            }
        }
    }

    public void showBahnen(){
        for(Bahn bahnen : App.getAllBahnen()){
            if(bahnen != null){
                System.out.println(bahnen.get_name());
            }
        }
    }



    public Scanner get_scanner() {
        return _scanner;
    }

    public void set_scanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
}
