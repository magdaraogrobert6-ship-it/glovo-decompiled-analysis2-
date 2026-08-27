package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import com.ui.common.widget.LoadingDialogFullScreen;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import o.AndroidIndirectPointerEvent_androidKt;
import o.applyLayoutFeatures;
import o.attachAllAnimationslambda00;
import o.createFromParcel;
import o.ddefault;
import o.div7Ah8Wj8;
import o.dlambda0;
import o.enableVerboseLogging;
import o.getBitmapui_graphics;
import o.isAppSetIdReadingEnabled;
import o.mergeJsonObjects;
import o.onViewAttachedToWindowlambda0;
import o.parseAnimatedVisibility;
import o.r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.removeNodeAtDepth;
import o.searchAnylambda00;
import o.setNativeShader;
import o.supportedSearch;
import o.toBitmapConfig1JJdX4A;
import o.transitionSearchlambda0;
import o.unsupportedSearch;
import o.unsupportedSearchlambda0;
import o.unsupportedSearchlambda1;
import o.unsupportedSearchlambda2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TransferChangeFragment$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ TransferChangeFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ TransferChangeFragment$$ExternalSyntheticLambda0(TransferChangeFragment transferChangeFragment, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = transferChangeFragment;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TransferChangeFragment transferChangeFragment = this.RemoteActionCompatParcelizer;
        NavHostFragment navHostFragment = null;
        if (i2 == 0) {
            getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
            getbitmapui_graphics.getClass();
            unsupportedSearchlambda2 unsupportedsearchlambda2 = transferChangeFragment.onConfigurationChanged;
            if (unsupportedsearchlambda2 != null) {
                DropShadowEffect dropShadowEffect = unsupportedsearchlambda2.write;
                return new TransferChangeViewModel((InitiateTransferChangeUseCase) ((AndroidIndirectPointerEvent_androidKt) dropShadowEffect.read).write(), (r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ) ((AndroidIndirectPointerEvent_androidKt) dropShadowEffect.RatingCompat).write(), (SignInDataStore) ((applyLayoutFeatures) dropShadowEffect.write).write(), (DeliveryConfirmationLoggerImpl) ((mergeJsonObjects) dropShadowEffect.serializer).write(), (parseAnimatedVisibility) ((mergeJsonObjects) dropShadowEffect.MediaDescriptionCompat).write(), getbitmapui_graphics, new SharedResourcePool(24));
            }
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        if (i2 != 1) {
            double dDoubleValue = ((Double) obj).doubleValue();
            TransferChangeViewModel transferChangeViewModelSerializer = transferChangeFragment.serializer();
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(transferChangeViewModelSerializer), null, null, new TransferChangeViewModel$onTransferChangeClick$1(transferChangeViewModelSerializer, ((supportedSearch) transferChangeFragment.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper()).write, dDoubleValue, null), 3);
            return createfromparcel;
        }
        attachAllAnimationslambda00 attachallanimationslambda00 = (attachAllAnimationslambda00) obj;
        attachallanimationslambda00.getClass();
        if (attachallanimationslambda00 instanceof unsupportedSearchlambda1) {
            div7Ah8Wj8 childFragmentManager = transferChangeFragment.getChildFragmentManager();
            childFragmentManager.getClass();
            LoadingDialogFullScreen loadingDialogFullScreenSerializer = enableVerboseLogging.serializer(childFragmentManager);
            div7Ah8Wj8 childFragmentManager2 = transferChangeFragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            loadingDialogFullScreenSerializer.serializer(childFragmentManager2);
            return createfromparcel;
        }
        if (attachallanimationslambda00 instanceof unsupportedSearch) {
            int i3 = read + 39;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            div7Ah8Wj8 childFragmentManager3 = transferChangeFragment.getChildFragmentManager();
            childFragmentManager3.getClass();
            enableVerboseLogging.serializer(childFragmentManager3).serializer();
            return createfromparcel;
        }
        if (attachallanimationslambda00 instanceof unsupportedSearchlambda0) {
            int i5 = serializer + 25;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                unsupportedSearchlambda0 unsupportedsearchlambda0 = (unsupportedSearchlambda0) attachallanimationslambda00;
                String str = unsupportedsearchlambda0.IconCompatParcelizer;
                ddefault ddefaultVar = unsupportedsearchlambda0.serializer;
                dlambda0 dlambda0Var = transferChangeFragment.getNavigationEventDispatcher;
                navHostFragment.hashCode();
                throw null;
            }
            unsupportedSearchlambda0 unsupportedsearchlambda1 = (unsupportedSearchlambda0) attachallanimationslambda00;
            String str2 = unsupportedsearchlambda1.IconCompatParcelizer;
            ddefault ddefaultVar2 = unsupportedsearchlambda1.serializer;
            dlambda0 dlambda0Var2 = transferChangeFragment.getNavigationEventDispatcher;
            if (dlambda0Var2 == null) {
                removeNodeAtDepth.serializer("snackbarManager");
                throw null;
            }
            View viewRequireView = transferChangeFragment.requireView();
            viewRequireView.getClass();
            r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var2, viewRequireView, str2, ddefaultVar2, 0, null, null, 56);
            return createfromparcel;
        }
        if (!(attachallanimationslambda00 instanceof transitionSearchlambda0)) {
            if (attachallanimationslambda00.equals(searchAnylambda00.read)) {
                transferChangeFragment.read(false, false);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("TransferChangeFragment_amount", ((transitionSearchlambda0) attachallanimationslambda00).read)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        transferChangeFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320), "TransferChangeFragment");
        Fragment parentFragment = transferChangeFragment.getParentFragment();
        if (parentFragment instanceof NavHostFragment) {
            int i6 = serializer + 113;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                navHostFragment.hashCode();
                throw null;
            }
            navHostFragment = (NavHostFragment) parentFragment;
        }
        if (navHostFragment != null) {
            navHostFragment.getParentFragment();
        }
        transferChangeFragment.serializer().IconCompatParcelizer();
        return createfromparcel;
    }
}
