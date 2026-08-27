package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.inappnotifications.data.OpenUrlButtonAction$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setOnFlingListener;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "open_url")
public final class setEdgeEffectFactory extends releaseHorizontalGlow {
    public static final OpenUrlButtonAction$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.OpenUrlButtonAction$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 107;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setOnFlingListener setonflinglistener = setOnFlingListener.IconCompatParcelizer;
            int i4 = read + 103;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return setonflinglistener;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.OpenUrlButtonAction$Companion] */
    static {
        int i = read + 29;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setEdgeEffectFactory(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setOnFlingListener.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.url.hashCode();
        }
        int i3 = 12 / 0;
        return this.url.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("OpenUrlButtonAction(url=", this.url, ")");
        int i4 = write + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof setEdgeEffectFactory))) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, ((setEdgeEffectFactory) obj).url}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer + 31;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 51;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 97;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
