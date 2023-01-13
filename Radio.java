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
        
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setFrequence(String freq) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getFrequence() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void Forward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Backward() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getFMActualStation() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAMActualStation() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setFMActualStation(double actualStation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAMActualStation(int actualStation) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveFMStation(double actualStation, int slot) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveAMStation(int actualStation, int slot) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getFMSlot(int slot) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAMSlot(int slot) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
