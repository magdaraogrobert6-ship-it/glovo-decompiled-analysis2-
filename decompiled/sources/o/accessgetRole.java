package o;

import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetRole extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public final /* synthetic */ TraceTimeMeasurementWithPerformanceKit MediaDescriptionCompat;
    public boolean RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public String serializer;
    public SemanticsOwner write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetRole(TraceTimeMeasurementWithPerformanceKit traceTimeMeasurementWithPerformanceKit, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaDescriptionCompat = traceTimeMeasurementWithPerformanceKit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.MediaDescriptionCompat.ofSuspend(null, null, this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 95 / 0;
        return this.MediaDescriptionCompat.ofSuspend(null, null, this);
    }
}
