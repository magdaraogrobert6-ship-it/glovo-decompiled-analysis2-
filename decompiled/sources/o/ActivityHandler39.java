package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler39 {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final String IconCompatParcelizer;
    public final AndroidSystemCallbacksActivityCallbacks MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final AndroidSystemCallbacksActivityCallbacks MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final List RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String ResultReceiver;
    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final String read;
    public final String serializer;
    public final String write;

    public ActivityHandler39(AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks, AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks2, boolean z, List list, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, String str8, String str9, String str10, String str11) {
        this.MediaMetadataCompat = androidSystemCallbacksActivityCallbacks;
        this.MediaBrowserCompatMediaItem = androidSystemCallbacksActivityCallbacks2;
        this.ParcelableVolumeInfo = z;
        this.RatingCompat = list;
        this.MediaSessionCompatToken = z2;
        this.PlaybackStateCompat = str;
        this.MediaSessionCompatQueueItem = str2;
        this.ResultReceiver = str3;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = str4;
        this.write = str5;
        this.MediaSessionCompatResultReceiverWrapper = str6;
        this.PlaybackStateCompatCustomAction = str7;
        this.MediaDescriptionCompat = z3;
        this.serializer = str8;
        this.read = str9;
        this.IconCompatParcelizer = str10;
        this.RemoteActionCompatParcelizer = str11;
    }

    public static ActivityHandler39 write(ActivityHandler39 activityHandler39, AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks, AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks2, boolean z, ArrayList arrayList, boolean z2, int i) {
        AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks3;
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 99;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            androidSystemCallbacksActivityCallbacks3 = activityHandler39.MediaMetadataCompat;
        } else {
            androidSystemCallbacksActivityCallbacks3 = androidSystemCallbacksActivityCallbacks;
        }
        AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks4 = (i & 2) != 0 ? activityHandler39.MediaBrowserCompatMediaItem : androidSystemCallbacksActivityCallbacks2;
        boolean z5 = (i & 4) != 0 ? activityHandler39.ParcelableVolumeInfo : z;
        List list = (i & 8) != 0 ? activityHandler39.RatingCompat : arrayList;
        if ((i & 16) != 0) {
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 119;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                z4 = activityHandler39.MediaSessionCompatToken;
                int i6 = 92 / 0;
            } else {
                z4 = activityHandler39.MediaSessionCompatToken;
            }
            z3 = z4;
        } else {
            z3 = z2;
        }
        String str = activityHandler39.PlaybackStateCompat;
        String str2 = activityHandler39.MediaSessionCompatQueueItem;
        String str3 = activityHandler39.ResultReceiver;
        String str4 = activityHandler39.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        String str5 = activityHandler39.write;
        String str6 = activityHandler39.MediaSessionCompatResultReceiverWrapper;
        String str7 = activityHandler39.PlaybackStateCompatCustomAction;
        boolean z6 = activityHandler39.MediaDescriptionCompat;
        String str8 = activityHandler39.serializer;
        String str9 = activityHandler39.read;
        String str10 = activityHandler39.IconCompatParcelizer;
        String str11 = activityHandler39.RemoteActionCompatParcelizer;
        activityHandler39.getClass();
        return new ActivityHandler39(androidSystemCallbacksActivityCallbacks3, androidSystemCallbacksActivityCallbacks4, z5, list, z3, str, str2, str3, str4, str5, str6, str7, z6, str8, str9, str10, str11);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 49;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.RatingCompat, d$$ExternalSyntheticOutline0.m((this.MediaBrowserCompatMediaItem.hashCode() + (this.MediaMetadataCompat.hashCode() * 31)) * 31, 31, this.ParcelableVolumeInfo), 31), 31, this.MediaSessionCompatToken);
        String str = this.PlaybackStateCompat;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.MediaSessionCompatQueueItem), 31, this.ResultReceiver), 31, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), 31, this.write), 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.PlaybackStateCompatCustomAction), 31, this.MediaDescriptionCompat), 31, this.serializer), 31, this.read), 31, this.IconCompatParcelizer);
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 107;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PasswordCreationViewState(passwordData=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", passwordDataConfirm=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", shouldEnableCreatePasswordButton=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", passwordRules=");
        sb.append(this.RatingCompat);
        sb.append(", showLoading=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", privacyPolicyUrl=", this.PlaybackStateCompat, ", loadingText=", sb, this.MediaSessionCompatToken);
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, ", title=", this.ResultReceiver, ", subTitle=");
        c8$$ExternalSyntheticOutline0.m(sb, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, ", buttonText=", this.write, ", privacyPolicyText=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatResultReceiverWrapper, ", privacyPolicyHighlightedText=", this.PlaybackStateCompatCustomAction, ", isRaccAccountCreationWithOtpEnabled=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", backConfirmationDialogTitle=", this.serializer, ", backConfirmationDialogDescription=", sb, this.MediaDescriptionCompat);
        c8$$ExternalSyntheticOutline0.m(sb, this.read, ", backConfirmationGoBackButton=", this.IconCompatParcelizer, ", backConfirmationCancelButton=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 29;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 49;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof ActivityHandler39)) {
                return false;
            }
            ActivityHandler39 activityHandler39 = (ActivityHandler39) obj;
            if (!this.MediaMetadataCompat.equals(activityHandler39.MediaMetadataCompat) || !this.MediaBrowserCompatMediaItem.equals(activityHandler39.MediaBrowserCompatMediaItem) || this.ParcelableVolumeInfo != activityHandler39.ParcelableVolumeInfo || !this.RatingCompat.equals(activityHandler39.RatingCompat) || this.MediaSessionCompatToken != activityHandler39.MediaSessionCompatToken) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, activityHandler39.PlaybackStateCompat}, getCieXyz.write())).booleanValue() || !this.MediaSessionCompatQueueItem.equals(activityHandler39.MediaSessionCompatQueueItem) || !this.ResultReceiver.equals(activityHandler39.ResultReceiver) || !this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.equals(activityHandler39.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) || !this.write.equals(activityHandler39.write) || !this.MediaSessionCompatResultReceiverWrapper.equals(activityHandler39.MediaSessionCompatResultReceiverWrapper) || !this.PlaybackStateCompatCustomAction.equals(activityHandler39.PlaybackStateCompatCustomAction) || this.MediaDescriptionCompat != activityHandler39.MediaDescriptionCompat || !this.serializer.equals(activityHandler39.serializer) || !this.read.equals(activityHandler39.read) || !this.IconCompatParcelizer.equals(activityHandler39.IconCompatParcelizer) || (!this.RemoteActionCompatParcelizer.equals(activityHandler39.RemoteActionCompatParcelizer))) {
                return false;
            }
        }
        return true;
    }
}
