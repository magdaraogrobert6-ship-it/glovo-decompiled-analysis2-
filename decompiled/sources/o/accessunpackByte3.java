package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class accessunpackByte3 {
    private static int serializer = 1;
    private static int write;
    public final GraphicsLayerCompanion IconCompatParcelizer;
    public final performViewCreated RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;

    public accessunpackByte3(GraphicsLayerCompanion graphicsLayerCompanion, performViewCreated performviewcreated, transferSessionPackageI transfersessionpackagei) {
        this.RemoteActionCompatParcelizer = performviewcreated;
        this.read = transfersessionpackagei;
        this.IconCompatParcelizer = graphicsLayerCompanion;
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer.serializer();
            obj.hashCode();
            throw null;
        }
        if (!this.RemoteActionCompatParcelizer.serializer()) {
            return false;
        }
        int i3 = serializer + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) this.read, updateAdidI.IS_TURN_BY_TURN_SETTINGS_M1_ENABLED})).booleanValue();
            throw null;
        }
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) this.read, updateAdidI.IS_TURN_BY_TURN_SETTINGS_M1_ENABLED})).booleanValue()) {
            return ((accesspackBytes) ((Gen2FunWithFlagsConfigRepository) this.IconCompatParcelizer.write).serializer(isSpecifiedCZqVlQIannotations.IconCompatParcelizer, displayInAppMessagelambda1.serializer(accesspackBytes.class))) == accesspackBytes.TREATMENT_1;
        }
        return false;
    }
}
