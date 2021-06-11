public interface Diagnosable {
    double getTemperature();

    default boolean hasFever(){
        if(getTemperature() > 100.4)
            return true;
        else
            return false;
    }

    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
    void setSystolic(int s);
    void setDiastolic(int d);

}
