package o;

import android.app.Application;
import android.media.AudioAttributes;
import android.media.SoundPool;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToContentCardsUpdateslambda2 implements subscribeToPushNotificationEventslambda1 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public SoundPool RemoteActionCompatParcelizer;
    public final Application read;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU serializer;
    public final getContentViewGroupParentLayout write;

    public subscribeToContentCardsUpdateslambda2(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.read = application;
        this.write = getcontentviewgroupparentlayout;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new subscribeToFeatureFlagsUpdateslambda1(0));
        this.IconCompatParcelizer = isadapterpositiononscreen;
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes((AudioAttributes) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).build();
        soundPoolBuild.getClass();
        this.RemoteActionCompatParcelizer = soundPoolBuild;
    }

    @Override // o.subscribeToPushNotificationEventslambda1
    public final void read() {
        int i = 2 % 2;
        SoundPool soundPool = this.RemoteActionCompatParcelizer;
        if (soundPool != null) {
            int i2 = MediaSessionCompatQueueItem + 115;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                soundPool.release();
                throw null;
            }
            soundPool.release();
            int i3 = RatingCompat + 69;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i5 = MediaSessionCompatQueueItem + 95;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // o.subscribeToPushNotificationEventslambda1
    public final void read(int i) {
        int i2 = 2 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
            if (this.RemoteActionCompatParcelizer == null) {
                SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes((AudioAttributes) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).build();
                soundPoolBuild.getClass();
                this.RemoteActionCompatParcelizer = soundPoolBuild;
                int i3 = MediaSessionCompatQueueItem + 7;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            this.serializer = BuildersKt.RemoteActionCompatParcelizer(this.write, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new RxConvertKt$asSingle$1(this, i, null, 12), 2);
            int i5 = MediaSessionCompatQueueItem + 123;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }
}
