package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$AddressBadge$Companion;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlinx.serialization.Serializable;
import o.getW700;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "component_tag")
@SuppressLint
public final class getW600 extends getW800 {
    public static final ScrollableComponent$LocationDetail$AddressBadge$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$AddressBadge$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 29;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getW700 getw700 = getW700.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 27;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return getw700;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final TagIconTokenV1 iconToken;
    public final TagColorToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$AddressBadge$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    public /* synthetic */ getW600(int i, String str, TagIconTokenV1 tagIconTokenV1, TagColorToken tagColorToken) {
        if (7 == (i & 7)) {
            this.text = str;
            this.iconToken = tagIconTokenV1;
            this.style = tagColorToken;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getW700.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.text.hashCode();
        int iHashCode2 = this.style.hashCode() + ((this.iconToken.hashCode() + (iHashCode * 31)) * 31);
        int i4 = write + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getW600)) {
            return false;
        }
        getW600 getw600 = (getW600) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getw600.text}, getCieXyz.write())).booleanValue()) {
            if (this.iconToken != getw600.iconToken) {
                return false;
            }
            if (this.style != getw600.style) {
                int i2 = serializer + 33;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = write + 63;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = write + 21;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AddressBadge(text=" + this.text + ", iconToken=" + this.iconToken + ", style=" + this.style + ")";
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return str;
    }
}
