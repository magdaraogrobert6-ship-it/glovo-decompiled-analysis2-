package o;

import com.roadrunner.realtime.domain.GetAppStateImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class nextmlRZEE implements AndroidQuery {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final GetAppStateImpl write;

    public nextmlRZEE(GetAppStateImpl getAppStateImpl) {
        this.write = getAppStateImpl;
    }

    public final bindTo write(GetAppStateImpl getAppStateImpl) {
        int i = 2 % 2;
        bindTo bindto = new bindTo(getAppStateImpl, (TransactionWithoutReturn) ((executeQuery) this.write.serializer).write());
        int i2 = RemoteActionCompatParcelizer + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bindto;
        }
        throw null;
    }
}
