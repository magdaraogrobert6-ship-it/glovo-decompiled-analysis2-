package com.roadrunner.delivery.accept.declinebutton.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import coil3.ComponentRegistry$Builder;
import coil3.network.NetworkFetcher;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.ui.common.base.BaseInjectionBottomSheet;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.drawColor;
import o.getTimeFromEpochInSeconds;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class LasagnaDeclineComposeBottomSheet extends BaseInjectionBottomSheet {
    private static int onActivityResult = 1;
    private static int onBackPressed;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getNavigationEventDispatcher;
    public dlambda0 getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;
    public final ComponentRegistry$Builder initializeViewTreeOwners;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onConfigurationChanged;

    @Override // androidx.fragment.app.DialogFragment
    public final int w_() {
        int i = 2 % 2;
        int i2 = onBackPressed + 63;
        int i3 = i2 % Fields.SpotShadowColor;
        onActivityResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 21;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return R.style.RoadRunnerRoundedBottomSheetTheme;
    }

    public LasagnaDeclineComposeBottomSheet() {
        final int i = 0;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet$$ExternalSyntheticLambda0
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ LasagnaDeclineComposeBottomSheet RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 39;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet = this.RemoteActionCompatParcelizer;
                if (i5 != 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = lasagnaDeclineComposeBottomSheet.getNavigationEventDispatcher;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                        return r8lambdaudhhxliolpu0hpccqh6voskpny;
                    }
                    removeNodeAtDepth.serializer("messageViewModelFactory");
                    throw null;
                }
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = lasagnaDeclineComposeBottomSheet.onConfigurationChanged;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i6 = read + 109;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny2;
            }
        };
        drawColor drawcolor = new drawColor(this, 0);
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new SearchOptionsKt$validateLimit$1(24, drawcolor));
        this.initializeViewTreeOwners = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(BoringLayoutFactory33ExternalSyntheticApiModelOutline0.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 6), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 7));
        final int i2 = 1;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet$$ExternalSyntheticLambda0
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ LasagnaDeclineComposeBottomSheet RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 39;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet = this.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = lasagnaDeclineComposeBottomSheet.getNavigationEventDispatcher;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                        return r8lambdaudhhxliolpu0hpccqh6voskpny;
                    }
                    removeNodeAtDepth.serializer("messageViewModelFactory");
                    throw null;
                }
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = lasagnaDeclineComposeBottomSheet.onConfigurationChanged;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i7 = read + 109;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny2;
            }
        };
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer2 = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new SearchOptionsKt$validateLimit$1(25, new drawColor(this, 1)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer2, 8), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer2, 9));
    }

    public final BoringLayoutFactory33ExternalSyntheticApiModelOutline0 serializer() {
        int i = 2 % 2;
        int i2 = onActivityResult + 67;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.initializeViewTreeOwners.MediaSessionCompatResultReceiverWrapper();
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(18, this), true, 1400620793)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 13;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePool = ((getTimeFromEpochInSeconds) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new NetworkFetcher.AnonymousClass2(this));
        SharedResourcePool sharedResourcePool2 = serializer().read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        sharedResourcePool2.RemoteActionCompatParcelizer(viewLifecycleOwner2, new BarcodeAnalyzer$$ExternalSyntheticLambda0(12, this));
        int i2 = onActivityResult + 11;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
