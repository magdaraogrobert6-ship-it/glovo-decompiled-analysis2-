package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getMaxTextLengthdelegate {
    private static int serializer = 0;
    private static int write = 1;
    public final AuthRepository IconCompatParcelizer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final getActionViewIntentlambda0 read;

    public getMaxTextLengthdelegate(AuthRepository authRepository, getActionViewIntentlambda0 getactionviewintentlambda0, transferSessionPackageI transfersessionpackagei) {
        authRepository.getClass();
        getactionviewintentlambda0.getClass();
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = authRepository;
        this.read = getactionviewintentlambda0;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public final boolean read() {
        int i = 2 % 2;
        getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = this.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer();
        if (gettraversalindexdelegateRemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            int i2 = write + 21;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        long j = gettraversalindexdelegateRemoteActionCompatParcelizer.expiresIn;
        this.read.getClass();
        if ((j - System.currentTimeMillis()) / 60000 >= ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer.write("access_token_expiry_minutes_buffer")) {
            return false;
        }
        int i4 = write;
        int i5 = i4 + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 21;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 21 / 0;
        }
        return true;
    }
}
