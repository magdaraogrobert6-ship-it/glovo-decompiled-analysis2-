package com.roadrunner.sidemenu.floating;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.dispatchChildDetached;
import o.displayInAppMessagelambda1;
import o.getAdapterPositionInRecyclerView;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuFloatingLayerItemUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SideMenuFloatingLayerItemUiModelImpl$1(r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = r8lambdap8kvrporasful_ov_pvwbybk_ny;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 113;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny = this.read;
        if (i4 == 0) {
            return new SideMenuFloatingLayerItemUiModelImpl$1(r8lambdap8kvrporasful_ov_pvwbybk_ny, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 != 1) {
            return new SideMenuFloatingLayerItemUiModelImpl$1(r8lambdap8kvrporasful_ov_pvwbybk_ny, shortNewsContentCardView, i);
        }
        SideMenuFloatingLayerItemUiModelImpl$1 sideMenuFloatingLayerItemUiModelImpl$1 = new SideMenuFloatingLayerItemUiModelImpl$1(r8lambdap8kvrporasful_ov_pvwbybk_ny, shortNewsContentCardView, i5);
        int i6 = IconCompatParcelizer + 5;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return sideMenuFloatingLayerItemUiModelImpl$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 9;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((SideMenuFloatingLayerItemUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((SideMenuFloatingLayerItemUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SideMenuFloatingLayerItemUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 35;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 33;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny = this.read;
        int i6 = 24;
        Object obj3 = null;
        if (i5 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.serializer;
            if (i7 != 0) {
                if (i7 != 1) {
                    int i8 = IconCompatParcelizer + 53;
                    write = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        obj3.hashCode();
                        throw null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                coroutineSingletons = null;
                i = write + 73;
                IconCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return coroutineSingletons;
                }
                obj3.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow = r8lambdap8kvrporasful_ov_pvwbybk_ny.MediaDescriptionCompat.serializer;
            FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$2 = new FlowSubscription$consumeFlow$2(i6, r8lambdap8kvrporasful_ov_pvwbybk_ny);
            this.serializer = 1;
            if (stateFlow.collect(flowSubscription$consumeFlow$2, this) == coroutineSingletons) {
                int i9 = write + 73;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    obj3.hashCode();
                    throw null;
                }
            }
            i = write + 73;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return coroutineSingletons;
            }
            obj3.hashCode();
            throw null;
            DrawableTransformation.read();
            coroutineSingletons = null;
            i = write + 73;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return coroutineSingletons;
            }
            obj3.hashCode();
            throw null;
        }
        if (i5 == 1) {
            dispatchChildDetached dispatchchilddetached = r8lambdap8kvrporasful_ov_pvwbybk_ny.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.serializer;
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RiderStateRepositoryImpl riderStateRepositoryImpl = (RiderStateRepositoryImpl) dispatchchilddetached;
                if (riderStateRepositoryImpl.write()) {
                    Flow flow = riderStateRepositoryImpl.read(displayInAppMessagelambda1.serializer(getAdapterPositionInRecyclerView.class));
                    RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(i6, r8lambdap8kvrporasful_ov_pvwbybk_ny);
                    this.serializer = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons2) {
                        obj2 = coroutineSingletons2;
                    }
                } else {
                    r8lambdap8kvrporasful_ov_pvwbybk_ny.read.IconCompatParcelizer(Boolean.TRUE);
                }
            } else if (i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i11 = IconCompatParcelizer + 59;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return obj2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.serializer;
        if (i13 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            OkHttpCall$1 okHttpCall$1 = r8lambdap8kvrporasful_ov_pvwbybk_ny.IconCompatParcelizer;
            this.serializer = 1;
            if (okHttpCall$1.invoke(this) != coroutineSingletons3) {
                return obj2;
            }
            int i14 = write + 75;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                int i15 = 32 / 0;
            }
            return coroutineSingletons3;
        }
        int i16 = IconCompatParcelizer + 33;
        write = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        if (i13 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i18 = IconCompatParcelizer + 9;
        write = i18 % Fields.SpotShadowColor;
        if (i18 % 2 != 0) {
            int i19 = 4 % 2;
        }
        return null;
    }
}
