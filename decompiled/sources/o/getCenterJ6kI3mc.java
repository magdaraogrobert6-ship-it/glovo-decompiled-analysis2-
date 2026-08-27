package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.database.entity.CashCollection$Companion;
import kotlinx.serialization.Serializable;
import o.getBottomJ6kI3mc;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getCenterJ6kI3mc {
    public static final CashCollection$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.CashCollection$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 67;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getBottomJ6kI3mc.RemoteActionCompatParcelizer;
            }
            getBottomJ6kI3mc getbottomj6ki3mc = getBottomJ6kI3mc.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final int changeFor;
    public final int collectAtDropoff;
    public final int payAtPickup;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.CashCollection$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 15;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getCenterJ6kI3mc(int i, int i2, int i3, int i4) {
        int i5;
        if ((i & 1) == 0) {
            this.changeFor = 0;
            i5 = read + 57;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            this.changeFor = i2;
            i5 = IconCompatParcelizer + 99;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i6 = i5 % 2;
        int i7 = 2 % 2;
        if ((i & 2) == 0) {
            this.collectAtDropoff = 0;
        } else {
            this.collectAtDropoff = i3;
            int i8 = 2 % 2;
        }
        if ((i & 4) != 0) {
            this.payAtPickup = i4;
            return;
        }
        this.payAtPickup = 0;
        int i9 = IconCompatParcelizer + 13;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return af$$ExternalSyntheticOutline0.m(this.collectAtDropoff, Integer.hashCode(this.changeFor) * 31, 31) + Integer.hashCode(this.payAtPickup);
        }
        return Integer.hashCode(this.payAtPickup) << af$$ExternalSyntheticOutline0.m(this.collectAtDropoff, Integer.hashCode(this.changeFor) % 55, 126);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.payAtPickup, ")", m1$$ExternalSyntheticOutline0.m(this.changeFor, this.collectAtDropoff, "CashCollection(changeFor=", ", collectAtDropoff=", ", payAtPickup="));
        }
        af$$ExternalSyntheticOutline0.m(this.payAtPickup, ")", m1$$ExternalSyntheticOutline0.m(this.changeFor, this.collectAtDropoff, "CashCollection(changeFor=", ", collectAtDropoff=", ", payAtPickup="));
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 123;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getCenterJ6kI3mc)) {
            return false;
        }
        getCenterJ6kI3mc getcenterj6ki3mc = (getCenterJ6kI3mc) obj;
        if (this.changeFor != getcenterj6ki3mc.changeFor) {
            return false;
        }
        if (this.collectAtDropoff == getcenterj6ki3mc.collectAtDropoff) {
            if (this.payAtPickup != getcenterj6ki3mc.payAtPickup) {
                int i4 = read + 39;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 75;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = IconCompatParcelizer + 41;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
