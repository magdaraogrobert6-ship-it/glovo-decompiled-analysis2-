package androidx.compose.material3;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$5$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ SheetState IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetKt$ModalBottomSheet$5$1(SheetState sheetState, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        SheetState sheetState = this.IconCompatParcelizer;
        int i4 = 19;
        int i5 = 11;
        int i6 = 0;
        switch (i3) {
            case 0:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, i6);
            case 1:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 1);
            case 2:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, i);
            case 3:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 3);
            case 4:
                ModalBottomSheetKt$ModalBottomSheet$5$1 modalBottomSheetKt$ModalBottomSheet$5$1 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 4);
                int i7 = write + 11;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 43 / 0;
                }
                return modalBottomSheetKt$ModalBottomSheet$5$1;
            case 5:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 5);
            case 6:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 6);
            case 7:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 7);
            case 8:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 8);
            case 9:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 9);
            case 10:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 10);
            case 11:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, i5);
            case 12:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 12);
            case 13:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 13);
            case 14:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 14);
            case 15:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 15);
            case 16:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 16);
            case 17:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 17);
            case 18:
                ModalBottomSheetKt$ModalBottomSheet$5$1 modalBottomSheetKt$ModalBottomSheet$5$2 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 18);
                int i9 = serializer + 19;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return modalBottomSheetKt$ModalBottomSheet$5$2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 19:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, i4);
            default:
                return new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, shortNewsContentCardView, 20);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i4) {
            case 0:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 2:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 3:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 7:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 8:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 9:
                Object objInvokeSuspend = ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i5 = write + 67;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            case 10:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 11:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 12:
                Object objInvokeSuspend2 = ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i7 = serializer + 59;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objInvokeSuspend2;
            case 13:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 14:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 15:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 16:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 17:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 18:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 19:
                return ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                Object objInvokeSuspend3 = ((ModalBottomSheetKt$ModalBottomSheet$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i9 = serializer + 3;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return objInvokeSuspend3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        SheetState sheetState = this.IconCompatParcelizer;
        Object obj3 = null;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.read;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                if (sheetState.show(this) != coroutineSingletons) {
                    return obj2;
                }
                int i4 = serializer + 39;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 26 / 0;
                }
                return coroutineSingletons;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.read;
                if (i6 != 0) {
                    if (i6 == 1 || i6 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (sheetState.RatingCompat) {
                    this.read = 2;
                    if (sheetState.partialExpand(this) != coroutineSingletons2) {
                        return obj2;
                    }
                } else {
                    this.read = 1;
                    if (sheetState.hide(this) != coroutineSingletons2) {
                        return obj2;
                    }
                }
                return coroutineSingletons2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.read;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.expand(this) == coroutineSingletons3 ? coroutineSingletons3 : obj2;
                }
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.read;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                if (sheetState.show(this) != coroutineSingletons4) {
                    return obj2;
                }
                int i9 = write + 91;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons4;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.read;
                if (i11 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.expand(this) == coroutineSingletons5 ? coroutineSingletons5 : obj2;
                }
                int i12 = serializer + 125;
                int i13 = i12 % Fields.SpotShadowColor;
                write = i13;
                int i14 = i12 % 2;
                if (i11 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i15 = i13 + 83;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.read;
                if (i17 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.partialExpand(this) == coroutineSingletons6 ? coroutineSingletons6 : obj2;
                }
                if (i17 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.read;
                if (i18 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.hide(this) == coroutineSingletons7 ? coroutineSingletons7 : obj2;
                }
                int i19 = serializer + 9;
                write = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0 ? i18 != 1 : i18 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.read;
                if (i20 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.partialExpand(this) == coroutineSingletons8 ? coroutineSingletons8 : obj2;
                }
                if (i20 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.read;
                if (i21 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    if (sheetState.hide(this) == coroutineSingletons9) {
                        obj2 = coroutineSingletons9;
                    }
                } else if (i21 == 1) {
                    int i22 = write + 117;
                    serializer = i22 % Fields.SpotShadowColor;
                    if (i22 % 2 != 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        int i23 = 51 / 0;
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                }
                int i24 = write + 97;
                serializer = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    return obj2;
                }
                obj3.hashCode();
                throw null;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.read;
                if (i25 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.hide(this) == coroutineSingletons10 ? coroutineSingletons10 : obj2;
                }
                if (i25 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.read;
                if (i26 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.expand(this) == coroutineSingletons11 ? coroutineSingletons11 : obj2;
                }
                if (i26 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.read;
                if (i27 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.show(this) == coroutineSingletons12 ? coroutineSingletons12 : obj2;
                }
                if (i27 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.read;
                if (i28 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.expand(this) == coroutineSingletons13 ? coroutineSingletons13 : obj2;
                }
                if (i28 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.read;
                if (i29 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.partialExpand(this) == coroutineSingletons14 ? coroutineSingletons14 : obj2;
                }
                if (i29 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.read;
                if (i30 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.hide(this) == coroutineSingletons15 ? coroutineSingletons15 : obj2;
                }
                if (i30 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.read;
                if (i31 != 0) {
                    if (i31 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                if (sheetState.hide(this) != coroutineSingletons16) {
                    return obj2;
                }
                int i32 = serializer + 7;
                write = i32 % Fields.SpotShadowColor;
                int i33 = i32 % 2;
                return coroutineSingletons16;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.read;
                if (i34 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.hide(this) == coroutineSingletons17 ? coroutineSingletons17 : obj2;
                }
                if (i34 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.read;
                if (i35 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.show(this) == coroutineSingletons18 ? coroutineSingletons18 : obj2;
                }
                if (i35 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.read;
                if (i36 != 0) {
                    if (i36 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                if (sheetState.hide(this) != coroutineSingletons19) {
                    return obj2;
                }
                int i37 = write + 53;
                serializer = i37 % Fields.SpotShadowColor;
                int i38 = i37 % 2;
                return coroutineSingletons19;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.read;
                if (i39 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.hide(this) == coroutineSingletons20 ? coroutineSingletons20 : obj2;
                }
                if (i39 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.read;
                if (i40 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return sheetState.hide(this) == coroutineSingletons21 ? coroutineSingletons21 : obj2;
                }
                if (i40 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i41 = serializer + 21;
                write = i41 % Fields.SpotShadowColor;
                int i42 = i41 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
        }
    }
}
