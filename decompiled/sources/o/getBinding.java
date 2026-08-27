package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$Companion;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetInsetsp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "delivery_notes")
public final class getBinding extends AndroidViewBindingKtExternalSyntheticLambda4 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final List components;
    public final String text;
    public static final DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 65;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return accessgetInsetsp.RemoteActionCompatParcelizer;
            }
            accessgetInsetsp accessgetinsetsp = accessgetInsetsp.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(29))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$Instructions$Item$DeliveryNotes$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getBinding(List list, int i, String str) {
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.text = null;
            } else {
                this.text = str;
                int i2 = write + 83;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.components = list;
            int i5 = write + 57;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, accessgetInsetsp.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = IconCompatParcelizer.read("DeliveryNotes(text=", this.text, ", components=", this.components, ")");
        int i4 = write + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.text;
        if (str == null) {
            int i2 = read;
            int i3 = i2 + 35;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.components.hashCode() + (iHashCode * 31);
    }

    public final boolean RemoteActionCompatParcelizer() {
        Object next;
        int i = 2 % 2;
        Iterator it = this.components.iterator();
        do {
            if (!it.hasNext()) {
                int i2 = write + 97;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof accessgetHasUpdateBlockp));
        if (((accessgetHasUpdateBlockp) next) == null) {
            return false;
        }
        int i4 = write + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBinding)) {
            return false;
        }
        getBinding getbinding = (getBinding) obj;
        Object[] objArr = {this.text, getbinding.text};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.components, getbinding.components};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 71;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String read() {
        Object next;
        int i = 2 % 2;
        int i2 = write + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Iterator it = this.components.iterator();
        int i4 = read + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        do {
            if (!it.hasNext()) {
                int i6 = read + 25;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                next = null;
                break;
            }
            int i8 = read + 53;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            next = it.next();
        } while (!(next instanceof accessgetHasUpdateBlockp));
        accessgetHasUpdateBlockp accessgethasupdateblockp = (accessgetHasUpdateBlockp) next;
        String str = accessgethasupdateblockp != null ? accessgethasupdateblockp.title : null;
        return str == null ? "" : str;
    }
}
