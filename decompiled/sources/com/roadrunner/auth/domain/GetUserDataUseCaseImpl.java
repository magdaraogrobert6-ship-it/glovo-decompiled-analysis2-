package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getCustomActionsdelegate;
import o.getImeActionannotations;
import o.getTraversalIndexdelegate;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class GetUserDataUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final AuthRepository read;
    public final getCustomActionsdelegate serializer;

    public GetUserDataUseCaseImpl(getCustomActionsdelegate getcustomactionsdelegate, AuthRepository authRepository) {
        getcustomactionsdelegate.getClass();
        authRepository.getClass();
        this.serializer = getcustomactionsdelegate;
        this.read = authRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getImeActionannotations getimeactionannotations;
        int i = 2 % 2;
        if (continuationImpl instanceof getImeActionannotations) {
            getimeactionannotations = (getImeActionannotations) continuationImpl;
            int i2 = getimeactionannotations.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getimeactionannotations.read = i2 - Integer.MIN_VALUE;
                int i3 = IconCompatParcelizer + 25;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                getimeactionannotations = new getImeActionannotations(this, continuationImpl);
            }
        } else {
            getimeactionannotations = new getImeActionannotations(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = getimeactionannotations.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getimeactionannotations.read;
        Object obj = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            getimeactionannotations.read = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.read.serializer, getimeactionannotations}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                int i6 = RemoteActionCompatParcelizer + 35;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            int i7 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        if (objRemoteActionCompatParcelizer != null) {
            return this.serializer.serializer((getTraversalIndexdelegate) objRemoteActionCompatParcelizer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("the value for auth data should not be null, isToken valid check before the invocation");
        return null;
    }
}
