package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw extends ContinuationImpl {
    public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return TimeoutKt.withTimeoutOrNull(0L, null, this);
    }

    public r8lambda9SPaaa95c4VoMes3ivZmM9YlsUw(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
