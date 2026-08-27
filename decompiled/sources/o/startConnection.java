package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.WorkOpportunityResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.InstallReferrerReadListener;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class startConnection {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final String id;
    public final List subzones;
    public final String type;
    public final InstallReferrer2 workZone;
    public static final WorkOpportunityResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.WorkOpportunityResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 45;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return InstallReferrerReadListener.IconCompatParcelizer;
            }
            InstallReferrerReadListener installReferrerReadListener = InstallReferrerReadListener.IconCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(27))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.WorkOpportunityResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ startConnection(int i, String str, String str2, String str3, InstallReferrer2 installReferrer2, List list) {
        Object obj = null;
        if (15 == (i & 15)) {
            this.id = str;
            this.type = str2;
            this.description = str3;
            this.workZone = installReferrer2;
            if ((i & 16) == 0) {
                this.subzones = null;
                int i2 = serializer + 5;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.subzones = list;
            int i3 = serializer + 81;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, InstallReferrerReadListener.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type), 31, this.description);
        int iHashCode2 = this.workZone.hashCode();
        List list = this.subzones;
        if (list == null) {
            int i2 = write + 97;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return ((iHashCode2 + iM) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("WorkOpportunityResponse(id=", this.id, ", type=", this.type, ", description=");
        sbM.append(this.description);
        sbM.append(", workZone=");
        sbM.append(this.workZone);
        sbM.append(", subzones=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.subzones, ")");
        int i4 = write + 117;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startConnection)) {
            int i2 = serializer + 99;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        startConnection startconnection = (startConnection) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, startconnection.id}, getCieXyz.write())).booleanValue()) {
            int i3 = serializer;
            int i4 = i3 + 41;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 63;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, startconnection.type}, getCieXyz.write())).booleanValue()) {
            int i8 = serializer + 49;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, startconnection.description}, getCieXyz.write())).booleanValue()) {
            int i10 = write + 103;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.workZone, startconnection.workZone}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subzones, startconnection.subzones}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i11 = serializer + 53;
        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
