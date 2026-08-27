package o;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class addNotificationForSysPropsChangelambda0000 implements accessdetachAndRemoveNode {
    public static final addNotificationForSysPropsChangelambda0000 write = new addNotificationForSysPropsChangelambda0000();
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("packageName");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("versionName");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("appBuildVersion");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("deviceManufacturer");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("currentProcessDetails");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("appProcessDetails");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        removeNotificationForSysPropsChange removenotificationforsyspropschange = (removeNotificationForSysPropsChange) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(MediaSessionCompatQueueItem, removenotificationforsyspropschange.IconCompatParcelizer);
        accessupdatenode.write(MediaMetadataCompat, removenotificationforsyspropschange.serializer);
        accessupdatenode.write(serializer, removenotificationforsyspropschange.RemoteActionCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, Build.MANUFACTURER);
        accessupdatenode.write(RemoteActionCompatParcelizer, removenotificationforsyspropschange.write);
        accessupdatenode.write(read, removenotificationforsyspropschange.read);
    }
}
