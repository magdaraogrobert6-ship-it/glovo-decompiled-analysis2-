package com.roadrunner.auth.injection;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.LocalAuthDataSource;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthPreferencesInjectionInitializer implements SemanticsInfo {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final Lazy read;

    public AuthPreferencesInjectionInitializer(Lazy lazy) {
        lazy.getClass();
        this.read = lazy;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {(LocalAuthDataSource) this.read.write(), shortNewsContentCardView};
        Object objRemoteActionCompatParcelizer = LocalAuthDataSource.RemoteActionCompatParcelizer(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1809255448, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), objArr, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1809255448);
        if (objRemoteActionCompatParcelizer == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objRemoteActionCompatParcelizer;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 3;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
