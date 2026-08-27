package o;

import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdawhi89LFIaMpCd_VDuYlA8ZBB70U extends hasPermissionlambda0 {
    public static final java.util.logging.Logger MediaSessionCompatQueueItem = java.util.logging.Logger.getLogger(r8lambdawhi89LFIaMpCd_VDuYlA8ZBB70U.class.getName());
    public setResourcePackageNamelambda0 MediaDescriptionCompat;
    public final LoadBalancer$Helper MediaMetadataCompat;
    public final AtomicInteger MediaSessionCompatToken;
    public boolean PlaybackStateCompat;
    public requestPushPermissionPromptlambda3 RatingCompat;
    public final LinkedHashMap MediaBrowserCompatMediaItem = new LinkedHashMap();
    public final BrazeWebViewActivitycreateWebViewClient1 PlaybackStateCompatCustomAction = new BrazeWebViewActivitycreateWebViewClient1();

    public final executelambda0 IconCompatParcelizer(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((runOnUser) it.next()).write);
        }
        return new executelambda0(arrayList, this.MediaSessionCompatToken);
    }

    @Override // o.hasPermissionlambda0
    public final Status RemoteActionCompatParcelizer(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        try {
            this.PlaybackStateCompat = true;
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtswsIconCompatParcelizer = IconCompatParcelizer(requestpushpermissionpromptlambda1);
            Status status = (Status) r8lambda1mnczrzuv4owduwgkg6cjtswsIconCompatParcelizer.write;
            if (!status.IconCompatParcelizer()) {
                this.PlaybackStateCompat = false;
                return status;
            }
            write();
            for (runOnUser runonuser : (List) r8lambda1mnczrzuv4owduwgkg6cjtswsIconCompatParcelizer.IconCompatParcelizer) {
                runonuser.IconCompatParcelizer.read();
                runonuser.read = setResourcePackageNamelambda0.SHUTDOWN;
                MediaSessionCompatQueueItem.log(Level.FINE, "Child balancer {0} deleted", runonuser.RemoteActionCompatParcelizer);
            }
            this.PlaybackStateCompat = false;
            return status;
        } catch (Throwable th) {
            this.PlaybackStateCompat = false;
            throw th;
        }
    }

    @Override // o.hasPermissionlambda0
    public final void serializer(Status status) {
        if (this.MediaDescriptionCompat != setResourcePackageNamelambda0.READY) {
            this.MediaMetadataCompat.write(setResourcePackageNamelambda0.TRANSIENT_FAILURE, new wouldPushPermissionPromptDisplay(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer(status)));
        }
    }

    public final void write() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.MediaBrowserCompatMediaItem;
        for (runOnUser runonuser : linkedHashMap.values()) {
            if (!runonuser.serializer && runonuser.read == setResourcePackageNamelambda0.READY) {
                arrayList.add(runonuser);
            }
        }
        if (!arrayList.isEmpty()) {
            IconCompatParcelizer(setResourcePackageNamelambda0.READY, IconCompatParcelizer(arrayList));
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            setResourcePackageNamelambda0 setresourcepackagenamelambda0 = ((runOnUser) it.next()).read;
            setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.CONNECTING;
            if (setresourcepackagenamelambda0 == setresourcepackagenamelambda1 || setresourcepackagenamelambda0 == setResourcePackageNamelambda0.IDLE) {
                IconCompatParcelizer(setresourcepackagenamelambda1, new r8lambdaiw5tgMXyLwvsO1W9E5YcH3ltXyQ());
                return;
            }
        }
        IconCompatParcelizer(setResourcePackageNamelambda0.TRANSIENT_FAILURE, IconCompatParcelizer(linkedHashMap.values()));
    }

    public final r8lambda1MNczrzuv4oWduWgKg6cjtSWs IconCompatParcelizer(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        LinkedHashMap linkedHashMap;
        delegateUnprotectedui delegateunprotecteduiIconCompatParcelizer;
        r8lambdadoClphLDH84V28u6usJH1THq0 r8lambdadoclphldh84v28u6usjh1thq0;
        r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE r8lambda_glyxfcg6xju1wmp26w6t1itdue;
        Level level = Level.FINE;
        java.util.logging.Logger logger = MediaSessionCompatQueueItem;
        logger.log(level, "Received resolution result: {0}", requestpushpermissionpromptlambda1);
        HashMap map = new HashMap();
        List list = requestpushpermissionpromptlambda1.read;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.MediaBrowserCompatMediaItem;
            if (!zHasNext) {
                break;
            }
            r8lambdadoClphLDH84V28u6usJH1THq0 r8lambdadoclphldh84v28u6usjh1thq1 = new r8lambdadoClphLDH84V28u6usJH1THq0((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) it.next());
            runOnUser runonuser = (runOnUser) linkedHashMap.get(r8lambdadoclphldh84v28u6usjh1thq1);
            if (runonuser != null) {
                map.put(r8lambdadoclphldh84v28u6usjh1thq1, runonuser);
            } else {
                map.put(r8lambdadoclphldh84v28u6usjh1thq1, new runOnUser(this, r8lambdadoclphldh84v28u6usjh1thq1, this.PlaybackStateCompatCustomAction, new wouldPushPermissionPromptDisplay(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer)));
            }
        }
        if (map.isEmpty()) {
            Status statusIconCompatParcelizer = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("NameResolver returned no usable address. " + requestpushpermissionpromptlambda1);
            serializer(statusIconCompatParcelizer);
            return new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(statusIconCompatParcelizer, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3 = ((runOnUser) entry.getValue()).MediaBrowserCompatMediaItem;
            ((runOnUser) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                runOnUser runonuser2 = (runOnUser) linkedHashMap.get(key);
                if (runonuser2.serializer) {
                    runonuser2.serializer = false;
                }
            } else {
                linkedHashMap.put(key, (runOnUser) entry.getValue());
            }
            runOnUser runonuser3 = (runOnUser) linkedHashMap.get(key);
            if (key instanceof r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) {
                r8lambdadoclphldh84v28u6usjh1thq0 = new r8lambdadoClphLDH84V28u6usJH1THq0((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) key);
            } else {
                TextStreamsKt.read("key is wrong type", key instanceof r8lambdadoClphLDH84V28u6usJH1THq0);
                r8lambdadoclphldh84v28u6usjh1thq0 = (r8lambdadoClphLDH84V28u6usJH1THq0) key;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    r8lambda_glyxfcg6xju1wmp26w6t1itdue = null;
                    break;
                }
                r8lambda_glyxfcg6xju1wmp26w6t1itdue = (r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) it2.next();
            } while (!r8lambdadoclphldh84v28u6usjh1thq0.equals(new r8lambdadoClphLDH84V28u6usJH1THq0(r8lambda_glyxfcg6xju1wmp26w6t1itdue)));
            TextStreamsKt.serializer(r8lambda_glyxfcg6xju1wmp26w6t1itdue, key + " no longer present in load balancer children");
            getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = getPrettyPrintedStringlambda0.serializer;
            List listSingletonList = Collections.singletonList(r8lambda_glyxfcg6xju1wmp26w6t1itdue);
            getPrettyPrintedStringlambda0 getprettyprintedstringlambda1 = getPrettyPrintedStringlambda0.serializer;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(hasPermissionlambda0.RemoteActionCompatParcelizer, bool);
            for (Map.Entry entry2 : getprettyprintedstringlambda1.read.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((parseJsonObjectIntoBundle) entry2.getKey(), entry2.getValue());
                }
            }
            requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda2 = new requestPushPermissionPromptlambda1(listSingletonList, new getPrettyPrintedStringlambda0(identityHashMap), null);
            ((runOnUser) linkedHashMap.get(key)).getClass();
            if (!runonuser3.serializer) {
                runonuser3.IconCompatParcelizer.write(requestpushpermissionpromptlambda2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionKeySet = linkedHashMap.keySet();
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        if (collectionKeySet instanceof getSelfKindSetui) {
            delegateunprotecteduiIconCompatParcelizer = ((getSelfKindSetui) collectionKeySet).read();
            if (delegateunprotecteduiIconCompatParcelizer.serializer()) {
                Object[] array = delegateunprotecteduiIconCompatParcelizer.toArray(getSelfKindSetui.IconCompatParcelizer);
                delegateunprotecteduiIconCompatParcelizer = delegateUnprotectedui.IconCompatParcelizer(array.length, array);
            }
        } else {
            Object[] array2 = collectionKeySet.toArray();
            coil3.util.ContextsKt.serializer(array2.length, array2);
            delegateunprotecteduiIconCompatParcelizer = delegateUnprotectedui.IconCompatParcelizer(array2.length, array2);
        }
        DepthSortedSet depthSortedSetListIterator = delegateunprotecteduiIconCompatParcelizer.listIterator(0);
        while (depthSortedSetListIterator.hasNext()) {
            Object next = depthSortedSetListIterator.next();
            if (!map.containsKey(next)) {
                runOnUser runonuser4 = (runOnUser) linkedHashMap.get(next);
                r8lambdadoClphLDH84V28u6usJH1THq0 r8lambdadoclphldh84v28u6usjh1thq2 = runonuser4.RemoteActionCompatParcelizer;
                if (!runonuser4.serializer) {
                    runonuser4.MediaDescriptionCompat.MediaBrowserCompatMediaItem.remove(r8lambdadoclphldh84v28u6usjh1thq2);
                    runonuser4.serializer = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", r8lambdadoclphldh84v28u6usjh1thq2);
                }
                arrayList.add(runonuser4);
            }
        }
        return new r8lambda1MNczrzuv4oWduWgKg6cjtSWs(Status.RatingCompat, arrayList);
    }

    public final void IconCompatParcelizer(setResourcePackageNamelambda0 setresourcepackagenamelambda0, requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        if (setresourcepackagenamelambda0 == this.MediaDescriptionCompat && requestpushpermissionpromptlambda3.equals(this.RatingCompat)) {
            return;
        }
        this.MediaMetadataCompat.write(setresourcepackagenamelambda0, requestpushpermissionpromptlambda3);
        this.MediaDescriptionCompat = setresourcepackagenamelambda0;
        this.RatingCompat = requestpushpermissionpromptlambda3;
    }

    @Override // o.hasPermissionlambda0
    public final void read() {
        Level level = Level.FINE;
        java.util.logging.Logger logger = MediaSessionCompatQueueItem;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.MediaBrowserCompatMediaItem;
        for (runOnUser runonuser : linkedHashMap.values()) {
            runonuser.IconCompatParcelizer.read();
            runonuser.read = setResourcePackageNamelambda0.SHUTDOWN;
            logger.log(Level.FINE, "Child balancer {0} deleted", runonuser.RemoteActionCompatParcelizer);
        }
        linkedHashMap.clear();
    }

    public r8lambdawhi89LFIaMpCd_VDuYlA8ZBB70U(LoadBalancer$Helper loadBalancer$Helper) {
        this.MediaMetadataCompat = loadBalancer$Helper;
        MediaSessionCompatQueueItem.log(Level.FINE, "Created");
        this.MediaSessionCompatToken = new AtomicInteger(new Random().nextInt());
        this.RatingCompat = new r8lambdaiw5tgMXyLwvsO1W9E5YcH3ltXyQ();
    }
}
