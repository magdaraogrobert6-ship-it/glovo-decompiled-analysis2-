package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Divider$Companion;
import kotlinx.serialization.Serializable;
import o.getConfiguredApiKey;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "divider")
public final class getConfigurationProviderSafelambda0 extends getContentCardCountlambda0 {
    public static final StartWorkingComponent$Divider$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Divider$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 73;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getConfiguredApiKey.IconCompatParcelizer;
            }
            getConfiguredApiKey getconfiguredapikey = getConfiguredApiKey.IconCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String key;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Divider$Companion] */
    static {
        int i = read + 97;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getConfigurationProviderSafelambda0(int i, String str) {
        if (1 == (i & 1)) {
            this.key = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getConfiguredApiKey.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.key.hashCode();
        int i4 = IconCompatParcelizer + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m("Divider(key=", this.key, ")");
            int i3 = 64 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("Divider(key=", this.key, ")");
        }
        int i4 = serializer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getConfigurationProviderSafelambda0) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, ((getConfigurationProviderSafelambda0) obj).key}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 33;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = IconCompatParcelizer + 107;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 115;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
