public class Flughafen {
    String _standort;
    String _name;

    public Flughafen(String name, String standort){
        this.set_name(name);
        this.set_standort(standort);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_standort() {
        return _standort;
    }

    public void set_standort(String _standort) {
        this._standort = _standort;
    }
    

}
