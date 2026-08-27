package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.LocationRequest;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.SnapFlingBehaviorKt;
import o.createFromParcel;
import o.fling;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$3$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ Animatable IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetKt$ModalBottomSheet$3$1$1(Animatable animatable, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 121;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        switch (this.write) {
            case 0:
                ModalBottomSheetKt$ModalBottomSheet$3$1$1 modalBottomSheetKt$ModalBottomSheet$3$1$1 = new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 0);
                int i5 = read + 59;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return modalBottomSheetKt$ModalBottomSheet$3$1$1;
            case 1:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 1);
            case 2:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, i);
            case 3:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 3);
            case 4:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 4);
            case 5:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 5);
            case 6:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 6);
            case 7:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 7);
            default:
                return new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, shortNewsContentCardView, 8);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                Object objInvokeSuspend = ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = serializer + 105;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 10 / 0;
                }
                return objInvokeSuspend;
            case 3:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 7:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((ModalBottomSheetKt$ModalBottomSheet$3$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Animatable animatable = this.IconCompatParcelizer;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.RemoteActionCompatParcelizer;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Float f = new Float(0.0f);
                    this.RemoteActionCompatParcelizer = 1;
                    return Animatable.IconCompatParcelizer(animatable, f, null, this, 14) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.RemoteActionCompatParcelizer;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Float f2 = new Float(1.0f);
                    requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = new requiredWidthInVpY3zN4default(0, (fling) null, 7);
                    this.RemoteActionCompatParcelizer = 1;
                    if (Animatable.IconCompatParcelizer(animatable, f2, requiredwidthinvpy3zn4default, this, 12) != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                if (i4 != 1) {
                    int i5 = read + 91;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (i4 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Float f3 = new Float(0.5f);
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default2 = new requiredWidthInVpY3zN4default(1000, (fling) null, 4);
                this.RemoteActionCompatParcelizer = 2;
                if (Animatable.IconCompatParcelizer(animatable, f3, requiredwidthinvpy3zn4default2, this, 12) != coroutineSingletons2) {
                    return createfromparcel;
                }
                return coroutineSingletons2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.RemoteActionCompatParcelizer;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    return CameraOverlayV2ContentKt.access$startOpacityAnimation(animatable, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
                }
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.RemoteActionCompatParcelizer;
                if (i8 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Float f4 = new Float(1.0f);
                    this.RemoteActionCompatParcelizer = 1;
                    return animatable.snapTo(f4, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
                }
                if (i8 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.RemoteActionCompatParcelizer;
                if (i9 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    if (DelayKt.delay(300L, this) != coroutineSingletons5) {
                    }
                    return coroutineSingletons5;
                }
                if (i9 != 1) {
                    int i10 = read + 57;
                    serializer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0 ? i9 != 2 : i9 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Float f5 = new Float(0.5f);
                Object[] objArr = {Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, SnapFlingBehaviorKt.write, 2};
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default3 = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr);
                this.RemoteActionCompatParcelizer = 2;
                if (Animatable.IconCompatParcelizer(animatable, f5, requiredwidthinvpy3zn4default3, this, 12) != coroutineSingletons5) {
                    return createfromparcel;
                }
                return coroutineSingletons5;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.RemoteActionCompatParcelizer;
                if (i11 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    if (DelayKt.delay(400L, this) != coroutineSingletons6) {
                    }
                    return coroutineSingletons6;
                }
                int i12 = serializer;
                int i13 = i12 + 63;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (i11 != 1) {
                    int i15 = i12 + 79;
                    read = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0 ? i11 != 2 : i11 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Float f6 = new Float(0.0f);
                Object[] objArr2 = {200, 0, SnapFlingBehaviorKt.write, 2};
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default4 = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr2);
                this.RemoteActionCompatParcelizer = 2;
                if (Animatable.IconCompatParcelizer(animatable, f6, requiredwidthinvpy3zn4default4, this, 12) != coroutineSingletons6) {
                    return createfromparcel;
                }
                return coroutineSingletons6;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.RemoteActionCompatParcelizer;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Float f7 = new Float(0.0f);
                Object[] objArr3 = {400, 0, SnapFlingBehaviorKt.RemoteActionCompatParcelizer, 2};
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default5 = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr3);
                this.RemoteActionCompatParcelizer = 1;
                return Animatable.IconCompatParcelizer(animatable, f7, requiredwidthinvpy3zn4default5, this, 12) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.RemoteActionCompatParcelizer;
                if (i17 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Float f8 = new Float(1.0f);
                    requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default6 = new requiredWidthInVpY3zN4default(0, (fling) null, 7);
                    this.RemoteActionCompatParcelizer = 1;
                    if (Animatable.IconCompatParcelizer(animatable, f8, requiredwidthinvpy3zn4default6, this, 12) != coroutineSingletons8) {
                    }
                    return coroutineSingletons8;
                }
                if (i17 != 1) {
                    int i18 = read + 105;
                    serializer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 == 0 ? i17 != 2 : i17 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Float f9 = new Float(0.5f);
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default7 = new requiredWidthInVpY3zN4default(1000, (fling) null, 4);
                this.RemoteActionCompatParcelizer = 2;
                if (Animatable.IconCompatParcelizer(animatable, f9, requiredwidthinvpy3zn4default7, this, 12) != coroutineSingletons8) {
                    return createfromparcel;
                }
                return coroutineSingletons8;
            default:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.RemoteActionCompatParcelizer;
                if (i19 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    return com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.access$startOpacityAnimation(animatable, this) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
                }
                int i20 = read + 57;
                serializer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0 ? i19 != 1 : i19 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
        }
    }
}
