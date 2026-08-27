package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPainterKt implements configureVectorPainterT4PVSW8 {
    public final onImageAvailable read;
    public final getAutoMirrorui write;

    public final boolean read(Map map) {
        try {
            String str = (String) map.get(com.braze.Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (str == null) {
                return false;
            }
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = VectorPaintervector11.RemoteActionCompatParcelizer;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = createGroupComponent.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            createGroupComponent creategroupcomponent = (createGroupComponent) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(str, setgraphicmodalmaxwidthdpSerializer);
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) creategroupcomponent.IconCompatParcelizer())) {
                return false;
            }
            setSizeuvyYCjkui setsizeuvyycjkuiSerializer = creategroupcomponent.serializer();
            return (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) setsizeuvyycjkuiSerializer.serializer()) || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) setsizeuvyycjkuiSerializer.RemoteActionCompatParcelizer()) || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) setsizeuvyycjkuiSerializer.read()) || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) setsizeuvyycjkuiSerializer.serializer()) || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) setsizeuvyycjkuiSerializer.write()) || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) setsizeuvyycjkuiSerializer.IconCompatParcelizer())) ? false : true;
        } catch (Exception e) {
            isIdentityannotations isidentityannotations = this.read.serializer;
            if (isidentityannotations == null) {
                return false;
            }
            isidentityannotations.serializer("BRAZE_PUSH_PARSING_ERROR", SimpleItemTouchHelperCallback.serializer, e);
            return false;
        }
    }

    public VectorPainterKt(onImageAvailable onimageavailable, getAutoMirrorui getautomirrorui) {
        this.read = onimageavailable;
        this.write = getautomirrorui;
    }
}
