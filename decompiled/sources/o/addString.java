package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class addString extends addLong {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final String IconCompatParcelizer;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final ArrayList write;

    public addString(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.RatingCompat = str;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.read = str5;
        this.write = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RatingCompat.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.serializer), 31, this.RemoteActionCompatParcelizer), 31, this.read);
        int i4 = MediaBrowserCompatMediaItem + 25;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Quests(title=", this.RatingCompat, ", headerActionText=", this.IconCompatParcelizer, ", headerActionUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", footerActionText=", this.RemoteActionCompatParcelizer, ", footerActionUrl=");
        sbM.append(this.read);
        sbM.append(", quests=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 85;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof addString)) {
                int i4 = MediaBrowserCompatMediaItem + 33;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                int i5 = 3 / 5;
                return false;
            }
            addString addstring = (addString) obj;
            Object[] objArr = {this.RatingCompat, addstring.RatingCompat};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.IconCompatParcelizer, addstring.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {this.serializer, addstring.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr4 = {this.RemoteActionCompatParcelizer, addstring.RemoteActionCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr5 = {this.read, addstring.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                    i = MediaDescriptionCompat + 1;
                    i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (!this.write.equals(addstring.write)) {
                    return false;
                }
            } else {
                i = MediaDescriptionCompat + 103;
                i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            MediaBrowserCompatMediaItem = i2;
            int i6 = i % 2;
            return false;
        }
        return true;
    }
}
