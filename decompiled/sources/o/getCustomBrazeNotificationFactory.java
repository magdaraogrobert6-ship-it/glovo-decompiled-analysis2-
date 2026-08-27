package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Policy$Companion;
import kotlinx.serialization.Serializable;
import o.getContentCardsLastUpdatedInSecondsFromEpochlambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "policy")
public final class getCustomBrazeNotificationFactory extends getContentCardCountlambda0 {
    public static final StartWorkingComponent$Policy$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Policy$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 27;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getContentCardsLastUpdatedInSecondsFromEpochlambda0.write;
            }
            int i3 = 67 / 0;
            return getContentCardsLastUpdatedInSecondsFromEpochlambda0.write;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String key;
    public final getApiEndpoint label;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Policy$Companion] */
    static {
        int i = serializer + 99;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getCustomBrazeNotificationFactory(int i, String str, getApiEndpoint getapiendpoint) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = getapiendpoint;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getContentCardsLastUpdatedInSecondsFromEpochlambda0.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.label.hashCode() >>> (this.key.hashCode() >> 116);
        }
        return (this.key.hashCode() * 31) + this.label.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Policy(key=" + this.key + ", label=" + this.label + ")";
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getCustomBrazeNotificationFactory) {
                getCustomBrazeNotificationFactory getcustombrazenotificationfactory = (getCustomBrazeNotificationFactory) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, getcustombrazenotificationfactory.key}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, getcustombrazenotificationfactory.label}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = read + 61;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                int i3 = RemoteActionCompatParcelizer + 113;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 != 0;
            }
            int i4 = RemoteActionCompatParcelizer + 95;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 83;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
