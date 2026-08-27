package o;

import android.os.Process;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SubcomposeContentPainterElement extends ContinuationImpl {
    public static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public static int read;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeContentPainterElement(GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.write.emit(null, this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.write.emit(null, this);
        int i3 = MediaBrowserCompatMediaItem + 107;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objEmit;
        }
        throw null;
    }

    public static int read() {
        int i = IconCompatParcelizer;
        int i2 = i % 5096849;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        read = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
