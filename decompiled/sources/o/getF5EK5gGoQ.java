package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class getF5EK5gGoQ implements accessgetNumPadCommacp {
    public final getF7EK5gGoQ IconCompatParcelizer;
    public final Status read;
    public final int serializer;
    public final applyDisplayCutoutMarginsToContentArealambda0 write;

    @Override // o.accessgetNumPadCommacp
    public final Status getStatus() {
        return this.read;
    }

    public getF5EK5gGoQ(Status status, int i, getF7EK5gGoQ getf7ek5ggoq, applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0) {
        this.read = status;
        this.serializer = i;
        this.IconCompatParcelizer = getf7ek5ggoq;
        this.write = applydisplaycutoutmarginstocontentarealambda0;
    }

    public final String serializer() {
        int i = this.serializer;
        if (i == 0) {
            return "Network";
        }
        if (i == 1) {
            return "Saved file on disk";
        }
        if (i == 2) {
            return "Default resource";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Resource source is unknown.");
        return null;
    }
}
