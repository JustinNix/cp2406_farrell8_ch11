public class OutGoingCall extends  PhoneCall{
    int timeOfCall;

    public OutGoingCall(String phoneNum, int timeOfCall) {
        super(phoneNum);
        priceOfCall = 0.04;
        this.timeOfCall = timeOfCall;
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
        System.out.println(this.phoneNum + " " + this.priceOfCall + " " + this.timeOfCall + " " + (this.priceOfCall*this.timeOfCall));
    }
}
