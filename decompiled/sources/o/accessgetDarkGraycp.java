package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetDarkGraycp extends ContinuationImpl {
    public accessgetMagentacp IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDarkGraycp(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$notifyInvalidation(this.read, this);
    }
}
