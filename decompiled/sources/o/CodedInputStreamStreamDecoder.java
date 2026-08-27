package o;

import com.huawei.location.gwi.util.GwiErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedInputStreamStreamDecoder {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public CodedInputStreamStreamDecoder(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("DispatcherChatPushMessagingData(channelUrl=", this.RemoteActionCompatParcelizer, ", message=", this.read, ")");
        int i4 = IconCompatParcelizer + 115;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode() >> (this.RemoteActionCompatParcelizer.hashCode() * GwiErrorCode.ALG_LIBRARY_NOT_EXIST);
        }
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof CodedInputStreamStreamDecoder)) {
                return false;
            }
            CodedInputStreamStreamDecoder codedInputStreamStreamDecoder = (CodedInputStreamStreamDecoder) obj;
            if (!this.RemoteActionCompatParcelizer.equals(codedInputStreamStreamDecoder.RemoteActionCompatParcelizer) || !this.read.equals(codedInputStreamStreamDecoder.read)) {
                return false;
            }
        }
        int i3 = IconCompatParcelizer + 103;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
