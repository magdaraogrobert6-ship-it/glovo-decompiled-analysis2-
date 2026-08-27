package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.thrift.k$c;
import java.time.Clock;
import o.FoodoraMigrationException;
import o.accessgetCursorAnchorInfoControllerp;
import o.accessgetIcsp;
import o.accessgetOnEditCommandp;
import o.acquire;
import o.cancelPendingWebViewPause;
import o.copy3r_uNRQdefault;
import o.createFromParcel;
import o.div7Ah8Wj8;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getDoneeUduSuo;
import o.getQueryContext;
import o.getRearDisplayMetrics;
import o.getStateui;
import o.getTextAfterSelection;
import o.getTextBeforeSelection;
import o.getTransactionExecutor;
import o.isEditorFocused;
import o.mergeJsonObjects;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ContentSharingFragment$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ ContentSharingFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ ContentSharingFragment$$ExternalSyntheticLambda1(ContentSharingFragment contentSharingFragment, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = contentSharingFragment;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        final ContentSharingFragment contentSharingFragment = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) obj;
            getbitmapui_graphics.getClass();
            getStateui getstateui = contentSharingFragment.initializeViewTreeOwners;
            if (getstateui != null) {
                k$c k_c = getstateui.IconCompatParcelizer;
                return new isEditorFocused((Application) ((mergeJsonObjects) k_c.RemoteActionCompatParcelizer).write(), new getQueryContext(), (copy3r_uNRQdefault) ((acquire) k_c.write).write(), (setTransactionSuccessful) ((mergeJsonObjects) k_c.IconCompatParcelizer).write(), (H$b) ((acquire) k_c.read).write(), (getRearDisplayMetrics) ((mergeJsonObjects) k_c.serializer).write(), (Clock) ((mergeJsonObjects) k_c.MediaBrowserCompatMediaItem).write(), (getDoneeUduSuo) ((acquire) k_c.MediaSessionCompatQueueItem).write(), (transferSessionPackageI) ((mergeJsonObjects) k_c.MediaDescriptionCompat).write(), getbitmapui_graphics);
            }
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        getTextAfterSelection gettextafterselection = (getTextAfterSelection) obj;
        gettextafterselection.getClass();
        if (gettextafterselection instanceof accessgetCursorAnchorInfoControllerp) {
            int i3 = IconCompatParcelizer + 79;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ((getTransactionExecutor) contentSharingFragment.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).write();
            int i5 = read + 51;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (gettextafterselection instanceof accessgetIcsp) {
            accessgetIcsp accessgeticsp = (accessgetIcsp) gettextafterselection;
            String str = accessgeticsp.read;
            InAppCameraOverlay inAppCameraOverlay = accessgeticsp.RemoteActionCompatParcelizer;
            boolean z = accessgeticsp.serializer;
            FragmentActivity activity = contentSharingFragment.getActivity();
            if (activity != null) {
                InAppCameraArgs inAppCameraArgs = new InAppCameraArgs(str, inAppCameraOverlay, true, z);
                contentSharingFragment.getOnBackPressedDispatcher = true;
                if (contentSharingFragment.onConfigurationChanged == null) {
                    removeNodeAtDepth.serializer("inAppCameraNavigator");
                    throw null;
                }
                FoodoraMigrationException.RemoteActionCompatParcelizer(inAppCameraArgs).RemoteActionCompatParcelizer(activity.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                div7Ah8Wj8 supportFragmentManager = activity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                supportFragmentManager.read("InAppCameraWithTagsFragment_button_action", contentSharingFragment, new RetryWithDelay$$ExternalSyntheticLambda1(9, contentSharingFragment));
                supportFragmentManager.read("InAppCameraWithTagsFragment", contentSharingFragment, new ArrivalProgressObserver$$ExternalSyntheticLambda0(cancelpendingwebviewpause, 14, contentSharingFragment));
                supportFragmentManager.RemoteActionCompatParcelizer(new FragmentManager$FragmentLifecycleCallbacks() { // from class: com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment$openCamera$3
                    private static int IconCompatParcelizer = 0;
                    private static int serializer = 1;

                    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
                    public final void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, Fragment fragment) {
                        int i7 = 2 % 2;
                        int i8 = IconCompatParcelizer + 81;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        fragment.getClass();
                        Object[] objArr = {fragment.getTag(), "InAppCameraWithTagsFragment"};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            div7ah8wj8.read(this);
                            ContentSharingFragment contentSharingFragment2 = contentSharingFragment;
                            contentSharingFragment2.getOnBackPressedDispatcher = false;
                            if (cancelpendingwebviewpause.IconCompatParcelizer) {
                                return;
                            }
                            isEditorFocused iseditorfocusedSerializer = contentSharingFragment2.serializer();
                            if (iseditorfocusedSerializer.read.isEmpty()) {
                                int i10 = serializer + 53;
                                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                                if (i10 % 2 == 0) {
                                    iseditorfocusedSerializer.MediaDescriptionCompat.serializer(getTextBeforeSelection.read);
                                } else {
                                    iseditorfocusedSerializer.MediaDescriptionCompat.serializer(getTextBeforeSelection.read);
                                    throw null;
                                }
                            }
                        }
                    }
                }, false);
            }
        } else if (gettextafterselection instanceof accessgetOnEditCommandp) {
            String string = contentSharingFragment.requireArguments().getString("result_key");
            if (string == null) {
                contentSharingFragment.read(false, false);
            } else {
                contentSharingFragment.getParentFragmentManager().write(Bundle.EMPTY, string);
                contentSharingFragment.read(false, false);
            }
        } else {
            if (!(gettextafterselection instanceof getTextBeforeSelection)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i7 = read + 35;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                contentSharingFragment.read(false, true);
            } else {
                contentSharingFragment.read(false, false);
            }
        }
        return createFromParcel.INSTANCE;
    }
}
