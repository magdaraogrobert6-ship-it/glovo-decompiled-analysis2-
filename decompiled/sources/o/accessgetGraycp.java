package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetGraycp extends ContinuationImpl {
    public final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker IconCompatParcelizer;
    public accessgetMagentacp RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetGraycp(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.syncTriggers$room_runtime(this);
    }
}
