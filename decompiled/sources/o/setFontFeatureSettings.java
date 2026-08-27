package o;

import coil3.disk.DiskLruCache$Editor;

/* JADX INFO: loaded from: classes2.dex */
public final class setFontFeatureSettings {
    public final int IconCompatParcelizer;
    public final setFontFeatureSettings MediaMetadataCompat;
    public final getFontSynthesisZQGJjVo RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public setFontFeatureSettings(DiskLruCache$Editor diskLruCache$Editor, getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo, int i, int i2, int i3, setFontFeatureSettings setfontfeaturesettings, getTextGeometricTransform gettextgeometrictransform) {
        this.RemoteActionCompatParcelizer = getfontsynthesiszqgjjvo;
        this.serializer = i;
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo2 = getFontSynthesisZQGJjVo.BYTE;
        int i4 = (getfontsynthesiszqgjjvo == getfontsynthesiszqgjjvo2 || setfontfeaturesettings == null) ? i2 : setfontfeaturesettings.IconCompatParcelizer;
        this.IconCompatParcelizer = i4;
        this.read = i3;
        this.MediaMetadataCompat = setfontfeaturesettings;
        boolean z = false;
        int characterCountBits = setfontfeaturesettings != null ? setfontfeaturesettings.write : 0;
        if ((getfontsynthesiszqgjjvo == getfontsynthesiszqgjjvo2 && setfontfeaturesettings == null && i4 != 0) || (setfontfeaturesettings != null && i4 != setfontfeaturesettings.IconCompatParcelizer)) {
            z = true;
        }
        characterCountBits = (setfontfeaturesettings == null || getfontsynthesiszqgjjvo != setfontfeaturesettings.RemoteActionCompatParcelizer || z) ? characterCountBits + getfontsynthesiszqgjjvo.getCharacterCountBits(gettextgeometrictransform) + 4 : characterCountBits;
        int i5 = setBaselineShift_isdbwI.serializer[getfontsynthesiszqgjjvo.ordinal()];
        if (i5 == 1) {
            characterCountBits += 13;
        } else if (i5 == 2) {
            characterCountBits += i3 == 1 ? 6 : 11;
        } else if (i5 == 3) {
            characterCountBits += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        } else if (i5 == 4) {
            characterCountBits += ((String) diskLruCache$Editor.write).substring(i, i3 + i).getBytes(((getFontFamily) diskLruCache$Editor.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer[i2].charset()).length * 8;
            if (z) {
                characterCountBits += 12;
            }
        }
        this.write = characterCountBits;
    }
}
