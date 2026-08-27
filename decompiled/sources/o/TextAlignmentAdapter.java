package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SetStopButton$Companion;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.TextAndroidCanvas;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "set_stop_button")
public final class TextAlignmentAdapter extends getLineSpacingExtra {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final LastStopScreen$LastStopScreenComponent$SetStopButton$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SetStopButton$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 105;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            TextAndroidCanvas textAndroidCanvas = TextAndroidCanvas.read;
            int i4 = read + 59;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return textAndroidCanvas;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final Map data;
    public final String failureMessage;
    public final String successMessage;
    public final String title;
    public final List trackingEvents;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SetStopButton$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(23)), null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(24))};
        int i = IconCompatParcelizer + 19;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.trackingEvents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.successMessage;
        }
        int i3 = 26 / 0;
        return this.successMessage;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.failureMessage;
        int i5 = i2 + 29;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public /* synthetic */ TextAlignmentAdapter(int i, String str, String str2, Map map, String str3, String str4, List list) {
        if (31 == (i & 31)) {
            this.title = str;
            this.url = str2;
            this.data = map;
            this.failureMessage = str3;
            this.successMessage = str4;
            if ((i & 32) == 0) {
                this.trackingEvents = instance_delegatelambda0.write;
                int i2 = RemoteActionCompatParcelizer + 109;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.trackingEvents = list;
            int i4 = RemoteActionCompatParcelizer + 11;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, TextAndroidCanvas.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.trackingEvents.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(IconCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.url), this.data, 31), 31, this.failureMessage), 31, this.successMessage);
        int i4 = RemoteActionCompatParcelizer + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SetStopButton(title=", this.title, ", url=", this.url, ", data=");
        sbM.append(this.data);
        sbM.append(", failureMessage=");
        sbM.append(this.failureMessage);
        sbM.append(", successMessage=");
        String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sbM, this.successMessage, ", trackingEvents=", this.trackingEvents, ")");
        int i4 = RemoteActionCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 111;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof TextAlignmentAdapter)) {
            return false;
        }
        TextAlignmentAdapter textAlignmentAdapter = (TextAlignmentAdapter) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, textAlignmentAdapter.title}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 101;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, textAlignmentAdapter.url}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, textAlignmentAdapter.data}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.failureMessage, textAlignmentAdapter.failureMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, textAlignmentAdapter.successMessage}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, textAlignmentAdapter.trackingEvents}, getCieXyz.write())).booleanValue();
        }
        int i8 = RemoteActionCompatParcelizer + 49;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
