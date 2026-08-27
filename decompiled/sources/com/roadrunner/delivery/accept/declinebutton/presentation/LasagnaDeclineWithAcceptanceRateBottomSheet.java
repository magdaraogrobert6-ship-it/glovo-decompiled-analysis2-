package com.roadrunner.delivery.accept.declinebutton.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.common_ui.databinding.LayoutTileBinding;
import com.logistics.rider.glovo.R;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.ui.common.base.BaseInjectionBottomSheet;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.BrazeLogger;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.getSUPPRESSannotations;
import o.getTimeFromEpochInSeconds;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.quickReject;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class LasagnaDeclineWithAcceptanceRateBottomSheet extends BaseInjectionBottomSheet {
    private static int initializeViewTreeOwners = 0;
    private static int invalidateMenu = 1;
    public LayoutTileBinding getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;
    public dlambda0 onActivityResult;
    public final ComponentRegistry$Builder onBackPressed;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onConfigurationChanged;

    @Override // androidx.fragment.app.DialogFragment
    public final int w_() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners;
        int i3 = i2 + 65;
        invalidateMenu = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        invalidateMenu = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return R.style.RoadRunnerRoundedBottomSheetTheme;
    }

    public LasagnaDeclineWithAcceptanceRateBottomSheet() {
        final int i = 0;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ LasagnaDeclineWithAcceptanceRateBottomSheet serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = i;
                LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = this.serializer;
                if (i3 != 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = lasagnaDeclineWithAcceptanceRateBottomSheet.getSavedStateRegistry;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                        return r8lambdaudhhxliolpu0hpccqh6voskpny;
                    }
                    removeNodeAtDepth.serializer("messageViewModelFactory");
                    throw null;
                }
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = lasagnaDeclineWithAcceptanceRateBottomSheet.onConfigurationChanged;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i4 = read;
                int i5 = i4 + 103;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 30 / 0;
                }
                int i7 = i4 + 65;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny2;
            }
        };
        quickReject quickreject = new quickReject(this, 0);
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new SearchOptionsKt$validateLimit$1(26, quickreject));
        this.onBackPressed = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(BoringLayoutFactory33ExternalSyntheticApiModelOutline0.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 10), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 11));
        final int i2 = 1;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ LasagnaDeclineWithAcceptanceRateBottomSheet serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = i2;
                LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = this.serializer;
                if (i4 != 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = lasagnaDeclineWithAcceptanceRateBottomSheet.getSavedStateRegistry;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                        return r8lambdaudhhxliolpu0hpccqh6voskpny;
                    }
                    removeNodeAtDepth.serializer("messageViewModelFactory");
                    throw null;
                }
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = lasagnaDeclineWithAcceptanceRateBottomSheet.onConfigurationChanged;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("viewModelFactory");
                    throw null;
                }
                int i5 = read;
                int i6 = i5 + 103;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 30 / 0;
                }
                int i8 = i5 + 65;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return r8lambdaudhhxliolpu0hpccqh6voskpny2;
            }
        };
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer2 = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new SearchOptionsKt$validateLimit$1(27, new quickReject(this, 1)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer2, 12), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer2, 13));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 77;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.getNavigationEventDispatcher = null;
        super.onDestroyView();
        int i4 = invalidateMenu + 61;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final BoringLayoutFactory33ExternalSyntheticApiModelOutline0 serializer() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 5;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0 = (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.onBackPressed.MediaSessionCompatResultReceiverWrapper();
        int i4 = invalidateMenu + 37;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return boringLayoutFactory33ExternalSyntheticApiModelOutline0;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 97;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            layoutInflater.getClass();
            z = true;
        } else {
            layoutInflater.getClass();
            z = false;
        }
        LayoutTileBinding layoutTileBindingIconCompatParcelizer = LayoutTileBinding.IconCompatParcelizer(layoutInflater.inflate(R.layout.fragment_lasagna_bottom_sheet_decline_acceptance_rate, viewGroup, z));
        this.getNavigationEventDispatcher = layoutTileBindingIconCompatParcelizer;
        return layoutTileBindingIconCompatParcelizer.serializer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        BrazeLogger brazeLoggerWrite = serializer().write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i2 = 1;
        brazeLoggerWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new ReportPictureUseCase$invoke$2(this, 1));
        LayoutTileBinding layoutTileBinding = this.getNavigationEventDispatcher;
        if (layoutTileBinding != null) {
            ComposeView composeView = (ComposeView) layoutTileBinding.serializer;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(19, this), true, -1159847062);
            final int i3 = 0;
            int i4 = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
            UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, dragAndDropTargetModifierNode}, 916013162, i4, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
            ((getSUPPRESSannotations) layoutTileBinding.write).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet$$ExternalSyntheticLambda3
                private static int IconCompatParcelizer = 0;
                private static int read = 1;
                public final /* synthetic */ LasagnaDeclineWithAcceptanceRateBottomSheet serializer;

                {
                    this.serializer = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = 2 % 2;
                    int i6 = IconCompatParcelizer + 81;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    int i8 = i3;
                    LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = this.serializer;
                    if (i8 == 0) {
                        lasagnaDeclineWithAcceptanceRateBottomSheet.serializer().serializer();
                        return;
                    }
                    lasagnaDeclineWithAcceptanceRateBottomSheet.serializer().RemoteActionCompatParcelizer();
                    int i9 = IconCompatParcelizer + 117;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            });
            ((getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet$$ExternalSyntheticLambda3
                private static int IconCompatParcelizer = 0;
                private static int read = 1;
                public final /* synthetic */ LasagnaDeclineWithAcceptanceRateBottomSheet serializer;

                {
                    this.serializer = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = 2 % 2;
                    int i6 = IconCompatParcelizer + 81;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    int i8 = i2;
                    LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = this.serializer;
                    if (i8 == 0) {
                        lasagnaDeclineWithAcceptanceRateBottomSheet.serializer().serializer();
                        return;
                    }
                    lasagnaDeclineWithAcceptanceRateBottomSheet.serializer().RemoteActionCompatParcelizer();
                    int i9 = IconCompatParcelizer + 117;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
            });
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        }
        SharedResourcePool sharedResourcePool = ((getTimeFromEpochInSeconds) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper()).read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner2, new ReportPictureUseCase$invoke$2(this, 2));
        SharedResourcePool sharedResourcePool2 = serializer().read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        sharedResourcePool2.RemoteActionCompatParcelizer(viewLifecycleOwner3, new BarcodeAnalyzer$$ExternalSyntheticLambda0(13, this));
        int i5 = invalidateMenu + 87;
        initializeViewTreeOwners = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
