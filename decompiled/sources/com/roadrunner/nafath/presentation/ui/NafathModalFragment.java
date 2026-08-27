package com.roadrunner.nafath.presentation.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.internalConicToQuadratics;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.q4ExternalSyntheticLambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.stopInstancelambda11;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathModalFragment extends BaseInjectionDialogFragment {
    private static int onActivityResult = 1;
    private static int onBackPressed;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public FormBody.Builder getOnBackPressedDispatcher;
    public stopInstancelambda11 getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY invalidateMenu;

    public NafathModalFragment() {
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(13, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(18, new internalConicToQuadratics(17, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(q4ExternalSyntheticLambda1.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 5), networkingCoreModule$$ExternalSyntheticLambda2, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 6));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r5
  0x002c: PHI (r5v2 android.app.Dialog) = (r5v1 android.app.Dialog), (r5v8 android.app.Dialog) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Dialog dialog;
        int i = 2 % 2;
        int i2 = onActivityResult + 123;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
            ((DialogFragment) this).RemoteActionCompatParcelizer = true;
            dialog = ((DialogFragment) this).read;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
        } else {
            super.onCreate(bundle);
            read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
            ((DialogFragment) this).RemoteActionCompatParcelizer = false;
            dialog = ((DialogFragment) this).read;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
        }
        int i3 = onBackPressed + 59;
        onActivityResult = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 47;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            layoutInflater.getClass();
            requireArguments().getLong("arg_expires_at");
            requireArguments().getString("arg_display_code");
            throw null;
        }
        layoutInflater.getClass();
        long j = requireArguments().getLong("arg_expires_at");
        String string = requireArguments().getString("arg_display_code");
        if (string == null) {
            string = "";
        }
        String string2 = requireArguments().getString("arg_transaction_id");
        FormBody.Builder builder = this.getOnBackPressedDispatcher;
        if (builder == null) {
            removeNodeAtDepth.serializer("nafathLogger");
            throw null;
        }
        builder.RemoteActionCompatParcelizer(j, string2);
        ((q4ExternalSyntheticLambda1) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer(j, string, string2);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(29, this), true, 263913577)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i3 = onActivityResult + 79;
        onBackPressed = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return composeView;
    }
}
