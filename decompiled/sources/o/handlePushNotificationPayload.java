package o;

import android.media.AudioManager;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MobileCallDetector")
public class handlePushNotificationPayload extends r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY {
    private final AudioManager IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;

    @Override // o.BrazeNotificationUtilsWhenMappings
    public final byte write() {
        return (byte) 1;
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final String MediaBrowserCompatMediaItem() {
        return "mobile";
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final String MediaSessionCompatQueueItem() {
        return "MobileCallDetector";
    }

    @Override // o.r8lambdaExYIBV8U5_52rTIO9kgIdkXJYYY
    public final void RemoteActionCompatParcelizer(int i) {
        boolean z = this.serializer;
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.RemoteActionCompatParcelizer;
        if (z && i != 2) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            write(System.currentTimeMillis());
        } else {
            if (z || i != 2) {
                return;
            }
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            RemoteActionCompatParcelizer(System.currentTimeMillis());
        }
    }

    public final Byte serializer() {
        return this.IconCompatParcelizer.getMode() == 2 ? (byte) 1 : null;
    }

    public handlePushNotificationPayload(AudioManager audioManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy) {
        super(audioManager, readandroid_sdk_base_releaseVar, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parselonglambda0, getverticalaccuracy);
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = audioManager;
    }
}
