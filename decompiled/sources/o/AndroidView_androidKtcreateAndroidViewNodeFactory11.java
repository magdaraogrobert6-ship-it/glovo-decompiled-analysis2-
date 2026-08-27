package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Companion;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidView_androidKtNoOpUpdate1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = HttpHeaders.ACCEPT)
public final class AndroidView_androidKtcreateAndroidViewNodeFactory11 extends AndroidPopup_androidKtPopup41 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StateV3$AcceptData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 7;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                AndroidView_androidKtNoOpUpdate1 androidView_androidKtNoOpUpdate1 = AndroidView_androidKtNoOpUpdate1.RemoteActionCompatParcelizer;
                throw null;
            }
            AndroidView_androidKtNoOpUpdate1 androidView_androidKtNoOpUpdate2 = AndroidView_androidKtNoOpUpdate1.RemoteActionCompatParcelizer;
            int i3 = write + 33;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 38 / 0;
            }
            return androidView_androidKtNoOpUpdate2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final List components;
    public final List footerComponents;
    public final List headerComponents;
    public final List orderItemsComponents;
    public final List scrollableComponents;
    public final String subtitle;
    public final String title;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        Object obj = null;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(14)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(15)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(16)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(17)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new MapComponent$$ExternalSyntheticLambda0(18))};
        int i = serializer + 29;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AndroidPopup_androidKtPopup41
    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.type;
        }
        int i3 = 41 / 0;
        return this.type;
    }

    public AndroidView_androidKtcreateAndroidViewNodeFactory11(int i, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List list6;
        List listRemoteActionCompatParcelizer = null;
        if (10 != (i & 10)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 10, AndroidView_androidKtNoOpUpdate1.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.type = (i & 1) == 0 ? HttpHeaders.ACCEPT : str;
        this.title = str2;
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        this.components = list;
        List list7 = instance_delegatelambda0.write;
        if ((i & 16) == 0) {
            int i2 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    int i4 = RemoteActionCompatParcelizer + 79;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                    next4 = null;
                    break;
                }
                next4 = it.next();
            } while (!(next4 instanceof getResetBlock));
            getResetBlock getresetblock = (getResetBlock) next4;
            if (getresetblock != null) {
                int i7 = RemoteActionCompatParcelizer + 67;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    getresetblock.read();
                    throw null;
                }
                list6 = getresetblock.read();
                int i8 = 2 % 2;
            } else {
                list6 = null;
            }
            this.headerComponents = list6 == null ? list7 : list6;
        } else {
            this.headerComponents = list2;
        }
        if ((i & 32) == 0) {
            Iterator it2 = this.components.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                int i9 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    boolean z = it2.next() instanceof PopupK5zGePQ;
                    listRemoteActionCompatParcelizer.hashCode();
                    throw null;
                }
                next3 = it2.next();
            } while (!(next3 instanceof PopupK5zGePQ));
            PopupK5zGePQ popupK5zGePQ = (PopupK5zGePQ) next3;
            List listRemoteActionCompatParcelizer2 = popupK5zGePQ != null ? popupK5zGePQ.RemoteActionCompatParcelizer() : null;
            if (listRemoteActionCompatParcelizer2 == null) {
                int i10 = RemoteActionCompatParcelizer + 37;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 51 / 0;
                }
                listRemoteActionCompatParcelizer2 = list7;
            }
            this.scrollableComponents = listRemoteActionCompatParcelizer2;
            int i12 = 2 % 2;
        } else {
            this.scrollableComponents = list3;
        }
        if ((i & 64) == 0) {
            int i13 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Iterator it3 = this.components.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!(next2 instanceof accessgetTypedViewp));
            accessgetTypedViewp accessgettypedviewp = (accessgetTypedViewp) next2;
            List listRemoteActionCompatParcelizer3 = accessgettypedviewp != null ? accessgettypedviewp.RemoteActionCompatParcelizer() : null;
            this.footerComponents = listRemoteActionCompatParcelizer3 == null ? list7 : listRemoteActionCompatParcelizer3;
        } else {
            this.footerComponents = list4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            this.orderItemsComponents = list5;
            return;
        }
        Iterator it4 = this.scrollableComponents.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            if (next instanceof AndroidDialog_androidKtDialogdialog111) {
                int i15 = 2 % 2;
                break;
            }
        }
        AndroidDialog_androidKtDialogdialog111 androidDialog_androidKtDialogdialog111 = (AndroidDialog_androidKtDialogdialog111) next;
        if (androidDialog_androidKtDialogdialog111 != null) {
            listRemoteActionCompatParcelizer = androidDialog_androidKtDialogdialog111.RemoteActionCompatParcelizer();
            int i16 = 2 % 2;
        }
        this.orderItemsComponents = listRemoteActionCompatParcelizer != null ? listRemoteActionCompatParcelizer : list7;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("AcceptData(type=", this.type, ", title=", this.title, ", subtitle="), this.subtitle, ", components=", this.components, ")");
        int i4 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.type;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.title);
        String str2 = this.subtitle;
        if (str2 == null) {
            int i4 = RemoteActionCompatParcelizer;
            int i5 = i4 + 23;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = i4 + 23;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return this.components.hashCode() + ((iM + iHashCode2) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidView_androidKtcreateAndroidViewNodeFactory11)) {
            int i4 = i2 + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, androidView_androidKtcreateAndroidViewNodeFactory11.type}, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 65;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidView_androidKtcreateAndroidViewNodeFactory11.title}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, androidView_androidKtcreateAndroidViewNodeFactory11.subtitle}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidView_androidKtcreateAndroidViewNodeFactory11.components}, getCieXyz.write())).booleanValue();
            }
        }
        return false;
    }
}
