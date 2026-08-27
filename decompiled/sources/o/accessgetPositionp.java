package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$AddressBadge$Companion;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlinx.serialization.Serializable;
import o.accessinsetBounds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "component_tag")
@SuppressLint
public final class accessgetPositionp implements accessobtainMeasureSpec {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$AddressBadge$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$AddressBadge$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 107;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessinsetBounds accessinsetbounds = accessinsetBounds.read;
            int i4 = read + 125;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return accessinsetbounds;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final TagIconTokenV1 iconToken;
    public final TagColorToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$AddressBadge$Companion] */
    static {
        int i = serializer + 19;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessgetPositionp(int i, String str, TagIconTokenV1 tagIconTokenV1, TagColorToken tagColorToken) {
        if (7 == (i & 7)) {
            this.text = str;
            this.iconToken = tagIconTokenV1;
            this.style = tagColorToken;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, accessinsetBounds.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode2 = this.text.hashCode();
            iHashCode = this.style.hashCode() << ((this.iconToken.hashCode() >>> (iHashCode2 >> 104)) >>> 37);
        } else {
            int iHashCode3 = this.text.hashCode();
            iHashCode = this.style.hashCode() + ((this.iconToken.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 41;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 23;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 61;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof accessgetPositionp)) {
            return false;
        }
        accessgetPositionp accessgetpositionp = (accessgetPositionp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, accessgetpositionp.text}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.iconToken == accessgetpositionp.iconToken) {
            if (this.style == accessgetpositionp.style) {
                return true;
            }
            int i7 = RemoteActionCompatParcelizer + 73;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = write + 115;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AddressBadge(text=" + this.text + ", iconToken=" + this.iconToken + ", style=" + this.style + ")";
        int i2 = write + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
