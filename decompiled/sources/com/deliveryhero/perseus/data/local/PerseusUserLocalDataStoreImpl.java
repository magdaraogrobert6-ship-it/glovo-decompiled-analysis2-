package com.deliveryhero.perseus.data.local;

import android.os.Trace;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.work.CoroutineWorker$startWork$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.persistence.cache.CacheData;
import com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver;
import io.sentry.util.UrlUtils;
import java.util.Calendar;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.accessgetIntersectcp;
import o.accesspop;
import o.accesspush;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.generateImageVectorIdui;
import o.getContentViewGroupParentLayout;
import o.getVerticalEllipseRadius;
import o.groupdefault;
import o.onAddedToParentLayer;
import o.pathR_LF3I;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setStrokeLineCapBeK7IIE;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusUserLocalDataStoreImpl {
    public final SharedFlowImpl IconCompatParcelizer;
    public final SharedFlowImpl MediaDescriptionCompat;
    public final ContextScope MediaSessionCompatQueueItem;
    public final ScreenStartObserver$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public final generateImageVectorIdui read;
    public final EmojiProcessor serializer;
    public final getVerticalEllipseRadius write;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object putClientId(String str, ContinuationImpl continuationImpl) {
        groupdefault groupdefaultVar;
        if (continuationImpl instanceof groupdefault) {
            groupdefaultVar = (groupdefault) continuationImpl;
            int i = groupdefaultVar.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupdefaultVar.write = i - Integer.MIN_VALUE;
            } else {
                groupdefaultVar = new groupdefault(this, continuationImpl);
            }
        } else {
            groupdefaultVar = new groupdefault(this, continuationImpl);
        }
        Object obj = groupdefaultVar.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = groupdefaultVar.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setStrokeLineCapBeK7IIE.write("Perseus.user.putClientId");
                Trace.beginSection("Perseus.user.putClientId");
                this.write.serializer(str, "client_id");
                generateImageVectorIdui generateimagevectoridui = this.read;
                groupdefaultVar.write = 1;
                if (generateimagevectoridui.serializer("client_id", str, groupdefaultVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            Trace.endSection();
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:17:0x003f, B:30:0x008a, B:32:0x0092, B:33:0x00a2, B:18:0x0043, B:21:0x0053, B:23:0x0069, B:26:0x0078), top: B:41:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {all -> 0x00b7, blocks: (B:17:0x003f, B:30:0x008a, B:32:0x0092, B:33:0x00a2, B:18:0x0043, B:21:0x0053, B:23:0x0069, B:26:0x0078), top: B:41:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r6.RemoteActionCompatParcelizer(r8, "session_offset", r3) == r4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putSessionOffset(long r15, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            r14 = this;
            r7 = r14
            r0 = r15
            r2 = r17
            boolean r3 = r2 instanceof o.pop
            if (r3 == 0) goto L17
            r3 = r2
            o.pop r3 = (o.pop) r3
            int r4 = r3.write
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 + r5
            r3.write = r4
            goto L1c
        L17:
            o.pop r3 = new o.pop
            r3.<init>(r14, r2)
        L1c:
            java.lang.Object r2 = r3.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.write
            o.generateImageVectorIdui r6 = r7.read
            r8 = 2
            r9 = 1
            java.lang.String r10 = "session_offset"
            r11 = 0
            r12 = 3
            if (r5 == 0) goto L48
            if (r5 == r9) goto L43
            if (r5 == r8) goto L39
            if (r5 != r12) goto L33
            goto L43
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r0)
            return r11
        L39:
            int r0 = r3.read
            int r1 = r3.RemoteActionCompatParcelizer
            long r8 = r3.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r2)     // Catch: java.lang.Throwable -> Lb7
            goto L8a
        L43:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r2)     // Catch: java.lang.Throwable -> Lb7
            goto Lb1
        L48:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r2)
            java.lang.String r2 = "Perseus.user.putSessionOffset"
            o.setStrokeLineCapBeK7IIE.write(r2)
            android.os.Trace.beginSection(r2)
            o.getVerticalEllipseRadius r2 = r7.write     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> Lb7
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            r2.serializer(r5, r10)     // Catch: java.lang.Throwable -> Lb7
            com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider r2 = o.updateRenderPath.MediaSessionCompatQueueItem     // Catch: java.lang.Throwable -> Lb7
            r2.getClass()     // Catch: java.lang.Throwable -> Lb7
            boolean r5 = com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> Lb7
            r13 = 0
            if (r5 != 0) goto L78
            r3.serializer = r0     // Catch: java.lang.Throwable -> Lb7
            r3.RemoteActionCompatParcelizer = r13     // Catch: java.lang.Throwable -> Lb7
            r3.read = r13     // Catch: java.lang.Throwable -> Lb7
            r3.write = r9     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r0 = r6.RemoteActionCompatParcelizer(r0, r10, r3)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != r4) goto Lb1
            goto Lb0
        L78:
            r3.serializer = r0     // Catch: java.lang.Throwable -> Lb7
            r3.RemoteActionCompatParcelizer = r13     // Catch: java.lang.Throwable -> Lb7
            r3.read = r13     // Catch: java.lang.Throwable -> Lb7
            r3.write = r8     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r2 = r2.getConfig(r3)     // Catch: java.lang.Throwable -> Lb7
            if (r2 != r4) goto L87
            goto Lb0
        L87:
            r8 = r0
            r0 = r13
            r1 = r0
        L8a:
            com.deliveryhero.perseus.PerseusParamsConfig r2 = (com.deliveryhero.perseus.PerseusParamsConfig) r2     // Catch: java.lang.Throwable -> Lb7
            boolean r2 = r2.getDebounceSessionLocalStorage()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto La2
            kotlinx.coroutines.internal.ContextScope r0 = r7.MediaSessionCompatQueueItem     // Catch: java.lang.Throwable -> Lb7
            com.roadrunner.nafath.NafathModalUiModelImpl$1$2 r10 = new com.roadrunner.nafath.NafathModalUiModelImpl$1$2     // Catch: java.lang.Throwable -> Lb7
            r5 = 0
            r6 = 3
            r1 = r10
            r2 = r14
            r3 = r8
            r1.<init>(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> Lb7
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r0, r11, r11, r10, r12)     // Catch: java.lang.Throwable -> Lb7
            goto Lb1
        La2:
            r3.serializer = r8     // Catch: java.lang.Throwable -> Lb7
            r3.RemoteActionCompatParcelizer = r1     // Catch: java.lang.Throwable -> Lb7
            r3.read = r0     // Catch: java.lang.Throwable -> Lb7
            r3.write = r12     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r0 = r6.RemoteActionCompatParcelizer(r8, r10, r3)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != r4) goto Lb1
        Lb0:
            return r4
        Lb1:
            android.os.Trace.endSection()
            o.createFromParcel r0 = o.createFromParcel.INSTANCE
            return r0
        Lb7:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl.putSessionOffset(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public PerseusUserLocalDataStoreImpl(getVerticalEllipseRadius getverticalellipseradius, generateImageVectorIdui generateimagevectoridui, ScreenStartObserver$$ExternalSyntheticLambda0 screenStartObserver$$ExternalSyntheticLambda0) {
        getverticalellipseradius.getClass();
        generateimagevectoridui.getClass();
        this.write = getverticalellipseradius;
        this.read = generateimagevectoridui;
        this.RemoteActionCompatParcelizer = screenStartObserver$$ExternalSyntheticLambda0;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, null, 5);
        this.MediaDescriptionCompat = sharedFlowImplRemoteActionCompatParcelizer;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer2 = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, null, 5);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer2;
        this.serializer = new EmojiProcessor(new accessgetIntersectcp(19), new onAddedToParentLayer(14));
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(UrlUtils.serializer());
        this.MediaSessionCompatQueueItem = contextScopeRemoteActionCompatParcelizer;
        FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CoroutineWorker$startWork$1(this, null, 6), FlowKt.write(sharedFlowImplRemoteActionCompatParcelizer, 400L)), contextScopeRemoteActionCompatParcelizer);
        FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(this, null), FlowKt.write(sharedFlowImplRemoteActionCompatParcelizer2, 400L)), contextScopeRemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object getSessionOffset(ContinuationImpl continuationImpl) {
        accesspush accesspushVar;
        long jLongValue;
        if (continuationImpl instanceof accesspush) {
            accesspushVar = (accesspush) continuationImpl;
            int i = accesspushVar.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accesspushVar.serializer = i - Integer.MIN_VALUE;
            } else {
                accesspushVar = new accesspush(this, continuationImpl);
            }
        } else {
            accesspushVar = new accesspush(this, continuationImpl);
        }
        Object obj = accesspushVar.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accesspushVar.serializer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setStrokeLineCapBeK7IIE.write("Perseus.user.getSessionOffset");
                Trace.beginSection("Perseus.user.getSessionOffset");
                Long l = (Long) this.write.write("session_offset");
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    generateImageVectorIdui generateimagevectoridui = this.read;
                    accesspushVar.serializer = 1;
                    obj = generateimagevectoridui.getLong(1L, "session_offset", accesspushVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                Long l2 = new Long(jLongValue);
                Trace.endSection();
                return l2;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            jLongValue = ((Number) obj).longValue();
            Long l3 = new Long(jLongValue);
            Trace.endSection();
            return l3;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if (r4.RemoteActionCompatParcelizer(r6, "session_creation_timestamp", r1) == r2) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object putSessionId(java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            java.lang.String r0 = "session_id"
            boolean r1 = r14 instanceof o.PathBuilder
            if (r1 == 0) goto L15
            r1 = r14
            o.PathBuilder r1 = (o.PathBuilder) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L1a
        L15:
            o.PathBuilder r1 = new o.PathBuilder
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.RemoteActionCompatParcelizer
            o.generateImageVectorIdui r4 = r12.read
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L4d
            if (r3 == r7) goto L43
            if (r3 == r6) goto L39
            if (r3 != r5) goto L32
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)     // Catch: java.lang.Throwable -> Lae
            goto La8
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r13)
            r13 = 0
            return r13
        L39:
            long r6 = r1.write
            int r13 = r1.IconCompatParcelizer
            int r0 = r1.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)     // Catch: java.lang.Throwable -> Lae
            goto L97
        L43:
            long r7 = r1.write
            int r13 = r1.IconCompatParcelizer
            int r0 = r1.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)     // Catch: java.lang.Throwable -> Lae
            goto L85
        L4d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            java.lang.String r14 = "Perseus.user.putSessionId"
            o.setStrokeLineCapBeK7IIE.write(r14)
            android.os.Trace.beginSection(r14)
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0 r14 = r12.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r14 = r14.B_()     // Catch: java.lang.Throwable -> Lae
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch: java.lang.Throwable -> Lae
            long r8 = r14.getTimeInMillis()     // Catch: java.lang.Throwable -> Lae
            o.getVerticalEllipseRadius r14 = r12.write     // Catch: java.lang.Throwable -> Lae
            java.util.concurrent.ConcurrentHashMap r14 = r14.write     // Catch: java.lang.Throwable -> Lae
            com.deliveryhero.persistence.cache.CacheData r3 = new com.deliveryhero.persistence.cache.CacheData     // Catch: java.lang.Throwable -> Lae
            r10 = 1800(0x708, double:8.893E-321)
            r3.<init>(r10, r13)     // Catch: java.lang.Throwable -> Lae
            r14.put(r0, r3)     // Catch: java.lang.Throwable -> Lae
            r14 = 0
            r1.serializer = r14     // Catch: java.lang.Throwable -> Lae
            r1.IconCompatParcelizer = r14     // Catch: java.lang.Throwable -> Lae
            r1.write = r8     // Catch: java.lang.Throwable -> Lae
            r1.RemoteActionCompatParcelizer = r7     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r13 = r4.serializer(r0, r13, r1)     // Catch: java.lang.Throwable -> Lae
            if (r13 != r2) goto L82
            goto La7
        L82:
            r13 = r14
            r0 = r13
            r7 = r8
        L85:
            r1.serializer = r0     // Catch: java.lang.Throwable -> Lae
            r1.IconCompatParcelizer = r13     // Catch: java.lang.Throwable -> Lae
            r1.write = r7     // Catch: java.lang.Throwable -> Lae
            r1.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Throwable -> Lae
            java.lang.String r14 = "session_timestamp"
            java.lang.Object r14 = r4.RemoteActionCompatParcelizer(r7, r14, r1)     // Catch: java.lang.Throwable -> Lae
            if (r14 != r2) goto L96
            goto La7
        L96:
            r6 = r7
        L97:
            r1.serializer = r0     // Catch: java.lang.Throwable -> Lae
            r1.IconCompatParcelizer = r13     // Catch: java.lang.Throwable -> Lae
            r1.write = r6     // Catch: java.lang.Throwable -> Lae
            r1.RemoteActionCompatParcelizer = r5     // Catch: java.lang.Throwable -> Lae
            java.lang.String r13 = "session_creation_timestamp"
            java.lang.Object r13 = r4.RemoteActionCompatParcelizer(r6, r13, r1)     // Catch: java.lang.Throwable -> Lae
            if (r13 != r2) goto La8
        La7:
            return r2
        La8:
            android.os.Trace.endSection()
            o.createFromParcel r13 = o.createFromParcel.INSTANCE
            return r13
        Lae:
            r13 = move-exception
            android.os.Trace.endSection()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl.putSessionId(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getSessionId(ContinuationImpl continuationImpl) {
        pathR_LF3I pathr_lf3i;
        String str;
        long timeInMillis;
        String str2;
        int i;
        int i2;
        String str3;
        long j;
        boolean z;
        if (continuationImpl instanceof pathR_LF3I) {
            pathr_lf3i = (pathR_LF3I) continuationImpl;
            int i3 = pathr_lf3i.MediaMetadataCompat;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pathr_lf3i.MediaMetadataCompat = i3 - Integer.MIN_VALUE;
            } else {
                pathr_lf3i = new pathR_LF3I(this, continuationImpl);
            }
        } else {
            pathr_lf3i = new pathR_LF3I(this, continuationImpl);
        }
        Object string = pathr_lf3i.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = pathr_lf3i.MediaMetadataCompat;
        getVerticalEllipseRadius getverticalellipseradius = this.write;
        generateImageVectorIdui generateimagevectoridui = this.read;
        try {
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(string);
                setStrokeLineCapBeK7IIE.write("Perseus.user.getSessionId");
                Trace.beginSection("Perseus.user.getSessionId");
                str = (String) getverticalellipseradius.write("session_id");
                if (str == null) {
                    timeInMillis = ((Calendar) this.RemoteActionCompatParcelizer.B_()).getTimeInMillis();
                    pathr_lf3i.read = str;
                    pathr_lf3i.RemoteActionCompatParcelizer = 0;
                    pathr_lf3i.IconCompatParcelizer = 0;
                    pathr_lf3i.serializer = timeInMillis;
                    pathr_lf3i.MediaMetadataCompat = 1;
                    Object obj = generateimagevectoridui.getLong(0L, "session_timestamp", pathr_lf3i);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                        string = obj;
                        i = 0;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                Trace.endSection();
                return str;
            }
            if (i4 == 1) {
                timeInMillis = pathr_lf3i.serializer;
                i = pathr_lf3i.IconCompatParcelizer;
                i2 = pathr_lf3i.RemoteActionCompatParcelizer;
                str2 = pathr_lf3i.read;
                ExtrasKt.RemoteActionCompatParcelizer(string);
            } else if (i4 == 2) {
                j = pathr_lf3i.write;
                timeInMillis = pathr_lf3i.serializer;
                str3 = pathr_lf3i.read;
                ExtrasKt.RemoteActionCompatParcelizer(string);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) string;
            if ((timeInMillis / 60000) - (j / 60000) <= 30) {
                z = true;
            } else {
                z = false;
            }
            if (j == 0 && z) {
                getverticalellipseradius.write.put("session_id", new CacheData(1800L, str));
            } else {
                str = str3;
            }
            Trace.endSection();
            return str;
            long jLongValue = ((Number) string).longValue();
            pathr_lf3i.read = str2;
            pathr_lf3i.RemoteActionCompatParcelizer = i2;
            pathr_lf3i.IconCompatParcelizer = i;
            pathr_lf3i.serializer = timeInMillis;
            pathr_lf3i.write = jLongValue;
            pathr_lf3i.MediaMetadataCompat = 2;
            string = generateimagevectoridui.getString("session_id", pathr_lf3i);
            if (string != coroutineSingletons) {
                str3 = str2;
                j = jLongValue;
                str = (String) string;
                if ((timeInMillis / 60000) - (j / 60000) <= 30) {
                    z = true;
                } else {
                    z = false;
                }
                if (j == 0) {
                    str = str3;
                } else {
                    str = str3;
                }
                Trace.endSection();
                return str;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getClientId(ContinuationImpl continuationImpl) {
        accesspop accesspopVar;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3;
        if (continuationImpl instanceof accesspop) {
            accesspopVar = (accesspop) continuationImpl;
            int i = accesspopVar.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                accesspopVar.write = i - Integer.MIN_VALUE;
            } else {
                accesspopVar = new accesspop(this, continuationImpl);
            }
        } else {
            accesspopVar = new accesspop(this, continuationImpl);
        }
        Object obj = accesspopVar.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accesspopVar.write;
        getVerticalEllipseRadius getverticalellipseradius = this.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setStrokeLineCapBeK7IIE.write("Perseus.user.getClientId");
                Trace.beginSection("Perseus.user.getClientId");
                createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                Object objWrite = getverticalellipseradius.write("client_id");
                createinappmessageeventsubscriber.IconCompatParcelizer = objWrite;
                if (objWrite == null) {
                    generateImageVectorIdui generateimagevectoridui = this.read;
                    accesspopVar.serializer = createinappmessageeventsubscriber;
                    accesspopVar.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
                    accesspopVar.write = 1;
                    Object string = generateimagevectoridui.getString("client_id", accesspopVar);
                    if (string == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                    obj = string;
                    createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                }
                String str = (String) createinappmessageeventsubscriber.IconCompatParcelizer;
                Trace.endSection();
                return str;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber2 = accesspopVar.RemoteActionCompatParcelizer;
            createinappmessageeventsubscriber3 = accesspopVar.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            createinappmessageeventsubscriber2.IconCompatParcelizer = obj;
            Object obj2 = createinappmessageeventsubscriber3.IconCompatParcelizer;
            if (((String) obj2) != null) {
                getverticalellipseradius.serializer(obj2, "client_id");
            }
            createinappmessageeventsubscriber = createinappmessageeventsubscriber3;
            String str2 = (String) createinappmessageeventsubscriber.IconCompatParcelizer;
            Trace.endSection();
            return str2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:17:0x003b, B:30:0x0080, B:32:0x0088, B:33:0x0095, B:18:0x003f, B:21:0x004e, B:23:0x005a, B:26:0x0071), top: B:41:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:17:0x003b, B:30:0x0080, B:32:0x0088, B:33:0x0095, B:18:0x003f, B:21:0x004e, B:23:0x005a, B:26:0x0071), top: B:41:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r3.RemoteActionCompatParcelizer(r9, "session_timestamp", r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshSessionTimeStamp(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof o.push
            if (r0 == 0) goto L13
            r0 = r12
            o.push r0 = (o.push) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.RemoteActionCompatParcelizer = r1
            goto L18
        L13:
            o.push r0 = new o.push
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.RemoteActionCompatParcelizer
            o.generateImageVectorIdui r3 = r11.read
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0 r4 = r11.RemoteActionCompatParcelizer
            java.lang.String r5 = "session_timestamp"
            r6 = 2
            r7 = 1
            r8 = 3
            r9 = 0
            if (r2 == 0) goto L43
            if (r2 == r7) goto L3f
            if (r2 == r6) goto L37
            if (r2 != r8) goto L31
            goto L3f
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r9
        L37:
            int r2 = r0.write
            int r6 = r0.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Throwable -> Lb2
            goto L80
        L3f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Throwable -> Lb2
            goto Lac
        L43:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            java.lang.String r12 = "Perseus.user.refreshSessionTimeStamp"
            o.setStrokeLineCapBeK7IIE.write(r12)
            android.os.Trace.beginSection(r12)
            com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider r12 = o.updateRenderPath.MediaSessionCompatQueueItem     // Catch: java.lang.Throwable -> Lb2
            r12.getClass()     // Catch: java.lang.Throwable -> Lb2
            boolean r2 = com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> Lb2
            r10 = 0
            if (r2 != 0) goto L71
            java.lang.Object r12 = r4.B_()     // Catch: java.lang.Throwable -> Lb2
            java.util.Calendar r12 = (java.util.Calendar) r12     // Catch: java.lang.Throwable -> Lb2
            long r8 = r12.getTimeInMillis()     // Catch: java.lang.Throwable -> Lb2
            r0.read = r10     // Catch: java.lang.Throwable -> Lb2
            r0.write = r10     // Catch: java.lang.Throwable -> Lb2
            r0.RemoteActionCompatParcelizer = r7     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r12 = r3.RemoteActionCompatParcelizer(r8, r5, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r12 != r1) goto Lac
            goto Lab
        L71:
            r0.read = r10     // Catch: java.lang.Throwable -> Lb2
            r0.write = r10     // Catch: java.lang.Throwable -> Lb2
            r0.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r12 = r12.getConfig(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r12 != r1) goto L7e
            goto Lab
        L7e:
            r2 = r10
            r6 = r2
        L80:
            com.deliveryhero.perseus.PerseusParamsConfig r12 = (com.deliveryhero.perseus.PerseusParamsConfig) r12     // Catch: java.lang.Throwable -> Lb2
            boolean r12 = r12.getDebounceSessionLocalStorage()     // Catch: java.lang.Throwable -> Lb2
            if (r12 == 0) goto L95
            kotlinx.coroutines.internal.ContextScope r12 = r11.MediaSessionCompatQueueItem     // Catch: java.lang.Throwable -> Lb2
            androidx.lifecycle.BlockRunner$cancel$1 r0 = new androidx.lifecycle.BlockRunner$cancel$1     // Catch: java.lang.Throwable -> Lb2
            r1 = 22
            r0.<init>(r11, r9, r1)     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r12, r9, r9, r0, r8)     // Catch: java.lang.Throwable -> Lb2
            goto Lac
        L95:
            java.lang.Object r12 = r4.B_()     // Catch: java.lang.Throwable -> Lb2
            java.util.Calendar r12 = (java.util.Calendar) r12     // Catch: java.lang.Throwable -> Lb2
            long r9 = r12.getTimeInMillis()     // Catch: java.lang.Throwable -> Lb2
            r0.read = r6     // Catch: java.lang.Throwable -> Lb2
            r0.write = r2     // Catch: java.lang.Throwable -> Lb2
            r0.RemoteActionCompatParcelizer = r8     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r12 = r3.RemoteActionCompatParcelizer(r9, r5, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            android.os.Trace.endSection()
            o.createFromParcel r12 = o.createFromParcel.INSTANCE
            return r12
        Lb2:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl.refreshSessionTimeStamp(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaBrowserCompatMediaItem = 1;
        private static int RemoteActionCompatParcelizer;
        public /* synthetic */ long IconCompatParcelizer;
        public int read;
        public final /* synthetic */ Object serializer;
        public final /* synthetic */ int write = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PermissionsLifecycleObserver permissionsLifecycleObserver, long j, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.serializer = permissionsLifecycleObserver;
            this.IconCompatParcelizer = j;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.serializer = perseusUserLocalDataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 101;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.write;
            Object obj3 = this.serializer;
            if (i3 == 0) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2((PerseusUserLocalDataStoreImpl) obj3, shortNewsContentCardView);
                anonymousClass2.IconCompatParcelizer = ((Number) obj).longValue();
                return anonymousClass2;
            }
            AnonymousClass2 anonymousClass3 = new AnonymousClass2((PermissionsLifecycleObserver) obj3, this.IconCompatParcelizer, shortNewsContentCardView);
            int i4 = RemoteActionCompatParcelizer + 17;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
            return anonymousClass3;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 49;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i4 != 0) {
                return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass2) create(Long.valueOf(((Number) obj).longValue()), (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = RemoteActionCompatParcelizer + 55;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = MediaBrowserCompatMediaItem + 125;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = this.serializer;
            if (i4 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.read;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                long j = this.IconCompatParcelizer;
                this.read = 1;
                if (PermissionsLifecycleObserver.access$refreshStatusContinuously((PermissionsLifecycleObserver) obj2, j, this) != coroutineSingletons) {
                    return createfromparcel;
                }
                int i6 = RemoteActionCompatParcelizer + 11;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
            long j2 = this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.read;
            if (i8 != 0) {
                if (i8 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            generateImageVectorIdui generateimagevectoridui = ((PerseusUserLocalDataStoreImpl) obj2).read;
            this.IconCompatParcelizer = j2;
            this.read = 1;
            if (generateimagevectoridui.RemoteActionCompatParcelizer(j2, "session_offset", this) != coroutineSingletons2) {
                return createfromparcel;
            }
            int i9 = MediaBrowserCompatMediaItem + 105;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return coroutineSingletons2;
            }
            throw null;
        }
    }
}
