package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.PrimaryButton$Action$Companion;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontListFontFamily;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontListFontFamilyTypefaceAdapter {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final Map data;
    public final String method;
    public final String path;
    public static final PrimaryButton$Action$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.PrimaryButton$Action$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 47;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontListFontFamily fontListFontFamily = FontListFontFamily.serializer;
            int i4 = read + 51;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return fontListFontFamily;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(5)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.PrimaryButton$Action$Companion] */
    static {
        int i = serializer + 57;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.method;
        int i5 = i3 + 87;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final Map serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.path;
        int i4 = i3 + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(String str, int i, Map map, String str2) {
        if (7 == (i & 7)) {
            this.data = map;
            this.method = str;
            this.path = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, FontListFontFamily.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.path.hashCode() - af$$ExternalSyntheticOutline0.m(this.data.hashCode() >>> 56, 63, this.method);
        } else {
            iHashCode = this.path.hashCode() + af$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.method);
        }
        int i3 = RemoteActionCompatParcelizer + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Action(data=");
        sb.append(this.data);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", path=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.path, ")");
        int i2 = RemoteActionCompatParcelizer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof FontListFontFamilyTypefaceAdapter)) {
                return false;
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = (FontListFontFamilyTypefaceAdapter) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, fontListFontFamilyTypefaceAdapter.data}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.method, fontListFontFamilyTypefaceAdapter.method}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.path, fontListFontFamilyTypefaceAdapter.path}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 69;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 115;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }
}
