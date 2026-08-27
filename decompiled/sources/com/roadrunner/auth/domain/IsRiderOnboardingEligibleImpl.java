package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getCieXyz;
import o.getSelecteddelegate;
import o.getTraversalIndexdelegate;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class IsRiderOnboardingEligibleImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final AuthRepository IconCompatParcelizer;

    public IsRiderOnboardingEligibleImpl(AuthRepository authRepository) {
        authRepository.getClass();
        this.IconCompatParcelizer = authRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getSelecteddelegate getselecteddelegate;
        boolean zBooleanValue;
        int i = 2 % 2;
        if (!(continuationImpl instanceof getSelecteddelegate)) {
            getselecteddelegate = new getSelecteddelegate(this, continuationImpl);
        } else {
            getselecteddelegate = (getSelecteddelegate) continuationImpl;
            int i2 = getselecteddelegate.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getselecteddelegate.read = i2 - Integer.MIN_VALUE;
            } else {
                getselecteddelegate = new getSelecteddelegate(this, continuationImpl);
            }
        }
        Object objRemoteActionCompatParcelizer = getselecteddelegate.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getselecteddelegate.read;
        if (i3 != 0) {
            int i4 = read + 37;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            getselecteddelegate.read = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.IconCompatParcelizer.serializer, getselecteddelegate}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                int i6 = read;
                int i7 = i6 + 51;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    throw null;
                }
                int i8 = i6 + 73;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
        if (gettraversalindexdelegate != null) {
            zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{gettraversalindexdelegate.isRiderOnboardingEligible, Boolean.TRUE}, getCieXyz.write())).booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
