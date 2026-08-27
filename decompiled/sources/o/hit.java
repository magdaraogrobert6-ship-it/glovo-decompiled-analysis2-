package o;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hit {
    public static final CopyOnWriteArrayList write = new CopyOnWriteArrayList();

    public static maxLookaheadIntrinsicHeight RemoteActionCompatParcelizer(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (maxLookaheadIntrinsicHeight maxlookaheadintrinsicheight : write) {
            synchronized (maxlookaheadintrinsicheight) {
                zStartsWith = str.toLowerCase(java.util.Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return maxlookaheadintrinsicheight;
            }
        }
        throw new GeneralSecurityException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No KMS client does support: ", str));
    }
}
