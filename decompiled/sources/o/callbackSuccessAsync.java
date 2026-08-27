package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class callbackSuccessAsync extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$7$2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public callbackSuccessAsync(StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = stateProviderImpl$special$$inlined$map$7$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = read + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
            int i3 = 5 / 0;
        } else {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
        }
        int i4 = read + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return objEmit;
    }
}
