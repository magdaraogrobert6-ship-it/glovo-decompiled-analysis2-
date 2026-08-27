package o;

import io.reactivex.Completable;

/* JADX INFO: loaded from: classes3.dex */
public final class isEnabledI {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final getNeedsDensityui_text IconCompatParcelizer;
    public final lambdagdprForgetMe35 read;
    public final setOnEventTrackingSucceededListener serializer;

    public isEnabledI(lambdagdprForgetMe35 lambdagdprforgetme35, setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener, getNeedsDensityui_text getneedsdensityui_text) {
        this.read = lambdagdprforgetme35;
        this.serializer = setoneventtrackingsucceededlistener;
        this.IconCompatParcelizer = getneedsdensityui_text;
    }

    public final Completable read(String str, lambdagdprForgetMe34 lambdagdprforgetme34) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Completable completable = this.read.IconCompatParcelizer.read(str, lambdagdprforgetme34);
        int i4 = RemoteActionCompatParcelizer + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return completable;
        }
        throw null;
    }
}
