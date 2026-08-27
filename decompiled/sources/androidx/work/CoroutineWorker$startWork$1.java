package androidx.work;

import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import androidx.room.TriggerBasedInvalidationTracker;
import com.deliveryhero.performance.core.aqs.AppQualityScore;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.foodora.courier.freshchat.DispatcherChatOrderLogger;
import com.foodora.courier.push.tokenregistery.worker.PushTokenUpdateWorker;
import com.roadrunner.appmigration.presentation.AppMigrationUiModelImpl;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.backToBackOrder.presentation.BackToBackAutoAcceptUiModelImpl;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CompletableDeferredImpl;
import o.BaselineShiftSaverlambda0;
import o.SegmentFinder;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.accessgetStripNonMetricAffectingCharSpansp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getEndOffsetForRectWithinRun;
import o.getHeightPx;
import o.getTextAlignbuA522U;
import o.getTextAligne0LSkKk;
import o.getTouchaOaMEAU;
import o.measurexDpz5zYdefault;
import o.packWithCheck;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.slant;
import o.x8;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineWorker$startWork$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutineWorker$startWork$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        Object obj2 = this.read;
        int i4 = 0;
        switch (i3) {
            case 0:
                return new CoroutineWorker$startWork$1((CoroutineWorker) obj2, shortNewsContentCardView, i4);
            case 1:
                return new CoroutineWorker$startWork$1((InvalidationTracker) obj2, shortNewsContentCardView, 1);
            case 2:
                return new CoroutineWorker$startWork$1((TriggerBasedInvalidationTracker) obj2, shortNewsContentCardView, i);
            case 3:
                return new CoroutineWorker$startWork$1((CompletableDeferredImpl) obj2, shortNewsContentCardView, 3);
            case 4:
                return new CoroutineWorker$startWork$1((AppQualityScore) obj2, shortNewsContentCardView, 4);
            case 5:
                return new CoroutineWorker$startWork$1((ClientIdProviderImpl) obj2, shortNewsContentCardView, 5);
            case 6:
                return new CoroutineWorker$startWork$1((PerseusUserLocalDataStoreImpl) obj2, shortNewsContentCardView, 6);
            case 7:
                return new CoroutineWorker$startWork$1((DispatcherChatOrderLogger) obj2, shortNewsContentCardView, 7);
            case 8:
                return new CoroutineWorker$startWork$1((getTouchaOaMEAU) obj2, shortNewsContentCardView, 8);
            case 9:
                CoroutineWorker$startWork$1 coroutineWorker$startWork$1 = new CoroutineWorker$startWork$1((PushTokenUpdateWorker) obj2, shortNewsContentCardView, 9);
                int i5 = write + 93;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineWorker$startWork$1;
            case 10:
                return new CoroutineWorker$startWork$1((SemanticsInfo) obj2, shortNewsContentCardView, 10);
            case 11:
                return new CoroutineWorker$startWork$1((AppMigrationUiModelImpl) obj2, shortNewsContentCardView, 11);
            case 12:
                return new CoroutineWorker$startWork$1((AppReviewLifecycleObserverImpl) obj2, shortNewsContentCardView, 12);
            case 13:
                CoroutineWorker$startWork$1 coroutineWorker$startWork$2 = new CoroutineWorker$startWork$1((CountryConfigListRepository) obj2, shortNewsContentCardView, 13);
                int i7 = write + 75;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineWorker$startWork$2;
            case 14:
                return new CoroutineWorker$startWork$1((getTextAlignbuA522U) obj2, shortNewsContentCardView, 14);
            case 15:
                return new CoroutineWorker$startWork$1((getTextAligne0LSkKk) obj2, shortNewsContentCardView, 15);
            case 16:
                return new CoroutineWorker$startWork$1((BaselineShiftSaverlambda0) obj2, shortNewsContentCardView, 16);
            case 17:
                CoroutineWorker$startWork$1 coroutineWorker$startWork$3 = new CoroutineWorker$startWork$1((DeliveryAutoAcceptMessageUiModelImpl) obj2, shortNewsContentCardView, 17);
                int i9 = write + 31;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 73 / 0;
                }
                return coroutineWorker$startWork$3;
            case 18:
                return new CoroutineWorker$startWork$1((DeliveryAutoAcceptUiModelImpl) obj2, shortNewsContentCardView, 18);
            case 19:
                return new CoroutineWorker$startWork$1((BackToBackAutoAcceptUiModelImpl) obj2, shortNewsContentCardView, 19);
            case 20:
                return new CoroutineWorker$startWork$1((measurexDpz5zYdefault) obj2, shortNewsContentCardView, 20);
            case 21:
                return new CoroutineWorker$startWork$1((packWithCheck) obj2, shortNewsContentCardView, 21);
            case 22:
                return new CoroutineWorker$startWork$1((accessgetStripNonMetricAffectingCharSpansp) obj2, shortNewsContentCardView, 22);
            case 23:
                return new CoroutineWorker$startWork$1((StaticLayoutFactory28) obj2, shortNewsContentCardView, 23);
            case 24:
                return new CoroutineWorker$startWork$1((getEndOffsetForRectWithinRun) obj2, shortNewsContentCardView, 24);
            case 25:
                return new CoroutineWorker$startWork$1((x8) obj2, shortNewsContentCardView, 25);
            case 26:
                return new CoroutineWorker$startWork$1((SegmentFinder) obj2, shortNewsContentCardView, 26);
            case 27:
                return new CoroutineWorker$startWork$1((getHeightPx) obj2, shortNewsContentCardView, 27);
            case 28:
                return new CoroutineWorker$startWork$1((MetricsBatchProcessor) obj2, shortNewsContentCardView, 28);
            default:
                return new CoroutineWorker$startWork$1((slant) obj2, shortNewsContentCardView, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024 A[PHI: r2
  0x0024: PHI (r2v31 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[PHI: r2
  0x0033: PHI (r2v30 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r2
  0x0042: PHI (r2v29 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[PHI: r2
  0x0051: PHI (r2v28 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r2
  0x0060: PHI (r2v27 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006f A[PHI: r2
  0x006f: PHI (r2v26 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:25:0x008e A[PHI: r2
  0x008e: PHI (r2v25 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x009d A[PHI: r2
  0x009d: PHI (r2v24 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac A[PHI: r2
  0x00ac: PHI (r2v23 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[PHI: r2
  0x00bb: PHI (r2v22 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[PHI: r2
  0x00ca: PHI (r2v21 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9 A[PHI: r2
  0x00d9: PHI (r2v20 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[PHI: r2
  0x00e8: PHI (r2v19 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7 A[PHI: r2
  0x00f7: PHI (r2v18 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106 A[PHI: r2
  0x0106: PHI (r2v17 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115 A[PHI: r2
  0x0115: PHI (r2v16 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0124 A[PHI: r2
  0x0124: PHI (r2v15 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0133 A[PHI: r2
  0x0133: PHI (r2v14 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0142 A[PHI: r2
  0x0142: PHI (r2v13 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0151 A[PHI: r2
  0x0151: PHI (r2v12 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0160 A[PHI: r2
  0x0160: PHI (r2v11 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x016f A[PHI: r2
  0x016f: PHI (r2v10 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x017e A[PHI: r2
  0x017e: PHI (r2v9 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0196 A[PHI: r2
  0x0196: PHI (r2v8 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5 A[PHI: r2
  0x01a5: PHI (r2v7 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4 A[PHI: r2
  0x01b4: PHI (r2v6 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2 A[PHI: r2
  0x01d2: PHI (r2v5 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1 A[PHI: r2
  0x01e1: PHI (r2v4 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01f0 A[PHI: r2
  0x01f0: PHI (r2v3 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff A[PHI: r2
  0x01ff: PHI (r2v2 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        createFromParcel createfromparcel;
        int i;
        Object objInvokeSuspend;
        int i2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 37;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = this.serializer;
            createfromparcel = createFromParcel.INSTANCE;
            switch (i5) {
                case 0:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 1:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 2:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 3:
                    Object objInvokeSuspend2 = ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    i = RemoteActionCompatParcelizer + 35;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i6 = 42 / 0;
                    }
                    return objInvokeSuspend2;
                case 4:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 6:
                    Object objInvokeSuspend3 = ((CoroutineWorker$startWork$1) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i7 = RemoteActionCompatParcelizer + 113;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return objInvokeSuspend3;
                case 7:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 8:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 9:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 10:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 11:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 12:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 13:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 14:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 15:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 16:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 17:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 18:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 19:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 20:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 21:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 22:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 23:
                    objInvokeSuspend = ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    i2 = write + 95;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 24:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 25:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 26:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 27:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 28:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                default:
                    return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
        }
        int i9 = this.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        int i10 = 74 / 0;
        switch (i9) {
            case 0:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                Object objInvokeSuspend4 = ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                i = RemoteActionCompatParcelizer + 35;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i11 = 42 / 0;
                }
                return objInvokeSuspend4;
            case 4:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                Object objInvokeSuspend5 = ((CoroutineWorker$startWork$1) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i12 = RemoteActionCompatParcelizer + 113;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return objInvokeSuspend5;
            case 7:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                objInvokeSuspend = ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                i2 = write + 95;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            case 24:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((CoroutineWorker$startWork$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x055a, code lost:
    
        if (r0 == r2) goto L242;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker$startWork$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
