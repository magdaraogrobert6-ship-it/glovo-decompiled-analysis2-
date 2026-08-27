package o;

/* JADX INFO: loaded from: classes.dex */
public final class component2 {
    public long IconCompatParcelizer;
    public androidx.compose.ui.text.TextStyle MediaMetadataCompat;
    public Object RatingCompat;
    public androidx.compose.ui.unit.Density RemoteActionCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 read = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);
    public androidx.compose.ui.unit.LayoutDirection serializer;
    public androidx.compose.ui.text.font.FontFamily.Resolver write;

    public component2(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.TextStyle textStyle, Object obj) {
        this.serializer = layoutDirection;
        this.RemoteActionCompatParcelizer = density;
        this.write = resolver;
        this.MediaMetadataCompat = textStyle;
        this.RatingCompat = obj;
        this.IconCompatParcelizer = androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText(this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.write, androidx.compose.foundation.text.TextFieldDelegateKt.read, 1);
    }

    public static void IconCompatParcelizer(component2 component2Var, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.TextStyle textStyle, int i) {
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (i & 1) != 0 ? component2Var.serializer : layoutDirection;
        androidx.compose.ui.unit.Density density2 = (i & 2) != 0 ? component2Var.RemoteActionCompatParcelizer : density;
        androidx.compose.ui.text.font.FontFamily.Resolver resolver = component2Var.write;
        androidx.compose.ui.text.TextStyle textStyle2 = (i & 8) != 0 ? component2Var.MediaMetadataCompat : textStyle;
        Object obj = component2Var.RatingCompat;
        androidx.compose.ui.unit.LayoutDirection layoutDirection3 = component2Var.serializer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = component2Var.read;
        if (layoutDirection2 == layoutDirection3) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{density2, component2Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{resolver, component2Var.write}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textStyle2, component2Var.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, component2Var.RatingCompat}, getCieXyz.write())).booleanValue()) {
                            return;
                        }
                        component2Var.RatingCompat = obj;
                        ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Boolean.TRUE);
                        return;
                    }
                }
            }
        }
        component2Var.serializer = layoutDirection2;
        component2Var.RemoteActionCompatParcelizer = density2;
        component2Var.write = resolver;
        component2Var.MediaMetadataCompat = textStyle2;
        ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Boolean.TRUE);
    }
}
