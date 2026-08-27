package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class wlambda0 {
    public static brazelog IconCompatParcelizer(int i) {
        brazelog brazelogVar;
        brazelog[] brazelogVarArrValues = brazelog.values();
        int length = brazelogVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                brazelogVar = null;
                break;
            }
            brazelogVar = brazelogVarArrValues[i2];
            if (brazelogVar.getValue() == i) {
                break;
            }
            i2++;
        }
        if (brazelogVar != null) {
            return brazelogVar;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected Java day of week: Expected range is [1-7]");
        return null;
    }
}
