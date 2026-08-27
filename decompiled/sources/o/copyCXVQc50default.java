package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse$Companion;
import kotlinx.serialization.Serializable;
import o.TextStyle;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class copyCXVQc50default {
    public static final AutoAcceptEarningsResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 21;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return TextStyle.write;
            }
            TextStyle textStyle = TextStyle.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final copyHL5avdYdefault data;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.data.models.AutoAcceptEarningsResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ copyCXVQc50default(int i, copyHL5avdYdefault copyhl5avdydefault) {
        if ((i & 1) == 0) {
            this.data = null;
            int i2 = serializer + 125;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.data = copyhl5avdydefault;
        int i4 = serializer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1.hashCode();
        r2 = o.copyCXVQc50default.serializer + 35;
        o.copyCXVQc50default.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.copyCXVQc50default.IconCompatParcelizer
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.copyCXVQc50default.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            o.copyHL5avdYdefault r1 = r4.data
            r3 = 9
            int r3 = r3 / r2
            if (r1 != 0) goto L1c
            goto L1b
        L17:
            o.copyHL5avdYdefault r1 = r4.data
            if (r1 != 0) goto L1c
        L1b:
            return r2
        L1c:
            int r1 = r1.hashCode()
            int r2 = o.copyCXVQc50default.serializer
            int r2 = r2 + 35
            int r3 = r2 % 128
            o.copyCXVQc50default.IconCompatParcelizer = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.copyCXVQc50default.hashCode():int");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AutoAcceptEarningsResponse(data=" + this.data + ")";
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyCXVQc50default)) {
            return false;
        }
        Object[] objArr = {this.data, ((copyCXVQc50default) obj).data};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = IconCompatParcelizer + 35;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 103;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
        return false;
    }
}
