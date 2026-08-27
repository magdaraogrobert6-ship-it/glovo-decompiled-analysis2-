package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.safety.log.data.entity.SafetyLogEventParam$Companion;
import kotlinx.serialization.Serializable;
import o.setGooglePlayInstant;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setInstallBeginTimeInSeconds {
    public static final SafetyLogEventParam$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.log.data.entity.SafetyLogEventParam$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            setGooglePlayInstant setgoogleplayinstant;
            int i = 2 % 2;
            int i2 = read + 33;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                setgoogleplayinstant = setGooglePlayInstant.serializer;
                int i3 = 73 / 0;
            } else {
                setgoogleplayinstant = setGooglePlayInstant.serializer;
            }
            int i4 = write + 113;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgoogleplayinstant;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String key;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.log.data.entity.SafetyLogEventParam$Companion] */
    static {
        int i = IconCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setInstallBeginTimeInSeconds(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.key = str;
            this.value = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setGooglePlayInstant.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("SafetyLogEventParam(key=", this.key, ", value=", this.value, ")");
        int i4 = serializer + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode() + (this.key.hashCode() * 31);
        int i4 = serializer + 111;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public setInstallBeginTimeInSeconds(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 37;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof setInstallBeginTimeInSeconds) {
            setInstallBeginTimeInSeconds setinstallbegintimeinseconds = (setInstallBeginTimeInSeconds) obj;
            Object[] objArr = {this.key, setinstallbegintimeinseconds.key};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = RemoteActionCompatParcelizer + 17;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object[] objArr2 = {this.value, setinstallbegintimeinseconds.value};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = RemoteActionCompatParcelizer + 77;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = serializer + 33;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
