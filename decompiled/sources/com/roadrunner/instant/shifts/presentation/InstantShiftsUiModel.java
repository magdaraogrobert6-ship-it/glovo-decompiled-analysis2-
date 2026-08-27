package com.roadrunner.instant.shifts.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import o.onViewCreated;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes3.dex */
public interface InstantShiftsUiModel extends onViewCreated {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class read {
        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
        private static final /* synthetic */ read[] $VALUES;
        public static final read BOOK_SHIFT = new read("BOOK_SHIFT", 0);
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 0;
        private static int serializer = 1;
        private static int write;

        private read(String str, int i) {
            super(str, i);
        }

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            int i = 2 % 2;
            int i2 = write + 3;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i5 = i3 + 85;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
            }
            throw null;
        }

        static {
            read[] readVarArr$values = $values();
            $VALUES = readVarArr$values;
            $ENTRIES = UtilsKt.read((Enum[]) readVarArr$values);
            int i = read + 55;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 60 / 0;
            }
        }

        private static final /* synthetic */ read[] $values() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 97;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            read[] readVarArr = {BOOK_SHIFT};
            int i5 = i2 + 41;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return readVarArr;
        }

        public static read valueOf(String str) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 49;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            read readVar = (read) Enum.valueOf(read.class, str);
            int i4 = RemoteActionCompatParcelizer + 115;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return readVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static read[] values() {
            int i = 2 % 2;
            int i2 = write + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return (read[]) $VALUES.clone();
            }
            throw null;
        }
    }
}
