package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.roadrunner.delivery.common.data.model.tasks.OfflineValidation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.resolve;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class preloadlambda11 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final preloadlambda1 errorMessage;
    public final int iterations;
    public final int outputLength;
    public final FontYpTlLL0 pinAttempts;
    public final String pinHash;
    public final String pinSecret;
    public final preloadlambda1 successMessage;
    public final List trackingEvents;
    public static final OfflineValidation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.OfflineValidation$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            resolve resolveVar;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 77;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                resolveVar = resolve.read;
                int i3 = 44 / 0;
            } else {
                resolveVar = resolve.read;
            }
            int i4 = RemoteActionCompatParcelizer + 51;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return resolveVar;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new DelegatingFontLoaderForDeprecatedUsage(25))};

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i6 | i3));
        int i12 = i6 | i3;
        int i13 = i10 | i12;
        int i14 = (~(i | i6)) | (~i12);
        int i15 = i6 + i3 + i5 + (1068639271 * i4) + ((-1919980423) * i2);
        int i16 = i15 * i15;
        int i17 = ((i6 * 1648758371) - 594280448) + (1648758371 * i3) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i5) + ((-1693188096) * i4) + (611057664 * i2) + ((-810221568) * i16);
        int i18 = (i6 * 982247175) + 1844138806 + (i3 * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i5 * 982246413) + (i4 * 1533776379) + (i2 * 1016546853) + (i16 * (-1070530560));
        return i17 + ((i18 * i18) * 1708326912) != 1 ? serializer(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.OfflineValidation$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        preloadlambda11 preloadlambda11Var = (preloadlambda11) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            String str = preloadlambda11Var.pinSecret;
            obj.hashCode();
            throw null;
        }
        String str2 = preloadlambda11Var.pinSecret;
        int i4 = i2 + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        preloadlambda11 preloadlambda11Var = (preloadlambda11) objArr[0];
        int i = 2 % 2;
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return preloadlambda11Var.pinHash;
        }
        int i3 = 63 / 0;
        return preloadlambda11Var.pinHash;
    }

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.iterations;
        }
        int i3 = 33 / 0;
        return this.iterations;
    }

    public final List MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.trackingEvents;
        }
        int i3 = 80 / 0;
        return this.trackingEvents;
    }

    public final preloadlambda1 RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        preloadlambda1 preloadlambda1Var = this.successMessage;
        int i5 = i3 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return preloadlambda1Var;
    }

    public final FontYpTlLL0 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 89;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        FontYpTlLL0 fontYpTlLL0 = this.pinAttempts;
        int i5 = i2 + 15;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fontYpTlLL0;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.outputLength;
        int i6 = i2 + 89;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final preloadlambda1 serializer() {
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.errorMessage;
        }
        throw null;
    }

    public /* synthetic */ preloadlambda11(int i, String str, String str2, int i2, int i3, preloadlambda1 preloadlambda1Var, preloadlambda1 preloadlambda1Var2, FontYpTlLL0 fontYpTlLL0, List list) {
        if (127 == (i & 127)) {
            this.pinSecret = str;
            this.pinHash = str2;
            this.iterations = i2;
            this.outputLength = i3;
            this.successMessage = preloadlambda1Var;
            this.errorMessage = preloadlambda1Var2;
            this.pinAttempts = fontYpTlLL0;
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                this.trackingEvents = instance_delegatelambda0.write;
                int i4 = read + 63;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 8 / 0;
                    return;
                }
                return;
            }
            this.trackingEvents = list;
            int i6 = read + 27;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, resolve.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.outputLength, af$$ExternalSyntheticOutline0.m(this.iterations, af$$ExternalSyntheticOutline0.m(this.pinSecret.hashCode() * 31, 31, this.pinHash), 31), 31);
        int iHashCode = this.successMessage.hashCode();
        int iHashCode2 = this.errorMessage.hashCode();
        int iHashCode3 = this.trackingEvents.hashCode() + ((this.pinAttempts.hashCode() + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31);
        int i4 = IconCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("OfflineValidation(pinSecret=", this.pinSecret, ", pinHash=", this.pinHash, ", iterations=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.iterations, this.outputLength, ", outputLength=", ", successMessage=", sbM);
        sbM.append(this.successMessage);
        sbM.append(", errorMessage=");
        sbM.append(this.errorMessage);
        sbM.append(", pinAttempts=");
        sbM.append(this.pinAttempts);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 105;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 61;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof preloadlambda11)) {
            int i7 = i4 + 81;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        preloadlambda11 preloadlambda11Var = (preloadlambda11) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinSecret, preloadlambda11Var.pinSecret}, getCieXyz.write())).booleanValue()) {
            int i9 = read + 121;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinHash, preloadlambda11Var.pinHash}, getCieXyz.write())).booleanValue()) {
            int i11 = IconCompatParcelizer + 97;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (this.iterations != preloadlambda11Var.iterations || this.outputLength != preloadlambda11Var.outputLength) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.successMessage, preloadlambda11Var.successMessage}, getCieXyz.write())).booleanValue()) {
            int i13 = IconCompatParcelizer + 51;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i13 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorMessage, preloadlambda11Var.errorMessage}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pinAttempts, preloadlambda11Var.pinAttempts}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, preloadlambda11Var.trackingEvents}, getCieXyz.write())).booleanValue()) {
            int i14 = IconCompatParcelizer + 5;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i14 % 2 == 0;
        }
        int i15 = read + 31;
        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return true;
    }

    public final String MediaDescriptionCompat() {
        int iIconCompatParcelizer = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        int iIconCompatParcelizer3 = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(iIconCompatParcelizer, MapboxBuildingHighlightOptions.IconCompatParcelizer(), 861246260, iIconCompatParcelizer3, new Object[]{this}, iIconCompatParcelizer2, -861246259);
    }

    public final String write() {
        int iIconCompatParcelizer = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        int iIconCompatParcelizer3 = MapboxBuildingHighlightOptions.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(iIconCompatParcelizer, MapboxBuildingHighlightOptions.IconCompatParcelizer(), -597890516, iIconCompatParcelizer3, new Object[]{this}, iIconCompatParcelizer2, 597890516);
    }
}
