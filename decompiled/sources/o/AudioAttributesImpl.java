package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion;
import kotlinx.serialization.Serializable;
import o.ModernAsyncTask1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AudioAttributesImpl {
    public static final NestAutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ModernAsyncTask1 modernAsyncTask1 = ModernAsyncTask1.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 43;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return modernAsyncTask1;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String body;
    public final String sound;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$PushMessage$Companion] */
    static {
        int i = write + 73;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    public /* synthetic */ AudioAttributesImpl(int i, String str, String str2, String str3) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.title = str;
            this.body = str2;
            if ((i & 4) == 0) {
                this.sound = null;
                int i2 = RemoteActionCompatParcelizer + 105;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 7 / 0;
                    return;
                }
                return;
            }
            this.sound = str3;
            int i4 = serializer + 43;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ModernAsyncTask1.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PushMessage(title=", this.title, ", body=", this.body, ", sound="), this.sound, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PushMessage(title=", this.title, ", body=", this.body, ", sound="), this.sound, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
        String str = this.sound;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 43;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 71;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AudioAttributesImpl) {
            AudioAttributesImpl audioAttributesImpl = (AudioAttributesImpl) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, audioAttributesImpl.title}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 57;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.body, audioAttributesImpl.body}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sound, audioAttributesImpl.sound}, getCieXyz.write())).booleanValue();
        }
        int i6 = serializer + 85;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
