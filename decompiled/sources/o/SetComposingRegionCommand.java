package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.model.ClientMetadata$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SetComposingRegionCommand {
    public static final ClientMetadata$Companion Companion = new ClientMetadata$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final SetSelectionCommand captureLocation;
    public final long capturedAt;

    static {
        int i = serializer + 51;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ SetComposingRegionCommand(int i, long j, SetSelectionCommand setSelectionCommand) {
        if (1 == (i & 1)) {
            this.capturedAt = j;
            if ((i & 2) == 0) {
                this.captureLocation = null;
                int i2 = read + 111;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.captureLocation = setSelectionCommand;
            int i4 = read + 13;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, RecordingInputConnection_androidKt.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Long.hashCode(this.capturedAt);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.capturedAt);
        SetSelectionCommand setSelectionCommand = this.captureLocation;
        if (setSelectionCommand == null) {
            i = 0;
        } else {
            int iHashCode2 = setSelectionCommand.hashCode();
            int i4 = read + 99;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public SetComposingRegionCommand(long j, SetSelectionCommand setSelectionCommand) {
        this.capturedAt = j;
        this.captureLocation = setSelectionCommand;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ClientMetadata(capturedAt=" + this.capturedAt + ", captureLocation=" + this.captureLocation + ")";
        int i2 = read + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 21;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof SetComposingRegionCommand) {
            SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
            if (this.capturedAt != setComposingRegionCommand.capturedAt) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.captureLocation, setComposingRegionCommand.captureLocation}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = read + 81;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = read + 79;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
