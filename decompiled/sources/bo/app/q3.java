package bo.app;

import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ControlCard;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.resetAfterInAppMessageCloselambda2;
import o.verifyOrientationStatuslambda1;
import o.verifyOrientationStatuslambda3;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q3 {
    public static final q3 a = new q3();

    public static final Card a(JSONObject jSONObject, i9 i9Var, ICardStorageProvider iCardStorageProvider, m9 m9Var) {
        jSONObject.getClass();
        i9Var.getClass();
        iCardStorageProvider.getClass();
        m9Var.getClass();
        CardType cardTypeFromJson = CardKey.Companion.getCardTypeFromJson(jSONObject);
        int i = cardTypeFromJson == null ? -1 : n3.a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            return new ImageOnlyCard(jSONObject, i9Var, iCardStorageProvider, m9Var);
        }
        if (i == 2) {
            return new CaptionedImageCard(jSONObject, i9Var, iCardStorageProvider, m9Var);
        }
        if (i == 3) {
            return new ShortNewsCard(jSONObject, i9Var, iCardStorageProvider, m9Var);
        }
        if (i == 4) {
            return new TextAnnouncementCard(jSONObject, i9Var, iCardStorageProvider, m9Var);
        }
        if (i != 5) {
            return null;
        }
        return new ControlCard(jSONObject, i9Var, iCardStorageProvider, m9Var);
    }

    public static final String a(Object obj, JSONArray jSONArray) {
        return "Unable to create Card JSON in array. Ignoring. Was on element: " + obj + " of json array: " + jSONArray;
    }

    public static final Card a(i9 i9Var, ICardStorageProvider iCardStorageProvider, m9 m9Var, JSONArray jSONArray, Object obj) {
        obj.getClass();
        try {
            return a(new JSONObject(obj.toString()), i9Var, iCardStorageProvider, m9Var);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(obj, 11, jSONArray), 4, (Object) null);
            return null;
        }
    }

    public static final List a(JSONArray jSONArray, h2 h2Var, d4 d4Var, x3 x3Var) {
        jSONArray.getClass();
        h2Var.getClass();
        d4Var.getClass();
        x3Var.getClass();
        Object[] objArr = {0, Integer.valueOf(jSONArray.length())};
        int iWrite = BackspaceCommand.write();
        return resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(resetAfterInAppMessageCloselambda2.serializer(new verifyOrientationStatuslambda1(new verifyOrientationStatuslambda3(resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)), new o3(jSONArray)), new p3(jSONArray)))), new q3$$ExternalSyntheticLambda1(h2Var, d4Var, x3Var, jSONArray, 0)));
    }
}
