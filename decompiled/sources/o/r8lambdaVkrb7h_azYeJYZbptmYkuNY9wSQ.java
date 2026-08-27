package o;

import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import io.grpc.internal.ServiceConfigUtil;
import java.util.List;
import java.util.Map;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class r8lambdaVkrb7h_azYeJYZbptmYkuNY9wSQ extends wouldPushPermissionPromptDisplaylambda3 {
    @Override // o.wouldPushPermissionPromptDisplaylambda3
    public final hasPermissionlambda0 RemoteActionCompatParcelizer(LoadBalancer$Helper loadBalancer$Helper) {
        return new IAction(loadBalancer$Helper);
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda3
    public final String read() {
        return "outlier_detection_experimental";
    }

    public static getDeclaredMethodQuietlylambda1 serializer(Map map) {
        r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM r8lambdaebrbrotzagevf6hg_esqz9i4tm;
        r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM r8lambdaebrbrotzagevf6hg_esqz9i4tm2;
        Integer num;
        Integer num2;
        Integer num3 = 5;
        Integer num4 = 100;
        long jMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("interval", map);
        long jMediaSessionCompatQueueItem2 = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("baseEjectionTime", map);
        long jMediaSessionCompatQueueItem3 = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("maxEjectionTime", map);
        int iWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("maxEjectionPercentage", map);
        if (jMediaSessionCompatQueueItem == null) {
            jMediaSessionCompatQueueItem = 10000000000L;
        }
        Long l = jMediaSessionCompatQueueItem;
        if (jMediaSessionCompatQueueItem2 == null) {
            jMediaSessionCompatQueueItem2 = 30000000000L;
        }
        Long l2 = jMediaSessionCompatQueueItem2;
        if (jMediaSessionCompatQueueItem3 == null) {
            jMediaSessionCompatQueueItem3 = 300000000000L;
        }
        Long l3 = jMediaSessionCompatQueueItem3;
        if (iWrite == null) {
            iWrite = 10;
        }
        Integer num5 = iWrite;
        Map mapMediaBrowserCompatMediaItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("successRateEjection", map);
        if (mapMediaBrowserCompatMediaItem != null) {
            Integer numWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("stdevFactor", mapMediaBrowserCompatMediaItem);
            Integer numWrite2 = getLocalHtmlUrlFromRemoteUrllambda5.write("enforcementPercentage", mapMediaBrowserCompatMediaItem);
            Integer numWrite3 = getLocalHtmlUrlFromRemoteUrllambda5.write("minimumHosts", mapMediaBrowserCompatMediaItem);
            Integer numWrite4 = getLocalHtmlUrlFromRemoteUrllambda5.write("requestVolume", mapMediaBrowserCompatMediaItem);
            Integer num6 = numWrite != null ? numWrite : 1900;
            if (numWrite2 != null) {
                TextStreamsKt.write(numWrite2.intValue() >= 0 && numWrite2.intValue() <= 100);
                num = numWrite2;
            } else {
                num = num4;
            }
            if (numWrite3 != null) {
                TextStreamsKt.write(numWrite3.intValue() >= 0);
                num2 = numWrite3;
            } else {
                num2 = num3;
            }
            if (numWrite4 != null) {
                TextStreamsKt.write(numWrite4.intValue() >= 0);
            } else {
                numWrite4 = num4;
            }
            r8lambdaebrbrotzagevf6hg_esqz9i4tm = new r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM(num6, num, num2, numWrite4);
        } else {
            r8lambdaebrbrotzagevf6hg_esqz9i4tm = null;
        }
        Map mapMediaBrowserCompatMediaItem2 = getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("failurePercentageEjection", map);
        if (mapMediaBrowserCompatMediaItem2 != null) {
            Integer num7 = 85;
            Integer num8 = 50;
            Integer numWrite5 = getLocalHtmlUrlFromRemoteUrllambda5.write("threshold", mapMediaBrowserCompatMediaItem2);
            Integer numWrite6 = getLocalHtmlUrlFromRemoteUrllambda5.write("enforcementPercentage", mapMediaBrowserCompatMediaItem2);
            Integer numWrite7 = getLocalHtmlUrlFromRemoteUrllambda5.write("minimumHosts", mapMediaBrowserCompatMediaItem2);
            Integer numWrite8 = getLocalHtmlUrlFromRemoteUrllambda5.write("requestVolume", mapMediaBrowserCompatMediaItem2);
            if (numWrite5 != null) {
                TextStreamsKt.write(numWrite5.intValue() >= 0 && numWrite5.intValue() <= 100);
                num7 = numWrite5;
            }
            if (numWrite6 != null) {
                TextStreamsKt.write(numWrite6.intValue() >= 0 && numWrite6.intValue() <= 100);
                num4 = numWrite6;
            }
            if (numWrite7 != null) {
                TextStreamsKt.write(numWrite7.intValue() >= 0);
                num3 = numWrite7;
            }
            if (numWrite8 != null) {
                TextStreamsKt.write(numWrite8.intValue() >= 0);
                num8 = numWrite8;
            }
            r8lambdaebrbrotzagevf6hg_esqz9i4tm2 = new r8lambdaEBRBRotzagevF6hg_eSqZ9I4TM(num7, num4, num3, num8);
        } else {
            r8lambdaebrbrotzagevf6hg_esqz9i4tm2 = null;
        }
        List listSerializer = getLocalHtmlUrlFromRemoteUrllambda5.serializer("childPolicy", map);
        if (listSerializer == null) {
            listSerializer = null;
        } else {
            getLocalHtmlUrlFromRemoteUrllambda5.write(listSerializer);
        }
        List list = (List) ServiceConfigUtil.RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 1354250273, new Object[]{listSerializer}, accessgetSystemHomecp.read(), accessgetSystemHomecp.read(), -1354250273, accessgetSystemHomecp.read());
        if (list != null && !list.isEmpty()) {
            getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1RemoteActionCompatParcelizer = ServiceConfigUtil.RemoteActionCompatParcelizer(list, wouldPushPermissionPromptDisplaylambda1.read());
            if (getdeclaredmethodquietlylambda1RemoteActionCompatParcelizer.IconCompatParcelizer != null) {
                return getdeclaredmethodquietlylambda1RemoteActionCompatParcelizer;
            }
            BrazeWebViewClientType brazeWebViewClientType = (BrazeWebViewClientType) getdeclaredmethodquietlylambda1RemoteActionCompatParcelizer.write;
            if (brazeWebViewClientType == null) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return null;
            }
            if (brazeWebViewClientType != null) {
                return new getDeclaredMethodQuietlylambda1(new r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20(l, l2, l3, num5, r8lambdaebrbrotzagevf6hg_esqz9i4tm, r8lambdaebrbrotzagevf6hg_esqz9i4tm2, brazeWebViewClientType));
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return null;
        }
        return new getDeclaredMethodQuietlylambda1(Status.write.IconCompatParcelizer("No child policy in outlier_detection_experimental LB policy: " + map));
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda3
    public final getDeclaredMethodQuietlylambda1 read(Map map) {
        try {
            return serializer(map);
        } catch (RuntimeException e) {
            return new getDeclaredMethodQuietlylambda1(Status.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(e).IconCompatParcelizer("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
