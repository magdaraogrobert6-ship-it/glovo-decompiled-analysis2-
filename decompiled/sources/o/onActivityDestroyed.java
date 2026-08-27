package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.BookSessionData$Companion;
import kotlinx.serialization.Serializable;
import o.onActivityPaused;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onActivityDestroyed {
    public static final BookSessionData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.BookSessionData$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 47;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onActivityPaused onactivitypaused = onActivityPaused.IconCompatParcelizer;
            int i4 = read + 83;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
            return onactivitypaused;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final BlockRunnercancel1 action;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.BookSessionData$Companion] */
    static {
        int i = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ onActivityDestroyed(int i, String str, String str2, BlockRunnercancel1 blockRunnercancel1) {
        if (7 == (i & 7)) {
            this.title = str;
            this.subtitle = str2;
            this.action = blockRunnercancel1;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, onActivityPaused.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.action.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        int i4 = serializer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = serializer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BookSessionData(title=", this.title, ", subtitle=", this.subtitle, ", action=");
            sbM.append(this.action);
            sbM.append(")");
            string = sbM.toString();
            int i3 = 47 / 0;
        } else {
            StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("BookSessionData(title=", this.title, ", subtitle=", this.subtitle, ", action=");
            sbM2.append(this.action);
            sbM2.append(")");
            string = sbM2.toString();
        }
        int i4 = serializer + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof onActivityDestroyed) {
            onActivityDestroyed onactivitydestroyed = (onActivityDestroyed) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, onactivitydestroyed.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, onactivitydestroyed.subtitle}, getCieXyz.write())).booleanValue())) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, onactivitydestroyed.action}, getCieXyz.write())).booleanValue();
            }
            int i2 = serializer + 41;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return false;
        }
        int i4 = serializer + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }
}
