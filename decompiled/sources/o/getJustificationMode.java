package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$LastStopTitle$Companion;
import kotlinx.serialization.Serializable;
import o.getUseFallbackLineSpacing;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "last_stop_title")
public final class getJustificationMode extends getLineSpacingExtra {
    public static final LastStopScreen$LastStopScreenComponent$LastStopTitle$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$LastStopTitle$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 81;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getUseFallbackLineSpacing getusefallbacklinespacing = getUseFallbackLineSpacing.write;
            int i4 = IconCompatParcelizer + 125;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getusefallbacklinespacing;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String retrySubtitle;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$LastStopTitle$Companion] */
    static {
        int i = read + 5;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.subtitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 95;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 111;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.retrySubtitle;
        int i4 = i3 + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ getJustificationMode(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.title = str;
            this.subtitle = str2;
            this.retrySubtitle = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getUseFallbackLineSpacing.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.retrySubtitle.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        int i4 = serializer + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("LastStopTitle(title=", this.title, ", subtitle=", this.subtitle, ", retrySubtitle="), this.retrySubtitle, ")");
        int i4 = write + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getJustificationMode)) {
            int i5 = i3 + 9;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 11;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        getJustificationMode getjustificationmode = (getJustificationMode) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getjustificationmode.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, getjustificationmode.subtitle}, getCieXyz.write())).booleanValue()) {
            int i10 = serializer + 47;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.retrySubtitle, getjustificationmode.retrySubtitle}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i12 = serializer + 25;
        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
