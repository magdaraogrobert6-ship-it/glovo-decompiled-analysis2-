package coil3;

import androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShaderKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessgetLayerBlockp;
import o.accessquadraticTojd;
import o.accessrewindjd;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.notifyContentCaptureChanges;
import o.notifyViewEntered;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.sendContentCaptureAppearEvents;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class RealImageLoader$execute$result$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public Object read;
    public /* synthetic */ Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(ShaderKt shaderKt, RealImageLoader realImageLoader, accessgetLayerBlockp accessgetlayerblockp, accessquadraticTojd accessquadratictojd, accessrewindjd accessrewindjdVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = shaderKt;
        this.MediaSessionCompatQueueItem = realImageLoader;
        this.read = accessgetlayerblockp;
        this.serializer = accessquadratictojd;
        this.IconCompatParcelizer = accessrewindjdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            return new RealImageLoader$execute$result$1((ShaderKt) this.write, (RealImageLoader) this.MediaSessionCompatQueueItem, (accessgetLayerBlockp) this.read, (accessquadraticTojd) this.serializer, (accessrewindjd) obj2, shortNewsContentCardView);
        }
        if (i == 1) {
            RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1((sendContentCaptureAppearEvents) this.read, (Recomposer$runRecomposeAndApplyChanges$2) this.serializer, (notifyViewEntered) obj2, shortNewsContentCardView);
            realImageLoader$execute$result$1.MediaSessionCompatQueueItem = obj;
            return realImageLoader$execute$result$1;
        }
        if (i != 2) {
            RealImageLoader$execute$result$1 realImageLoader$execute$result$2 = new RealImageLoader$execute$result$1((supportsColorMatrixQuery) this.MediaSessionCompatQueueItem, (toColorLong8_81llA) this.read, (TextAnnouncementContentCardView) this.serializer, (Flow) obj2, shortNewsContentCardView);
            realImageLoader$execute$result$2.write = obj;
            return realImageLoader$execute$result$2;
        }
        RealImageLoader$execute$result$1 realImageLoader$execute$result$3 = new RealImageLoader$execute$result$1((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView);
        realImageLoader$execute$result$3.serializer = obj;
        return realImageLoader$execute$result$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            return ((RealImageLoader$execute$result$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i != 1) {
            return i != 2 ? ((RealImageLoader$execute$result$1) create((notifyContentCaptureChanges) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((RealImageLoader$execute$result$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        return ((RealImageLoader$execute$result$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[Catch: all -> 0x008d, PHI: r3 r7 r8 r9
  0x00d4: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v15 java.lang.Object) binds: [B:39:0x00d1, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r7v18 ??) = (r7v27 ??), (r7v28 ??) binds: [B:39:0x00d1, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r8v16 ??) = (r8v22 ??), (r8v23 ??) binds: [B:39:0x00d1, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r9v25 kotlinx.coroutines.flow.FlowCollector) = (r9v24 kotlinx.coroutines.flow.FlowCollector), (r9v31 kotlinx.coroutines.flow.FlowCollector) binds: [B:39:0x00d1, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE], TryCatch #7 {all -> 0x008d, blocks: (B:26:0x0077, B:41:0x00d4, B:38:0x00c3, B:43:0x00fe, B:29:0x0089), top: B:189:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #7 {all -> 0x008d, blocks: (B:26:0x0077, B:41:0x00d4, B:38:0x00c3, B:43:0x00fe, B:29:0x0089), top: B:189:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [o.boundsUpdatesEventLoopui] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [o.logUnregisterActivitylambda1] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, o.logUnregisterActivitylambda1] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22, types: [o.logUnregisterActivitylambda1] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r8v13, types: [coil3.memory.MemoryCacheService] */
    /* JADX WARN: Type inference failed for: r8v14, types: [coil3.memory.MemoryCacheService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [coil3.memory.MemoryCacheService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [coil3.memory.MemoryCacheService] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00fc -> B:38:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader$execute$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(supportsColorMatrixQuery supportscolormatrixquery, toColorLong8_81llA tocolorlong8_81lla, TextAnnouncementContentCardView textAnnouncementContentCardView, Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = supportscolormatrixquery;
        this.read = tocolorlong8_81lla;
        this.serializer = textAnnouncementContentCardView;
        this.IconCompatParcelizer = flow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(sendContentCaptureAppearEvents sendcontentcaptureappearevents, Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2, notifyViewEntered notifyviewentered, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = sendcontentcaptureappearevents;
        this.serializer = recomposer$runRecomposeAndApplyChanges$2;
        this.IconCompatParcelizer = notifyviewentered;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
