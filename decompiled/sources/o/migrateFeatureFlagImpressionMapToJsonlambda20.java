package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.util.Optional;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TimezoneChangeDetector", guardType = Guard$Type.REFERENCE_COUNTED)
public class migrateFeatureFlagImpressionMapToJsonlambda20 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 IconCompatParcelizer;
    private final readandroid_sdk_base_release MediaBrowserCompatMediaItem;
    private final component4android_sdk_base_release MediaDescriptionCompat;
    private final migrateFeatureFlagImpressionMapToJsonlambda3 MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final migrateTriggersReeligibilityToJsonlambda4<migrateFeatureFlagStorageToJsonlambda0> RatingCompat = new migrateFeatureFlagStorageToJsonlambda10(this);
    private final getCooldownEnterSeconds RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations read;
    private final parseLonglambda0 serializer;
    private final getVerticalAccuracy write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalIconCompatParcelizer.write(), this.write));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.RatingCompat.write();
    }

    public final void read(long j) {
        migrateTriggersReeligibilityToJsonlambda4<migrateFeatureFlagStorageToJsonlambda0> migratetriggersreeligibilitytojsonlambda4 = this.RatingCompat;
        migrateFeatureFlagStorageToJsonlambda0 migratefeatureflagstoragetojsonlambda0 = migratetriggersreeligibilitytojsonlambda4.read();
        short sWrite = (short) com.sentiance.sdk.util.x.write(j);
        String id = Calendar.getInstance().getTimeZone().getID();
        migrateFeatureFlagStorageToJsonlambda0 migratefeatureflagstoragetojsonlambda1 = new migrateFeatureFlagStorageToJsonlambda0(id, sWrite);
        if (migratefeatureflagstoragetojsonlambda0 == null || !migratefeatureflagstoragetojsonlambda0.equals(migratefeatureflagstoragetojsonlambda1)) {
            migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(new migrateFeatureFlagStorageToJsonlambda0(id, sWrite));
            this.write.getClass();
            FormBody.Builder builder = new FormBody.Builder();
            builder.RemoteActionCompatParcelizer = id;
            builder.serializer = Short.valueOf(sWrite);
            r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi = new r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI(builder);
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.addOnConfigurationChangedListener = r8lambdarsln0n_71nx5fiy5yo7knsgyi;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            this.read.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
            this.serializer.IconCompatParcelizer("Device timezone changed", new Object[0]);
        }
    }

    public migrateFeatureFlagImpressionMapToJsonlambda20(r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.IconCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.serializer = parselonglambda0;
        this.read = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = getcooldownenterseconds;
        this.write = getverticalaccuracy;
        this.MediaDescriptionCompat = component4android_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = readandroid_sdk_base_releaseVar;
        this.MediaMetadataCompat = new migrateFeatureFlagImpressionMapToJsonlambda3(this, readandroid_sdk_base_releaseVar);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.read.RemoteActionCompatParcelizer(addBannerViewMonitor.class, this.MediaMetadataCompat);
    }

    public static migrateFeatureFlagStorageToJsonlambda0 read(migrateFeatureFlagImpressionMapToJsonlambda20 migratefeatureflagimpressionmaptojsonlambda20) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi;
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = migratefeatureflagimpressionmaptojsonlambda20.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class, (Long) null);
        if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(migratefeatureflagimpressionmaptojsonlambda20.MediaDescriptionCompat)) == null || (r8lambdarsln0n_71nx5fiy5yo7knsgyi = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).addOnNewIntentListener) == null) {
            return null;
        }
        short sShortValue = r8lambdarsln0n_71nx5fiy5yo7knsgyi.write.shortValue();
        r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r8lambdarsln0n_71nx5fiy5yo7knsgyi2 = r8lambdaturwertf3otevz1wenzex5tdwa.addOnNewIntentListener;
        String id = r8lambdarsln0n_71nx5fiy5yo7knsgyi2.serializer;
        if (id == null) {
            String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis(r8lambdarsln0n_71nx5fiy5yo7knsgyi2.write.shortValue()));
            id = (availableIDs == null || availableIDs.length <= 0) ? TimeZone.getDefault().getID() : availableIDs[0];
        }
        return new migrateFeatureFlagStorageToJsonlambda0(id, sShortValue);
    }

    public final void IconCompatParcelizer(long j) {
        this.IconCompatParcelizer.read();
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new migrateFeatureFlagImpressionMapToJsonlambda10(this, j));
    }
}
