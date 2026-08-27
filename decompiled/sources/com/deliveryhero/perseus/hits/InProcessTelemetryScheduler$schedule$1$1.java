package com.deliveryhero.perseus.hits;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.consumeFlingInStretch;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getStrokeLineJoinLxFBmk8;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class InProcessTelemetryScheduler$schedule$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public long read;
    public final /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InProcessTelemetryScheduler$schedule$1$1(long j, consumeFlingInStretch consumeflinginstretch, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = j;
        this.serializer = consumeflinginstretch;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InProcessTelemetryScheduler$schedule$1$1(getStrokeLineJoinLxFBmk8 getstrokelinejoinlxfbmk8, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = getstrokelinejoinlxfbmk8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 61;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        if (i4 != 0) {
            InProcessTelemetryScheduler$schedule$1$1 inProcessTelemetryScheduler$schedule$1$1 = new InProcessTelemetryScheduler$schedule$1$1(this.read, (consumeFlingInStretch) obj2, shortNewsContentCardView);
            inProcessTelemetryScheduler$schedule$1$1.RemoteActionCompatParcelizer = obj;
            return inProcessTelemetryScheduler$schedule$1$1;
        }
        InProcessTelemetryScheduler$schedule$1$1 inProcessTelemetryScheduler$schedule$1$2 = new InProcessTelemetryScheduler$schedule$1$1((getStrokeLineJoinLxFBmk8) obj2, shortNewsContentCardView);
        inProcessTelemetryScheduler$schedule$1$2.RemoteActionCompatParcelizer = obj;
        int i5 = MediaMetadataCompat + 115;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return inProcessTelemetryScheduler$schedule$1$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 59;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((InProcessTelemetryScheduler$schedule$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((InProcessTelemetryScheduler$schedule$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaSessionCompatQueueItem + 55;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117 A[PHI: r4
  0x0117: PHI (r4v2 long) = (r4v3 long), (r4v6 long) binds: [B:41:0x0114, B:32:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        if (r13 == r7) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0123 -> B:46:0x0127). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.hits.InProcessTelemetryScheduler$schedule$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
