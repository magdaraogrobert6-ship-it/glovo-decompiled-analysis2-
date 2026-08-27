package o;

import com.google.firebase.firestore.pipeline.DocumentsSource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessheadNode {
    public static final accessgetSemanticsSourcecp RemoteActionCompatParcelizer(tailH91voCIui tailh91vociui) {
        ArrayList arrayList = tailh91vociui.IconCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(!arrayList.isEmpty(), "Pipeline must have at least one stage to determine its source.", new Object[0]);
        specifiesCanFocusProperty specifiescanfocusproperty = (specifiesCanFocusProperty) onContentCardDismissed.read((List) arrayList);
        if (specifiescanfocusproperty instanceof orimpl) {
            return accessgetSemanticsSourcecp.COLLECTION;
        }
        if (specifiescanfocusproperty instanceof getMask) {
            return accessgetSemanticsSourcecp.COLLECTION_GROUP;
        }
        return specifiescanfocusproperty instanceof DocumentsSource ? accessgetSemanticsSourcecp.DOCUMENTS : accessgetSemanticsSourcecp.UNKNOWN;
    }

    public static final String[] read(tailH91voCIui tailh91vociui) {
        ArrayList arrayList = tailh91vociui.IconCompatParcelizer;
        if (RemoteActionCompatParcelizer(tailh91vociui) != accessgetSemanticsSourcecp.DOCUMENTS) {
            return null;
        }
        getRectManager.RemoteActionCompatParcelizer(!arrayList.isEmpty(), "Pipeline source is Documents but stages are empty.", new Object[0]);
        specifiesCanFocusProperty specifiescanfocusproperty = (specifiesCanFocusProperty) onContentCardDismissed.read((List) arrayList);
        if (!(specifiescanfocusproperty instanceof DocumentsSource)) {
            return null;
        }
        shareWithSiblings[] sharewithsiblingsArr = ((DocumentsSource) specifiescanfocusproperty).RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(sharewithsiblingsArr.length);
        for (shareWithSiblings sharewithsiblings : sharewithsiblingsArr) {
            arrayList2.add(sharewithsiblings.write());
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static final String serializer(tailH91voCIui tailh91vociui) {
        ArrayList arrayList = tailh91vociui.IconCompatParcelizer;
        if (RemoteActionCompatParcelizer(tailh91vociui) != accessgetSemanticsSourcecp.COLLECTION) {
            return null;
        }
        getRectManager.RemoteActionCompatParcelizer(!arrayList.isEmpty(), "Pipeline source is Collection but stages are empty.", new Object[0]);
        specifiesCanFocusProperty specifiescanfocusproperty = (specifiesCanFocusProperty) onContentCardDismissed.read((List) arrayList);
        if (specifiescanfocusproperty instanceof orimpl) {
            return ((orimpl) specifiescanfocusproperty).IconCompatParcelizer.write();
        }
        return null;
    }
}
