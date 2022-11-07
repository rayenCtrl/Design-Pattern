public class Factory {

    public Tarte createTarte(String s) {
        Tarte t=null;
        
        if (s.equals("prune")) {
            t = new TartePrunes();
        }
        if (s.equals("pomme")) {
            t = new TartePommes();
        }
        if (s.equals("poire")) {
            t = new TartePoires();
        }        
        return t;
    }
}
