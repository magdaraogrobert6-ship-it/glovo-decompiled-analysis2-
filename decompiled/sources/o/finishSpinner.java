package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline1;
import com.roadrunner.liveness.recording.domain.detectMovement.HeadMovementThresholds$Companion;
import kotlinx.serialization.Serializable;
import o.setColorSchemeResources;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class finishSpinner {
    public static final HeadMovementThresholds$Companion Companion = new Object() { // from class: com.roadrunner.liveness.recording.domain.detectMovement.HeadMovementThresholds$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 93;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setColorSchemeResources setcolorschemeresources = setColorSchemeResources.serializer;
            int i4 = serializer + 49;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setcolorschemeresources;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final float left;
    public final float leftFacing;
    public final float right;
    public final float rightFacing;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.liveness.recording.domain.detectMovement.HeadMovementThresholds$Companion] */
    static {
        int i = IconCompatParcelizer + 49;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    public /* synthetic */ finishSpinner(float f, float f2, float f3, float f4, int i) {
        if (15 == (i & 15)) {
            this.left = f;
            this.leftFacing = f2;
            this.right = f3;
            this.rightFacing = f4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setColorSchemeResources.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.rightFacing) + af$$ExternalSyntheticOutline1.m(this.right, af$$ExternalSyntheticOutline1.m(this.leftFacing, Float.hashCode(this.left) * 31, 31), 31);
        int i4 = write + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public finishSpinner() {
        this.left = 40.0f;
        this.leftFacing = 20.0f;
        this.right = -40.0f;
        this.rightFacing = -20.0f;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HeadMovementThresholds(left=" + this.left + ", leftFacing=" + this.leftFacing + ", right=" + this.right + ", rightFacing=" + this.rightFacing + ")";
        int i2 = RemoteActionCompatParcelizer + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 103;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 119;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof finishSpinner)) {
            return false;
        }
        finishSpinner finishspinner = (finishSpinner) obj;
        if (Float.compare(this.left, finishspinner.left) != 0 || Float.compare(this.leftFacing, finishspinner.leftFacing) != 0) {
            return false;
        }
        if (Float.compare(this.right, finishspinner.right) == 0) {
            if (Float.compare(this.rightFacing, finishspinner.rightFacing) == 0) {
                return true;
            }
            int i7 = write + 105;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = write + 39;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
