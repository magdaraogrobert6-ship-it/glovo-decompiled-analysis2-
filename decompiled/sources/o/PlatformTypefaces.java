package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.DestinationComponent$Location;
import com.roadrunner.delivery.destination.data.models.StepComponent$DestinationInfo$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PlatformResolveInterceptorCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "destination_info")
public final class PlatformTypefaces extends PlatformFontVariationSettings_androidKtExternalSyntheticLambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final List components;
    public final String destinationName;
    public final DestinationComponent$Location location;
    public final String title;
    public static final StepComponent$DestinationInfo$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$DestinationInfo$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PlatformResolveInterceptorCompanion platformResolveInterceptorCompanion = PlatformResolveInterceptorCompanion.read;
            int i4 = IconCompatParcelizer + 15;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return platformResolveInterceptorCompanion;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(21))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$DestinationInfo$Companion] */
    static {
        int i = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ PlatformTypefaces(int i, String str, String str2, DestinationComponent$Location destinationComponent$Location, List list) {
        if (2 != (i & 2)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, PlatformResolveInterceptorCompanion.read.getDescriptor());
            throw null;
        }
        this.title = (i & 1) == 0 ? "" : str;
        this.destinationName = str2;
        if ((i & 4) == 0) {
            int i2 = write + 51;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.location = null;
        } else {
            this.location = destinationComponent$Location;
        }
        int i4 = 2 % 2;
        if ((i & 8) == 0) {
            int i5 = serializer + 63;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.components = null;
            return;
        }
        this.components = list;
        int i7 = write + 1;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.destinationName);
        DestinationComponent$Location destinationComponent$Location = this.location;
        int iHashCode2 = 0;
        if (destinationComponent$Location == null) {
            int i4 = serializer + 7;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = destinationComponent$Location.hashCode();
        }
        List list = this.components;
        if (list == null) {
            int i5 = write + 85;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            iHashCode2 = list.hashCode();
        }
        return ((iM + iHashCode) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DestinationInfo(title=", this.title, ", destinationName=", this.destinationName, ", location=");
        sbM.append(this.location);
        sbM.append(", components=");
        sbM.append(this.components);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTypefaces)) {
            int i2 = serializer + 107;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        PlatformTypefaces platformTypefaces = (PlatformTypefaces) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, platformTypefaces.title}, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 121;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinationName, platformTypefaces.destinationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, platformTypefaces.location}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 109;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, platformTypefaces.components}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = serializer + 111;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
