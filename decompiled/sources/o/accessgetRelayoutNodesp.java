package o;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetRelayoutNodesp implements accessdetachAndRemoveNode {
    public static final accessgetRelayoutNodesp write = new accessgetRelayoutNodesp();
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("pc");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("symbol");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("file");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read(MapboxMap.QFE_OFFSET);
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("importance");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        getHasPendingOnPositionedCallbacks gethaspendingonpositionedcallbacks = (getHasPendingOnPositionedCallbacks) ((setDuringAlignmentLinesQueryui) obj);
        accessupdatenode.write(IconCompatParcelizer, gethaspendingonpositionedcallbacks.read);
        accessupdatenode.write(MediaSessionCompatQueueItem, gethaspendingonpositionedcallbacks.write);
        accessupdatenode.write(serializer, gethaspendingonpositionedcallbacks.IconCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, gethaspendingonpositionedcallbacks.RemoteActionCompatParcelizer);
        accessupdatenode.write(read, gethaspendingonpositionedcallbacks.serializer);
    }
}
