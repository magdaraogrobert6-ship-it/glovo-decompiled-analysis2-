package o;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class setNotificationCategory implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final Context serializer;
    private final getVerticalAccuracy write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return Collections.EMPTY_MAP;
    }

    public static void write(setNotificationCategory setnotificationcategory) {
        String strRemoteActionCompatParcelizer;
        Context context = setnotificationcategory.serializer;
        context.getClass();
        File[] fileArrListFiles = new File(context.getNoBackupFilesDir(), "sentiance/sdk-init-timeout").listFiles();
        for (File file : fileArrListFiles != null ? onContentCardClicked.RatingCompat(fileArrListFiles) : instance_delegatelambda0.write) {
            setNotificationPriorityInt setnotificationpriorityint = null;
            try {
                isSdkAuthenticationEnabled issdkauthenticationenabledIconCompatParcelizer = getResourceIdentifier.IconCompatParcelizer(file);
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(issdkauthenticationenabledIconCompatParcelizer);
                strRemoteActionCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer();
            } catch (Exception unused) {
                strRemoteActionCompatParcelizer = null;
            }
            if (strRemoteActionCompatParcelizer != null) {
                try {
                    setnotificationpriorityint = (setNotificationPriorityInt) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(setNotificationPriorityInt.class, strRemoteActionCompatParcelizer);
                } catch (Exception unused2) {
                }
            }
            if (setnotificationpriorityint != null) {
                getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = setnotificationcategory.IconCompatParcelizer;
                getVerticalAccuracy getverticalaccuracy = setnotificationcategory.write;
                long jRemoteActionCompatParcelizer = setnotificationpriorityint.RemoteActionCompatParcelizer();
                String strIconCompatParcelizer = setnotificationpriorityint.IconCompatParcelizer();
                long jSerializer = setnotificationpriorityint.serializer();
                getverticalaccuracy.getClass();
                HashMap map = new HashMap();
                map.put("waiting_component", strIconCompatParcelizer);
                map.put("wait_duration_ms", String.valueOf(jSerializer));
                getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.RemoteActionCompatParcelizer("sdk_init_timeout", (byte) 2, map, null, jRemoteActionCompatParcelizer));
            }
            file.delete();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        Context context = this.serializer;
        context.getClass();
        File[] fileArrListFiles = new File(context.getNoBackupFilesDir(), "sentiance/sdk-init-timeout").listFiles();
        migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer((List<File>) (fileArrListFiles != null ? onContentCardClicked.RatingCompat(fileArrListFiles) : instance_delegatelambda0.write));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new setNotificationSound(this));
    }

    public setNotificationCategory(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy) {
        this.serializer = context;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.write = getverticalaccuracy;
    }
}
