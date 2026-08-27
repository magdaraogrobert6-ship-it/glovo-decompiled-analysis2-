package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeInstanceMethod extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$7$2 IconCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public invokeInstanceMethod(StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = stateProviderImpl$special$$inlined$map$7$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit(null, this);
            int i3 = 29 / 0;
        } else {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit(null, this);
        }
        int i4 = read + 47;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
