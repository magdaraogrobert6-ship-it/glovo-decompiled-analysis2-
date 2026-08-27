package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.ItemComponent$Summary$Companion;
import kotlinx.serialization.Serializable;
import o.PopupLayoutContent4;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "summary")
public final class PopupLayout2 extends updateParentLayoutCoordinates {
    public static final ItemComponent$Summary$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.ItemComponent$Summary$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 123;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PopupLayoutContent4 popupLayoutContent4 = PopupLayoutContent4.IconCompatParcelizer;
            int i4 = serializer + 33;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return popupLayoutContent4;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String title;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.ItemComponent$Summary$Companion] */
    static {
        int i = write + 77;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ PopupLayout2(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.value = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PopupLayoutContent4.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Summary(title=", this.title, ", value=", this.value, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Summary(title=", this.title, ", value=", this.value, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode() + (this.title.hashCode() * 31);
        int i4 = serializer + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 115;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PopupLayout2)) {
            return false;
        }
        PopupLayout2 popupLayout2 = (PopupLayout2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, popupLayout2.title}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 27;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, popupLayout2.value}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = serializer + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
