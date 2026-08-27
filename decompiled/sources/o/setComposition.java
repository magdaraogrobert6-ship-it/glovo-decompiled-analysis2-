package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setComposition implements Runnable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ getHasPremeasured read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setComposition(getHasPremeasured gethaspremeasured, String str, long j, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j;
        this.read = gethaspremeasured;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        String str = this.IconCompatParcelizer;
        getHasPremeasured gethaspremeasured = this.read;
        if (i == 0) {
            gethaspremeasured.MediaSessionCompatToken();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
            ImageKt imageKt = gethaspremeasured.RemoteActionCompatParcelizer;
            if (imageKt.isEmpty()) {
                gethaspremeasured.read = j;
            }
            Integer num = (Integer) imageKt.get(str);
            if (num != null) {
                imageKt.put(str, Integer.valueOf(num.intValue() + 1));
                return;
            }
            if (imageKt.MediaMetadataCompat < 100) {
                imageKt.put(str, 1);
                gethaspremeasured.write.put(str, Long.valueOf(j));
                return;
            } else {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) gethaspremeasured.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Too many ads visible");
                return;
            }
        }
        gethaspremeasured.MediaSessionCompatToken();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        ImageKt imageKt2 = gethaspremeasured.RemoteActionCompatParcelizer;
        Integer num2 = (Integer) imageKt2.get(str);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) gethaspremeasured.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (num2 == null) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        OnFirstVisibleNode onFirstVisibleNode = lookaheadScopeKtLookaheadScope221.ResultReceiver;
        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        getViewportBounds getviewportboundsIconCompatParcelizer = onFirstVisibleNode.IconCompatParcelizer(false);
        int iIntValue = num2.intValue() - 1;
        if (iIntValue != 0) {
            imageKt2.put(str, Integer.valueOf(iIntValue));
            return;
        }
        imageKt2.remove(str);
        ImageKt imageKt3 = gethaspremeasured.write;
        Long l = (Long) imageKt3.get(str);
        if (l == null) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.serializer.RemoteActionCompatParcelizer("First ad unit exposure time was never set");
        } else {
            long jLongValue = l.longValue();
            imageKt3.remove(str);
            gethaspremeasured.RemoteActionCompatParcelizer(str, j - jLongValue, getviewportboundsIconCompatParcelizer);
        }
        if (imageKt2.isEmpty()) {
            long j2 = gethaspremeasured.read;
            if (j2 == 0) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.serializer.RemoteActionCompatParcelizer("First ad exposure time was never set");
            } else {
                gethaspremeasured.IconCompatParcelizer(j - j2, getviewportboundsIconCompatParcelizer);
                gethaspremeasured.read = 0L;
            }
        }
    }
}
