package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class traceMeasureLayout {
    public static final Charset PlaybackStateCompat = Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public abstract getCanAffectPlacedParent IconCompatParcelizer();

    public final ensureSubtreeLookaheadReplaced IconCompatParcelizer(String str, long j, boolean z) {
        getCanAffectPlacedParent getcanaffectplacedparentIconCompatParcelizer = IconCompatParcelizer();
        trackMeasurementByParent trackmeasurementbyparent = ((ensureSubtreeLookaheadReplaced) this).ParcelableVolumeInfo;
        if (trackmeasurementbyparent != null) {
            remeasureAndRelayoutIfNeeded remeasureandrelayoutifneeded = trackmeasurementbyparent.read();
            remeasureandrelayoutifneeded.write = Long.valueOf(j);
            remeasureandrelayoutifneeded.RemoteActionCompatParcelizer = z;
            remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 2);
            if (str != null) {
                remeasureandrelayoutifneeded.PlaybackStateCompat = new MeasureAndLayoutDelegateWhenMappings(str);
            }
            getcanaffectplacedparentIconCompatParcelizer.ParcelableVolumeInfo = remeasureandrelayoutifneeded.serializer();
        }
        return getcanaffectplacedparentIconCompatParcelizer.read();
    }
}
