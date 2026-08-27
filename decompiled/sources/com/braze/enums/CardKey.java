package com.braze.enums;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.l$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public enum CardKey {
    ID("id"),
    VIEWED("v"),
    CREATED("ca"),
    EXPIRES_AT("ea"),
    EXTRAS("e"),
    OPEN_URI_IN_WEBVIEW("uw"),
    TYPE("tp"),
    DISMISSED(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE),
    REMOVED("r"),
    PINNED(Constants.BRAZE_PUSH_PRIORITY_KEY),
    DISMISSIBLE("db"),
    IS_TEST(Constants.BRAZE_PUSH_TITLE_KEY),
    READ("read"),
    CLICKED("cl"),
    IMAGE_ONLY_IMAGE("i"),
    IMAGE_ONLY_ALT_IMAGE(InAppMessageBase.IMAGE_ALT),
    IMAGE_ONLY_URL("u"),
    IMAGE_ONLY_ASPECT_RATIO("ar"),
    CAPTIONED_IMAGE_IMAGE("i"),
    CAPTIONED_IMAGE_ALT_IMAGE(InAppMessageBase.IMAGE_ALT),
    CAPTIONED_IMAGE_TITLE("tt"),
    CAPTIONED_IMAGE_DESCRIPTION("ds"),
    CAPTIONED_IMAGE_URL("u"),
    CAPTIONED_IMAGE_DOMAIN("dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("ar"),
    TEXT_ANNOUNCEMENT_TITLE("tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION("ds"),
    TEXT_ANNOUNCEMENT_URL("u"),
    TEXT_ANNOUNCEMENT_DOMAIN("dm"),
    SHORT_NEWS_IMAGE("i"),
    SHORT_NEWS_ALT_IMAGE(InAppMessageBase.IMAGE_ALT),
    SHORT_NEWS_TITLE("tt"),
    SHORT_NEWS_DESCRIPTION("ds"),
    SHORT_NEWS_URL("u"),
    SHORT_NEWS_DOMAIN("dm");

    private final String key;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);
    private static final String IMAGE_ONLY_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String CONTROL_KEY = "control";
    private static final Map<String, CardType> cardTypeMap = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(IMAGE_ONLY_KEY, CardType.IMAGE), new onViewAttachedToWindowlambda0(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), new onViewAttachedToWindowlambda0(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), new onViewAttachedToWindowlambda0(SHORT_NEWS_KEY, CardType.SHORT_NEWS), new onViewAttachedToWindowlambda0(CONTROL_KEY, CardType.CONTROL));

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getCardTypeFromJson$lambda$0(JSONObject jSONObject) {
            return af$$ExternalSyntheticOutline1.m("Short News card doesn't contain image url, parsing type as Text Announcement. JSON: ", jSONObject);
        }

        public final CardType getCardTypeFromJson(JSONObject jSONObject) {
            String optionalString;
            jSONObject.getClass();
            String optionalString2 = JsonUtils.getOptionalString(jSONObject, CardKey.TYPE.getKey());
            if (optionalString2 != null && optionalString2.length() != 0 && optionalString2.equals(CardKey.SHORT_NEWS_KEY) && ((optionalString = JsonUtils.getOptionalString(jSONObject, CardKey.SHORT_NEWS_IMAGE.getKey())) == null || optionalString.length() == 0)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 13), 6, (Object) null);
                optionalString2 = CardKey.TEXT_ANNOUNCEMENT_KEY;
            }
            return CardKey.cardTypeMap.containsKey(optionalString2) ? (CardType) CardKey.cardTypeMap.get(optionalString2) : CardType.DEFAULT;
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            cardType.getClass();
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }

    public static final CardType getCardTypeFromJson(JSONObject jSONObject) {
        return Companion.getCardTypeFromJson(jSONObject);
    }

    public static final String getServerKeyFromCardType(CardType cardType) {
        return Companion.getServerKeyFromCardType(cardType);
    }

    CardKey(String str) {
        this.key = str;
    }
}
