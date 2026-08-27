package com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.NavArgsLazy;
import com.github.gcacace.signaturepad.views.SignaturePad;
import com.logistics.rider.glovo.R;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import o.accesssetDependencyp;
import o.displayInAppMessagelambda1;
import o.getImmutablePendingIntentFlags;
import o.getPositionInRoot;
import o.getSUPPRESSannotations;
import o.isAppSetIdReadingEnabled;
import o.nanosToMillis;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdad3KDFaViDQCaterPKviUURECBdQ;
import o.recreateDisplayListIfNeeded;
import o.removeNodeAtDepth;
import o.setNativeShader;
import o.setParameterizedContent;
import o.setParameterizedContentlambda0;
import o.setStateParametersdefault;
import o.takeOrElseitqla9I;
import o.times3ABfNKs;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerSignatureFragment extends BaseInjectionDialogFragment {
    private static int invalidateMenu = 0;
    private static int onConfigurationChanged = 1;
    public r8lambdad3KDFaViDQCaterPKviUURECBdQ getNavigationEventDispatcher;
    public long getOnBackPressedDispatcher;
    public accesssetDependencyp getSavedStateRegistry;
    public String onActivityResult = "";
    public final SendTestPushUseCase initializeViewTreeOwners = new SendTestPushUseCase(this);

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 39;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            this.getSavedStateRegistry = null;
        } else {
            super.onDestroyView();
            this.getSavedStateRegistry = null;
            int i3 = 46 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("FragmentCustomerSignatureBinding should not be null");
        r1 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.onConfigurationChanged + 33;
        com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.invalidateMenu = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.accesssetDependencyp serializer() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.invalidateMenu
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.onConfigurationChanged = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            o.accesssetDependencyp r1 = r3.getSavedStateRegistry
            r2 = 21
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            o.accesssetDependencyp r1 = r3.getSavedStateRegistry
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = "FragmentCustomerSignatureBinding should not be null"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r1)
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.onConfigurationChanged
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.invalidateMenu = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 != 0) goto L2e
            return r0
        L2e:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment.serializer():o.accesssetDependencyp");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = invalidateMenu + 123;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        accesssetDependencyp accesssetdependencyp = accesssetDependencyp.read(layoutInflater, viewGroup);
        this.getSavedStateRegistry = accesssetdependencyp;
        LinearLayout linearLayoutRemoteActionCompatParcelizer = accesssetdependencyp.RemoteActionCompatParcelizer();
        linearLayoutRemoteActionCompatParcelizer.getClass();
        int i4 = onConfigurationChanged + 75;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return linearLayoutRemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        takeOrElseitqla9I takeorelseitqla9i = (takeOrElseitqla9I) new NavArgsLazy(displayInAppMessagelambda1.serializer(takeOrElseitqla9I.class), new times3ABfNKs(this, 0)).MediaSessionCompatResultReceiverWrapper();
        this.getOnBackPressedDispatcher = takeorelseitqla9i.RemoteActionCompatParcelizer();
        this.onActivityResult = takeorelseitqla9i.IconCompatParcelizer();
        int i2 = onConfigurationChanged + 85;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        accesssetDependencyp accesssetdependencypSerializer = serializer();
        getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) accesssetdependencypSerializer.serializer;
        SignaturePad signaturePad = (SignaturePad) accesssetdependencypSerializer.write;
        getsuppressannotations.setEnabled(!signaturePad.read());
        ((getSUPPRESSannotations) accesssetdependencypSerializer.MediaSessionCompatQueueItem).setEnabled(!signaturePad.read());
        ((TextView) accesssetdependencypSerializer.IconCompatParcelizer).setText(((takeOrElseitqla9I) new NavArgsLazy(displayInAppMessagelambda1.serializer(takeOrElseitqla9I.class), new times3ABfNKs(this, 2)).MediaSessionCompatResultReceiverWrapper()).write());
        int i2 = onConfigurationChanged + 111;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        final int i2 = 1;
        ((getImmutablePendingIntentFlags) serializer().MediaBrowserCompatMediaItem).setTitle(((takeOrElseitqla9I) new NavArgsLazy(displayInAppMessagelambda1.serializer(takeOrElseitqla9I.class), new times3ABfNKs(this, i2)).MediaSessionCompatResultReceiverWrapper()).read());
        ((getImmutablePendingIntentFlags) serializer().MediaBrowserCompatMediaItem).setStartImageClickListener(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(13, this));
        ((SignaturePad) serializer().write).setOnSignedListener(this.initializeViewTreeOwners);
        MediaDescriptionCompat();
        final int i3 = 0;
        ((getSUPPRESSannotations) serializer().serializer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment$$ExternalSyntheticLambda1
            private static int read = 0;
            private static int write = 1;
            public final /* synthetic */ CustomerSignatureFragment RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws IOException {
                int i4 = 2 % 2;
                int i5 = read + 109;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = i3;
                CustomerSignatureFragment customerSignatureFragment = this.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    SignaturePad signaturePad = (SignaturePad) customerSignatureFragment.serializer().write;
                    signaturePad.RemoteActionCompatParcelizer();
                    signaturePad.MediaDescriptionCompat = Boolean.TRUE;
                    return;
                }
                r8lambdad3KDFaViDQCaterPKviUURECBdQ r8lambdad3kdfavidqcaterpkviuurecbdq = customerSignatureFragment.getNavigationEventDispatcher;
                if (r8lambdad3kdfavidqcaterpkviuurecbdq == null) {
                    removeNodeAtDepth.serializer("customerSignatureViewModel");
                    throw null;
                }
                long j = customerSignatureFragment.getOnBackPressedDispatcher;
                String str = customerSignatureFragment.onActivityResult;
                Bitmap signatureBitmap = ((SignaturePad) customerSignatureFragment.serializer().write).getSignatureBitmap();
                signatureBitmap.getClass();
                str.getClass();
                setStateParametersdefault setstateparametersdefault = ((nanosToMillis) r8lambdad3kdfavidqcaterpkviuurecbdq.serializer).IconCompatParcelizer;
                setstateparametersdefault.getClass();
                recreateDisplayListIfNeeded recreatedisplaylistifneeded = (recreateDisplayListIfNeeded) setstateparametersdefault.serializer;
                File fileIconCompatParcelizer = recreatedisplaylistifneeded.IconCompatParcelizer("JPEG_" + j);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(getPositionInRoot.write(new FileOutputStream(fileIconCompatParcelizer), fileIconCompatParcelizer));
                signatureBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                bufferedOutputStream.close();
                Uri uri = recreatedisplaylistifneeded.read(fileIconCompatParcelizer);
                String absolutePath = fileIconCompatParcelizer.getAbsolutePath();
                absolutePath.getClass();
                setstateparametersdefault.IconCompatParcelizer.put(new setParameterizedContentlambda0(j, str), new setParameterizedContent(uri, absolutePath));
                onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("CustomerSignatureFragment_uid", customerSignatureFragment.onActivityResult)};
                customerSignatureFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "CustomerSignatureFragment");
                List listIconCompatParcelizer = customerSignatureFragment.getParentFragmentManager().PlaybackStateCompatCustomAction.IconCompatParcelizer();
                listIconCompatParcelizer.getClass();
                Iterator it = listIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    it.next();
                    int i7 = read + 17;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                new Error("SignatureFragmentListener could not be found");
                forest.getClass();
                customerSignatureFragment.read(false, false);
            }
        });
        ((getSUPPRESSannotations) serializer().MediaSessionCompatQueueItem).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment$$ExternalSyntheticLambda1
            private static int read = 0;
            private static int write = 1;
            public final /* synthetic */ CustomerSignatureFragment RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws IOException {
                int i4 = 2 % 2;
                int i5 = read + 109;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    throw null;
                }
                int i6 = i2;
                CustomerSignatureFragment customerSignatureFragment = this.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    SignaturePad signaturePad = (SignaturePad) customerSignatureFragment.serializer().write;
                    signaturePad.RemoteActionCompatParcelizer();
                    signaturePad.MediaDescriptionCompat = Boolean.TRUE;
                    return;
                }
                r8lambdad3KDFaViDQCaterPKviUURECBdQ r8lambdad3kdfavidqcaterpkviuurecbdq = customerSignatureFragment.getNavigationEventDispatcher;
                if (r8lambdad3kdfavidqcaterpkviuurecbdq == null) {
                    removeNodeAtDepth.serializer("customerSignatureViewModel");
                    throw null;
                }
                long j = customerSignatureFragment.getOnBackPressedDispatcher;
                String str = customerSignatureFragment.onActivityResult;
                Bitmap signatureBitmap = ((SignaturePad) customerSignatureFragment.serializer().write).getSignatureBitmap();
                signatureBitmap.getClass();
                str.getClass();
                setStateParametersdefault setstateparametersdefault = ((nanosToMillis) r8lambdad3kdfavidqcaterpkviuurecbdq.serializer).IconCompatParcelizer;
                setstateparametersdefault.getClass();
                recreateDisplayListIfNeeded recreatedisplaylistifneeded = (recreateDisplayListIfNeeded) setstateparametersdefault.serializer;
                File fileIconCompatParcelizer = recreatedisplaylistifneeded.IconCompatParcelizer("JPEG_" + j);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(getPositionInRoot.write(new FileOutputStream(fileIconCompatParcelizer), fileIconCompatParcelizer));
                signatureBitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                bufferedOutputStream.close();
                Uri uri = recreatedisplaylistifneeded.read(fileIconCompatParcelizer);
                String absolutePath = fileIconCompatParcelizer.getAbsolutePath();
                absolutePath.getClass();
                setstateparametersdefault.IconCompatParcelizer.put(new setParameterizedContentlambda0(j, str), new setParameterizedContent(uri, absolutePath));
                onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("CustomerSignatureFragment_uid", customerSignatureFragment.onActivityResult)};
                customerSignatureFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), "CustomerSignatureFragment");
                List listIconCompatParcelizer = customerSignatureFragment.getParentFragmentManager().PlaybackStateCompatCustomAction.IconCompatParcelizer();
                listIconCompatParcelizer.getClass();
                Iterator it = listIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    it.next();
                    int i7 = read + 17;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                new Error("SignatureFragmentListener could not be found");
                forest.getClass();
                customerSignatureFragment.read(false, false);
            }
        });
        int i4 = invalidateMenu + 91;
        onConfigurationChanged = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
