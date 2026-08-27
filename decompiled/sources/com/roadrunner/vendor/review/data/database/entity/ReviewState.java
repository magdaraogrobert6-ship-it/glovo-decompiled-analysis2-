package com.roadrunner.vendor.review.data.database.entity;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class ReviewState {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ReviewState[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final ReviewState DISMISSED = new ReviewState("DISMISSED", 0);
    public static final ReviewState SUBMITTED_POSITIVE = new ReviewState("SUBMITTED_POSITIVE", 1);
    public static final ReviewState SUBMITTED_NEGATIVE = new ReviewState("SUBMITTED_NEGATIVE", 2);

    private ReviewState(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 57;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 41;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    static {
        ReviewState[] reviewStateArr$values = $values();
        $VALUES = reviewStateArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) reviewStateArr$values);
        int i = write + 7;
        read = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
    }

    public static ReviewState valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ReviewState reviewState = (ReviewState) Enum.valueOf(ReviewState.class, str);
        int i3 = IconCompatParcelizer + 59;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return reviewState;
        }
        throw null;
    }

    public static ReviewState[] values() {
        ReviewState[] reviewStateArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            reviewStateArr = (ReviewState[]) $VALUES.clone();
            int i3 = 33 / 0;
        } else {
            reviewStateArr = (ReviewState[]) $VALUES.clone();
        }
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return reviewStateArr;
        }
        throw null;
    }

    private static final /* synthetic */ ReviewState[] $values() {
        ReviewState[] reviewStateArr;
        int i = 2 % 2;
        int i2 = serializer + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            ReviewState reviewState = DISMISSED;
            ReviewState reviewState2 = SUBMITTED_POSITIVE;
            ReviewState reviewState3 = SUBMITTED_NEGATIVE;
            reviewStateArr = new ReviewState[3];
            reviewStateArr[1] = reviewState;
            reviewStateArr[0] = reviewState2;
            reviewStateArr[3] = reviewState3;
        } else {
            reviewStateArr = new ReviewState[]{DISMISSED, SUBMITTED_POSITIVE, SUBMITTED_NEGATIVE};
        }
        int i4 = i3 + 97;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return reviewStateArr;
    }
}
