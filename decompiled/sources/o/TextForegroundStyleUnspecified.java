package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.overdue.data.model.IssueRequestBody$IssueRequestBodyV2$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.TextForegroundStyleCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TextForegroundStyleUnspecified extends from8_81llA {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String category;
    public final List deliveryIds;
    public final String message;
    public static final IssueRequestBody$IssueRequestBodyV2$Companion Companion = new Object() { // from class: com.roadrunner.delivery.overdue.data.model.IssueRequestBody$IssueRequestBodyV2$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 115;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return TextForegroundStyleCompanion.RemoteActionCompatParcelizer;
            }
            TextForegroundStyleCompanion textForegroundStyleCompanion = TextForegroundStyleCompanion.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(5))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.overdue.data.model.IssueRequestBody$IssueRequestBodyV2$Companion] */
    static {
        int i = IconCompatParcelizer + 61;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
    }

    public /* synthetic */ TextForegroundStyleUnspecified(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.message = null;
            int i2 = serializer + 89;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.category = null;
        } else {
            this.category = str2;
            int i5 = RemoteActionCompatParcelizer + 103;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        int i7 = 2 % 2;
        if ((i & 4) != 0) {
            this.deliveryIds = list;
            return;
        }
        int i8 = RemoteActionCompatParcelizer + 49;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        this.deliveryIds = instance_delegatelambda0.write;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read(c8$$ExternalSyntheticOutline0.m("IssueRequestBodyV2(message=", this.message, ", category=", this.category, ", deliveryIds="), this.deliveryIds, ")");
        int i4 = serializer + 69;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextForegroundStyleUnspecified(String str, String str2, List list) {
        this.message = str;
        this.category = str2;
        this.deliveryIds = list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.message;
        if (str == null) {
            int i5 = i3 + 31;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.category;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List list = this.deliveryIds;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 71;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof TextForegroundStyleUnspecified)) {
            return false;
        }
        TextForegroundStyleUnspecified textForegroundStyleUnspecified = (TextForegroundStyleUnspecified) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, textForegroundStyleUnspecified.message}, getCieXyz.write())).booleanValue()) {
            int i3 = RemoteActionCompatParcelizer + 75;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.category, textForegroundStyleUnspecified.category}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryIds, textForegroundStyleUnspecified.deliveryIds}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = serializer + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
