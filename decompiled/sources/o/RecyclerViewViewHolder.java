package o;

import io.grpc.internal.CallTracer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclerViewViewHolder extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ CallTracer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewViewHolder(CallTracer callTracer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = callTracer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.write.invoke(this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        this.write.invoke(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
