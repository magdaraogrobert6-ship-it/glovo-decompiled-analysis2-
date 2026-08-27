package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutCompatJustificationMode extends LayoutCompatBreakStrategy {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final lerpInv MediaMetadataCompat;
    public final List RatingCompat;
    public final MathUtils RemoteActionCompatParcelizer;
    public final lookupAndInterpolate read;
    public final getDEFAULT_LAYOUT_ALIGNMENTui_text serializer;
    public final String write;

    public LayoutCompatJustificationMode(String str, String str2, MathUtils mathUtils, lerpInv lerpinv, lookupAndInterpolate lookupandinterpolate, getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, List list, String str3, String str4, int i) {
        Object obj = null;
        if ((i & 16) != 0) {
            int i2 = MediaSessionCompatQueueItem + 101;
            PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            lookupandinterpolate = null;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            int i4 = MediaSessionCompatQueueItem + 67;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            str3 = null;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
            int i6 = MediaSessionCompatQueueItem + 45;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            PlaybackStateCompatCustomAction = i7;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = i7 + 31;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str4 = null;
        }
        this.MediaBrowserCompatMediaItem = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = mathUtils;
        this.MediaMetadataCompat = lerpinv;
        this.read = lookupandinterpolate;
        this.serializer = getdefault_layout_alignmentui_text;
        this.RatingCompat = list;
        this.write = str3;
        this.MediaDescriptionCompat = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 95;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Earnings(title=", this.MediaBrowserCompatMediaItem, ", paidDistance=", this.IconCompatParcelizer, ", primaryItemView=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", secondaryItemView=");
        sbM.append(this.MediaMetadataCompat);
        sbM.append(", promoBonusItemView=");
        sbM.append(this.read);
        sbM.append(", showRecommendedIcon=false, multiplier=");
        sbM.append(this.serializer);
        sbM.append(", trackingEvents=");
        sbM.append(this.RatingCompat);
        sbM.append(", estimatedMinutes=");
        sbM.append(this.write);
        sbM.append(", tooltipText=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaDescriptionCompat, ")");
        int i4 = PlaybackStateCompatCustomAction + 125;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.MediaBrowserCompatMediaItem;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        MathUtils mathUtils = this.RemoteActionCompatParcelizer;
        int iHashCode6 = mathUtils == null ? 0 : mathUtils.hashCode();
        lerpInv lerpinv = this.MediaMetadataCompat;
        int iHashCode7 = lerpinv == null ? 0 : lerpinv.hashCode();
        lookupAndInterpolate lookupandinterpolate = this.read;
        if (lookupandinterpolate == null) {
            int i2 = PlaybackStateCompatCustomAction + 9;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = lookupandinterpolate.hashCode();
        }
        int iM = d$$ExternalSyntheticOutline0.m(((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31, 31, false);
        getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text = this.serializer;
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.RatingCompat, (iM + (getdefault_layout_alignmentui_text == null ? 0 : getdefault_layout_alignmentui_text.hashCode())) * 31, 31);
        String str3 = this.write;
        if (str3 == null) {
            int i4 = MediaSessionCompatQueueItem + 95;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.MediaDescriptionCompat;
        if (str4 == null) {
            int i6 = MediaSessionCompatQueueItem + 105;
            PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 76 / 0;
            }
        } else {
            iHashCode3 = str4.hashCode();
        }
        return ((iM2 + iHashCode2) * 31) + iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 29;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof LayoutCompatJustificationMode)) {
                return false;
            }
            LayoutCompatJustificationMode layoutCompatJustificationMode = (LayoutCompatJustificationMode) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, layoutCompatJustificationMode.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, layoutCompatJustificationMode.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, layoutCompatJustificationMode.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, layoutCompatJustificationMode.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, layoutCompatJustificationMode.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, layoutCompatJustificationMode.serializer}, getCieXyz.write())).booleanValue() || !this.RatingCompat.equals(layoutCompatJustificationMode.RatingCompat)) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, layoutCompatJustificationMode.write}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, layoutCompatJustificationMode.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i4 = MediaSessionCompatQueueItem + 53;
                PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
