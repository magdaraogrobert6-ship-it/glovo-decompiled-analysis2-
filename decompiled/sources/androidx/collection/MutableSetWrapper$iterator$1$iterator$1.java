package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.ContentInViewNodelaunchAnimation21;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.verifyOrientationStatuslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public long[] MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public verifyOrientationStatuslambda0 MediaMetadataCompat;
    public ContentInViewNodelaunchAnimation21 MediaSessionCompatQueueItem;
    public final /* synthetic */ verifyOrientationStatuslambda0 PlaybackStateCompat;
    public final /* synthetic */ ContentInViewNodelaunchAnimation21 PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(ContentInViewNodelaunchAnimation21 contentInViewNodelaunchAnimation21, verifyOrientationStatuslambda0 verifyorientationstatuslambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.PlaybackStateCompatCustomAction = contentInViewNodelaunchAnimation21;
        this.PlaybackStateCompat = verifyorientationstatuslambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.PlaybackStateCompatCustomAction, this.PlaybackStateCompat, shortNewsContentCardView);
        mutableSetWrapper$iterator$1$iterator$1.MediaDescriptionCompat = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.RatingCompat
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L26
            int r2 = r0.IconCompatParcelizer
            int r6 = r0.read
            long r7 = r0.RemoteActionCompatParcelizer
            int r9 = r0.write
            int r10 = r0.serializer
            long[] r11 = r0.MediaBrowserCompatMediaItem
            o.ContentInViewNodelaunchAnimation21 r12 = r0.MediaSessionCompatQueueItem
            o.verifyOrientationStatuslambda0 r13 = r0.MediaMetadataCompat
            java.lang.Object r14 = r0.MediaDescriptionCompat
            kotlin.sequences.SequenceBuilderIterator r14 = (kotlin.sequences.SequenceBuilderIterator) r14
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r22)
            goto L96
        L26:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r1)
            r1 = 0
            return r1
        L2d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r22)
            java.lang.Object r2 = r0.MediaDescriptionCompat
            kotlin.sequences.SequenceBuilderIterator r2 = (kotlin.sequences.SequenceBuilderIterator) r2
            o.ContentInViewNodelaunchAnimation21 r6 = r0.PlaybackStateCompatCustomAction
            o.relocationOffsetfbGrOKE r7 = r6.serializer
            long[] r7 = r7.IconCompatParcelizer
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            o.verifyOrientationStatuslambda0 r9 = r0.PlaybackStateCompat
            r10 = 0
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.serializer = r15
            o.relocationOffsetfbGrOKE r3 = r12.serializer
            java.lang.Object[] r3 = r3.RemoteActionCompatParcelizer
            r3 = r3[r15]
            r0.MediaDescriptionCompat = r14
            r0.MediaMetadataCompat = r13
            r0.MediaSessionCompatQueueItem = r12
            r0.MediaBrowserCompatMediaItem = r11
            r0.serializer = r10
            r0.write = r9
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r6
            r0.IconCompatParcelizer = r2
            r0.RatingCompat = r5
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = r14.yield(r3, r0)
            if (r3 != r1) goto L96
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L42
        La6:
            o.createFromParcel r1 = o.createFromParcel.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
