package o;

import com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilNetworking2 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return DetectZoomableGesturesKt.consumeAllEventsUntilReleased(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        DetectZoomableGesturesKt.consumeAllEventsUntilReleased(null, this);
        throw null;
    }

    public UtilNetworking2(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
