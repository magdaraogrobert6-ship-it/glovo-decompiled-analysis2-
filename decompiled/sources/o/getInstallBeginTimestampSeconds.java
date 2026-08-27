package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.data.model.StartingAreaResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.createInstallReferrerClient;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getInstallBeginTimestampSeconds {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List coordinates;
    public static final StartingAreaResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.StartingAreaResponse$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            createInstallReferrerClient createinstallreferrerclient;
            int i = 2 % 2;
            int i2 = serializer + 121;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createinstallreferrerclient = createInstallReferrerClient.write;
                int i3 = 17 / 0;
            } else {
                createinstallreferrerclient = createInstallReferrerClient.write;
            }
            int i4 = serializer + 5;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return createinstallreferrerclient;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(12))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.StartingAreaResponse$Companion] */
    static {
        int i = write + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getInstallBeginTimestampSeconds(int i, List list) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.coordinates = list;
            int i2 = serializer + 83;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.coordinates = null;
        int i3 = serializer + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        List list = this.coordinates;
        if (list == null) {
            return 0;
        }
        int iHashCode = list.hashCode();
        int i3 = read + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("StartingAreaResponse(coordinates=", ")", this.coordinates);
        int i4 = read + 113;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getInstallBeginTimestampSeconds)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinates, ((getInstallBeginTimestampSeconds) obj).coordinates}, getCieXyz.write())).booleanValue();
        }
        int i5 = i3 + 77;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return true;
    }
}
