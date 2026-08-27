package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.recentdeliveries.data.model.Item$Companion;
import kotlinx.serialization.Serializable;
import o.processPreLaunchArraysI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class processCachedDeeplinkI {
    public static final Item$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.Item$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 121;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return processPreLaunchArraysI.serializer;
            }
            processPreLaunchArraysI processprelauncharraysi = processPreLaunchArraysI.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String name;
    public final String price;
    public final int quantity;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.Item$Companion] */
    static {
        int i = IconCompatParcelizer + 51;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ processCachedDeeplinkI(int i, String str, int i2, String str2) {
        if (7 == (i & 7)) {
            this.name = str;
            this.price = str2;
            this.quantity = i2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, processPreLaunchArraysI.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.quantity) + af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.price);
        int i4 = RemoteActionCompatParcelizer + 81;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.quantity, ")", c8$$ExternalSyntheticOutline0.m("Item(name=", this.name, ", price=", this.price, ", quantity="));
        }
        af$$ExternalSyntheticOutline0.m(this.quantity, ")", c8$$ExternalSyntheticOutline0.m("Item(name=", this.name, ", price=", this.price, ", quantity="));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof processCachedDeeplinkI) {
            processCachedDeeplinkI processcacheddeeplinki = (processCachedDeeplinkI) obj;
            Object[] objArr = {this.name, processcacheddeeplinki.name};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.price, processcacheddeeplinki.price};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i5 = RemoteActionCompatParcelizer + 91;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (this.quantity != processcacheddeeplinki.quantity) {
                return false;
            }
            int i7 = write + 55;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i3 + 35;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
