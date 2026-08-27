package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class selectItem {
    public static final selectItem read = new selectItem("falcon-512", 9);
    public static final selectItem serializer = new selectItem("falcon-1024", 10);
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    public selectItem(String str, int i) {
        if (i < 1 || i > 10) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Log N degree should be between 1 and 10");
            throw null;
        }
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = i;
    }
}
