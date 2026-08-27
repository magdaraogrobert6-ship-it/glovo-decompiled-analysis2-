package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.data.model.MenuItemGroupComponent$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.r8lambdajKBl9qugyz1UpKQ6PJoLa8KjFHY;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "menu_item_group")
public final class r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU implements r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List items;
    public final String label;
    public final String logo;
    public static final MenuItemGroupComponent$Companion Companion = new Object() { // from class: com.roadrunner.sidemenu.data.model.MenuItemGroupComponent$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 49;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdajKBl9qugyz1UpKQ6PJoLa8KjFHY r8lambdajkbl9qugyz1upkq6pjola8kjfhy = r8lambdajKBl9qugyz1UpKQ6PJoLa8KjFHY.serializer;
            int i4 = serializer + 125;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdajkbl9qugyz1upkq6pjola8kjfhy;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new performPushDeliveryFlushlambda1(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.sidemenu.data.model.MenuItemGroupComponent$Companion] */
    static {
        int i = IconCompatParcelizer + 59;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU(int i, String str, String str2, List list) {
        if (7 == (i & 7)) {
            this.label = str;
            this.logo = str2;
            this.items = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, r8lambdajKBl9qugyz1UpKQ6PJoLa8KjFHY.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return af$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.logo) + this.items.hashCode();
        }
        return this.items.hashCode() >>> af$$ExternalSyntheticOutline0.m(this.label.hashCode() >>> 48, 67, this.logo);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("MenuItemGroupComponent(label=", this.label, ", logo=", this.logo, ", items="), this.items, ")");
            int i3 = serializer + 27;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("MenuItemGroupComponent(label=", this.label, ", logo=", this.logo, ", items="), this.items, ")");
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU)) {
            return false;
        }
        r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU r8lambdaigkhmxsmtvlppviw5cq5wsa4khu = (r8lambdaiGkHmxsmtvlpPViW5Cq5WSA4KHU) obj;
        Object[] objArr = {this.label, r8lambdaigkhmxsmtvlppviw5cq5wsa4khu.label};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.logo, r8lambdaigkhmxsmtvlppviw5cq5wsa4khu.logo};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            Object[] objArr3 = {this.items, r8lambdaigkhmxsmtvlppviw5cq5wsa4khu.items};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 31;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
