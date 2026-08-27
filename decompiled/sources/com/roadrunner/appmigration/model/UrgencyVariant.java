package com.roadrunner.appmigration.model;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlinx.serialization.Serializable;
import o.getAppropriateFullView;
import o.getPositionInRootF1C5BW0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable(write = getPositionInRootF1C5BW0.class)
public final class UrgencyVariant {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ UrgencyVariant[] $VALUES;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;

    @getAppropriateFullView(serializer = "neutral")
    public static final UrgencyVariant NEUTRAL = new UrgencyVariant("NEUTRAL", 0);

    @getAppropriateFullView(serializer = "warning")
    public static final UrgencyVariant WARNING = new UrgencyVariant("WARNING", 1);

    @getAppropriateFullView(serializer = "urgent")
    public static final UrgencyVariant URGENT = new UrgencyVariant("URGENT", 2);

    private UrgencyVariant(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 83;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.roadrunner.appmigration.model.UrgencyVariant$Companion] */
    static {
        UrgencyVariant[] urgencyVariantArr$values = $values();
        $VALUES = urgencyVariantArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) urgencyVariantArr$values);
        Companion = new Object() { // from class: com.roadrunner.appmigration.model.UrgencyVariant.Companion
            private static int read = 1;
            private static int serializer;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = read + 75;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                getPositionInRootF1C5BW0 getpositioninrootf1c5bw0 = getPositionInRootF1C5BW0.write;
                int i4 = serializer + 53;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return getpositioninrootf1c5bw0;
                }
                throw null;
            }
        };
        int i = write + 97;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static UrgencyVariant valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        UrgencyVariant urgencyVariant = (UrgencyVariant) Enum.valueOf(UrgencyVariant.class, str);
        int i4 = IconCompatParcelizer + 105;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return urgencyVariant;
    }

    public static UrgencyVariant[] values() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        UrgencyVariant[] urgencyVariantArr = (UrgencyVariant[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 91;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return urgencyVariantArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ UrgencyVariant[] $values() {
        UrgencyVariant[] urgencyVariantArr;
        int i = 2 % 2;
        int i2 = serializer + 93;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            UrgencyVariant urgencyVariant = NEUTRAL;
            UrgencyVariant urgencyVariant2 = WARNING;
            UrgencyVariant urgencyVariant3 = URGENT;
            urgencyVariantArr = new UrgencyVariant[4];
            urgencyVariantArr[1] = urgencyVariant;
            urgencyVariantArr[0] = urgencyVariant2;
            urgencyVariantArr[2] = urgencyVariant3;
        } else {
            urgencyVariantArr = new UrgencyVariant[]{NEUTRAL, WARNING, URGENT};
        }
        int i4 = i3 + 73;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return urgencyVariantArr;
    }
}
