package o;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations {
    public static final java.util.logging.Logger serializer = java.util.logging.Logger.getLogger(getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations.class.getName());
    public FormBody.Builder IconCompatParcelizer;
    public final getMethodQuietlylambda1 RemoteActionCompatParcelizer;
    public final ScheduledExecutorService read;
    public isValidPhoneNumber write;

    public final void IconCompatParcelizer(isAutomaticGeofenceRequestsEnabled isautomaticgeofencerequestsenabled) {
        this.RemoteActionCompatParcelizer.write();
        if (this.write == null) {
            this.write = new isValidPhoneNumber();
        }
        FormBody.Builder builder = this.IconCompatParcelizer;
        if (builder == null || !builder.MediaSessionCompatQueueItem()) {
            long jWrite = this.write.write();
            this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.read(isautomaticgeofencerequestsenabled, jWrite, TimeUnit.NANOSECONDS, this.read);
            serializer.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jWrite));
        }
    }

    public getSUFFIX_CACHE_USER_ID_HASH_VALUEannotations(WebContentUtils webContentUtils, setMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release setmaxunpackedzipentrysizebytesandroid_sdk_base_release, getMethodQuietlylambda1 getmethodquietlylambda1) {
        this.read = setmaxunpackedzipentrysizebytesandroid_sdk_base_release;
        this.RemoteActionCompatParcelizer = getmethodquietlylambda1;
    }
}
