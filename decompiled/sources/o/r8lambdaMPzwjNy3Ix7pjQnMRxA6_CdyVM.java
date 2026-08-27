package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.settings.data.model.PromotionalContentPermissionRequest$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaMBn6_z1YQWDDAUCe5mI6yifUog;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM {
    public static final PromotionalContentPermissionRequest$Companion Companion = new Object() { // from class: com.roadrunner.settings.data.model.PromotionalContentPermissionRequest$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 87;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambdaMBn6_z1YQWDDAUCe5mI6yifUog r8lambdambn6_z1yqwddauce5mi6yifuog = r8lambdaMBn6_z1YQWDDAUCe5mI6yifUog.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambdaMBn6_z1YQWDDAUCe5mI6yifUog r8lambdambn6_z1yqwddauce5mi6yifuog2 = r8lambdaMBn6_z1YQWDDAUCe5mI6yifUog.serializer;
            int i3 = write + 45;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return r8lambdambn6_z1yqwddauce5mi6yifuog2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String type;
    public final boolean value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.settings.data.model.PromotionalContentPermissionRequest$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 45;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM(String str, int i, boolean z) {
        if (3 == (i & 3)) {
            this.type = str;
            this.value = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, r8lambdaMBn6_z1YQWDDAUCe5mI6yifUog.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.value) + (this.type.hashCode() * 31);
        int i4 = IconCompatParcelizer + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM(String str, boolean z) {
        str.getClass();
        this.type = str;
        this.value = z;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 23;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 1;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM)) {
            int i6 = i2 + 105;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM r8lambdampzwjny3ix7pjqnmrxa6_cdyvm = (r8lambdaMPzwjNy3Ix7pjQnMRxA6_CdyVM) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, r8lambdampzwjny3ix7pjqnmrxa6_cdyvm.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.value == r8lambdampzwjny3ix7pjqnmrxa6_cdyvm.value) {
            return true;
        }
        int i7 = IconCompatParcelizer + 121;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 4 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PromotionalContentPermissionRequest(type=" + this.type + ", value=" + this.value + ")";
        int i2 = IconCompatParcelizer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
