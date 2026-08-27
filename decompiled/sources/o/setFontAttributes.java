package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setFontAttributes extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int read;
    public getWordBreakjp8hJ3c IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ androidx.work.impl.WorkerWrapper.Builder write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFontAttributes(androidx.work.impl.WorkerWrapper.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return androidx.work.impl.WorkerWrapper.Builder.access$isDestinationPreviewAllowed(this.write, null, null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        androidx.work.impl.WorkerWrapper.Builder.access$isDestinationPreviewAllowed(this.write, null, null, this);
        obj2.hashCode();
        throw null;
    }
}
