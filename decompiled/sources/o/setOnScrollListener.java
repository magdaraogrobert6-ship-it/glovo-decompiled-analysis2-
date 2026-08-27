package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.inappnotifications.data.Page$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setPreserveFocusAfterLayout;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setOnScrollListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String backgroundColor;
    public final List components;
    public static final Page$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.Page$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 57;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setPreserveFocusAfterLayout setpreservefocusafterlayout = setPreserveFocusAfterLayout.read;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setPreserveFocusAfterLayout setpreservefocusafterlayout2 = setPreserveFocusAfterLayout.read;
            int i3 = write + 37;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
            }
            return setpreservefocusafterlayout2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(26))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.Page$Companion] */
    static {
        int i = serializer + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setOnScrollListener(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.backgroundColor = str;
            this.components = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setPreserveFocusAfterLayout.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("Page(backgroundColor=", this.backgroundColor, ", components=", this.components, ")");
        int i4 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.components.hashCode() % (this.backgroundColor.hashCode() << 27);
        } else {
            iHashCode = this.components.hashCode() + (this.backgroundColor.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setOnScrollListener) {
            setOnScrollListener setonscrolllistener = (setOnScrollListener) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.backgroundColor, setonscrolllistener.backgroundColor}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 101;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, setonscrolllistener.components}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 107;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 63;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 70 / 0;
            }
            return false;
        }
        int i9 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
