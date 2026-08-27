package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.Acknowledgment$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AsyncTypefaceCacheKey;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "acknowledgment")
public final class DefaultFontFamily extends DeviceFontFamilyNameFontKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final List checks;
    public final String confirmationText;
    public final String description;
    public final String id;
    public final boolean required;
    public final String title;
    public static final Acknowledgment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.Acknowledgment$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 47;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AsyncTypefaceCacheKey asyncTypefaceCacheKey = AsyncTypefaceCacheKey.write;
            int i4 = IconCompatParcelizer + 103;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return asyncTypefaceCacheKey;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(3)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.Acknowledgment$Companion] */
    static {
        Object obj = null;
        int i = read + 53;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.confirmationText;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 47;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List list = this.checks;
        int i4 = i3 + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 63;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.required;
        }
        int i3 = 42 / 0;
        return this.required;
    }

    public /* synthetic */ DefaultFontFamily(int i, String str, String str2, String str3, boolean z, List list, String str4) {
        int i2;
        if (62 == (i & 62)) {
            if ((i & 1) == 0) {
                this.id = "acknowledgment";
                i2 = RemoteActionCompatParcelizer + 103;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                this.id = str;
                i2 = write + 89;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            this.title = str2;
            this.description = str3;
            this.required = z;
            this.checks = list;
            this.confirmationText = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 62, AsyncTypefaceCacheKey.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.confirmationText.hashCode() + c8$$ExternalSyntheticOutline0.m(this.checks, d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.required), 31);
        int i4 = RemoteActionCompatParcelizer + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Acknowledgment(id=", this.id, ", title=", this.title, ", description=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.description, ", required=", ", checks=", sbM, this.required);
        sbM.append(this.checks);
        sbM.append(", confirmationText=");
        sbM.append(this.confirmationText);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 63;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFontFamily)) {
            int i2 = RemoteActionCompatParcelizer + 59;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        DefaultFontFamily defaultFontFamily = (DefaultFontFamily) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, defaultFontFamily.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, defaultFontFamily.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, defaultFontFamily.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.required != defaultFontFamily.required) {
            int i3 = RemoteActionCompatParcelizer + 27;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.checks, defaultFontFamily.checks}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationText, defaultFontFamily.confirmationText}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = write + 111;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
