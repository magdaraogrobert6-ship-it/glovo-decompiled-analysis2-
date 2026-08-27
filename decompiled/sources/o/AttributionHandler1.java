package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributionHandler1 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final transferSessionPackageI read;
    public final verifyAndTrackPlayStorePurchaseI write;

    public AttributionHandler1(transferSessionPackageI transfersessionpackagei, verifyAndTrackPlayStorePurchaseI verifyandtrackplaystorepurchasei) {
        this.write = verifyandtrackplaystorepurchasei;
        this.read = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
            if (((FirebaseRemoteConfigImpl) this.read).IconCompatParcelizer(updateAdidI.IS_ON_DEMAND_QUICK_WINS_FLOATING_ITEM_ENABLED)) {
                if (((Gen2FunWithFlagsConfigRepository) this.write).serializer(onResponseDataCallback.read, displayInAppMessagelambda1.serializer(checkSessionResponse.class)) == checkSessionResponse.TREATMENT) {
                    int i4 = IconCompatParcelizer + 23;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else if (((FirebaseRemoteConfigImpl) this.read).IconCompatParcelizer(updateAdidI.IS_ON_DEMAND_QUICK_WINS_FLOATING_ITEM_ENABLED)) {
            if (((Gen2FunWithFlagsConfigRepository) this.write).serializer(onResponseDataCallback.read, displayInAppMessagelambda1.serializer(checkSessionResponse.class)) == checkSessionResponse.TREATMENT) {
                int i6 = IconCompatParcelizer + 23;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }
}
