package o;

import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class reflectiveQuadToRelative extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ HitEventFactory serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reflectiveQuadToRelative(HitEventFactory hitEventFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = hitEventFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return HitEventFactory.access$evaluatePredicate(this.serializer, 0, null, null, this);
    }
}
