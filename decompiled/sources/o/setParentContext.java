package o;

import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes4.dex */
public final class setParentContext implements forceAccessibilityForTesting {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final zzbv write;

    public /* synthetic */ setParentContext(int i, zzbv zzbvVar) {
        this.RemoteActionCompatParcelizer = i;
        this.write = zzbvVar;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.RemoteActionCompatParcelizer;
        zzbv zzbvVar = this.write;
        if (i != 0) {
            AbstractComposeView abstractComposeView = (AbstractComposeView) zzbvVar.write;
            setNativeShader.RemoteActionCompatParcelizer(abstractComposeView);
            return abstractComposeView;
        }
        hasui hasuiVar = (hasui) zzbvVar.RemoteActionCompatParcelizer;
        setNativeShader.RemoteActionCompatParcelizer(hasuiVar);
        return hasuiVar;
    }
}
