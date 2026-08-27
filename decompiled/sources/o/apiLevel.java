package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationUiItem$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Preview;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class apiLevel {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final int currentAttemptCount;
    public final mapTreeWithStitching errorMessage;
    public final int iterations;
    public final int outputLength;
    public final C0212wallpaper pinAttempts;
    public final String pinHash;
    public final String pinSecret;
    public final boolean pinVerified;
    public final mapTreeWithStitching successMessage;
    public final List trackingEvents;
    public static final OfflineValidationUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationUiItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 65;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return Preview.read;
            }
            int i3 = 7 / 0;
            return Preview.read;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(1)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationUiItem$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 73;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final C0212wallpaper IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 69;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        C0212wallpaper c0212wallpaper = this.pinAttempts;
        int i5 = i2 + 25;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return c0212wallpaper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = this.currentAttemptCount;
        int i6 = i3 + 95;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.pinVerified;
        int i5 = i3 + 67;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public /* synthetic */ apiLevel(int i, String str, String str2, int i2, int i3, mapTreeWithStitching maptreewithstitching, mapTreeWithStitching maptreewithstitching2, C0212wallpaper c0212wallpaper, List list, int i4, boolean z) {
        if (255 != (i & 255)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, Preview.read.getDescriptor());
            throw null;
        }
        this.pinSecret = str;
        this.pinHash = str2;
        this.iterations = i2;
        this.outputLength = i3;
        this.successMessage = maptreewithstitching;
        this.errorMessage = maptreewithstitching2;
        this.pinAttempts = c0212wallpaper;
        this.trackingEvents = list;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.currentAttemptCount = 0;
            int i5 = 2 % 2;
        } else {
            this.currentAttemptCount = i4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
            this.pinVerified = z;
            return;
        }
        int i6 = serializer + 27;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i7;
        int i8 = i6 % 2;
        this.pinVerified = false;
        int i9 = i7 + 71;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public static apiLevel IconCompatParcelizer(apiLevel apilevel, C0212wallpaper c0212wallpaper, int i, boolean z, int i2) {
        C0212wallpaper c0212wallpaper2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 71;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i5;
        int i6 = i4 % 2;
        String str = apilevel.pinSecret;
        String str2 = apilevel.pinHash;
        int i7 = apilevel.iterations;
        int i8 = apilevel.outputLength;
        mapTreeWithStitching maptreewithstitching = apilevel.successMessage;
        mapTreeWithStitching maptreewithstitching2 = apilevel.errorMessage;
        if ((i2 & 64) != 0) {
            int i9 = i5 + 57;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            C0212wallpaper c0212wallpaper3 = apilevel.pinAttempts;
            int i11 = i5 + 59;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            c0212wallpaper2 = c0212wallpaper3;
        } else {
            c0212wallpaper2 = c0212wallpaper;
        }
        List list = apilevel.trackingEvents;
        apilevel.getClass();
        str.getClass();
        str2.getClass();
        maptreewithstitching.getClass();
        maptreewithstitching2.getClass();
        c0212wallpaper2.getClass();
        list.getClass();
        return new apiLevel(str, str2, i7, i8, maptreewithstitching, maptreewithstitching2, c0212wallpaper2, list, i, z);
    }

    public apiLevel(String str, String str2, int i, int i2, mapTreeWithStitching maptreewithstitching, mapTreeWithStitching maptreewithstitching2, C0212wallpaper c0212wallpaper, List list, int i3, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.pinSecret = str;
        this.pinHash = str2;
        this.iterations = i;
        this.outputLength = i2;
        this.successMessage = maptreewithstitching;
        this.errorMessage = maptreewithstitching2;
        this.pinAttempts = c0212wallpaper;
        this.trackingEvents = list;
        this.currentAttemptCount = i3;
        this.pinVerified = z;
    }

    public /* synthetic */ apiLevel(String str, String str2, int i, int i2, mapTreeWithStitching maptreewithstitching, mapTreeWithStitching maptreewithstitching2, C0212wallpaper c0212wallpaper, List list) {
        this(str, str2, i, i2, maptreewithstitching, maptreewithstitching2, c0212wallpaper, list, 0, false);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.outputLength, af$$ExternalSyntheticOutline0.m(this.iterations, af$$ExternalSyntheticOutline0.m(this.pinSecret.hashCode() * 31, 31, this.pinHash), 31), 31);
        int iHashCode = this.successMessage.hashCode();
        int iHashCode2 = this.errorMessage.hashCode();
        int iHashCode3 = Boolean.hashCode(this.pinVerified) + af$$ExternalSyntheticOutline0.m(this.currentAttemptCount, c8$$ExternalSyntheticOutline0.m(this.trackingEvents, (this.pinAttempts.hashCode() + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31, 31), 31);
        int i4 = IconCompatParcelizer + 13;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("OfflineValidationUiItem(pinSecret=", this.pinSecret, ", pinHash=", this.pinHash, ", iterations=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.iterations, this.outputLength, ", outputLength=", ", successMessage=", sbM);
        sbM.append(this.successMessage);
        sbM.append(", errorMessage=");
        sbM.append(this.errorMessage);
        sbM.append(", pinAttempts=");
        sbM.append(this.pinAttempts);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(", currentAttemptCount=");
        sbM.append(this.currentAttemptCount);
        sbM.append(", pinVerified=");
        sbM.append(this.pinVerified);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 57;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof apiLevel)) {
            return false;
        }
        apiLevel apilevel = (apiLevel) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinSecret, apilevel.pinSecret}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinHash, apilevel.pinHash}, getCieXyz.write())).booleanValue() || this.iterations != apilevel.iterations || this.outputLength != apilevel.outputLength) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, apilevel.successMessage}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, apilevel.errorMessage}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinAttempts, apilevel.pinAttempts}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, apilevel.trackingEvents}, getCieXyz.write())).booleanValue() || this.currentAttemptCount != apilevel.currentAttemptCount || this.pinVerified != apilevel.pinVerified) {
                return false;
            }
            int i4 = serializer + 95;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = serializer + 101;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
