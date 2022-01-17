public class IPTV extends ColorTv{
    private String address;

    public IPTV(String address,int size,int color) {
        super(size,color);
        this.address=address;
    }

    @Override
    public void printProperty() {
        System.out.print("나의 IPTV는 "+address+" 주소의 ");
        super.printProperty();
    }

}
