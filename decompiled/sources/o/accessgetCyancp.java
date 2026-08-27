package o;

import androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetCyancp extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1$2 read;
    public int[] serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetCyancp(TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = triggerBasedInvalidationTracker$createFlow$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.emit((int[]) null, (ShortNewsContentCardView) this);
    }
}
