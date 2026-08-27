package o;

import android.app.Application;
import android.media.SoundPool;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToFeatureFlagsUpdateslambda2 implements subscribeToPushNotificationEventslambda1 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU IconCompatParcelizer;
    public volatile SoundPool MediaDescriptionCompat;
    public final getContentViewGroupParentLayout read;
    public final Application write;
    public final Object serializer = new Object();
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new subscribeToFeatureFlagsUpdateslambda1(8));

    @Override // o.subscribeToPushNotificationEventslambda1
    public final void read() {
        synchronized (this.serializer) {
            SoundPool soundPool = this.MediaDescriptionCompat;
            if (soundPool != null) {
                soundPool.release();
            }
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.IconCompatParcelizer;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            this.MediaDescriptionCompat = null;
        }
    }

    public subscribeToFeatureFlagsUpdateslambda2(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.write = application;
        this.read = getcontentviewgroupparentlayout;
    }

    @Override // o.subscribeToPushNotificationEventslambda1
    public final void read(int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 25;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 != 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.IconCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.read, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RxConvertKt$asSingle$1(this, i, shortNewsContentCardView, 13), 2);
            int i4 = MediaBrowserCompatMediaItem + 73;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }
}
