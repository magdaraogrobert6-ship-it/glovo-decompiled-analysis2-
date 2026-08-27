package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.huawei.hms.location.LocationRequest;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getReuseDeactivationViaHostNjRlDlw {
    public final int IconCompatParcelizer;
    public final View MediaBrowserCompatMediaItem;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys serializer;
    public final TimeInterpolator write;

    public getReuseDeactivationViaHostNjRlDlw(View view) {
        this.MediaBrowserCompatMediaItem = view;
        Context context = view.getContext();
        this.write = SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.read = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationMedium2, LocationRequest.PRIORITY_INDOOR);
        this.IconCompatParcelizer = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationShort3, 150);
        this.RemoteActionCompatParcelizer = SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationShort2, 100);
    }
}
