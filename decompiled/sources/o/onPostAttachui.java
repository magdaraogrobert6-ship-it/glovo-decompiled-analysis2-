package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onPostAttachui implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ setRootAutofillId IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ onPostAttachui(setRootAutofillId setrootautofillid, int i) {
        this.read = i;
        this.IconCompatParcelizer = setrootautofillid;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        setRootAutofillId setrootautofillid = this.IconCompatParcelizer;
        if (i != 0) {
            setrootautofillid.write();
            return Boolean.TRUE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = setrootautofillid.serializer;
        if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
            cancellableContinuationImpl.resumeWith(performAutofill.ActionPerformed);
        }
        return createFromParcel.INSTANCE;
    }
}
