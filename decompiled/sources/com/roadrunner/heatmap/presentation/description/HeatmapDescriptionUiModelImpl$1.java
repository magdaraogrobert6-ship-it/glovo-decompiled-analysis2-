package com.roadrunner.heatmap.presentation.description;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import com.roadrunner.heatmap.data.HeatmapDataStore$setBoolean$2;
import com.roadrunner.home.nest.NestViewModel$observeNestScope$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.CorruptionException;
import o.DataMigrationInitializerCompanionrunMigrations2;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getNotificationChannelGroup;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFillViewport;
import o.updateData;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapDescriptionUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public int read;
    public final /* synthetic */ updateData write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapDescriptionUiModelImpl$1(updateData updatedata, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = updatedata;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        updateData updatedata = this.write;
        int i5 = 0;
        if (i4 == 0) {
            return new HeatmapDescriptionUiModelImpl$1(updatedata, shortNewsContentCardView, i5);
        }
        HeatmapDescriptionUiModelImpl$1 heatmapDescriptionUiModelImpl$1 = new HeatmapDescriptionUiModelImpl$1(updatedata, shortNewsContentCardView, 1);
        int i6 = serializer + 125;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
        return heatmapDescriptionUiModelImpl$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            Object objInvokeSuspend = ((HeatmapDescriptionUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = serializer + 19;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((HeatmapDescriptionUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 67;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        updateData updatedata = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 != 0) {
                int i5 = RemoteActionCompatParcelizer + 59;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SendTestPushUseCase sendTestPushUseCase = updatedata.IconCompatParcelizer;
            this.read = 1;
            CorruptionException corruptionException = (CorruptionException) sendTestPushUseCase.serializer;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(corruptionException.write.IconCompatParcelizer, new HeatmapDataStore$setBoolean$2(i3, corruptionException.read, shortNewsContentCardView), this);
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons) {
                return createfromparcel;
            }
            int i6 = RemoteActionCompatParcelizer + 79;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.read;
        if (i8 != 0) {
            int i9 = serializer + 107;
            int i10 = i9 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i10;
            int i11 = i9 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = i10 + 81;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        DataMigrationInitializerCompanionrunMigrations2 dataMigrationInitializerCompanionrunMigrations2 = updatedata.RemoteActionCompatParcelizer;
        CorruptionException corruptionException2 = dataMigrationInitializerCompanionrunMigrations2.write;
        setFillViewport setfillviewport = corruptionException2.write;
        isRoot isroot = corruptionException2.read;
        isroot.getClass();
        HeatmapDataStore$getBoolean$$inlined$map$1 heatmapDataStore$getBoolean$$inlined$map$1 = new HeatmapDataStore$getBoolean$$inlined$map$1(setfillviewport.IconCompatParcelizer.serializer(), isroot, 0);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.RemoteActionCompatParcelizer(heatmapDataStore$getBoolean$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer), new GetAppStateImpl$invoke$$inlined$map$1(((GetCashBlockUiState) dataMigrationInitializerCompanionrunMigrations2.IconCompatParcelizer.serializer).RemoteActionCompatParcelizer(), 7), new getNotificationChannelGroup(3, dataMigrationInitializerCompanionrunMigrations2, DataMigrationInitializerCompanionrunMigrations2.class, "mapToUiState", "mapToUiState(Ljava/lang/Boolean;Z)Lcom/roadrunner/heatmap/api/description/HeatmapDescriptionUiModel$UiState;", 4, 2));
        NestViewModel$observeNestScope$1.AnonymousClass1 anonymousClass1 = new NestViewModel$observeNestScope$1.AnonymousClass1(19, updatedata);
        this.read = 1;
        if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(anonymousClass1, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i14 = RemoteActionCompatParcelizer + 27;
        serializer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return coroutineSingletons2;
    }
}
