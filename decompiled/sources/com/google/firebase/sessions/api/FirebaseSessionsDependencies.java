package com.google.firebase.sessions.api;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.accessgetAccessibilityFocusedVirtualViewIdp;
import o.accessgetCurrentlyAccessibilityFocusedANIp;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseSessionsDependencies {
    public static final FirebaseSessionsDependencies read = new FirebaseSessionsDependencies();
    public static final Map RemoteActionCompatParcelizer = Collections.synchronizedMap(new LinkedHashMap());

    public static accessgetAccessibilityFocusedVirtualViewIdp IconCompatParcelizer(accessgetCurrentlyAccessibilityFocusedANIp accessgetcurrentlyaccessibilityfocusedanip) {
        Map map = RemoteActionCompatParcelizer;
        map.getClass();
        Object obj = map.get(accessgetcurrentlyaccessibilityfocusedanip);
        if (obj != null) {
            return (accessgetAccessibilityFocusedVirtualViewIdp) obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Cannot get dependency ", accessgetcurrentlyaccessibilityfocusedanip, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008e -> B:30:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof o.accesscreateNodeInfo
            if (r0 == 0) goto L13
            r0 = r11
            o.accesscreateNodeInfo r0 = (o.accesscreateNodeInfo) r0
            int r1 = r0.MediaMetadataCompat
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.MediaMetadataCompat = r1
            goto L18
        L13:
            o.accesscreateNodeInfo r0 = new o.accesscreateNodeInfo
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.MediaBrowserCompatMediaItem
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.MediaMetadataCompat
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r2 = r0.RatingCompat
            java.util.Map r5 = r0.write
            kotlinx.coroutines.sync.MutexImpl r6 = r0.read
            o.accessgetCurrentlyAccessibilityFocusedANIp r7 = r0.RemoteActionCompatParcelizer
            java.util.Iterator r8 = r0.IconCompatParcelizer
            java.util.Map r9 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L8f
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r4
        L3a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            java.util.Map r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.RemoteActionCompatParcelizer
            r11.getClass()
            int r2 = r11.size()
            int r2 = o.onMove.RemoteActionCompatParcelizer(r2)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
        L5a:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lc0
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            o.accessgetCurrentlyAccessibilityFocusedANIp r7 = (o.accessgetCurrentlyAccessibilityFocusedANIp) r7
            java.lang.Object r11 = r11.getValue()
            o.accessgetAccessibilityFocusedVirtualViewIdp r11 = (o.accessgetAccessibilityFocusedVirtualViewIdp) r11
            kotlinx.coroutines.sync.MutexImpl r6 = r11.IconCompatParcelizer
            r0.serializer = r5
            r0.IconCompatParcelizer = r8
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r6
            r0.write = r5
            r0.RatingCompat = r2
            r0.MediaMetadataCompat = r3
            java.lang.Object r11 = r6.lock(r0)
            if (r11 != r1) goto L8e
            return r1
        L8e:
            r9 = r5
        L8f:
            r7.getClass()     // Catch: java.lang.Throwable -> Lbb
            o.accessgetAccessibilityFocusedVirtualViewIdp r11 = IconCompatParcelizer(r7)     // Catch: java.lang.Throwable -> Lbb
            o.getDetachedFromParentLookaheadPlacement r11 = r11.write     // Catch: java.lang.Throwable -> Lbb
            if (r11 == 0) goto La2
            r6.write(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L5a
        La2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "Subscriber "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbb
            r0.append(r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = " has not been registered."
            r0.append(r1)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbb
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            throw r11     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r11 = move-exception
            r6.write(r4)
            throw r11
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
