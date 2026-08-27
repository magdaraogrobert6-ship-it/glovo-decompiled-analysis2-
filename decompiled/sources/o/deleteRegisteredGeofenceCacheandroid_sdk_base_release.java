package o;

import android.content.Context;
import com.roadrunner.twofa.data.entity.TwoFaTimerDataStore$get$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteRegisteredGeofenceCacheandroid_sdk_base_release extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public static int MediaSessionCompatQueueItem;
    public static int RatingCompat;
    public FlowCollector IconCompatParcelizer;
    public final /* synthetic */ TwoFaTimerDataStore$get$$inlined$map$1$2 MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deleteRegisteredGeofenceCacheandroid_sdk_base_release(TwoFaTimerDataStore$get$$inlined$map$1$2 twoFaTimerDataStore$get$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaMetadataCompat = twoFaTimerDataStore$get$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.MediaMetadataCompat.emit(null, this);
            int i3 = 9 / 0;
        } else {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.MediaMetadataCompat.emit(null, this);
        }
        int i4 = MediaDescriptionCompat + 109;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }

    public static int read() {
        int i = RatingCompat;
        int i2 = i % 9641619;
        RatingCompat = i + 1;
        if (i2 != 0) {
            return MediaSessionCompatQueueItem;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        MediaSessionCompatQueueItem = i3;
        return i3;
    }
}
