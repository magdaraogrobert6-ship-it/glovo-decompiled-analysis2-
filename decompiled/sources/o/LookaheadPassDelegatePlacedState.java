package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegatePlacedState implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegatePlacedState MediaBrowserCompatMediaItem = new LookaheadPassDelegatePlacedState();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("identifier");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("version");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("displayVersion");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("organization");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("installationUuid");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("developmentPlatform");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("developmentPlatformVersion");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        remeasureIfNeeded remeasureifneeded = (remeasureIfNeeded) ((getLookaheadPassDelegate) obj);
        accessupdatenode.write(read, remeasureifneeded.read);
        accessupdatenode.write(MediaSessionCompatQueueItem, remeasureifneeded.MediaMetadataCompat);
        accessupdatenode.write(RemoteActionCompatParcelizer, remeasureifneeded.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaMetadataCompat, (Object) null);
        accessupdatenode.write(serializer, remeasureifneeded.serializer);
        accessupdatenode.write(IconCompatParcelizer, remeasureifneeded.IconCompatParcelizer);
        accessupdatenode.write(write, remeasureifneeded.write);
    }
}
