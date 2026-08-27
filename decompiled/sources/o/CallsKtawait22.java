package o;

import com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CallsKtawait22 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1.AnonymousClass2 RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallsKtawait22(OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i4 = write + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return objEmit;
    }
}
