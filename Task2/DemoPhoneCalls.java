public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingCall call = new IncomingCall("0417710478");
        OutGoingCall outDial = new OutGoingCall("021941294", 50);
        call.displayInformation();
        outDial.displayInformation();
    }
}
