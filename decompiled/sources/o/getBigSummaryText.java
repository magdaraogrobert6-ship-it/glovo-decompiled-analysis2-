package o;

import android.app.ApplicationExitInfo;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ANRTracker")
public class getBigSummaryText implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final registerGeofencesWithGooglePlayIfNecessarylambda7 MediaMetadataCompat;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final getVerticalAccuracy serializer;
    private final parseLonglambda0 write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    public final void RemoteActionCompatParcelizer(long j, long j2) {
        String str;
        ApplicationExitInfo applicationExitInfoCh_ = this.MediaMetadataCompat.ch_();
        if (applicationExitInfoCh_ != null) {
            long timestamp = applicationExitInfoCh_.getTimestamp();
            if (timestamp >= j || timestamp <= j2) {
                return;
            }
            parseLonglambda0 parselonglambda0 = this.write;
            try {
                InputStream traceInputStream = applicationExitInfoCh_.getTraceInputStream();
                if (traceInputStream == null) {
                    parselonglambda0.IconCompatParcelizer("Trace input stream is unavailable for: " + applicationExitInfoCh_, new Object[0]);
                    str = null;
                } else {
                    str = (String) new BufferedReader(new InputStreamReader(traceInputStream, StandardCharsets.UTF_8)).lines().map(new H3Core$$ExternalSyntheticLambda2(8, this)).collect(Collectors.joining("\n"));
                }
            } catch (IOException e) {
                parselonglambda0.IconCompatParcelizer("Trace input stream fail: " + e.getMessage(), new Object[0]);
            }
            if (str == null) {
                str = "Thread dump not available";
            }
            this.serializer.getClass();
            r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(4);
            r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = str;
            handleIncomingIntentlambda2 handleincomingintentlambda2 = new handleIncomingIntentlambda2(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(timestamp);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = handleincomingintentlambda2;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            this.IconCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        getCooldownEnterSeconds getcooldownenterseconds = this.read;
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(addBannerViewMonitor.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            long jRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer();
            Optional optional = getcooldownenterseconds.read(addBannerViewMonitor.class, Long.valueOf(jRemoteActionCompatParcelizer));
            if (optional.IconCompatParcelizer()) {
                r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((getCooldownEnterSeconds.read) optional.write(), map, addBannerViewMonitor.class);
                return map;
            }
            map.put(addBannerViewMonitor.class, Long.valueOf(jRemoteActionCompatParcelizer));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new getBigImageUrl(this, this.RemoteActionCompatParcelizer));
    }

    public getBigSummaryText(parseLonglambda0 parselonglambda0, getCooldownEnterSeconds getcooldownenterseconds, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, registerGeofencesWithGooglePlayIfNecessarylambda7 registergeofenceswithgoogleplayifnecessarylambda7) {
        this.write = parselonglambda0;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.read = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.serializer = getverticalaccuracy;
        this.MediaMetadataCompat = registergeofenceswithgoogleplayifnecessarylambda7;
    }
}
