package o;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class InputMethodManagerImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public static int read;
    public static int write;
    public final String IconCompatParcelizer;
    public final String serializer;

    public InputMethodManagerImpl(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Reason(id=", this.serializer, ", label=", this.IconCompatParcelizer, ")");
        int i4 = RemoteActionCompatParcelizer + 73;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() % (this.serializer.hashCode() >>> 43);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = MediaDescriptionCompat + 11;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 75;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof InputMethodManagerImpl) {
            InputMethodManagerImpl inputMethodManagerImpl = (InputMethodManagerImpl) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, inputMethodManagerImpl.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, inputMethodManagerImpl.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i4 = RemoteActionCompatParcelizer;
        int i5 = i4 + 73;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 71 / 0;
        }
        return false;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = write;
        int i2 = i % 7050981;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        read = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
