package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.settings.data.model.FeedbackComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaML72hY_CMX1wfAZLomMcydj5cFg;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c {
    public static final FeedbackComponent$Companion Companion = new Object() { // from class: com.roadrunner.settings.data.model.FeedbackComponent$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return r8lambdaML72hY_CMX1wfAZLomMcydj5cFg.serializer;
            }
            r8lambdaML72hY_CMX1wfAZLomMcydj5cFg r8lambdaml72hy_cmx1wfazlommcydj5cfg = r8lambdaML72hY_CMX1wfAZLomMcydj5cFg.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String link;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.settings.data.model.FeedbackComponent$Companion] */
    static {
        int i = IconCompatParcelizer + 25;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c(int i, String str) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.link = str;
            int i2 = RemoteActionCompatParcelizer + 39;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.link = null;
        int i3 = RemoteActionCompatParcelizer + 15;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.link;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i2 + 43;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("FeedbackComponent(link=", this.link, ")");
        int i4 = RemoteActionCompatParcelizer + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return strM;
    }

    public r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c() {
        this.link = null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 55;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 81 / 0;
            }
            return true;
        }
        if (!(obj instanceof r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.link, ((r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c) obj).link}, getCieXyz.write())).booleanValue()) {
            int i10 = RemoteActionCompatParcelizer + 83;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = serializer + 35;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return true;
    }
}
