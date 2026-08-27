package com.braze.models.cards;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.g9;
import bo.app.h2;
import bo.app.i9;
import bo.app.m3;
import bo.app.m9;
import bo.app.n1;
import bo.app.x3;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.models.IPutIntoJson;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Map;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Card implements IPutIntoJson<JSONObject> {
    public static final m3 Companion = new m3();
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final i9 brazeManager;
    private final m9 cardAnalytics;
    private final ICardStorageProvider<?> cardStorage;
    private final CardType cardType;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;
    private final String id;
    private boolean isClicked;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final String url;
    private boolean wasViewedInternal;

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final ICardListener getListener() {
        return this.listener;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public String getUrl() {
        return this.url;
    }

    public final boolean getViewed() {
        return this.wasViewedInternal;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final boolean isDismissed() {
        return this.isDismissedInternal;
    }

    public final boolean isDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isIndicatorHighlighted() {
        return this.isIndicatorHighlightedInternal;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final boolean isTest() {
        return this.isTest;
    }

    public final void setDismissibleByUser(boolean z) {
        this.isDismissibleByUser = z;
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setPinned(boolean z) {
        this.isPinned = z;
    }

    public final void setTest(boolean z) {
        this.isTest = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$0() {
        return "Cannot dismiss a card more than once. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isDismissed_$lambda$2() {
        return "Failed to log card as dismissed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_isIndicatorHighlighted_$lambda$0() {
        return "Failed to mark card indicator as highlighted.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidCard$lambda$0() {
        return "Card ID cannot be null";
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        long j = this.created;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isValidCard() {
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) this.id)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(10), 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        int i = 0;
        int i2 = 1;
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(this, i2), 6, (Object) null);
                return false;
            }
            m9 m9Var = this.cardAnalytics;
            String str = this.id;
            ((x3) m9Var).getClass();
            str.getClass();
            g9 g9VarE = n1.g.e(str);
            if (g9VarE != null) {
                ((h2) this.brazeManager).a(g9VarE);
            }
            this.cardStorage.markCardAsClicked(this.id);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(this, i), 7, (Object) null);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(this, 2), 4, (Object) null);
        }
    }

    public final void setIndicatorHighlighted(boolean z) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.isIndicatorHighlightedInternal = z;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (!z || (iCardStorageProvider = this.cardStorage) == null) {
            return;
        }
        try {
            iCardStorageProvider.markCardAsVisuallyRead(this.id);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(9), 4, (Object) null);
        }
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.id);
        }
    }

    public String toString() {
        Map<String, String> map = this.extras;
        String str = this.id;
        long j = this.created;
        long j2 = this.expiresAt;
        boolean z = this.wasViewedInternal;
        boolean z2 = this.isIndicatorHighlightedInternal;
        boolean z3 = this.isDismissedInternal;
        boolean z4 = this.isRemoved;
        boolean z5 = this.isPinned;
        boolean z6 = this.isClicked;
        boolean z7 = this.openUriInWebView;
        boolean z8 = this.isDismissibleByUser;
        boolean z9 = this.isTest;
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(this.jsonObject);
        StringBuilder sb = new StringBuilder("\n        Card{\n        extras=");
        sb.append(map);
        sb.append("\n        id='");
        sb.append(str);
        sb.append("'\n        created=");
        sb.append(j);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "\n        expiresAt=", j2, "\n        viewed=");
        af$$ExternalSyntheticOutline0.m(sb, z, "\n        isRead=", z2, "\n        isDismissed=");
        af$$ExternalSyntheticOutline0.m(sb, z3, "\n        isRemoved=", z4, "\n        isPinned=");
        af$$ExternalSyntheticOutline0.m(sb, z5, "\n        isClicked=", z6, "\n        openUriInWebview=");
        af$$ExternalSyntheticOutline0.m(sb, z7, "\n        isDismissibleByUser=", z8, "\n        isTest=");
        sb.append(z9);
        sb.append("\n        json=");
        sb.append(prettyPrintedString);
        sb.append("\n        }\n\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sb.toString());
    }

    public Card(JSONObject jSONObject, i9 i9Var, ICardStorageProvider<?> iCardStorageProvider, m9 m9Var) throws JSONException {
        jSONObject.getClass();
        this.jsonObject = jSONObject;
        this.brazeManager = i9Var;
        this.cardStorage = iCardStorageProvider;
        this.cardAnalytics = m9Var;
        this.extras = JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject(CardKey.EXTRAS.getKey()));
        String string = jSONObject.getString(CardKey.ID.getKey());
        string.getClass();
        this.id = string;
        this.cardType = CardType.DEFAULT;
        this.wasViewedInternal = jSONObject.optBoolean(CardKey.VIEWED.getKey());
        this.isDismissedInternal = jSONObject.optBoolean(CardKey.DISMISSED.getKey(), false);
        this.isPinned = jSONObject.optBoolean(CardKey.PINNED.getKey(), false);
        this.created = jSONObject.getLong(CardKey.CREATED.getKey());
        this.expiresAt = jSONObject.optLong(CardKey.EXPIRES_AT.getKey(), -1L);
        this.openUriInWebView = jSONObject.optBoolean(CardKey.OPEN_URI_IN_WEBVIEW.getKey(), false);
        this.isRemoved = jSONObject.optBoolean(CardKey.REMOVED.getKey(), false);
        this.isDismissibleByUser = jSONObject.optBoolean(CardKey.DISMISSIBLE.getKey(), false);
        this.isIndicatorHighlightedInternal = jSONObject.optBoolean(CardKey.READ.getKey(), this.wasViewedInternal);
        this.isClicked = jSONObject.optBoolean(CardKey.CLICKED.getKey(), false);
        this.isTest = jSONObject.optBoolean(CardKey.IS_TEST.getKey(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$1(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Logged click for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$2(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to log card clicked for id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$3(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to log card as clicked for id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Logging impression event for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Logging control impression event for card with id: ", card.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$4(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to log card impression for card id: ", card.id);
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(this, 4), 6, (Object) null);
                m9 m9Var = this.cardAnalytics;
                String str = this.id;
                ((x3) m9Var).getClass();
                str.getClass();
                g9 g9VarG = n1.g.g(str);
                if (g9VarG != null) {
                    ((h2) this.brazeManager).a(g9VarG);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(this, 3), 6, (Object) null);
                m9 m9Var2 = this.cardAnalytics;
                String str2 = this.id;
                ((x3) m9Var2).getClass();
                str2.getClass();
                g9 g9VarK = n1.g.k(str2);
                if (g9VarK != null) {
                    ((h2) this.brazeManager).a(g9VarK);
                }
            }
            this.cardStorage.markCardAsViewed(this.id);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(this, 5), 4, (Object) null);
            return false;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    public final void setDismissed(boolean z) {
        if (this.isDismissedInternal && z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(11), 6, (Object) null);
            return;
        }
        this.isDismissedInternal = z;
        ICardStorageProvider<?> iCardStorageProvider = this.cardStorage;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsDismissed(this.id);
        }
        if (z) {
            try {
                if (this.brazeManager == null || this.cardAnalytics == null || !isValidCard()) {
                    return;
                }
                m9 m9Var = this.cardAnalytics;
                String str = this.id;
                ((x3) m9Var).getClass();
                str.getClass();
                g9 g9VarI = n1.g.i(str);
                if (g9VarI != null) {
                    ((h2) this.brazeManager).a(g9VarI);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(12), 4, (Object) null);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Card card = (Card) obj;
        if (this.created != card.created) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, card.id}, getCieXyz.write())).booleanValue();
    }

    public final boolean isExpired() {
        long j = this.expiresAt;
        return j != -1 && j <= DateTimeUtils.nowInSeconds();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jSONObject) {
        this(jSONObject, null, null, null);
        jSONObject.getClass();
    }
}
