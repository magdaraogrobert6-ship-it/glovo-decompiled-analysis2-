package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$Customer$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetSerifcp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCanLoadSynchronouslyannotations {
    public static final CustomerUnavailable$Customer$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$Customer$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 5;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetSerifcp accessgetserifcp = accessgetSerifcp.write;
            int i4 = write + 93;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return accessgetserifcp;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final accessgetMonospacecp call;
    public final accessgetSansSerifcp chat;
    public final getCanLoadSynchronously chatAndCall;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$Customer$Companion] */
    static {
        int i = write + 49;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final accessgetMonospacecp RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.call;
        }
        throw null;
    }

    public final getCanLoadSynchronously read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.chatAndCall;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 25;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 25;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final accessgetSansSerifcp write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        accessgetSansSerifcp accessgetsansserifcp = this.chat;
        int i5 = i3 + 5;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetsansserifcp;
    }

    public /* synthetic */ getCanLoadSynchronouslyannotations(int i, accessgetMonospacecp accessgetmonospacecp, accessgetSansSerifcp accessgetsansserifcp, getCanLoadSynchronously getcanloadsynchronously, String str) {
        if (8 == (i & 8)) {
            if ((i & 1) == 0) {
                this.call = null;
                int i2 = IconCompatParcelizer + 105;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.call = accessgetmonospacecp;
            }
            if ((i & 2) == 0) {
                this.chat = null;
            } else {
                this.chat = accessgetsansserifcp;
                int i5 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i6 = IconCompatParcelizer + 3;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.chatAndCall = null;
            } else {
                this.chatAndCall = getcanloadsynchronously;
            }
            this.title = str;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 8, accessgetSerifcp.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iIntValue;
        int iHashCode;
        int i = 2 % 2;
        accessgetMonospacecp accessgetmonospacecp = this.call;
        if (accessgetmonospacecp == null) {
            int i2 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iIntValue = 0;
        } else {
            iIntValue = ((Integer) accessgetMonospacecp.RemoteActionCompatParcelizer(new Object[]{accessgetmonospacecp}, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), -1401088617, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), 1401088617)).intValue();
        }
        accessgetSansSerifcp accessgetsansserifcp = this.chat;
        if (accessgetsansserifcp == null) {
            int i4 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accessgetsansserifcp.hashCode();
        }
        getCanLoadSynchronously getcanloadsynchronously = this.chatAndCall;
        return this.title.hashCode() + (((((iIntValue * 31) + iHashCode) * 31) + (getcanloadsynchronously != null ? getcanloadsynchronously.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Customer(call=" + this.call + ", chat=" + this.chat + ", chatAndCall=" + this.chatAndCall + ", title=" + this.title + ")";
        int i2 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof getCanLoadSynchronouslyannotations))) {
            getCanLoadSynchronouslyannotations getcanloadsynchronouslyannotations = (getCanLoadSynchronouslyannotations) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.call, getcanloadsynchronouslyannotations.call}, getCieXyz.write())).booleanValue()) {
                int i2 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chat, getcanloadsynchronouslyannotations.chat}, getCieXyz.write())).booleanValue()) {
                int i4 = IconCompatParcelizer + 103;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatAndCall, getcanloadsynchronouslyannotations.chatAndCall}, getCieXyz.write())).booleanValue()) {
                int i6 = RemoteActionCompatParcelizer + 85;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 47 / 0;
                }
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getcanloadsynchronouslyannotations.title}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i8 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i9 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }
}
