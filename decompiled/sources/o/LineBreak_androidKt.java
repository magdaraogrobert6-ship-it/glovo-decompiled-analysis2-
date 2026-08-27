package o;

import android.content.SharedPreferences;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LineBreak_androidKt {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final transferSessionPackageI serializer;
    public final SharedPreferences write;

    public LineBreak_androidKt(setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei, SharedPreferences sharedPreferences) {
        this.serializer = transfersessionpackagei;
        this.write = sharedPreferences;
        this.RemoteActionCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_avoid_tolls);
        this.IconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_avoid_highways);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005d  */
    public final boolean IconCompatParcelizer() {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_TURN_BY_TURN_SETTINGS_M1_ENABLED};
        boolean zBooleanValue = ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), objArr)).booleanValue();
        boolean z2 = this.write.getBoolean(this.IconCompatParcelizer, firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer("turn_by_turn_avoidance_settings_default_value"));
        if (zBooleanValue) {
            int i4 = MediaMetadataCompat + 55;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("highways avoidance: avoid=" + z + ", toggle preference value=" + z2 + ", remote config avoidance settings enabled=" + zBooleanValue, new Object[0]);
        return z;
    }

    public final boolean serializer() {
        boolean z;
        int i = 2 % 2;
        int i2 = read + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_TURN_BY_TURN_SETTINGS_M1_ENABLED};
        boolean zBooleanValue = ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), objArr)).booleanValue();
        boolean z2 = this.write.getBoolean(this.RemoteActionCompatParcelizer, firebaseRemoteConfigImpl.IconCompatParcelizer.IconCompatParcelizer("turn_by_turn_avoidance_settings_default_value"));
        if (zBooleanValue && z2) {
            int i4 = read + 97;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("tolls avoidance: avoid=" + z + ", toggle preference value=" + z2 + ", remote config avoidance settings enabled=" + zBooleanValue, new Object[0]);
        return z;
    }
}
