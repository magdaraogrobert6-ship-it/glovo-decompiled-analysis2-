package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidView_androidKtAndroidView32 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$7$2 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKtAndroidView32(StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = stateProviderImpl$special$$inlined$map$7$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.read.emit(null, this);
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.read.emit(null, this);
        int i3 = serializer + 47;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objEmit;
        }
        throw null;
    }
}
