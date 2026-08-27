package com.roadrunner.auth.data.entity;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import o.getAppropriateFullView;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthStatus {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AuthStatus[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;

    @getAppropriateFullView(serializer = "mfa_required")
    public static final AuthStatus TWO_FA_REQUIRED = new AuthStatus("TWO_FA_REQUIRED", 0);

    @getAppropriateFullView(serializer = "success")
    public static final AuthStatus SUCCESS = new AuthStatus("SUCCESS", 1);

    private AuthStatus(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 125;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 0 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 59;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        AuthStatus[] authStatusArr$values = $values();
        $VALUES = authStatusArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) authStatusArr$values);
        int i = write + 115;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    private static final /* synthetic */ AuthStatus[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        AuthStatus[] authStatusArr = {TWO_FA_REQUIRED, SUCCESS};
        int i5 = i2 + 65;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return authStatusArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AuthStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AuthStatus authStatus = (AuthStatus) Enum.valueOf(AuthStatus.class, str);
        int i4 = IconCompatParcelizer + 25;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return authStatus;
    }

    public static AuthStatus[] values() {
        int i = 2 % 2;
        int i2 = read + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AuthStatus[] authStatusArr = (AuthStatus[]) $VALUES.clone();
        int i3 = read + 35;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return authStatusArr;
    }
}
