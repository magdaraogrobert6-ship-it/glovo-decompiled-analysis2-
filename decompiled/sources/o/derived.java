package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class derived implements accessdetachAndRemoveNode {
    public static final derived serializer = new derived();
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("logEventKey", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(1, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet write = new accessgetAggregateChildKindSet("eventCount", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(2, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet read = new accessgetAggregateChildKindSet("inferenceDurationStats", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(3, computeFillMinDimensioniLBOSCw.DEFAULT))));

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        DefaultIntrinsicMeasurable defaultIntrinsicMeasurable = (DefaultIntrinsicMeasurable) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(RemoteActionCompatParcelizer, defaultIntrinsicMeasurable.serializer);
        accessupdatenode.write(write, defaultIntrinsicMeasurable.read);
        accessupdatenode.write(read, defaultIntrinsicMeasurable.write);
    }
}
