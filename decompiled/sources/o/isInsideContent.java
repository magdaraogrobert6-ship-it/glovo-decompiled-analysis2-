package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.model.Vendor$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.updateProperties;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isInsideContent {
    public static final Vendor$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.model.Vendor$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 71;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            updateProperties updateproperties = updateProperties.IconCompatParcelizer;
            int i4 = write + 91;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return updateproperties;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String id;
    public final DialogLayoutContent4 location;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.model.Vendor$Companion] */
    static {
        int i = serializer + 67;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ isInsideContent(int i, String str, DialogLayoutContent4 dialogLayoutContent4) {
        if (3 == (i & 3)) {
            this.id = str;
            this.location = dialogLayoutContent4;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, updateProperties.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.location.hashCode() >>> (this.id.hashCode() - 27);
        } else {
            iHashCode = (this.id.hashCode() * 31) + this.location.hashCode();
        }
        int i3 = write + 29;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Vendor(id=" + this.id + ", location=" + this.location + ")";
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 93;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof isInsideContent) {
            isInsideContent isinsidecontent = (isInsideContent) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, isinsidecontent.id}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, isinsidecontent.location}, getCieXyz.write())).booleanValue()) {
                int i3 = RemoteActionCompatParcelizer + 85;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 12 / 0;
                }
                return false;
            }
            int i5 = RemoteActionCompatParcelizer + 83;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i6 = write + 25;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return false;
    }
}
