package androidx.room;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ClipOpCompanion;
import o.ShortNewsContentCardView;
import o.accessdrawArcRadjd;
import o.createFromParcel;
import o.getIntersectrtfAjoo;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ accessdrawArcRadjd[] IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ TriggerBasedInvalidationTracker MediaDescriptionCompat;
    public TriggerBasedInvalidationTracker MediaMetadataCompat;
    public ClipOpCompanion MediaSessionCompatQueueItem;
    public accessdrawArcRadjd[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ ClipOpCompanion serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(accessdrawArcRadjd[] accessdrawarcradjdArr, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ClipOpCompanion clipOpCompanion, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = accessdrawarcradjdArr;
        this.MediaDescriptionCompat = triggerBasedInvalidationTracker;
        this.serializer = clipOpCompanion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.IconCompatParcelizer, this.MediaDescriptionCompat, this.serializer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create((getIntersectrtfAjoo) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007b -> B:28:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.MediaBrowserCompatMediaItem
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r14)
            return r2
        L14:
            int r1 = r13.RemoteActionCompatParcelizer
            int r5 = r13.read
            int r6 = r13.write
            o.ClipOpCompanion r7 = r13.MediaSessionCompatQueueItem
            androidx.room.TriggerBasedInvalidationTracker r8 = r13.MediaMetadataCompat
            o.accessdrawArcRadjd[] r9 = r13.RatingCompat
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            goto L77
        L24:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            o.accessdrawArcRadjd[] r14 = r13.IconCompatParcelizer
            int r1 = r14.length
            androidx.room.TriggerBasedInvalidationTracker r5 = r13.MediaDescriptionCompat
            o.ClipOpCompanion r6 = r13.serializer
            r7 = 0
            r9 = r14
            r8 = r5
            r5 = r7
        L32:
            if (r5 >= r1) goto L7e
            r14 = r9[r5]
            int r10 = r7 + 1
            int[] r11 = o.accessgetRedcp.RemoteActionCompatParcelizer
            int r14 = r14.ordinal()
            r14 = r11[r14]
            if (r14 == r4) goto L7b
            if (r14 == r3) goto L60
            r11 = 3
            if (r14 != r11) goto L5c
            r13.RatingCompat = r9
            r13.MediaMetadataCompat = r8
            r13.MediaSessionCompatQueueItem = r6
            r13.write = r10
            r13.read = r5
            r13.RemoteActionCompatParcelizer = r1
            r13.MediaBrowserCompatMediaItem = r3
            java.lang.Object r14 = androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(r8, r6, r7, r13)
            if (r14 != r0) goto L75
            goto L74
        L5c:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            return r2
        L60:
            r13.RatingCompat = r9
            r13.MediaMetadataCompat = r8
            r13.MediaSessionCompatQueueItem = r6
            r13.write = r10
            r13.read = r5
            r13.RemoteActionCompatParcelizer = r1
            r13.MediaBrowserCompatMediaItem = r4
            java.lang.Object r14 = androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(r8, r6, r7, r13)
            if (r14 != r0) goto L75
        L74:
            return r0
        L75:
            r7 = r6
            r6 = r10
        L77:
            r12 = r7
            r7 = r6
            r6 = r12
            goto L7c
        L7b:
            r7 = r10
        L7c:
            int r5 = r5 + r4
            goto L32
        L7e:
            o.createFromParcel r14 = o.createFromParcel.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
