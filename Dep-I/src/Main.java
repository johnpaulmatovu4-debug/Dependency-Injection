public class Main {
    public static void main(String[] args) {
        refueling r = new refueling();
        airbusJet one = new airbusJet(r);
        one.operate();

        avionics a = new avionics();
        airbusJet two = new airbusJet(a);
        two.operate();

        cargoloading c = new cargoloading();
        airbusJet three = new airbusJet(c);
        three.operate();
    }
}
