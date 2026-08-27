package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentGroup {
    public final Set read;
    public final String serializer;

    public getCurrentGroup(String str, Set set) {
        str.getClass();
        set.getClass();
        this.serializer = str;
        this.read = set;
    }

    public final getHoldoutVariation write(String str) {
        str.getClass();
        Gson gsonCreate = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        URI uri = new URI(str);
        String strM = af$$ExternalSyntheticOutline0.m(uri.getScheme(), "://", uri.getAuthority());
        getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
        getidentifiersvalidationsenabled.write(strM);
        Set set = this.read;
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer((getShortEdge) it.next());
        }
        getidentifiersvalidationsenabled.read = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        getidentifiersvalidationsenabled.write(ProtoFeatureMsgCompanion.IconCompatParcelizer(gsonCreate));
        return getidentifiersvalidationsenabled.write();
    }
}
