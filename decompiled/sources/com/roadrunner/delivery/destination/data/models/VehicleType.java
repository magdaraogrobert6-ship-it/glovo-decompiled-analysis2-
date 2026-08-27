package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.braze.Constants;
import com.huawei.hms.android.SystemUtils;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
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
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
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
        int i2 = write + 121;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i3 + 35;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 59;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 20 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 63;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = write + 59;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.code;
        int i5 = i3 + 27;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private VehicleType(String str, int i, String str2) {
        super(str, i);
        this.code = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$5dw5BEiBbF0M4rKv_VxiUkRuSzc() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return _init_$_anonymous_();
        }
        _init_$_anonymous_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        VehicleType[] vehicleTypeArr$values = $values();
        $VALUES = vehicleTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) vehicleTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(27));
        int i = read + 121;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    public static VehicleType valueOf(String str) {
        VehicleType vehicleType;
        int i = 2 % 2;
        int i2 = write + 11;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            vehicleType = (VehicleType) Enum.valueOf(VehicleType.class, str);
            int i3 = 37 / 0;
        } else {
            vehicleType = (VehicleType) Enum.valueOf(VehicleType.class, str);
        }
        int i4 = serializer + 123;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return vehicleType;
    }

    public static VehicleType[] values() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        VehicleType[] vehicleTypeArr = (VehicleType[]) $VALUES.clone();
        int i4 = serializer + 71;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return vehicleTypeArr;
    }

    public static final class Companion {
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 47;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return (setGraphicModalMaxWidthDp) VehicleType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            }
            throw null;
        }
    }

    private static final /* synthetic */ VehicleType[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new VehicleType[]{Car, Bike, Walker, Unknown};
        }
        VehicleType vehicleType = Car;
        VehicleType vehicleType2 = Bike;
        VehicleType vehicleType3 = Walker;
        VehicleType vehicleType4 = Unknown;
        VehicleType[] vehicleTypeArr = new VehicleType[5];
        vehicleTypeArr[1] = vehicleType;
        vehicleTypeArr[1] = vehicleType2;
        vehicleTypeArr[4] = vehicleType3;
        vehicleTypeArr[2] = vehicleType4;
        return vehicleTypeArr;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.destination.data.models.VehicleType", values(), new String[]{"car", "bike", "walker", SystemUtils.UNKNOWN}, new Annotation[][]{null, null, null, null});
        int i4 = write + 125;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enumSerializerSerializer;
    }
}
