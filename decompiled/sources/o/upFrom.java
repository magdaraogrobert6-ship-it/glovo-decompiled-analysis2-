package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStop$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class upFrom extends DelegatingFrameMetricsListener {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final PausingDispatcherKtwhenStateAtLeast2 confirmation;
    public final boolean isEnabled;
    public final ProcessLifecycleOwnerattach1onActivityPreCreated1 lastStopDetails;
    public final onActivityPreCreated location;
    public final String selectedAddress;
    public final String subtitle;
    public final String title;
    public final List trackingEvents;
    public final String type;
    public static final LastStop$Companion Companion = new LastStop$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(4)), null};

    static {
        int i = write + 79;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PausingDispatcherKtwhenStateAtLeast2 serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 117;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PausingDispatcherKtwhenStateAtLeast2 pausingDispatcherKtwhenStateAtLeast2 = this.confirmation;
        int i5 = i2 + 59;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return pausingDispatcherKtwhenStateAtLeast2;
    }

    public final ProcessLifecycleOwnerattach1onActivityPreCreated1 write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        ProcessLifecycleOwnerattach1onActivityPreCreated1 processLifecycleOwnerattach1onActivityPreCreated1 = this.lastStopDetails;
        int i5 = i3 + 3;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return processLifecycleOwnerattach1onActivityPreCreated1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    public upFrom(int i, String str, boolean z, String str2, onActivityPreCreated onactivityprecreated, String str3, ProcessLifecycleOwnerattach1onActivityPreCreated1 processLifecycleOwnerattach1onActivityPreCreated1, PausingDispatcherKtwhenStateAtLeast2 pausingDispatcherKtwhenStateAtLeast2, List list, String str4) {
        int i2;
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ProcessLifecycleInitializer.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.title = str;
        this.isEnabled = z;
        if ((i & 4) != 0) {
            this.subtitle = str2;
            int i3 = IconCompatParcelizer + 67;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
            }
            if ((i & 8) == 0) {
                i2 = IconCompatParcelizer + 115;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    this.location = null;
                    int i4 = 83 / 0;
                } else {
                    this.location = null;
                }
            } else {
                this.location = onactivityprecreated;
            }
            if ((i & 16) == 0) {
                this.selectedAddress = null;
            } else {
                this.selectedAddress = str3;
                int i5 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.lastStopDetails = null;
            } else {
                this.lastStopDetails = processLifecycleOwnerattach1onActivityPreCreated1;
            }
            if ((i & 64) == 0) {
                int i6 = IconCompatParcelizer + 55;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                this.confirmation = null;
            } else {
                this.confirmation = pausingDispatcherKtwhenStateAtLeast2;
            }
            int i8 = 2 % 2;
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                int i9 = IconCompatParcelizer + 71;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                this.trackingEvents = instance_delegatelambda0.write;
            } else {
                this.trackingEvents = list;
            }
            if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
                this.type = "last_stop";
            } else {
                this.type = str4;
            }
        }
        this.subtitle = null;
        int i11 = 2 % 2;
        if ((i & 8) == 0) {
            i2 = IconCompatParcelizer + 115;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.location = null;
                int i12 = 83 / 0;
            } else {
                this.location = null;
            }
        } else {
            this.location = onactivityprecreated;
        }
        if ((i & 16) == 0) {
            this.selectedAddress = null;
        } else {
            this.selectedAddress = str3;
            int i13 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.lastStopDetails = null;
        } else {
            this.lastStopDetails = processLifecycleOwnerattach1onActivityPreCreated1;
        }
        if ((i & 64) == 0) {
            int i14 = IconCompatParcelizer + 55;
            serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            this.confirmation = null;
        } else {
            this.confirmation = pausingDispatcherKtwhenStateAtLeast2;
        }
        int i16 = 2 % 2;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i17 = IconCompatParcelizer + 71;
            serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            this.trackingEvents = instance_delegatelambda0.write;
        } else {
            this.trackingEvents = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.type = "last_stop";
        } else {
            this.type = str4;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("LastStop(title=", this.title, ", isEnabled=", ", subtitle=", this.isEnabled);
        sbM.append(this.subtitle);
        sbM.append(", location=");
        sbM.append(this.location);
        sbM.append(", selectedAddress=");
        sbM.append(this.selectedAddress);
        sbM.append(", lastStopDetails=");
        sbM.append(this.lastStopDetails);
        sbM.append(", confirmation=");
        sbM.append(this.confirmation);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.isEnabled);
        String str = this.subtitle;
        if (str == null) {
            int i4 = IconCompatParcelizer + 7;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        onActivityPreCreated onactivityprecreated = this.location;
        if (onactivityprecreated == null) {
            int i5 = serializer + 125;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = onactivityprecreated.hashCode();
        }
        String str2 = this.selectedAddress;
        if (str2 == null) {
            int i7 = IconCompatParcelizer + 35;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        ProcessLifecycleOwnerattach1onActivityPreCreated1 processLifecycleOwnerattach1onActivityPreCreated1 = this.lastStopDetails;
        int iHashCode4 = processLifecycleOwnerattach1onActivityPreCreated1 == null ? 0 : processLifecycleOwnerattach1onActivityPreCreated1.hashCode();
        PausingDispatcherKtwhenStateAtLeast2 pausingDispatcherKtwhenStateAtLeast2 = this.confirmation;
        return this.trackingEvents.hashCode() + ((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (pausingDispatcherKtwhenStateAtLeast2 != null ? pausingDispatcherKtwhenStateAtLeast2.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 87;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upFrom)) {
            int i4 = i2 + 37;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        upFrom upfrom = (upFrom) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, upfrom.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isEnabled != upfrom.isEnabled) {
            int i6 = IconCompatParcelizer + 79;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, upfrom.subtitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, upfrom.location}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 109;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selectedAddress, upfrom.selectedAddress}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastStopDetails, upfrom.lastStopDetails}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmation, upfrom.confirmation}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, upfrom.trackingEvents}, getCieXyz.write())).booleanValue();
        }
        int i9 = serializer + 5;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }
}
