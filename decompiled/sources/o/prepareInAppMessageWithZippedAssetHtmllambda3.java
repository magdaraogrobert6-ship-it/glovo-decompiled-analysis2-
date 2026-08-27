package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.modules.SerializerAlreadyRegisteredException;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessageWithZippedAssetHtmllambda3 {
    public boolean read;
    public final HashMap write = new HashMap();
    public final HashMap MediaBrowserCompatMediaItem = new HashMap();
    public final HashMap IconCompatParcelizer = new HashMap();
    public final HashMap serializer = new HashMap();
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    public static void read(prepareInAppMessageWithZippedAssetHtmllambda3 prepareinappmessagewithzippedassethtmllambda3, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, prepareInAppMessageWithZippedAssetHtmllambda0 prepareinappmessagewithzippedassethtmllambda0) {
        HashMap map = prepareinappmessagewithzippedassethtmllambda3.write;
        getunregisteredinappmessageannotations.getClass();
        prepareInAppMessageWithZippedAssetHtmllambda0 prepareinappmessagewithzippedassethtmllambda1 = (prepareInAppMessageWithZippedAssetHtmllambda0) map.get(getunregisteredinappmessageannotations);
        if (prepareinappmessagewithzippedassethtmllambda1 != null && !prepareinappmessagewithzippedassethtmllambda1.equals(prepareinappmessagewithzippedassethtmllambda0)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + getunregisteredinappmessageannotations + " already registered in this module");
        }
        map.put(getunregisteredinappmessageannotations, prepareinappmessagewithzippedassethtmllambda0);
        if (Options.Companion.read(getunregisteredinappmessageannotations).isInterface()) {
            prepareinappmessagewithzippedassethtmllambda3.read = true;
        }
    }

    public final prepareInAppMessageWithZippedAssetHtml RemoteActionCompatParcelizer() {
        return new prepareInAppMessageWithZippedAssetHtml(this.write, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.serializer, this.RemoteActionCompatParcelizer, this.read);
    }

    public static void read(prepareInAppMessageWithZippedAssetHtmllambda3 prepareinappmessagewithzippedassethtmllambda3, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations2, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        Object next;
        getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations3;
        getunregisteredinappmessageannotations2.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        String strSerializer = setgraphicmodalmaxwidthdp.getDescriptor().serializer();
        HashMap map = prepareinappmessagewithzippedassethtmllambda3.MediaBrowserCompatMediaItem;
        Object map2 = map.get(getunregisteredinappmessageannotations);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(getunregisteredinappmessageannotations, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = prepareinappmessagewithzippedassethtmllambda3.serializer;
        Object map5 = map4.get(getunregisteredinappmessageannotations);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(getunregisteredinappmessageannotations, map5);
        }
        Map map6 = (Map) map5;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = (setGraphicModalMaxWidthDp) map3.get(getunregisteredinappmessageannotations2);
        if (setgraphicmodalmaxwidthdp2 != null && !setgraphicmodalmaxwidthdp2.equals(setgraphicmodalmaxwidthdp)) {
            throw new SerializerAlreadyRegisteredException(getunregisteredinappmessageannotations, getunregisteredinappmessageannotations2);
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = (setGraphicModalMaxWidthDp) map6.get(strSerializer);
        if (setgraphicmodalmaxwidthdp3 == null || setgraphicmodalmaxwidthdp3.equals(setgraphicmodalmaxwidthdp)) {
            map3.put(getunregisteredinappmessageannotations2, setgraphicmodalmaxwidthdp);
            map6.put(strSerializer, setgraphicmodalmaxwidthdp);
            return;
        }
        Iterator it = ((Iterable) onContentCardDismissed.read((Iterable) map3.entrySet()).read).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != setgraphicmodalmaxwidthdp3);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (getunregisteredinappmessageannotations3 = (getUnregisteredInAppMessageannotations) entry.getKey()) == null) {
            throw new IllegalStateException(("Name " + strSerializer + " is registered in the module but no Kotlin class is associated with it.").toString());
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + getunregisteredinappmessageannotations + "' have the same serial name '" + strSerializer + "': " + setgraphicmodalmaxwidthdp + " for '" + getunregisteredinappmessageannotations2 + "' and " + setgraphicmodalmaxwidthdp3 + " for '" + getunregisteredinappmessageannotations3 + '\'');
    }
}
