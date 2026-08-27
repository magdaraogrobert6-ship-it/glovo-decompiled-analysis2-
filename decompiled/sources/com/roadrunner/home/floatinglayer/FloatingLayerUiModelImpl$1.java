package com.roadrunner.home.floatinglayer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.usecase.MainThreadOnIdleObserver$invoke$1;
import com.roadrunner.home.floatinglayer.config.GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1;
import com.roadrunner.home.floatinglayer.config.GetFloatingLayerScope$invoke$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import o.FragmentManagerLaunchedFragmentInfo;
import o.GetTargetFragmentRequestCodeUsageViolation;
import o.ShortNewsContentCardView;
import o.accesshandleUpdate;
import o.createFromParcel;
import o.dispatchFragmentsOnCreateView;
import o.getContentViewGroupParentLayout;
import o.markFragmentsCreated;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.requestPermissions;
import o.requireActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatingLayerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ markFragmentsCreated IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatingLayerUiModelImpl$1(markFragmentsCreated markfragmentscreated, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = markfragmentscreated;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        markFragmentsCreated markfragmentscreated = this.IconCompatParcelizer;
        if (i4 == 0) {
            FloatingLayerUiModelImpl$1 floatingLayerUiModelImpl$1 = new FloatingLayerUiModelImpl$1(markfragmentscreated, shortNewsContentCardView, 0);
            int i5 = read + 81;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return floatingLayerUiModelImpl$1;
        }
        FloatingLayerUiModelImpl$1 floatingLayerUiModelImpl$2 = new FloatingLayerUiModelImpl$1(markfragmentscreated, shortNewsContentCardView, 1);
        int i7 = serializer + 65;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return floatingLayerUiModelImpl$2;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 35;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((FloatingLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((FloatingLayerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = serializer + 123;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow settingsViewModel$special$$inlined$map$1;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 9;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        markFragmentsCreated markfragmentscreated = this.IconCompatParcelizer;
        int i6 = 1;
        if (i5 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.write;
            if (i7 != 0) {
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flow = markfragmentscreated.MediaMetadataCompat.write;
            dispatchFragmentsOnCreateView dispatchfragmentsoncreateview = new dispatchFragmentsOnCreateView(markfragmentscreated, i6);
            this.write = 1;
            return flow.collect(dispatchfragmentsoncreateview, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.write;
        if (i8 != 0) {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = serializer + 39;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = markfragmentscreated.RatingCompat;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = markfragmentscreated.IconCompatParcelizer;
        StateFlow stateFlow = markfragmentscreated.MediaDescriptionCompat;
        getcontentviewgroupparentlayout.getClass();
        stateFlow.getClass();
        FragmentManagerLaunchedFragmentInfo fragmentManagerLaunchedFragmentInfo = getTargetFragmentRequestCodeUsageViolation.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        boolean zSerializer = fragmentManagerLaunchedFragmentInfo.write.serializer();
        requestPermissions requestpermissions = fragmentManagerLaunchedFragmentInfo.IconCompatParcelizer;
        if (zSerializer) {
            settingsViewModel$special$$inlined$map$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((requireActivity) requestpermissions).RemoteActionCompatParcelizer, fragmentManagerLaunchedFragmentInfo.serializer.read, new accesshandleUpdate(3, fragmentManagerLaunchedFragmentInfo, FragmentManagerLaunchedFragmentInfo.class, "mapDeliveryFlowTurnByTurnState", "mapDeliveryFlowTurnByTurnState(Lcom/roadrunner/home/context/HomeContext;Lcom/roadrunner/delivery/ontheway/turnbyturn/MapNavigationState;)Lcom/roadrunner/home/floatinglayer/config/FloatingLayerConfigurationType;", 4, 3));
        } else {
            settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(((requireActivity) requestpermissions).RemoteActionCompatParcelizer, 3, fragmentManagerLaunchedFragmentInfo);
            int i11 = serializer + 117;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new GetFloatingLayerScope$invoke$1(getTargetFragmentRequestCodeUsageViolation, null, 1), FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new GetFloatingLayerScope$invoke$1(getTargetFragmentRequestCodeUsageViolation, null, 0), FlowKt.serializer(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainThreadOnIdleObserver$invoke$1(i, 1, null), settingsViewModel$special$$inlined$map$1))), new GetFloatingLayerScope$invoke$$inlined$flatMapLatest$1(null, getcontentviewgroupparentlayout, getTargetFragmentRequestCodeUsageViolation, stateFlow)));
        dispatchFragmentsOnCreateView dispatchfragmentsoncreateview2 = new dispatchFragmentsOnCreateView(markfragmentscreated, 0);
        this.write = 1;
        if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(dispatchfragmentsoncreateview2, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i13 = read + 13;
        serializer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            int i14 = 8 / 0;
        }
        return coroutineSingletons2;
    }
}
