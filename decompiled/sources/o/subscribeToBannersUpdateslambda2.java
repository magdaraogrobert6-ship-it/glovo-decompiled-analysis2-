package o;

import com.roadrunner.user.properties.data.UserPropertiesRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToBannersUpdateslambda2 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final UserPropertiesRepository write;

    public subscribeToBannersUpdateslambda2(UserPropertiesRepository userPropertiesRepository) {
        this.write = userPropertiesRepository;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        subscribeToBannersUpdateslambda30 subscribetobannersupdateslambda30 = (subscribeToBannersUpdateslambda30) this.write.write.get();
        if (subscribetobannersupdateslambda30 != null) {
            int i4 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return subscribetobannersupdateslambda30.contractType;
        }
        int i6 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
