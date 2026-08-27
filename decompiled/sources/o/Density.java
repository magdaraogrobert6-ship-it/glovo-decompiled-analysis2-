package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$InProgress$Companion;
import kotlinx.serialization.Serializable;
import o.LoremIpsumKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Density extends Wallpapers {
    public static final SignatureTaskUiItem$SignatureState$InProgress$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$InProgress$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 103;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            LoremIpsumKt loremIpsumKt = LoremIpsumKt.read;
            int i4 = read + 51;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return loremIpsumKt;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String thumbnailUri;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$InProgress$Companion] */
    static {
        int i = IconCompatParcelizer + 35;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }

    public /* synthetic */ Density(int i, String str) {
        if (1 == (i & 1)) {
            this.thumbnailUri = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, LoremIpsumKt.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.thumbnailUri.hashCode();
        }
        int i3 = 12 / 0;
        return this.thumbnailUri.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("InProgress(thumbnailUri=", this.thumbnailUri, ")");
        }
        int i3 = 5 / 0;
        return ff$$ExternalSyntheticOutline0.m("InProgress(thumbnailUri=", this.thumbnailUri, ")");
    }

    public Density(String str) {
        this.thumbnailUri = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Density) {
            Object[] objArr = {this.thumbnailUri, ((Density) obj).thumbnailUri};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 113;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer;
        int i5 = i4 + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 71;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
