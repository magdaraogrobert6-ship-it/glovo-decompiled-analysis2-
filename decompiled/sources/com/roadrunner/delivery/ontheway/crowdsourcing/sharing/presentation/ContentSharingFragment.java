package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidSqliteDriverCallback;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.filter;
import o.getStateui;
import o.isAdapterPositionOnScreen;
import o.isEditorFocused;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentSharingFragment extends BaseInjectionDialogFragment {
    private static int invalidateMenu = 0;
    private static int onMenuItemSelected = 1;
    public p0 getNavigationEventDispatcher;
    public boolean getOnBackPressedDispatcher;
    public final isAdapterPositionOnScreen getSavedStateRegistry = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(29, this));
    public getStateui initializeViewTreeOwners;
    public boolean onActivityResult;
    public final ComponentRegistry$Builder onBackPressed;
    public AndroidUiDispatcherCompanioncurrentThread1 onConfigurationChanged;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        boolean z;
        int i = 2 % 2;
        int i2 = invalidateMenu + 75;
        onMenuItemSelected = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onStop();
            z = false;
        } else {
            super.onStop();
            z = true;
        }
        this.onActivityResult = z;
    }

    public ContentSharingFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 4, new ContentSharingFragment$$ExternalSyntheticLambda1(this, 0));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(3, new filter(2, this)));
        this.onBackPressed = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(isEditorFocused.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 18), androidSqliteDriverCallback, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 19));
    }

    public final isEditorFocused serializer() {
        isEditorFocused iseditorfocused;
        int i = 2 % 2;
        int i2 = invalidateMenu + 71;
        onMenuItemSelected = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iseditorfocused = (isEditorFocused) this.onBackPressed.MediaSessionCompatResultReceiverWrapper();
            int i3 = 92 / 0;
        } else {
            iseditorfocused = (isEditorFocused) this.onBackPressed.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = invalidateMenu + 79;
        onMenuItemSelected = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iseditorfocused;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onMenuItemSelected + 31;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = invalidateMenu + 7;
        onMenuItemSelected = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        int i = 2 % 2;
        super.onResume();
        if (requireContext().checkSelfPermission("android.permission.CAMERA") == 0) {
            int i2 = invalidateMenu + 11;
            onMenuItemSelected = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (this.onActivityResult && !this.getOnBackPressedDispatcher) {
            int i4 = onMenuItemSelected + 107;
            invalidateMenu = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!z)) {
                read(false, false);
            }
        }
        this.onActivityResult = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int i = 2 % 2;
        int i2 = onMenuItemSelected + 125;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Dialog dialog = ((DialogFragment) this).read;
            throw null;
        }
        Dialog dialog2 = ((DialogFragment) this).read;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        super.onStart();
        Dialog dialog3 = ((DialogFragment) this).read;
        if (dialog3 != null) {
            int i3 = invalidateMenu + 57;
            onMenuItemSelected = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                dialog3.getWindow();
                throw null;
            }
            Window window2 = dialog3.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
                window2.setDimAmount(0.0f);
            }
        }
        int i4 = onMenuItemSelected + 75;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(22, this), true, -2032469611)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onMenuItemSelected + 65;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
