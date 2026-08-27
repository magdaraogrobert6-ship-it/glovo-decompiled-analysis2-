package o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BrazeInAppMessageManagerCompanion implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ BrazeInAppMessageManagerCompanion(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            char cCharValue = ((Character) obj).charValue();
            return Boolean.valueOf('0' <= cCharValue && cCharValue < ':');
        }
        if (i != 1) {
            ((ApiExceptionSessionExpired) obj).getClass();
            return Boolean.TRUE;
        }
        ApiExceptionSessionExpired apiExceptionSessionExpired = (ApiExceptionSessionExpired) obj;
        apiExceptionSessionExpired.getClass();
        RecyclableBufferedInputStream recyclableBufferedInputStream = MessageCompanion.write;
        return Boolean.valueOf(accessisMainThread.write(apiExceptionSessionExpired.read));
    }
}
