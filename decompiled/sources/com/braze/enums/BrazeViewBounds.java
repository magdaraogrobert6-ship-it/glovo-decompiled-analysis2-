package com.braze.enums;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public enum BrazeViewBounds {
    NOTIFICATION_EXPANDED_IMAGE(478, Fields.RotationX),
    NOTIFICATION_INLINE_PUSH_IMAGE(384, Fields.RotationX),
    NOTIFICATION_LARGE_ICON(64, 64),
    NOTIFICATION_ONE_IMAGE_STORY(Fields.RotationX, Fields.SpotShadowColor),
    BASE_CARD_VIEW(Fields.RotationY, Fields.RotationY),
    IN_APP_MESSAGE_MODAL(580, 580),
    IN_APP_MESSAGE_SLIDEUP(100, 100),
    NO_BOUNDS(0, 0);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    private final int heightDp;
    private final int widthDp;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    public final int getWidthDp() {
        return this.widthDp;
    }

    BrazeViewBounds(int i, int i2) {
        this.widthDp = i;
        this.heightDp = i2;
    }
}
