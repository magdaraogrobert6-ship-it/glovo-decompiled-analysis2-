package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableV2TaskUiItem$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.extractParameterInfo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessibleField implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableV2TaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableV2TaskUiItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                extractParameterInfo extractparameterinfo = extractParameterInfo.RemoteActionCompatParcelizer;
                throw null;
            }
            extractParameterInfo extractparameterinfo2 = extractParameterInfo.RemoteActionCompatParcelizer;
            int i3 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return extractparameterinfo2;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String description;
    public final boolean isOptional;
    public final String taskId;
    public final fixedHeightOenEA2s taskState;
    public final String title;
    public final List trackingEvents;
    public final List utccComponents;

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 119;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableV2TaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(13)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(14)), null};
        int i = write + 103;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.taskId;
        int i5 = i2 + 35;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final fixedHeightOenEA2s RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.taskState;
        }
        int i3 = 2 / 0;
        return this.taskState;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.isOptional;
        }
        int i3 = 92 / 0;
        return this.isOptional;
    }

    public /* synthetic */ accessibleField(int i, String str, boolean z, String str2, String str3, List list, List list2, fixedHeightOenEA2s fixedheightoenea2s) {
        if (63 == (i & 63)) {
            this.taskId = str;
            this.isOptional = z;
            this.title = str2;
            this.description = str3;
            this.utccComponents = list;
            this.trackingEvents = list2;
            if ((i & 64) == 0) {
                this.taskState = new fixedHeightOenEA2s();
                int i2 = read + 27;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.taskState = fixedheightoenea2s;
            int i4 = RemoteActionCompatParcelizer + 19;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, extractParameterInfo.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.taskState.hashCode() + c8$$ExternalSyntheticOutline0.m(this.trackingEvents, c8$$ExternalSyntheticOutline0.m(this.utccComponents, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.isOptional), 31, this.title), 31, this.description), 31), 31);
        int i4 = read + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return iHashCode;
    }

    public accessibleField(String str, boolean z, String str2, String str3, List list, List list2, fixedHeightOenEA2s fixedheightoenea2s) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        this.taskId = str;
        this.isOptional = z;
        this.title = str2;
        this.description = str3;
        this.utccComponents = list;
        this.trackingEvents = list2;
        this.taskState = fixedheightoenea2s;
    }

    public static accessibleField write(accessibleField accessiblefield, ArrayList arrayList, fixedHeightOenEA2s fixedheightoenea2s, int i) {
        int i2 = 2 % 2;
        String str = accessiblefield.taskId;
        boolean z = accessiblefield.isOptional;
        String str2 = accessiblefield.title;
        String str3 = accessiblefield.description;
        List list = arrayList;
        if ((i & 16) != 0) {
            int i3 = RemoteActionCompatParcelizer + 31;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i4;
            int i5 = i3 % 2;
            List list2 = accessiblefield.utccComponents;
            int i6 = i4 + 77;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            list = list2;
        }
        List list3 = list;
        List list4 = accessiblefield.trackingEvents;
        if ((i & 64) != 0) {
            int i8 = RemoteActionCompatParcelizer + 57;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            fixedheightoenea2s = accessiblefield.taskState;
        }
        fixedHeightOenEA2s fixedheightoenea2s2 = fixedheightoenea2s;
        accessiblefield.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list3.getClass();
        list4.getClass();
        fixedheightoenea2s2.getClass();
        return new accessibleField(str, z, str2, str3, list3, list4, fixedheightoenea2s2);
    }

    public /* synthetic */ accessibleField(String str, boolean z, String str2, String str3, ArrayList arrayList, List list) {
        this(str, z, str2, str3, arrayList, list, new fixedHeightOenEA2s());
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("CustomerUnavailableV2TaskUiItem(taskId=", this.taskId, ", isOptional=", ", title=", this.isOptional);
        c8$$ExternalSyntheticOutline0.m(sbM, this.title, ", description=", this.description, ", utccComponents=");
        sbM.append(this.utccComponents);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(", taskState=");
        sbM.append(this.taskState);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessibleField)) {
            return false;
        }
        accessibleField accessiblefield = (accessibleField) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, accessiblefield.taskId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isOptional != accessiblefield.isOptional) {
            int i3 = read + 93;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, accessiblefield.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, accessiblefield.description}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 65;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.utccComponents, accessiblefield.utccComponents}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, accessiblefield.trackingEvents}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskState, accessiblefield.taskState}, getCieXyz.write())).booleanValue();
        }
        int i7 = read + 55;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
