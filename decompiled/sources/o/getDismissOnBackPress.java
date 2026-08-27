package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.ButtonData$Companion;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getDismissOnBackPress {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final ButtonData$Companion Companion = new ButtonData$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final getWindowTitle action;
    public final TagIconTokenV1 actionIcon;
    public final String actionTitle;
    public final ButtonTypeToken buttonType;
    public final List trackingEvents;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(3)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(4)), null};
        int i = read + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final TagIconTokenV1 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 53;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TagIconTokenV1 tagIconTokenV1 = this.actionIcon;
        int i5 = i2 + 99;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return tagIconTokenV1;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.actionTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List read() {
        List list;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 107;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            list = this.trackingEvents;
            int i4 = 41 / 0;
        } else {
            list = this.trackingEvents;
        }
        int i5 = i2 + 61;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final getWindowTitle serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        getWindowTitle getwindowtitle = this.action;
        int i5 = i3 + 45;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getwindowtitle;
        }
        throw null;
    }

    public final ButtonTypeToken write() {
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        ButtonTypeToken buttonTypeToken = this.buttonType;
        int i5 = i3 + 113;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return buttonTypeToken;
    }

    public /* synthetic */ getDismissOnBackPress(int i, TagIconTokenV1 tagIconTokenV1, String str, getWindowTitle getwindowtitle, List list, ButtonTypeToken buttonTypeToken) {
        if (18 != (i & 18)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 18, getDismissOnClickOutside.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.actionIcon = null;
        } else {
            this.actionIcon = tagIconTokenV1;
            int i2 = write + 33;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.actionTitle = str;
        if ((i & 4) == 0) {
            int i5 = IconCompatParcelizer + 61;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.action = null;
        } else {
            this.action = getwindowtitle;
            int i7 = 2 % 2;
        }
        if ((i & 8) == 0) {
            int i8 = write + 107;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i9;
            int i10 = i8 % 2;
            this.trackingEvents = null;
            int i11 = i9 + 113;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
            }
            this.buttonType = buttonTypeToken;
        }
        this.trackingEvents = list;
        int i12 = 2 % 2;
        this.buttonType = buttonTypeToken;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        TagIconTokenV1 tagIconTokenV1 = this.actionIcon;
        if (tagIconTokenV1 == null) {
            int i2 = IconCompatParcelizer + 63;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = tagIconTokenV1.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.actionTitle);
        getWindowTitle getwindowtitle = this.action;
        if (getwindowtitle == null) {
            int i4 = IconCompatParcelizer + 123;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getwindowtitle.hashCode();
            int i6 = write + 37;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        List list = this.trackingEvents;
        int iHashCode3 = this.buttonType.hashCode() + ((((iM + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31);
        int i8 = IconCompatParcelizer + 47;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 19 / 0;
        }
        return iHashCode3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r22 instanceof o.getDismissOnBackPress) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r4 = r4 + 21;
        o.getDismissOnBackPress.IconCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r1 = (o.getDismissOnBackPress) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r21.actionIcon == r1.actionIcon) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r1 = r4 + 121;
        o.getDismissOnBackPress.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r4 = r4 + 31;
        o.getDismissOnBackPress.IconCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if ((r4 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.actionTitle, r1.actionTitle}, o.getCieXyz.write())).booleanValue()) == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.action, r1.action}, o.getCieXyz.write())).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.trackingEvents, r1.trackingEvents}, o.getCieXyz.write())).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r1 = o.getDismissOnBackPress.IconCompatParcelizer + 119;
        o.getDismissOnBackPress.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r21.buttonType == r1.buttonType) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
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
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDismissOnBackPress.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonData(actionIcon=" + this.actionIcon + ", actionTitle=" + this.actionTitle + ", action=" + this.action + ", trackingEvents=" + this.trackingEvents + ", buttonType=" + this.buttonType + ")";
        int i2 = write + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return str;
    }
}
