package o;

import com.roadrunner.delivery.state.StateDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toNestedScrollSource extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ StateDataStoreImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toNestedScrollSource(StateDataStoreImpl stateDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = stateDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objStoreState = this.write.storeState(null, this);
        int i4 = read + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objStoreState;
        }
        throw null;
    }
}
