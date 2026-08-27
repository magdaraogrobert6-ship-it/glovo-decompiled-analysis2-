package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Compression$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdahKk_JmdKhroMKKw6KsKoy5ftZ14 {
    public static final SignatureTaskUiItem$Compression$Companion Companion = new SignatureTaskUiItem$Compression$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final int maxDimension;
    public final float quality;

    static {
        int i = serializer + 53;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdahKk_JmdKhroMKKw6KsKoy5ftZ14(float f, int i, int i2) {
        if (3 == (i & 3)) {
            this.quality = f;
            this.maxDimension = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, CollectionPreviewParameterProvider.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.maxDimension) + (Float.hashCode(this.quality) * 31);
        int i4 = read + 15;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return iHashCode;
    }

    public r8lambdahKk_JmdKhroMKKw6KsKoy5ftZ14(float f, int i) {
        this.quality = f;
        this.maxDimension = i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 97;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdahKk_JmdKhroMKKw6KsKoy5ftZ14)) {
            return false;
        }
        r8lambdahKk_JmdKhroMKKw6KsKoy5ftZ14 r8lambdahkk_jmdkhromkkw6kskoy5ftz14 = (r8lambdahKk_JmdKhroMKKw6KsKoy5ftZ14) obj;
        if (Float.compare(this.quality, r8lambdahkk_jmdkhromkkw6kskoy5ftz14.quality) != 0) {
            return false;
        }
        if (this.maxDimension == r8lambdahkk_jmdkhromkkw6kskoy5ftz14.maxDimension) {
            return true;
        }
        int i4 = IconCompatParcelizer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Compression(quality=" + this.quality + ", maxDimension=" + this.maxDimension + ")";
        int i2 = IconCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return str;
    }
}
