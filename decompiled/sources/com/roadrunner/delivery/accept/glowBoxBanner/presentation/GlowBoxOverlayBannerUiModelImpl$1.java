package com.roadrunner.delivery.accept.glowBoxBanner.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.backToBackOrder.domain.ObserveBackToBackOrdersStateImpl;
import com.ui.common.extensions.ViewModelExtensionsKt$viewModelScoped$4$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactoryDefault;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GlowBoxOverlayBannerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ StaticLayoutFactoryDefault IconCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GlowBoxOverlayBannerUiModelImpl$1(StaticLayoutFactoryDefault staticLayoutFactoryDefault, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = staticLayoutFactoryDefault;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        StaticLayoutFactoryDefault staticLayoutFactoryDefault = this.IconCompatParcelizer;
        if (i4 == 0) {
            return new GlowBoxOverlayBannerUiModelImpl$1(staticLayoutFactoryDefault, shortNewsContentCardView, 0);
        }
        GlowBoxOverlayBannerUiModelImpl$1 glowBoxOverlayBannerUiModelImpl$1 = new GlowBoxOverlayBannerUiModelImpl$1(staticLayoutFactoryDefault, shortNewsContentCardView, 1);
        int i5 = RemoteActionCompatParcelizer + 45;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return glowBoxOverlayBannerUiModelImpl$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 27;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((GlowBoxOverlayBannerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((GlowBoxOverlayBannerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 113;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        StaticLayoutFactoryDefault staticLayoutFactoryDefault = this.IconCompatParcelizer;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.serializer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl = staticLayoutFactoryDefault.serializer;
                this.serializer = 1;
                return backToBackOrdersDataRepositoryImpl.fetchBackToBackOrders(true, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.serializer;
        if (i5 != 0) {
            int i6 = write + 53;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = ((ObserveBackToBackOrdersStateImpl) staticLayoutFactoryDefault.MediaDescriptionCompat).read();
        ViewModelExtensionsKt$viewModelScoped$4$1 viewModelExtensionsKt$viewModelScoped$4$1 = new ViewModelExtensionsKt$viewModelScoped$4$1(i, staticLayoutFactoryDefault);
        this.serializer = 1;
        if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(viewModelExtensionsKt$viewModelScoped$4$1, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i7 = RemoteActionCompatParcelizer;
        int i8 = i7 + 105;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            throw null;
        }
        int i9 = i7 + 123;
        write = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return coroutineSingletons2;
    }
}
