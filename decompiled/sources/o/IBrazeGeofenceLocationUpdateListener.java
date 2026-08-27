package o;

import com.sentiance.sdk.InjectUsing;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "WrongWayDrivingEventsProvider")
public final class IBrazeGeofenceLocationUpdateListener {
    private final parseLonglambda0 read;
    private final setHeaderTextColor write;

    public IBrazeGeofenceLocationUpdateListener(setHeaderTextColor setheadertextcolor, parseLonglambda0 parselonglambda0) {
        setheadertextcolor.getClass();
        parselonglambda0.getClass();
        this.write = setheadertextcolor;
        this.read = parselonglambda0;
    }

    public final r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ read(String str) {
        str.getClass();
        parseLonglambda0 parselonglambda0 = this.read;
        parselonglambda0.serializer("Retrieving wrong way driving Details for transport %s", str);
        List listIconCompatParcelizer = this.write.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
        listIconCompatParcelizer.getClass();
        handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
        if (handlelogclick == null) {
            parselonglambda0.serializer("No wrong way driving details found for transport %s", str);
            r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.RemoteActionCompatParcelizer.getClass();
            return r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ.read.RemoteActionCompatParcelizer();
        }
        r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ r8lambdavofb8wwxngiixelwle1ybluc3iqParcelableVolumeInfo = handlelogclick.ParcelableVolumeInfo();
        parselonglambda0.serializer("Retrieved wrong way driving details for transport %s: %s", str, r8lambdavofb8wwxngiixelwle1ybluc3iqParcelableVolumeInfo.serializer().name() + ", count=" + r8lambdavofb8wwxngiixelwle1ybluc3iqParcelableVolumeInfo.RemoteActionCompatParcelizer().size());
        return r8lambdavofb8wwxngiixelwle1ybluc3iqParcelableVolumeInfo;
    }
}
