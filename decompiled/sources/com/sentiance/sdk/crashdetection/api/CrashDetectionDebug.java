package com.sentiance.sdk.crashdetection.api;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.N;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList3;
import o.cancelNotification;
import o.component4android_sdk_base_release;
import o.getAnalyticsEnabledEnterannotations;
import o.getCooldownEnterSeconds;
import o.getVerticalAccuracy;
import o.populatePushStoryPage;
import o.r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU;
import o.r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA;
import o.r8lambdaOXfsZ5bXwSG876KWYcsN742T8;
import o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA;
import o.runlambda0;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
public class CrashDetectionDebug extends N {
    private static CrashDetectionDebug sInstance;
    private final Context mContext;

    public static CrashDetectionDebug getInstance(Context context) {
        CrashDetectionDebug crashDetectionDebug;
        synchronized (CrashDetectionDebug.class) {
            if (sInstance == null) {
                sInstance = new CrashDetectionDebug(context);
            }
            crashDetectionDebug = sInstance;
        }
        return crashDetectionDebug;
    }

    private List<BrazeCompanionExternalSyntheticLambda4> getPrecedingLocations(long j) {
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        ArrayList arrayList = new ArrayList();
        Iterator<getCooldownEnterSeconds.read> it = ((getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class)).RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(j - 300000), null, true, false).iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer((component4android_sdk_base_release) setPushUniqueId.read(component4android_sdk_base_release.class));
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                arrayList.add(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$generateCrashEvent$0() {
        r8lambdaOXfsZ5bXwSG876KWYcsN742T8 r8lambdaoxfsz5bxwsg876kwycsn742t8 = (r8lambdaOXfsZ5bXwSG876KWYcsN742T8) setPushUniqueId.read(r8lambdaOXfsZ5bXwSG876KWYcsN742T8.class);
        populatePushStoryPage populatepushstorypageWrite = ((cancelNotification) setPushUniqueId.read(cancelNotification.class)).write("CrashDetector");
        List listSingletonList = populatepushstorypageWrite != null ? Collections.singletonList(populatepushstorypageWrite) : Collections.EMPTY_LIST;
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA.serializer serializerVar = new r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA.serializer();
        serializerVar.RemoteActionCompatParcelizer(getCrashLocation(jCurrentTimeMillis));
        serializerVar.RemoteActionCompatParcelizer(0.75f);
        serializerVar.write(14.0f);
        serializerVar.serializer(4.0f);
        serializerVar.IconCompatParcelizer(jCurrentTimeMillis);
        serializerVar.read(16.0f);
        serializerVar.IconCompatParcelizer(1.0f);
        serializerVar.write(listSingletonList);
        r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA r8lambdam9t1o8mutdxzpgli6kvcujhiwa = new r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA(serializerVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        List<BrazeCompanionExternalSyntheticLambda4> precedingLocations = getPrecedingLocations(jCurrentTimeMillis);
        r8lambdaoxfsz5bxwsg876kwycsn742t8.getClass();
        getanalyticsenabledenterannotations.serializer(r8lambdaOXfsZ5bXwSG876KWYcsN742T8.write(r8lambdam9t1o8mutdxzpgli6kvcujhiwa, precedingLocations, (byte) 2));
    }

    private CrashDetectionDebug(Context context) {
        this.mContext = context;
    }

    public void generateCrashEvent() {
        ifSdkIsInitializedWithUser(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList3(this, 1));
    }

    private Location getCrashLocation(long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        Location location = new Location("gps");
        location.setTime(j);
        location.setAccuracy(10.0f);
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = ((getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class)).IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer() && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer((component4android_sdk_base_release) setPushUniqueId.read(component4android_sdk_base_release.class))) != null) {
            r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
            if (r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
                getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer;
                getverticalaccuracy.getClass();
                Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                location.setLatitude(locationWrite.getLatitude());
                location.setLongitude(locationWrite.getLongitude());
                return location;
            }
        }
        location.setLatitude(51.196941d);
        location.setLongitude(4.408006d);
        return location;
    }
}
