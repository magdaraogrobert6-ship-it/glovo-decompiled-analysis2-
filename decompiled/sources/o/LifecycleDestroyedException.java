package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStop$Confirmation$EditDetails$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.LifecycleDispatcherDispatcherActivityCallback;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class LifecycleDestroyedException {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final Map data;
    public final boolean isEnabled;
    public final String url;
    public static final LastStop$Confirmation$EditDetails$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.LastStop$Confirmation$EditDetails$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 55;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return LifecycleDispatcherDispatcherActivityCallback.read;
            }
            LifecycleDispatcherDispatcherActivityCallback lifecycleDispatcherDispatcherActivityCallback = LifecycleDispatcherDispatcherActivityCallback.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(6)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.LastStop$Confirmation$EditDetails$Companion] */
    static {
        int i = write + 29;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 103;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.url;
        int i4 = i2 + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ LifecycleDestroyedException(int i, String str, Map map, boolean z) {
        if (7 == (i & 7)) {
            this.url = str;
            this.data = map;
            this.isEnabled = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, LifecycleDispatcherDispatcherActivityCallback.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iRemoteActionCompatParcelizer = Boolean.hashCode(this.isEnabled) >> IconCompatParcelizer.RemoteActionCompatParcelizer(this.url.hashCode() * 23, this.data, 34);
        } else {
            iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(this.url.hashCode() * 31, this.data, 31) + Boolean.hashCode(this.isEnabled);
        }
        int i3 = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return iRemoteActionCompatParcelizer;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("EditDetails(url=");
        sb.append(this.url);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", isEnabled=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.isEnabled, ")");
        int i2 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifecycleDestroyedException)) {
            return false;
        }
        LifecycleDestroyedException lifecycleDestroyedException = (LifecycleDestroyedException) obj;
        Object[] objArr = {this.url, lifecycleDestroyedException.url};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.data, lifecycleDestroyedException.data};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isEnabled != lifecycleDestroyedException.isEnabled) {
            int i2 = RemoteActionCompatParcelizer + 15;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
