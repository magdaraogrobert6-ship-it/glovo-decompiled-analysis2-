package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.inappnotifications.data.InAppNotificationContent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setClipToPadding;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class requestChildFocus {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List pages;
    public static final InAppNotificationContent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.InAppNotificationContent$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 63;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setClipToPadding setcliptopadding = setClipToPadding.serializer;
            int i4 = RemoteActionCompatParcelizer + 29;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
            }
            return setcliptopadding;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(25))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.InAppNotificationContent$Companion] */
    static {
        int i = write + 21;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.pages;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ requestChildFocus(int i, List list) {
        if (1 == (i & 1)) {
            this.pages = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setClipToPadding.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.pages.hashCode();
        int i4 = RemoteActionCompatParcelizer + 91;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("InAppNotificationContent(pages=", ")", this.pages);
        int i4 = RemoteActionCompatParcelizer + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 77;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof requestChildFocus) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pages, ((requestChildFocus) obj).pages}, getCieXyz.write())).booleanValue();
            }
            int i6 = i4 + 73;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i2 + 79;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 59 / 0;
        }
        return true;
    }
}
