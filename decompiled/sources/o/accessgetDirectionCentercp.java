package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetDirectionCentercp {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<accessgetDirectionCentercp> valueMap;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    accessgetDirectionCentercp(int i) {
        this.value = i;
    }

    static {
        accessgetDirectionCentercp accessgetdirectioncentercp = DEFAULT;
        accessgetDirectionCentercp accessgetdirectioncentercp2 = UNMETERED_ONLY;
        accessgetDirectionCentercp accessgetdirectioncentercp3 = UNMETERED_OR_DAILY;
        accessgetDirectionCentercp accessgetdirectioncentercp4 = FAST_IF_RADIO_AWAKE;
        accessgetDirectionCentercp accessgetdirectioncentercp5 = NEVER;
        accessgetDirectionCentercp accessgetdirectioncentercp6 = UNRECOGNIZED;
        SparseArray<accessgetDirectionCentercp> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, accessgetdirectioncentercp);
        sparseArray.put(1, accessgetdirectioncentercp2);
        sparseArray.put(2, accessgetdirectioncentercp3);
        sparseArray.put(3, accessgetdirectioncentercp4);
        sparseArray.put(4, accessgetdirectioncentercp5);
        sparseArray.put(-1, accessgetdirectioncentercp6);
    }

    public static accessgetDirectionCentercp forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }
}
