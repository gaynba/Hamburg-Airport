public class Passagier{
    String _vorname;
    String _nachname;


    public Passagier(String vorname, String nachname){
        this.set_vorname(vorname);
        this.set_nachname(nachname);
    }

    public String get_vorname() {
        return _vorname;
    }

    public void set_vorname(String _vorname) {
        this._vorname = _vorname;
    }

    public String get_nachname() {
        return _nachname;
    }

    public void set_nachname(String _nachname) {
        this._nachname = _nachname;
    }
}
    
