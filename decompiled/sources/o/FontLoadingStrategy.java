package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.Reason$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetBlockingcp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontLoadingStrategy {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final String f7default;
    public final String description;
    public final String editedReasonPrefix;
    public final List items;
    public final String title;
    public static final Reason$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.Reason$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetBlockingcp accessgetblockingcp = accessgetBlockingcp.write;
            int i4 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return accessgetblockingcp;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(0))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.Reason$Companion] */
    static {
        int i = serializer + 93;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.editedReasonPrefix;
        int i5 = i3 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 55;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.items;
        int i5 = i2 + 57;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.description;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 1;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 25;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ FontLoadingStrategy(int i, String str, String str2, String str3, String str4, List list) {
        if (23 == (i & 23)) {
            this.title = str;
            this.description = str2;
            this.editedReasonPrefix = str3;
            if ((i & 8) == 0) {
                this.f7default = null;
            } else {
                this.f7default = str4;
                int i2 = write + 95;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.items = list;
            int i5 = write + 61;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 23, accessgetBlockingcp.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Reason(title=", this.title, ", description=", this.description, ", editedReasonPrefix=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.editedReasonPrefix, ", default=", this.f7default, ", items=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.items, ")");
        int i4 = IconCompatParcelizer + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.editedReasonPrefix);
        String str = this.f7default;
        int iHashCode = this.items.hashCode() + ((iM + (str == null ? 0 : str.hashCode())) * 31);
        int i4 = write + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 5;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontLoadingStrategy)) {
            return false;
        }
        FontLoadingStrategy fontLoadingStrategy = (FontLoadingStrategy) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontLoadingStrategy.title}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 103;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, fontLoadingStrategy.description}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 85;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.editedReasonPrefix, fontLoadingStrategy.editedReasonPrefix}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.f7default, fontLoadingStrategy.f7default}, getCieXyz.write())).booleanValue()) {
            int i8 = write + 9;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, fontLoadingStrategy.items}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i10 = IconCompatParcelizer + 15;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
