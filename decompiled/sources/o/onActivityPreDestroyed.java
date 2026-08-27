package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onActivityPreDestroyed extends DelegatingFrameMetricsListener {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List components;
    public final String mode;
    public final String title;
    public final String type;
    public static final NestAutoAcceptComponent$Companion Companion = new NestAutoAcceptComponent$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(9)), null};

    static {
        int i = serializer + 13;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public onActivityPreDestroyed(int i, String str, String str2, String str3, List list) {
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, onActivityPreStopped.serializer.getDescriptor());
            throw null;
        }
        this.title = str;
        this.mode = str2;
        if ((i & 4) == 0) {
            this.components = instance_delegatelambda0.write;
        } else {
            this.components = list;
        }
        if ((i & 8) != 0) {
            this.type = str3;
            int i2 = write + 49;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        int i4 = write;
        int i5 = i4 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        this.type = "auto_accept";
        int i7 = i4 + 125;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.components.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.mode);
        int i4 = write + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("NestAutoAcceptComponent(title=", this.title, ", mode=", this.mode, ", components="), this.components, ")");
        }
        MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("NestAutoAcceptComponent(title=", this.title, ", mode=", this.mode, ", components="), this.components, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onActivityPreDestroyed)) {
            return false;
        }
        onActivityPreDestroyed onactivitypredestroyed = (onActivityPreDestroyed) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, onactivitypredestroyed.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mode, onactivitypredestroyed.mode}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, onactivitypredestroyed.components}, getCieXyz.write())).booleanValue();
        }
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }
}
