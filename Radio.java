public class Radio implements IRadio{

    //Atributos
    private String frequence;
    private double fMActualStation;
    private int aMActualStation;
    private int[] slotsAM;
    private double[] slotsFM;
    private boolean encendido;

    //constructores

    public Radio() {
        frequence = "FM";
        fMActualStation = 87.9;
        aMActualStation = 530;
        slotsAM = new int[12];
        slotsFM = new double[12];
        encendido = false;
    }


    public Radio(String frequence, double fMActualStation, int aMActualStation, int[] slotsAM, double[] slotsFM, boolean encendido) {
        this.frequence = frequence;
        this.fMActualStation = fMActualStation;
        this.aMActualStation = aMActualStation;
        this.slotsAM = slotsAM;
        this.slotsFM = slotsFM;
        this.encendido = encendido;
    }

    //Métodos
    
    @Override
    public void on() {
        // TODO Auto-generated method stub
        this.encendido = true;
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        this.encendido = false;
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return encendido;
    }

    @Override
    public void setFrequence(String freq) throws Exception {
        // TODO Auto-generated method stub
        if(freq.equalsIgnoreCase("AM") || freq.equalsIgnoreCase("FM")){
            this.frequence = freq.toUpperCase();
        }
    }

    @Override
    public String getFrequence() {
        // TODO Auto-generated method stub
        return frequence;
    }

    @Override
    public void Forward() {
        // TODO Auto-generated method stub
        if (this.getFrequence() == "AM" || this.getAMActualStation() < 1610){
            aMActualStation = aMActualStation + 10;
        }
        else if (this.getFrequence() == "AM" || this.getAMActualStation() == 1610){
            aMActualStation = 530;
        }
        else if (this.getFrequence() == "FM" || this.getFMActualStation() < 107.9){
            fMActualStation = fMActualStation + 0.2;
        }
        else if (this.getFrequence() == "FM" || this.getFMActualStation() == 107.9){
            fMActualStation = 87.9;
        } 
    }

    @Override
    public void Backward() {
        // TODO Auto-generated method stub
        if (this.getFrequence() == "AM" || this.getAMActualStation() > 530){
            aMActualStation = aMActualStation - 10;
        }
        else if (this.getFrequence() == "AM" || this.getAMActualStation() == 530){
            aMActualStation = 1610;
        }
        else if (this.getFrequence() == "FM" || this.getFMActualStation() > 87.9){
            fMActualStation = fMActualStation - 0.2;
        }
        else if (this.getFrequence() == "FM" || this.getFMActualStation() == 87.9){
            fMActualStation = 107.9;
        } 
        
    }

    @Override
    public double getFMActualStation() {
        // TODO Auto-generated method stub
        return this.fMActualStation;
    }

    @Override
    public int getAMActualStation() {
        // TODO Auto-generated method stub
        return this.aMActualStation;
    }

    @Override
    public void setFMActualStation(double actualStation) {
        // TODO Auto-generated method stub
        this.fMActualStation = actualStation;
        
    }

    @Override
    public void setAMActualStation(int actualStation) {
        // TODO Auto-generated method stub
        this.aMActualStation = actualStation;
    }

    @Override
    public void saveFMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
        this.slotsFM[slot] = actualStation;
    }

    @Override
    public void saveAMStation(int actualStation, int slot) {
        // TODO Auto-generated method stub
        this.slotsAM[slot] = actualStation;
    }

    @Override
    public double getFMSlot(int slot) {
        // TODO Auto-generated method stub
        return slotsFM[slot];
    }

    @Override
    public int getAMSlot(int slot) {
        // TODO Auto-generated method stub
        return slotsAM[slot];
    }
    
}
