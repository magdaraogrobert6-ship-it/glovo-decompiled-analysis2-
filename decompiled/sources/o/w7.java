package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.SectionResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.X;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w7 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final List icons;
    public final String text;
    public final String type;
    public static final SectionResponse$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.SectionResponse$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 29;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return X.serializer;
            }
            int i3 = 92 / 0;
            return X.serializer;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(14)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.SectionResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 61;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        List list = this.icons;
        int i5 = i3 + 77;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            str = this.text;
            int i4 = 51 / 0;
        } else {
            str = this.text;
        }
        int i5 = i3 + 21;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 63;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.type;
            int i4 = 43 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 103;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    public /* synthetic */ w7(int i, String str, String str2, List list) {
        int i2;
        if ((i & 1) == 0) {
            list = instance_delegatelambda0.write;
            int i3 = 2 % 2;
        }
        this.icons = list;
        if ((i & 2) != 0) {
            this.text = str;
            int i4 = serializer + 53;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
            }
            if ((i & 4) == 0) {
                this.type = "";
                return;
            }
            this.type = str2;
            i2 = write + 85;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
        this.text = "";
        int i5 = serializer + 117;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        if ((i & 4) == 0) {
            this.type = "";
            return;
        }
        this.type = str2;
        i2 = write + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.type.hashCode() % af$$ExternalSyntheticOutline0.m(this.icons.hashCode() - 29, 10, this.text);
        }
        return this.type.hashCode() + af$$ExternalSyntheticOutline0.m(this.icons.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SectionResponse(icons=");
        sb.append(this.icons);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", type=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.type, ")");
        int i2 = write + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        Object[] objArr = {this.icons, w7Var.icons};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.text, w7Var.text};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.type, w7Var.type};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = serializer + 83;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = serializer + 87;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 1 / 0;
        }
        return false;
    }
}
