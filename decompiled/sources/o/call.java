package o;

import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Toggle$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class call extends onActivityPrePaused {
    public static final NestAutoAcceptComponent$SubComponent$Toggle$Companion Companion = new NestAutoAcceptComponent$SubComponent$Toggle$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final String title;
    public final String type;

    static {
        int i = serializer + 55;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public call(int i, String str, String str2, String str3) {
        if (1 == (i & 1)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.description = null;
            } else {
                this.description = str2;
                int i2 = 2 % 2;
            }
            if ((i & 4) == 0) {
                int i3 = IconCompatParcelizer + 17;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                this.type = "toggle";
                return;
            }
            this.type = str3;
            int i5 = IconCompatParcelizer + 75;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Toggle(title=", this.title, ", description=", this.description, ")");
        int i4 = IconCompatParcelizer + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        String str = this.description;
        int i4 = 1;
        if (str == null) {
            int i5 = write + 113;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i4 = 0;
            }
        } else {
            int iHashCode2 = str.hashCode();
            int i6 = write + 1;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i4 = iHashCode2;
        }
        return (iHashCode * 31) + i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 97;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof call))) {
            call callVar = (call) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, callVar.title}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, callVar.description}, getCieXyz.write())).booleanValue();
            }
            int i4 = IconCompatParcelizer + 19;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 117;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
