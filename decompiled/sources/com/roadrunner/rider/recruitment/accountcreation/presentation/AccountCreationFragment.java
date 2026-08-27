package com.roadrunner.rider.recruitment.accountcreation.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import dagger.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.ActivityHandler41;
import o.AndroidUiFrameClock;
import o.BrazeExternalSyntheticLambda45;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.isAdapterPositionOnScreen;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.transferSessionPackageI;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountCreationFragment extends BaseInjectionDialogFragment {
    private static int onPanelClosed = 0;
    private static int onPictureInPictureUiStateChanged = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getNavigationEventDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;
    public AndroidUiFrameClock getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY initializeViewTreeOwners;
    public Lazy invalidateMenu;
    public FormBody.Builder onActivityResult;
    public final isAdapterPositionOnScreen onBackPressed;
    public Lazy onConfigurationChanged;
    public final isAdapterPositionOnScreen onCreate;
    public final isAdapterPositionOnScreen onCreatePanelMenu;
    public final isAdapterPositionOnScreen onMenuItemSelected;
    public transferSessionPackageI onMultiWindowModeChanged;
    public final ComponentRegistry$Builder onNewIntent;
    public BrazeExternalSyntheticLambda45 onPreparePanel;

    public AccountCreationFragment() {
        AccountCreationFragment$$ExternalSyntheticLambda0 accountCreationFragment$$ExternalSyntheticLambda0 = new AccountCreationFragment$$ExternalSyntheticLambda0(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(7, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(6, this)));
        this.onNewIntent = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(ActivityHandler41.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 22), accountCreationFragment$$ExternalSyntheticLambda0, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 23));
        this.onCreate = new isAdapterPositionOnScreen(new AccountCreationFragment$$ExternalSyntheticLambda0(this, 1));
        this.onCreatePanelMenu = new isAdapterPositionOnScreen(new AccountCreationFragment$$ExternalSyntheticLambda0(this, 2));
        this.onBackPressed = new isAdapterPositionOnScreen(new AccountCreationFragment$$ExternalSyntheticLambda0(this, 3));
        this.onMenuItemSelected = new isAdapterPositionOnScreen(new AccountCreationFragment$$ExternalSyntheticLambda0(this, 4));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPictureInPictureUiStateChanged + 57;
        onPanelClosed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            read(1, R.style.Theme_RoadRunner_Dialog_FullScreen);
        } else {
            super.onCreate(bundle);
            read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        }
        int i3 = onPanelClosed + 55;
        onPictureInPictureUiStateChanged = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        ((ActivityHandler41) this.onNewIntent.MediaSessionCompatResultReceiverWrapper()).write(((Number) this.onMenuItemSelected.MediaSessionCompatResultReceiverWrapper()).intValue(), (String) this.onCreate.MediaSessionCompatResultReceiverWrapper());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(9, this), true, -999421777)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onPictureInPictureUiStateChanged + 59;
        onPanelClosed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
