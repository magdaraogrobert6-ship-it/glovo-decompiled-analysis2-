package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$DispatcherChat$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontFamilyResolver;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class resolveDPcqOEQdefault {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailable$DispatcherChat$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$DispatcherChat$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 107;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return FontFamilyResolver.serializer;
            }
            int i3 = 79 / 0;
            return FontFamilyResolver.serializer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String deeplink;
    public final String id;
    public final List requiredSteps;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$DispatcherChat$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(17)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(18))};
        int i = write + 77;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.deeplink;
        }
        int i3 = 40 / 0;
        return this.deeplink;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.requiredSteps;
        int i5 = i2 + 115;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 93;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.trackingEvents;
        int i5 = i2 + 1;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.title;
        }
        int i3 = 71 / 0;
        return this.title;
    }

    public /* synthetic */ resolveDPcqOEQdefault(int i, String str, String str2, String str3, List list, List list2) {
        if (7 == (i & 7)) {
            this.title = str;
            this.deeplink = str2;
            this.trackingEvents = list;
            if ((i & 8) == 0) {
                this.id = null;
                int i2 = RemoteActionCompatParcelizer + 35;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 5;
                } else {
                    int i4 = 2 % 2;
                }
            } else {
                this.id = str3;
            }
            if ((i & 16) == 0) {
                this.requiredSteps = null;
                return;
            }
            this.requiredSteps = list2;
            int i5 = RemoteActionCompatParcelizer + 25;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, FontFamilyResolver.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DispatcherChat(title=", this.title, ", deeplink=", this.deeplink, ", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(", id=");
        sbM.append(this.id);
        sbM.append(", requiredSteps=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.requiredSteps, ")");
        int i4 = serializer + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.trackingEvents, af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.deeplink), 31);
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.requiredSteps;
        int iHashCode2 = ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
        int i4 = serializer + 87;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resolveDPcqOEQdefault)) {
            return false;
        }
        resolveDPcqOEQdefault resolvedpcqoeqdefault = (resolveDPcqOEQdefault) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, resolvedpcqoeqdefault.title}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deeplink, resolvedpcqoeqdefault.deeplink}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, resolvedpcqoeqdefault.trackingEvents}, getCieXyz.write())).booleanValue())) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, resolvedpcqoeqdefault.id}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, resolvedpcqoeqdefault.requiredSteps}, getCieXyz.write())).booleanValue()) {
                        int i2 = serializer + 7;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    int i4 = serializer + 51;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return true;
                }
                int i6 = RemoteActionCompatParcelizer + 29;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                int i8 = RemoteActionCompatParcelizer + 15;
                int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 61;
                RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return false;
            }
        }
        return false;
    }
}
