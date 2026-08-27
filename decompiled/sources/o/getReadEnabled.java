package o;

import com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getReadEnabled extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1.AnonymousClass2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReadEnabled(OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.serializer.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        int i3 = 43 / 0;
        return this.serializer.emit(null, this);
    }
}
