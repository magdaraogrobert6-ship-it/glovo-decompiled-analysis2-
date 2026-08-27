package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.InAppCameraWithTagsArgs;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.unaryMinusXSAIIZE;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraWithTagsFragment extends BaseInjectionDialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int initializeViewTreeOwners = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public InAppCameraWithTagsFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(16, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(6, new internalConicToQuadratics(5, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(unaryMinusXSAIIZE.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 21), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 22));
    }

    public final unaryMinusXSAIIZE serializer() {
        int i = 2 % 2;
        int i2 = getNavigationEventDispatcher + 21;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        unaryMinusXSAIIZE unaryminusxsaiize = (unaryMinusXSAIIZE) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
        int i4 = initializeViewTreeOwners + 99;
        getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return unaryminusxsaiize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, true, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(21, this), true, 377471688)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getNavigationEventDispatcher + 7;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return composeView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        Bundle arguments = getArguments();
        if (arguments == null) {
            Timber.RemoteActionCompatParcelizer.read("No arguments passed to PictureTaskWithTagsFragment", new Object[0]);
            read(false, false);
            return;
        }
        String string = arguments.getString("PictureTags");
        String string2 = arguments.getString("pictureOutputFilePath");
        InAppCameraWithTagsArgs inAppCameraWithTagsArgs = (InAppCameraWithTagsArgs) ((Parcelable) SQLite.read(arguments, "InAppCameraWithTagsFragmentArgs", InAppCameraWithTagsArgs.class));
        if (string != null) {
            int i2 = getNavigationEventDispatcher + 75;
            initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                serializer().serializer(string);
            }
        }
        if (string2 != null) {
            int i4 = initializeViewTreeOwners + 9;
            getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string2)) {
                Timber.RemoteActionCompatParcelizer.read("No arguments passed to PictureTaskWithTagsFragment", new Object[0]);
                read(false, false);
                int i6 = getNavigationEventDispatcher + 29;
                initializeViewTreeOwners = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                serializer().write(string2);
            }
        } else {
            Timber.RemoteActionCompatParcelizer.read("No arguments passed to PictureTaskWithTagsFragment", new Object[0]);
            read(false, false);
            int i8 = getNavigationEventDispatcher + 29;
            initializeViewTreeOwners = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (inAppCameraWithTagsArgs != null) {
            int i10 = initializeViewTreeOwners + 29;
            getNavigationEventDispatcher = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                serializer().write(inAppCameraWithTagsArgs);
            } else {
                serializer().write(inAppCameraWithTagsArgs);
                throw null;
            }
        }
    }
}
