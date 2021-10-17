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

        else if(choice.equals("5")){
            
        }

        else {
            System.out.println("Bitte nur 1-9 eingeben!");
        }
        
        startMenu();
    }


    public void createFluegeMenu(){
        
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
