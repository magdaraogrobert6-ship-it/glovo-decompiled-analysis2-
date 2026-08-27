package com.roadrunner.delivery.destination.data.models;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.huawei.hms.android.SystemUtils;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
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
public final class NavigationType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ NavigationType[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;

    @getAppropriateFullView(serializer = "vendor")
    public static final NavigationType Vendor = new NavigationType("Vendor", 0);

    @getAppropriateFullView(serializer = "customer")
    public static final NavigationType Customer = new NavigationType("Customer", 1);

    @getAppropriateFullView(serializer = "parking")
    public static final NavigationType Parking = new NavigationType("Parking", 2);

    @getAppropriateFullView(serializer = SystemUtils.UNKNOWN)
    public static final NavigationType Unknown = new NavigationType("Unknown", 3);

    private NavigationType(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write + 85;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i4 = i3 + 117;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 63;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 97;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$JqKZtMygJ5RNRR30qgUpjI1cMy0() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            _init_$_anonymous_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i3 = write + 111;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        NavigationType[] navigationTypeArr$values = $values();
        $VALUES = navigationTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) navigationTypeArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(29));
        int i = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 93 / 0;
        }
    }

    public static NavigationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        NavigationType navigationType = (NavigationType) Enum.valueOf(NavigationType.class, str);
        int i3 = serializer + 49;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return navigationType;
        }
        obj.hashCode();
        throw null;
    }

    public static NavigationType[] values() {
        int i = 2 % 2;
        int i2 = write + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (NavigationType[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 67;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) NavigationType.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i3 = RemoteActionCompatParcelizer + 123;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }

    private static final /* synthetic */ NavigationType[] $values() {
        NavigationType[] navigationTypeArr;
        int i = 2 % 2;
        int i2 = serializer + 69;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            NavigationType navigationType = Vendor;
            NavigationType navigationType2 = Customer;
            NavigationType navigationType3 = Parking;
            NavigationType navigationType4 = Unknown;
            navigationTypeArr = new NavigationType[4];
            navigationTypeArr[1] = navigationType;
            navigationTypeArr[1] = navigationType2;
            navigationTypeArr[2] = navigationType3;
            navigationTypeArr[3] = navigationType4;
        } else {
            navigationTypeArr = new NavigationType[]{Vendor, Customer, Parking, Unknown};
        }
        int i4 = i3 + 59;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return navigationTypeArr;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.destination.data.models.NavigationType", values(), new String[]{"vendor", "customer", "parking", SystemUtils.UNKNOWN}, new Annotation[][]{null, null, null, null});
        int i4 = serializer + 65;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return enumSerializerSerializer;
        }
        throw null;
    }
}
