package androidx.compose.ui.res;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import o.getBirthDateFull;
import o.getNewPassword;
import o.getPostalCode;

/* JADX INFO: loaded from: classes.dex */
public final class PrimitiveResources_androidKt {
    public static final boolean booleanResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        return ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getBoolean(i);
    }

    public static final float dimensionResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        return Dp.m3673constructorimpl(((Resources) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getDimension(i) / ((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).getDensity());
    }

    public static final int[] integerArrayResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        return ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getIntArray(i);
    }

    public static final int integerResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        return ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources())).getInteger(i);
    }
}
