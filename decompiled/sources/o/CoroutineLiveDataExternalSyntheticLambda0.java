package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.Chat$Companion;
import kotlinx.serialization.Serializable;
import o.EmptyActivityLifecycleCallbacks;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CoroutineLiveDataExternalSyntheticLambda0 {
    public static final Chat$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.Chat$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 47;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                EmptyActivityLifecycleCallbacks emptyActivityLifecycleCallbacks = EmptyActivityLifecycleCallbacks.read;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EmptyActivityLifecycleCallbacks emptyActivityLifecycleCallbacks2 = EmptyActivityLifecycleCallbacks.read;
            int i3 = RemoteActionCompatParcelizer + 17;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return emptyActivityLifecycleCallbacks2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final long deliveryId;
    public final String shortCode;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.Chat$Companion] */
    static {
        int i = write + 95;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ CoroutineLiveDataExternalSyntheticLambda0(int i, long j, String str, String str2) {
        if (7 == (i & 7)) {
            this.title = str;
            this.deliveryId = j;
            this.shortCode = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, EmptyActivityLifecycleCallbacks.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.shortCode.hashCode() + d$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.deliveryId);
        int i4 = read + 67;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Chat(title=", this.title, this.deliveryId, ", deliveryId="), ", shortCode=", this.shortCode, ")");
        }
        d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Chat(title=", this.title, this.deliveryId, ", deliveryId="), ", shortCode=", this.shortCode, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof CoroutineLiveDataExternalSyntheticLambda0)) {
                return false;
            }
            CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0 = (CoroutineLiveDataExternalSyntheticLambda0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, coroutineLiveDataExternalSyntheticLambda0.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.deliveryId == coroutineLiveDataExternalSyntheticLambda0.deliveryId) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shortCode, coroutineLiveDataExternalSyntheticLambda0.shortCode}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 41;
                int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 99;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = read + 105;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = read + 29;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }
}
