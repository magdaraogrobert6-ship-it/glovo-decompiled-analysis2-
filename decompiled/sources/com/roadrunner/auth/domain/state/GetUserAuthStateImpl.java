package com.roadrunner.auth.domain.state;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import o.onFillData;

/* JADX INFO: loaded from: classes3.dex */
public final class GetUserAuthStateImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final AuthRepository RemoteActionCompatParcelizer;
    public final IsUserAuthenticatedWrapper read;

    public GetUserAuthStateImpl(AuthRepository authRepository, IsUserAuthenticatedWrapper isUserAuthenticatedWrapper) {
        authRepository.getClass();
        isUserAuthenticatedWrapper.getClass();
        this.RemoteActionCompatParcelizer = authRepository;
        this.read = isUserAuthenticatedWrapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object invoke(ContinuationImpl continuationImpl) throws Throwable {
        onFillData onfilldata;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof onFillData) {
            onfilldata = (onFillData) continuationImpl;
            int i4 = onfilldata.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onfilldata.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                onfilldata = new onFillData(this, continuationImpl);
            }
        } else {
            onfilldata = new onFillData(this, continuationImpl);
        }
        Object authDataObservable = onfilldata.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = onfilldata.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(authDataObservable);
            onfilldata.IconCompatParcelizer = 1;
            authDataObservable = this.RemoteActionCompatParcelizer.serializer.getAuthDataObservable(onfilldata);
            if (authDataObservable == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = write + 125;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                Object obj = null;
                if (i6 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i7 = write + 21;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(authDataObservable);
        }
        return new SignInDataStore$get$$inlined$map$1((Flow) authDataObservable, this, 3);
    }
}
