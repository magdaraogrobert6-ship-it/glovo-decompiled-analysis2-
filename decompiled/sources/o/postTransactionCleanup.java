package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class postTransactionCleanup extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ androidx.work.impl.WorkerWrapper.Builder serializer;
    public Flow write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public postTransactionCleanup(androidx.work.impl.WorkerWrapper.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.serializer.invoke(this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        this.serializer.invoke(this);
        throw null;
    }
}
