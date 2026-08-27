package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class handleHmsRemoteMessageDatalambda1 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public abstract void serializer(long j, Class cls);

    public final void read(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, long j) {
        HashMap map = new HashMap();
        String str = this.RemoteActionCompatParcelizer;
        map.put(setShouldPersistWebView.class, new BrazeHuaweiPushHandlerExternalSyntheticLambda1(this, clearandroid_sdk_base_releaseVar, str));
        map.put(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class, new BrazeHuaweiPushHandlerExternalSyntheticLambda0(this, clearandroid_sdk_base_releaseVar, str));
        map.put(BrazeBootReceiver.class, new r8lambda20YHaOT6EXblVCgKqslg1vSJcM(this, clearandroid_sdk_base_releaseVar, str));
        map.put(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, new handleHmsRemoteMessageDatalambda2(this, clearandroid_sdk_base_releaseVar, str));
        map.put(r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class, new BrazeHuaweiPushHandlerExternalSyntheticLambda3(this, clearandroid_sdk_base_releaseVar, str));
        map.put(r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, new handleHmsRemoteMessageData(this, clearandroid_sdk_base_releaseVar, str));
        map.put(wipeDatalambda0.class, new handleHmsRemoteMessageDatalambda3(this, clearandroid_sdk_base_releaseVar, str));
        map.put(BrazeActivityLifecycleCallbackListeneronActivityCreated2.class, new r8lambda0RxMRRxysHQdIXE4ByXS8IwrzHk(this, clearandroid_sdk_base_releaseVar, str));
        this.IconCompatParcelizer.IconCompatParcelizer(map, j);
    }

    public handleHmsRemoteMessageDatalambda1(String str, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
    }
}
