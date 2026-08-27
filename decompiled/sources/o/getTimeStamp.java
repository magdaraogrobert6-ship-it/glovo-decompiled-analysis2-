package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.StartTutorialAction$Companion;
import kotlinx.serialization.Serializable;
import o.getMultiDexPreferences;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getTimeStamp {
    public static final StartTutorialAction$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.StartTutorialAction$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 121;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getMultiDexPreferences getmultidexpreferences = getMultiDexPreferences.serializer;
            int i4 = write + 117;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getmultidexpreferences;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String title;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.StartTutorialAction$Companion] */
    static {
        int i = IconCompatParcelizer + 13;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getTimeStamp(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.url = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getMultiDexPreferences.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StartTutorialAction(title=", this.title, ", url=", this.url, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StartTutorialAction(title=", this.title, ", url=", this.url, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.url.hashCode() / (this.title.hashCode() >>> 48);
        }
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 65;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getTimeStamp)) {
            return false;
        }
        getTimeStamp gettimestamp = (getTimeStamp) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, gettimestamp.title}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, gettimestamp.url}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 107;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 115;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
