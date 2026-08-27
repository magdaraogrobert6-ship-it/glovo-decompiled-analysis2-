package com.roadrunner.auth.domain.token;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.LocalAuthDataSource;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getTraversalIndexdelegate;
import o.isItemDismissable;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAccessTokenUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static int read;
    public static int serializer;
    public final AuthRepository write;

    public GetAccessTokenUseCaseImpl(AuthRepository authRepository) {
        authRepository.getClass();
        this.write = authRepository;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Serializable m4873invokeIoAF18A(ContinuationImpl continuationImpl) {
        GetAccessTokenUseCaseImpl$invoke$1 getAccessTokenUseCaseImpl$invoke$1;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof GetAccessTokenUseCaseImpl$invoke$1) {
            getAccessTokenUseCaseImpl$invoke$1 = (GetAccessTokenUseCaseImpl$invoke$1) continuationImpl;
            int i4 = getAccessTokenUseCaseImpl$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 51;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    getAccessTokenUseCaseImpl$invoke$1.read = i4 >> Integer.MIN_VALUE;
                } else {
                    getAccessTokenUseCaseImpl$invoke$1.read = i4 - Integer.MIN_VALUE;
                }
            } else {
                getAccessTokenUseCaseImpl$invoke$1 = new GetAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
                int i6 = RemoteActionCompatParcelizer + 107;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            getAccessTokenUseCaseImpl$invoke$1 = new GetAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
            int i8 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        Object objRemoteActionCompatParcelizer = getAccessTokenUseCaseImpl$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = getAccessTokenUseCaseImpl$invoke$1.read;
        String str = null;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            getAccessTokenUseCaseImpl$invoke$1.read = 1;
            objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{this.write.serializer, getAccessTokenUseCaseImpl$invoke$1}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            int i11 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) objRemoteActionCompatParcelizer;
        if (gettraversalindexdelegate != null) {
            int i13 = RemoteActionCompatParcelizer + 23;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            str = gettraversalindexdelegate.accessToken;
        }
        return str != null ? str : new isItemDismissable(new IllegalArgumentException("Access token is null or auth data missing"));
    }

    public static int serializer() {
        int i = read;
        int i2 = i % 5922080;
        read = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        serializer = i3;
        return i3;
    }
}
