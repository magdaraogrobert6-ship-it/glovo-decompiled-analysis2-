package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("translation_supported")
    private final boolean translationSupported;

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 37;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.chatId;
        int i4 = i2 + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.translationSupported) << (this.chatId.hashCode() % 104);
        } else {
            iHashCode = (this.chatId.hashCode() * 31) + Boolean.hashCode(this.translationSupported);
        }
        int i3 = RemoteActionCompatParcelizer + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc)) {
            int i4 = i2 + 125;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
            return false;
        }
        r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc r8lambdaoa8jwbfvbepaycql3z8wzziuuc = (r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc) obj;
        Object[] objArr = {this.chatId, r8lambdaoa8jwbfvbepaycql3z8wzziuuc.chatId};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 99;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.translationSupported == r8lambdaoa8jwbfvbepaycql3z8wzziuuc.translationSupported) {
            return true;
        }
        int i8 = read + 7;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GetChatIdEndpointResponse(chatId=" + this.chatId + ", translationSupported=" + this.translationSupported + ")";
        int i2 = read + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return str;
    }
}
