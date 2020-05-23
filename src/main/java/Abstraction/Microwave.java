package Abstraction;

public class Microwave {
    private String tempe;
    private String program;
    private int time;
    private boolean status;

    public Microwave(String tempe, String program, int time, boolean status) {
        this.tempe = tempe;
        this.program = program;
        this.time = time;
        this.status = status;
    }

    public boolean turnOn(){
        this.status = true;
        return true;
    }

    public boolean turnOff(){
        this.status = false;
        return false;
    }

    private String turnOnMicrowaveHeatingSystem(){
        return "Starting On Heating System ";
    }

    private String loadingDeFreezingProgram(){
        return "Loading Program "+this.program;
    }

    private String setTimer(){
        return "Setting de-freezing time on "+this.time + " seconds";
    }

    public String deFreeze(){
        System.out.println( this.loadingDeFreezingProgram());
        System.out.println( this.setTimer());
        return "I am de-freezing the food at " + this.tempe + " using the program "+this.program;
    }
}
