package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.ButtonUiItem$Companion;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getExitjXw82LU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ComposeAnimationState {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final ButtonUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.ButtonUiItem$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 105;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getExitjXw82LU.read;
            }
            int i3 = 63 / 0;
            return getExitjXw82LU.read;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final getNoopState actionData;
    public final Integer actionIcon;
    public final String actionTitle;
    public final List trackingEvents;
    public final ButtonTypeToken type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.ButtonUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(15)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(16)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(17))};
        int i = read + 97;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    public /* synthetic */ ComposeAnimationState(int i, Integer num, String str, getNoopState getnoopstate, List list, ButtonTypeToken buttonTypeToken) {
        if (31 == (i & 31)) {
            this.actionIcon = num;
            this.actionTitle = str;
            this.actionData = getnoopstate;
            this.trackingEvents = list;
            this.type = buttonTypeToken;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, getExitjXw82LU.read.getDescriptor());
        throw null;
    }

    public ComposeAnimationState(Integer num, String str, getNoopState getnoopstate, List list, ButtonTypeToken buttonTypeToken) {
        str.getClass();
        buttonTypeToken.getClass();
        this.actionIcon = num;
        this.actionTitle = str;
        this.actionData = getnoopstate;
        this.trackingEvents = list;
        this.type = buttonTypeToken;
    }

    public final int hashCode() {
        Integer num;
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            num = this.actionIcon;
            iHashCode = 1;
            if (num == null) {
                int i4 = i3 + 53;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i3 + 93;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = num.hashCode();
            }
        } else {
            num = this.actionIcon;
            if (num == null) {
                iHashCode = 0;
                int i8 = i3 + 53;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i3 + 93;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = num.hashCode();
            }
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode2 * 31, 31, this.actionTitle);
        getNoopState getnoopstate = this.actionData;
        if (getnoopstate == null) {
            int i12 = write + 83;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            iHashCode = getnoopstate.hashCode();
        }
        int iHashCode3 = this.type.hashCode() + c8$$ExternalSyntheticOutline0.m(this.trackingEvents, (iM + iHashCode) * 31, 31);
        int i14 = write + 3;
        IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonUiItem(actionIcon=" + this.actionIcon + ", actionTitle=" + this.actionTitle + ", actionData=" + this.actionData + ", trackingEvents=" + this.trackingEvents + ", type=" + this.type + ")";
        int i2 = IconCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 101;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ComposeAnimationState)) {
            return false;
        }
        ComposeAnimationState composeAnimationState = (ComposeAnimationState) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionIcon, composeAnimationState.actionIcon}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionTitle, composeAnimationState.actionTitle}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionData, composeAnimationState.actionData}, getCieXyz.write())).booleanValue()) {
                int i4 = IconCompatParcelizer + 93;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 == 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, composeAnimationState.trackingEvents}, getCieXyz.write())).booleanValue()) {
                return this.type == composeAnimationState.type;
            }
            int i5 = IconCompatParcelizer + 33;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = IconCompatParcelizer + 13;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
