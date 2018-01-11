/*
 * Man
 */
package family;

/**
 *
 * @author Amastasia
 */
public class Man extends Thread{
    private VacuumCleaner vc;
    private Women w;
    private Tv tv;
    
    public Man(VacuumCleaner v, Women women, Tv televizor){
        vc = v;
        w = women;
        tv = televizor;
    }
   
    @Override
    public void run(){
        cleaning(vc);
        watchingTv(tv,w);
}
    public void cleaning (VacuumCleaner vc){
        vc.setIsCleaning(Boolean.TRUE);
    }
    private void watchingTv(Tv tv, Women w){
        while (true){
            if(tv.getIsFavoriteShow()== true)
                w.setIsSleepeng(Boolean.FALSE);
                break;
        }
}
}
