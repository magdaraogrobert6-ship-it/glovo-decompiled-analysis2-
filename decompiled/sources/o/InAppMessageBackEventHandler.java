package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageBackEventHandler extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return androidx.room.Room.awaitClose(null, null, this);
    }

    public InAppMessageBackEventHandler(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
