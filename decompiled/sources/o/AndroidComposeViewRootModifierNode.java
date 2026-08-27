package o;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewRootModifierNode implements accessdetachAndRemoveNode {
    public static final AndroidComposeViewRootModifierNode read = new AndroidComposeViewRootModifierNode();
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("appId");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("deviceModel");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("sessionSdkVersion");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("osVersion");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("logEnvironment");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("androidAppInfo");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        addNotificationForSysPropsChangelambda0010 addnotificationforsyspropschangelambda0010 = (addNotificationForSysPropsChangelambda0010) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(write, addnotificationforsyspropschangelambda0010.serializer);
        accessupdatenode.write(RemoteActionCompatParcelizer, Build.MODEL);
        accessupdatenode.write(RatingCompat, "3.0.4");
        accessupdatenode.write(MediaSessionCompatQueueItem, Build.VERSION.RELEASE);
        accessupdatenode.write(serializer, addnotificationforsyspropschangelambda0010.read);
        accessupdatenode.write(IconCompatParcelizer, addnotificationforsyspropschangelambda0010.write);
    }
}
