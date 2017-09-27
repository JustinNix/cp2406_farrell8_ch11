public class IncomingCall extends PhoneCall {

    public IncomingCall(String phoneNum) {
        super(phoneNum);
        priceOfCall = 0.02;
    }

    @Override
    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public double getPriceOfCall() {
        return priceOfCall;
    }

    @Override
    public void displayInformation() {
        System.out.println(this.phoneNum + " " + this.priceOfCall);
    }
}
