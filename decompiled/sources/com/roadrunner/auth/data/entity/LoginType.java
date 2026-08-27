package com.roadrunner.auth.data.entity;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import o.getAppropriateFullView;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginType {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ LoginType[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;

    @getAppropriateFullView(serializer = "2fa")
    public static final LoginType TWO_FA = new LoginType("TWO_FA", 0);
    private static int serializer = 1;
    private static int write = 1;

    private LoginType(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 19;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        LoginType[] loginTypeArr$values = $values();
        $VALUES = loginTypeArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) loginTypeArr$values);
        int i = RemoteActionCompatParcelizer + 109;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ LoginType[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 71;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        LoginType[] loginTypeArr = {TWO_FA};
        int i5 = i2 + 79;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return loginTypeArr;
    }

    public static LoginType valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LoginType loginType = (LoginType) Enum.valueOf(LoginType.class, str);
        int i4 = serializer + 87;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return loginType;
    }

    public static LoginType[] values() {
        LoginType[] loginTypeArr;
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            loginTypeArr = (LoginType[]) $VALUES.clone();
            int i3 = 96 / 0;
        } else {
            loginTypeArr = (LoginType[]) $VALUES.clone();
        }
        int i4 = IconCompatParcelizer + 69;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return loginTypeArr;
    }
}
