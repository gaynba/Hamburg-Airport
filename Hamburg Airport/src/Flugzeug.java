public class Flugzeug {
    String _hersteller;
    String _nummer;
    int _maxPassagiere;
    int _maxPiloten;

    public Flugzeug(String hersteller, String nummer, int maxPassagiere, int maxPiloten){
        this.set_hersteller(hersteller);
        this.set_nummer(nummer);
        this.set_maxPassagiere(maxPassagiere);
        this.set_maxPiloten(maxPiloten);
    }
    
    public String get_hersteller() {
        return _hersteller;
    }

    public void set_hersteller(String _hersteller) {
        this._hersteller = _hersteller;
    }

    public String get_nummer() {
        return _nummer;
    }

    public void set_nummer(String _nummer) {
        this._nummer = _nummer;
    }

    public int get_maxPassagiere() {
        return _maxPassagiere;
    }

    public void set_maxPassagiere(int _maxPassagiere) {
        this._maxPassagiere = _maxPassagiere;
    }

    public int get_maxPiloten() {
        return _maxPiloten;
    }

    public void set_maxPiloten(int _maxPiloten) {
        this._maxPiloten = _maxPiloten;
    }

}
