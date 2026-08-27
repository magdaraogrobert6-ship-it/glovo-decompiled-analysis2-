package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$ActionCardUiItem$ActionState$Companion;
import kotlinx.serialization.Serializable;
import o.addMaxWithMinimum;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ConstraintsKt {
    public static final UtccComponentUiItem$ActionCardUiItem$ActionState$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$ActionCardUiItem$ActionState$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 13;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            addMaxWithMinimum addmaxwithminimum = addMaxWithMinimum.serializer;
            int i4 = IconCompatParcelizer + 51;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return addmaxwithminimum;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String animation;
    public final ComposeAnimationState button;
    public final String description;
    public final mapTreeWithStitching messageBox;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$ActionCardUiItem$ActionState$Companion] */
    static {
        int i = write + 105;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ConstraintsKt(int i, String str, mapTreeWithStitching maptreewithstitching, ComposeAnimationState composeAnimationState, String str2) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.messageBox = null;
        } else {
            this.messageBox = maptreewithstitching;
        }
        if ((i & 4) == 0) {
            int i2 = read + 29;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.button = null;
            int i4 = 2 % 2;
        } else {
            this.button = composeAnimationState;
        }
        if ((i & 8) != 0) {
            this.animation = str2;
            return;
        }
        int i5 = RemoteActionCompatParcelizer + 65;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        this.animation = null;
    }

    public ConstraintsKt(String str, mapTreeWithStitching maptreewithstitching, ComposeAnimationState composeAnimationState, String str2) {
        this.description = str;
        this.messageBox = maptreewithstitching;
        this.button = composeAnimationState;
        this.animation = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.description;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        mapTreeWithStitching maptreewithstitching = this.messageBox;
        if (maptreewithstitching == null) {
            int i4 = RemoteActionCompatParcelizer + 35;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = maptreewithstitching.hashCode();
        }
        ComposeAnimationState composeAnimationState = this.button;
        int iHashCode4 = composeAnimationState == null ? 0 : composeAnimationState.hashCode();
        String str2 = this.animation;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i6 = RemoteActionCompatParcelizer + 91;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 / 4;
            }
        }
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ActionState(description=" + this.description + ", messageBox=" + this.messageBox + ", button=" + this.button + ", animation=" + this.animation + ")";
        int i2 = read + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 29;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ConstraintsKt)) {
            return false;
        }
        ConstraintsKt constraintsKt = (ConstraintsKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, constraintsKt.description}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 57;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageBox, constraintsKt.messageBox}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, constraintsKt.button}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 53;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.animation, constraintsKt.animation}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 19;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
