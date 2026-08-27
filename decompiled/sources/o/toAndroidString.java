package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Payment$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaSjIZ8h4wjTz3VBZ28q5ghJxDiE;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "payment")
public final class toAndroidString extends getMediumannotations {
    public static final ScrollableComponent$Payment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$Payment$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 101;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambdaSjIZ8h4wjTz3VBZ28q5ghJxDiE r8lambdasjiz8h4wjtz3vbz28q5ghjxdie = r8lambdaSjIZ8h4wjTz3VBZ28q5ghJxDiE.IconCompatParcelizer;
                throw null;
            }
            r8lambdaSjIZ8h4wjTz3VBZ28q5ghJxDiE r8lambdasjiz8h4wjtz3vbz28q5ghjxdie2 = r8lambdaSjIZ8h4wjTz3VBZ28q5ghJxDiE.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 23;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return r8lambdasjiz8h4wjtz3vbz28q5ghjxdie2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String amount;
    public final String info;
    public final String note;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$Payment$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 101;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ toAndroidString(String str, int i, String str2, String str3, String str4) {
        if (7 == (i & 7)) {
            this.title = str;
            this.info = str2;
            this.amount = str3;
            if ((i & 8) == 0) {
                this.note = null;
                int i2 = IconCompatParcelizer + 49;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.note = str4;
            int i4 = IconCompatParcelizer + 63;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, r8lambdaSjIZ8h4wjTz3VBZ28q5ghJxDiE.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Payment(title=", this.title, ", info=", this.info, ", amount="), this.amount, ", note=", this.note, ")");
        }
        int i3 = 21 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Payment(title=", this.title, ", info=", this.info, ", amount="), this.amount, ", note=", this.note, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.info), 31, this.amount);
        String str = this.note;
        if (str == null) {
            int i4 = read + 27;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = iM + iHashCode;
        int i7 = IconCompatParcelizer + 49;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 29;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof toAndroidString)) {
            return false;
        }
        toAndroidString toandroidstring = (toAndroidString) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, toandroidstring.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.info, toandroidstring.info}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 101;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amount, toandroidstring.amount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.note, toandroidstring.note}, getCieXyz.write())).booleanValue();
    }
}
