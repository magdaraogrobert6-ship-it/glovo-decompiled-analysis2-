package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveBulletTextUnitToPxo2QH7mI {
    private static int read = 0;
    private static int write = 1;
    public final performViewCreated IconCompatParcelizer;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final GraphicsLayerCompanion serializer;

    public resolveBulletTextUnitToPxo2QH7mI(GraphicsLayerCompanion graphicsLayerCompanion, performViewCreated performviewcreated, transferSessionPackageI transfersessionpackagei) {
        this.serializer = graphicsLayerCompanion;
        this.IconCompatParcelizer = performviewcreated;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!this.IconCompatParcelizer.serializer()) {
            return false;
        }
        int i4 = read + 19;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str == null) {
            return false;
        }
        if (!m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TURN_BY_TURN_ROUTE_PREVIEW_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl)) {
            return false;
        }
        int i6 = read + 67;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i6 % 2 == 0) {
            createLetterSpacingSpaneAf_CNQ createletterspacingspaneaf_cnq = createLetterSpacingSpaneAf_CNQ.TREATMENT_1;
            obj.hashCode();
            throw null;
        }
        if (((createLetterSpacingSpaneAf_CNQ) ((Gen2FunWithFlagsConfigRepository) this.serializer.write).serializer(flattenFontStylesAndApply.write, displayInAppMessagelambda1.serializer(createLetterSpacingSpaneAf_CNQ.class))) != createLetterSpacingSpaneAf_CNQ.TREATMENT_1) {
            return false;
        }
        int i7 = write + 89;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
