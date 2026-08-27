package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.Route$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.extract;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class clearDexDir {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final invokeyxL6bBk actions;
    public final String address;
    public final String name;
    public final findField payTag;
    public final String reference;
    public final String shortCode;
    public final String time;
    public final Map trackingParams;
    public final String type;
    public static final Route$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.Route$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 3;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                extract extractVar = extract.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            extract extractVar2 = extract.write;
            int i3 = write + 119;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return extractVar2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(15))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.Route$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ clearDexDir(int i, String str, String str2, String str3, String str4, String str5, String str6, findField findfield, invokeyxL6bBk invokeyxl6bbk, Map map) {
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, extract.write.getDescriptor());
            throw null;
        }
        this.type = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        int i2 = 2 % 2;
        if ((i & 8) == 0) {
            this.reference = null;
        } else {
            this.reference = str4;
        }
        if ((i & 16) == 0) {
            this.shortCode = null;
        } else {
            this.shortCode = str5;
        }
        if ((i & 32) == 0) {
            this.time = null;
            int i3 = 2 % 2;
        } else {
            this.time = str6;
        }
        if ((i & 64) == 0) {
            int i4 = write + 101;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i5;
            if (i4 % 2 == 0) {
                this.payTag = null;
                throw null;
            }
            this.payTag = null;
            int i6 = i5 + 123;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.payTag = findfield;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i9 = serializer + 95;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            this.actions = null;
        } else {
            this.actions = invokeyxl6bbk;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            this.trackingParams = map;
            return;
        }
        this.trackingParams = null;
        int i11 = write + 55;
        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Route(type=", this.type, ", name=", this.name, ", address=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.address, ", reference=", this.reference, ", shortCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.shortCode, ", time=", this.time, ", payTag=");
        sbM.append(this.payTag);
        sbM.append(", actions=");
        sbM.append(this.actions);
        sbM.append(", trackingParams=");
        String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sbM, this.trackingParams, ")");
        int i4 = serializer + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.name);
        String str = this.address;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.reference;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.shortCode;
        if (str3 == null) {
            int i2 = serializer + 53;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
            int i3 = write + 17;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        String str4 = this.time;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        findField findfield = this.payTag;
        if (findfield == null) {
            int i5 = write + 101;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = findfield.hashCode();
        }
        invokeyxL6bBk invokeyxl6bbk = this.actions;
        if (invokeyxl6bbk == null) {
            int i7 = serializer + 19;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = invokeyxl6bbk.hashCode();
        }
        Map map = this.trackingParams;
        if (map != null) {
            iHashCode4 = map.hashCode();
            int i9 = serializer + 85;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return ((((((((((((iM + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 33;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 31;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof clearDexDir)) {
            int i7 = i2 + 43;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        clearDexDir cleardexdir = (clearDexDir) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, cleardexdir.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, cleardexdir.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object obj2 = null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, cleardexdir.address}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 89;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reference, cleardexdir.reference}, getCieXyz.write())).booleanValue()) {
            int i10 = serializer + 121;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shortCode, cleardexdir.shortCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.time, cleardexdir.time}, getCieXyz.write())).booleanValue()) {
            int i11 = serializer + 61;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payTag, cleardexdir.payTag}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actions, cleardexdir.actions}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingParams, cleardexdir.trackingParams}, getCieXyz.write())).booleanValue();
        }
        int i13 = write + 23;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }
}
