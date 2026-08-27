package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$IvrCallData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessextractParameterInfo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class asTree implements showBackground {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final ComposeAnimationState button;
    public final String descriptionCallStarted;
    public final String id;
    public final String initialDescription;
    public final List requiredSteps;
    public final String title;
    public static final CustomerUnavailableTaskUiItem$IvrCallData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$IvrCallData$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 15;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessextractParameterInfo accessextractparameterinfo = accessextractParameterInfo.IconCompatParcelizer;
            int i4 = write + 67;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
            return accessextractparameterinfo;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new sourceInformationContextOfdefault(9))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$IvrCallData$Companion] */
    static {
        int i = read + 35;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ asTree(int i, String str, String str2, String str3, String str4, ComposeAnimationState composeAnimationState, List list) {
        if (63 == (i & 63)) {
            this.id = str;
            this.title = str2;
            this.initialDescription = str3;
            this.descriptionCallStarted = str4;
            this.button = composeAnimationState;
            this.requiredSteps = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, accessextractParameterInfo.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public asTree(String str, String str2, String str3, String str4, ComposeAnimationState composeAnimationState, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.id = str;
        this.title = str2;
        this.initialDescription = str3;
        this.descriptionCallStarted = str4;
        this.button = composeAnimationState;
        this.requiredSteps = list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.initialDescription), 31, this.descriptionCallStarted);
        ComposeAnimationState composeAnimationState = this.button;
        if (composeAnimationState == null) {
            int i4 = IconCompatParcelizer + 77;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 61;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = composeAnimationState.hashCode();
        }
        return this.requiredSteps.hashCode() + ((iM + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("IvrCallData(id=", this.id, ", title=", this.title, ", initialDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.initialDescription, ", descriptionCallStarted=", this.descriptionCallStarted, ", button=");
        sbM.append(this.button);
        sbM.append(", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 33;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asTree)) {
            return false;
        }
        asTree astree = (asTree) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, astree.id}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, astree.title}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.initialDescription, astree.initialDescription}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 43;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionCallStarted, astree.descriptionCallStarted}, getCieXyz.write())).booleanValue()) {
                    int i4 = write + 105;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, astree.button}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, astree.requiredSteps}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i6 = write + 21;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i6 % 2 == 0;
            }
            int i7 = IconCompatParcelizer + 109;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = IconCompatParcelizer + 45;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
