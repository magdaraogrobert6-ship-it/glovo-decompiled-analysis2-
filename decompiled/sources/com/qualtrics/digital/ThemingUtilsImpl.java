package com.qualtrics.digital;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
class ThemingUtilsImpl implements ThemingUtils {
    Integer FALLBACK_COLOR = -16777216;
    private Context context;

    @Override // com.qualtrics.digital.ThemingUtils
    public int getColorByResource(int i) {
        try {
            return this.context.getColor(i);
        } catch (Resources.NotFoundException unused) {
            return this.FALLBACK_COLOR.intValue();
        }
    }

    @Override // com.qualtrics.digital.ThemingUtils
    public String getHexColor(int i) {
        return String.format("#%08X", Integer.valueOf(i));
    }

    public ThemingUtilsImpl(Context context) {
        this.context = context;
    }
}
