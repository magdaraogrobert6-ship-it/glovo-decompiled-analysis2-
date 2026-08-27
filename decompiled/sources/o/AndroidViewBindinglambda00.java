package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidViewBindinglambda9;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "destination_info")
public final class AndroidViewBindinglambda00 implements fastCoerceIn {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final List components;
    public final String destinationName;
    public final AndroidViewHolderlayoutNode12 location;
    public final String title;
    public static final DestinationInfo$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 5;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return AndroidViewBindinglambda9.read;
            }
            AndroidViewBindinglambda9 androidViewBindinglambda9 = AndroidViewBindinglambda9.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(26))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
    }

    public /* synthetic */ AndroidViewBindinglambda00(int i, String str, String str2, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, List list) {
        if (2 != (i & 2)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, AndroidViewBindinglambda9.read.getDescriptor());
            throw null;
        }
        this.title = (i & 1) == 0 ? "" : str;
        this.destinationName = str2;
        if ((i & 4) == 0) {
            this.location = null;
            int i2 = 2 % 2;
        } else {
            this.location = androidViewHolderlayoutNode12;
        }
        if ((i & 8) == 0) {
            int i3 = IconCompatParcelizer + 93;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.components = null;
            return;
        }
        this.components = list;
        int i5 = IconCompatParcelizer + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[PHI: r1 r4
  0x0042: PHI (r1v13 int) = (r1v7 int), (r1v17 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r4v6 o.AndroidViewHolderlayoutNode12) = (r4v1 o.AndroidViewHolderlayoutNode12), (r4v8 o.AndroidViewHolderlayoutNode12) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 int) = (r1v7 int), (r1v17 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12;
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() / 70, 91, this.destinationName);
            androidViewHolderlayoutNode12 = this.location;
            if (androidViewHolderlayoutNode12 == null) {
                int i3 = read + 37;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = androidViewHolderlayoutNode12.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.destinationName);
            androidViewHolderlayoutNode12 = this.location;
            if (androidViewHolderlayoutNode12 == null) {
                int i5 = read + 37;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = androidViewHolderlayoutNode12.hashCode();
            }
        }
        List list = this.components;
        return ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DestinationInfo(title=", this.title, ", destinationName=", this.destinationName, ", location=");
        sbM.append(this.location);
        sbM.append(", components=");
        sbM.append(this.components);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 117;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 1;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return true;
        }
        if (obj instanceof AndroidViewBindinglambda00) {
            AndroidViewBindinglambda00 androidViewBindinglambda00 = (AndroidViewBindinglambda00) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidViewBindinglambda00.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinationName, androidViewBindinglambda00.destinationName}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, androidViewBindinglambda00.location}, getCieXyz.write())).booleanValue()) {
                    int i4 = IconCompatParcelizer + 67;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidViewBindinglambda00.components}, getCieXyz.write())).booleanValue();
            }
            int i5 = read + 113;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = read + 119;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
