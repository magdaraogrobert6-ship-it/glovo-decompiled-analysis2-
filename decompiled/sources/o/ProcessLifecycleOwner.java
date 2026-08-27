package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStop$Confirmation$RemoveDetails$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onActivityPostResumed;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ProcessLifecycleOwner {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final Map data;
    public final boolean isEnabled;
    public final String messageRemoved;
    public final String url;
    public static final LastStop$Confirmation$RemoveDetails$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.LastStop$Confirmation$RemoveDetails$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 87;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onActivityPostResumed onactivitypostresumed = onActivityPostResumed.read;
            int i4 = read + 67;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onactivitypostresumed;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(7)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.LastStop$Confirmation$RemoveDetails$Companion] */
    static {
        int i = IconCompatParcelizer + 17;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ProcessLifecycleOwner(int i, String str, Map map, String str2, boolean z) {
        if (15 == (i & 15)) {
            this.url = str;
            this.data = map;
            this.messageRemoved = str2;
            this.isEnabled = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, onActivityPostResumed.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isEnabled) + af$$ExternalSyntheticOutline0.m(IconCompatParcelizer.RemoteActionCompatParcelizer(this.url.hashCode() * 31, this.data, 31), 31, this.messageRemoved);
        int i4 = RemoteActionCompatParcelizer + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RemoveDetails(url=" + this.url + ", data=" + this.data + ", messageRemoved=" + this.messageRemoved + ", isEnabled=" + this.isEnabled + ")";
        int i2 = RemoteActionCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof ProcessLifecycleOwner)) {
                int i2 = write + 81;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, processLifecycleOwner.url}, getCieXyz.write())).booleanValue()) {
                int i3 = write + 23;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, processLifecycleOwner.data}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageRemoved, processLifecycleOwner.messageRemoved}, getCieXyz.write())).booleanValue()) {
                    return this.isEnabled == processLifecycleOwner.isEnabled;
                }
                int i5 = RemoteActionCompatParcelizer + 39;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = RemoteActionCompatParcelizer + 37;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = RemoteActionCompatParcelizer + 103;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
