package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.entities.softpos.detail.Receipt$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidPreloadedFontTypefaceLoader;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidTypeface_androidKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final boolean approved;
    public final List detail;
    public final String schemaName;
    public static final Receipt$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.entities.softpos.detail.Receipt$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 113;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidPreloadedFontTypefaceLoader androidPreloadedFontTypefaceLoader = AndroidPreloadedFontTypefaceLoader.read;
            int i4 = IconCompatParcelizer + 67;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return androidPreloadedFontTypefaceLoader;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(28)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.entities.softpos.detail.Receipt$Companion] */
    static {
        int i = read + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.approved;
        int i5 = i3 + 47;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidTypeface_androidKt(int i, boolean z, List list, String str) {
        if (7 == (i & 7)) {
            this.approved = z;
            this.detail = list;
            this.schemaName = str;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, AndroidPreloadedFontTypefaceLoader.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.schemaName.hashCode() * c8$$ExternalSyntheticOutline0.m(this.detail, Boolean.hashCode(this.approved) >> 59, 61);
        } else {
            iHashCode = this.schemaName.hashCode() + c8$$ExternalSyntheticOutline0.m(this.detail, Boolean.hashCode(this.approved) * 31, 31);
        }
        int i3 = write + 95;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Receipt(approved=");
        sb.append(this.approved);
        sb.append(", detail=");
        sb.append(this.detail);
        sb.append(", schemaName=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.schemaName, ")");
        int i2 = write + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidTypeface_androidKt)) {
            int i2 = serializer + 91;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        AndroidTypeface_androidKt androidTypeface_androidKt = (AndroidTypeface_androidKt) obj;
        if (this.approved != androidTypeface_androidKt.approved) {
            int i4 = serializer + 111;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr = {this.detail, androidTypeface_androidKt.detail};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 107;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr2 = {this.schemaName, androidTypeface_androidKt.schemaName};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = write + 95;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
