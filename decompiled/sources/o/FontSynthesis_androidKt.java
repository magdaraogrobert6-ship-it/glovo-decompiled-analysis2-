package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.UtccComponent$ActionCard$UtccActionState$Companion;
import kotlinx.serialization.Serializable;
import o.FontSynthesisKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontSynthesis_androidKt {
    public static final UtccComponent$ActionCard$UtccActionState$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.UtccComponent$ActionCard$UtccActionState$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            FontSynthesisKt fontSynthesisKt;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 83;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                fontSynthesisKt = FontSynthesisKt.serializer;
                int i3 = 2 / 0;
            } else {
                fontSynthesisKt = FontSynthesisKt.serializer;
            }
            int i4 = RemoteActionCompatParcelizer + 29;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return fontSynthesisKt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String animation;
    public final getDismissOnBackPress button;
    public final String description;
    public final preloadlambda1 messageBox;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.UtccComponent$ActionCard$UtccActionState$Companion] */
    static {
        int i = serializer + 53;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.description;
            int i4 = 26 / 0;
        } else {
            str = this.description;
        }
        int i5 = i2 + 41;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final preloadlambda1 read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        preloadlambda1 preloadlambda1Var = this.messageBox;
        int i5 = i2 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return preloadlambda1Var;
        }
        throw null;
    }

    public final getDismissOnBackPress serializer() {
        int i = 2 % 2;
        int i2 = read + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getDismissOnBackPress getdismissonbackpress = this.button;
        int i4 = i3 + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getdismissonbackpress;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.animation;
        }
        throw null;
    }

    public /* synthetic */ FontSynthesis_androidKt(int i, String str, preloadlambda1 preloadlambda1Var, getDismissOnBackPress getdismissonbackpress, String str2) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.messageBox = null;
            int i3 = read + 111;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        } else {
            this.messageBox = preloadlambda1Var;
        }
        if ((i & 4) == 0) {
            int i5 = IconCompatParcelizer + 107;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.button = null;
        } else {
            this.button = getdismissonbackpress;
        }
        if ((i & 8) != 0) {
            this.animation = str2;
            return;
        }
        int i7 = read + 31;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i8;
        if (i7 % 2 != 0) {
            this.animation = null;
            int i9 = 80 / 0;
        } else {
            this.animation = null;
        }
        int i10 = i8 + 1;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? (str = this.description) != null : (str = this.description) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 43;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        preloadlambda1 preloadlambda1Var = this.messageBox;
        if (preloadlambda1Var == null) {
            int i6 = IconCompatParcelizer + 59;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = preloadlambda1Var.hashCode();
        }
        getDismissOnBackPress getdismissonbackpress = this.button;
        int iHashCode3 = getdismissonbackpress == null ? 0 : getdismissonbackpress.hashCode();
        String str2 = this.animation;
        int iHashCode4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i7 = IconCompatParcelizer + 1;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UtccActionState(description=" + this.description + ", messageBox=" + this.messageBox + ", button=" + this.button + ", animation=" + this.animation + ")";
        int i2 = IconCompatParcelizer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 9;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontSynthesis_androidKt)) {
            int i4 = read + 25;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 33 / 0;
            }
            return false;
        }
        FontSynthesis_androidKt fontSynthesis_androidKt = (FontSynthesis_androidKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, fontSynthesis_androidKt.description}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 21;
            int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 33;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageBox, fontSynthesis_androidKt.messageBox}, getCieXyz.write())).booleanValue()) {
            int i11 = IconCompatParcelizer + 121;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, fontSynthesis_androidKt.button}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.animation, fontSynthesis_androidKt.animation}, getCieXyz.write())).booleanValue();
    }
}
