package o;

import android.annotation.SuppressLint;
import android.content.Context;
import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes4.dex */
public final class populateNotificationBuilderlambda0 {

    @SuppressLint
    private static populateNotificationBuilderlambda0 read;
    private final Context serializer;

    public static populateNotificationBuilderlambda0 RemoteActionCompatParcelizer(Context context) {
        populateNotificationBuilderlambda0 populatenotificationbuilderlambda0;
        synchronized (populateNotificationBuilderlambda0.class) {
            if (read == null) {
                read = new populateNotificationBuilderlambda0(context);
            }
            populatenotificationbuilderlambda0 = read;
        }
        return populatenotificationbuilderlambda0;
    }

    private populateNotificationBuilderlambda0(Context context) {
        this.serializer = context;
    }

    public final void RemoteActionCompatParcelizer(removeGeofencesRegisteredWithGeofencingClientlambda20 removegeofencesregisteredwithgeofencingclientlambda20) {
        Sentiance.getInstance(this.serializer).addOnBootstrapCompleteListener(removegeofencesregisteredwithgeofencingclientlambda20);
    }
}
