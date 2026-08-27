package com.roadrunner.order.history.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.ComponentRegistry$Builder;
import com.logistics.rider.glovo.R;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.order.history.databinding.LayoutNoDeliveryBinding;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidAutofillManageronFocusChanged21;
import o.ComponentRegistryBuilder;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.getImmutablePendingIntentFlags;
import o.internalConicToQuadratics;
import o.isInfiniteannotations;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryDialogFragment extends BaseInjectionDialogFragment {
    private static int invalidateMenu = 1;
    private static int onActivityResult;
    public LayoutNoDeliveryBinding getNavigationEventDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public HistoryDialogFragment() {
        HistoryDialogFragment$$ExternalSyntheticLambda0 historyDialogFragment$$ExternalSyntheticLambda0 = new HistoryDialogFragment$$ExternalSyntheticLambda0(this, 1);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(24, new internalConicToQuadratics(23, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(ComponentRegistryBuilder.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 11), historyDialogFragment$$ExternalSyntheticLambda0, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 12));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 101;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            this.getNavigationEventDispatcher = null;
        } else {
            super.onDestroyView();
            this.getNavigationEventDispatcher = null;
            int i3 = 0 / 0;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResult + 123;
        invalidateMenu = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            super.onCreate(bundle);
            i = 1;
        } else {
            super.onCreate(bundle);
            i = 0;
        }
        read(i, R.style.Theme_RoadRunner_Dialog_FullScreen);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onActivityResult + 23;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            layoutInflater.getClass();
            LayoutNoDeliveryBinding layoutNoDeliveryBinding = LayoutNoDeliveryBinding.read(layoutInflater, viewGroup);
            this.getNavigationEventDispatcher = layoutNoDeliveryBinding;
            layoutNoDeliveryBinding.IconCompatParcelizer();
            throw null;
        }
        layoutInflater.getClass();
        LayoutNoDeliveryBinding layoutNoDeliveryBinding2 = LayoutNoDeliveryBinding.read(layoutInflater, viewGroup);
        this.getNavigationEventDispatcher = layoutNoDeliveryBinding2;
        ConstraintLayout constraintLayoutIconCompatParcelizer = layoutNoDeliveryBinding2.IconCompatParcelizer();
        int i3 = onActivityResult + 47;
        invalidateMenu = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        div7Ah8Wj8 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(childFragmentManager);
        isinfiniteannotations.IconCompatParcelizer(R.id.historyNavHostFragmentContainer, AndroidAutofillManageronFocusChanged21.write(), null);
        isinfiniteannotations.read();
        SharedResourcePool sharedResourcePoolIconCompatParcelizer = ((ComponentRegistryBuilder) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolIconCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new NestFragment.AnonymousClass1(this));
        LayoutNoDeliveryBinding layoutNoDeliveryBinding = this.getNavigationEventDispatcher;
        layoutNoDeliveryBinding.getClass();
        ((getImmutablePendingIntentFlags) layoutNoDeliveryBinding.serializer).setStartImageClickListener(new HistoryDialogFragment$$ExternalSyntheticLambda0(this, 0));
        int i2 = onActivityResult + 105;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
