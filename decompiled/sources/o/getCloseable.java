package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion;
import kotlinx.serialization.Serializable;
import o.AudioAttributesCompat;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCloseable {
    public static final NestAutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 107;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AudioAttributesCompat audioAttributesCompat = AudioAttributesCompat.write;
            int i4 = write + 7;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return audioAttributesCompat;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String confirmButtonTitle;
    public final String message;
    public final String resumeButtonTitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$DialogMessage$Companion] */
    static {
        int i = serializer + 105;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 16 / 0;
        }
    }

    public /* synthetic */ getCloseable(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.title = str;
            this.message = str2;
            this.confirmButtonTitle = str3;
            this.resumeButtonTitle = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, AudioAttributesCompat.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DialogMessage(title=", this.title, ", message=", this.message, ", confirmButtonTitle="), this.confirmButtonTitle, ", resumeButtonTitle=", this.resumeButtonTitle, ")");
            int i3 = RemoteActionCompatParcelizer + 125;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DialogMessage(title=", this.title, ", message=", this.message, ", confirmButtonTitle="), this.confirmButtonTitle, ", resumeButtonTitle=", this.resumeButtonTitle, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.resumeButtonTitle.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.confirmButtonTitle);
        int i4 = RemoteActionCompatParcelizer + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 89;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof getCloseable) {
            getCloseable getcloseable = (getCloseable) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getcloseable.title}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, getcloseable.message}, getCieXyz.write())).booleanValue()) {
                    int i3 = read + 97;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmButtonTitle, getcloseable.confirmButtonTitle}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.resumeButtonTitle, getcloseable.resumeButtonTitle}, getCieXyz.write())).booleanValue();
            }
            int i5 = read + 25;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 19;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
