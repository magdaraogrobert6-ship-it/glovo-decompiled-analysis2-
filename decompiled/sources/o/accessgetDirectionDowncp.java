package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetDirectionDowncp {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_0(5),
    /* JADX INFO: Fake field, exist only in values array */
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    public static final accessgetDirectionDowncp EVDO_0;
    public static final accessgetDirectionDowncp EVDO_A;
    private static final SparseArray<accessgetDirectionDowncp> valueMap;
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static accessgetDirectionDowncp forNumber(int i) {
        return valueMap.get(i);
    }

    accessgetDirectionDowncp(int i) {
        this.value = i;
    }

    static {
        accessgetDirectionDowncp accessgetdirectiondowncp = UNKNOWN_MOBILE_SUBTYPE;
        accessgetDirectionDowncp accessgetdirectiondowncp2 = GPRS;
        accessgetDirectionDowncp accessgetdirectiondowncp3 = EDGE;
        accessgetDirectionDowncp accessgetdirectiondowncp4 = UMTS;
        accessgetDirectionDowncp accessgetdirectiondowncp5 = CDMA;
        accessgetDirectionDowncp accessgetdirectiondowncp6 = EVDO_0;
        EVDO_0 = accessgetdirectiondowncp6;
        accessgetDirectionDowncp accessgetdirectiondowncp7 = EVDO_A;
        EVDO_A = accessgetdirectiondowncp7;
        accessgetDirectionDowncp accessgetdirectiondowncp8 = RTT;
        accessgetDirectionDowncp accessgetdirectiondowncp9 = HSDPA;
        accessgetDirectionDowncp accessgetdirectiondowncp10 = HSUPA;
        accessgetDirectionDowncp accessgetdirectiondowncp11 = HSPA;
        accessgetDirectionDowncp accessgetdirectiondowncp12 = IDEN;
        accessgetDirectionDowncp accessgetdirectiondowncp13 = EVDO_B;
        accessgetDirectionDowncp accessgetdirectiondowncp14 = LTE;
        accessgetDirectionDowncp accessgetdirectiondowncp15 = EHRPD;
        accessgetDirectionDowncp accessgetdirectiondowncp16 = HSPAP;
        accessgetDirectionDowncp accessgetdirectiondowncp17 = GSM;
        accessgetDirectionDowncp accessgetdirectiondowncp18 = TD_SCDMA;
        accessgetDirectionDowncp accessgetdirectiondowncp19 = IWLAN;
        accessgetDirectionDowncp accessgetdirectiondowncp20 = LTE_CA;
        SparseArray<accessgetDirectionDowncp> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, accessgetdirectiondowncp);
        sparseArray.put(1, accessgetdirectiondowncp2);
        sparseArray.put(2, accessgetdirectiondowncp3);
        sparseArray.put(3, accessgetdirectiondowncp4);
        sparseArray.put(4, accessgetdirectiondowncp5);
        sparseArray.put(5, accessgetdirectiondowncp6);
        sparseArray.put(6, accessgetdirectiondowncp7);
        sparseArray.put(7, accessgetdirectiondowncp8);
        sparseArray.put(8, accessgetdirectiondowncp9);
        sparseArray.put(9, accessgetdirectiondowncp10);
        sparseArray.put(10, accessgetdirectiondowncp11);
        sparseArray.put(11, accessgetdirectiondowncp12);
        sparseArray.put(12, accessgetdirectiondowncp13);
        sparseArray.put(13, accessgetdirectiondowncp14);
        sparseArray.put(14, accessgetdirectiondowncp15);
        sparseArray.put(15, accessgetdirectiondowncp16);
        sparseArray.put(16, accessgetdirectiondowncp17);
        sparseArray.put(17, accessgetdirectiondowncp18);
        sparseArray.put(18, accessgetdirectiondowncp19);
        sparseArray.put(19, accessgetdirectiondowncp20);
    }
}
