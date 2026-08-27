package com.roadrunner.auth.domain.token;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SemanticsPropertiesContentDescription1;
import o.pageUpdefault;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class IsUserSignedInImpl implements SemanticsPropertiesContentDescription1 {
    private static int serializer = 1;
    private static int write;
    public final AuthRepository IconCompatParcelizer;

    public IsUserSignedInImpl(AuthRepository authRepository) {
        authRepository.getClass();
        this.IconCompatParcelizer = authRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        pageUpdefault pageupdefault;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof pageUpdefault) {
            int i2 = write + 59;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((pageUpdefault) continuationImpl).serializer;
                obj.hashCode();
                throw null;
            }
            pageupdefault = (pageUpdefault) continuationImpl;
            int i4 = pageupdefault.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = serializer + 89;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                pageupdefault.serializer = i4 - Integer.MIN_VALUE;
            } else {
                pageupdefault = new pageUpdefault(this, continuationImpl);
            }
        } else {
            pageupdefault = new pageUpdefault(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = pageupdefault.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = pageupdefault.serializer;
        if (i7 != 0) {
            int i8 = write + 7;
            int i9 = i8 % Fields.SpotShadowColor;
            serializer = i9;
            int i10 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = i9 + 47;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                obj.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            pageupdefault.serializer = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.IconCompatParcelizer.serializer, pageupdefault}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                int i12 = serializer + 115;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
        }
        return Boolean.valueOf(objRemoteActionCompatParcelizer != null);
    }
}
