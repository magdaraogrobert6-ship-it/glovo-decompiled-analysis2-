package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.data.model.MenuItemComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "menu_item")
public final class r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM implements r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k {
    public static final MenuItemComponent$Companion Companion = new Object() { // from class: com.roadrunner.sidemenu.data.model.MenuItemComponent$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 77;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU.serializer;
            }
            int i3 = 43 / 0;
            return r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU.serializer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final r8lambdahzshocQMpV5shdKumio5m5xOK0E analytics;
    public final String label;
    public final String link;
    public final String logo;
    public final String newTag;
    public final Integer unreadCount;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.sidemenu.data.model.MenuItemComponent$Companion] */
    static {
        int i = IconCompatParcelizer + 55;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM(int i, String str, String str2, String str3, String str4, r8lambdahzshocQMpV5shdKumio5m5xOK0E r8lambdahzshocqmpv5shdkumio5m5xok0e, Integer num) {
        Object obj = null;
        if (26 != (i & 26)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 26, r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU.serializer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.newTag = null;
        } else {
            this.newTag = str;
            int i2 = 2 % 2;
        }
        this.label = str2;
        if ((i & 4) == 0) {
            int i3 = serializer + 29;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                this.logo = null;
                int i4 = 68 / 0;
            } else {
                this.logo = null;
            }
        } else {
            this.logo = str3;
        }
        int i5 = 2 % 2;
        this.link = str4;
        this.analytics = r8lambdahzshocqmpv5shdkumio5m5xok0e;
        if ((i & 32) != 0) {
            this.unreadCount = num;
            return;
        }
        int i6 = read + 37;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            this.unreadCount = null;
        } else {
            this.unreadCount = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("MenuItemComponent(newTag=", this.newTag, ", label=", this.label, ", logo=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.logo, ", link=", this.link, ", analytics=");
        sbM.append(this.analytics);
        sbM.append(", unreadCount=");
        sbM.append(this.unreadCount);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.newTag;
        int iHashCode2 = 0;
        int iM = af$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.label);
        String str2 = this.logo;
        if (str2 == null) {
            int i2 = serializer + 99;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.link), 31, this.analytics.screenName);
        Integer num = this.unreadCount;
        if (num == null) {
            int i4 = read + 115;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = num.hashCode();
        }
        int i6 = iM2 + iHashCode2;
        int i7 = serializer + 89;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 105;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM)) {
            int i4 = serializer + 11;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return false;
        }
        r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM r8lambdainxoipjdmwnizvqtkwsij_9trm = (r8lambdainxoiPJdmwnizvQTKwsIJ_9tRM) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.newTag, r8lambdainxoipjdmwnizvqtkwsij_9trm.newTag}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, r8lambdainxoipjdmwnizvqtkwsij_9trm.label}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 89;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.logo, r8lambdainxoipjdmwnizvqtkwsij_9trm.logo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.link, r8lambdainxoipjdmwnizvqtkwsij_9trm.link}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.analytics, r8lambdainxoipjdmwnizvqtkwsij_9trm.analytics}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.unreadCount, r8lambdainxoipjdmwnizvqtkwsij_9trm.unreadCount}, getCieXyz.write())).booleanValue();
        }
        int i8 = read + 29;
        int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 69;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
