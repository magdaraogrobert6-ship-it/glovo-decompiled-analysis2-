package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.unread_message_count.dto.UnreadMessageResponse$Companion;
import kotlinx.serialization.Serializable;
import o.Fragment;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DialogFragment3 {
    public static final UnreadMessageResponse$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.unread_message_count.dto.UnreadMessageResponse$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 109;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return Fragment.read;
            }
            Fragment fragment = Fragment.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final instantiate chat;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.unread_message_count.dto.UnreadMessageResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ DialogFragment3(int i, instantiate instantiateVar) {
        if (1 == (i & 1)) {
            this.chat = instantiateVar;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, Fragment.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.chat.hashCode();
        int i4 = read + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UnreadMessageResponse(chat=" + this.chat + ")";
        int i2 = read + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogFragment3)) {
            int i4 = i2 + 37;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr = {this.chat, ((DialogFragment3) obj).chat};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = serializer + 77;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
        return false;
    }
}
