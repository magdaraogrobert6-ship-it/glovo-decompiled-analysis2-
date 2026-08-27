package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class NativeCanvasannotations extends ContinuationImpl {
    public final /* synthetic */ androidx.lifecycle.CoroutineLiveData IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCanvasannotations(androidx.lifecycle.CoroutineLiveData coroutineLiveData, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = coroutineLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.clearSource$lifecycle_livedata(this);
        return createFromParcel.INSTANCE;
    }
}
