package bo.app;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Channel;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.models.IPropertiesObject;
import com.braze.models.recommended.ecommerce.EcommerceEvent;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeImageUtils;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda2;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ n$$ExternalSyntheticLambda2(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return n.a((Set) obj2, (List) obj);
            case 1:
                return ge.a((he) obj2, (ce) obj);
            case 2:
                return h2.a((h2) obj2, (g9) obj);
            case 3:
                return hg.a((ga) obj2, (String) obj);
            case 4:
                return ig.a((String) obj2, (Map) obj);
            case 5:
                return k0.a((k0) obj2, (ba) obj);
            case 6:
                return l4.a((r4) obj2, (rd) obj);
            case 7:
                return m1.b((String) obj2, (String[]) obj);
            case 8:
                return m1.b((String) obj2, (vf) obj);
            case 9:
                return n.a((List) obj, (ArrayList) obj2);
            case 10:
                return o6.a((o6) obj2, (Integer) obj);
            case 11:
                return q3.a(obj2, (JSONArray) obj);
            case 12:
                return sc.a((String) obj2, (Long) obj);
            case 13:
                return ud.a((String) obj, (Set) obj2);
            case 14:
                return vg.a((fh) obj2, (LinkedHashMap) obj);
            case 15:
                return vg.a((da) obj2, (createInAppMessageEventSubscriber) obj);
            case 16:
                return za.a(obj2, (registerInAppMessageManagerlambda2) obj);
            case 17:
                return Braze.logEcommerceEvent$lambda$1((EcommerceEvent) obj2, (Braze) obj);
            case 18:
                return BrazeUser.setCustomUserAttribute$lambda$7((String) obj2, (JSONArray) obj);
            case 19:
                return DefaultBrazeImageLoader.getBitmapFromCache$lambda$0$0((String) obj2, (DefaultBrazeImageLoader) obj);
            case 20:
                return DefaultBrazeImageLoader.shouldSkipCaching$lambda$2$1((Map.Entry) obj2, (Uri) obj);
            case 21:
                return IPropertiesObject.doesKeyExist$lambda$0((String) obj2, (IPropertiesObject) obj);
            case 22:
                return BrazePushReceiver.Companion.handlePush$lambda$3((String) obj2, (Intent) obj);
            case 23:
                return BrazeImageUtils.getRemoteBitmap$lambda$3((URL) obj2, (BitmapFactory.Options) obj);
            case 24:
                return BrazeImageUtils.getRemoteBitmap$lambda$4((String) obj2, (Exception) obj);
            case 25:
                return BrazeImageUtils.getLocalBitmap$lambda$5((Uri) obj2, (BitmapFactory.Options) obj);
            case 26:
                return IntentUtils.addComponentAndSendBroadcast$lambda$0$0((ComponentName) obj2, (Intent) obj);
            case 27:
                return WebContentUtils.unpackZipIntoDirectory$lambda$2((File) obj2, (String) obj);
            case 28:
                return UriAction.openUriWithActionView$lambda$0((Uri) obj2, (Bundle) obj);
            default:
                return BrazeActionParser.execute$lambda$0((Channel) obj2, (Uri) obj);
        }
    }

    public /* synthetic */ n$$ExternalSyntheticLambda2(Object obj, Collection collection, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = collection;
    }
}
