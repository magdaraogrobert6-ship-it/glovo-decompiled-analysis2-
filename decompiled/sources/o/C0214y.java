package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: o.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0214y extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$7$2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214y(StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = stateProviderImpl$special$$inlined$map$7$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
            int i3 = 61 / 0;
        } else {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
        }
        int i4 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return objEmit;
    }
}
