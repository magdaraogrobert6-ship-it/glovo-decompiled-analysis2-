package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isNonLinearFontScalingActive extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isNonLinearFontScalingActive(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit(null, this);
            int i3 = 64 / 0;
        } else {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit(null, this);
        }
        int i4 = write + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
