package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.entity.RiderState$Companion;
import kotlinx.serialization.Serializable;
import o.getNanoTime;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getOnFlingListener {
    public static final RiderState$Companion Companion = new Object() { // from class: com.roadrunner.home.state.entity.RiderState$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 65;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getNanoTime getnanotime = getNanoTime.read;
            int i4 = IconCompatParcelizer + 99;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
            return getnanotime;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final requestDisallowParentIntercept components;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.entity.RiderState$Companion] */
    static {
        int i = write + 75;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getOnFlingListener(int i, requestDisallowParentIntercept requestdisallowparentintercept) {
        if (1 == (i & 1)) {
            this.components = requestdisallowparentintercept;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getNanoTime.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.components.content.hashCode();
        }
        this.components.content.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderState(components=" + this.components + ")";
        int i2 = RemoteActionCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 93;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getOnFlingListener)) {
            int i3 = serializer + 119;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, ((getOnFlingListener) obj).components}, getCieXyz.write())).booleanValue();
    }
}
