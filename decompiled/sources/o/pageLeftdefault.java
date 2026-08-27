package o;

import com.huawei.location.Vw$Vw;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pageLeftdefault {
    private static int serializer = 0;
    private static int write = 1;
    public final Vw$Vw IconCompatParcelizer;
    public final getToggleableState read;

    public pageLeftdefault(Vw$Vw vw$Vw, getToggleableState gettoggleablestate) {
        vw$Vw.getClass();
        gettoggleablestate.getClass();
        this.IconCompatParcelizer = vw$Vw;
        this.read = gettoggleablestate;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[PHI: r1 r4
  0x0043: PHI (r1v12 o.getTraversalIndexdelegate) = (r1v10 o.getTraversalIndexdelegate), (r1v16 o.getTraversalIndexdelegate) binds: [B:10:0x0037, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r4v5 com.huawei.location.Vw$Vw) = (r4v1 com.huawei.location.Vw$Vw), (r4v12 com.huawei.location.Vw$Vw) binds: [B:10:0x0037, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean write(pageLeftdefault pageleftdefault) {
        Vw$Vw vw$Vw;
        getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer;
        int i = 2 % 2;
        if (((pageUp) pageleftdefault.read).RemoteActionCompatParcelizer()) {
            int i2 = serializer + 7;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                vw$Vw = pageleftdefault.IconCompatParcelizer;
                gettraversalindexdelegateRemoteActionCompatParcelizer = ((AuthRepository) vw$Vw.IconCompatParcelizer).serializer.RemoteActionCompatParcelizer();
                int i3 = 92 / 0;
                if (gettraversalindexdelegateRemoteActionCompatParcelizer == null) {
                    int i4 = write + 21;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else if (!((FirebaseRemoteConfigImpl) ((transferSessionPackageI) vw$Vw.serializer)).read() || (!gettraversalindexdelegateRemoteActionCompatParcelizer.shouldVerifyIdentityPostLogin)) {
                    return true;
                }
            } else {
                vw$Vw = pageleftdefault.IconCompatParcelizer;
                gettraversalindexdelegateRemoteActionCompatParcelizer = ((AuthRepository) vw$Vw.IconCompatParcelizer).serializer.RemoteActionCompatParcelizer();
                if (gettraversalindexdelegateRemoteActionCompatParcelizer != null) {
                    if (!((FirebaseRemoteConfigImpl) ((transferSessionPackageI) vw$Vw.serializer)).read()) {
                    }
                    return true;
                }
                int i6 = write + 21;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        return false;
    }
}
