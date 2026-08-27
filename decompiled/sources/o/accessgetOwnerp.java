package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetRunUpdatep;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "location_details")
public final class accessgetOwnerp implements AndroidViewBindinglambda80 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String address;
    public final List components;
    public final String label;
    public final String title;
    public static final DestinationInfo$ScrollableComponent$LocationDetail$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 79;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetRunUpdatep accessgetrunupdatep = accessgetRunUpdatep.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 33;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accessgetrunupdatep;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(3)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 37;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.components;
        }
        throw null;
    }

    public /* synthetic */ accessgetOwnerp(int i, String str, String str2, String str3, List list) {
        if (15 == (i & 15)) {
            this.title = str;
            this.label = str2;
            this.components = list;
            this.address = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, accessgetRunUpdatep.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE write() {
        Object next;
        int i = 2 % 2;
        int i2 = serializer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Iterator it = this.components.iterator();
        int i4 = serializer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = write + 1;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                next = it.next();
                int i7 = 83 / 0;
                if (next instanceof r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE) {
                    return (r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE) next;
                }
            } else {
                next = it.next();
                if (next instanceof r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE) {
                    return (r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE) next;
                }
            }
        }
        next = null;
        return (r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE) next;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.address.hashCode() + c8$$ExternalSyntheticOutline0.m(this.components, af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.label), 31);
        int i4 = write + 119;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("LocationDetail(title=", this.title, ", label=", this.label, ", components=");
        sbM.append(this.components);
        sbM.append(", address=");
        sbM.append(this.address);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r22 instanceof o.accessgetOwnerp) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.accessgetOwnerp) r22;
        r12 = new java.lang.Object[]{r21.title, r1.title};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r1 = o.accessgetOwnerp.serializer + 21;
        o.accessgetOwnerp.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if ((r1 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r19 = new java.lang.Object[]{r21.label, r1.label};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        r19 = new java.lang.Object[]{r21.components, r1.components};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r19 = new java.lang.Object[]{r21.address, r1.address};
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        r1 = o.accessgetOwnerp.write + 77;
        o.accessgetOwnerp.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r4 = r4 + 103;
        o.accessgetOwnerp.serializer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetOwnerp.equals(java.lang.Object):boolean");
    }
}
