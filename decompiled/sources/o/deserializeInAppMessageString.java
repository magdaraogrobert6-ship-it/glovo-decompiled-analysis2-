package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.vendor.review.data.entity.Tag$Companion;
import kotlinx.serialization.Serializable;
import o.dismissBanner;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class deserializeInAppMessageString {
    public static final Tag$Companion Companion = new Object() { // from class: com.roadrunner.vendor.review.data.entity.Tag$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 71;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return dismissBanner.write;
            }
            dismissBanner dismissbanner = dismissBanner.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String key;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.vendor.review.data.entity.Tag$Companion] */
    static {
        int i = serializer + 5;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ deserializeInAppMessageString(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.key = str;
            this.text = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, dismissBanner.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tag(key=", this.key, ", text=", this.text, ")");
            int i3 = RemoteActionCompatParcelizer + 99;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tag(key=", this.key, ", text=", this.text, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.text.hashCode() >> (this.key.hashCode() * 15);
        }
        return (this.key.hashCode() * 31) + this.text.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 35;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof deserializeInAppMessageString)) {
            return false;
        }
        deserializeInAppMessageString deserializeinappmessagestring = (deserializeInAppMessageString) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, deserializeinappmessagestring.key}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, deserializeinappmessagestring.text}, getCieXyz.write())).booleanValue();
    }
}
