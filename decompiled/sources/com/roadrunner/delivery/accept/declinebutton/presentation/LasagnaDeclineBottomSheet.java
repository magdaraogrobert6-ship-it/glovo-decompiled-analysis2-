package com.roadrunner.delivery.accept.declinebutton.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.ComponentRegistry$Builder;
import coil3.network.NetworkFetcher;
import com.logistics.rider.glovo.R;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.ui.common.base.BaseInjectionBottomSheet;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.BrazeLogger;
import o.accessisRenderNodeCompatiblecp;
import o.accesssetDependencyp;
import o.createdefault;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.getSUPPRESSannotations;
import o.getTimeFromEpochInSeconds;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class LasagnaDeclineBottomSheet extends BaseInjectionBottomSheet {
    private static int initializeViewTreeOwners = 0;
    private static int onActivityResult = 1;
    public accesssetDependencyp getNavigationEventDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY invalidateMenu;
    public final ComponentRegistry$Builder onBackPressed;
    public dlambda0 onConfigurationChanged;

    public LasagnaDeclineBottomSheet() {
        final int i = 0;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ LasagnaDeclineBottomSheet RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 51;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i;
                LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = this.RemoteActionCompatParcelizer;
                if (i4 == 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = lasagnaDeclineBottomSheet.invalidateMenu;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                        removeNodeAtDepth.serializer("viewModelFactory");
                        throw null;
                    }
                    int i5 = read + 31;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = lasagnaDeclineBottomSheet.getOnBackPressedDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("messageViewModelFactory");
                    throw null;
                }
                int i7 = read + 5;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny2;
                }
                obj.hashCode();
                throw null;
            }
        };
        createdefault createdefaultVar = new createdefault(this, 0);
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new SearchOptionsKt$validateLimit$1(22, createdefaultVar));
        this.onBackPressed = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(BoringLayoutFactory33ExternalSyntheticApiModelOutline0.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 3));
        final int i2 = 1;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 1;
            private static int read;
            public final /* synthetic */ LasagnaDeclineBottomSheet RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 51;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                Object obj = null;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i2;
                LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = this.RemoteActionCompatParcelizer;
                if (i5 == 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = lasagnaDeclineBottomSheet.invalidateMenu;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                        removeNodeAtDepth.serializer("viewModelFactory");
                        throw null;
                    }
                    int i6 = read + 31;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = lasagnaDeclineBottomSheet.getOnBackPressedDispatcher;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 == null) {
                    removeNodeAtDepth.serializer("messageViewModelFactory");
                    throw null;
                }
                int i8 = read + 5;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny2;
                }
                obj.hashCode();
                throw null;
            }
        };
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer2 = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new SearchOptionsKt$validateLimit$1(23, new createdefault(this, 1)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getTimeFromEpochInSeconds.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer2, 4), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer2, 5));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 33;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.getNavigationEventDispatcher = null;
            super.onDestroyView();
        } else {
            this.getNavigationEventDispatcher = null;
            super.onDestroyView();
            throw null;
        }
    }

    public final BoringLayoutFactory33ExternalSyntheticApiModelOutline0 serializer() {
        BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0;
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 37;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boringLayoutFactory33ExternalSyntheticApiModelOutline0 = (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.onBackPressed.MediaSessionCompatResultReceiverWrapper();
            int i3 = 91 / 0;
        } else {
            boringLayoutFactory33ExternalSyntheticApiModelOutline0 = (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.onBackPressed.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = onActivityResult + 53;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return boringLayoutFactory33ExternalSyntheticApiModelOutline0;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 17;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        accesssetDependencyp accesssetdependencypSerializer = accesssetDependencyp.serializer(layoutInflater.inflate(R.layout.fragment_lasagna_bottom_sheet_decline, viewGroup, false));
        this.getNavigationEventDispatcher = accesssetdependencypSerializer;
        ConstraintLayout constraintLayout = accesssetdependencypSerializer.read();
        constraintLayout.getClass();
        int i4 = onActivityResult + 15;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 2;
        int i2 = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        BrazeLogger brazeLoggerWrite = serializer().write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        brazeLoggerWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new NetworkFetcher.AnonymousClass2(this, 27));
        accesssetDependencyp accesssetdependencyp = this.getNavigationEventDispatcher;
        accesssetdependencyp.getClass();
        final int i3 = 0;
        ((getSUPPRESSannotations) accesssetdependencyp.IconCompatParcelizer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ LasagnaDeclineBottomSheet serializer;

            {
                this.serializer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = 2 % 2;
                int i5 = read + 15;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    throw null;
                }
                int i6 = i3;
                LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = this.serializer;
                if (i6 == 0) {
                    lasagnaDeclineBottomSheet.serializer().serializer();
                    int i7 = IconCompatParcelizer + 1;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return;
                }
                if (i6 != 1) {
                    lasagnaDeclineBottomSheet.serializer().IconCompatParcelizer();
                    return;
                }
                lasagnaDeclineBottomSheet.serializer().RemoteActionCompatParcelizer();
                int i9 = IconCompatParcelizer + 37;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 70 / 0;
                }
            }
        });
        accesssetDependencyp accesssetdependencyp2 = this.getNavigationEventDispatcher;
        accesssetdependencyp2.getClass();
        final int i4 = 1;
        ((getSUPPRESSannotations) accesssetdependencyp2.serializer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ LasagnaDeclineBottomSheet serializer;

            {
                this.serializer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = 2 % 2;
                int i6 = read + 15;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    throw null;
                }
                int i7 = i4;
                LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = this.serializer;
                if (i7 == 0) {
                    lasagnaDeclineBottomSheet.serializer().serializer();
                    int i8 = IconCompatParcelizer + 1;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return;
                }
                if (i7 != 1) {
                    lasagnaDeclineBottomSheet.serializer().IconCompatParcelizer();
                    return;
                }
                lasagnaDeclineBottomSheet.serializer().RemoteActionCompatParcelizer();
                int i10 = IconCompatParcelizer + 37;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 70 / 0;
                }
            }
        });
        accesssetDependencyp accesssetdependencyp3 = this.getNavigationEventDispatcher;
        accesssetdependencyp3.getClass();
        ((getSUPPRESSannotations) accesssetdependencyp3.read).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ LasagnaDeclineBottomSheet serializer;

            {
                this.serializer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = 2 % 2;
                int i6 = read + 15;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    throw null;
                }
                int i7 = i;
                LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = this.serializer;
                if (i7 == 0) {
                    lasagnaDeclineBottomSheet.serializer().serializer();
                    int i8 = IconCompatParcelizer + 1;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return;
                }
                if (i7 != 1) {
                    lasagnaDeclineBottomSheet.serializer().IconCompatParcelizer();
                    return;
                }
                lasagnaDeclineBottomSheet.serializer().RemoteActionCompatParcelizer();
                int i10 = IconCompatParcelizer + 37;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 70 / 0;
                }
            }
        });
        SharedResourcePool sharedResourcePool = ((getTimeFromEpochInSeconds) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner2, new NetworkFetcher.AnonymousClass2(this, 28));
        SharedResourcePool sharedResourcePool2 = serializer().read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        sharedResourcePool2.RemoteActionCompatParcelizer(viewLifecycleOwner3, new BarcodeAnalyzer$$ExternalSyntheticLambda0(11, this));
        int i5 = initializeViewTreeOwners + 91;
        onActivityResult = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }
}
