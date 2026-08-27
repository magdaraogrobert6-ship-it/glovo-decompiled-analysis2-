package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Companion;
import kotlinx.serialization.Serializable;
import o.asPreviewWrapperProviderClass;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class asPreviewProviderClass {
    public static final SoftPosDeeplinkResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                asPreviewWrapperProviderClass aspreviewwrapperproviderclass = asPreviewWrapperProviderClass.IconCompatParcelizer;
                throw null;
            }
            asPreviewWrapperProviderClass aspreviewwrapperproviderclass2 = asPreviewWrapperProviderClass.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return aspreviewwrapperproviderclass2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final PreviewUtils_androidKt data;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.api.model.SoftPosDeeplinkResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ asPreviewProviderClass(int i, PreviewUtils_androidKt previewUtils_androidKt) {
        if (1 == (i & 1)) {
            this.data = previewUtils_androidKt;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, asPreviewWrapperProviderClass.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.data.hashCode();
            int i3 = 69 / 0;
        } else {
            iHashCode = this.data.hashCode();
        }
        int i4 = read + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SoftPosDeeplinkResponse(data=" + this.data + ")";
        int i2 = serializer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 119;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof asPreviewProviderClass) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, ((asPreviewProviderClass) obj).data}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 85;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = serializer + 125;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 113;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
