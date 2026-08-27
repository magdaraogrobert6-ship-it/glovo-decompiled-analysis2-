package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4;

/* JADX INFO: loaded from: classes4.dex */
public final class SendingCollector<T> implements FlowCollector<T> {
    public final r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 write;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object objSerializer = this.write.serializer(obj, shortNewsContentCardView);
        return objSerializer == CoroutineSingletons.COROUTINE_SUSPENDED ? objSerializer : createFromParcel.INSTANCE;
    }

    public SendingCollector(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
        this.write = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }
}
