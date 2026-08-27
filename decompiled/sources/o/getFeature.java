package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getFeature {
    public static final HashMap RemoteActionCompatParcelizer;
    public static final HashMap read;

    static {
        HashMap map = new HashMap();
        read = map;
        HashMap map2 = new HashMap();
        RemoteActionCompatParcelizer = map2;
        getNetworkModule getnetworkmodule = TranslationsENABLEDCompanion.read;
        map.put("SHA-256", getnetworkmodule);
        getNetworkModule getnetworkmodule2 = TranslationsENABLEDCompanion.serializer;
        map.put("SHA-512", getnetworkmodule2);
        getNetworkModule getnetworkmodule3 = TranslationsENABLEDCompanion.MediaDescriptionCompat;
        map.put("SHAKE128", getnetworkmodule3);
        getNetworkModule getnetworkmodule4 = TranslationsENABLEDCompanion.MediaMetadataCompat;
        map.put("SHAKE256", getnetworkmodule4);
        map2.put(getnetworkmodule, "SHA-256");
        map2.put(getnetworkmodule2, "SHA-512");
        map2.put(getnetworkmodule3, "SHAKE128");
        map2.put(getnetworkmodule4, "SHAKE256");
    }

    public static CustomerChatModulestartChat2 RemoteActionCompatParcelizer(getNetworkModule getnetworkmodule) {
        if (getnetworkmodule.write(TranslationsENABLEDCompanion.read)) {
            return new Contact();
        }
        if (getnetworkmodule.write(TranslationsENABLEDCompanion.serializer)) {
            return new getEvent();
        }
        if (getnetworkmodule.write(TranslationsENABLEDCompanion.MediaDescriptionCompat)) {
            return new getFinancial(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        }
        if (getnetworkmodule.write(TranslationsENABLEDCompanion.MediaMetadataCompat)) {
            return new getFinancial(androidx.compose.ui.graphics.Fields.RotationX);
        }
        Gson$$ExternalSyntheticBUOutline0.m(getnetworkmodule, "unrecognized digest OID: ");
        return null;
    }

    public static getNetworkModule RemoteActionCompatParcelizer(String str) {
        getNetworkModule getnetworkmodule = (getNetworkModule) read.get(str);
        if (getnetworkmodule != null) {
            return getnetworkmodule;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("unrecognized digest name: ", str));
        return null;
    }
}
