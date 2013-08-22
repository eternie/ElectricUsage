package co.akabe.common.electricusage;

public class PeakDemandH extends PeakDemand {
	/**
     * コンストラクタ
     * @param tm 明記されているピーク時刻
     * @param am ピーク時電力量
     */
    public PeakDemandH (String tm, float am) {
            super(tm, (int)am);
            time = tm;
    }

    /**
     * コンストラクタ
     * @param tm 明記されているピーク時刻
     * @param ams ピーク時電力量
     */
    public PeakDemandH (String tm, String ams) {
            this(tm, Float.parseFloat(ams));
    }
}
