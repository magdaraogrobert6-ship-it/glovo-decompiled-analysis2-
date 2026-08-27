package o;

/* JADX INFO: loaded from: classes.dex */
public final class getVerticalBias {
    public colorResource IconCompatParcelizer;
    public Long RemoteActionCompatParcelizer;
    public int read;
    public colorResource serializer;
    public boolean write;

    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    public final void IconCompatParcelizer(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        colorResource colorresource;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue2;
        boolean z = false;
        this.write = false;
        colorResource colorresource2 = this.IconCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldValue, colorresource2 != null ? (androidx.compose.ui.text.input.TextFieldValue) colorresource2.write : null}, getCieXyz.write())).booleanValue()) {
            return;
        }
        String text = textFieldValue.getText();
        colorResource colorresource3 = this.IconCompatParcelizer;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, (colorresource3 == null || (textFieldValue2 = (androidx.compose.ui.text.input.TextFieldValue) colorresource3.write) == null) ? null : textFieldValue2.getText()}, getCieXyz.write())).booleanValue();
        colorResource colorresource4 = this.IconCompatParcelizer;
        if (zBooleanValue) {
            if (colorresource4 != null) {
                colorresource4.write = textFieldValue;
                return;
            }
            return;
        }
        this.IconCompatParcelizer = new colorResource(colorresource4, textFieldValue, z, 8);
        this.serializer = null;
        int length = textFieldValue.getText().length() + this.read;
        this.read = length;
        if (length > 100000) {
            colorResource colorresource5 = this.IconCompatParcelizer;
            if ((colorresource5 != null ? (colorResource) colorresource5.IconCompatParcelizer : null) == null) {
                return;
            }
            while (true) {
                if (colorresource5 == null) {
                    colorresource = null;
                } else {
                    colorResource colorresource6 = (colorResource) colorresource5.IconCompatParcelizer;
                    if (colorresource6 != null) {
                        colorresource = (colorResource) colorresource6.IconCompatParcelizer;
                    } else {
                        colorresource = null;
                    }
                }
                if (colorresource == null) {
                    break;
                } else {
                    colorresource5 = (colorResource) colorresource5.IconCompatParcelizer;
                }
            }
            if (colorresource5 != null) {
                colorresource5.IconCompatParcelizer = null;
            }
        }
    }
}
