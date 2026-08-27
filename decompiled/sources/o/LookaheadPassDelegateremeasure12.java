package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegateremeasure12 implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegateremeasure12 read = new LookaheadPassDelegateremeasure12();
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("batteryLevel");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("batteryVelocity");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("proximityOn");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read(com.braze.models.inappmessage.InAppMessageBase.ORIENTATION);
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("ramUsed");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("diskUsed");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        measureAndLayout0kLqBqw measureandlayout0klqbqw = (measureAndLayout0kLqBqw) ((MeasurePassDelegatelayoutChildrenBlock1) obj);
        accessupdatenode.write(serializer, measureandlayout0klqbqw.IconCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, measureandlayout0klqbqw.read);
        accessupdatenode.read(MediaBrowserCompatMediaItem, measureandlayout0klqbqw.RemoteActionCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, measureandlayout0klqbqw.serializer);
        accessupdatenode.write(MediaDescriptionCompat, measureandlayout0klqbqw.MediaSessionCompatQueueItem);
        accessupdatenode.write(write, measureandlayout0klqbqw.write);
    }
}
