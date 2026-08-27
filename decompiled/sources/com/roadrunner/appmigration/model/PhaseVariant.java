package com.roadrunner.appmigration.model;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlinx.serialization.Serializable;
import o.getAppropriateFullView;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;
import o.unmergedChildrenuidefault;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable(write = unmergedChildrenuidefault.class)
public final class PhaseVariant {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ PhaseVariant[] $VALUES;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 1;

    @getAppropriateFullView(serializer = "phase_1")
    public static final PhaseVariant PHASE_1 = new PhaseVariant("PHASE_1", 0);

    @getAppropriateFullView(serializer = "phase_2")
    public static final PhaseVariant PHASE_2 = new PhaseVariant("PHASE_2", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;

    private PhaseVariant(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 49;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.roadrunner.appmigration.model.PhaseVariant$Companion] */
    static {
        PhaseVariant[] phaseVariantArr$values = $values();
        $VALUES = phaseVariantArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) phaseVariantArr$values);
        Companion = new Object() { // from class: com.roadrunner.appmigration.model.PhaseVariant.Companion
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 45;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return unmergedChildrenuidefault.read;
                }
                unmergedChildrenuidefault unmergedchildrenuidefault = unmergedChildrenuidefault.read;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i = write + 75;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ PhaseVariant[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 79;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PhaseVariant[] phaseVariantArr = {PHASE_1, PHASE_2};
        int i5 = i2 + 119;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return phaseVariantArr;
        }
        throw null;
    }

    public static PhaseVariant valueOf(String str) {
        PhaseVariant phaseVariant;
        int i = 2 % 2;
        int i2 = serializer + 113;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            phaseVariant = (PhaseVariant) Enum.valueOf(PhaseVariant.class, str);
            int i3 = 84 / 0;
        } else {
            phaseVariant = (PhaseVariant) Enum.valueOf(PhaseVariant.class, str);
        }
        int i4 = RemoteActionCompatParcelizer + 103;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return phaseVariant;
    }

    public static PhaseVariant[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PhaseVariant[] phaseVariantArr = (PhaseVariant[]) $VALUES.clone();
        int i4 = serializer + 27;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return phaseVariantArr;
    }
}
