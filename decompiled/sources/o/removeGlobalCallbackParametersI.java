package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class removeGlobalCallbackParametersI implements resizeToBitmapDimensionslambda0 {
    private static int ComponentActivity = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final String IconCompatParcelizer;
    public final getBoolean MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final getBoolean MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final boolean PlaybackStateCompatCustomAction;
    public final getPersonLastName RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String ResultReceiver;
    public final androidx.compose.ui.text.AnnotatedString r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final String read;
    public final String serializer;
    public final List write;

    public final String toString() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 57;
        ComponentActivity = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        ComponentActivity = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "EmailAndPhoneViewState(REDACTED)";
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.PlaybackStateCompatCustomAction) * 31, 31, this.ParcelableVolumeInfo);
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int iM2 = af$$ExternalSyntheticOutline0.m((this.MediaSessionCompatResultReceiverWrapper.hashCode() + ((iHashCode + iM) * 31)) * 31, 31, this.IconCompatParcelizer);
        int iM3 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.hashCode() + iM2) * 31, 31, this.ResultReceiver), 31, this.MediaMetadataCompat), 31, this.MediaDescriptionCompat);
        String str = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str == null) {
            int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 109;
            ComponentActivity = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = ComponentActivity + 39;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.write, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM3 + i) * 31, 31, this.MediaSessionCompatToken), 31, this.PlaybackStateCompat), 31), 31, this.MediaSessionCompatQueueItem), 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
    }

    public static removeGlobalCallbackParametersI IconCompatParcelizer(removeGlobalCallbackParametersI removeglobalcallbackparametersi, boolean z, String str, boolean z2, List list, String str2, int i) {
        String str3;
        boolean z3;
        List list2;
        String str4;
        String str5;
        int i2 = 2 % 2;
        boolean z4 = (i & 1) != 0 ? removeglobalcallbackparametersi.PlaybackStateCompatCustomAction : z;
        boolean z5 = removeglobalcallbackparametersi.ParcelableVolumeInfo;
        getBoolean getboolean = removeglobalcallbackparametersi.MediaBrowserCompatMediaItem;
        getBoolean getboolean2 = removeglobalcallbackparametersi.MediaSessionCompatResultReceiverWrapper;
        String str6 = removeglobalcallbackparametersi.IconCompatParcelizer;
        androidx.compose.ui.text.AnnotatedString annotatedString = removeglobalcallbackparametersi.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        String str7 = removeglobalcallbackparametersi.ResultReceiver;
        String str8 = removeglobalcallbackparametersi.MediaMetadataCompat;
        String str9 = removeglobalcallbackparametersi.MediaDescriptionCompat;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
            String str10 = removeglobalcallbackparametersi.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int i3 = ComponentActivity + 113;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            str3 = str10;
        } else {
            str3 = str;
        }
        boolean z6 = removeglobalcallbackparametersi.MediaSessionCompatToken;
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) != 0) {
            z3 = removeglobalcallbackparametersi.PlaybackStateCompat;
            int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 93;
            ComponentActivity = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            z3 = z2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0) {
            int i7 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 79;
            ComponentActivity = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            list2 = removeglobalcallbackparametersi.write;
        } else {
            list2 = list;
        }
        if ((i & 8192) != 0) {
            int i9 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 61;
            ComponentActivity = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                str5 = removeglobalcallbackparametersi.MediaSessionCompatQueueItem;
                int i10 = 35 / 0;
            } else {
                str5 = removeglobalcallbackparametersi.MediaSessionCompatQueueItem;
            }
            str4 = str5;
        } else {
            str4 = str2;
        }
        String str11 = removeglobalcallbackparametersi.RemoteActionCompatParcelizer;
        String str12 = removeglobalcallbackparametersi.serializer;
        String str13 = removeglobalcallbackparametersi.read;
        removeglobalcallbackparametersi.getClass();
        getboolean.getClass();
        getboolean2.getClass();
        str6.getClass();
        annotatedString.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        list2.getClass();
        str4.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        return new removeGlobalCallbackParametersI(z4, z5, getboolean, getboolean2, str6, annotatedString, str7, str8, str9, str3, z6, z3, list2, str4, str11, str12, str13);
    }

    public /* synthetic */ removeGlobalCallbackParametersI(boolean z, getBoolean getboolean, getBoolean getboolean2, String str, androidx.compose.ui.text.AnnotatedString annotatedString, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, int i) {
        boolean z3;
        getBoolean getboolean3;
        String str9;
        String str10;
        boolean z4 = false;
        if ((i & 2) != 0) {
            int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 59;
            ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        getBindingAdapterPosition getbindingadapterposition = getBindingAdapterPosition.read;
        if ((i & 4) != 0) {
            getBoolean getboolean4 = new getBoolean(null, 0, null, getbindingadapterposition, null, false, 55);
            int i5 = ComponentActivity + 103;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            } else {
                int i7 = 2 % 2;
            }
            getboolean3 = getboolean4;
        } else {
            getboolean3 = getboolean;
        }
        getBoolean getboolean5 = (i & 8) != 0 ? new getBoolean(null, 0, null, getbindingadapterposition, null, false, 55) : getboolean2;
        String str11 = (i & 16) != 0 ? "" : str;
        androidx.compose.ui.text.AnnotatedString annotatedString2 = (i & 32) != 0 ? new androidx.compose.ui.text.AnnotatedString("", null, 2, null) : annotatedString;
        String str12 = (i & 64) != 0 ? "" : str2;
        String str13 = (i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? "" : str3;
        String str14 = (i & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? "" : str4;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
            int i8 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 95;
            ComponentActivity = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 43 / 0;
            }
            int i10 = 2 % 2;
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
            int i11 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 27;
            ComponentActivity = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            z4 = z2;
        }
        String str15 = (i & androidx.compose.ui.graphics.Fields.Clip) != 0 ? "" : str6;
        if ((32768 & i) != 0) {
            int i13 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 37;
            ComponentActivity = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            str10 = "";
        } else {
            str10 = str7;
        }
        this(false, z3, getboolean3, getboolean5, str11, annotatedString2, str12, str13, str14, str9, z4, false, instance_delegatelambda0.write, "", str15, str10, (i & 65536) != 0 ? "" : str8);
    }

    public removeGlobalCallbackParametersI(boolean z, boolean z2, getBoolean getboolean, getBoolean getboolean2, String str, androidx.compose.ui.text.AnnotatedString annotatedString, String str2, String str3, String str4, String str5, boolean z3, boolean z4, List list, String str6, String str7, String str8, String str9) {
        getboolean.getClass();
        getboolean2.getClass();
        str.getClass();
        annotatedString.getClass();
        str2.getClass();
        m1$$ExternalSyntheticOutline0.m(str3, str4, str7, str8, str9);
        this.PlaybackStateCompatCustomAction = z;
        this.ParcelableVolumeInfo = z2;
        this.MediaBrowserCompatMediaItem = getboolean;
        this.MediaSessionCompatResultReceiverWrapper = getboolean2;
        this.IconCompatParcelizer = str;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = annotatedString;
        this.ResultReceiver = str2;
        this.MediaMetadataCompat = str3;
        this.MediaDescriptionCompat = str4;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str5;
        this.MediaSessionCompatToken = z3;
        this.PlaybackStateCompat = z4;
        this.write = list;
        this.MediaSessionCompatQueueItem = str6;
        this.RemoteActionCompatParcelizer = str7;
        this.serializer = str8;
        this.read = str9;
        this.RatingCompat = androidx.compose.runtime.CompositionKt.serializer(new NetworkingCoreModule$$ExternalSyntheticLambda2(26, this));
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof removeGlobalCallbackParametersI)) {
                return false;
            }
            removeGlobalCallbackParametersI removeglobalcallbackparametersi = (removeGlobalCallbackParametersI) obj;
            if (this.PlaybackStateCompatCustomAction != removeglobalcallbackparametersi.PlaybackStateCompatCustomAction) {
                return false;
            }
            if (this.ParcelableVolumeInfo != removeglobalcallbackparametersi.ParcelableVolumeInfo) {
                int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 89;
                ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, removeglobalcallbackparametersi.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatResultReceiverWrapper, removeglobalcallbackparametersi.MediaSessionCompatResultReceiverWrapper}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, removeglobalcallbackparametersi.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, removeglobalcallbackparametersi.r8lambda54BeH8ZsBru0CXI2CCSP2syNys}, getCieXyz.write())).booleanValue()) {
                    int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 105;
                    ComponentActivity = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i3 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ResultReceiver, removeglobalcallbackparametersi.ResultReceiver}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, removeglobalcallbackparametersi.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, removeglobalcallbackparametersi.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, removeglobalcallbackparametersi.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY}, getCieXyz.write())).booleanValue() || this.MediaSessionCompatToken != removeglobalcallbackparametersi.MediaSessionCompatToken || this.PlaybackStateCompat != removeglobalcallbackparametersi.PlaybackStateCompat) {
                        return false;
                    }
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, removeglobalcallbackparametersi.write}, getCieXyz.write())).booleanValue())) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, removeglobalcallbackparametersi.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                            int i4 = ComponentActivity + 33;
                            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            return false;
                        }
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, removeglobalcallbackparametersi.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, removeglobalcallbackparametersi.serializer}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, removeglobalcallbackparametersi.read}, getCieXyz.write())).booleanValue();
                        }
                        int i6 = ComponentActivity + 35;
                        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            return true;
                        }
                    } else {
                        int i7 = ComponentActivity + 125;
                        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        return false;
                    }
                }
                return false;
            }
            int i9 = ComponentActivity + 61;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 61;
        ComponentActivity = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return true;
    }
}
