package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.recentdeliveries.data.model.Tag$Companion;
import kotlinx.serialization.Serializable;
import o.readEventMetadataI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class readConfigFile {
    public static final Tag$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.Tag$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 61;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            readEventMetadataI readeventmetadatai = readEventMetadataI.serializer;
            int i4 = serializer + 113;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return readeventmetadatai;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String key;
    public final String label;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.Tag$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    public /* synthetic */ readConfigFile(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, readEventMetadataI.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = read + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tag(key=", this.key, ", label=", this.label, ")");
            int i3 = 60 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Tag(key=", this.key, ", label=", this.label, ")");
        }
        int i4 = serializer + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.label.hashCode() - (this.key.hashCode() % 54);
        }
        return this.label.hashCode() + (this.key.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 5;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof readConfigFile) {
            readConfigFile readconfigfile = (readConfigFile) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, readconfigfile.key}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, readconfigfile.label}, getCieXyz.write())).booleanValue();
        }
        int i4 = read;
        int i5 = i4 + 15;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 47;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
