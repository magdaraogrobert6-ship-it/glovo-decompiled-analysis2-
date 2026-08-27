package o;

import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getContainsCenter extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ BackToBackOrdersDataRepositoryImpl read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getContainsCenter(BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = backToBackOrdersDataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.read.updateRiderState(this);
        }
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.read.updateRiderState(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
