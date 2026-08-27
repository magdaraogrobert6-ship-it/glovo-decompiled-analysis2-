package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetFlatcp extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ androidx.compose.material3.FloatingActionButtonElevationAnimatable serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetFlatcp(androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.snapElevation(this);
    }
}
