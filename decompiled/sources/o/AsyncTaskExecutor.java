package o;

import com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskExecutor extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public AsyncTaskExecutor1 IconCompatParcelizer;
    public /* synthetic */ Object read;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return DetectZoomableGesturesKt.awaitTouchSlop(null, this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 16 / 0;
        return DetectZoomableGesturesKt.awaitTouchSlop(null, this);
    }

    public AsyncTaskExecutor(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
