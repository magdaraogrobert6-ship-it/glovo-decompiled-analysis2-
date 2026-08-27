package o;

import com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilNetworkingIConnectionOptions extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            DetectZoomableGesturesKt.awaitEvent(null, this);
            throw null;
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAwaitEvent = DetectZoomableGesturesKt.awaitEvent(null, this);
        int i3 = read + 59;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return objAwaitEvent;
    }

    public UtilNetworkingIConnectionOptions(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
