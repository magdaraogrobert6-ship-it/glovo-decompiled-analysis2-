package o;

import android.os.Process;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ff extends fe {
    public static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public static int RemoteActionCompatParcelizer;
    public final g4 IconCompatParcelizer;
    public final ArrayList read;
    public final int write;

    public ff(int i, ArrayList arrayList) {
        g4 g4Var = new g4();
        super(g5.NEVER);
        this.read = arrayList;
        this.write = i;
        this.IconCompatParcelizer = g4Var;
    }

    @Override // o.fe
    public final g4 serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 117;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        g4 g4Var = this.IconCompatParcelizer;
        int i5 = i2 + 113;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return g4Var;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 107;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.write, this.read.hashCode() * 31, 31);
        int i4 = RatingCompat + 81;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof ff)) {
                int i4 = i3 + 21;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            ff ffVar = (ff) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ffVar.read}, getCieXyz.write())).booleanValue() || this.write != ffVar.write) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ffVar.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DimmedPolygon(holes=" + this.read + ", fillColor=" + this.write + ", visibleZoomRange=" + this.IconCompatParcelizer + ")";
        int i2 = MediaSessionCompatQueueItem + 109;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public static int IconCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 9604278;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return MediaDescriptionCompat;
        }
        int iMyTid = Process.myTid();
        MediaDescriptionCompat = iMyTid;
        return iMyTid;
    }
}
