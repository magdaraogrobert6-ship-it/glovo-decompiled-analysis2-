package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public enum accessgetDstAtopcp {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    public long getValue() {
        return this.mValue;
    }

    accessgetDstAtopcp(long j) {
        this.mValue = j;
    }

    public static accessgetDstAtopcp fromValue(long j) {
        accessgetDstAtopcp[] accessgetdstatopcpArrValues = values();
        for (int i = 0; i < accessgetdstatopcpArrValues.length; i++) {
            if (accessgetdstatopcpArrValues[i].getValue() == j) {
                return accessgetdstatopcpArrValues[i];
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "Unsupported FileSection Type "));
        return null;
    }
}
