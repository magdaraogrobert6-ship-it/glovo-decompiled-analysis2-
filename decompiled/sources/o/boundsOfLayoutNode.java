package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$TimerData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessextractFromLegacyFieldsextractedName;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class boundsOfLayoutNode implements showBackground {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableTaskUiItem$TimerData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$TimerData$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 71;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                accessextractFromLegacyFieldsextractedName accessextractfromlegacyfieldsextractedname = accessextractFromLegacyFieldsextractedName.IconCompatParcelizer;
                throw null;
            }
            accessextractFromLegacyFieldsextractedName accessextractfromlegacyfieldsextractedname2 = accessextractFromLegacyFieldsextractedName.IconCompatParcelizer;
            int i3 = write + 103;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return accessextractfromlegacyfieldsextractedname2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String finishedDescription;
    public final String id;
    public final String notStartedDescription;
    public final List requiredSteps;
    public final String startedDescription;
    public final int timer;
    public final getNoopState timerStartAction;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$TimerData$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(10)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(11)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(12))};
        int i = read + 73;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ boundsOfLayoutNode(int i, String str, String str2, String str3, String str4, String str5, int i2, getNoopState getnoopstate, List list, List list2) {
        if (511 == (i & 511)) {
            this.id = str;
            this.title = str2;
            this.notStartedDescription = str3;
            this.startedDescription = str4;
            this.finishedDescription = str5;
            this.timer = i2;
            this.timerStartAction = getnoopstate;
            this.requiredSteps = list;
            this.trackingEvents = list2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 511, accessextractFromLegacyFieldsextractedName.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public boundsOfLayoutNode(String str, String str2, String str3, String str4, String str5, int i, getNoopState getnoopstate, List list, List list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.id = str;
        this.title = str2;
        this.notStartedDescription = str3;
        this.startedDescription = str4;
        this.finishedDescription = str5;
        this.timer = i;
        this.timerStartAction = getnoopstate;
        this.requiredSteps = list;
        this.trackingEvents = list2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TimerData(id=", this.id, ", title=", this.title, ", notStartedDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.notStartedDescription, ", startedDescription=", this.startedDescription, ", finishedDescription=");
        sbM.append(this.finishedDescription);
        sbM.append(", timer=");
        sbM.append(this.timer);
        sbM.append(", timerStartAction=");
        sbM.append(this.timerStartAction);
        sbM.append(", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvents, ")");
        int i4 = serializer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        String str = this.notStartedDescription;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.startedDescription;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.finishedDescription;
        if (str3 == null) {
            int i4 = write + 15;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(this.timer, (((((iM + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31, 31);
        getNoopState getnoopstate = this.timerStartAction;
        if (getnoopstate != null) {
            iHashCode2 = getnoopstate.hashCode();
            int i5 = serializer + 101;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        int iHashCode5 = this.trackingEvents.hashCode() + c8$$ExternalSyntheticOutline0.m(this.requiredSteps, (iM2 + iHashCode2) * 31, 31);
        int i7 = write + 31;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return iHashCode5;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boundsOfLayoutNode)) {
            return false;
        }
        boundsOfLayoutNode boundsoflayoutnode = (boundsOfLayoutNode) obj;
        Object[] objArr = {this.id, boundsoflayoutnode.id};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.title, boundsoflayoutnode.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i2 = write + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        Object[] objArr3 = {this.notStartedDescription, boundsoflayoutnode.notStartedDescription};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            int i4 = write + 67;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr4 = {this.startedDescription, boundsoflayoutnode.startedDescription};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 53;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr5 = {this.finishedDescription, boundsoflayoutnode.finishedDescription};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            int i8 = serializer + 13;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (this.timer != boundsoflayoutnode.timer) {
            return false;
        }
        Object[] objArr6 = {this.timerStartAction, boundsoflayoutnode.timerStartAction};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            int i10 = write + 113;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        Object[] objArr7 = {this.requiredSteps, boundsoflayoutnode.requiredSteps};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr8 = {this.trackingEvents, boundsoflayoutnode.trackingEvents};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i12 = serializer + 99;
        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
