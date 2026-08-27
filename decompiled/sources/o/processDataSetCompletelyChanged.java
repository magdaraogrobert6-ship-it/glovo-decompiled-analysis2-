package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.inappnotifications.data.ButtonComponent$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.releaseVerticalGlow1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "button")
public final class processDataSetCompletelyChanged implements setLayoutManager, setRecyclerListener {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final releaseHorizontalGlow action;
    public final String id;
    public final String style;
    public final String text;
    public final Float weight;
    public static final ButtonComponent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.ButtonComponent$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 3;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            releaseVerticalGlow1 releaseverticalglow1 = releaseVerticalGlow1.read;
            int i4 = serializer + 125;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
            return releaseverticalglow1;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(23))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.ButtonComponent$Companion] */
    static {
        int i = IconCompatParcelizer + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public /* synthetic */ processDataSetCompletelyChanged(int i, String str, String str2, String str3, Float f, releaseHorizontalGlow releasehorizontalglow) {
        if (23 != (i & 23)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 23, releaseVerticalGlow1.read.getDescriptor());
            throw null;
        }
        this.id = str;
        this.text = str2;
        this.style = str3;
        if ((i & 8) == 0) {
            this.weight = null;
            int i2 = serializer + 31;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.weight = f;
            int i5 = RemoteActionCompatParcelizer + 35;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.action = releasehorizontalglow;
        int i7 = serializer + 73;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text), 31, this.style);
        Float f = this.weight;
        if (f == null) {
            int i3 = serializer + 71;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = f.hashCode();
            int i5 = serializer + 57;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return this.action.hashCode() + ((iM + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ButtonComponent(id=", this.id, ", text=", this.text, ", style=");
        sbM.append(this.style);
        sbM.append(", weight=");
        sbM.append(this.weight);
        sbM.append(", action=");
        sbM.append(this.action);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 85;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof processDataSetCompletelyChanged)) {
            return false;
        }
        processDataSetCompletelyChanged processdatasetcompletelychanged = (processDataSetCompletelyChanged) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, processdatasetcompletelychanged.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, processdatasetcompletelychanged.text}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, processdatasetcompletelychanged.style}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weight, processdatasetcompletelychanged.weight}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, processdatasetcompletelychanged.action}, getCieXyz.write())).booleanValue();
                }
                int i2 = RemoteActionCompatParcelizer + 71;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 5;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 69;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
