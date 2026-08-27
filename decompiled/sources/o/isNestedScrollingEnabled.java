package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Tag$Companion;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import kotlinx.serialization.Serializable;
import o.onNestedFling;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isNestedScrollingEnabled {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Tag$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Tag$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 41;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onNestedFling onnestedfling = onNestedFling.RemoteActionCompatParcelizer;
            int i4 = serializer + 125;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return onnestedfling;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final TagColorToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$Tag$Companion] */
    static {
        int i = IconCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ isNestedScrollingEnabled(int i, TagColorToken tagColorToken, String str) {
        if (3 == (i & 3)) {
            this.text = str;
            this.style = tagColorToken;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, onNestedFling.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.style.hashCode() << (this.text.hashCode() >>> 38);
        }
        return (this.text.hashCode() * 31) + this.style.hashCode();
    }

    public isNestedScrollingEnabled(TagColorToken tagColorToken) {
        tagColorToken.getClass();
        this.text = "In review";
        this.style = tagColorToken;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 41;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 20 / 0;
            }
            return true;
        }
        if (!(obj instanceof isNestedScrollingEnabled)) {
            return false;
        }
        isNestedScrollingEnabled isnestedscrollingenabled = (isNestedScrollingEnabled) obj;
        Object[] objArr = {this.text, isnestedscrollingenabled.text};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.style == isnestedscrollingenabled.style) {
            return true;
        }
        int i4 = serializer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Tag(text=" + this.text + ", style=" + this.style + ")";
        int i2 = read + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return str;
    }
}
