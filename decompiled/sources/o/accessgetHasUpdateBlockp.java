package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Translation$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambda87rkzpiD7fzpQlzxtrf4CIiBjKU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "translation")
public final class accessgetHasUpdateBlockp extends AndroidViewHolder {
    public static final DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Translation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Translation$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 119;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda87rkzpiD7fzpQlzxtrf4CIiBjKU r8lambda87rkzpid7fzpqlzxtrf4ciibjku = r8lambda87rkzpiD7fzpQlzxtrf4CIiBjKU.serializer;
            int i4 = IconCompatParcelizer + 125;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambda87rkzpid7fzpqlzxtrf4ciibjku;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Translation$Companion] */
    static {
        int i = serializer + 73;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessgetHasUpdateBlockp(int i, String str) {
        if (1 == (i & 1)) {
            this.title = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, r8lambda87rkzpiD7fzpQlzxtrf4CIiBjKU.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        int i4 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("Translation(title=", this.title, ")");
        }
        ff$$ExternalSyntheticOutline0.m("Translation(title=", this.title, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof accessgetHasUpdateBlockp) {
                Object[] objArr = {this.title, ((accessgetHasUpdateBlockp) obj).title};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    int i2 = IconCompatParcelizer + 81;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
