package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "EventStoreCleanupTask")
public class r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0 extends createOrGetDataStorelambda00 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getCooldownEnterSeconds IconCompatParcelizer;
    private final ConfigurationManager MediaBrowserCompatMediaItem;
    private final readandroid_sdk_base_release MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final removeGeofencesRegisteredWithGeofencingClientlambda23 serializer;
    private final accesshandlePush write;

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        serializer();
        return false;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    public final void serializer() {
        synchronized (this) {
            this.read.IconCompatParcelizer("Cleaning up the event store", new Object[0]);
            HashMap mapIconCompatParcelizer = this.serializer.IconCompatParcelizer();
            getCooldownEnterSeconds getcooldownenterseconds = this.IconCompatParcelizer;
            synchronized (getcooldownenterseconds) {
                getcooldownenterseconds.serializer(new getAnalyticsEnabledEnter(getcooldownenterseconds, mapIconCompatParcelizer, 0));
            }
        }
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("EventStoreCleanup");
        publishexceptionlambda0.read(21600000L);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        r8lambdaYMvlD0eyl1jvWFyJWJHGzDlWGR0 r8lambdaymvld0eyl1jvwfyjwjhgzdlwgr0 = new r8lambdaYMvlD0eyl1jvWFyJWJHGzDlWGR0(this, this.MediaDescriptionCompat);
        ControlMessage controlMessage = ControlMessage.PAYLOAD_SUBMISSION_RESULT;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        getanalyticsenabledenterannotations.read(controlMessage, r8lambdaymvld0eyl1jvwfyjwjhgzdlwgr0);
        getanalyticsenabledenterannotations.read(ControlMessage.DISK_QUOTA_STATUS_UPDATED, r8lambdaymvld0eyl1jvwfyjwjhgzdlwgr0);
    }

    public r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0(getCooldownEnterSeconds getcooldownenterseconds, removeGeofencesRegisteredWithGeofencingClientlambda23 removegeofencesregisteredwithgeofencingclientlambda23, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, accesshandlePush accesshandlepush, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.IconCompatParcelizer = getcooldownenterseconds;
        this.serializer = removegeofencesregisteredwithgeofencingclientlambda23;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.write = accesshandlepush;
        this.read = parselonglambda0;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = configurationManager;
        this.MediaDescriptionCompat = readandroid_sdk_base_releaseVar;
    }
}
