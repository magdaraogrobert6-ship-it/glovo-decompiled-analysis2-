package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedRecentLocation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.clipRect;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "selected_recent_location")
public final class clipPath extends getLineSpacingExtra {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final List trackingEvents;
    public static final LastStopScreen$LastStopScreenComponent$SelectedRecentLocation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedRecentLocation$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 47;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            clipRect cliprect = clipRect.RemoteActionCompatParcelizer;
            int i4 = read + 101;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return cliprect;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(22))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedRecentLocation$Companion] */
    static {
        int i = write + 113;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trackingEvents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trackingEvents.hashCode();
        }
        this.trackingEvents.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ clipPath(int i, List list) {
        if ((i & 1) == 0) {
            this.trackingEvents = instance_delegatelambda0.write;
            int i2 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        this.trackingEvents = list;
        int i4 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("SelectedRecentLocation(trackingEvents=", ")", this.trackingEvents);
        int i4 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof clipPath) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, ((clipPath) obj).trackingEvents}, getCieXyz.write())).booleanValue())) {
                int i2 = RemoteActionCompatParcelizer + 55;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = IconCompatParcelizer + 125;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
