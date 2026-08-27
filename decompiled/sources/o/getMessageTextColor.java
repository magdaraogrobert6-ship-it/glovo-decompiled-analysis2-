package o;

import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getMessageTextColor {
    private final setHeaderTextColor RemoteActionCompatParcelizer;

    public final ArrayList RemoteActionCompatParcelizer(long j, long j2) {
        Long l;
        ArrayList arrayList = new ArrayList();
        logImpressionlambda1 logimpressionlambda1 = logImpressionlambda1.read();
        setHeaderTextColor setheadertextcolor = this.RemoteActionCompatParcelizer;
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4) setheadertextcolor.read(logimpressionlambda1, j);
        if (r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 == null || (l = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.read()) == null || l.longValue() <= j) {
            r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = null;
        }
        if (r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 != null) {
            arrayList.add(r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4);
        }
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(logImpressionlambda1.read(), j, j2, new WhereClause());
        listIconCompatParcelizer.getClass();
        arrayList.addAll(listIconCompatParcelizer);
        return arrayList;
    }

    public getMessageTextColor(setHeaderTextColor setheadertextcolor) {
        setheadertextcolor.getClass();
        this.RemoteActionCompatParcelizer = setheadertextcolor;
    }
}
