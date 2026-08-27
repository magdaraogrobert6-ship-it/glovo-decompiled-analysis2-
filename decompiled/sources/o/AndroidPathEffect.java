package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPathEffect {
    public boolean RemoteActionCompatParcelizer;
    public String serializer;
    public boolean write;
    public final AndroidPathEffect_androidKt IconCompatParcelizer = new AndroidPathEffect_androidKt();
    public int read = -1;

    public final void RemoteActionCompatParcelizer(int i) {
        this.read = i;
        this.write = false;
    }

    public final void serializer(String str) {
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot pop up to an empty route");
        } else {
            this.serializer = str;
            this.write = false;
        }
    }
}
