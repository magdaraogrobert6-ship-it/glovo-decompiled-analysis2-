package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.bridge.ErrorResponse$Companion;
import kotlinx.serialization.Serializable;
import o.UnknownFieldSchema;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UninitializedMessageException {
    public static final ErrorResponse$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.ErrorResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 35;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            UnknownFieldSchema unknownFieldSchema = UnknownFieldSchema.serializer;
            int i4 = IconCompatParcelizer + 65;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return unknownFieldSchema;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String description;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.ErrorResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 121;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ UninitializedMessageException(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.type = str;
            this.description = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, UnknownFieldSchema.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ErrorResponse(type=", this.type, ", description=", this.description, ")");
        int i4 = RemoteActionCompatParcelizer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.description.hashCode() + (this.type.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public UninitializedMessageException(String str) {
        this.type = "HOST_ENCOUNTERED_ERROR";
        this.description = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof UninitializedMessageException) {
                UninitializedMessageException uninitializedMessageException = (UninitializedMessageException) obj;
                Object[] objArr = {this.type, uninitializedMessageException.type};
                Object obj2 = null;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.description, uninitializedMessageException.description};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = RemoteActionCompatParcelizer + 105;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return false;
                    }
                    obj2.hashCode();
                    throw null;
                }
                int i3 = RemoteActionCompatParcelizer + 57;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            int i4 = read + 69;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 55;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
