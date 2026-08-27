package o;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessageWithZippedAssetHtml {
    public final Map IconCompatParcelizer;
    public final Map MediaDescriptionCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final Map read;
    public final Map serializer;
    public final Map write;

    public prepareInAppMessageWithZippedAssetHtml(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.read = map;
        this.MediaDescriptionCompat = map2;
        this.write = map3;
        this.IconCompatParcelizer = map4;
        this.serializer = map5;
        this.RemoteActionCompatParcelizer = z;
    }

    public final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, List list) {
        list.getClass();
        prepareInAppMessageWithZippedAssetHtmllambda0 prepareinappmessagewithzippedassethtmllambda0 = (prepareInAppMessageWithZippedAssetHtmllambda0) this.read.get(getunregisteredinappmessageannotations);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = prepareinappmessagewithzippedassethtmllambda0 != null ? prepareinappmessagewithzippedassethtmllambda0.IconCompatParcelizer(list) : null;
        if (setgraphicmodalmaxwidthdpIconCompatParcelizer instanceof setGraphicModalMaxWidthDp) {
            return setgraphicmodalmaxwidthdpIconCompatParcelizer;
        }
        return null;
    }

    public final setGraphicModalMaxWidthDp read(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, Object obj) {
        getunregisteredinappmessageannotations.getClass();
        obj.getClass();
        if (((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations).read(obj)) {
            Map map = (Map) this.MediaDescriptionCompat.get(getunregisteredinappmessageannotations);
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = map != null ? (setGraphicModalMaxWidthDp) map.get(displayInAppMessagelambda1.serializer(obj.getClass())) : null;
            if (!(setgraphicmodalmaxwidthdp instanceof setGraphicModalMaxWidthDp)) {
                setgraphicmodalmaxwidthdp = null;
            }
            if (setgraphicmodalmaxwidthdp != null) {
                return setgraphicmodalmaxwidthdp;
            }
            Object obj2 = this.write.get(getunregisteredinappmessageannotations);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = pauseWebviewIfNecessarylambda10.write(1, obj2) ? (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2 : null;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                return (setGraphicModalMaxWidthDp) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
            }
        }
        return null;
    }
}
