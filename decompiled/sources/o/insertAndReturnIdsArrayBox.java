package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class insertAndReturnIdsArrayBox {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    public insertAndReturnIdsArrayBox(int i, String str, String str2, String str3, String str4, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.read = i;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = str3;
        this.serializer = str4;
        this.RemoteActionCompatParcelizer = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("BookShiftConfirmationViewEntity(shiftId=", this.read, ", shiftMonth=", this.write, ", shiftDay=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", shiftNameOfDay=", this.MediaDescriptionCompat, ", shiftDuration=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", shiftArea=", this.RemoteActionCompatParcelizer, ", titleRes=2132018296, descriptionRes=2132018294, buttonLabelRes=2132018296, enableButton=true)");
        int i4 = RatingCompat + 21;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 3;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(true) + af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.string.instant_shift_confirm_booking, af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.string.instant_shift_booking_confirmation_description, af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.string.instant_shift_confirm_booking, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.read) * 31, 31, this.write), 31, this.IconCompatParcelizer), 31, this.MediaDescriptionCompat), 31, this.serializer), 31, this.RemoteActionCompatParcelizer), 31), 31), 31);
        int i4 = MediaBrowserCompatMediaItem + 33;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof insertAndReturnIdsArrayBox)) {
            return false;
        }
        insertAndReturnIdsArrayBox insertandreturnidsarraybox = (insertAndReturnIdsArrayBox) obj;
        if (this.read != insertandreturnidsarraybox.read) {
            return false;
        }
        Object[] objArr = {this.write, insertandreturnidsarraybox.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.IconCompatParcelizer, insertandreturnidsarraybox.IconCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            Object[] objArr3 = {this.MediaDescriptionCompat, insertandreturnidsarraybox.MediaDescriptionCompat};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                Object[] objArr4 = {this.serializer, insertandreturnidsarraybox.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr5 = {this.RemoteActionCompatParcelizer, insertandreturnidsarraybox.RemoteActionCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i3 = MediaBrowserCompatMediaItem + 83;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i = MediaBrowserCompatMediaItem + 79;
            RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = RatingCompat + 1;
            MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i4 = i % 2;
        return false;
    }
}
