package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.visitessentials.VenueType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class decodeSampledBitmapFromStream {
    public static final calculateInSampleSizelambda0 Companion = new calculateInSampleSizelambda0();
    public static final setGraphicModalMaxWidthDp[] h;
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;
    public final Map e;
    public final deleteSharedPreferencesFilelambda1 f;
    public final VenueType g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.b;
        return this.f.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(this.d, af$$ExternalSyntheticOutline0.m(((r0 * 31) + (z2 ? 1 : z2)) * 31, 31, this.c), 31), this.e, 31);
    }

    static {
        setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(onClickedlambda0.serializer, 0);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        beforeOpened beforeopened = new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed);
        VenueType[] venueTypeArrValues = VenueType.values();
        venueTypeArrValues.getClass();
        h = new setGraphicModalMaxWidthDp[]{null, null, null, setwasclosemessagecalled, beforeopened, null, new EnumSerializer("com.sentiance.visitessentials.VenueType", (Enum[]) venueTypeArrValues)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof decodeSampledBitmapFromStream)) {
            return false;
        }
        decodeSampledBitmapFromStream decodesampledbitmapfromstream = (decodeSampledBitmapFromStream) obj;
        if (this.a != decodesampledbitmapfromstream.a || this.b != decodesampledbitmapfromstream.b) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, decodesampledbitmapfromstream.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, decodesampledbitmapfromstream.d}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.e, decodesampledbitmapfromstream.e}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.f, decodesampledbitmapfromstream.f}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "VisitEssentialsOutput(isHome=" + this.a + ", isWork=" + this.b + ", chosenVenueType=" + this.c + ", chosenVenueTypeProb=" + this.d + ", debugInformation=" + this.e + ", semanticTimeDefinition=" + this.f + ')';
    }

    public decodeSampledBitmapFromStream(boolean z, boolean z2, String str, List list, LinkedHashMap linkedHashMap, deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda1) {
        linkedHashMap.getClass();
        deletesharedpreferencesfilelambda1.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
        this.e = linkedHashMap;
        this.f = deletesharedpreferencesfilelambda1;
        VenueType.Companion.getClass();
        this.g = BrazeFunctionNotImplemented.write(str);
    }
}
