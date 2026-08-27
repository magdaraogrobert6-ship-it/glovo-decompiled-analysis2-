package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.MessageBox$Companion;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlinx.serialization.Serializable;
import o.r8lambdapHKjrxD645VvJMKONPIiIcYf6fY;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class preloadlambda1 {
    public static final MessageBox$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.MessageBox$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            r8lambdapHKjrxD645VvJMKONPIiIcYf6fY r8lambdaphkjrxd645vvjmkonpiiicyf6fy;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
                int i3 = 98 / 0;
            } else {
                r8lambdaphkjrxd645vvjmkonpiiicyf6fy = r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write;
            }
            int i4 = IconCompatParcelizer + 91;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdaphkjrxd645vvjmkonpiiicyf6fy;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String body;
    public final getDismissOnBackPress buttonData;
    public final TagIconTokenV1 icon;
    public final String title;
    public final MessageBoxTypeToken type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.MessageBox$Companion] */
    static {
        int i = IconCompatParcelizer + 11;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TagIconTokenV1 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 125;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        TagIconTokenV1 tagIconTokenV1 = this.icon;
        int i4 = i2 + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return tagIconTokenV1;
    }

    public final getDismissOnBackPress RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.buttonData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.title;
            int i4 = 94 / 0;
        } else {
            str = this.title;
        }
        int i5 = i2 + 121;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.body;
        }
        int i3 = 99 / 0;
        return this.body;
    }

    public final MessageBoxTypeToken write() {
        int i = 2 % 2;
        int i2 = read + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.type;
        }
        throw null;
    }

    public /* synthetic */ preloadlambda1(int i, TagIconTokenV1 tagIconTokenV1, String str, String str2, getDismissOnBackPress getdismissonbackpress, MessageBoxTypeToken messageBoxTypeToken) {
        if (16 != (i & 16)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 16, r8lambdapHKjrxD645VvJMKONPIiIcYf6fY.write.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = tagIconTokenV1;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.body = null;
            int i2 = 2 % 2;
        } else {
            this.body = str2;
        }
        if ((i & 8) == 0) {
            int i3 = read;
            int i4 = i3 + 55;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.buttonData = null;
            int i6 = i3 + 39;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.buttonData = getdismissonbackpress;
        }
        this.type = messageBoxTypeToken;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        TagIconTokenV1 tagIconTokenV1 = this.icon;
        int iHashCode2 = tagIconTokenV1 == null ? 0 : tagIconTokenV1.hashCode();
        String str = this.title;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.body;
        if (str2 == null) {
            int i2 = serializer + 39;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        getDismissOnBackPress getdismissonbackpress = this.buttonData;
        int iHashCode4 = this.type.hashCode() + (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (getdismissonbackpress != null ? getdismissonbackpress.hashCode() : 0)) * 31);
        int i7 = read + 93;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return iHashCode4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof preloadlambda1)) {
            int i2 = serializer + 73;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        preloadlambda1 preloadlambda1Var = (preloadlambda1) obj;
        if (this.icon != preloadlambda1Var.icon) {
            int i3 = serializer;
            int i4 = i3 + 23;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = true ^ (i4 % 2 == 0);
            int i5 = i3 + 3;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return z;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, preloadlambda1Var.title}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.body, preloadlambda1Var.body}, getCieXyz.write())).booleanValue()) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.buttonData, preloadlambda1Var.buttonData}, getCieXyz.write())).booleanValue() ^ true) && this.type == preloadlambda1Var.type;
            }
            return false;
        }
        int i7 = read + 35;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MessageBox(icon=" + this.icon + ", title=" + this.title + ", body=" + this.body + ", buttonData=" + this.buttonData + ", type=" + this.type + ")";
        int i2 = serializer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
