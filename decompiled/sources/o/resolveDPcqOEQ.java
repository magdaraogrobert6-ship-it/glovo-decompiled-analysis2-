package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$IvrCall$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.preload;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "ivr_call")
public final class resolveDPcqOEQ implements FontKt {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final getDismissOnBackPress button;
    public final String descriptionCallStarted;
    public final String id;
    public final String initialDescription;
    public final List requiredSteps;
    public final String title;
    public static final CustomerUnavailable$IvrCall$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$IvrCall$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 83;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return preload.IconCompatParcelizer;
            }
            preload preloadVar = preload.IconCompatParcelizer;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(19))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$IvrCall$Companion] */
    static {
        int i = read + 81;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.initialDescription;
        int i5 = i3 + 37;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = write + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 69;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return str;
    }

    public final getDismissOnBackPress read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 35;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getDismissOnBackPress getdismissonbackpress = this.button;
        int i5 = i2 + 21;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getdismissonbackpress;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.descriptionCallStarted;
        int i5 = i3 + 37;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 115;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.requiredSteps;
        int i5 = i2 + 123;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public /* synthetic */ resolveDPcqOEQ(int i, String str, String str2, String str3, String str4, getDismissOnBackPress getdismissonbackpress, List list) {
        if (15 == (i & 15)) {
            this.id = str;
            this.title = str2;
            this.initialDescription = str3;
            this.descriptionCallStarted = str4;
            if ((i & 16) == 0) {
                this.button = null;
            } else {
                this.button = getdismissonbackpress;
            }
            if ((i & 32) != 0) {
                this.requiredSteps = list;
                return;
            }
            int i2 = write + 109;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.requiredSteps = instance_delegatelambda0.write;
            int i4 = write + 11;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, preload.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 91;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.initialDescription), 31, this.descriptionCallStarted);
        getDismissOnBackPress getdismissonbackpress = this.button;
        if (getdismissonbackpress == null) {
            int i5 = IconCompatParcelizer + 37;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = getdismissonbackpress.hashCode();
            int i6 = IconCompatParcelizer + 27;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode;
        }
        return this.requiredSteps.hashCode() + ((iM + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("IvrCall(id=", this.id, ", title=", this.title, ", initialDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.initialDescription, ", descriptionCallStarted=", this.descriptionCallStarted, ", button=");
        sbM.append(this.button);
        sbM.append(", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 71;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resolveDPcqOEQ)) {
            int i2 = write + 87;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        resolveDPcqOEQ resolvedpcqoeq = (resolveDPcqOEQ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, resolvedpcqoeq.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, resolvedpcqoeq.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.initialDescription, resolvedpcqoeq.initialDescription}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 59;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionCallStarted, resolvedpcqoeq.descriptionCallStarted}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, resolvedpcqoeq.button}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, resolvedpcqoeq.requiredSteps}, getCieXyz.write())).booleanValue();
        }
        int i6 = IconCompatParcelizer + 79;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
