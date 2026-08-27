package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetContactscp {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<accessgetContactscp> valueMap;
    private final int value;

    public int getValue() {
        return this.value;
    }

    public static accessgetContactscp forNumber(int i) {
        return valueMap.get(i);
    }

    accessgetContactscp(int i) {
        this.value = i;
    }

    static {
        accessgetContactscp accessgetcontactscp = NOT_SET;
        accessgetContactscp accessgetcontactscp2 = EVENT_OVERRIDE;
        SparseArray<accessgetContactscp> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, accessgetcontactscp);
        sparseArray.put(5, accessgetcontactscp2);
    }
}
