package application;

public class Clan {
    private String clan;
    private Integer jmhMbr,th,lv,pr;
    public Clan(){
		this.clan = "";
		this.jmhMbr = 0;
		this.th = 0;
		this.lv = 0;
		this.pr = 0;
	}
	public Clan(String clan,int jmhMbr, int th, int lv, int pr){
		this.clan = clan;
		this.jmhMbr = jmhMbr;
		this.th = th;
		this.lv = lv;
		this.pr = pr;
	}
	public String getClan() {
        return clan;
    }
    public void setClan(String clan) {
        this.clan = clan;
    }
    public int getJmhMbr() {
        return jmhMbr;
    }
    public void setJmhMbr(int jmhMbr) {
        this.jmhMbr = jmhMbr;
    }
