package com.foodora.courier.push.tokenregistery.data;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.single.SingleCreate;
import o.accessgetOldDependenciesSetp;
import o.handleThirdPartySharingCallbackI;
import o.r8lambdazY6FrfYmpvd_923yIbo0dPcgKo;

/* JADX INFO: loaded from: classes2.dex */
public final class GMSPushTokenProvider implements accessgetOldDependenciesSetp {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final handleThirdPartySharingCallbackI IconCompatParcelizer;
    public final r8lambdazY6FrfYmpvd_923yIbo0dPcgKo write;

    public GMSPushTokenProvider(handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, r8lambdazY6FrfYmpvd_923yIbo0dPcgKo r8lambdazy6frfympvd_923yibo0dpcgko) {
        this.IconCompatParcelizer = handlethirdpartysharingcallbacki;
        this.write = r8lambdazy6frfympvd_923yibo0dpcgko;
    }

    @Override // o.accessgetOldDependenciesSetp
    public final CompletableCreate read() {
        int i = 2 % 2;
        CompletableCreate completableCreate = new CompletableCreate(new GooglePlayLocationUtils$$ExternalSyntheticLambda18(this));
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return completableCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.accessgetOldDependenciesSetp
    public final SingleCreate RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        SingleCreate singleCreate = new SingleCreate(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(16, this));
        int i2 = RemoteActionCompatParcelizer + 13;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return singleCreate;
        }
        throw null;
    }
}
