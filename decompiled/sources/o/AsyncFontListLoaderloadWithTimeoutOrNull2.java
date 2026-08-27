package o;

import com.roadrunner.delivery.common.data.model.DeliveryConfirmationResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AsyncFontListLoaderloadWithTimeoutOrNull2 {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final putdefault data;
    public final List messages;
    public final accessgetPermanentCachep metadata;
    public static final DeliveryConfirmationResponse$Companion Companion = new DeliveryConfirmationResponse$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(29))};

    static {
        int i = IconCompatParcelizer + 37;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        List list = this.messages;
        int i5 = i3 + 17;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final putdefault RemoteActionCompatParcelizer() {
        putdefault putdefaultVar;
        int i = 2 % 2;
        int i2 = serializer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            putdefaultVar = this.data;
            int i4 = 12 / 0;
        } else {
            putdefaultVar = this.data;
        }
        int i5 = i3 + 109;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return putdefaultVar;
    }

    public final accessgetPermanentCachep serializer() {
        accessgetPermanentCachep accessgetpermanentcachep;
        int i = 2 % 2;
        int i2 = write + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            accessgetpermanentcachep = this.metadata;
            int i4 = 42 / 0;
        } else {
            accessgetpermanentcachep = this.metadata;
        }
        int i5 = i3 + 67;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetpermanentcachep;
    }

    public /* synthetic */ AsyncFontListLoaderloadWithTimeoutOrNull2(int i, putdefault putdefaultVar, accessgetPermanentCachep accessgetpermanentcachep, List list) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = putdefaultVar;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i3 = write;
            int i4 = i3 + 83;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                this.metadata = null;
                int i5 = 91 / 0;
            } else {
                this.metadata = null;
            }
            int i6 = i3 + 121;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.metadata = accessgetpermanentcachep;
        }
        if ((i & 4) != 0) {
            this.messages = list;
            return;
        }
        int i9 = write + 25;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            this.messages = null;
        } else {
            this.messages = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeliveryConfirmationResponse(data=");
        sb.append(this.data);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", messages=");
        String str = MediaSessionCompatQueueItem.read(sb, this.messages, ")");
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        putdefault putdefaultVar = this.data;
        int iHashCode2 = 0;
        int iHashCode3 = putdefaultVar == null ? 0 : putdefaultVar.hashCode();
        accessgetPermanentCachep accessgetpermanentcachep = this.metadata;
        if (accessgetpermanentcachep == null) {
            int i4 = serializer + 17;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accessgetpermanentcachep.hashCode();
            int i6 = write + 73;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        List list = this.messages;
        if (list == null) {
            int i8 = serializer + 67;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 3 / 2;
            }
        } else {
            iHashCode2 = list.hashCode();
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 39;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AsyncFontListLoaderloadWithTimeoutOrNull2)) {
            return false;
        }
        AsyncFontListLoaderloadWithTimeoutOrNull2 asyncFontListLoaderloadWithTimeoutOrNull2 = (AsyncFontListLoaderloadWithTimeoutOrNull2) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, asyncFontListLoaderloadWithTimeoutOrNull2.data}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, asyncFontListLoaderloadWithTimeoutOrNull2.metadata}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, asyncFontListLoaderloadWithTimeoutOrNull2.messages}, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 77;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = serializer + 95;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = serializer + 3;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
