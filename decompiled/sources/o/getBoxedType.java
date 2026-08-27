package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.FileUrlPayload$Companion;
import kotlinx.serialization.Serializable;
import o.Utf8UnpairedSurrogateException;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getBoxedType {
    public static final FileUrlPayload$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.FileUrlPayload$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 55;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Utf8UnpairedSurrogateException utf8UnpairedSurrogateException = Utf8UnpairedSurrogateException.write;
            int i4 = serializer + 51;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return utf8UnpairedSurrogateException;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.FileUrlPayload$Companion] */
    static {
        int i = IconCompatParcelizer + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
        }
    }

    public /* synthetic */ getBoxedType(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, Utf8UnpairedSurrogateException.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.url.hashCode();
        }
        this.url.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("FileUrlPayload(url=", this.url, ")");
            int i3 = RemoteActionCompatParcelizer + 27;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 74 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("FileUrlPayload(url=", this.url, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 43;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof getBoxedType)) {
            return false;
        }
        Object[] objArr = {this.url, ((getBoxedType) obj).url};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = write + 93;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
