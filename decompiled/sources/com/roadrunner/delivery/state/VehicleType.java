package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.braze.Constants;
import com.huawei.hms.android.SystemUtils;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ComposableSingletonsAndroidDialog_androidKtlambda2101488961;
import o.getAppropriateFullView;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class VehicleType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ VehicleType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    private final String code;

    @getAppropriateFullView(serializer = "car")
    public static final VehicleType Car = new VehicleType("Car", 0, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);

    @getAppropriateFullView(serializer = "bike")
    public static final VehicleType Bike = new VehicleType("Bike", 1, "b");

    @getAppropriateFullView(serializer = "walker")
    public static final VehicleType Walker = new VehicleType("Walker", 2, "w");

    @getAppropriateFullView(serializer = SystemUtils.UNKNOWN)
    public static final VehicleType Unknown = new VehicleType("Unknown", 3, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i4 = i3 + 87;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 123;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 5;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getCode() {
        String str;
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.code;
            int i4 = 3 / 0;
        } else {
            str = this.code;
        }
        int i5 = i3 + 61;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private VehicleType(String str, int i, String str2) {
        super(str, i);
        this.code = str2;
    }

    /* JADX INFO: renamed from: $r8$lambda$Q3ahy9o9sl9-bWmwiosmzDV3Rp4, reason: not valid java name */
    public static /* synthetic */ setGraphicModalMaxWidthDp m4950$r8$lambda$Q3ahy9o9sl9bWmwiosmzDV3Rp4() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 0 / 0;
        } else {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = RemoteActionCompatParcelizer + 61;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdp_init_$_anonymous_;
        }
        throw null;
    }

    static {
        VehicleType[] vehicleTypeArr$values = $values();
        $VALUES = vehicleTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) vehicleTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(0));
        int i = IconCompatParcelizer + 125;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static VehicleType valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        VehicleType vehicleType = (VehicleType) Enum.valueOf(VehicleType.class, str);
        int i3 = read + 115;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return vehicleType;
        }
        obj.hashCode();
        throw null;
    }

    public static VehicleType[] values() {
        int i = 2 % 2;
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        VehicleType[] vehicleTypeArr = (VehicleType[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 95;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return vehicleTypeArr;
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 85;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) VehicleType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = read + 113;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ VehicleType[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        VehicleType[] vehicleTypeArr = {Car, Bike, Walker, Unknown};
        int i5 = i3 + 83;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return vehicleTypeArr;
        }
        throw null;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = read + 27;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.state.VehicleType", values(), new String[]{"car", "bike", "walker", SystemUtils.UNKNOWN}, new Annotation[][]{null, null, null, null});
        int i4 = read + 49;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return enumSerializerSerializer;
        }
        throw null;
    }
}
