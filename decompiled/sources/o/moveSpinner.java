package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.liveness.recording.domain.detectMovement.MouthExpressionThresholds$Companion;
import kotlinx.serialization.Serializable;
import o.setColorSchemeColors;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class moveSpinner {
    public static final MouthExpressionThresholds$Companion Companion = new Object() { // from class: com.roadrunner.liveness.recording.domain.detectMovement.MouthExpressionThresholds$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 105;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setColorSchemeColors setcolorschemecolors = setColorSchemeColors.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 117;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return setcolorschemecolors;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final float serious;
    public final float smile;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.liveness.recording.domain.detectMovement.MouthExpressionThresholds$Companion] */
    static {
        int i = serializer + 35;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ moveSpinner(float f, float f2, int i) {
        if (3 == (i & 3)) {
            this.smile = f;
            this.serious = f2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setColorSchemeColors.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.serious) + (Float.hashCode(this.smile) * 31);
        int i4 = RemoteActionCompatParcelizer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public moveSpinner() {
        this.smile = 0.7f;
        this.serious = 0.3f;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MouthExpressionThresholds(smile=" + this.smile + ", serious=" + this.serious + ")";
        int i2 = write + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof moveSpinner) {
            moveSpinner movespinner = (moveSpinner) obj;
            return Float.compare(this.smile, movespinner.smile) == 0 && Float.compare(this.serious, movespinner.serious) == 0;
        }
        int i5 = i3 + 39;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
