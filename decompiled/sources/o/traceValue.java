package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.AutoAcceptV2Data$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.trace;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept_result")
public final class traceValue extends AndroidPopup_androidKtPopup41 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final AutoAcceptV2Data$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.AutoAcceptV2Data$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            trace traceVar;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 47;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                traceVar = trace.IconCompatParcelizer;
                int i3 = 13 / 0;
            } else {
                traceVar = trace.IconCompatParcelizer;
            }
            int i4 = write + 67;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return traceVar;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final List components;
    public final List messages;
    public final String subtitle;
    public final String title;
    public final List trackingEvents;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.AutoAcceptV2Data$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(6)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(7)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(8))};
        int i = RemoteActionCompatParcelizer + 73;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.AndroidPopup_androidKtPopup41
    public final String read() {
        int i = 2 % 2;
        int i2 = read + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public /* synthetic */ traceValue(int i, String str, String str2, String str3, List list, List list2, List list3) {
        if (10 != (i & 10)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 10, trace.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = "auto_accept_result";
        }
        this.type = str;
        this.title = str2;
        if ((i & 4) == 0) {
            int i3 = IconCompatParcelizer + 23;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        this.components = list;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & 16) == 0) {
            int i5 = IconCompatParcelizer + 29;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                this.messages = instance_delegatelambda0Var;
                int i6 = 80 / 0;
            } else {
                this.messages = instance_delegatelambda0Var;
            }
            int i7 = 2 % 2;
        } else {
            this.messages = list2;
        }
        if ((i & 32) != 0) {
            this.trackingEvents = list3;
            return;
        }
        this.trackingEvents = instance_delegatelambda0Var;
        int i8 = read + 85;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AutoAcceptV2Data(type=", this.type, ", title=", this.title, ", subtitle=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.subtitle, ", components=", this.components, ", messages=");
        sbM.append(this.messages);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.type;
        if (str == null) {
            int i2 = read + 39;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = IconCompatParcelizer + 9;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.title);
        String str2 = this.subtitle;
        if (str2 == null) {
            int i6 = read + 67;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.components, (iM + iHashCode2) * 31, 31);
        List list = this.messages;
        int iHashCode3 = this.trackingEvents.hashCode() + ((iM2 + (list != null ? list.hashCode() : 0)) * 31);
        int i8 = IconCompatParcelizer + 17;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 55;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 41;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof traceValue)) {
            return false;
        }
        traceValue tracevalue = (traceValue) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, tracevalue.type}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, tracevalue.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, tracevalue.subtitle}, getCieXyz.write())).booleanValue()) {
                int i6 = read + 63;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, tracevalue.components}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, tracevalue.messages}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, tracevalue.trackingEvents}, getCieXyz.write())).booleanValue();
        }
        int i8 = IconCompatParcelizer + 99;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
