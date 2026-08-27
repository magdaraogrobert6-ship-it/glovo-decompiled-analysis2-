package com.google.android.play.core.install;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import o.WindowWindowInsetsAnimationValues;

/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public InstallException(int i) {
        String strM;
        Locale locale = Locale.getDefault();
        HashMap map = WindowWindowInsetsAnimationValues.IconCompatParcelizer;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = WindowWindowInsetsAnimationValues.RemoteActionCompatParcelizer;
            if (map2.containsKey(numValueOf)) {
                strM = m1$$ExternalSyntheticOutline0.m((String) map.get(numValueOf), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf), ")");
            } else {
                strM = "";
            }
        } else {
            strM = "";
        }
        super(new Status(i, String.format(locale, "Install Error(%d): %s", Integer.valueOf(i), strM), null, null));
        if (i != 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("errorCode should not be 0.");
        throw null;
    }
}
