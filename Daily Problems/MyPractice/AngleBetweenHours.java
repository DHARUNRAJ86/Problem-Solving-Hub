class AngleBetweenHours{
    public static void main(String[] args){
        int hour=12;
        int minutes=30;
        double ans=angleBetweenHours(hour,minutes);
        System.out.println(ans);
    }
    public static double angleBetweenHours(int hour,int minutes){
        int minute =minutes*6;
        double hours =(hour*30)+(minutes*0.5);
        double ans = Math.abs(hours-minute);
        return Math.min(ans,360-ans);
    }
}