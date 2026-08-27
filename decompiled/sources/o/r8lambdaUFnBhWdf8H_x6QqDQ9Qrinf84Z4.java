package o;

import com.sentiance.sdk.InjectUsing;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "EventStoreIndexer")
public class r8lambdaUFnBhWdf8H_x6QqDQ9Qrinf84Z4 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final clearAllData read;
    private final getCooldownEnterSeconds serializer;
    private final getAnalyticsEnabledEnterannotations write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.write.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaSmNRYJ4Mast_fow1LfgB1pe2Muc(this, this.read));
    }

    public r8lambdaUFnBhWdf8H_x6QqDQ9Qrinf84Z4(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, clearAllData clearalldata) {
        this.write = getanalyticsenabledenterannotations;
        this.serializer = getcooldownenterseconds;
        this.read = clearalldata;
    }
}
