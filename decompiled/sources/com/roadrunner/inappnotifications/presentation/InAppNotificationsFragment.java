package com.roadrunner.inappnotifications.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import coil3.ComponentRegistry$Builder;
import coil3.util.ContextsKt;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryUUID;
import kotlin.LazyKt__LazyJVMKt;
import o.BrazeExternalSyntheticLambda45;
import o.DragAndDropTargetModifierNode;
import o.FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0;
import o.FocusRestorerElement;
import o.RecyclerView7;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.getDoubleOrNull;
import o.getOnExitannotations;
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.isAdapterPositionOnScreen;
import o.mergeJsonObjects;
import o.offsetChildrenVertical;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.registerAdapterDataObserver;
import o.removeNodeAtDepth;
import o.resetOutlineParams;
import o.setFocusRequester;
import o.setStateRestorationPolicy;
import o.setTransactionSuccessful;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationsFragment extends BaseInjectionDialogFragment {
    private static int onActivityResult = 0;
    private static int onConfigurationChanged = 1;
    public final isAdapterPositionOnScreen getNavigationEventDispatcher;
    public SendTestPushUseCase getOnBackPressedDispatcher;
    public setStateRestorationPolicy getSavedStateRegistry;
    public BrazeExternalSyntheticLambda45 initializeViewTreeOwners;
    public final ComponentRegistry$Builder invalidateMenu;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onBackPressed;

    public InAppNotificationsFragment() {
        final int i = 0;
        this.getNavigationEventDispatcher = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ InAppNotificationsFragment serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 33;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                InAppNotificationsFragment inAppNotificationsFragment = this.serializer;
                if (i5 != 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = inAppNotificationsFragment.onBackPressed;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                        removeNodeAtDepth.serializer("viewModelFactory");
                        throw null;
                    }
                    int i6 = IconCompatParcelizer + 101;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                setStateRestorationPolicy setstaterestorationpolicy = inAppNotificationsFragment.getSavedStateRegistry;
                if (setstaterestorationpolicy == null) {
                    removeNodeAtDepth.serializer("shareNavigatorFactory");
                    throw null;
                }
                Context contextRequireContext = inAppNotificationsFragment.requireContext();
                contextRequireContext.getClass();
                SignInDataStore signInDataStore = setstaterestorationpolicy.read;
                registerAdapterDataObserver registeradapterdataobserver = new registerAdapterDataObserver(contextRequireContext, (RecyclerView7) ((getDoubleOrNull) signInDataStore.serializer).write, (resetOutlineParams) ((mergeJsonObjects) signInDataStore.RemoteActionCompatParcelizer).write(), (setTransactionSuccessful) ((mergeJsonObjects) signInDataStore.read).write());
                int i8 = IconCompatParcelizer + 57;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return registeradapterdataobserver;
            }
        });
        final int i2 = 1;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment$$ExternalSyntheticLambda0
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ InAppNotificationsFragment serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IconCompatParcelizer + 33;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                InAppNotificationsFragment inAppNotificationsFragment = this.serializer;
                if (i6 != 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = inAppNotificationsFragment.onBackPressed;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                        removeNodeAtDepth.serializer("viewModelFactory");
                        throw null;
                    }
                    int i7 = IconCompatParcelizer + 101;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                setStateRestorationPolicy setstaterestorationpolicy = inAppNotificationsFragment.getSavedStateRegistry;
                if (setstaterestorationpolicy == null) {
                    removeNodeAtDepth.serializer("shareNavigatorFactory");
                    throw null;
                }
                Context contextRequireContext = inAppNotificationsFragment.requireContext();
                contextRequireContext.getClass();
                SignInDataStore signInDataStore = setstaterestorationpolicy.read;
                registerAdapterDataObserver registeradapterdataobserver = new registerAdapterDataObserver(contextRequireContext, (RecyclerView7) ((getDoubleOrNull) signInDataStore.serializer).write, (resetOutlineParams) ((mergeJsonObjects) signInDataStore.RemoteActionCompatParcelizer).write(), (setTransactionSuccessful) ((mergeJsonObjects) signInDataStore.read).write());
                int i9 = IconCompatParcelizer + 57;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return registeradapterdataobserver;
            }
        };
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(13, new internalConicToQuadratics(12, this)));
        this.invalidateMenu = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(offsetChildrenVertical.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 28), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 29));
    }

    public final offsetChildrenVertical serializer() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 95;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (offsetChildrenVertical) this.invalidateMenu.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        int i3 = onActivityResult + 15;
        onConfigurationChanged = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            super.onCreate(bundle);
            i = 1;
        } else {
            super.onCreate(bundle);
            i = 0;
        }
        read(i, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onConfigurationChanged + 11;
        onActivityResult = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        o.removeNodeAtDepth.serializer("shareResultReceiverManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r3 = requireActivity();
        r3.getClass();
        r1.read(r3);
        r1 = com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onActivityResult + 75;
        com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onConfigurationChanged = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onConfigurationChanged
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onActivityResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            super.onStart()
            com.roadrunner.diagnostics.domain.SendTestPushUseCase r1 = r4.getOnBackPressedDispatcher
            r3 = 67
            int r3 = r3 / 0
            if (r1 == 0) goto L39
            goto L22
        L1b:
            super.onStart()
            com.roadrunner.diagnostics.domain.SendTestPushUseCase r1 = r4.getOnBackPressedDispatcher
            if (r1 == 0) goto L39
        L22:
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            r3.getClass()
            r1.read(r3)
            int r1 = com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onActivityResult
            int r1 = r1 + 75
            int r3 = r1 % 128
            com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onConfigurationChanged = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L38
            return
        L38:
            throw r2
        L39:
            java.lang.String r0 = "shareResultReceiverManager"
            o.removeNodeAtDepth.serializer(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment.onStart():void");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        int i = 2 % 2;
        int i2 = onActivityResult + 55;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            SendTestPushUseCase sendTestPushUseCase = this.getOnBackPressedDispatcher;
            if (sendTestPushUseCase == null) {
                removeNodeAtDepth.serializer("shareResultReceiverManager");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.getClass();
            sendTestPushUseCase.IconCompatParcelizer(fragmentActivityRequireActivity);
            super.onStop();
            int i4 = onActivityResult + 79;
            onConfigurationChanged = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } catch (IllegalArgumentException e) {
            Timber.RemoteActionCompatParcelizer.serializer(e, "ShareResultReceiver already unregistered", new Object[0]);
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(26, this), true, -277015385)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onActivityResult + 61;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ContextsKt focusRestorerElement;
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i2 = 1;
        sharedResourcePoolRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment$$ExternalSyntheticLambda2
            private static int serializer = 1;
            private static int write;
            public final /* synthetic */ InAppNotificationsFragment read;

            {
                this.read = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
            
                if (r0 != null) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
            
                if (r0 != null) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
            
                r12 = android.net.Uri.parse(r12);
                r1 = r3.requireActivity();
                r1.getClass();
                r0.RemoteActionCompatParcelizer(r12, r1);
                r3.read(false, false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0159, code lost:
            
                o.removeNodeAtDepth.serializer("webNavigator");
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x015e, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
            
                return r2;
             */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 369
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment$$ExternalSyntheticLambda2.invoke(java.lang.Object):java.lang.Object");
            }
        });
        Dialog dialog = ((DialogFragment) this).read;
        final int i3 = 0;
        if (dialog != null) {
            int i4 = onActivityResult + 123;
            onConfigurationChanged = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                dialog.getWindow();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                SentryUUID.read(window, false);
                window.setStatusBarColor(0);
                FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 35) {
                    focusRestorerElement = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
                    int i6 = onConfigurationChanged + 99;
                    onActivityResult = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    focusRestorerElement = i5 >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
                }
                focusRestorerElement.write(false);
                if (Build.VERSION.SDK_INT >= 29) {
                    window.setStatusBarContrastEnforced(false);
                }
            }
        }
        LazyKt__LazyJVMKt.serializer(((ComponentDialog) y_()).getOnBackPressedDispatcher(), getViewLifecycleOwner(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment$$ExternalSyntheticLambda2
            private static int serializer = 1;
            private static int write;
            public final /* synthetic */ InAppNotificationsFragment read;

            {
                this.read = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
            
                if (r0 != null) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
            
                if (r0 != null) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
            
                r12 = android.net.Uri.parse(r12);
                r1 = r3.requireActivity();
                r1.getClass();
                r0.RemoteActionCompatParcelizer(r12, r1);
                r3.read(false, false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0159, code lost:
            
                o.removeNodeAtDepth.serializer("webNavigator");
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x015e, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
            
                return r2;
             */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 369
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment$$ExternalSyntheticLambda2.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }
}
