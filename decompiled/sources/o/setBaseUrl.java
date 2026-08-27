package o;

import com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setBaseUrl extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RiderStateConnectivityObserver$init$2.AnonymousClass1 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBaseUrl(RiderStateConnectivityObserver$init$2.AnonymousClass1 anonymousClass1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(false, (ShortNewsContentCardView) this);
        int i4 = read + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
