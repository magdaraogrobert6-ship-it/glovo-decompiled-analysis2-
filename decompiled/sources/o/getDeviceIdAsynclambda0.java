package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Preference$Companion;
import kotlinx.serialization.Serializable;
import o.getDeviceDataProvider;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "preference")
public final class getDeviceIdAsynclambda0 extends getContentCardCountlambda0 {
    public static final StartWorkingComponent$Preference$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Preference$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 113;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getDeviceDataProvider.serializer;
            }
            getDeviceDataProvider getdevicedataprovider = getDeviceDataProvider.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final String key;
    public final getCachedContentCardsUpdatedEvent label;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Preference$Companion] */
    static {
        int i = IconCompatParcelizer + 1;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getDeviceIdAsynclambda0(int i, String str, getCachedContentCardsUpdatedEvent getcachedcontentcardsupdatedevent) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = getcachedcontentcardsupdatedevent;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getDeviceDataProvider.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 51;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.key.hashCode();
            iHashCode = this.label.hashCode();
            i = iHashCode2 + 54;
        } else {
            int iHashCode3 = this.key.hashCode();
            iHashCode = this.label.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = RemoteActionCompatParcelizer + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return i4;
    }

    public getDeviceIdAsynclambda0(String str, getCachedContentCardsUpdatedEvent getcachedcontentcardsupdatedevent) {
        str.getClass();
        this.key = str;
        this.label = getcachedcontentcardsupdatedevent;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Preference(key=" + this.key + ", label=" + this.label + ")";
        int i2 = serializer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getDeviceIdAsynclambda0)) {
                return false;
            }
            getDeviceIdAsynclambda0 getdeviceidasynclambda0 = (getDeviceIdAsynclambda0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, getdeviceidasynclambda0.key}, getCieXyz.write())).booleanValue()) {
                int i5 = serializer + 115;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, getdeviceidasynclambda0.label}, getCieXyz.write())).booleanValue();
        }
        int i7 = i3 + 9;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
