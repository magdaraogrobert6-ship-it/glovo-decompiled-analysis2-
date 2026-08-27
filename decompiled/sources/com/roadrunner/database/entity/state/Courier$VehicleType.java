package com.roadrunner.database.entity.state;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.PlatformTextStyle;
import o.accessgetAboveBaselinecp;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.getSpanStyle;
import o.onCloseClicked;
import o.onDismissed;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Serializable
public final class Courier$VehicleType {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    private final Long defaultSpeed;
    private final String icon;
    private final Long id;
    private final String name;
    private final PlatformTextStyle profile;
    public static final Companion Companion = new Companion();
    private static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new accessgetAboveBaselinecp(10))};

    public static final class Companion {
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 93;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getSpanStyle getspanstyle = getSpanStyle.RemoteActionCompatParcelizer;
                throw null;
            }
            getSpanStyle getspanstyle2 = getSpanStyle.RemoteActionCompatParcelizer;
            int i3 = read + 125;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return getspanstyle2;
        }
    }

    static {
        int i = RemoteActionCompatParcelizer + 65;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1[] access$get$childSerializers$cp() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 19;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = $childSerializers;
        int i5 = i2 + 21;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long component1() {
        Long l;
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            l = this.id;
            int i4 = 18 / 0;
        } else {
            l = this.id;
        }
        int i5 = i3 + 13;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return l;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = write + 59;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 51;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 7;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.icon;
        int i4 = i2 + 115;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final Long component4() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = this.defaultSpeed;
        int i5 = i2 + 95;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return l;
    }

    public final PlatformTextStyle component5() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        PlatformTextStyle platformTextStyle = this.profile;
        int i4 = i2 + 101;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return platformTextStyle;
        }
        throw null;
    }

    public final Long getDefaultSpeed() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 73;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = this.defaultSpeed;
        int i5 = i2 + 33;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return l;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.icon;
        int i5 = i3 + 109;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Long getId() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 21;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = this.id;
        int i5 = i2 + 75;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return l;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 9;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 9;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final PlatformTextStyle getProfile() {
        int i = 2 % 2;
        int i2 = write + 35;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.profile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$zjE7mrWibigRZX9b9KY_mmD6vlc() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_childSerializers$_anonymous_ = _childSerializers$_anonymous_();
        int i4 = IconCompatParcelizer + 35;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdp_childSerializers$_anonymous_;
        }
        throw null;
    }

    public /* synthetic */ Courier$VehicleType(int i, Long l, String str, String str2, Long l2, PlatformTextStyle platformTextStyle, onCloseClicked oncloseclicked) {
        if (31 == (i & 31)) {
            this.id = l;
            this.name = str;
            this.icon = str2;
            this.defaultSpeed = l2;
            this.profile = platformTextStyle;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, getSpanStyle.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final Courier$VehicleType copy(Long l, String str, String str2, Long l2, PlatformTextStyle platformTextStyle) {
        int i = 2 % 2;
        platformTextStyle.getClass();
        Courier$VehicleType courier$VehicleType = new Courier$VehicleType(l, str, str2, l2, platformTextStyle);
        int i2 = write + 61;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return courier$VehicleType;
    }

    private static final setGraphicModalMaxWidthDp _childSerializers$_anonymous_() {
        int i = 2 % 2;
        PlatformTextStyle[] platformTextStyleArrValues = PlatformTextStyle.values();
        platformTextStyleArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.database.entity.state.Courier.VehicleProfile", (Enum[]) platformTextStyleArrValues);
        int i2 = write + 59;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return enumSerializer;
    }

    public Courier$VehicleType(Long l, String str, String str2, Long l2, PlatformTextStyle platformTextStyle) {
        platformTextStyle.getClass();
        this.id = l;
        this.name = str;
        this.icon = str2;
        this.defaultSpeed = l2;
        this.profile = platformTextStyle;
    }

    public static /* synthetic */ Courier$VehicleType copy$default(Courier$VehicleType courier$VehicleType, Long l, String str, String str2, Long l2, PlatformTextStyle platformTextStyle, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 63;
        int i4 = i3 % Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            l = courier$VehicleType.id;
        }
        Long l3 = l;
        if ((i & 2) != 0) {
            str = courier$VehicleType.name;
            int i6 = i4 + 55;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = courier$VehicleType.icon;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            int i8 = i4 + 1;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            l2 = courier$VehicleType.defaultSpeed;
        }
        Long l4 = l2;
        if ((i & 16) != 0) {
            int i10 = IconCompatParcelizer + 109;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            platformTextStyle = courier$VehicleType.profile;
        }
        return courier$VehicleType.copy(l3, str3, str4, l4, platformTextStyle);
    }

    public static final /* synthetic */ void write$Self$database(Courier$VehicleType courier$VehicleType, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = $childSerializers;
        onDismissed ondismissed = onDismissed.write;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, ondismissed, courier$VehicleType.id);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeinappmessageviewclosed, courier$VehicleType.name);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeinappmessageviewclosed, courier$VehicleType.icon);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, ondismissed, courier$VehicleType.defaultSpeed);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[4].MediaSessionCompatResultReceiverWrapper(), courier$VehicleType.profile);
        int i4 = write + 45;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = write + 55;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Long l = this.id;
        int iHashCode3 = 0;
        if (l == null) {
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i4 = write + 51;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str = this.name;
        if (str == null) {
            int i6 = write + 71;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.icon;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Long l2 = this.defaultSpeed;
        if (l2 == null) {
            int i8 = write + 27;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            iHashCode3 = l2.hashCode();
        }
        return this.profile.hashCode() + (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3) * 31);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VehicleType(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", defaultSpeed=" + this.defaultSpeed + ", profile=" + this.profile + ")";
        int i2 = IconCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Courier$VehicleType) {
            Courier$VehicleType courier$VehicleType = (Courier$VehicleType) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, courier$VehicleType.id}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, courier$VehicleType.name}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, courier$VehicleType.icon}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.defaultSpeed, courier$VehicleType.defaultSpeed}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 25;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (this.profile == courier$VehicleType.profile) {
                int i4 = IconCompatParcelizer + 101;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = write + 69;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        int i7 = IconCompatParcelizer + 45;
        write = i7 % Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
