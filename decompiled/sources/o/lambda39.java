package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda39 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final isRoot MediaBrowserCompatMediaItem;
    public final isRoot RemoteActionCompatParcelizer;
    public final isRoot read;
    public final isRoot serializer;
    public final logPushDeliverylambda0 write;

    public lambda39(logPushDeliverylambda0 logpushdeliverylambda0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        logpushdeliverylambda0.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = logpushdeliverylambda0;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        this.serializer = new isRoot("selected_vehicle");
        this.MediaBrowserCompatMediaItem = new isRoot("selected_vehicle_text");
        this.read = new isRoot("selected_bag");
        this.RemoteActionCompatParcelizer = new isRoot("selected_bag_text");
    }

    public static final lambda38 RemoteActionCompatParcelizer(lambda39 lambda39Var, getNoActiveChildannotations getnoactivechildannotations) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = (String) getnoactivechildannotations.serializer(lambda39Var.serializer);
        String str2 = (String) getnoactivechildannotations.serializer(lambda39Var.read);
        String str3 = (String) getnoactivechildannotations.serializer(lambda39Var.MediaBrowserCompatMediaItem);
        String str4 = (String) getnoactivechildannotations.serializer(lambda39Var.RemoteActionCompatParcelizer);
        if (str != null && str2 != null && str3 != null) {
            int i4 = MediaDescriptionCompat + 15;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (str4 != null) {
                return new logBannerClicklambda0(str, str3, str2, str4);
            }
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Equipment selection data store emitted no selection ", str, ", ", str3, ", "), str2, ", ", str4), new Object[0]);
        return logCustomEventlambda0.write;
    }
}
