package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.logistics.rider.glovo.R;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraWithTagsFragment extends BaseInjectionDialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int onActivityResult = 1;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    public InAppCameraWithTagsFragment() {
        BrazeUser$$ExternalSyntheticLambda28 brazeUser$$ExternalSyntheticLambda28 = new BrazeUser$$ExternalSyntheticLambda28(27, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new SearchOptionsKt$validateLimit$1(29, new SearchOptionsKt$validateLimit$1(28, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(InAppCameraWithTagsViewModel.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 14), brazeUser$$ExternalSyntheticLambda28, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 15));
    }

    public final InAppCameraWithTagsViewModel serializer() {
        int i = 2 % 2;
        int i2 = getNavigationEventDispatcher + 111;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (InAppCameraWithTagsViewModel) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r5
  0x002b: PHI (r5v2 android.os.Bundle) = (r5v1 android.os.Bundle), (r5v12 android.os.Bundle) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        InAppCameraArgs inAppCameraArgs;
        int i = 2 % 2;
        int i2 = onActivityResult + 59;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
            arguments = getArguments();
            if (arguments != null) {
                inAppCameraArgs = (InAppCameraArgs) ((Parcelable) SQLite.read(arguments, "InAppCameraFragmentArgs", InAppCameraArgs.class));
            } else {
                int i3 = getNavigationEventDispatcher + 23;
                onActivityResult = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                inAppCameraArgs = null;
            }
        } else {
            super.onCreate(bundle);
            read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
            arguments = getArguments();
            if (arguments != null) {
                inAppCameraArgs = (InAppCameraArgs) ((Parcelable) SQLite.read(arguments, "InAppCameraFragmentArgs", InAppCameraArgs.class));
            } else {
                int i5 = getNavigationEventDispatcher + 23;
                onActivityResult = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                inAppCameraArgs = null;
            }
        }
        if (inAppCameraArgs != null) {
            serializer().IconCompatParcelizer(inAppCameraArgs);
        } else {
            Timber.RemoteActionCompatParcelizer.read("No arguments passed to InAppCameraWithTagsFragment", new Object[0]);
            read(false, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("InAppCameraWithTagsFragment: is_take_picture_camera_security_exception_fix_enabled: ", serializer().RemoteActionCompatParcelizer()), new Object[0]);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, true, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(20, this), true, -1148617508)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onActivityResult + 7;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return composeView;
    }
}
