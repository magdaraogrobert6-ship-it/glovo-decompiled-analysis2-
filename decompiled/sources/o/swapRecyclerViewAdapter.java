package o;

import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class swapRecyclerViewAdapter {
    public static final ContentCardsFragmentcontentCardsUpdate5 RemoteActionCompatParcelizer;
    public static final ViewRootForInspectorDefaultImpls read;
    public static final HashMap write;

    public static ContentCardsFragmentcontentCardsUpdate5 write(String str) {
        int numericValue;
        try {
            numericValue = Character.getNumericValue(str.charAt(0));
        } catch (IndexOutOfBoundsException unused) {
            numericValue = -1;
        }
        if (numericValue >= 0) {
            HashMap map = write;
            if (numericValue < map.size()) {
                return str.length() > 1 ? new ContentCardsFragmentcontentCardsUpdate5((String) map.get(Integer.valueOf(numericValue)), str.substring(1)) : new ContentCardsFragmentcontentCardsUpdate5((String) map.get(Integer.valueOf(numericValue)), null);
            }
        }
        return RemoteActionCompatParcelizer;
    }

    static {
        ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = new ViewRootForInspectorDefaultImpls();
        viewRootForInspectorDefaultImpls.put("open", 0);
        viewRootForInspectorDefaultImpls.put("close", 1);
        viewRootForInspectorDefaultImpls.put("ping", 2);
        viewRootForInspectorDefaultImpls.put("pong", 3);
        viewRootForInspectorDefaultImpls.put("message", 4);
        viewRootForInspectorDefaultImpls.put("upgrade", 5);
        viewRootForInspectorDefaultImpls.put("noop", 6);
        read = viewRootForInspectorDefaultImpls;
        write = new HashMap();
        for (Map.Entry entry : viewRootForInspectorDefaultImpls.entrySet()) {
            write.put(entry.getValue(), entry.getKey());
        }
        RemoteActionCompatParcelizer = new ContentCardsFragmentcontentCardsUpdate5(FWFConstants.EXPLANATION_TYPE_ERROR, "parser error");
    }

    public static void IconCompatParcelizer(ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5, setSdkDataWipeEventSubscriber setsdkdatawipeeventsubscriber) {
        Object obj = contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer;
        if (obj instanceof byte[]) {
            setsdkdatawipeeventsubscriber.write(obj);
            return;
        }
        String strValueOf = String.valueOf(read.get(contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer));
        Object obj2 = contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer;
        setsdkdatawipeeventsubscriber.write(strValueOf.concat(obj2 != null ? String.valueOf(obj2) : ""));
    }
}
