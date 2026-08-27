package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class withSignqCeQghg {
    public final toDoubleimpl IconCompatParcelizer;
    public final String read;
    public final String write;

    public withSignqCeQghg(String str, toDoubleimpl todoubleimpl) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Path should start with a slash '/'.");
            throw null;
        }
        if (!str.endsWith("/")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Path should end with a slash '/'");
            throw null;
        }
        this.write = com.braze.support.WebContentUtils.ASSET_LOADER_DUMMY_DOMAIN;
        this.read = str;
        this.IconCompatParcelizer = todoubleimpl;
    }
}
