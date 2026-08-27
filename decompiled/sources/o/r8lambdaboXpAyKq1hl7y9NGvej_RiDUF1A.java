package o;

import io.sentry.util.UrlUtils;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A extends java.lang.ref.WeakReference {
    public generateOetf IconCompatParcelizer;
    public final eotfFunclambda0 read;
    public final boolean write;

    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer = null;
        clear();
    }

    public r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A(eotfFunclambda0 eotffunclambda0, generateEotflambda0 generateeotflambda0, ReferenceQueue referenceQueue) {
        super(generateeotflambda0, referenceQueue);
        UrlUtils.serializer(eotffunclambda0, "Argument must not be null");
        this.read = eotffunclambda0;
        boolean z = generateeotflambda0.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        this.write = z;
    }
}
