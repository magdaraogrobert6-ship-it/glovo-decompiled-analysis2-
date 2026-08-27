package com.roadrunner.face.verification.presentation.identitypopup;

import androidx.lifecycle.ViewModel;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.login.logging.OtpLogger;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.SystemLifecycleSystemLifecycleCallback;
import o.getCieXyz;
import o.getQueryContext;
import o.removeNodeAtDepth;
import o.setStatusBarBackgroundResource;
import o.unpackY;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentityPopupViewModel extends ViewModel {
    public final OtpLogger IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final IdentityVerificationParams read;
    public final MutableStateFlow serializer;
    public final getQueryContext write;

    public IdentityPopupViewModel(getQueryContext getquerycontext, OtpLogger otpLogger, unpackY unpacky, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, IdentityVerificationParams identityVerificationParams) {
        getquerycontext.getClass();
        otpLogger.getClass();
        unpacky.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        identityVerificationParams.getClass();
        this.write = getquerycontext;
        this.IconCompatParcelizer = otpLogger;
        this.read = identityVerificationParams;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new setStatusBarBackgroundResource(unpacky.read.write().privacyPolicyUrl, !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{identityVerificationParams.read, "mid_shift"}, getCieXyz.write())).booleanValue()));
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.serializer = mutableStateFlow;
        systemLifecycleSystemLifecycleCallback.read();
    }
}
