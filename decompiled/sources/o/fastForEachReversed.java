package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$Companion;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlinx.serialization.Serializable;
import o.fastJoinToStringdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "expandable_button")
@SuppressLint
public final class fastForEachReversed implements fastAny {
    public static final Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 117;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                fastJoinToStringdefault fastjointostringdefault = fastJoinToStringdefault.IconCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fastJoinToStringdefault fastjointostringdefault2 = fastJoinToStringdefault.IconCompatParcelizer;
            int i3 = RemoteActionCompatParcelizer + 35;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return fastjointostringdefault2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final fastMapNotNull fullscreenItem;
    public final TagIconTokenV1 iconToken;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 99;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ fastForEachReversed(int i, TagIconTokenV1 tagIconTokenV1, String str, fastMapNotNull fastmapnotnull) {
        if (7 == (i & 7)) {
            this.iconToken = tagIconTokenV1;
            this.title = str;
            this.fullscreenItem = fastmapnotnull;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, fastJoinToStringdefault.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.fullscreenItem.hashCode() + af$$ExternalSyntheticOutline0.m(this.iconToken.hashCode() * 31, 31, this.title);
        int i4 = IconCompatParcelizer + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof fastForEachReversed) {
            fastForEachReversed fastforeachreversed = (fastForEachReversed) obj;
            if (this.iconToken == fastforeachreversed.iconToken) {
                Object[] objArr = {this.title, fastforeachreversed.title};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.fullscreenItem, fastforeachreversed.fullscreenItem};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 29;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 101;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 105;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ExpandableButtonV1(iconToken=" + this.iconToken + ", title=" + this.title + ", fullscreenItem=" + this.fullscreenItem + ")";
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
