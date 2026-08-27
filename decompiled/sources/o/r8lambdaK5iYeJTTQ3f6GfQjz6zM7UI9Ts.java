package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public FlowCollector RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaK5iYeJTTQ3f6GfQjz6zM7UI9Ts(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 81;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit((Object) null, this);
        int i4 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return objEmit;
    }
}
