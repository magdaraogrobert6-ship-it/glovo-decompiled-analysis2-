package o;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class handlePushperformWork implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;
    private final Context serializer;
    private final readandroid_sdk_base_release write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return Collections.EMPTY_MAP;
    }

    public static void IconCompatParcelizer(handlePushperformWork handlepushperformwork) {
        String strRemoteActionCompatParcelizer;
        Context context = handlepushperformwork.serializer;
        context.getClass();
        File[] fileArrListFiles = new File(context.getNoBackupFilesDir(), "sentiance/receiver-timeout").listFiles();
        for (File file : fileArrListFiles != null ? onContentCardClicked.RatingCompat(fileArrListFiles) : instance_delegatelambda0.write) {
            handleAdmRegistrationIntentlambda0 handleadmregistrationintentlambda0 = null;
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
                    handleadmregistrationintentlambda0 = (handleAdmRegistrationIntentlambda0) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(handleAdmRegistrationIntentlambda0.class, strRemoteActionCompatParcelizer);
                } catch (Exception unused2) {
                }
            }
            if (handleadmregistrationintentlambda0 != null) {
                getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = handlepushperformwork.IconCompatParcelizer;
                getVerticalAccuracy getverticalaccuracy = handlepushperformwork.RemoteActionCompatParcelizer;
                long j = handleadmregistrationintentlambda0.read();
                String strRemoteActionCompatParcelizer2 = handleadmregistrationintentlambda0.RemoteActionCompatParcelizer();
                long jSerializer = handleadmregistrationintentlambda0.serializer();
                getverticalaccuracy.getClass();
                HashMap map = new HashMap();
                map.put("receiver_name", strRemoteActionCompatParcelizer2);
                map.put("wait_duration_ms", String.valueOf(jSerializer));
                getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.RemoteActionCompatParcelizer("receiver_timeout", (byte) 2, map, null, j));
            }
            file.delete();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        Context context = this.serializer;
        context.getClass();
        File[] fileArrListFiles = new File(context.getNoBackupFilesDir(), "sentiance/receiver-timeout").listFiles();
        migrateSealedSessionsMapToJsonlambda0.RemoteActionCompatParcelizer((List<File>) (fileArrListFiles != null ? onContentCardClicked.RatingCompat(fileArrListFiles) : instance_delegatelambda0.write));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new handlePushlambda3(this));
    }

    public handlePushperformWork(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy) {
        this.serializer = context;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.write = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
    }
}
