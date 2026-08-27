package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class setBrazeDeeplinkHandler extends hasPermissionlambda0 {
    public static final java.util.logging.Logger MediaMetadataCompat = java.util.logging.Logger.getLogger(setBrazeDeeplinkHandler.class.getName());
    public setResourcePackageNamelambda0 MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public ImageResources_androidKt MediaSessionCompatQueueItem;
    public FormBody.Builder MediaSessionCompatResultReceiverWrapper;
    public final LoadBalancer$Helper ParcelableVolumeInfo;
    public setResourcePackageNamelambda0 PlaybackStateCompat;
    public final HashMap MediaSessionCompatToken = new HashMap();
    public int PlaybackStateCompatCustomAction = 0;
    public boolean RatingCompat = true;

    public final void IconCompatParcelizer(onCreatelambda1 oncreatelambda1) {
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = oncreatelambda1.IconCompatParcelizer;
        setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.READY;
        if (setresourcepackagenamelambda0 != setresourcepackagenamelambda1) {
            return;
        }
        PackageUtils packageUtils = oncreatelambda1.serializer.IconCompatParcelizer;
        setResourcePackageNamelambda0 setresourcepackagenamelambda2 = packageUtils.IconCompatParcelizer;
        if (setresourcepackagenamelambda2 == setresourcepackagenamelambda1) {
            read(setresourcepackagenamelambda1, new wouldPushPermissionPromptDisplay(wouldPushPermissionPromptDisplaylambda0.write(oncreatelambda1.read, null)));
            return;
        }
        setResourcePackageNamelambda0 setresourcepackagenamelambda3 = setResourcePackageNamelambda0.TRANSIENT_FAILURE;
        if (setresourcepackagenamelambda2 == setresourcepackagenamelambda3) {
            read(setresourcepackagenamelambda3, new createWebViewClient(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer(packageUtils.read)));
        } else if (this.MediaBrowserCompatMediaItem != setresourcepackagenamelambda3) {
            read(setresourcepackagenamelambda2, new createWebViewClient(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097 A[PHI: r7
  0x0097: PHI (r7v6 java.lang.Object[]) = (r7v5 java.lang.Object[]), (r7v20 java.lang.Object[]) binds: [B:18:0x0079, B:23:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:92:0x00b7 A[SYNTHETIC] */
    @Override // o.hasPermissionlambda0
    public final Status RemoteActionCompatParcelizer(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        int i;
        int iWrite;
        int i2;
        List list;
        setResourcePackageNamelambda0 setresourcepackagenamelambda0;
        if (this.PlaybackStateCompat == setResourcePackageNamelambda0.SHUTDOWN) {
            return Status.IconCompatParcelizer.IconCompatParcelizer("Already shut down");
        }
        List list2 = requestpushpermissionpromptlambda1.read;
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = requestpushpermissionpromptlambda1.serializer;
        if (list2.isEmpty()) {
            Status statusIconCompatParcelizer = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + getprettyprintedstringlambda0);
            serializer(statusIconCompatParcelizer);
            return statusIconCompatParcelizer;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) it.next()) == null) {
                Status statusIconCompatParcelizer2 = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + getprettyprintedstringlambda0);
                serializer(statusIconCompatParcelizer2);
                return statusIconCompatParcelizer2;
            }
        }
        this.RatingCompat = true;
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        androidx.sqlite.SQLite.serializer(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        if (list2 instanceof Collection) {
            List list3 = list2;
            int size = list3.size();
            if (4 < size) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, JsonUtilsc.write(4, size));
            }
            if (list3 instanceof getSelfKindSetui) {
                iWrite = ((getSelfKindSetui) list3).write(0, objArrCopyOf);
            } else {
                i = 0;
                for (Object obj : list2) {
                    obj.getClass();
                    i2 = i + 1;
                    if (objArrCopyOf.length < i2) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, JsonUtilsc.write(objArrCopyOf.length, i2));
                    }
                    objArrCopyOf[i] = obj;
                    i = i2;
                }
                iWrite = i;
            }
        } else {
            i = 0;
            while (r0.hasNext()) {
                obj.getClass();
                i2 = i + 1;
                if (objArrCopyOf.length < i2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, JsonUtilsc.write(objArrCopyOf.length, i2));
                }
                objArrCopyOf[i] = obj;
                i = i2;
            }
            iWrite = i;
        }
        accessgetApproachSetp accessgetapproachsetpIconCompatParcelizer = delegateUnprotectedui.IconCompatParcelizer(iWrite, objArrCopyOf);
        ImageResources_androidKt imageResources_androidKt = this.MediaSessionCompatQueueItem;
        if (imageResources_androidKt == null) {
            ImageResources_androidKt imageResources_androidKt2 = new ImageResources_androidKt(8);
            imageResources_androidKt2.read = accessgetapproachsetpIconCompatParcelizer != null ? accessgetapproachsetpIconCompatParcelizer : Collections.EMPTY_LIST;
            this.MediaSessionCompatQueueItem = imageResources_androidKt2;
        } else if (this.PlaybackStateCompat == setResourcePackageNamelambda0.READY) {
            SocketAddress socketAddress = imageResources_androidKt.read();
            ImageResources_androidKt imageResources_androidKt3 = this.MediaSessionCompatQueueItem;
            if (accessgetapproachsetpIconCompatParcelizer != null) {
                list = accessgetapproachsetpIconCompatParcelizer;
            } else {
                imageResources_androidKt3.getClass();
                list = Collections.EMPTY_LIST;
            }
            imageResources_androidKt3.read = list;
            imageResources_androidKt3.RemoteActionCompatParcelizer = 0;
            imageResources_androidKt3.serializer = 0;
            if (this.MediaSessionCompatQueueItem.read(socketAddress)) {
                return Status.RatingCompat;
            }
            ImageResources_androidKt imageResources_androidKt4 = this.MediaSessionCompatQueueItem;
            imageResources_androidKt4.RemoteActionCompatParcelizer = 0;
            imageResources_androidKt4.serializer = 0;
        } else {
            imageResources_androidKt.read = accessgetapproachsetpIconCompatParcelizer != null ? accessgetapproachsetpIconCompatParcelizer : Collections.EMPTY_LIST;
            imageResources_androidKt.RemoteActionCompatParcelizer = 0;
            imageResources_androidKt.serializer = 0;
        }
        HashMap map = this.MediaSessionCompatToken;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        DepthSortedSet depthSortedSetListIterator = accessgetapproachsetpIconCompatParcelizer.listIterator(0);
        while (depthSortedSetListIterator.hasNext()) {
            hashSet2.addAll(((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) depthSortedSetListIterator.next()).read);
        }
        for (SocketAddress socketAddress2 : hashSet) {
            if (!hashSet2.contains(socketAddress2)) {
                ((onCreatelambda1) map.remove(socketAddress2)).read.RatingCompat();
            }
        }
        if (hashSet.size() == 0 || (setresourcepackagenamelambda0 = this.PlaybackStateCompat) == setResourcePackageNamelambda0.CONNECTING || setresourcepackagenamelambda0 == setResourcePackageNamelambda0.READY) {
            setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.CONNECTING;
            this.PlaybackStateCompat = setresourcepackagenamelambda1;
            read(setresourcepackagenamelambda1, new createWebViewClient(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer));
            serializer();
            RemoteActionCompatParcelizer();
        } else {
            setResourcePackageNamelambda0 setresourcepackagenamelambda2 = setResourcePackageNamelambda0.IDLE;
            if (setresourcepackagenamelambda0 == setresourcepackagenamelambda2) {
                read(setresourcepackagenamelambda2, new r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw(this, this));
            } else if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.TRANSIENT_FAILURE) {
                serializer();
                RemoteActionCompatParcelizer();
            }
        }
        return Status.RatingCompat;
    }

    @Override // o.hasPermissionlambda0
    public final void read() {
        Level level = Level.FINE;
        HashMap map = this.MediaSessionCompatToken;
        MediaMetadataCompat.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = setResourcePackageNamelambda0.SHUTDOWN;
        this.PlaybackStateCompat = setresourcepackagenamelambda0;
        this.MediaBrowserCompatMediaItem = setresourcepackagenamelambda0;
        serializer();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((onCreatelambda1) it.next()).read.RatingCompat();
        }
        map.clear();
    }

    @Override // o.hasPermissionlambda0
    public final void serializer(Status status) {
        HashMap map = this.MediaSessionCompatToken;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((onCreatelambda1) it.next()).read.RatingCompat();
        }
        map.clear();
        read(setResourcePackageNamelambda0.TRANSIENT_FAILURE, new createWebViewClient(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer(status)));
    }

    @Override // o.hasPermissionlambda0
    public final void RemoteActionCompatParcelizer() {
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1;
        ImageResources_androidKt imageResources_androidKt = this.MediaSessionCompatQueueItem;
        if (imageResources_androidKt == null || !imageResources_androidKt.MediaMetadataCompat() || this.PlaybackStateCompat == setResourcePackageNamelambda0.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddress = this.MediaSessionCompatQueueItem.read();
        HashMap map = this.MediaSessionCompatToken;
        boolean zContainsKey = map.containsKey(socketAddress);
        java.util.logging.Logger logger = MediaMetadataCompat;
        if (zContainsKey) {
            jsonUtilsExternalSyntheticLambda1 = ((onCreatelambda1) map.get(socketAddress)).read;
        } else {
            BrazeWebViewActivity brazeWebViewActivity = new BrazeWebViewActivity(this);
            requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2Write = requestPushPermissionPromptlambda2.write();
            r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE[] r8lambda_glyxfcg6xju1wmp26w6t1itdueArr = {new r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE(socketAddress)};
            androidx.sqlite.SQLite.serializer(1, "arraySize");
            ArrayList arrayList = new ArrayList(component3D9Ej5fM.write(6L));
            Collections.addAll(arrayList, r8lambda_glyxfcg6xju1wmp26w6t1itdueArr);
            requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer(arrayList);
            requestpushpermissionpromptlambda2Write.read(brazeWebViewActivity);
            final JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda2 = this.ParcelableVolumeInfo.read(new requestPushPermissionPromptlambda2(requestpushpermissionpromptlambda2Write.write, requestpushpermissionpromptlambda2Write.serializer, requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer));
            if (jsonUtilsExternalSyntheticLambda2 == null) {
                logger.warning("Was not able to create subchannel for " + socketAddress);
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't create subchannel");
                return;
            }
            onCreatelambda1 oncreatelambda1 = new onCreatelambda1(jsonUtilsExternalSyntheticLambda2, setResourcePackageNamelambda0.IDLE, brazeWebViewActivity);
            brazeWebViewActivity.read = oncreatelambda1;
            map.put(socketAddress, oncreatelambda1);
            if (jsonUtilsExternalSyntheticLambda2.serializer().read.get(hasPermissionlambda0.serializer) == null) {
                brazeWebViewActivity.IconCompatParcelizer = PackageUtils.read(setResourcePackageNamelambda0.READY);
            }
            jsonUtilsExternalSyntheticLambda2.serializer(new wouldPushPermissionPromptDisplaylambda4() { // from class: o.createWebChromeClient
                @Override // o.wouldPushPermissionPromptDisplaylambda4
                public final void write(PackageUtils packageUtils) {
                    JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda3;
                    setBrazeDeeplinkHandler setbrazedeeplinkhandler = this.IconCompatParcelizer;
                    LoadBalancer$Helper loadBalancer$Helper = setbrazedeeplinkhandler.ParcelableVolumeInfo;
                    setResourcePackageNamelambda0 setresourcepackagenamelambda0 = packageUtils.IconCompatParcelizer;
                    HashMap map2 = setbrazedeeplinkhandler.MediaSessionCompatToken;
                    JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda4 = jsonUtilsExternalSyntheticLambda2;
                    onCreatelambda1 oncreatelambda2 = (onCreatelambda1) map2.get((SocketAddress) jsonUtilsExternalSyntheticLambda4.read().read.get(0));
                    if (oncreatelambda2 == null || (jsonUtilsExternalSyntheticLambda3 = oncreatelambda2.read) != jsonUtilsExternalSyntheticLambda4 || setresourcepackagenamelambda0 == setResourcePackageNamelambda0.SHUTDOWN) {
                        return;
                    }
                    setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.IDLE;
                    if (setresourcepackagenamelambda0 == setresourcepackagenamelambda1) {
                        loadBalancer$Helper.RemoteActionCompatParcelizer();
                    }
                    onCreatelambda1.read(oncreatelambda2, setresourcepackagenamelambda0);
                    setResourcePackageNamelambda0 setresourcepackagenamelambda2 = setbrazedeeplinkhandler.PlaybackStateCompat;
                    setResourcePackageNamelambda0 setresourcepackagenamelambda3 = setResourcePackageNamelambda0.TRANSIENT_FAILURE;
                    if (setresourcepackagenamelambda2 == setresourcepackagenamelambda3 || setbrazedeeplinkhandler.MediaBrowserCompatMediaItem == setresourcepackagenamelambda3) {
                        if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.CONNECTING) {
                            return;
                        }
                        if (setresourcepackagenamelambda0 == setresourcepackagenamelambda1) {
                            setbrazedeeplinkhandler.RemoteActionCompatParcelizer();
                            return;
                        }
                    }
                    int i = r8lambdaAEgK79P0sQkRVa55FJ7MuPxPs.IconCompatParcelizer[setresourcepackagenamelambda0.ordinal()];
                    if (i == 1) {
                        ImageResources_androidKt imageResources_androidKt2 = setbrazedeeplinkhandler.MediaSessionCompatQueueItem;
                        imageResources_androidKt2.RemoteActionCompatParcelizer = 0;
                        imageResources_androidKt2.serializer = 0;
                        setbrazedeeplinkhandler.PlaybackStateCompat = setresourcepackagenamelambda1;
                        setbrazedeeplinkhandler.read(setresourcepackagenamelambda1, new r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw(setbrazedeeplinkhandler, setbrazedeeplinkhandler));
                        return;
                    }
                    if (i == 2) {
                        setResourcePackageNamelambda0 setresourcepackagenamelambda4 = setResourcePackageNamelambda0.CONNECTING;
                        setbrazedeeplinkhandler.PlaybackStateCompat = setresourcepackagenamelambda4;
                        setbrazedeeplinkhandler.read(setresourcepackagenamelambda4, new createWebViewClient(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer));
                        return;
                    }
                    if (i == 3) {
                        setbrazedeeplinkhandler.serializer();
                        for (onCreatelambda1 oncreatelambda3 : map2.values()) {
                            if (!oncreatelambda3.read.equals(jsonUtilsExternalSyntheticLambda3)) {
                                oncreatelambda3.read.RatingCompat();
                            }
                        }
                        map2.clear();
                        setResourcePackageNamelambda0 setresourcepackagenamelambda5 = setResourcePackageNamelambda0.READY;
                        onCreatelambda1.read(oncreatelambda2, setresourcepackagenamelambda5);
                        map2.put((SocketAddress) jsonUtilsExternalSyntheticLambda3.read().read.get(0), oncreatelambda2);
                        setbrazedeeplinkhandler.MediaSessionCompatQueueItem.read((SocketAddress) jsonUtilsExternalSyntheticLambda4.read().read.get(0));
                        setbrazedeeplinkhandler.PlaybackStateCompat = setresourcepackagenamelambda5;
                        setbrazedeeplinkhandler.IconCompatParcelizer(oncreatelambda2);
                        return;
                    }
                    if (i != 4) {
                        Gson$$ExternalSyntheticBUOutline0.m(setresourcepackagenamelambda0, "Unsupported state:");
                        return;
                    }
                    if (setbrazedeeplinkhandler.MediaSessionCompatQueueItem.MediaMetadataCompat() && ((onCreatelambda1) map2.get(setbrazedeeplinkhandler.MediaSessionCompatQueueItem.read())).read == jsonUtilsExternalSyntheticLambda4 && setbrazedeeplinkhandler.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()) {
                        setbrazedeeplinkhandler.serializer();
                        setbrazedeeplinkhandler.RemoteActionCompatParcelizer();
                    }
                    ImageResources_androidKt imageResources_androidKt3 = setbrazedeeplinkhandler.MediaSessionCompatQueueItem;
                    if (imageResources_androidKt3 == null || imageResources_androidKt3.MediaMetadataCompat()) {
                        return;
                    }
                    int size = map2.size();
                    List list = (List) setbrazedeeplinkhandler.MediaSessionCompatQueueItem.read;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((onCreatelambda1) it.next()).write) {
                            return;
                        }
                    }
                    setResourcePackageNamelambda0 setresourcepackagenamelambda6 = setResourcePackageNamelambda0.TRANSIENT_FAILURE;
                    setbrazedeeplinkhandler.PlaybackStateCompat = setresourcepackagenamelambda6;
                    setbrazedeeplinkhandler.read(setresourcepackagenamelambda6, new createWebViewClient(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer(packageUtils.read)));
                    int i2 = setbrazedeeplinkhandler.PlaybackStateCompatCustomAction + 1;
                    setbrazedeeplinkhandler.PlaybackStateCompatCustomAction = i2;
                    List list2 = (List) setbrazedeeplinkhandler.MediaSessionCompatQueueItem.read;
                    if (i2 >= (list2 != null ? list2.size() : 0) || setbrazedeeplinkhandler.RatingCompat) {
                        setbrazedeeplinkhandler.RatingCompat = false;
                        setbrazedeeplinkhandler.PlaybackStateCompatCustomAction = 0;
                        loadBalancer$Helper.RemoteActionCompatParcelizer();
                    }
                }
            });
            jsonUtilsExternalSyntheticLambda1 = jsonUtilsExternalSyntheticLambda2;
        }
        int i = r8lambdaAEgK79P0sQkRVa55FJ7MuPxPs.IconCompatParcelizer[((onCreatelambda1) map.get(socketAddress)).IconCompatParcelizer.ordinal()];
        if (i == 1) {
            jsonUtilsExternalSyntheticLambda1.MediaDescriptionCompat();
            onCreatelambda1.read((onCreatelambda1) map.get(socketAddress), setResourcePackageNamelambda0.CONNECTING);
            write();
        } else {
            if (i == 2) {
                if (this.MediaDescriptionCompat) {
                    write();
                    return;
                } else {
                    jsonUtilsExternalSyntheticLambda1.MediaDescriptionCompat();
                    return;
                }
            }
            if (i == 3) {
                logger.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i != 4) {
                    return;
                }
                this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void read(setResourcePackageNamelambda0 setresourcepackagenamelambda0, requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        if (setresourcepackagenamelambda0 == this.MediaBrowserCompatMediaItem && (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.IDLE || setresourcepackagenamelambda0 == setResourcePackageNamelambda0.CONNECTING)) {
            return;
        }
        this.MediaBrowserCompatMediaItem = setresourcepackagenamelambda0;
        this.ParcelableVolumeInfo.write(setresourcepackagenamelambda0, requestpushpermissionpromptlambda3);
    }

    public final void serializer() {
        FormBody.Builder builder = this.MediaSessionCompatResultReceiverWrapper;
        if (builder != null) {
            builder.RatingCompat();
            this.MediaSessionCompatResultReceiverWrapper = null;
        }
    }

    public final void write() {
        if (this.MediaDescriptionCompat) {
            FormBody.Builder builder = this.MediaSessionCompatResultReceiverWrapper;
            if (builder == null || !builder.MediaSessionCompatQueueItem()) {
                LoadBalancer$Helper loadBalancer$Helper = this.ParcelableVolumeInfo;
                this.MediaSessionCompatResultReceiverWrapper = loadBalancer$Helper.write().read(new isAutomaticGeofenceRequestsEnabled(12, this), 250L, TimeUnit.MILLISECONDS, loadBalancer$Helper.read());
            }
        }
    }

    public setBrazeDeeplinkHandler(LoadBalancer$Helper loadBalancer$Helper) {
        boolean z = false;
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = setResourcePackageNamelambda0.IDLE;
        this.PlaybackStateCompat = setresourcepackagenamelambda0;
        this.MediaBrowserCompatMediaItem = setresourcepackagenamelambda0;
        java.util.logging.Logger logger = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.ResultReceiver;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!visitSubtreeIfYYKmho.write(property) && Boolean.parseBoolean(property)) {
            z = true;
        }
        this.MediaDescriptionCompat = z;
        this.ParcelableVolumeInfo = loadBalancer$Helper;
    }
}
