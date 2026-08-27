package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.sidemenu.data.model.FrequentlyUsedItemsComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.r8lambdahXpv1dXXclu0HF34MtjqDQYnt8k;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "frequently_used_items")
public final class r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg implements r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final List items;
    public static final FrequentlyUsedItemsComponent$Companion Companion = new Object() { // from class: com.roadrunner.sidemenu.data.model.FrequentlyUsedItemsComponent$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 1;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdahXpv1dXXclu0HF34MtjqDQYnt8k r8lambdahxpv1dxxclu0hf34mtjqdqynt8k = r8lambdahXpv1dXXclu0HF34MtjqDQYnt8k.serializer;
            int i4 = write + 107;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return r8lambdahxpv1dxxclu0hf34mtjqdqynt8k;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new performPushDeliveryFlushlambda1(7))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.sidemenu.data.model.FrequentlyUsedItemsComponent$Companion] */
    static {
        int i = write + 83;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg(int i, List list) {
        if (1 == (i & 1)) {
            this.items = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, r8lambdahXpv1dXXclu0HF34MtjqDQYnt8k.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.items.hashCode();
            int i3 = 86 / 0;
        } else {
            iHashCode = this.items.hashCode();
        }
        int i4 = read + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("FrequentlyUsedItemsComponent(items=", ")", this.items);
        int i4 = RemoteActionCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 109;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 123;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg) {
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, ((r8lambdahFzVXArQHjyg4Plg7rZXdYrHhg) obj).items}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i8 = i4 + 73;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        int i10 = i4 + 99;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return false;
    }
}
