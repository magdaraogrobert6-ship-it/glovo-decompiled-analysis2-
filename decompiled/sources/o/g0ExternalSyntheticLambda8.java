package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.core.exceptions.ServicesException;
import java.util.List;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class g0ExternalSyntheticLambda8 extends Options.Companion {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final int IconCompatParcelizer;
    public final int RatingCompat;
    public final int read;
    public final f6 serializer;
    public final int write;
    public final String MediaMetadataCompat = "";
    public final List RemoteActionCompatParcelizer = instance_delegatelambda0.write;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i2);
        int i9 = ~i;
        int i10 = (~(i9 | i3)) | i8;
        int i11 = ~i2;
        int i12 = i11 | i3;
        int i13 = i10 | (~i12);
        int i14 = i7 | i;
        int i15 = i8 | (~i14);
        int i16 = (~(i2 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i));
        int i17 = i3 + i + i4 + ((-1254723898) * i6) + ((-1667789834) * i5);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i3) + 1379663872 + ((-481802647) * i) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i4) + ((-1033371648) * i6) + ((-106430464) * i5) + (1552875520 * i18);
        int i20 = ((i3 * (-402395399)) - 1316031342) + (i * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i4 * (-402393527)) + (i6 * (-1219896714)) + (i5 * (-610841306)) + (i18 * (-825819136));
        return i19 + ((i20 * i20) * (-1063190528)) != 1 ? read(objArr) : serializer(objArr);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 3;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 109;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Boolean.valueOf(!z);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        f6 f6Var;
        g0ExternalSyntheticLambda8 g0externalsyntheticlambda8 = (g0ExternalSyntheticLambda8) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 117;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            f6Var = g0externalsyntheticlambda8.serializer;
            int i4 = 8 / 0;
        } else {
            f6Var = g0externalsyntheticlambda8.serializer;
        }
        int i5 = i2 + 23;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return f6Var;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 33;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 121;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 25;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.MediaMetadataCompat;
        int i4 = i2 + 43;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 89;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        int i6 = i2 + 111;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final int RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 89;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RatingCompat;
        int i6 = i2 + 41;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        int i3 = 33 / 0;
        return this.read;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        int i6 = i3 + 95;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public g0ExternalSyntheticLambda8(int i, int i2, int i3, int i4, f6 f6Var) {
        this.read = i;
        this.RatingCompat = i2;
        this.IconCompatParcelizer = i3;
        this.write = i4;
        this.serializer = f6Var;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 41;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("DynamicWrapPill(text=", this.MediaMetadataCompat, ", iconDrawables=", this.RemoteActionCompatParcelizer, ", circleColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.read, this.RatingCompat, ", textColor=", ", backgroundColor=", sbSerializer);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.IconCompatParcelizer, this.write, ", strokeColor=", ", iconAnchor=", sbSerializer);
        sbSerializer.append(this.serializer);
        sbSerializer.append(", highlighted=false)");
        String string = sbSerializer.toString();
        int i4 = MediaSessionCompatQueueItem + 39;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 117;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.RatingCompat, af$$ExternalSyntheticOutline0.m(this.read, c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.MediaMetadataCompat.hashCode() * 31, 31), 31), 31), 31), 31);
        int iHashCode = Boolean.hashCode(false) + ((this.serializer.hashCode() + iM) * 31);
        int i4 = MediaDescriptionCompat + 121;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 51;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 87;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof g0ExternalSyntheticLambda8)) {
            return false;
        }
        g0ExternalSyntheticLambda8 g0externalsyntheticlambda8 = (g0ExternalSyntheticLambda8) obj;
        if (!this.MediaMetadataCompat.equals(g0externalsyntheticlambda8.MediaMetadataCompat) || !this.RemoteActionCompatParcelizer.equals(g0externalsyntheticlambda8.RemoteActionCompatParcelizer) || this.read != g0externalsyntheticlambda8.read) {
            return false;
        }
        if (this.RatingCompat == g0externalsyntheticlambda8.RatingCompat) {
            return this.IconCompatParcelizer == g0externalsyntheticlambda8.IconCompatParcelizer && this.write == g0externalsyntheticlambda8.write && this.serializer.equals(g0externalsyntheticlambda8.serializer);
        }
        int i6 = MediaDescriptionCompat + 111;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    @Override // okio.Options.Companion
    public final f6 L_() {
        int iRemoteActionCompatParcelizer = ServicesException.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = ServicesException.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = ServicesException.RemoteActionCompatParcelizer();
        return (f6) read(-2052073074, iRemoteActionCompatParcelizer, 2052073074, iRemoteActionCompatParcelizer2, ServicesException.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3);
    }

    @Override // okio.Options.Companion
    public final boolean RemoteActionCompatParcelizer() {
        int iRemoteActionCompatParcelizer = ServicesException.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = ServicesException.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = ServicesException.RemoteActionCompatParcelizer();
        return ((Boolean) read(408654261, iRemoteActionCompatParcelizer, -408654260, iRemoteActionCompatParcelizer2, ServicesException.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3)).booleanValue();
    }
}
