package com.braze.enums;

import coil3.util.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public enum CardType {
    IMAGE,
    CAPTIONED_IMAGE,
    DEFAULT,
    SHORT_NEWS,
    TEXT_ANNOUNCEMENT,
    CONTROL;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return ordinal();
    }

    public static final CardType fromValue(int i) {
        return Companion.fromValue(i);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardType fromValue(int i) {
            return (CardType) CardType.getEntries().get(i);
        }
    }
}
