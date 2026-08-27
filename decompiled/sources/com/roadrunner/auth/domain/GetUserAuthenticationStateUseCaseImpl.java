package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getCustomActionsdelegate;
import o.getFillableDatadelegate;
import o.getIsContainer;
import o.getIsEditable;
import o.getIsPopup;
import o.getIsSensitiveData;
import o.getLinkTestMarker;
import o.getTextSelectionRange;
import o.getTraversalIndexdelegate;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetUserAuthenticationStateUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final transferSessionPackageI IconCompatParcelizer;
    public final getCustomActionsdelegate serializer;
    public final AuthRepository write;

    public GetUserAuthenticationStateUseCaseImpl(AuthRepository authRepository, getCustomActionsdelegate getcustomactionsdelegate, transferSessionPackageI transfersessionpackagei) {
        authRepository.getClass();
        getcustomactionsdelegate.getClass();
        transfersessionpackagei.getClass();
        this.write = authRepository;
        this.serializer = getcustomactionsdelegate;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getFillableDatadelegate getfillabledatadelegate;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 67;
        read = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = continuationImpl instanceof getFillableDatadelegate;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof getFillableDatadelegate) {
            int i4 = i2 + 15;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getfillabledatadelegate = (getFillableDatadelegate) continuationImpl;
            int i6 = getfillabledatadelegate.write;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                getfillabledatadelegate.write = i6 - Integer.MIN_VALUE;
            } else {
                getfillabledatadelegate = new getFillableDatadelegate(this, continuationImpl);
            }
        } else {
            getfillabledatadelegate = new getFillableDatadelegate(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = getfillabledatadelegate.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getfillabledatadelegate.write;
        boolean z2 = true;
        if (i7 != 0) {
            int i8 = read + 13;
            int i9 = i8 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i9;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i9 + 113;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            getfillabledatadelegate.write = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, getfillabledatadelegate}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
        if (gettraversalindexdelegate == null) {
            return getIsPopup.serializer;
        }
        if (gettraversalindexdelegate.shouldVerifyIdentityPostLogin) {
            int i12 = read + 45;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 96 / 0;
                if (((FirebaseRemoteConfigImpl) this.IconCompatParcelizer).read()) {
                    z2 = false;
                }
            } else if (((FirebaseRemoteConfigImpl) this.IconCompatParcelizer).read()) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        getTextSelectionRange gettextselectionrangeSerializer = this.serializer.serializer(gettraversalindexdelegate);
        if (gettraversalindexdelegate.isNewPasswordRequired) {
            return getIsEditable.serializer;
        }
        if (z2) {
            return new getIsSensitiveData(gettextselectionrangeSerializer, new getLinkTestMarker(gettextselectionrangeSerializer.MediaBrowserCompatMediaItem, gettextselectionrangeSerializer.ParcelableVolumeInfo));
        }
        getIsContainer getiscontainer = new getIsContainer(gettextselectionrangeSerializer);
        int i14 = read + 97;
        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            int i15 = 76 / 0;
        }
        return getiscontainer;
    }
}
