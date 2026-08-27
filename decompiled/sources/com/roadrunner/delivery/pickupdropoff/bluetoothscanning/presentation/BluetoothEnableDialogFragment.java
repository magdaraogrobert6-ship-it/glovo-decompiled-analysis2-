package com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation;

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
import o.getEllipsisgIe3tQ8annotations;
import o.getSubpixelTextPositioningui_text;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BluetoothEnableDialogFragment extends BaseInjectionDialogFragment {
    private static int getSavedStateRegistry = 0;
    private static int initializeViewTreeOwners = 1;
    public getSubpixelTextPositioningui_text getNavigationEventDispatcher;
    public getEllipsisgIe3tQ8annotations getOnBackPressedDispatcher;

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 85;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onResume();
            obj.hashCode();
            throw null;
        }
        super.onResume();
        getEllipsisgIe3tQ8annotations getellipsisgie3tq8annotations = this.getOnBackPressedDispatcher;
        if (getellipsisgie3tq8annotations == null) {
            removeNodeAtDepth.serializer("isBluetoothEnabled");
            throw null;
        }
        int i3 = getSavedStateRegistry + 87;
        initializeViewTreeOwners = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (getellipsisgie3tq8annotations.RemoteActionCompatParcelizer()) {
            RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v5 android.app.Dialog) = (r1v4 android.app.Dialog), (r1v13 android.app.Dialog) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        Window window;
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 51;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onStart();
            dialog = ((DialogFragment) this).read;
            int i3 = 65 / 0;
            if (dialog != null) {
                window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setDimAmount(0.5f);
                    int i4 = getSavedStateRegistry + 85;
                    initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
            }
        } else {
            super.onStart();
            dialog = ((DialogFragment) this).read;
            if (dialog != null) {
                window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setDimAmount(0.5f);
                    int i6 = getSavedStateRegistry + 85;
                    initializeViewTreeOwners = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }
        }
        int i8 = getSavedStateRegistry + 51;
        initializeViewTreeOwners = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(28, this), true, -264076608)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 37;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return composeView;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r6 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r2.serializer.logEvent("ble_bluetooth_enabled", null);
        r6 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.initializeViewTreeOwners + 85;
        com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.getSavedStateRegistry = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if ((r6 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        o.removeNodeAtDepth.serializer("bleEventLogger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r2.serializer.logEvent("ble_bluetooth_disabled", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        o.removeNodeAtDepth.serializer("bleEventLogger");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
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
            int r1 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.initializeViewTreeOwners
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.getSavedStateRegistry = r2
            int r1 = r1 % r0
            r6.getClass()
            super.onDismiss(r6)
            o.getEllipsisgIe3tQ8annotations r6 = r5.getOnBackPressedDispatcher
            r1 = 0
            if (r6 == 0) goto L64
            int r2 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.getSavedStateRegistry
            int r2 = r2 + 95
            int r3 = r2 % 128
            com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.initializeViewTreeOwners = r3
            int r2 = r2 % r0
            java.lang.String r3 = "bleEventLogger"
            if (r2 != 0) goto L31
            boolean r6 = r6.RemoteActionCompatParcelizer()
            o.getSubpixelTextPositioningui_text r2 = r5.getNavigationEventDispatcher
            r4 = 88
            int r4 = r4 / 0
            if (r6 == 0) goto L56
            goto L39
        L31:
            boolean r6 = r6.RemoteActionCompatParcelizer()
            o.getSubpixelTextPositioningui_text r2 = r5.getNavigationEventDispatcher
            if (r6 == 0) goto L56
        L39:
            if (r2 == 0) goto L52
            o.decode r6 = r2.serializer
            java.lang.String r2 = "ble_bluetooth_enabled"
            r6.logEvent(r2, r1)
            int r6 = com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.initializeViewTreeOwners
            int r6 = r6 + 85
            int r2 = r6 % 128
            com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.getSavedStateRegistry = r2
            int r6 = r6 % r0
            if (r6 != 0) goto L4e
            return
        L4e:
            r1.hashCode()
            throw r1
        L52:
            o.removeNodeAtDepth.serializer(r3)
            throw r1
        L56:
            if (r2 == 0) goto L60
            o.decode r6 = r2.serializer
            java.lang.String r0 = "ble_bluetooth_disabled"
            r6.logEvent(r0, r1)
            return
        L60:
            o.removeNodeAtDepth.serializer(r3)
            throw r1
        L64:
            java.lang.String r6 = "isBluetoothEnabled"
            o.removeNodeAtDepth.serializer(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment.onDismiss(android.content.DialogInterface):void");
    }
}
