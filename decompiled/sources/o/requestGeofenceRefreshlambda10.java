package o;

import com.roadrunner.twofa.data.entity.TwoFaTimerDataStore$get$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class requestGeofenceRefreshlambda10 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ TwoFaTimerDataStore$get$$inlined$map$1$2 RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public FlowCollector write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public requestGeofenceRefreshlambda10(TwoFaTimerDataStore$get$$inlined$map$1$2 twoFaTimerDataStore$get$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = twoFaTimerDataStore$get$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.emit(null, this);
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
