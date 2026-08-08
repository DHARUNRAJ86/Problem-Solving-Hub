class TrafficSignal{
    public static void main(String[] args){
        int timer=60;
        System.out.println(trafficSignal(timer));
    }
     public static String trafficSignal(int timer) {
        if(timer == 0){
            return "Green";
        }
        else if(timer == 30){
            return "Orange";
        }
        else if(timer>30 && timer<=90){
            return "Red";
        }
        else{
            return "Invalid";
        }
    }
}