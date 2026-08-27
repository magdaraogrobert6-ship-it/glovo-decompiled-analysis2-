package o;

import com.roadrunner.liveness.recording.domain.detectMovement.DetectionThresholds$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setColorViewAlpha {
    public static final DetectionThresholds$Companion Companion = new DetectionThresholds$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final finishSpinner headMovement;
    public final moveSpinner mouthExpression;

    static {
        int i = RemoteActionCompatParcelizer + 73;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ setColorViewAlpha(int i, moveSpinner movespinner, finishSpinner finishspinner) {
        if (3 == (i & 3)) {
            this.mouthExpression = movespinner;
            this.headMovement = finishspinner;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getProgressCircleDiameter.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.headMovement.hashCode() >>> (this.mouthExpression.hashCode() >> 7);
        }
        return (this.mouthExpression.hashCode() * 31) + this.headMovement.hashCode();
    }

    public setColorViewAlpha(moveSpinner movespinner, finishSpinner finishspinner) {
        this.mouthExpression = movespinner;
        this.headMovement = finishspinner;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DetectionThresholds(mouthExpression=" + this.mouthExpression + ", headMovement=" + this.headMovement + ")";
        int i2 = serializer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setColorViewAlpha)) {
            return false;
        }
        setColorViewAlpha setcolorviewalpha = (setColorViewAlpha) obj;
        Object[] objArr = {this.mouthExpression, setcolorviewalpha.mouthExpression};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.headMovement, setcolorviewalpha.headMovement};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 31;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
