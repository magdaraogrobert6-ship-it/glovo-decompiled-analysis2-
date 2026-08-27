package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getTraversalIndexdelegate;
import o.onLongClick;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class GetIdVerificationLocationsImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final AuthRepository read;

    public GetIdVerificationLocationsImpl(AuthRepository authRepository, int i) {
        if (i != 1) {
            authRepository.getClass();
            this.read = authRepository;
        } else {
            authRepository.getClass();
            this.read = authRepository;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object invoke(ContinuationImpl continuationImpl) {
        onLongClick onlongclick;
        int i = 2 % 2;
        int i2 = write + 31;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof onLongClick) {
            onlongclick = (onLongClick) continuationImpl;
            int i4 = onlongclick.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onlongclick.write = i4 - Integer.MIN_VALUE;
            } else {
                onlongclick = new onLongClick(this, continuationImpl);
            }
        } else {
            onlongclick = new onLongClick(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = onlongclick.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = onlongclick.write;
        if (i5 != 0) {
            int i6 = write;
            int i7 = i6 + 5;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i6 + 69;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            onlongclick.write = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.read.serializer, onlongclick}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
        if (gettraversalindexdelegate != null) {
            return new Long(gettraversalindexdelegate.expiresIn);
        }
        return null;
    }
}
