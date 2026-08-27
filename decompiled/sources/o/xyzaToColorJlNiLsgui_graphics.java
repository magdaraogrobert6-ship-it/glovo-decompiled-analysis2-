package o;

import java.util.List;
import org.bouncycastle.asn1.ASN1UniversalType;

/* JADX INFO: loaded from: classes.dex */
public final class xyzaToColorJlNiLsgui_graphics extends ASN1UniversalType {
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyzaToColorJlNiLsgui_graphics(List list, int i) {
        super(1, list);
        this.read = i;
    }

    @Override // o.absRcpResponse
    public final getColors write() {
        int i = this.read;
        int i2 = 0;
        if (i == 0) {
            return new getTransformui_graphics((List) this.RatingCompat, i2);
        }
        int i3 = 1;
        if (i == 1) {
            return new getTransformui_graphics((List) this.RatingCompat, i3);
        }
        if (i == 2) {
            return new accessgetCiecat02cp((List) this.RatingCompat, 1);
        }
        int i4 = 3;
        if (i == 3) {
            return new getTransformui_graphics((List) this.RatingCompat, i4);
        }
        if (i != 4) {
            return i != 5 ? new Adaptation((List) this.RatingCompat) : new accessgetCiecat02cp((List) this.RatingCompat, 2);
        }
        return new accessgetCiecat02cp((List) this.RatingCompat, 0);
    }
}
