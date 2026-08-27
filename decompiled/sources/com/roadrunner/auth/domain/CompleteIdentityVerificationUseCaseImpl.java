package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getCustomActionsdelegate;
import o.getEditableTextdelegate;
import o.getTraversalIndexdelegate;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class CompleteIdentityVerificationUseCaseImpl {
    private static int read = 1;
    private static int serializer;
    public final getCustomActionsdelegate IconCompatParcelizer;
    public final SaveAuthDataUseCase RemoteActionCompatParcelizer;
    public final AuthRepository write;

    public CompleteIdentityVerificationUseCaseImpl(AuthRepository authRepository, SaveAuthDataUseCase saveAuthDataUseCase, getCustomActionsdelegate getcustomactionsdelegate) {
        authRepository.getClass();
        saveAuthDataUseCase.getClass();
        getcustomactionsdelegate.getClass();
        this.write = authRepository;
        this.RemoteActionCompatParcelizer = saveAuthDataUseCase;
        this.IconCompatParcelizer = getcustomactionsdelegate;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getEditableTextdelegate geteditabletextdelegate;
        getTraversalIndexdelegate gettraversalindexdelegate;
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof getEditableTextdelegate) {
            geteditabletextdelegate = (getEditableTextdelegate) continuationImpl;
            int i4 = geteditabletextdelegate.read;
            if ((i4 & Integer.MIN_VALUE) == 0) {
                geteditabletextdelegate = new getEditableTextdelegate(this, continuationImpl);
            } else {
                int i5 = serializer + 23;
                read = i5 % Fields.SpotShadowColor;
                geteditabletextdelegate.read = i5 % 2 == 0 ? i4 - Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            }
        } else {
            geteditabletextdelegate = new getEditableTextdelegate(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = geteditabletextdelegate.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = geteditabletextdelegate.read;
        Object obj = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            geteditabletextdelegate.read = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, geteditabletextdelegate}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else if (i6 == 2) {
            int i7 = serializer + 43;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                gettraversalindexdelegate = geteditabletextdelegate.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            } else {
                getTraversalIndexdelegate gettraversalindexdelegate2 = geteditabletextdelegate.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                obj.hashCode();
                throw null;
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return this.IconCompatParcelizer.serializer(gettraversalindexdelegate);
        if (objRemoteActionCompatParcelizer != null) {
            getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = getTraversalIndexdelegate.RemoteActionCompatParcelizer((getTraversalIndexdelegate) objRemoteActionCompatParcelizer, null, null, 0L, false, null, null, null, null, null, 261887);
            geteditabletextdelegate.RemoteActionCompatParcelizer = gettraversalindexdelegateRemoteActionCompatParcelizer;
            geteditabletextdelegate.read = 2;
            if (this.RemoteActionCompatParcelizer.invoke(gettraversalindexdelegateRemoteActionCompatParcelizer, geteditabletextdelegate) != coroutineSingletons) {
                gettraversalindexdelegate = gettraversalindexdelegateRemoteActionCompatParcelizer;
                return this.IconCompatParcelizer.serializer(gettraversalindexdelegate);
            }
            return coroutineSingletons;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Auth data should not be null when completing ID verification flow");
        return null;
    }
}
