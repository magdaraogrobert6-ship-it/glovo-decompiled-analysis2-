package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaSdLB8He51_fnZHUESctgYSoqgpg extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public TextAnnouncementContentCardView read;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return TextStreamsKt.access$scheduleTask$task(null, null, null, this);
    }

    public r8lambdaSdLB8He51_fnZHUESctgYSoqgpg(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
