package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class setParameterizedContent {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String read;
    public final Uri serializer;

    public setParameterizedContent(Uri uri, String str) {
        this.serializer = uri;
        this.read = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.read.hashCode() << (this.serializer.hashCode() * 45);
        } else {
            iHashCode = (this.serializer.hashCode() * 31) + this.read.hashCode();
        }
        int i3 = write + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Image(contentUri=" + this.serializer + ", absolutePath=" + this.read + ")";
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof setParameterizedContent) {
            setParameterizedContent setparameterizedcontent = (setParameterizedContent) obj;
            return this.serializer.equals(setparameterizedcontent.serializer) && this.read.equals(setparameterizedcontent.read);
        }
        int i4 = i3 + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
