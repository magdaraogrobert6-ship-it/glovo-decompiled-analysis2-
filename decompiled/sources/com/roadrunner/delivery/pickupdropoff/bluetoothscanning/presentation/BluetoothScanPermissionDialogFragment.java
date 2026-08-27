package com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation;

import android.annotation.SuppressLint;
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
import coil3.util.UtilsKt;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import o.DragAndDropTargetModifierNode;
import o.TextOverflowCompanion;
import o.buildRGBAExpression;
import o.internalInitInvalidationTracker;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
public final class BluetoothScanPermissionDialogFragment extends BaseInjectionDialogFragment {
    private static int onActivityResult = 1;
    private static int onBackPressed;
    public buildRGBAExpression getNavigationEventDispatcher;
    public TextOverflowCompanion getOnBackPressedDispatcher;
    public internalInitInvalidationTracker getSavedStateRegistry;

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = onActivityResult + 1;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onResume();
            throw null;
        }
        super.onResume();
        TextOverflowCompanion textOverflowCompanion = this.getOnBackPressedDispatcher;
        if (textOverflowCompanion == null) {
            removeNodeAtDepth.serializer("hasBluetoothPermission");
            throw null;
        }
        if (textOverflowCompanion.read()) {
            int i3 = onBackPressed + 9;
            onActivityResult = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                RemoteActionCompatParcelizer();
            } else {
                RemoteActionCompatParcelizer();
                int i4 = 55 / 0;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            int i2 = onBackPressed + 11;
            onActivityResult = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setDimAmount(0.5f);
                int i4 = onBackPressed + 33;
                onActivityResult = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(29, this), true, 2031129390)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 61;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return composeView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r2.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        o.removeNodeAtDepth.serializer("bluetoothScanPermissionLogger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r6 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onActivityResult + 33;
        com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onBackPressed = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
        r2.read();
        r6 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onBackPressed + 93;
        com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onActivityResult = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        o.removeNodeAtDepth.serializer("bluetoothScanPermissionLogger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r6 != false) goto L11;
     */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r6.getClass()
            super.onDismiss(r6)
            o.TextOverflowCompanion r6 = r5.getOnBackPressedDispatcher
            r1 = 0
            if (r6 == 0) goto L54
            int r2 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onBackPressed
            int r2 = r2 + 85
            int r3 = r2 % 128
            com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onActivityResult = r3
            int r2 = r2 % r0
            java.lang.String r3 = "bluetoothScanPermissionLogger"
            if (r2 != 0) goto L26
            boolean r6 = r6.read()
            o.buildRGBAExpression r2 = r5.getNavigationEventDispatcher
            int r4 = r0 / 0
            if (r6 == 0) goto L38
            goto L2e
        L26:
            boolean r6 = r6.read()
            o.buildRGBAExpression r2 = r5.getNavigationEventDispatcher
            if (r6 == 0) goto L38
        L2e:
            if (r2 == 0) goto L34
            r2.IconCompatParcelizer()
            return
        L34:
            o.removeNodeAtDepth.serializer(r3)
            throw r1
        L38:
            if (r2 == 0) goto L50
            int r6 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onActivityResult
            int r6 = r6 + 33
            int r1 = r6 % 128
            com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onBackPressed = r1
            int r6 = r6 % r0
            r2.read()
            int r6 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onBackPressed
            int r6 = r6 + 93
            int r1 = r6 % 128
            com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onActivityResult = r1
            int r6 = r6 % r0
            return
        L50:
            o.removeNodeAtDepth.serializer(r3)
            throw r1
        L54:
            java.lang.String r6 = "hasBluetoothPermission"
            o.removeNodeAtDepth.serializer(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment.onDismiss(android.content.DialogInterface):void");
    }
}
