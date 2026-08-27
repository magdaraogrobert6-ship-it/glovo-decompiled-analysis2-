package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.navigation.CodeScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.QrScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.InAppCameraWithTagsArgs;
import com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AnimationSearchSearch;
import o.C0158device;
import o.IntOffsetCompanion;
import o.ShortNewsContentCardView;
import o.accessgetInfinitycp;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.checkArithmeticNB67dxo;
import o.createFromParcel;
import o.extractFromIndyLambdaFields;
import o.getAnimationClocksui_tooling;
import o.getContentViewGroupParentLayout;
import o.getEnterjXw82LU;
import o.getMaxDuration;
import o.getNoopState;
import o.getTopD9Ej5fMannotations;
import o.getWEAR_OS_SMALL_ROUNDannotations;
import o.instance_delegatelambda0;
import o.lerp81ZRxRo;
import o.makeTreedefault;
import o.notifySubscribe;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toIntRectozmzZPI;
import o.unaryMinusXSAIIZE;
import o.wrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class QrCodeScanTaskUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QrCodeScanTaskUiModelImpl$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QrCodeScanTaskUiModelImpl$1(CustomerUnavailableViewModel customerUnavailableViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = customerUnavailableViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$tasks$takepicture$presentation$picture_with_tag$InAppCameraWithTagsViewModel$getCameraOverlayV2Data$1(Object obj) {
        Object objM4940invokeyxL6bBk;
        ?? arrayList;
        int i = 2 % 2;
        unaryMinusXSAIIZE unaryminusxsaiize = (unaryMinusXSAIIZE) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            int i3 = serializer + 37;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4940invokeyxL6bBk = ((onItemDismiss) obj).IconCompatParcelizer;
            int i5 = MediaMetadataCompat + 11;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 / 4;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetTaskByTypeAndIdUseCaseImpl getTaskByTypeAndIdUseCaseImpl = unaryminusxsaiize.IconCompatParcelizer;
            InAppCameraWithTagsArgs inAppCameraWithTagsArgs = (InAppCameraWithTagsArgs) this.write;
            long j = inAppCameraWithTagsArgs.RemoteActionCompatParcelizer;
            String str = inAppCameraWithTagsArgs.write;
            String str2 = inAppCameraWithTagsArgs.read;
            this.RemoteActionCompatParcelizer = 1;
            objM4940invokeyxL6bBk = getTaskByTypeAndIdUseCaseImpl.m4940invokeyxL6bBk(j, str, str2, accessgetLOREM_IPSUM_SOURCEp.class, this);
            if (objM4940invokeyxL6bBk == coroutineSingletons) {
                int i7 = serializer + 29;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        }
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        Throwable thSerializer = onItemDismiss.serializer(objM4940invokeyxL6bBk);
        if (thSerializer == null) {
            accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) objM4940invokeyxL6bBk;
            List list = accessgetlorem_ipsum_sourcep.overlayItems;
            ?? arrayList2 = instance_delegatelambda0.write;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(!(obj2 instanceof getWEAR_OS_SMALL_ROUNDannotations))) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            List list2 = accessgetlorem_ipsum_sourcep.overlayItems;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    int i9 = serializer + 81;
                    MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (obj3 instanceof C0158device) {
                        arrayList2.add(obj3);
                    }
                }
            }
            unaryminusxsaiize.serializer.IconCompatParcelizer(new toIntRectozmzZPI(arrayList, arrayList2));
        } else {
            forest.write(thSerializer);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r2 r5 r6
  0x002c: PHI (r2v31 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r5v119 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r6v40 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[PHI: r2 r5 r6
  0x0037: PHI (r2v30 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v115 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r6v39 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r2 r5 r6
  0x0042: PHI (r2v29 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r5v111 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r6v38 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004d A[PHI: r2 r5 r6
  0x004d: PHI (r2v28 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r5v107 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r6v37 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[PHI: r2 r5 r6
  0x0058: PHI (r2v27 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r5v103 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r6v36 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[PHI: r2 r5 r6
  0x0063: PHI (r2v26 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r5v99 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r6v35 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e A[PHI: r2 r5 r6
  0x006e: PHI (r2v25 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006e: PHI (r5v95 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006e: PHI (r6v31 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[PHI: r2 r5 r6
  0x0082: PHI (r2v24 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r5v91 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0082: PHI (r6v30 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[PHI: r2 r5 r6
  0x008d: PHI (r2v23 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r5v87 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r6v29 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0098 A[PHI: r2 r5 r6
  0x0098: PHI (r2v22 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r5v82 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r6v25 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[PHI: r2 r5 r6
  0x00b3: PHI (r2v21 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r5v78 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r6v24 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[PHI: r2 r5 r6
  0x00be: PHI (r2v20 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00be: PHI (r5v74 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00be: PHI (r6v23 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[PHI: r2 r5 r6
  0x00c9: PHI (r2v19 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r5v70 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r6v22 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[PHI: r2 r5 r6
  0x00d4: PHI (r2v18 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r5v66 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r6v21 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00df A[PHI: r2 r5 r6
  0x00df: PHI (r2v17 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r5v62 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r6v20 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea A[PHI: r2 r5 r6
  0x00ea: PHI (r2v16 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r5v58 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00ea: PHI (r6v19 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5 A[PHI: r2 r5 r6
  0x00f5: PHI (r2v15 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r5v54 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r6v18 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0100 A[PHI: r2 r5 r6
  0x0100: PHI (r2v14 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r5v50 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r6v17 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[PHI: r2 r5 r6
  0x010b: PHI (r2v13 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r5v46 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r6v16 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0116 A[PHI: r2 r5 r6
  0x0116: PHI (r2v12 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0116: PHI (r5v42 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0116: PHI (r6v15 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0121 A[PHI: r2 r5 r6
  0x0121: PHI (r2v11 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r5v38 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r6v14 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x012c A[PHI: r2 r5 r6
  0x012c: PHI (r2v10 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r5v34 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r6v13 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0137 A[PHI: r2 r5 r6
  0x0137: PHI (r2v9 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r5v30 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r6v12 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0142 A[PHI: r2 r5 r6
  0x0142: PHI (r2v8 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r5v26 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r6v11 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x014d A[PHI: r2 r5 r6
  0x014d: PHI (r2v7 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r5v22 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r6v10 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0158 A[PHI: r2 r5 r6
  0x0158: PHI (r2v6 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r5v18 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r6v6 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x016c A[PHI: r2 r5 r6
  0x016c: PHI (r2v5 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r5v14 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r6v5 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0177 A[PHI: r2 r5 r6
  0x0177: PHI (r2v4 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0177: PHI (r5v10 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0177: PHI (r6v4 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[PHI: r2 r5 r6
  0x0182: PHI (r2v3 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0182: PHI (r5v6 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0182: PHI (r6v3 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x018d A[PHI: r2 r5 r6
  0x018d: PHI (r2v2 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v32 o.createFromParcel) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r5v2 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v123 o.getContentViewGroupParentLayout) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r6v2 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v41 o.ShortNewsContentCardView) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        createFromParcel createfromparcel;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        ShortNewsContentCardView shortNewsContentCardView;
        Object objInvokeSuspend;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 63;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = this.read;
            createfromparcel = createFromParcel.INSTANCE;
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            switch (i4) {
                case 0:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 1:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 2:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 3:
                    Object objInvokeSuspend2 = ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    int i5 = MediaMetadataCompat + 1;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return objInvokeSuspend2;
                case 4:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 5:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 6:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 7:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 8:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 9:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 10:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 11:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 12:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 13:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 14:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 15:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 16:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 17:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 18:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 19:
                    objInvokeSuspend = ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    i = serializer + 83;
                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 20:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 21:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 22:
                    Object objInvokeSuspend3 = ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    int i7 = serializer + 7;
                    MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return objInvokeSuspend3;
                case 23:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 24:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 25:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 26:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 27:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 28:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                default:
                    return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
        }
        int i9 = this.read;
        createfromparcel = createFromParcel.INSTANCE;
        getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        int i10 = 41 / 0;
        switch (i9) {
            case 0:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                Object objInvokeSuspend4 = ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i11 = MediaMetadataCompat + 1;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return objInvokeSuspend4;
            case 4:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 7:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 8:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 9:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 10:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 11:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 12:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 13:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 14:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 15:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 16:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 17:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 18:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 19:
                objInvokeSuspend = ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                i = serializer + 83;
                MediaMetadataCompat = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            case 20:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 21:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 22:
                Object objInvokeSuspend5 = ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i13 = serializer + 7;
                MediaMetadataCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return objInvokeSuspend5;
            case 23:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 24:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 25:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 26:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 27:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 28:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                return ((QrCodeScanTaskUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024 A[PHI: r2
  0x0024: PHI (r2v59 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[PHI: r2
  0x0040: PHI (r2v57 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004e A[PHI: r2
  0x004e: PHI (r2v55 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[PHI: r2
  0x005c: PHI (r2v53 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a A[PHI: r2
  0x006a: PHI (r2v51 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[PHI: r2
  0x0078: PHI (r2v49 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0086 A[PHI: r2
  0x0086: PHI (r2v47 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[PHI: r2
  0x0094: PHI (r2v45 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[PHI: r2
  0x00a2: PHI (r2v43 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[PHI: r2
  0x00b0: PHI (r2v41 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00be A[PHI: r2
  0x00be: PHI (r2v39 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[PHI: r2
  0x00cc: PHI (r2v37 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00da A[PHI: r2
  0x00da: PHI (r2v35 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8 A[PHI: r2
  0x00e8: PHI (r2v33 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6 A[PHI: r2
  0x00f6: PHI (r2v31 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[PHI: r2
  0x0100: PHI (r2v29 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x010e A[PHI: r2
  0x010e: PHI (r2v27 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0118 A[PHI: r2
  0x0118: PHI (r2v25 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x012f A[PHI: r2
  0x012f: PHI (r2v23 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d A[PHI: r2
  0x013d: PHI (r2v21 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x014b A[PHI: r2
  0x014b: PHI (r2v19 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0159 A[PHI: r2
  0x0159: PHI (r2v17 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0166 A[PHI: r2
  0x0166: PHI (r2v15 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0173 A[PHI: r2
  0x0173: PHI (r2v13 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0180 A[PHI: r2
  0x0180: PHI (r2v11 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x018d A[PHI: r2
  0x018d: PHI (r2v9 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x019a A[PHI: r2
  0x019a: PHI (r2v7 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6 A[PHI: r2
  0x01a6: PHI (r2v5 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3 A[PHI: r2
  0x01b3: PHI (r2v3 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf A[PHI: r2
  0x01bf: PHI (r2v1 java.lang.Object) = (r2v0 java.lang.Object), (r2v61 java.lang.Object) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = serializer + 65;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = 0;
        if (i4 % 2 != 0) {
            int i6 = this.read;
            obj2 = this.write;
            switch (i6) {
                case 0:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (IntOffsetCompanion) obj2, shortNewsContentCardView, i5);
                case 1:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (CardCashPaymentTaskUiModelImpl) obj2, shortNewsContentCardView, 1);
                case 2:
                    return new QrCodeScanTaskUiModelImpl$1((CardCashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (getEnterjXw82LU) obj2, shortNewsContentCardView, i2);
                case 3:
                    return new QrCodeScanTaskUiModelImpl$1((CardCashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 3);
                case 4:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (CashPaymentTaskUiModelImpl) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new QrCodeScanTaskUiModelImpl$1((CashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new QrCodeScanTaskUiModelImpl$1((CashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (CashPaymentTaskUiItem.ReasonItem) obj2, shortNewsContentCardView, 6);
                case 7:
                    return new QrCodeScanTaskUiModelImpl$1((AnimationSearchSearch) this.IconCompatParcelizer, (NestFragment$onCreateView$1$1$1$1) obj2, shortNewsContentCardView, 7);
                case 8:
                    return new QrCodeScanTaskUiModelImpl$1((getAnimationClocksui_tooling) this.IconCompatParcelizer, (MainActivity) obj2, shortNewsContentCardView, 8);
                case 9:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (CustomerUnavailableTaskUiModelImpl) obj2, shortNewsContentCardView, 9);
                case 10:
                    return new QrCodeScanTaskUiModelImpl$1((makeTreedefault) this.IconCompatParcelizer, (CustomerUnavailableTaskUiModelImpl) obj2, shortNewsContentCardView, 10);
                case 11:
                    QrCodeScanTaskUiModelImpl$1 qrCodeScanTaskUiModelImpl$1 = new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (notifySubscribe) obj2, shortNewsContentCardView, 11);
                    int i7 = MediaMetadataCompat + 75;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return qrCodeScanTaskUiModelImpl$1;
                case 12:
                    return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModel) obj2, shortNewsContentCardView, 12);
                case 13:
                    return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModel) this.IconCompatParcelizer, (getMaxDuration) obj2, shortNewsContentCardView, 13);
                case 14:
                    return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModel) obj2, shortNewsContentCardView, 14);
                case 15:
                    return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModelV2) this.IconCompatParcelizer, (getNoopState) obj2, shortNewsContentCardView, 15);
                case 16:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (DatePickerTaskUiModelImpl) obj2, shortNewsContentCardView, 16);
                case 17:
                    return new QrCodeScanTaskUiModelImpl$1((DatePickerTaskUiModelImpl) this.IconCompatParcelizer, (extractFromIndyLambdaFields) obj2, shortNewsContentCardView, 17);
                case 18:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (accessgetInfinitycp) obj2, shortNewsContentCardView, 18);
                case 19:
                    return new QrCodeScanTaskUiModelImpl$1((CodeScanViewModel) this.IconCompatParcelizer, (CodeScanTaskArgs) obj2, shortNewsContentCardView, 19);
                case 20:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (PinValidationTaskUiModelImpl) obj2, shortNewsContentCardView, 20);
                case 21:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (getTopD9Ej5fMannotations) obj2, shortNewsContentCardView, 21);
                case 22:
                    return new QrCodeScanTaskUiModelImpl$1((PinScreenViewModel) this.IconCompatParcelizer, (PinScreenArgs) obj2, shortNewsContentCardView, 22);
                case 23:
                    return new QrCodeScanTaskUiModelImpl$1((lerp81ZRxRo) this.IconCompatParcelizer, (QrScanTaskArgs) obj2, shortNewsContentCardView, 23);
                case 24:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (SignatureTaskUiModelImpl) obj2, shortNewsContentCardView, 24);
                case 25:
                    return new QrCodeScanTaskUiModelImpl$1((wrapper) this.IconCompatParcelizer, (SignatureTaskUiModelImpl) obj2, shortNewsContentCardView, 25);
                case 26:
                    return new QrCodeScanTaskUiModelImpl$1((SignatureTaskUiModelImpl) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 26);
                case 27:
                    return new QrCodeScanTaskUiModelImpl$1((unaryMinusXSAIIZE) this.IconCompatParcelizer, (InAppCameraWithTagsArgs) obj2, shortNewsContentCardView, 27);
                case 28:
                    QrCodeScanTaskUiModelImpl$1 qrCodeScanTaskUiModelImpl$2 = new QrCodeScanTaskUiModelImpl$1((unaryMinusXSAIIZE) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 28);
                    i = MediaMetadataCompat + 39;
                    serializer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i9 = 97 / 0;
                    }
                    return qrCodeScanTaskUiModelImpl$2;
                default:
                    return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (checkArithmeticNB67dxo) obj2, shortNewsContentCardView, 29);
            }
        }
        int i10 = this.read;
        obj2 = this.write;
        int i11 = 53 / 0;
        switch (i10) {
            case 0:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (IntOffsetCompanion) obj2, shortNewsContentCardView, i5);
            case 1:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (CardCashPaymentTaskUiModelImpl) obj2, shortNewsContentCardView, 1);
            case 2:
                return new QrCodeScanTaskUiModelImpl$1((CardCashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (getEnterjXw82LU) obj2, shortNewsContentCardView, i2);
            case 3:
                return new QrCodeScanTaskUiModelImpl$1((CardCashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 3);
            case 4:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (CashPaymentTaskUiModelImpl) obj2, shortNewsContentCardView, 4);
            case 5:
                return new QrCodeScanTaskUiModelImpl$1((CashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 5);
            case 6:
                return new QrCodeScanTaskUiModelImpl$1((CashPaymentTaskUiModelImpl) this.IconCompatParcelizer, (CashPaymentTaskUiItem.ReasonItem) obj2, shortNewsContentCardView, 6);
            case 7:
                return new QrCodeScanTaskUiModelImpl$1((AnimationSearchSearch) this.IconCompatParcelizer, (NestFragment$onCreateView$1$1$1$1) obj2, shortNewsContentCardView, 7);
            case 8:
                return new QrCodeScanTaskUiModelImpl$1((getAnimationClocksui_tooling) this.IconCompatParcelizer, (MainActivity) obj2, shortNewsContentCardView, 8);
            case 9:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (CustomerUnavailableTaskUiModelImpl) obj2, shortNewsContentCardView, 9);
            case 10:
                return new QrCodeScanTaskUiModelImpl$1((makeTreedefault) this.IconCompatParcelizer, (CustomerUnavailableTaskUiModelImpl) obj2, shortNewsContentCardView, 10);
            case 11:
                QrCodeScanTaskUiModelImpl$1 qrCodeScanTaskUiModelImpl$3 = new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (notifySubscribe) obj2, shortNewsContentCardView, 11);
                int i12 = MediaMetadataCompat + 75;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return qrCodeScanTaskUiModelImpl$3;
            case 12:
                return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModel) obj2, shortNewsContentCardView, 12);
            case 13:
                return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModel) this.IconCompatParcelizer, (getMaxDuration) obj2, shortNewsContentCardView, 13);
            case 14:
                return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModel) obj2, shortNewsContentCardView, 14);
            case 15:
                return new QrCodeScanTaskUiModelImpl$1((CustomerUnavailableViewModelV2) this.IconCompatParcelizer, (getNoopState) obj2, shortNewsContentCardView, 15);
            case 16:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (DatePickerTaskUiModelImpl) obj2, shortNewsContentCardView, 16);
            case 17:
                return new QrCodeScanTaskUiModelImpl$1((DatePickerTaskUiModelImpl) this.IconCompatParcelizer, (extractFromIndyLambdaFields) obj2, shortNewsContentCardView, 17);
            case 18:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (accessgetInfinitycp) obj2, shortNewsContentCardView, 18);
            case 19:
                return new QrCodeScanTaskUiModelImpl$1((CodeScanViewModel) this.IconCompatParcelizer, (CodeScanTaskArgs) obj2, shortNewsContentCardView, 19);
            case 20:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (PinValidationTaskUiModelImpl) obj2, shortNewsContentCardView, 20);
            case 21:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (getTopD9Ej5fMannotations) obj2, shortNewsContentCardView, 21);
            case 22:
                return new QrCodeScanTaskUiModelImpl$1((PinScreenViewModel) this.IconCompatParcelizer, (PinScreenArgs) obj2, shortNewsContentCardView, 22);
            case 23:
                return new QrCodeScanTaskUiModelImpl$1((lerp81ZRxRo) this.IconCompatParcelizer, (QrScanTaskArgs) obj2, shortNewsContentCardView, 23);
            case 24:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (SignatureTaskUiModelImpl) obj2, shortNewsContentCardView, 24);
            case 25:
                return new QrCodeScanTaskUiModelImpl$1((wrapper) this.IconCompatParcelizer, (SignatureTaskUiModelImpl) obj2, shortNewsContentCardView, 25);
            case 26:
                return new QrCodeScanTaskUiModelImpl$1((SignatureTaskUiModelImpl) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 26);
            case 27:
                return new QrCodeScanTaskUiModelImpl$1((unaryMinusXSAIIZE) this.IconCompatParcelizer, (InAppCameraWithTagsArgs) obj2, shortNewsContentCardView, 27);
            case 28:
                QrCodeScanTaskUiModelImpl$1 qrCodeScanTaskUiModelImpl$4 = new QrCodeScanTaskUiModelImpl$1((unaryMinusXSAIIZE) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 28);
                i = MediaMetadataCompat + 39;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i14 = 97 / 0;
                }
                return qrCodeScanTaskUiModelImpl$4;
            default:
                return new QrCodeScanTaskUiModelImpl$1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (checkArithmeticNB67dxo) obj2, shortNewsContentCardView, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x043d A[PHI: r1
  0x043d: PHI (r1v100 java.lang.String) = (r1v98 java.lang.String), (r1v111 java.lang.String) binds: [B:169:0x0438, B:163:0x042b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:195:0x0494  */
    /* JADX WARN: Code duplicated, block: B:198:0x0499  */
    /* JADX WARN: Code duplicated, block: B:202:0x049f  */
    /* JADX WARN: Code duplicated, block: B:205:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:218:0x050e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0514  */
    /* JADX WARN: Code duplicated, block: B:260:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:262:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:264:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:266:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:271:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:273:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:276:0x060a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0617  */
    /* JADX WARN: Code duplicated, block: B:286:0x0621  */
    /* JADX WARN: Code duplicated, block: B:289:0x0626  */
    /* JADX WARN: Code duplicated, block: B:290:0x0629  */
    /* JADX WARN: Code duplicated, block: B:292:0x062c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0650  */
    /* JADX WARN: Code duplicated, block: B:297:0x068a  */
    /* JADX WARN: Code duplicated, block: B:298:0x068d  */
    /* JADX WARN: Code duplicated, block: B:527:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r13v44 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v53 java.lang.Object, still in use, count: 2, list:
          (r3v53 java.lang.Object) from 0x05ac: INSTANCE_OF (r3v53 java.lang.Object) A[WRAPPED] (LINE:1482) o.asTree
          (r3v53 java.lang.Object) from 0x05b2: PHI (r3 I:??) = (r3v31 java.lang.Object), (r3v53 java.lang.Object) binds: [B:256:0x05b1, B:525:0x05b2] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
