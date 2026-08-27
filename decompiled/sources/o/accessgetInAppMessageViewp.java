package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetInAppMessageViewp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ accessgetInAppMessageViewp(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        long j;
        int i = this.read;
        if (i == 0) {
            CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            cancellableContinuationImpl.resumeWith(createfromparcel);
            return createfromparcel;
        }
        if (i == 1) {
            ((getBirthDateMonth) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
            return createFromParcel.INSTANCE;
        }
        getFontScale getfontscale = (getFontScale) obj;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            j = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
            getOffsetF1C5BW0.MediaSessionCompatQueueItem = 1 + j;
        }
        return new getColor0d7_KjU(j, getfontscale, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer);
    }
}
