package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DeliveriesDetail$Companion;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.fastMaxOf;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "deliveries_detail")
public final class fastCoerceAtMost extends AndroidPopup_androidKtPopup41 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final DeliveriesDetail$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DeliveriesDetail$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fastMaxOf fastmaxof = fastMaxOf.serializer;
            int i4 = RemoteActionCompatParcelizer + 107;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fastmaxof;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final List components;
    public final List deliveriesComponent;
    public final List deliveriesListComponent;
    public final AndroidViewBindinglambda00 destinationInfoComponent;
    public final AndroidViewHolderlayoutNode1coreModifier3 mapComponent;
    public final String subtitle;
    public final String title;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DeliveriesDetail$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(18)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(19)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(20)), null, null};
        int i = serializer + 53;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.AndroidPopup_androidKtPopup41
    public final String read() {
        int i = 2 % 2;
        int i2 = write + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 49;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public fastCoerceAtMost(int i, String str, String str2, String str3, List list, List list2, List list3, AndroidViewBindinglambda00 androidViewBindinglambda00, AndroidViewHolderlayoutNode1coreModifier3 androidViewHolderlayoutNode1coreModifier3) {
        Object next;
        Object next2;
        Object next3;
        List listIconCompatParcelizer;
        Object obj = null;
        if (10 != (i & 10)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 10, fastMaxOf.serializer.getDescriptor());
            throw null;
        }
        this.type = (i & 1) == 0 ? "deliveries_detail" : str;
        this.title = str2;
        if ((i & 4) == 0) {
            int i2 = write + 125;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        this.components = list;
        List list4 = instance_delegatelambda0.write;
        if ((i & 16) == 0) {
            int i4 = write + 87;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Iterator it = list.iterator();
            int i6 = 2 % 2;
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                int i7 = write + 107;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    boolean z = it.next() instanceof fastAll;
                    obj.hashCode();
                    throw null;
                }
                next3 = it.next();
            } while (!(next3 instanceof fastAll));
            fastAll fastall = (fastAll) next3;
            if (fastall != null) {
                int i8 = write + 17;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    listIconCompatParcelizer = fastall.IconCompatParcelizer();
                    int i9 = 10 / 0;
                } else {
                    listIconCompatParcelizer = fastall.IconCompatParcelizer();
                }
            } else {
                listIconCompatParcelizer = null;
            }
            if (listIconCompatParcelizer == null) {
                int i10 = read;
                int i11 = i10 + 15;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                int i13 = i10 + 93;
                write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                listIconCompatParcelizer = list4;
            }
            this.deliveriesComponent = listIconCompatParcelizer;
        } else {
            this.deliveriesComponent = list2;
        }
        if ((i & 32) == 0) {
            Iterator it2 = this.components.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                int i15 = read + 125;
                write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    boolean z2 = it2.next() instanceof AndroidViewBindingKt;
                    throw null;
                }
                next2 = it2.next();
            } while (!(next2 instanceof AndroidViewBindingKt));
            AndroidViewBindingKt androidViewBindingKt = (AndroidViewBindingKt) next2;
            List list5 = androidViewBindingKt != null ? androidViewBindingKt.read() : null;
            this.deliveriesListComponent = list5 != null ? list5 : list4;
        } else {
            this.deliveriesListComponent = list3;
        }
        if ((i & 64) == 0) {
            Iterator it3 = this.components.iterator();
            do {
                if (!it3.hasNext()) {
                    int i16 = write + 39;
                    read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        int i17 = 2 % 2;
                    }
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(next instanceof AndroidViewBindinglambda00));
            this.destinationInfoComponent = (AndroidViewBindinglambda00) next;
        } else {
            this.destinationInfoComponent = androidViewBindinglambda00;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            this.mapComponent = androidViewHolderlayoutNode1coreModifier3;
            return;
        }
        for (Object obj2 : this.components) {
            if (obj2 instanceof AndroidViewHolderlayoutNode1coreModifier3) {
                obj = obj2;
                break;
            }
        }
        this.mapComponent = (AndroidViewHolderlayoutNode1coreModifier3) obj;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("DeliveriesDetail(type=", this.type, ", title=", this.title, ", subtitle="), this.subtitle, ", components=", this.components, ")");
        int i4 = write + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int i3 = 2 % 2;
        String str = this.type;
        int iHashCode2 = 0;
        if (str == null) {
            int i4 = read + 17;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.title);
        String str2 = this.subtitle;
        if (str2 == null) {
            i = write + 47;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            iHashCode2 = str2.hashCode();
            i = write + 121;
            i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        read = i2;
        int i6 = i % 2;
        return this.components.hashCode() + ((iM + iHashCode2) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.fastCoerceAtMost) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.fastCoerceAtMost) r22;
        r12 = new java.lang.Object[]{r21.type, r1.type};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r19 = new java.lang.Object[]{r21.title, r1.title};
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r1 = o.fastCoerceAtMost.read + 117;
        o.fastCoerceAtMost.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        r19 = new java.lang.Object[]{r21.subtitle, r1.subtitle};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        r1 = o.fastCoerceAtMost.read + 99;
        o.fastCoerceAtMost.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        r19 = new java.lang.Object[]{r21.components, r1.components};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
    
        r1 = o.fastCoerceAtMost.write + 7;
        o.fastCoerceAtMost.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e2, code lost:
    
        if ((r1 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fastCoerceAtMost.equals(java.lang.Object):boolean");
    }
}
