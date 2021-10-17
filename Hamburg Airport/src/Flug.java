public class Flug {

    Flughafen _flughafen;
    Terminal _terminal;
    Airline _airline;
    Fluglinie _fluglinie;
    Bahn _bahn;
    Flugzeug _flugzeug;
    Pilot _pilot;
    Passagier _passagier;
    int _preis;

    // Constructor für Flug
    public Flug( Flughafen flughafen, Terminal terminal, Airline airline, Fluglinie fluglinie, Bahn bahn, Flugzeug flugzeug, Pilot pilot, Passagier passagier, int preis){
        this.set_flughafen(flughafen);
        this.set_terminal(terminal);
        this.set_airline(airline);
        this.set_fluglinie(fluglinie);
        this.set_bahn(bahn);
        this.set_flugzeug(flugzeug);
        this.set_pilot(pilot);
        this.set_passagier(passagier);
        this.set_preis(preis);
    }


    public int get_preis() {
        return _preis;
    }

    public void set_preis(int _preis) {
        this._preis = _preis;
    }

    public Flughafen get_flughafen() {
        return _flughafen;
    }

    public void set_flughafen(Flughafen _flughafen) {
        this._flughafen = _flughafen;
    }

    public Terminal get_terminal() {
        return _terminal;
    }

    public void set_terminal(Terminal _terminal) {
        this._terminal = _terminal;
    }

    public Airline get_airline() {
        return _airline;
    }

    public void set_airline(Airline _airline) {
        this._airline = _airline;
    }

    public Fluglinie get_fluglinie() {
        return _fluglinie;
    }

    public void set_fluglinie(Fluglinie _fluglinie) {
        this._fluglinie = _fluglinie;
    }

    public Bahn get_bahn() {
        return _bahn;
    }

    public void set_bahn(Bahn _bahn) {
        this._bahn = _bahn;
    }

    public Flugzeug get_flugzeug() {
        return _flugzeug;
    }

    public void set_flugzeug(Flugzeug _flugzeug) {
        this._flugzeug = _flugzeug;
    }

    public Pilot get_pilot() {
        return _pilot;
    }

    public void set_pilot(Pilot _pilot) {
        this._pilot = _pilot;
    }

    public Passagier get_passagier() {
        return _passagier;
    }

    public void set_passagier(Passagier _passagier) {
        this._passagier = _passagier;
    }

}
