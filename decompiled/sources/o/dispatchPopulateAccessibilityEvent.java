package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class dispatchPopulateAccessibilityEvent extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$7$2 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dispatchPopulateAccessibilityEvent(StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = stateProviderImpl$special$$inlined$map$7$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
