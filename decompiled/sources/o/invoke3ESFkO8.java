package o;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class invoke3ESFkO8 implements toAndroidColorSpace {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ invoke3ESFkO8(Object obj, int i, Object obj2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            FocusPropertiesCompanion focusPropertiesCompanion = (FocusPropertiesCompanion) obj2;
            getUnsetFocusRect getunsetfocusrect = (getUnsetFocusRect) obj;
            focusPropertiesCompanion.getClass();
            if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
                focusPropertiesCompanion.read(getunsetfocusrect);
                return;
            }
            return;
        }
        if (i != 1) {
            List<accessgetAssistcp> list = (List) obj;
            if (androidColorSpace_androidKt == ((AndroidColorSpace_androidKt) obj2)) {
                for (accessgetAssistcp accessgetassistcp : list) {
                    Object[] objArr = {accessgetassistcp.RemoteActionCompatParcelizer(), accessgetBackcp.serializer};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        ((onShowTranslationui) accessgetassistcp.write).setValue(accessgetassistcp.serializer());
                    }
                }
                return;
            }
            return;
        }
        countTransparentColors counttransparentcolors = (countTransparentColors) obj2;
        cubicTo cubicto = (cubicTo) obj;
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_RESUME && ((List) counttransparentcolors.serializer().serializer.read()).contains(cubicto)) {
            if (countTransparentColors.RemoteActionCompatParcelizer()) {
                Objects.toString(cubicto);
                accessisrendernodecompatiblecp.toString();
            }
            counttransparentcolors.serializer().IconCompatParcelizer(cubicto);
        }
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            if (countTransparentColors.RemoteActionCompatParcelizer()) {
                Objects.toString(cubicto);
                accessisrendernodecompatiblecp.toString();
            }
            counttransparentcolors.serializer().IconCompatParcelizer(cubicto);
        }
    }
}
