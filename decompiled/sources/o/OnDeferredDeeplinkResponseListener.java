package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.database.entity.SectionEntity$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onEventTrackingSucceeded;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OnDeferredDeeplinkResponseListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final List icons;
    public final String text;
    public final String type;
    public static final SectionEntity$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.database.entity.SectionEntity$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 49;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                onEventTrackingSucceeded oneventtrackingsucceeded = onEventTrackingSucceeded.IconCompatParcelizer;
                throw null;
            }
            onEventTrackingSucceeded oneventtrackingsucceeded2 = onEventTrackingSucceeded.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 97;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return oneventtrackingsucceeded2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(17)), null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.database.entity.SectionEntity$Companion] */
    static {
        int i = read + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.text;
        }
        throw null;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        List list = this.icons;
        int i4 = i2 + 17;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 81;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ OnDeferredDeeplinkResponseListener(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            list = instance_delegatelambda0.write;
            int i2 = 2 % 2;
        }
        this.icons = list;
        if ((i & 2) == 0) {
            int i3 = write + 109;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.text = "";
        } else {
            this.text = str;
            int i5 = write + 75;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.type = "";
            return;
        }
        this.type = str2;
        int i8 = RemoteActionCompatParcelizer + 1;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 35 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.type.hashCode() - af$$ExternalSyntheticOutline0.m(this.icons.hashCode(), 87, this.text);
        } else {
            iHashCode = this.type.hashCode() + af$$ExternalSyntheticOutline0.m(this.icons.hashCode() * 31, 31, this.text);
        }
        int i3 = RemoteActionCompatParcelizer + 45;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public OnDeferredDeeplinkResponseListener(List list, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.icons = list;
        this.text = str;
        this.type = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SectionEntity(icons=");
        sb.append(this.icons);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", type=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.type, ")");
        int i2 = RemoteActionCompatParcelizer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof OnDeferredDeeplinkResponseListener)) {
                return false;
            }
            OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = (OnDeferredDeeplinkResponseListener) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icons, onDeferredDeeplinkResponseListener.icons}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, onDeferredDeeplinkResponseListener.text}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, onDeferredDeeplinkResponseListener.type}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 61;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 45;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = write + 7;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return true;
    }
}
