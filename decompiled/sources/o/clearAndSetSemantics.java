package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class clearAndSetSemantics extends accessaddSemanticsPropertiesFrom {
    private static int ResultReceiver = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final SemanticsModifierKt MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final semanticsdefault PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final semantics RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public clearAndSetSemantics(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SemanticsModifierKt semanticsModifierKt, String str10, boolean z, semanticsdefault semanticsdefaultVar, String str11, semantics semanticsVar) {
        str2.getClass();
        str3.getClass();
        str7.getClass();
        str8.getClass();
        semanticsModifierKt.getClass();
        semanticsdefaultVar.getClass();
        this.RatingCompat = str;
        this.MediaSessionCompatResultReceiverWrapper = str2;
        this.read = str3;
        this.MediaMetadataCompat = str4;
        this.ParcelableVolumeInfo = str5;
        this.PlaybackStateCompat = str6;
        this.IconCompatParcelizer = str7;
        this.serializer = str8;
        this.write = str9;
        this.MediaSessionCompatQueueItem = semanticsModifierKt;
        this.MediaDescriptionCompat = str10;
        this.MediaBrowserCompatMediaItem = z;
        this.PlaybackStateCompatCustomAction = semanticsdefaultVar;
        this.MediaSessionCompatToken = str11;
        this.RemoteActionCompatParcelizer = semanticsVar;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 45;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Available(imageUrl=", this.RatingCompat, ", title=", this.MediaSessionCompatResultReceiverWrapper, ", body=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", termsAndConditions=", this.MediaMetadataCompat, ", termsAndConditionsText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.ParcelableVolumeInfo, ", termsAndConditionsUrl=", this.PlaybackStateCompat, ", ctaButtonText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", ctaButtonUrl=", this.serializer, ", dismissButtonText=");
        sbM.append(this.write);
        sbM.append(", phase=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", header=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.MediaDescriptionCompat, ", dismissable=", ", urgencyVariant=", sbM, this.MediaBrowserCompatMediaItem);
        sbM.append(this.PlaybackStateCompatCustomAction);
        sbM.append(", urgencyMessage=");
        sbM.append(this.MediaSessionCompatToken);
        sbM.append(", analytics=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 95;
        ResultReceiver = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 95;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(((i2 % 2 != 0 ? (str = this.RatingCompat) != null : (str = this.RatingCompat) != null) ? str.hashCode() : 0) * 31, 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.read);
        String str2 = this.MediaMetadataCompat;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ParcelableVolumeInfo;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.PlaybackStateCompat;
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((((iM + iHashCode4) * 31) + iHashCode5) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
        String str5 = this.write;
        if (str5 == null) {
            int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 123;
            ResultReceiver = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str5.hashCode();
        }
        int iHashCode6 = this.MediaSessionCompatQueueItem.hashCode();
        String str6 = this.MediaDescriptionCompat;
        if (str6 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 97;
            ResultReceiver = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        int iM3 = d$$ExternalSyntheticOutline0.m((((iHashCode6 + ((iM2 + iHashCode) * 31)) * 31) + iHashCode2) * 31, 31, this.MediaBrowserCompatMediaItem);
        int iHashCode7 = this.PlaybackStateCompatCustomAction.hashCode();
        String str7 = this.MediaSessionCompatToken;
        if (str7 == null) {
            int i7 = ResultReceiver + 113;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
        } else {
            iHashCode3 = str7.hashCode();
        }
        int iHashCode8 = this.RemoteActionCompatParcelizer.hashCode() + ((((iHashCode7 + iM3) * 31) + iHashCode3) * 31);
        int i8 = ResultReceiver + 97;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return iHashCode8;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 103;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof clearAndSetSemantics) {
            clearAndSetSemantics clearandsetsemantics = (clearAndSetSemantics) obj;
            Object[] objArr = {this.RatingCompat, clearandsetsemantics.RatingCompat};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.MediaSessionCompatResultReceiverWrapper, clearandsetsemantics.MediaSessionCompatResultReceiverWrapper};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.read, clearandsetsemantics.read};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        Object[] objArr4 = {this.MediaMetadataCompat, clearandsetsemantics.MediaMetadataCompat};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                            Object[] objArr5 = {this.ParcelableVolumeInfo, clearandsetsemantics.ParcelableVolumeInfo};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                Object[] objArr6 = {this.PlaybackStateCompat, clearandsetsemantics.PlaybackStateCompat};
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                                    Object[] objArr7 = {this.IconCompatParcelizer, clearandsetsemantics.IconCompatParcelizer};
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
                                        Object[] objArr8 = {this.serializer, clearandsetsemantics.serializer};
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
                                            Object[] objArr9 = {this.write, clearandsetsemantics.write};
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr9, getCieXyz.write())).booleanValue() && this.MediaSessionCompatQueueItem == clearandsetsemantics.MediaSessionCompatQueueItem) {
                                                Object[] objArr10 = {this.MediaDescriptionCompat, clearandsetsemantics.MediaDescriptionCompat};
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr10, getCieXyz.write())).booleanValue() && this.MediaBrowserCompatMediaItem == clearandsetsemantics.MediaBrowserCompatMediaItem && this.PlaybackStateCompatCustomAction == clearandsetsemantics.PlaybackStateCompatCustomAction) {
                                                    Object[] objArr11 = {this.MediaSessionCompatToken, clearandsetsemantics.MediaSessionCompatToken};
                                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr11, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer.equals(clearandsetsemantics.RemoteActionCompatParcelizer)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 43;
                        ResultReceiver = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                    }
                }
            }
        }
        int i5 = ResultReceiver + 125;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
