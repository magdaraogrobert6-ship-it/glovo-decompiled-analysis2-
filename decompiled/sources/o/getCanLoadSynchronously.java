package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CustomerChatAndCall$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontFamilyCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCanLoadSynchronously {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailable$CustomerChatAndCall$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CustomerChatAndCall$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 69;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontFamilyCompanion fontFamilyCompanion = FontFamilyCompanion.read;
            int i4 = write + 63;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return fontFamilyCompanion;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String id;
    public final List requiredSteps;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CustomerChatAndCall$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(15)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(16))};
        int i = RemoteActionCompatParcelizer + 113;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.trackingEvents;
        int i4 = i3 + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 61;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 15;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List list = this.requiredSteps;
        int i4 = i3 + 123;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getCanLoadSynchronously(int i, String str, String str2, List list, List list2) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.title = str;
            this.trackingEvents = list;
            if ((i & 4) == 0) {
                this.id = null;
                int i2 = write + 111;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.id = str2;
            }
            if ((i & 8) != 0) {
                this.requiredSteps = list2;
                return;
            }
            int i5 = write + 77;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                this.requiredSteps = null;
                return;
            } else {
                this.requiredSteps = null;
                obj.hashCode();
                throw null;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FontFamilyCompanion.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CustomerChatAndCall(title=", this.title, ", trackingEvents=", this.trackingEvents, ", id="), this.id, ", requiredSteps=", this.requiredSteps, ")");
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CustomerChatAndCall(title=", this.title, ", trackingEvents=", this.trackingEvents, ", id="), this.id, ", requiredSteps=", this.requiredSteps, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.trackingEvents, this.title.hashCode() * 31, 31);
        String str = this.id;
        int iHashCode2 = 0;
        if (str == null) {
            int i4 = write + 107;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        List list = this.requiredSteps;
        if (list == null) {
            int i5 = write + 35;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            iHashCode2 = list.hashCode();
        }
        return ((iM + iHashCode) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 35;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getCanLoadSynchronously) {
            getCanLoadSynchronously getcanloadsynchronously = (getCanLoadSynchronously) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getcanloadsynchronously.title}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, getcanloadsynchronously.trackingEvents}, getCieXyz.write())).booleanValue()) {
                    int i4 = IconCompatParcelizer + 91;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 == 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getcanloadsynchronously.id}, getCieXyz.write())).booleanValue()) {
                    int i5 = write + 57;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, getcanloadsynchronously.requiredSteps}, getCieXyz.write())).booleanValue();
            }
            int i7 = write + 27;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = IconCompatParcelizer + 75;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
