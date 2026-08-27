package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStop$Confirmation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.isAtLeast;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PausingDispatcherKtwhenStateAtLeast2 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final LifecycleDestroyedException editDetails;
    public final String editTitle;
    public final ProcessLifecycleOwner removeDetails;
    public final String removeTitle;
    public final String title;
    public final List trackingEvents;
    public static final LastStop$Confirmation$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.LastStop$Confirmation$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 9;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            isAtLeast isatleast = isAtLeast.RemoteActionCompatParcelizer;
            int i4 = write + 103;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return isatleast;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(5))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.LastStop$Confirmation$Companion] */
    static {
        int i = read + 85;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final LifecycleDestroyedException serializer() {
        int i = 2 % 2;
        int i2 = write + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        LifecycleDestroyedException lifecycleDestroyedException = this.editDetails;
        int i5 = i3 + 57;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return lifecycleDestroyedException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ PausingDispatcherKtwhenStateAtLeast2(int i, String str, String str2, String str3, ProcessLifecycleOwner processLifecycleOwner, LifecycleDestroyedException lifecycleDestroyedException, List list) {
        if (31 == (i & 31)) {
            this.title = str;
            this.editTitle = str2;
            this.removeTitle = str3;
            this.removeDetails = processLifecycleOwner;
            this.editDetails = lifecycleDestroyedException;
            if ((i & 32) == 0) {
                this.trackingEvents = instance_delegatelambda0.write;
                int i2 = write + 71;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.trackingEvents = list;
            int i4 = write + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, isAtLeast.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.editTitle), 31, this.removeTitle);
        int iHashCode = this.removeDetails.hashCode();
        int iHashCode2 = this.trackingEvents.hashCode() + ((this.editDetails.hashCode() + ((iHashCode + iM) * 31)) * 31);
        int i4 = write + 7;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Confirmation(title=", this.title, ", editTitle=", this.editTitle, ", removeTitle=");
        sbM.append(this.removeTitle);
        sbM.append(", removeDetails=");
        sbM.append(this.removeDetails);
        sbM.append(", editDetails=");
        sbM.append(this.editDetails);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 117;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof PausingDispatcherKtwhenStateAtLeast2) {
            PausingDispatcherKtwhenStateAtLeast2 pausingDispatcherKtwhenStateAtLeast2 = (PausingDispatcherKtwhenStateAtLeast2) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, pausingDispatcherKtwhenStateAtLeast2.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.editTitle, pausingDispatcherKtwhenStateAtLeast2.editTitle}, getCieXyz.write())).booleanValue()) {
                int i7 = RemoteActionCompatParcelizer + 27;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.removeTitle, pausingDispatcherKtwhenStateAtLeast2.removeTitle}, getCieXyz.write())).booleanValue()) {
                int i9 = write + 33;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.removeDetails, pausingDispatcherKtwhenStateAtLeast2.removeDetails}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.editDetails, pausingDispatcherKtwhenStateAtLeast2.editDetails}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, pausingDispatcherKtwhenStateAtLeast2.trackingEvents}, getCieXyz.write())).booleanValue();
            }
            int i11 = RemoteActionCompatParcelizer + 125;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = i3 + 79;
        RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i13 % 2 == 0;
    }
}
