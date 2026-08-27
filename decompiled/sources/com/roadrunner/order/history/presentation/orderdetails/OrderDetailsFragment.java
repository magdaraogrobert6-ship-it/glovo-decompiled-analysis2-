package com.roadrunner.order.history.presentation.orderdetails;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.NavArgsLazy;
import coil3.ComponentRegistry$Builder;
import com.common_ui.databinding.LayoutTileBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.ActualSweepGradientShader9KIMszo;
import o.ImageLoaderBuilderExternalSyntheticLambda1;
import o.RealImageLoaderexecute2job1;
import o.accessisRenderNodeCompatiblecp;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.internalConicToQuadratics;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class OrderDetailsFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int initializeViewTreeOwners = 1;
    private static int invalidateMenu;
    public constructJsonArray getNavigationEventDispatcher;
    public LayoutTileBinding getOnBackPressedDispatcher;
    public ClipboardManager getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onActivityResult;
    public dlambda0 onBackPressed;
    public final ComponentRegistry$Builder onConfigurationChanged;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 27;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.getOnBackPressedDispatcher = null;
        super.onDestroyView();
        int i4 = invalidateMenu + 35;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public OrderDetailsFragment() {
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(19, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(28, new internalConicToQuadratics(27, this)));
        this.onConfigurationChanged = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(RealImageLoaderexecute2job1.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 15), networkingCoreModule$$ExternalSyntheticLambda2, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 16));
    }

    public final RealImageLoaderexecute2job1 serializer() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 115;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (RealImageLoaderexecute2job1) this.onConfigurationChanged.MediaSessionCompatResultReceiverWrapper();
        }
        int i3 = 49 / 0;
        return (RealImageLoaderexecute2job1) this.onConfigurationChanged.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = invalidateMenu + 119;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
        int i4 = initializeViewTreeOwners + 57;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 109;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onResume();
            serializer().write();
            throw null;
        }
        super.onResume();
        serializer().write();
        int i3 = initializeViewTreeOwners + 99;
        invalidateMenu = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners;
        int i3 = i2 + 1;
        invalidateMenu = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        constructJsonArray constructjsonarray = this.getNavigationEventDispatcher;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i2 + 69;
        invalidateMenu = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        int i7 = i2 + 79;
        invalidateMenu = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 1 / 0;
        }
        return constructjsonarray;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 115;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        LayoutTileBinding layoutTileBinding = LayoutTileBinding.read(layoutInflater);
        this.getOnBackPressedDispatcher = layoutTileBinding;
        LinearLayout linearLayoutWrite = layoutTileBinding.write();
        linearLayoutWrite.getClass();
        int i4 = initializeViewTreeOwners + 75;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return linearLayoutWrite;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        serializer().serializer().serializer(getViewLifecycleOwner(), new ActualSweepGradientShader9KIMszo(new OrderDetailsFragment$$ExternalSyntheticLambda0(this, 0), 4));
        SharedResourcePool sharedResourcePoolRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new OrderDetailsFragment$$ExternalSyntheticLambda0(this, 1));
        SharedResourcePool sharedResourcePool = serializer().read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner2, new OrderDetailsFragment$$ExternalSyntheticLambda0(this, 2));
        SharedResourcePool sharedResourcePoolIconCompatParcelizer = serializer().IconCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        sharedResourcePoolIconCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner3, new OrderDetailsFragment$$ExternalSyntheticLambda0(this, 3));
        serializer().serializer(((ImageLoaderBuilderExternalSyntheticLambda1) new NavArgsLazy(displayInAppMessagelambda1.serializer(ImageLoaderBuilderExternalSyntheticLambda1.class), new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(8, this)).MediaSessionCompatResultReceiverWrapper()).write());
        int i2 = initializeViewTreeOwners + 15;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
