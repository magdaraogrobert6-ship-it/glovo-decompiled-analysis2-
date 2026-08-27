package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$App$Release$Rollout$Companion;
import kotlinx.serialization.Serializable;
import o.emptyAnnotatedString;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class decapitalizedefault {
    public static final ManifestResponse$App$Release$Rollout$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$App$Release$Rollout$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 37;
            read = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                emptyAnnotatedString emptyannotatedstring = emptyAnnotatedString.serializer;
                obj.hashCode();
                throw null;
            }
            emptyAnnotatedString emptyannotatedstring2 = emptyAnnotatedString.serializer;
            int i3 = serializer + 115;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return emptyannotatedstring2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final int rampSeconds;
    public final String rolloutHashInput;
    public final String startAt;
    public final int targetPercentage;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ManifestResponse$App$Release$Rollout$Companion] */
    static {
        int i = IconCompatParcelizer + 77;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.startAt;
        }
        throw null;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = this.rampSeconds;
        int i6 = i3 + 85;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.targetPercentage;
        }
        int i3 = 5 / 0;
        return this.targetPercentage;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.rolloutHashInput;
        int i5 = i3 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ decapitalizedefault(String str, int i, int i2, int i3, String str2) {
        if (7 == (i & 7)) {
            this.rampSeconds = i2;
            this.startAt = str;
            this.targetPercentage = i3;
            if ((i & 8) == 0) {
                this.rolloutHashInput = null;
                int i4 = read + 109;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.rolloutHashInput = str2;
            int i5 = read + 63;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, emptyAnnotatedString.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.targetPercentage, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.rampSeconds) * 31, 31, this.startAt), 31);
        String str = this.rolloutHashInput;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i5 = read + 59;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Rollout(rampSeconds=", this.rampSeconds, ", startAt=", this.startAt, ", targetPercentage=");
        sbM.append(this.targetPercentage);
        sbM.append(", rolloutHashInput=");
        sbM.append(this.rolloutHashInput);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof decapitalizedefault)) {
            int i2 = read + 67;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        decapitalizedefault decapitalizedefaultVar = (decapitalizedefault) obj;
        if (this.rampSeconds != decapitalizedefaultVar.rampSeconds) {
            int i4 = RemoteActionCompatParcelizer + 41;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startAt, decapitalizedefaultVar.startAt}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 63;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (this.targetPercentage == decapitalizedefaultVar.targetPercentage) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rolloutHashInput, decapitalizedefaultVar.rolloutHashInput}, getCieXyz.write())).booleanValue();
        }
        int i7 = read + 29;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
