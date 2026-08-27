package com.deliveryhero.perseus.data.remote;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.data.remote.api.model.HitDetails;
import com.deliveryhero.perseus.data.remote.api.model.HitsRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.getCurrentGroup;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.verticalLineToRelative;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusHitsRemoteDataStoreImpl {
    public final verticalLineToRelative IconCompatParcelizer;
    public final getCurrentGroup serializer;
    public final LinkedHashMap write;

    public PerseusHitsRemoteDataStoreImpl(verticalLineToRelative verticallinetorelative, getCurrentGroup getcurrentgroup) {
        verticallinetorelative.getClass();
        this.IconCompatParcelizer = verticallinetorelative;
        this.serializer = getcurrentgroup;
        this.write = new LinkedHashMap();
    }

    public static boolean read(PerseusParamsConfig perseusParamsConfig, HitsRequest hitsRequest) {
        perseusParamsConfig.getClass();
        hitsRequest.getClass();
        RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2 = new RoomDatabase$$ExternalSyntheticLambda2(13, perseusParamsConfig);
        List<HitDetails> hits = hitsRequest.getHits();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = hits.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) roomDatabase$$ExternalSyntheticLambda2.invoke((HitDetails) it.next()), (Collection) arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = (String) ((onViewAttachedToWindowlambda0) obj).serializer;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((List) ((Map.Entry) it2.next()).getValue()).size() != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01a5 A[Catch: Exception -> 0x02e5, TryCatch #0 {Exception -> 0x02e5, blocks: (B:13:0x0044, B:73:0x0266, B:50:0x019f, B:52:0x01a5, B:54:0x01b9, B:56:0x01d5, B:57:0x01ed, B:59:0x01f3, B:60:0x0201, B:69:0x023c, B:63:0x021a, B:68:0x0233, B:55:0x01c0, B:74:0x0272, B:86:0x02cb, B:77:0x0281, B:79:0x0286, B:81:0x028c, B:83:0x029e, B:23:0x0075, B:25:0x007f, B:26:0x008e, B:28:0x0094, B:29:0x00af, B:31:0x00b5, B:33:0x00cd, B:34:0x00d9, B:35:0x00ea, B:37:0x00f0, B:38:0x0103, B:40:0x0109, B:41:0x0137, B:42:0x013e, B:43:0x0147, B:45:0x014d, B:47:0x015e, B:48:0x0166, B:49:0x016c, B:90:0x02d1, B:91:0x02e4, B:65:0x021e), top: B:95:0x0028, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b9 A[Catch: Exception -> 0x02e5, TryCatch #0 {Exception -> 0x02e5, blocks: (B:13:0x0044, B:73:0x0266, B:50:0x019f, B:52:0x01a5, B:54:0x01b9, B:56:0x01d5, B:57:0x01ed, B:59:0x01f3, B:60:0x0201, B:69:0x023c, B:63:0x021a, B:68:0x0233, B:55:0x01c0, B:74:0x0272, B:86:0x02cb, B:77:0x0281, B:79:0x0286, B:81:0x028c, B:83:0x029e, B:23:0x0075, B:25:0x007f, B:26:0x008e, B:28:0x0094, B:29:0x00af, B:31:0x00b5, B:33:0x00cd, B:34:0x00d9, B:35:0x00ea, B:37:0x00f0, B:38:0x0103, B:40:0x0109, B:41:0x0137, B:42:0x013e, B:43:0x0147, B:45:0x014d, B:47:0x015e, B:48:0x0166, B:49:0x016c, B:90:0x02d1, B:91:0x02e4, B:65:0x021e), top: B:95:0x0028, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c0 A[Catch: Exception -> 0x02e5, TryCatch #0 {Exception -> 0x02e5, blocks: (B:13:0x0044, B:73:0x0266, B:50:0x019f, B:52:0x01a5, B:54:0x01b9, B:56:0x01d5, B:57:0x01ed, B:59:0x01f3, B:60:0x0201, B:69:0x023c, B:63:0x021a, B:68:0x0233, B:55:0x01c0, B:74:0x0272, B:86:0x02cb, B:77:0x0281, B:79:0x0286, B:81:0x028c, B:83:0x029e, B:23:0x0075, B:25:0x007f, B:26:0x008e, B:28:0x0094, B:29:0x00af, B:31:0x00b5, B:33:0x00cd, B:34:0x00d9, B:35:0x00ea, B:37:0x00f0, B:38:0x0103, B:40:0x0109, B:41:0x0137, B:42:0x013e, B:43:0x0147, B:45:0x014d, B:47:0x015e, B:48:0x0166, B:49:0x016c, B:90:0x02d1, B:91:0x02e4, B:65:0x021e), top: B:95:0x0028, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f3 A[Catch: Exception -> 0x02e5, LOOP:0: B:57:0x01ed->B:59:0x01f3, LOOP_END, TryCatch #0 {Exception -> 0x02e5, blocks: (B:13:0x0044, B:73:0x0266, B:50:0x019f, B:52:0x01a5, B:54:0x01b9, B:56:0x01d5, B:57:0x01ed, B:59:0x01f3, B:60:0x0201, B:69:0x023c, B:63:0x021a, B:68:0x0233, B:55:0x01c0, B:74:0x0272, B:86:0x02cb, B:77:0x0281, B:79:0x0286, B:81:0x028c, B:83:0x029e, B:23:0x0075, B:25:0x007f, B:26:0x008e, B:28:0x0094, B:29:0x00af, B:31:0x00b5, B:33:0x00cd, B:34:0x00d9, B:35:0x00ea, B:37:0x00f0, B:38:0x0103, B:40:0x0109, B:41:0x0137, B:42:0x013e, B:43:0x0147, B:45:0x014d, B:47:0x015e, B:48:0x0166, B:49:0x016c, B:90:0x02d1, B:91:0x02e4, B:65:0x021e), top: B:95:0x0028, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0217  */
    /* JADX WARN: Code duplicated, block: B:63:0x021a A[Catch: Exception -> 0x02e5, TRY_LEAVE, TryCatch #0 {Exception -> 0x02e5, blocks: (B:13:0x0044, B:73:0x0266, B:50:0x019f, B:52:0x01a5, B:54:0x01b9, B:56:0x01d5, B:57:0x01ed, B:59:0x01f3, B:60:0x0201, B:69:0x023c, B:63:0x021a, B:68:0x0233, B:55:0x01c0, B:74:0x0272, B:86:0x02cb, B:77:0x0281, B:79:0x0286, B:81:0x028c, B:83:0x029e, B:23:0x0075, B:25:0x007f, B:26:0x008e, B:28:0x0094, B:29:0x00af, B:31:0x00b5, B:33:0x00cd, B:34:0x00d9, B:35:0x00ea, B:37:0x00f0, B:38:0x0103, B:40:0x0109, B:41:0x0137, B:42:0x013e, B:43:0x0147, B:45:0x014d, B:47:0x015e, B:48:0x0166, B:49:0x016c, B:90:0x02d1, B:91:0x02e4, B:65:0x021e), top: B:95:0x0028, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0265  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.deliveryhero.perseus.data.remote.api.model.HitsResponse] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0265 -> B:73:0x0266). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object sendEventsHits(com.deliveryhero.perseus.data.remote.api.model.HitsRequest r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.data.remote.PerseusHitsRemoteDataStoreImpl.sendEventsHits(com.deliveryhero.perseus.data.remote.api.model.HitsRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
