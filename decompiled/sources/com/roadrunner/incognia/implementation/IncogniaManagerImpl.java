package com.roadrunner.incognia.implementation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.EnumColumnAdapter;
import o.RecyclerViewSavedState;
import o.ShortNewsContentCardView;
import o.decode;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.getInputText;
import o.getInputTextdelegate;
import o.getTextSelectionRange;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class IncogniaManagerImpl {
    private static int MediaDescriptionCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final getInputText MediaBrowserCompatMediaItem;
    public final IncogniaInitializerImpl MediaMetadataCompat;
    public final getAllSemanticsNodesToMap MediaSessionCompatQueueItem;
    public final transferSessionPackageI RatingCompat;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final GetUserDataUseCaseImpl read;
    public final EnumColumnAdapter serializer;
    public final decode write;

    public IncogniaManagerImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime, IncogniaInitializerImpl incogniaInitializerImpl, GetUserDataUseCaseImpl getUserDataUseCaseImpl, decode decodeVar, getAllSemanticsNodesToMap getallsemanticsnodestomap, EnumColumnAdapter enumColumnAdapter, transferSessionPackageI transfersessionpackagei, getInputText getinputtext) {
        getcontentviewgroupparentlayout.getClass();
        isopeninternalroom_runtime.getClass();
        incogniaInitializerImpl.getClass();
        getUserDataUseCaseImpl.getClass();
        decodeVar.getClass();
        getallsemanticsnodestomap.getClass();
        enumColumnAdapter.getClass();
        transfersessionpackagei.getClass();
        getinputtext.getClass();
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.MediaMetadataCompat = incogniaInitializerImpl;
        this.read = getUserDataUseCaseImpl;
        this.write = decodeVar;
        this.MediaSessionCompatQueueItem = getallsemanticsnodestomap;
        this.serializer = enumColumnAdapter;
        this.RatingCompat = transfersessionpackagei;
        this.MediaBrowserCompatMediaItem = getinputtext;
    }

    public final Object read(ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new IncogniaManagerImpl$fetchToken$2(this, shortNewsContentCardView, 0), continuationImpl);
        int i2 = ParcelableVolumeInfo + 65;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return objWithContext;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    public final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new HeatmapMapLayerUiModelImpl$1(this, str, null, 25), 2);
        int i2 = ParcelableVolumeInfo + 59;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(String str, LinkedHashMap linkedHashMap) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 25;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((getInputTextdelegate) this.MediaBrowserCompatMediaItem).read("incognia_track_event")) {
            return;
        }
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new PausingDispatcherKt$whenStateAtLeast$2(this, linkedHashMap, str, (ShortNewsContentCardView) null, 9), 2);
        int i4 = MediaDescriptionCompat + 35;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object access$getAccountId(IncogniaManagerImpl incogniaManagerImpl, ContinuationImpl continuationImpl) {
        RecyclerViewSavedState recyclerViewSavedState;
        int i = 2 % 2;
        incogniaManagerImpl.getClass();
        if (continuationImpl instanceof RecyclerViewSavedState) {
            recyclerViewSavedState = (RecyclerViewSavedState) continuationImpl;
            int i2 = recyclerViewSavedState.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = ParcelableVolumeInfo + 39;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                recyclerViewSavedState.read = i2 - Integer.MIN_VALUE;
            } else {
                recyclerViewSavedState = new RecyclerViewSavedState(incogniaManagerImpl, continuationImpl);
            }
        } else {
            recyclerViewSavedState = new RecyclerViewSavedState(incogniaManagerImpl, continuationImpl);
        }
        Object objInvoke = recyclerViewSavedState.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = recyclerViewSavedState.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetUserDataUseCaseImpl getUserDataUseCaseImpl = incogniaManagerImpl.read;
            recyclerViewSavedState.read = 1;
            objInvoke = getUserDataUseCaseImpl.invoke(recyclerViewSavedState);
            if (objInvoke == coroutineSingletons) {
                int i6 = MediaDescriptionCompat + 97;
                ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        getTextSelectionRange gettextselectionrange = (getTextSelectionRange) objInvoke;
        return af$$ExternalSyntheticOutline0.m(gettextselectionrange.MediaBrowserCompatMediaItem, "-", gettextselectionrange.ParcelableVolumeInfo);
    }
}
