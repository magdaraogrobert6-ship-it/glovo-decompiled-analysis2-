package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getKey1 {
    public static androidx.compose.foundation.text.modifiers.MinLinesConstrainer RemoteActionCompatParcelizer(androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.IconCompatParcelizer) {
            Object[] objArr = {androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && density.getDensity() == minLinesConstrainer.write.getDensity() && resolver == minLinesConstrainer.RemoteActionCompatParcelizer) {
                return minLinesConstrainer;
            }
        }
        androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer2 = androidx.compose.foundation.text.modifiers.MinLinesConstrainer.serializer;
        if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.IconCompatParcelizer) {
            Object[] objArr2 = {androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection), minLinesConstrainer2.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && density.getDensity() == minLinesConstrainer2.write.getDensity() && resolver == minLinesConstrainer2.RemoteActionCompatParcelizer) {
                return minLinesConstrainer2;
            }
        }
        androidx.compose.foundation.text.modifiers.MinLinesConstrainer minLinesConstrainer3 = new androidx.compose.foundation.text.modifiers.MinLinesConstrainer(layoutDirection, androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection), androidx.compose.ui.unit.DensityKt.Density(density.getDensity(), density.getFontScale()), resolver);
        androidx.compose.foundation.text.modifiers.MinLinesConstrainer.serializer = minLinesConstrainer3;
        return minLinesConstrainer3;
    }
}
