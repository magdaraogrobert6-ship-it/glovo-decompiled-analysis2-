package o;

import com.sentiance.sdk.events.ControlMessage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class setLargeIconIfPresentAndSupportedlambda0<T> extends getLatitudeannotations<T> {
    final /* synthetic */ setDeleteIntentlambda0 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLargeIconIfPresentAndSupportedlambda0(setDeleteIntentlambda0 setdeleteintentlambda0, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "PayloadCreator");
        this.RemoteActionCompatParcelizer = setdeleteintentlambda0;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<T> getlongitudeannotations) {
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.RemoteActionCompatParcelizer;
        setdeleteintentlambda0.MediaSessionCompatToken = jMediaMetadataCompat;
        setdeleteintentlambda0.MediaBrowserCompatMediaItem.clear();
        for (setSoundIfPresentAndSupportedlambda0 setsoundifpresentandsupportedlambda0 : setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda0, getlongitudeannotations.read().getClass())) {
            Iterator<logBaiduNotificationClicklambda1> it = setsoundifpresentandsupportedlambda0.RemoteActionCompatParcelizer(getlongitudeannotations).iterator();
            while (it.hasNext()) {
                setDeleteIntentlambda0.IconCompatParcelizer(setdeleteintentlambda0, it.next());
            }
            setsoundifpresentandsupportedlambda0.serializer();
        }
        setdeleteintentlambda0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.IconCompatParcelizer(getlongitudeannotations.MediaMetadataCompat());
        if (setdeleteintentlambda0.MediaBrowserCompatMediaItem.isEmpty()) {
            return;
        }
        setdeleteintentlambda0.PlaybackStateCompatCustomAction.IconCompatParcelizer(ControlMessage.PAYLOAD_READY, new isControl(setdeleteintentlambda0.MediaBrowserCompatMediaItem));
    }
}
