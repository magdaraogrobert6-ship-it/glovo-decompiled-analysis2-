package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.api.model.VerifyRequestData$Companion;
import kotlinx.serialization.Serializable;
import o.getTextCompositionRange;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class getTestTag {
    public static final VerifyRequestData$Companion Companion = new Object() { // from class: com.roadrunner.auth.api.model.VerifyRequestData$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 29;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getTextCompositionRange gettextcompositionrange = getTextCompositionRange.serializer;
            int i4 = serializer + 77;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return gettextcompositionrange;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String channel;
    public final String code;
    public final String phase;
    public final String phone;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.api.model.VerifyRequestData$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 47;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getTestTag(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.code = str;
            this.phone = str2;
            this.phase = str3;
            this.channel = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getTextCompositionRange.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("VerifyRequestData(code=", this.code, ", phone=", this.phone, ", phase="), this.phase, ", channel=", this.channel, ")");
        int i4 = write + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.channel.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.code.hashCode() * 31, 31, this.phone), 31, this.phase);
        int i4 = serializer + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public getTestTag(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.code = str;
        this.phone = str2;
        this.phase = "validate";
        this.channel = "sms";
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer;
            int i3 = i2 + 99;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i3 % 2 == 0;
            int i4 = i2 + 79;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return z;
        }
        if (!(obj instanceof getTestTag)) {
            return false;
        }
        getTestTag gettesttag = (getTestTag) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, gettesttag.code}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phone, gettesttag.phone}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phase, gettesttag.phase}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channel, gettesttag.channel}, getCieXyz.write())).booleanValue();
            }
            return false;
        }
        int i6 = write + 95;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
        return false;
    }
}
