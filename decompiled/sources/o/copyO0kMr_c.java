package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class copyO0kMr_c {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final transferSessionPackageI IconCompatParcelizer;
    public final getSoftWrap write;

    public copyO0kMr_c(transferSessionPackageI transfersessionpackagei, getSoftWrap getsoftwrap) {
        transfersessionpackagei.getClass();
        getsoftwrap.getClass();
        this.IconCompatParcelizer = transfersessionpackagei;
        this.write = getsoftwrap;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
        String str = firebaseRemoteConfigImpl.read.read();
        Object obj = null;
        if (str != null) {
            if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_BACK_TO_BACK_ORDERS_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl)) {
                int i2 = read + 81;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    TextLayoutResult textLayoutResult = TextLayoutResult.TREATMENT_1;
                    obj.hashCode();
                    throw null;
                }
                if (((TextLayoutResult) ((Gen2FunWithFlagsConfigRepository) this.write.write).serializer(getStyle.IconCompatParcelizer, displayInAppMessagelambda1.serializer(TextLayoutResult.class))) == TextLayoutResult.TREATMENT_1) {
                    return true;
                }
            }
        }
        int i3 = RemoteActionCompatParcelizer + 31;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }
}
