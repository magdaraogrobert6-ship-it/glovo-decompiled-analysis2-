package o;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import io.sentry.MovePreviousSession;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class onRenderProcessGone {
    public final Object IconCompatParcelizer;
    public final Object MediaDescriptionCompat;
    public Comparable RatingCompat;
    public long RemoteActionCompatParcelizer;
    public boolean read;
    public final Object serializer;
    public final Object write;

    public onRenderProcessGone(Context context, zzdd zzddVar, Long l) {
        this.read = true;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        Context applicationContext = context.getApplicationContext();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(applicationContext);
        this.write = applicationContext;
        this.MediaDescriptionCompat = l;
        if (zzddVar != null) {
            this.IconCompatParcelizer = zzddVar;
            this.read = zzddVar.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = zzddVar.write;
            this.RatingCompat = zzddVar.RemoteActionCompatParcelizer;
            Bundle bundle = zzddVar.read;
            if (bundle != null) {
                this.serializer = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }

    public onRenderProcessGone(MovePreviousSession movePreviousSession, getMethodQuietlylambda1 getmethodquietlylambda1, ScheduledExecutorService scheduledExecutorService, visitSubtreeYYKmhodefault visitsubtreeyykmhodefault) {
        this.IconCompatParcelizer = movePreviousSession;
        this.serializer = getmethodquietlylambda1;
        this.write = scheduledExecutorService;
        this.MediaDescriptionCompat = visitsubtreeyykmhodefault;
        visitsubtreeyykmhodefault.write();
    }
}
