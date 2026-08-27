package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$PaymentOption$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidDialog_androidKtDialogdialog11111;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidDialog_androidKtDialog21 {
    public static final StateV3$AcceptData$PaymentOption$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$PaymentOption$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 29;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return AndroidDialog_androidKtDialogdialog11111.IconCompatParcelizer;
            }
            int i3 = 62 / 0;
            return AndroidDialog_androidKtDialogdialog11111.IconCompatParcelizer;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String id;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$PaymentOption$Companion] */
    static {
        int i = write + 31;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        int i3 = 14 / 0;
        return this.id;
    }

    public /* synthetic */ AndroidDialog_androidKtDialog21(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.id = str;
            this.title = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidDialog_androidKtDialogdialog11111.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PaymentOption(id=", this.id, ", title=", this.title, ")");
        int i4 = RemoteActionCompatParcelizer + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title.hashCode() << (this.id.hashCode() << 15);
        }
        return (this.id.hashCode() * 31) + this.title.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 31;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof AndroidDialog_androidKtDialog21)) {
                return false;
            }
            AndroidDialog_androidKtDialog21 androidDialog_androidKtDialog21 = (AndroidDialog_androidKtDialog21) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, androidDialog_androidKtDialog21.id}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidDialog_androidKtDialog21.title}, getCieXyz.write())).booleanValue()) {
                    int i5 = serializer + 49;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = serializer + 69;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i8 = RemoteActionCompatParcelizer + 59;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 != 0;
        }
        int i9 = i2 + 15;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
