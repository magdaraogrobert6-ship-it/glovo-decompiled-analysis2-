package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class a5ExternalSyntheticLambda0 implements resizeToBitmapDimensionslambda0 {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final ah IconCompatParcelizer;
    public final androidx.compose.animation.core.VectorizedFloatDecaySpec RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final boolean write;

    public a5ExternalSyntheticLambda0(androidx.compose.animation.core.VectorizedFloatDecaySpec vectorizedFloatDecaySpec, ah ahVar, boolean z, boolean z2) {
        this.RemoteActionCompatParcelizer = vectorizedFloatDecaySpec;
        this.IconCompatParcelizer = ahVar;
        this.write = z;
        this.serializer = z2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v5 androidx.compose.animation.core.VectorizedFloatDecaySpec) = 
  (r1v4 androidx.compose.animation.core.VectorizedFloatDecaySpec)
  (r1v7 androidx.compose.animation.core.VectorizedFloatDecaySpec)
 binds: [B:8:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static a5ExternalSyntheticLambda0 write(a5ExternalSyntheticLambda0 a5externalsyntheticlambda0, ah ahVar, boolean z, int i) {
        androidx.compose.animation.core.VectorizedFloatDecaySpec vectorizedFloatDecaySpec;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            a5externalsyntheticlambda0.getClass();
            a5externalsyntheticlambda0.getClass();
            vectorizedFloatDecaySpec = a5externalsyntheticlambda0.RemoteActionCompatParcelizer;
            if ((i & 47) != 0) {
                ahVar = a5externalsyntheticlambda0.IconCompatParcelizer;
            }
        } else {
            a5externalsyntheticlambda0.getClass();
            a5externalsyntheticlambda0.getClass();
            vectorizedFloatDecaySpec = a5externalsyntheticlambda0.RemoteActionCompatParcelizer;
            if ((i & 8) != 0) {
                ahVar = a5externalsyntheticlambda0.IconCompatParcelizer;
            }
        }
        if ((i & 16) != 0) {
            z = a5externalsyntheticlambda0.write;
            int i4 = read + 35;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        boolean z2 = a5externalsyntheticlambda0.serializer;
        a5externalsyntheticlambda0.getClass();
        return new a5ExternalSyntheticLambda0(vectorizedFloatDecaySpec, ahVar, z, z2);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CountrySelectionViewState(subTitle=2132018385, collapsedTitle=2132018383, scrollState=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", filterableSelectionState=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", showLoading=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.write, ", canNavigateBackToWelcome=", this.serializer, ")");
        int i2 = read + 25;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strSerializer;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a5ExternalSyntheticLambda0) {
            a5ExternalSyntheticLambda0 a5externalsyntheticlambda0 = (a5ExternalSyntheticLambda0) obj;
            if (this.RemoteActionCompatParcelizer == a5externalsyntheticlambda0.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer.equals(a5externalsyntheticlambda0.IconCompatParcelizer)) {
                    if (this.write == a5externalsyntheticlambda0.write && this.serializer == a5externalsyntheticlambda0.serializer) {
                        return true;
                    }
                } else {
                    int i5 = MediaDescriptionCompat + 83;
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            } else {
                int i7 = i3 + 7;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 121;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.string.login_country_selection_collapsed_title, Integer.hashCode(com.logistics.rider.glovo.R.string.login_country_selection_sub_title) * 31, 31);
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m((this.IconCompatParcelizer.hashCode() + ((iHashCode + iM) * 31)) * 31, 31, this.write);
        int i4 = read + 123;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
