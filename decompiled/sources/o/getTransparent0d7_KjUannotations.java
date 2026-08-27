package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class getTransparent0d7_KjUannotations {
    public static final void RemoteActionCompatParcelizer(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static byte[] write(getContact getcontact) {
        if (getcontact.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("private key found");
            return null;
        }
        try {
            return getBlue0d7_KjU.write(getcontact).MediaBrowserCompatMediaItem();
        } catch (Exception unused) {
            return null;
        }
    }
}
