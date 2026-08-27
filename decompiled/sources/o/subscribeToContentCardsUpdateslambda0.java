package o;

import android.media.Ringtone;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.util.sound.DefaultBackgroundSoundManager;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToContentCardsUpdateslambda0 implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final DefaultBackgroundSoundManager IconCompatParcelizer;
    public final subscribeToNetworkFailureslambda0 read;

    public subscribeToContentCardsUpdateslambda0(DefaultBackgroundSoundManager defaultBackgroundSoundManager, subscribeToNetworkFailureslambda0 subscribetonetworkfailureslambda0) {
        defaultBackgroundSoundManager.getClass();
        this.IconCompatParcelizer = defaultBackgroundSoundManager;
        this.read = subscribetonetworkfailureslambda0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read.IconCompatParcelizer;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str == null) {
            int i2 = serializer + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
        } else {
            if (!m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_MEDIA_AUDIO_ATTRIBUTES_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl)) {
                return;
            }
        }
        int i3 = RemoteActionCompatParcelizer + 23;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        DefaultBackgroundSoundManager defaultBackgroundSoundManager = this.IconCompatParcelizer;
        defaultBackgroundSoundManager.getClass();
        try {
            Ringtone ringtone = defaultBackgroundSoundManager.RatingCompat;
            Object obj = null;
            if (ringtone != null) {
                int i5 = RemoteActionCompatParcelizer + 67;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (!ringtone.isPlaying()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("New delivery sound is already stopping. Skipping stop request", new Object[0]);
                    int i7 = serializer + 29;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
            Ringtone ringtone2 = defaultBackgroundSoundManager.RatingCompat;
            if (ringtone2 != null) {
                ringtone2.stop();
            }
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) defaultBackgroundSoundManager.write.serializer;
            String str2 = firebaseRemoteConfigImpl2.read.read();
            if (str2 == null) {
                return;
            }
            Object[] objArr = {firebaseRemoteConfigImpl2, firebaseRemoteConfigImpl2.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_AUDIO_DUCKING_ENABLED.getFirebaseFlagName(), str2)};
            if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(28645399, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -28645399, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), objArr)).booleanValue()) {
                int i8 = RemoteActionCompatParcelizer + 95;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    defaultBackgroundSoundManager.serializer.RemoteActionCompatParcelizer();
                    return;
                }
                defaultBackgroundSoundManager.serializer.RemoteActionCompatParcelizer();
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "An error occurred while stopping notification from new sound manager", new Object[0]);
        }
    }
}
