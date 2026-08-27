package o;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class component5impl extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowUtil$createFlow$$inlined$map$1.AnonymousClass2 read;
    public FlowCollector serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component5impl(FlowUtil$createFlow$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.emit(null, this);
    }
}
