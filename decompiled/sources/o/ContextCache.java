package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CancelOrderData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getFromDefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ContextCache {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String afterTimerDescription;
    public final ComposeAnimationState button;
    public final String description;
    public final String duringTimerDescription;
    public final String id;
    public final List requiredSteps;
    public final String title;
    public static final CustomerUnavailableTaskUiItem$CancelOrderData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CancelOrderData$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 125;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getFromDefault getfromdefault = getFromDefault.write;
            int i4 = RemoteActionCompatParcelizer + 93;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getfromdefault;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new sourceInformationContextOfdefault(2))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CancelOrderData$Companion] */
    static {
        int i = IconCompatParcelizer + 69;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    public /* synthetic */ ContextCache(int i, String str, String str2, String str3, String str4, ComposeAnimationState composeAnimationState, String str5, List list) {
        if (127 == (i & 127)) {
            this.title = str;
            this.description = str2;
            this.duringTimerDescription = str3;
            this.afterTimerDescription = str4;
            this.button = composeAnimationState;
            this.id = str5;
            this.requiredSteps = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, getFromDefault.write.getDescriptor());
        throw null;
    }

    public ContextCache(String str, String str2, String str3, String str4, ComposeAnimationState composeAnimationState, String str5, List list) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.title = str;
        this.description = str2;
        this.duringTimerDescription = str3;
        this.afterTimerDescription = str4;
        this.button = composeAnimationState;
        this.id = str5;
        this.requiredSteps = list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CancelOrderData(title=", this.title, ", description=", this.description, ", duringTimerDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.duringTimerDescription, ", afterTimerDescription=", this.afterTimerDescription, ", button=");
        sbM.append(this.button);
        sbM.append(", id=");
        sbM.append(this.id);
        sbM.append(", requiredSteps=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.requiredSteps, ")");
        int i4 = read + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.duringTimerDescription), 31, this.afterTimerDescription);
        ComposeAnimationState composeAnimationState = this.button;
        if (composeAnimationState == null) {
            int i2 = read + 23;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = composeAnimationState.hashCode();
        }
        String str = this.id;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer;
            int i5 = i4 + 19;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i5 % 2 == 0 ? 1 : 0;
            int i6 = i4 + 49;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = str.hashCode();
        }
        List list = this.requiredSteps;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextCache)) {
            return false;
        }
        ContextCache contextCache = (ContextCache) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, contextCache.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, contextCache.description}, getCieXyz.write())).booleanValue()) {
            int i3 = RemoteActionCompatParcelizer + 49;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duringTimerDescription, contextCache.duringTimerDescription}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 111;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.afterTimerDescription, contextCache.afterTimerDescription}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.button, contextCache.button}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, contextCache.id}, getCieXyz.write())).booleanValue()) {
            int i7 = read + 63;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, contextCache.requiredSteps}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 99;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
