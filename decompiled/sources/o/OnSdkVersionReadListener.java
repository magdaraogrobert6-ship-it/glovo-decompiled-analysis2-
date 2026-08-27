package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSdkVersionReadListener extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$7$2 read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnSdkVersionReadListener(StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = stateProviderImpl$special$$inlined$map$7$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.read.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 89 / 0;
        return this.read.emit(null, this);
    }
}
