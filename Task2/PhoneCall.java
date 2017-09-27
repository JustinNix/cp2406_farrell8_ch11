public abstract class PhoneCall {
    String phoneNum;
    double priceOfCall;

    public PhoneCall(String phoneNum){
        this.phoneNum = phoneNum;
        this.priceOfCall = 0;
    }

    public void setPriceOfCall(double priceOfCall) {
        this.priceOfCall = priceOfCall;
    }

    public abstract String getPhoneNum();
    public abstract double getPriceOfCall();
    public abstract void displayInformation();
}
