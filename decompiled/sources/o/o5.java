package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.map.integration.search.naver.NaverReverseGeocodingResponse$Companion;
import kotlinx.serialization.Serializable;
import o.o4;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class o5 {
    public static final NaverReverseGeocodingResponse$Companion Companion = new Object() { // from class: com.roadrunner.map.integration.search.naver.NaverReverseGeocodingResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            o4 o4Var = o4.serializer;
            int i4 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return o4Var;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String formattedAddress;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.map.integration.search.naver.NaverReverseGeocodingResponse$Companion] */
    static {
        int i = write + 63;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ o5(int i, String str) {
        if ((i & 1) == 0) {
            this.formattedAddress = null;
            int i2 = IconCompatParcelizer + 41;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.formattedAddress = str;
        int i4 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.formattedAddress;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i2 + 21;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("NaverReverseGeocodingResponse(formattedAddress=", this.formattedAddress, ")");
            int i3 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("NaverReverseGeocodingResponse(formattedAddress=", this.formattedAddress, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof o5) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.formattedAddress, ((o5) obj).formattedAddress}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = RemoteActionCompatParcelizer + 17;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 73;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i9 = i3 + 51;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }
}
