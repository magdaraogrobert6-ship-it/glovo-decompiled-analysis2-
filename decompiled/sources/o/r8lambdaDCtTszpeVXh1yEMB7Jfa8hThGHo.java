package o;

import android.media.AudioManager;
import android.os.SystemClock;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "VoipCallDetector")
public class r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo extends r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY {
    public static int read;
    public static int write;
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final AudioManager MediaBrowserCompatMediaItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final r8lambdaPEKLZSS3x8gRcg7wX1Ah0ngFykY RemoteActionCompatParcelizer;

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final boolean MediaDescriptionCompat() {
        synchronized (this) {
            if (!super.MediaDescriptionCompat()) {
                return false;
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            return true;
        }
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final boolean MediaMetadataCompat() {
        synchronized (this) {
            if (!super.MediaMetadataCompat()) {
                return false;
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, this.RemoteActionCompatParcelizer);
            return true;
        }
    }

    @Override // o.BrazeNotificationUtilsWhenMappings
    public final byte write() {
        return (byte) 2;
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final String MediaBrowserCompatMediaItem() {
        return "VoIP";
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final String MediaSessionCompatQueueItem() {
        return "VoipCallDetector";
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final void RemoteActionCompatParcelizer(int i) {
        boolean z = this.serializer;
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.MediaSessionCompatQueueItem;
        if (z && (i == 0 || i == 2)) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            write(System.currentTimeMillis());
        } else {
            if (z || i != 3) {
                return;
            }
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            RemoteActionCompatParcelizer(System.currentTimeMillis());
        }
    }

    public final Byte serializer() {
        return this.MediaBrowserCompatMediaItem.getMode() == 3 ? (byte) 2 : null;
    }

    public r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo(AudioManager audioManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations) {
        super(audioManager, readandroid_sdk_base_releaseVar, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parselonglambda0, getverticalaccuracy);
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = audioManager;
        this.RemoteActionCompatParcelizer = new r8lambdaPEKLZSS3x8gRcg7wX1Ah0ngFykY(this, readandroid_sdk_base_releaseVar);
    }

    public static int PlaybackStateCompat() {
        int i = write;
        int i2 = i % 9457061;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        read = iUptimeMillis;
        return iUptimeMillis;
    }
}
