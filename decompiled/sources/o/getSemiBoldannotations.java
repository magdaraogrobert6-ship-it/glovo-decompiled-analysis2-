package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$ArrivalTime$Companion;
import kotlinx.serialization.Serializable;
import o.getExtraLightannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "arrival_time")
public final class getSemiBoldannotations extends getMediumannotations {
    public static final ScrollableComponent$ArrivalTime$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$ArrivalTime$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            getExtraLightannotations getextralightannotations;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 29;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getextralightannotations = getExtraLightannotations.write;
                int i3 = 95 / 0;
            } else {
                getextralightannotations = getExtraLightannotations.write;
            }
            int i4 = RemoteActionCompatParcelizer + 41;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getextralightannotations;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String action;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$ArrivalTime$Companion] */
    static {
        int i = read + 3;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getSemiBoldannotations(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.text = str;
            if ((i & 2) == 0) {
                this.action = null;
                int i2 = write + 43;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.action = str2;
            int i4 = RemoteActionCompatParcelizer + 49;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getExtraLightannotations.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = write + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ArrivalTime(text=", this.text, ", action=", this.action, ")");
            int i3 = 46 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ArrivalTime(text=", this.text, ", action=", this.action, ")");
        }
        int i4 = write + 87;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.text.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.text.hashCode();
        String str = this.action;
        if (str == null) {
            int i4 = write + 11;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 85;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i9 = RemoteActionCompatParcelizer + 115;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSemiBoldannotations)) {
            return false;
        }
        getSemiBoldannotations getsemiboldannotations = (getSemiBoldannotations) obj;
        Object[] objArr = {this.text, getsemiboldannotations.text};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.action, getsemiboldannotations.action};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i2 = write + 43;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
