package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.DestinationLocation;
import com.roadrunner.delivery.destination.data.models.StepComponent$Map$Companion;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.createDefaultFO1MlWM;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "map")
public final class PlatformResolveInterceptorCompanionDefault1 extends PlatformFontVariationSettings_androidKtExternalSyntheticLambda0 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StepComponent$Map$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Map$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 81;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return createDefaultFO1MlWM.serializer;
            }
            createDefaultFO1MlWM createdefaultfo1mlwm = createDefaultFO1MlWM.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final List components;
    public final DestinationLocation destinationLocation;
    public final boolean enablePinConnections;
    public final String expandMapCaption;
    public final List pins;
    public final boolean riderLocationEnabled;
    public final String style;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Map$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3Response$$ExternalSyntheticLambda0(22)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3Response$$ExternalSyntheticLambda0(23)), null, null, null};
        int i = IconCompatParcelizer + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    public /* synthetic */ PlatformResolveInterceptorCompanionDefault1(int i, boolean z, List list, DestinationLocation destinationLocation, List list2, String str, String str2, boolean z2) {
        if (13 == (i & 13)) {
            this.riderLocationEnabled = z;
            if ((i & 2) == 0) {
                this.components = instance_delegatelambda0.write;
            } else {
                this.components = list;
            }
            this.destinationLocation = destinationLocation;
            this.pins = list2;
            if ((i & 16) == 0) {
                this.style = "mapbox://styles/mapbox/streets-v11";
            } else {
                this.style = str;
            }
            if ((i & 32) == 0) {
                this.expandMapCaption = null;
                int i2 = write + 35;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                this.expandMapCaption = str2;
                int i4 = serializer + 29;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 5;
                }
                if ((i & 64) == 0) {
                    this.enablePinConnections = false;
                    return;
                } else {
                    this.enablePinConnections = z2;
                    return;
                }
            }
            int i6 = 2 % 2;
            if ((i & 64) == 0) {
                this.enablePinConnections = false;
                return;
            } else {
                this.enablePinConnections = z2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, createDefaultFO1MlWM.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.components, Boolean.hashCode(this.riderLocationEnabled) * 31, 31);
        int iM2 = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.pins, (this.destinationLocation.hashCode() + iM) * 31, 31), 31, this.style);
        String str = this.expandMapCaption;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = serializer + 23;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iHashCode2 = Boolean.hashCode(this.enablePinConnections) + ((iM2 + iHashCode) * 31);
        int i6 = write + 41;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Map(riderLocationEnabled=");
        sb.append(this.riderLocationEnabled);
        sb.append(", components=");
        sb.append(this.components);
        sb.append(", destinationLocation=");
        sb.append(this.destinationLocation);
        sb.append(", pins=");
        sb.append(this.pins);
        sb.append(", style=");
        c8$$ExternalSyntheticOutline0.m(sb, this.style, ", expandMapCaption=", this.expandMapCaption, ", enablePinConnections=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.enablePinConnections, ")");
        int i2 = serializer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlatformResolveInterceptorCompanionDefault1) {
            PlatformResolveInterceptorCompanionDefault1 platformResolveInterceptorCompanionDefault1 = (PlatformResolveInterceptorCompanionDefault1) obj;
            if (this.riderLocationEnabled == platformResolveInterceptorCompanionDefault1.riderLocationEnabled) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, platformResolveInterceptorCompanionDefault1.components}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinationLocation, platformResolveInterceptorCompanionDefault1.destinationLocation}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pins, platformResolveInterceptorCompanionDefault1.pins}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, platformResolveInterceptorCompanionDefault1.style}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expandMapCaption, platformResolveInterceptorCompanionDefault1.expandMapCaption}, getCieXyz.write())).booleanValue() && this.enablePinConnections == platformResolveInterceptorCompanionDefault1.enablePinConnections;
                }
                int i2 = write + 95;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 73;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 69;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
