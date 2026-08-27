package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailableV2$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.r8lambdaYHXaXOSqDriYitZELtPU6VY2U0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "customer_unavailable_v2")
public final class getSerif extends DeviceFontFamilyNameFontKt {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableV2$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailableV2$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 41;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaYHXaXOSqDriYitZELtPU6VY2U0 r8lambdayhxaxosqdriyitzeltpu6vy2u0 = r8lambdaYHXaXOSqDriYitZELtPU6VY2U0.write;
            int i4 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdayhxaxosqdriyitzeltpu6vy2u0;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final List components;
    public final String description;
    public final String id;
    public final boolean required;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailableV2$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        Object obj = null;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(20)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(21))};
        int i = write + 17;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.required;
        int i5 = i3 + 85;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final List MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trackingEvents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        List list = this.components;
        int i5 = i3 + 113;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 23;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ getSerif(int i, String str, String str2, String str3, boolean z, List list, List list2) {
        if (31 == (i & 31)) {
            this.id = str;
            this.title = str2;
            this.description = str3;
            this.required = z;
            this.trackingEvents = list;
            if ((i & 32) == 0) {
                this.components = instance_delegatelambda0.write;
                int i2 = serializer + 33;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.components = list2;
            int i4 = IconCompatParcelizer + 83;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, r8lambdaYHXaXOSqDriYitZELtPU6VY2U0.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.components.hashCode() + c8$$ExternalSyntheticOutline0.m(this.trackingEvents, d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.required), 31);
        int i4 = IconCompatParcelizer + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CustomerUnavailableV2(id=", this.id, ", title=", this.title, ", description=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.description, ", required=", ", trackingEvents=", sbM, this.required);
        sbM.append(this.trackingEvents);
        sbM.append(", components=");
        sbM.append(this.components);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSerif)) {
            return false;
        }
        getSerif getserif = (getSerif) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getserif.id}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getserif.title}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getserif.description}, getCieXyz.write())).booleanValue() || this.required != getserif.required) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, getserif.trackingEvents}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, getserif.components}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 99;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 3;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = serializer + 67;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 != 0;
    }
}
