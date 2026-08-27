package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class Color extends ContinuationImpl {
    public Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Color(androidx.room.TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.room.TriggerBasedInvalidationTracker.access$checkInvalidatedTables(this.serializer, null, this);
    }
}
