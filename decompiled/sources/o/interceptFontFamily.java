package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.StateV3AnalyticsResponse$Companion;
import kotlinx.serialization.Serializable;
import o.PlatformResolveInterceptor;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class interceptFontFamily {
    public static final StateV3AnalyticsResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StateV3AnalyticsResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            PlatformResolveInterceptor platformResolveInterceptor;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 115;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                platformResolveInterceptor = PlatformResolveInterceptor.IconCompatParcelizer;
                int i3 = 7 / 0;
            } else {
                platformResolveInterceptor = PlatformResolveInterceptor.IconCompatParcelizer;
            }
            int i4 = IconCompatParcelizer + 95;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return platformResolveInterceptor;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final accessgetW400cp metadata;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StateV3AnalyticsResponse$Companion] */
    static {
        int i = serializer + 47;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ interceptFontFamily(int i, accessgetW400cp accessgetw400cp) {
        if ((i & 1) == 0) {
            this.metadata = null;
            int i2 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.metadata = accessgetw400cp;
        int i4 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessgetW400cp accessgetw400cp = this.metadata;
        if (accessgetw400cp == null) {
            return 0;
        }
        int iHashCode = accessgetw400cp.hashCode();
        int i4 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StateV3AnalyticsResponse(metadata=" + this.metadata + ")";
        int i2 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof interceptFontFamily))) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, ((interceptFontFamily) obj).metadata}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = IconCompatParcelizer + 117;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 97;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
