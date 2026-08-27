package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetDeletecp {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    public static final accessgetDeletecp MOBILE_HIPRI;
    public static final accessgetDeletecp WIMAX;
    private static final SparseArray<accessgetDeletecp> valueMap;
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static accessgetDeletecp forNumber(int i) {
        return valueMap.get(i);
    }

    accessgetDeletecp(int i) {
        this.value = i;
    }

    static {
        accessgetDeletecp accessgetdeletecp = MOBILE;
        accessgetDeletecp accessgetdeletecp2 = WIFI;
        accessgetDeletecp accessgetdeletecp3 = MOBILE_MMS;
        accessgetDeletecp accessgetdeletecp4 = MOBILE_SUPL;
        accessgetDeletecp accessgetdeletecp5 = MOBILE_DUN;
        accessgetDeletecp accessgetdeletecp6 = MOBILE_HIPRI;
        MOBILE_HIPRI = accessgetdeletecp6;
        accessgetDeletecp accessgetdeletecp7 = WIMAX;
        WIMAX = accessgetdeletecp7;
        accessgetDeletecp accessgetdeletecp8 = BLUETOOTH;
        accessgetDeletecp accessgetdeletecp9 = DUMMY;
        accessgetDeletecp accessgetdeletecp10 = ETHERNET;
        accessgetDeletecp accessgetdeletecp11 = MOBILE_FOTA;
        accessgetDeletecp accessgetdeletecp12 = MOBILE_IMS;
        accessgetDeletecp accessgetdeletecp13 = MOBILE_CBS;
        accessgetDeletecp accessgetdeletecp14 = WIFI_P2P;
        accessgetDeletecp accessgetdeletecp15 = MOBILE_IA;
        accessgetDeletecp accessgetdeletecp16 = MOBILE_EMERGENCY;
        accessgetDeletecp accessgetdeletecp17 = PROXY;
        accessgetDeletecp accessgetdeletecp18 = VPN;
        accessgetDeletecp accessgetdeletecp19 = NONE;
        SparseArray<accessgetDeletecp> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, accessgetdeletecp);
        sparseArray.put(1, accessgetdeletecp2);
        sparseArray.put(2, accessgetdeletecp3);
        sparseArray.put(3, accessgetdeletecp4);
        sparseArray.put(4, accessgetdeletecp5);
        sparseArray.put(5, accessgetdeletecp6);
        sparseArray.put(6, accessgetdeletecp7);
        sparseArray.put(7, accessgetdeletecp8);
        sparseArray.put(8, accessgetdeletecp9);
        sparseArray.put(9, accessgetdeletecp10);
        sparseArray.put(10, accessgetdeletecp11);
        sparseArray.put(11, accessgetdeletecp12);
        sparseArray.put(12, accessgetdeletecp13);
        sparseArray.put(13, accessgetdeletecp14);
        sparseArray.put(14, accessgetdeletecp15);
        sparseArray.put(15, accessgetdeletecp16);
        sparseArray.put(16, accessgetdeletecp17);
        sparseArray.put(17, accessgetdeletecp18);
        sparseArray.put(-1, accessgetdeletecp19);
    }
}
