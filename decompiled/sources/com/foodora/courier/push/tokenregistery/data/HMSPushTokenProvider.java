package com.foodora.courier.push.tokenregistery.data;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.single.SingleCreate;
import o.accessgetOldDependenciesSetp;
import o.getUptimeMillis;
import o.handleThirdPartySharingCallbackI;
import o.r8lambdazY6FrfYmpvd_923yIbo0dPcgKo;

/* JADX INFO: loaded from: classes2.dex */
public final class HMSPushTokenProvider implements accessgetOldDependenciesSetp {
    private static int read = 1;
    private static int serializer;
    public final r8lambdazY6FrfYmpvd_923yIbo0dPcgKo IconCompatParcelizer;
    public final Application RemoteActionCompatParcelizer;
    public final handleThirdPartySharingCallbackI write;

    public HMSPushTokenProvider(Application application, handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, r8lambdazY6FrfYmpvd_923yIbo0dPcgKo r8lambdazy6frfympvd_923yibo0dpcgko) {
        this.RemoteActionCompatParcelizer = application;
        this.write = handlethirdpartysharingcallbacki;
        this.IconCompatParcelizer = r8lambdazy6frfympvd_923yibo0dpcgko;
    }

    @Override // o.accessgetOldDependenciesSetp
    public final SingleCreate RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        SingleCreate singleCreate = new SingleCreate(new getUptimeMillis(this));
        int i2 = serializer + 71;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return singleCreate;
    }

    @Override // o.accessgetOldDependenciesSetp
    public final CompletableCreate read() {
        int i = 2 % 2;
        CompletableCreate completableCreate = new CompletableCreate(new getUptimeMillis(this));
        int i2 = serializer + 65;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return completableCreate;
    }
}
