package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getMaximumBitmapHeight {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final List MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getMaximumBitmapHeight(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.MediaSessionCompatQueueItem = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.serializer = str5;
        this.write = str6;
        this.MediaDescriptionCompat = list;
    }

    public static getMaximumBitmapHeight write(getMaximumBitmapHeight getmaximumbitmapheight, String str) {
        int i = 2 % 2;
        String str2 = getmaximumbitmapheight.MediaSessionCompatQueueItem;
        String str3 = getmaximumbitmapheight.read;
        String str4 = getmaximumbitmapheight.RemoteActionCompatParcelizer;
        String str5 = getmaximumbitmapheight.serializer;
        String str6 = getmaximumbitmapheight.write;
        List list = getmaximumbitmapheight.MediaDescriptionCompat;
        getmaximumbitmapheight.getClass();
        str2.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        getMaximumBitmapHeight getmaximumbitmapheight2 = new getMaximumBitmapHeight(str2, str, str3, str4, str5, str6, list);
        int i2 = MediaMetadataCompat + 97;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getmaximumbitmapheight2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 35;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("LastStopScreenData(title=", this.MediaSessionCompatQueueItem, ", subtitle=", this.IconCompatParcelizer, ", saveUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", setStopButtonTitle=", this.RemoteActionCompatParcelizer, ", failureMessage=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", successMessage=", this.write, ", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.MediaDescriptionCompat, ")");
        int i4 = MediaMetadataCompat + 51;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 123;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.MediaDescriptionCompat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.read), 31, this.RemoteActionCompatParcelizer), 31, this.serializer), 31, this.write);
        int i4 = RatingCompat + 19;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 51;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof getMaximumBitmapHeight) {
            getMaximumBitmapHeight getmaximumbitmapheight = (getMaximumBitmapHeight) obj;
            Object[] objArr = {this.MediaSessionCompatQueueItem, getmaximumbitmapheight.MediaSessionCompatQueueItem};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.IconCompatParcelizer, getmaximumbitmapheight.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.read, getmaximumbitmapheight.read};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        Object[] objArr4 = {this.RemoteActionCompatParcelizer, getmaximumbitmapheight.RemoteActionCompatParcelizer};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                            Object[] objArr5 = {this.serializer, getmaximumbitmapheight.serializer};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                Object[] objArr6 = {this.write, getmaximumbitmapheight.write};
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat.equals(getmaximumbitmapheight.MediaDescriptionCompat)) {
                                    return true;
                                }
                            }
                        } else {
                            int i4 = MediaMetadataCompat + 21;
                            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                        }
                    }
                }
            }
        }
        return false;
    }
}
