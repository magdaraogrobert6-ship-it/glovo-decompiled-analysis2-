package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao IconCompatParcelizer;
    public final List MediaDescriptionCompat;
    public final List RemoteActionCompatParcelizer;
    public final List read;
    public final r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA serializer;
    public final r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg write;

    public r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs(List list, ArrayList arrayList, List list2, r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva, r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao r8lambda5hzxmaf3xnzh0fawlqisitz7ao, r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg) {
        list.getClass();
        list2.getClass();
        this.MediaDescriptionCompat = list;
        this.read = arrayList;
        this.RemoteActionCompatParcelizer = list2;
        this.serializer = r8lambdacwu8ozate7jouiaqjprnuskxva;
        this.IconCompatParcelizer = r8lambda5hzxmaf3xnzh0fawlqisitz7ao;
        this.write = r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 91;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.MediaDescriptionCompat.hashCode();
        List list = this.read;
        int iHashCode3 = 0;
        if (list == null) {
            int i4 = MediaBrowserCompatMediaItem + 123;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        int iM = c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, ((iHashCode2 * 31) + iHashCode) * 31, 31);
        int iHashCode4 = this.serializer.hashCode();
        r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao r8lambda5hzxmaf3xnzh0fawlqisitz7ao = this.IconCompatParcelizer;
        if (r8lambda5hzxmaf3xnzh0fawlqisitz7ao == null) {
            int i6 = MediaBrowserCompatMediaItem + 101;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode3 = r8lambda5hzxmaf3xnzh0fawlqisitz7ao.hashCode();
        }
        return this.write.hashCode() + ((((iHashCode4 + iM) * 31) + iHashCode3) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SettingsUiState(yourPreferencesItems=" + this.MediaDescriptionCompat + ", promotionsSectionItems=" + this.read + ", legalSectionItems=" + this.RemoteActionCompatParcelizer + ", checkNotificationsCardTexts=" + this.serializer + ", feedbackNotificationsCard=" + this.IconCompatParcelizer + ", appVersion=" + this.write + ")";
        int i2 = RatingCompat + 59;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs)) {
            return false;
        }
        r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs r8lambdafenlu5aljx2clfzrg4te2qepkfs = (r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, r8lambdafenlu5aljx2clfzrg4te2qepkfs.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdafenlu5aljx2clfzrg4te2qepkfs.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdafenlu5aljx2clfzrg4te2qepkfs.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || !this.serializer.equals(r8lambdafenlu5aljx2clfzrg4te2qepkfs.serializer)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdafenlu5aljx2clfzrg4te2qepkfs.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return this.write.equals(r8lambdafenlu5aljx2clfzrg4te2qepkfs.write);
        }
        int i4 = MediaBrowserCompatMediaItem + 123;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
