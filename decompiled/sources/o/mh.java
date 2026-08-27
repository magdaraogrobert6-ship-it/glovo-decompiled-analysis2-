package o;

import android.app.Application;
import android.content.Context;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.voice.model.SpeechVolume;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class mh {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final transferSessionPackageI IconCompatParcelizer;
    public final N MediaBrowserCompatMediaItem;
    public final nExternalSyntheticLambda4 MediaDescriptionCompat;
    public com.huawei.wisesecurity.ucs_credential.x RemoteActionCompatParcelizer;
    public final Application serializer;
    public androidx.camera.core.LegacySessionConfig write;
    public final mf read = new mf(this, 0);
    public final mf MediaMetadataCompat = new mf(this, 1);

    public mh(Application application, nExternalSyntheticLambda4 nexternalsyntheticlambda4, N n, transferSessionPackageI transfersessionpackagei) {
        this.serializer = application;
        this.MediaDescriptionCompat = nexternalsyntheticlambda4;
        this.MediaBrowserCompatMediaItem = n;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    public final void IconCompatParcelizer(NavigationRoute navigationRoute) {
        String languageTag;
        DirectionsRoute directionsRoute;
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 27;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
            if (this.RemoteActionCompatParcelizer != null) {
                return;
            }
        } else if (this.RemoteActionCompatParcelizer != null) {
            return;
        }
        int i5 = i2 + 63;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (((FirebaseRemoteConfigImpl) this.IconCompatParcelizer).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
            if (navigationRoute == null || (directionsRoute = navigationRoute.getDirectionsRoute()) == null) {
                languageTag = java.util.Locale.getDefault().toLanguageTag();
                Timber.RemoteActionCompatParcelizer.write(new Throwable(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No voiceLanguage in route, falling back to system locale: ", languageTag)));
                languageTag.getClass();
                int i7 = MediaSessionCompatQueueItem + 79;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                int i9 = RatingCompat + 123;
                MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    directionsRoute.voiceLanguage();
                    throw null;
                }
                languageTag = directionsRoute.voiceLanguage();
                if (languageTag == null) {
                    languageTag = java.util.Locale.getDefault().toLanguageTag();
                    Timber.RemoteActionCompatParcelizer.write(new Throwable(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No voiceLanguage in route, falling back to system locale: ", languageTag)));
                    languageTag.getClass();
                    int i10 = MediaSessionCompatQueueItem + 79;
                    RatingCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
            }
            Application application = this.serializer;
            Context applicationContext = application.getApplicationContext();
            applicationContext.getClass();
            this.RemoteActionCompatParcelizer = new com.huawei.wisesecurity.ucs_credential.x(applicationContext, languageTag);
            Context applicationContext2 = application.getApplicationContext();
            applicationContext2.getClass();
            this.write = new androidx.camera.core.LegacySessionConfig(applicationContext2, languageTag);
            N n = this.MediaBrowserCompatMediaItem;
            boolean z = n.RemoteActionCompatParcelizer.getBoolean(n.IconCompatParcelizer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_mapbox_voice), false);
            MutableStateFlow mutableStateFlow = this.MediaDescriptionCompat.read;
            if (!z) {
                childSerializers childserializers = childSerializers.DISABLED;
                childserializers.getClass();
                mutableStateFlow.write(childserializers);
                androidx.camera.core.LegacySessionConfig legacySessionConfig = this.write;
                if (legacySessionConfig != null) {
                    legacySessionConfig.volume(new SpeechVolume(0.0f));
                    return;
                }
                return;
            }
            int i12 = RatingCompat + 121;
            MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            childSerializers childserializers2 = childSerializers.ENABLED;
            childserializers2.getClass();
            mutableStateFlow.write(childserializers2);
            androidx.camera.core.LegacySessionConfig legacySessionConfig2 = this.write;
            if (legacySessionConfig2 != null) {
                legacySessionConfig2.volume(new SpeechVolume(1.0f));
            }
        }
    }
}
