package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import com.roadrunner.database.entity.Menu$Companion;
import kotlinx.serialization.Serializable;
import o.PlatformParagraphStyle;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getAboveBaselineJ6kI3mc {
    public static final Menu$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.Menu$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 97;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PlatformParagraphStyle platformParagraphStyle = PlatformParagraphStyle.RemoteActionCompatParcelizer;
            int i4 = read + 89;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return platformParagraphStyle;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final boolean available;
    public final long id;
    public final String name;
    public final String price;
    public final float quantity;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.Menu$Companion] */
    static {
        int i = IconCompatParcelizer + 53;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    public /* synthetic */ getAboveBaselineJ6kI3mc(int i, long j, String str, String str2, float f, boolean z) {
        if (31 == (i & 31)) {
            this.id = j;
            this.name = str;
            this.price = str2;
            this.quantity = f;
            this.available = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, PlatformParagraphStyle.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.available) + af$$ExternalSyntheticOutline1.m(this.quantity, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name), 31, this.price), 31);
        int i4 = read + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("Menu(id=", ", name=", this.id, this.name);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(")");
        String string = sb.toString();
        int i4 = read + 105;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAboveBaselineJ6kI3mc)) {
            int i2 = write + 51;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        getAboveBaselineJ6kI3mc getabovebaselinej6ki3mc = (getAboveBaselineJ6kI3mc) obj;
        if (this.id != getabovebaselinej6ki3mc.id) {
            return false;
        }
        Object[] objArr = {this.name, getabovebaselinej6ki3mc.name};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = read + 37;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr2 = {this.price, getabovebaselinej6ki3mc.price};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i6 = read + 73;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (Float.compare(this.quantity, getabovebaselinej6ki3mc.quantity) != 0) {
            int i8 = write + 119;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 66 / 0;
            }
            return false;
        }
        if (this.available == getabovebaselinej6ki3mc.available) {
            return true;
        }
        int i10 = write + 19;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
