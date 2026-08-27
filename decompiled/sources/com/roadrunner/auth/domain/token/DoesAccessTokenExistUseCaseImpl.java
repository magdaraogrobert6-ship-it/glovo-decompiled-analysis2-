package com.roadrunner.auth.domain.token;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onLongClickdefault;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class DoesAccessTokenExistUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final AuthRepository write;

    public DoesAccessTokenExistUseCaseImpl(AuthRepository authRepository) {
        authRepository.getClass();
        this.write = authRepository;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        onLongClickdefault onlongclickdefault;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof onLongClickdefault;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof onLongClickdefault) {
            onlongclickdefault = (onLongClickdefault) continuationImpl;
            int i3 = onlongclickdefault.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IconCompatParcelizer + 93;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    onlongclickdefault.RemoteActionCompatParcelizer = i3 << Integer.MIN_VALUE;
                } else {
                    onlongclickdefault.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
                }
            } else {
                onlongclickdefault = new onLongClickdefault(this, continuationImpl);
            }
        } else {
            onlongclickdefault = new onLongClickdefault(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = onlongclickdefault.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = onlongclickdefault.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 65 / 0;
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            onlongclickdefault.RemoteActionCompatParcelizer = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, onlongclickdefault}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                int i9 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        return Boolean.valueOf(objRemoteActionCompatParcelizer != null);
    }
}
