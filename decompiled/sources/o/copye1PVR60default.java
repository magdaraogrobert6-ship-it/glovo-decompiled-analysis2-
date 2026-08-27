package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.errorhandler.StateV3Response$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.TypefaceRequest;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class copye1PVR60default {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final List messages;
    public static final StateV3Response$Companion Companion = new Object() { // from class: com.roadrunner.delivery.errorhandler.StateV3Response$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 67;
            write = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                TypefaceRequest typefaceRequest = TypefaceRequest.read;
                obj.hashCode();
                throw null;
            }
            TypefaceRequest typefaceRequest2 = TypefaceRequest.read;
            int i3 = read + 51;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return typefaceRequest2;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(0))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.errorhandler.StateV3Response$Companion] */
    static {
        int i = IconCompatParcelizer + 11;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    public /* synthetic */ copye1PVR60default(int i, List list) {
        if ((i & 1) != 0) {
            this.messages = list;
            int i2 = serializer + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.messages = instance_delegatelambda0.write;
        int i4 = serializer + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 69;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.messages;
        if (list != null) {
            return list.hashCode();
        }
        int i4 = i2 + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 0;
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str = MediaSessionCompatQueueItem.read("StateV3Response(messages=", ")", this.messages);
            int i3 = 69 / 0;
        } else {
            str = MediaSessionCompatQueueItem.read("StateV3Response(messages=", ")", this.messages);
        }
        int i4 = RemoteActionCompatParcelizer + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copye1PVR60default)) {
            int i2 = serializer + 101;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, ((copye1PVR60default) obj).messages}, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 89;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = RemoteActionCompatParcelizer + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
