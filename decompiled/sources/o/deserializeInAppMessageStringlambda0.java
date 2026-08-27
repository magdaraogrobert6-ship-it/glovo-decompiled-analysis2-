package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.data.startworking.StartWorkingRequest$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.disableSdk;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class deserializeInAppMessageStringlambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String action;
    public final Map components;
    public final disableDelayedInitialization location;
    public final String opportunityId;
    public final Integer shiftId;
    public static final StartWorkingRequest$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.StartWorkingRequest$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 89;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            disableSdk disablesdk = disableSdk.serializer;
            int i4 = read + 95;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return disablesdk;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new subscribeToFeatureFlagsUpdateslambda1(1)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.StartWorkingRequest$Companion] */
    static {
        Object obj = null;
        int i = write + 45;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    public /* synthetic */ deserializeInAppMessageStringlambda0(int i, String str, disableDelayedInitialization disabledelayedinitialization, Integer num, Map map, String str2) {
        int i2;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, disableSdk.serializer.getDescriptor());
            throw null;
        }
        this.action = str;
        if ((i & 2) == 0) {
            this.location = null;
        } else {
            this.location = disabledelayedinitialization;
        }
        if ((i & 4) == 0) {
            int i3 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.shiftId = null;
        } else {
            this.shiftId = num;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.components = null;
            int i6 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
            }
            if ((i & 16) == 0) {
                this.opportunityId = str2;
                return;
            }
            i2 = IconCompatParcelizer + 125;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.opportunityId = null;
            } else {
                this.opportunityId = null;
                int i7 = 35 / 0;
            }
        }
        this.components = map;
        int i8 = 2 % 2;
        if ((i & 16) == 0) {
            this.opportunityId = str2;
            return;
        }
        i2 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.opportunityId = null;
        } else {
            this.opportunityId = null;
            int i9 = 35 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("StartWorkingRequest(action=");
        sb.append(this.action);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", shiftId=");
        sb.append(this.shiftId);
        sb.append(", components=");
        sb.append(this.components);
        sb.append(", opportunityId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.opportunityId, ")");
        int i2 = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public deserializeInAppMessageStringlambda0(String str, disableDelayedInitialization disabledelayedinitialization, Integer num, Map map, String str2) {
        str.getClass();
        this.action = str;
        this.location = disabledelayedinitialization;
        this.shiftId = num;
        this.components = map;
        this.opportunityId = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.action.hashCode();
        disableDelayedInitialization disabledelayedinitialization = this.location;
        if (disabledelayedinitialization == null) {
            int i2 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = disabledelayedinitialization.hashCode();
        }
        Integer num = this.shiftId;
        if (num == null) {
            int i4 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
            int i6 = RemoteActionCompatParcelizer + 27;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Map map = this.components;
        int iHashCode4 = map == null ? 0 : map.hashCode();
        String str = this.opportunityId;
        return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
            return true;
        }
        if (obj instanceof deserializeInAppMessageStringlambda0) {
            deserializeInAppMessageStringlambda0 deserializeinappmessagestringlambda0 = (deserializeInAppMessageStringlambda0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, deserializeinappmessagestringlambda0.action}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, deserializeinappmessagestringlambda0.location}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shiftId, deserializeinappmessagestringlambda0.shiftId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, deserializeinappmessagestringlambda0.components}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.opportunityId, deserializeinappmessagestringlambda0.opportunityId}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i4 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = IconCompatParcelizer + 7;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        int i7 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
