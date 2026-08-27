package o;

import android.location.Location;
import com.sentiance.sdk.crashdetection.api.CrashDetectionState;
import com.sentiance.sdk.crashdetection.api.VehicleCrashDiagnostic;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY;
import o.r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GooglePlayLocationUtilsExternalSyntheticLambda18<TModelInput extends r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY, TModelOutput extends r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk> {
    private final parseLonglambda0 IconCompatParcelizer;
    private final getNotificationId MediaBrowserCompatMediaItem;
    private final component4android_sdk_base_release MediaDescriptionCompat;
    private final GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList3 MediaMetadataCompat;
    private final r8lambdaOXfsZ5bXwSG876KWYcsN742T8 MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper = false;
    private final r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY<TModelInput, TModelOutput> MediaSessionCompatToken;
    private final r8lambda7zvd1Q0zVs4colYANjFPBKq0PCw ParcelableVolumeInfo;
    private final GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList1 PlaybackStateCompat;
    private final r8lambdaFFntGI86VJ4J7lg1XElfn0Y9xbg PlaybackStateCompatCustomAction;
    private final GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2 RatingCompat;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private CrashDetectionState ResultReceiver;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final getCooldownEnterSeconds write;

    public abstract byte IconCompatParcelizer();

    public abstract boolean IconCompatParcelizer(CrashSeverityInternal crashSeverityInternal);

    public void onKillswitchActivated() {
        serializer();
    }

    public static void RemoteActionCompatParcelizer(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18, long j, logLocationRecordedEvent loglocationrecordedevent) {
        List list = loglocationrecordedevent.read;
        long[] jArrWrite = googlePlayLocationUtilsExternalSyntheticLambda18.MediaBrowserCompatMediaItem.write(j, loglocationrecordedevent.write);
        int length = jArrWrite.length;
        float[] fArr = new float[length];
        float[] fArr2 = new float[length];
        float[] fArr3 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Integer) ((List) list.get(0)).get(i)).intValue() / 1000.0f;
            fArr2[i] = ((Integer) ((List) list.get(1)).get(i)).intValue() / 1000.0f;
            fArr3[i] = ((Integer) ((List) list.get(2)).get(i)).intValue() / 1000.0f;
        }
        if (jArrWrite.length < loglocationrecordedevent.write.size()) {
            googlePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer.RemoteActionCompatParcelizer("Future timestamp detected (%d). Resetting.", Long.valueOf(((long) ((Integer) loglocationrecordedevent.write.get(jArrWrite.length)).intValue()) + j));
            synchronized (googlePlayLocationUtilsExternalSyntheticLambda18) {
                googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatToken.IconCompatParcelizer();
            }
        }
        synchronized (googlePlayLocationUtilsExternalSyntheticLambda18) {
            for (r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA r8lambdam9t1o8mutdxzpgli6kvcujhiwa : googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatToken.IconCompatParcelizer(fArr, fArr2, fArr3, jArrWrite)) {
                CrashDetectionState crashDetectionState = googlePlayLocationUtilsExternalSyntheticLambda18.ResultReceiver;
                CrashDetectionState crashDetectionStateWrite = r8lambdam9t1o8mutdxzpgli6kvcujhiwa.write();
                googlePlayLocationUtilsExternalSyntheticLambda18.ResultReceiver = crashDetectionStateWrite;
                if (crashDetectionStateWrite != null && crashDetectionStateWrite != crashDetectionState) {
                    googlePlayLocationUtilsExternalSyntheticLambda18.serializer.IconCompatParcelizer(ControlMessage.VEHICLE_CRASH_DIAGNOSTIC, new VehicleCrashDiagnostic(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.write()));
                }
                if (r8lambdam9t1o8mutdxzpgli6kvcujhiwa.MediaDescriptionCompat()) {
                    boolean zIconCompatParcelizer = googlePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.IconCompatParcelizer());
                    if (!zIconCompatParcelizer) {
                        googlePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer.IconCompatParcelizer("Crash detected, but not severe enough to report: " + r8lambdam9t1o8mutdxzpgli6kvcujhiwa, new Object[0]);
                    }
                    if (zIconCompatParcelizer) {
                        googlePlayLocationUtilsExternalSyntheticLambda18.read(r8lambdam9t1o8mutdxzpgli6kvcujhiwa);
                    }
                }
            }
        }
    }

    public void clearData() {
        this.RemoteActionCompatParcelizer.read();
    }

    public Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        this.read.getClass();
        map.put(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(System.currentTimeMillis() - 300000));
        return map;
    }

    public void subscribe() {
        ControlMessage controlMessage = ControlMessage.CRASH_DETECTOR_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2 googlePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2 = this.RatingCompat;
        getanalyticsenabledenterannotations.read(controlMessage, googlePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2);
        getanalyticsenabledenterannotations.read(ControlMessage.CRASH_DETECTOR_STOP, googlePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2);
    }

    public GooglePlayLocationUtilsExternalSyntheticLambda18(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaOXfsZ5bXwSG876KWYcsN742T8 r8lambdaoxfsz5bxwsg876kwycsn742t8, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, getNotificationId getnotificationid, com.sentiance.sdk.util.c cVar, r8lambda7zvd1Q0zVs4colYANjFPBKq0PCw r8lambda7zvd1q0zvs4colyanjfpbkq0pcw, r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY<TModelInput, TModelOutput> r8lambdaurmks4gj6xsbb3zs0bdhiwkby, r8lambdaFFntGI86VJ4J7lg1XElfn0Y9xbg r8lambdaffntgi86vj4j7lg1xelfn0y9xbg) {
        this.RemoteActionCompatParcelizer = cVar;
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = getanalyticsenabledenterannotations;
        this.write = getcooldownenterseconds;
        this.MediaSessionCompatQueueItem = r8lambdaoxfsz5bxwsg876kwycsn742t8;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = component4android_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = getnotificationid;
        this.MediaSessionCompatToken = r8lambdaurmks4gj6xsbb3zs0bdhiwkby;
        this.ParcelableVolumeInfo = r8lambda7zvd1q0zvs4colyanjfpbkq0pcw;
        this.PlaybackStateCompatCustomAction = r8lambdaffntgi86vj4j7lg1xelfn0y9xbg;
        this.MediaMetadataCompat = new GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList3(this, readandroid_sdk_base_releaseVar);
        this.PlaybackStateCompat = new GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList1(this, readandroid_sdk_base_releaseVar);
        this.RatingCompat = new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList2(this, readandroid_sdk_base_releaseVar);
    }

    public static void IconCompatParcelizer(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18) {
        boolean z;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        if (googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        synchronized (googlePlayLocationUtilsExternalSyntheticLambda18) {
            z = googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatToken.read();
            if (!z) {
                googlePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer.IconCompatParcelizer("Failed to start executor", new Object[0]);
            }
        }
        if (z) {
            googlePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer.IconCompatParcelizer("Starting", new Object[0]);
            googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatResultReceiverWrapper = true;
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = googlePlayLocationUtilsExternalSyntheticLambda18.write.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
            if (optionalIconCompatParcelizer.IconCompatParcelizer() && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(googlePlayLocationUtilsExternalSyntheticLambda18.MediaDescriptionCompat)) != null) {
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
                if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
                    googlePlayLocationUtilsExternalSyntheticLambda18.read.getClass();
                    if (System.currentTimeMillis() - r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue() <= 60000) {
                        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                        r8lambdaOXfsZ5bXwSG876KWYcsN742T8 r8lambdaoxfsz5bxwsg876kwycsn742t8 = googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatQueueItem;
                        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
                        r8lambdaoxfsz5bxwsg876kwycsn742t8.getClass();
                        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                        synchronized (googlePlayLocationUtilsExternalSyntheticLambda18) {
                            googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatToken.serializer(locationWrite);
                        }
                    }
                }
            }
            googlePlayLocationUtilsExternalSyntheticLambda18.serializer.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, googlePlayLocationUtilsExternalSyntheticLambda18.MediaMetadataCompat);
            googlePlayLocationUtilsExternalSyntheticLambda18.serializer.RemoteActionCompatParcelizer(logLocationRecordedEvent.class, googlePlayLocationUtilsExternalSyntheticLambda18.PlaybackStateCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer() {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.IconCompatParcelizer.IconCompatParcelizer("Stopping", new Object[0]);
            this.MediaSessionCompatResultReceiverWrapper = false;
            this.ResultReceiver = null;
            this.serializer.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            this.serializer.RemoteActionCompatParcelizer(this.PlaybackStateCompat);
            synchronized (this) {
                this.MediaSessionCompatToken.RemoteActionCompatParcelizer();
            }
        }
    }

    private void read(r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA r8lambdam9t1o8mutdxzpgli6kvcujhiwa) {
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        com.sentiance.sdk.util.c cVar = this.RemoteActionCompatParcelizer;
        long jIconCompatParcelizer = cVar.IconCompatParcelizer("last_crash_report_time", 0L);
        this.read.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        if (jIconCompatParcelizer > 0 && jCurrentTimeMillis - jIconCompatParcelizer < 300000) {
            parselonglambda0.IconCompatParcelizer("It's been %d mins since last reporting a crash. Too soon to report a new one.", Long.valueOf((System.currentTimeMillis() - jIconCompatParcelizer) / 60000));
            return;
        }
        parselonglambda0.IconCompatParcelizer("Crash detected: " + r8lambdam9t1o8mutdxzpgli6kvcujhiwa, new Object[0]);
        cVar.read(System.currentTimeMillis(), "last_crash_report_time");
        long jMediaMetadataCompat = r8lambdam9t1o8mutdxzpgli6kvcujhiwa.MediaMetadataCompat();
        ArrayList arrayList = new ArrayList();
        Iterator<getCooldownEnterSeconds.read> it = this.write.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(jMediaMetadataCompat - 300000), Long.valueOf(jMediaMetadataCompat + 1), false, false).iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                arrayList.add(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer);
            }
        }
        byte bIconCompatParcelizer = IconCompatParcelizer();
        this.MediaSessionCompatQueueItem.getClass();
        this.serializer.serializer(r8lambdaOXfsZ5bXwSG876KWYcsN742T8.write(r8lambdam9t1o8mutdxzpgli6kvcujhiwa, arrayList, bIconCompatParcelizer));
    }

    public static boolean write(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18) {
        r8lambdaFFntGI86VJ4J7lg1XElfn0Y9xbg r8lambdaffntgi86vj4j7lg1xelfn0y9xbg = googlePlayLocationUtilsExternalSyntheticLambda18.PlaybackStateCompatCustomAction;
        byte bIconCompatParcelizer = googlePlayLocationUtilsExternalSyntheticLambda18.IconCompatParcelizer();
        if (bIconCompatParcelizer == 1) {
            return r8lambdaffntgi86vj4j7lg1xelfn0y9xbg.RemoteActionCompatParcelizer();
        }
        if (bIconCompatParcelizer == 2) {
            return r8lambdaffntgi86vj4j7lg1xelfn0y9xbg.IconCompatParcelizer();
        }
        return false;
    }

    public static void write(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18, long j) {
        googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatToken.read(j);
    }

    public static void serializer(GooglePlayLocationUtilsExternalSyntheticLambda18 googlePlayLocationUtilsExternalSyntheticLambda18, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku) {
        r8lambdaOXfsZ5bXwSG876KWYcsN742T8 r8lambdaoxfsz5bxwsg876kwycsn742t8 = googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatQueueItem;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        r8lambdaoxfsz5bxwsg876kwycsn742t8.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        synchronized (googlePlayLocationUtilsExternalSyntheticLambda18) {
            googlePlayLocationUtilsExternalSyntheticLambda18.MediaSessionCompatToken.serializer(locationWrite);
        }
    }
}
