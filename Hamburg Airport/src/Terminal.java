public class Terminal {
    
    String _name;

    static Airline[] _airlines;

    public Terminal(String name){
        this.set_name(name);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

}
