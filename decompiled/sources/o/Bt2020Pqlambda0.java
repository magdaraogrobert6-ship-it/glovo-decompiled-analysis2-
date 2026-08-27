package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public enum Bt2020Pqlambda0 {
    SIMULTANEOUSLY,
    INDIVIDUALLY;

    public static Bt2020Pqlambda0 forId(int i) {
        if (i == 1) {
            return SIMULTANEOUSLY;
        }
        if (i == 2) {
            return INDIVIDUALLY;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unknown trim path type "));
        return null;
    }
}
