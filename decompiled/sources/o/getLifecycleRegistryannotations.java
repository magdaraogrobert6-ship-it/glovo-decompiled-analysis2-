package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getLifecycleRegistryannotations {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final List IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.serializer;
        int i4 = i3 + 95;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final List RemoteActionCompatParcelizer() {
        List list;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 23;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            list = this.IconCompatParcelizer;
            int i4 = 83 / 0;
        } else {
            list = this.IconCompatParcelizer;
        }
        int i5 = i2 + 67;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 115;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        int i5 = i2 + 15;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public getLifecycleRegistryannotations(String str, String str2, String str3, List list) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
        this.IconCompatParcelizer = list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("UserData(id=", this.serializer, ", email=REDACTED, name=", this.read, ", countries="), this.IconCompatParcelizer, ")");
        }
        int i3 = 41 / 0;
        return MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("UserData(id=", this.serializer, ", email=REDACTED, name=", this.read, ", countries="), this.IconCompatParcelizer, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.serializer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i4 = write + 15;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.read;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List list = this.IconCompatParcelizer;
        return (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLifecycleRegistryannotations) {
            getLifecycleRegistryannotations getlifecycleregistryannotations = (getLifecycleRegistryannotations) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getlifecycleregistryannotations.serializer}, getCieXyz.write())).booleanValue()) {
                int i2 = write + 49;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getlifecycleregistryannotations.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getlifecycleregistryannotations.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getlifecycleregistryannotations.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i3 = MediaSessionCompatQueueItem + 55;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = write + 83;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = MediaSessionCompatQueueItem + 23;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 != 0;
    }
}
