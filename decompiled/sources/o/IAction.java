package o;

import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import io.grpc.SynchronizationContext$1;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class IAction extends hasPermissionlambda0 {
    public static final parseJsonObjectIntoBundle MediaBrowserCompatMediaItem = new parseJsonObjectIntoBundle("addressTrackerKey");
    public final r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc MediaDescriptionCompat;
    public FormBody.Builder MediaMetadataCompat;
    public Long MediaSessionCompatQueueItem;
    public final WebContentUtils MediaSessionCompatToken;
    public final getMethodQuietlylambda1 ParcelableVolumeInfo;
    public final ScheduledExecutorService PlaybackStateCompat;
    public final getChannel PlaybackStateCompatCustomAction;
    public final UserJavascriptInterfaceBaseExternalSyntheticLambda12 RatingCompat;

    public static ArrayList IconCompatParcelizer(getChannel getchannel, int i) {
        ArrayList arrayList = new ArrayList();
        for (UriAction uriAction : getchannel.IconCompatParcelizer.values()) {
            if (uriAction.IconCompatParcelizer() >= i) {
                arrayList.add(uriAction);
            }
        }
        return arrayList;
    }

    @Override // o.hasPermissionlambda0
    public final void read() {
        this.RatingCompat.read();
    }

    @Override // o.hasPermissionlambda0
    public final void serializer(Status status) {
        this.RatingCompat.serializer(status);
    }

    public IAction(LoadBalancer$Helper loadBalancer$Helper) {
        r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc r8lambdan29im8cjkn7obdaxnvkijdq8rpcIconCompatParcelizer = loadBalancer$Helper.IconCompatParcelizer();
        this.MediaDescriptionCompat = r8lambdan29im8cjkn7obdaxnvkijdq8rpcIconCompatParcelizer;
        this.RatingCompat = new UserJavascriptInterfaceBaseExternalSyntheticLambda12(new r8lambdaBDSR_JOoMt3FuQZhimpJwbZJ44(this, loadBalancer$Helper));
        this.PlaybackStateCompatCustomAction = new getChannel();
        getMethodQuietlylambda1 getmethodquietlylambda1Write = loadBalancer$Helper.write();
        TextStreamsKt.serializer(getmethodquietlylambda1Write, "syncContext");
        this.ParcelableVolumeInfo = getmethodquietlylambda1Write;
        ScheduledExecutorService scheduledExecutorService = loadBalancer$Helper.read();
        TextStreamsKt.serializer(scheduledExecutorService, "timeService");
        this.PlaybackStateCompat = scheduledExecutorService;
        this.MediaSessionCompatToken = WebContentUtils.write;
        r8lambdan29im8cjkn7obdaxnvkijdq8rpcIconCompatParcelizer.serializer(optEnum.DEBUG, "OutlierDetection lb created.");
    }

    @Override // o.hasPermissionlambda0
    public final Status RemoteActionCompatParcelizer(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        UserJavascriptInterfaceBaseExternalSyntheticLambda12 userJavascriptInterfaceBaseExternalSyntheticLambda12 = this.RatingCompat;
        getChannel getchannel = this.PlaybackStateCompatCustomAction;
        r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc r8lambdan29im8cjkn7obdaxnvkijdq8rpc = this.MediaDescriptionCompat;
        r8lambdan29im8cjkn7obdaxnvkijdq8rpc.IconCompatParcelizer(optEnum.DEBUG, "Received resolution result: {0}", requestpushpermissionpromptlambda1);
        r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz20 = (r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20) requestpushpermissionpromptlambda1.RemoteActionCompatParcelizer;
        ArrayList<SocketAddress> arrayList = new ArrayList();
        Iterator it = requestpushpermissionpromptlambda1.read.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) it.next()).read);
        }
        getchannel.IconCompatParcelizer.keySet().retainAll(arrayList);
        Iterator it2 = getchannel.IconCompatParcelizer.values().iterator();
        while (it2.hasNext()) {
            ((UriAction) it2.next()).serializer = r8lambdapxfx9i9wwy9pn8nj6g6puqyz20;
        }
        HashMap map = getchannel.IconCompatParcelizer;
        for (SocketAddress socketAddress : arrayList) {
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new UriAction(r8lambdapxfx9i9wwy9pn8nj6g6puqyz20));
            }
        }
        BrazeWebViewClientType brazeWebViewClientType = r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.write;
        Long l = r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.RemoteActionCompatParcelizer;
        userJavascriptInterfaceBaseExternalSyntheticLambda12.IconCompatParcelizer(brazeWebViewClientType.RemoteActionCompatParcelizer);
        if (r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.MediaDescriptionCompat == null && r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.read == null) {
            FormBody.Builder builder = this.MediaMetadataCompat;
            if (builder != null) {
                builder.RatingCompat();
                this.MediaSessionCompatQueueItem = null;
                for (UriAction uriAction : getchannel.IconCompatParcelizer.values()) {
                    if (uriAction.RemoteActionCompatParcelizer()) {
                        uriAction.read();
                    }
                    uriAction.RemoteActionCompatParcelizer = 0;
                }
            }
        } else {
            Long lValueOf = this.MediaSessionCompatQueueItem == null ? l : Long.valueOf(Math.max(0L, l.longValue() - (this.MediaSessionCompatToken.write() - this.MediaSessionCompatQueueItem.longValue())));
            FormBody.Builder builder2 = this.MediaMetadataCompat;
            if (builder2 != null) {
                builder2.RatingCompat();
                for (UriAction uriAction2 : getchannel.IconCompatParcelizer.values()) {
                    FormBody.Builder builder3 = uriAction2.IconCompatParcelizer;
                    ((AtomicLong) builder3.serializer).set(0L);
                    ((AtomicLong) builder3.RemoteActionCompatParcelizer).set(0L);
                    FormBody.Builder builder4 = uriAction2.write;
                    ((AtomicLong) builder4.serializer).set(0L);
                    ((AtomicLong) builder4.RemoteActionCompatParcelizer).set(0L);
                }
            }
            getMethodQuietlylambda1 getmethodquietlylambda1 = this.ParcelableVolumeInfo;
            SynchronizationContext$1 synchronizationContext$1 = new SynchronizationContext$1(18, this, r8lambdapxfx9i9wwy9pn8nj6g6puqyz20, r8lambdan29im8cjkn7obdaxnvkijdq8rpc, false);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l.longValue();
            ScheduledExecutorService scheduledExecutorService = this.PlaybackStateCompat;
            getmethodquietlylambda1.getClass();
            invokeMethodQuietlylambda0 invokemethodquietlylambda0 = new invokeMethodQuietlylambda0(synchronizationContext$1);
            this.MediaMetadataCompat = new FormBody.Builder(invokemethodquietlylambda0, (ScheduledFuture) scheduledExecutorService.scheduleWithFixedDelay(new getMethodQuietly(getmethodquietlylambda1, invokemethodquietlylambda0, synchronizationContext$1, jLongValue2), jLongValue, jLongValue2, TimeUnit.NANOSECONDS));
        }
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = getPrettyPrintedStringlambda0.serializer;
        userJavascriptInterfaceBaseExternalSyntheticLambda12.write(new requestPushPermissionPromptlambda1(requestpushpermissionpromptlambda1.read, requestpushpermissionpromptlambda1.serializer, r8lambdapxfx9i9wwy9pn8nj6g6puqyz20.write.write));
        return Status.RatingCompat;
    }

    public static boolean RemoteActionCompatParcelizer(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) it.next()).read.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }
}
