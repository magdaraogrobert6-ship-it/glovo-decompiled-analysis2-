package o;

import kotlin.TuplesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class getMagenta0d7_KjUannotations extends ContinuationImpl {
    public int IconCompatParcelizer;
    public androidx.room.RoomDatabase read;
    public /* synthetic */ Object serializer;
    public SuspendLambda write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return TuplesKt.performInTransactionSuspending(null, null, this);
    }

    public getMagenta0d7_KjUannotations(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
