package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.i9;
import bo.app.ia;
import bo.app.ja;
import bo.app.ka;
import bo.app.la;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.ua;
import bo.app.we;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.i;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.SimpleItemTouchHelperCallback;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    protected static final String ANIMATE_IN = "animate_in";
    protected static final String ANIMATE_OUT = "animate_out";
    public static final String BG_COLOR = "bg_color";
    public static final String CLICK_ACTION = "click_action";
    public static final String CROP_TYPE = "crop_type";
    public static final ia Companion = new ia();
    public static final String DISMISS_TYPE = "message_close";
    public static final String DURATION = "duration";
    public static final String EXTRAS = "extras";
    public static final String ICON = "icon";
    public static final String ICON_BG_COLOR = "icon_bg_color";
    public static final String ICON_COLOR = "icon_color";
    public static final String IMAGE_ALT = "image_alt";
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String IS_CONTROL = "is_control";
    public static final String IS_TEST_SEND = "is_test_send";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_EXTRAS = "message_extras";
    public static final String MESSAGE_TEXT_ALIGN = "text_align_message";
    public static final String MESSAGE_TEXT_COLOR = "text_color";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String ORIENTATION = "orientation";
    public static final String TRIGGER_ID = "trigger_id";
    public static final String TYPE = "type";
    public static final String URI = "uri";
    private String altImageText;
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private i9 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private ua inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private boolean isTestSend;
    private JSONObject jsonObject;
    private String message;
    private String messageExtras;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    public static /* synthetic */ void getAnimateIn$annotations() {
    }

    public static /* synthetic */ void getAnimateOut$annotations() {
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getAltImageText() {
        return this.altImageText;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final i9 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public ClickAction getClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getIcon() {
        return this.icon;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconColor() {
        return this.iconColor;
    }

    public final ua getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessageExtras() {
        return this.messageExtras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return instance_delegatelambda0.write;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Uri getUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isTestSend() {
        return this.isTestSend;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAltImageText(String str) {
        this.altImageText = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z) {
        this.animateIn = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z) {
        this.animateOut = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBrazeManager(i9 i9Var) {
        this.brazeManager = i9Var;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j) {
        this.expirationTimestamp = j;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIcon(String str) {
        this.icon = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconBackgroundColor(int i) {
        this.iconBackgroundColor = i;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconColor(int i) {
        this.iconColor = i;
    }

    public final void setInAppMessageDarkThemeWrapper(ua uaVar) {
        this.inAppMessageDarkThemeWrapper = uaVar;
    }

    public final void setJsonObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        map.getClass();
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageExtras(String str) {
        this.messageExtras = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextColor(int i) {
        this.messageTextColor = i;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOpenUriInWebView(boolean z) {
        this.openUriInWebView = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setTestSend(boolean z) {
        this.isTestSend = z;
    }

    public InAppMessageBase(JSONObject jSONObject, i9 i9Var, boolean z, boolean z2) throws JSONException {
        DismissType dismissType;
        String upperCase;
        DismissType[] dismissTypeArrValues;
        int length;
        jSONObject.getClass();
        i9Var.getClass();
        this.internalClickAction = ClickAction.NONE;
        this.extras = SimpleItemTouchHelperCallback.serializer;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        int i = 0;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = jSONObject;
        this.brazeManager = i9Var;
        setMessage(jSONObject.optString("message"));
        setAnimateIn(jSONObject.optBoolean(ANIMATE_IN, true));
        setAnimateOut(jSONObject.optBoolean(ANIMATE_OUT, true));
        setDurationInMilliseconds(jSONObject.optInt(DURATION));
        setIcon(jSONObject.optString("icon"));
        try {
            String string = jSONObject.getString(ORIENTATION);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase2 = string.toUpperCase(locale);
            upperCase2.getClass();
            Orientation[] orientationArrValues = Orientation.values();
            int length2 = orientationArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                Orientation orientation2 = orientationArrValues[i2];
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{orientation2.name(), upperCase2}, getCieXyz.write())).booleanValue()) {
                    orientation = orientation2;
                    break;
                }
                i2++;
            }
        } catch (Exception unused) {
        }
        setOrientation(orientation);
        setOpenUriInWebView(jSONObject.optBoolean(OPEN_URI_IN_WEBVIEW, false));
        setIconBackgroundColor(jSONObject.optInt(ICON_BG_COLOR));
        setMessageTextColor(jSONObject.optInt(MESSAGE_TEXT_COLOR));
        setBackgroundColor(jSONObject.optInt(BG_COLOR));
        setIconColor(jSONObject.optInt(ICON_COLOR));
        this.impressionLogged.set(z);
        this.clickLogged.set(z2);
        setExtras(JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject(EXTRAS)));
        if (jSONObject.has(MESSAGE_EXTRAS)) {
            setMessageExtras(jSONObject.optString(MESSAGE_EXTRAS));
        }
        String strOptString = jSONObject.optString("uri");
        ClickAction clickAction = ClickAction.NONE;
        try {
            try {
                String string2 = jSONObject.getString(CLICK_ACTION);
                string2.getClass();
                Locale locale2 = Locale.US;
                locale2.getClass();
                String upperCase3 = string2.toUpperCase(locale2);
                upperCase3.getClass();
                ClickAction[] clickActionArrValues = ClickAction.values();
                int length3 = clickActionArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    ClickAction clickAction2 = clickActionArrValues[i3];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{clickAction2.name(), upperCase3}, getCieXyz.write())).booleanValue()) {
                        clickAction = clickAction2;
                        break;
                    }
                    i3++;
                }
                while (true) {
                    if (i >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    DismissType dismissType2 = dismissTypeArrValues[i];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{dismissType2.name(), upperCase}, getCieXyz.write())).booleanValue()) {
                        dismissType = dismissType2;
                        break;
                    }
                    i++;
                }
            } catch (Exception unused2) {
            }
            String string3 = jSONObject.getString(DISMISS_TYPE);
            string3.getClass();
            Locale locale3 = Locale.US;
            locale3.getClass();
            upperCase = string3.toUpperCase(locale3);
            upperCase.getClass();
            dismissTypeArrValues = DismissType.values();
            length = dismissTypeArrValues.length;
        } catch (Exception unused3) {
        }
        if (clickAction == ClickAction.URI && strOptString != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strOptString)) {
            this.internalUri = Uri.parse(strOptString);
        }
        this.internalClickAction = clickAction;
        dismissType = DismissType.AUTO_DISMISS;
        setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
        setAltImageText(jSONObject.optString(IMAGE_ALT));
        String str = i.a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("themes");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("dark") : null;
        this.inAppMessageDarkThemeWrapper = jSONObjectOptJSONObject2 != null ? new ua(jSONObjectOptJSONObject2) : null;
        jSONObject.put("is_test_send", isTestSend());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Failed to construct json for in-app message";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$0() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$1() {
        return "Cannot log an in-app message click because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLogClick$lambda$2() {
        return "Click already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0() {
        return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1() {
        return "Cannot log an in-app message impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2() {
        return "Impression already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickBehavior$lambda$0() {
        return "A non-null URI is required in order to set the message ClickAction to URI.";
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick(String str) {
        str.getClass();
        return handleLogClick(str);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction, Uri uri) {
        clickAction.getClass();
        if (clickAction != ClickAction.URI) {
            this.internalClickAction = clickAction;
            this.internalUri = null;
        } else if (uri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(14), 6, (Object) null);
        } else {
            this.internalClickAction = clickAction;
            this.internalUri = uri;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setCropType(CropType cropType) {
        cropType.getClass();
        this.cropType = cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDismissType(DismissType dismissType) {
        dismissType.getClass();
        this.dismissType = dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExtras(Map<String, String> map) {
        map.getClass();
        this.extras = map;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        this.messageTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOrientation(Orientation orientation) {
        orientation.getClass();
        this.orientation = orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$0(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Requested in-app message duration ", " is lower than the minimum of 999. Defaulting to 5000 milliseconds.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_durationInMilliseconds_$lambda$1(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Set in-app message duration to ", " milliseconds.");
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        ua uaVar = this.inAppMessageDarkThemeWrapper;
        if (uaVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(18), 7, (Object) null);
            return;
        }
        Integer num = uaVar.a;
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
        Integer num2 = uaVar.d;
        if (num2 != null) {
            setIconColor(num2.intValue());
        }
        Integer num3 = uaVar.e;
        if (num3 != null) {
            setIconBackgroundColor(num3.intValue());
        }
        Integer num4 = uaVar.b;
        if (num4 != null) {
            setMessageTextColor(num4.intValue());
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new la(this, null), 3);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDurationInMilliseconds(int i) {
        if (i < 999) {
            this.durationInMilliseconds = 5000;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 18), 7, (Object) null);
        } else {
            this.durationInMilliseconds = i;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 19), 7, (Object) null);
        }
    }

    private final boolean handleLogClick(String str) {
        String triggerId = getTriggerId();
        if (triggerId == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(21), 7, (Object) null);
            return false;
        }
        i9 i9Var = this.brazeManager;
        if (i9Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(19), 6, (Object) null);
            return false;
        }
        if (getMessageType() != MessageType.HTML && this.clickLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(20), 6, (Object) null);
            return false;
        }
        this.clickLogged.set(true);
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new ja(str, triggerId, i9Var, null), 3);
        return true;
    }

    public static /* synthetic */ boolean handleLogClick$default(InAppMessageBase inAppMessageBase, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return inAppMessageBase.handleLogClick(str);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: handleLogClick");
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("message", getMessage());
            jSONObject2.put(DURATION, getDurationInMilliseconds());
            jSONObject2.putOpt(TRIGGER_ID, getTriggerId());
            jSONObject2.putOpt(CLICK_ACTION, getClickAction().toString());
            jSONObject2.putOpt(DISMISS_TYPE, getDismissType().toString());
            if (getUri() != null) {
                jSONObject2.put("uri", String.valueOf(getUri()));
            }
            jSONObject2.put(OPEN_URI_IN_WEBVIEW, getOpenUriInWebView());
            jSONObject2.put(ANIMATE_IN, getAnimateIn());
            jSONObject2.put(ANIMATE_OUT, getAnimateOut());
            jSONObject2.put(BG_COLOR, getBackgroundColor());
            jSONObject2.put(MESSAGE_TEXT_COLOR, getMessageTextColor());
            jSONObject2.put(ICON_COLOR, getIconColor());
            jSONObject2.put(ICON_BG_COLOR, getIconBackgroundColor());
            jSONObject2.putOpt("icon", getIcon());
            jSONObject2.putOpt(CROP_TYPE, getCropType().toString());
            jSONObject2.putOpt(ORIENTATION, getOrientation().toString());
            jSONObject2.putOpt(MESSAGE_TEXT_ALIGN, getMessageTextAlign().toString());
            jSONObject2.putOpt(IMAGE_ALT, getAltImageText());
            jSONObject2.putOpt("is_control", Boolean.valueOf(isControl()));
            jSONObject2.put("is_test_send", isTestSend());
            if (!getExtras().isEmpty()) {
                jSONObject2.put(EXTRAS, getExtras());
            }
            return jSONObject2;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(13), 4, (Object) null);
            return jSONObject2;
        }
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject.optString(TRIGGER_ID);
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean("is_control");
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(17), 6, (Object) null);
            return false;
        }
        i9 i9Var = this.brazeManager;
        if (i9Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(15), 6, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(16), 6, (Object) null);
            return false;
        }
        this.impressionLogged.set(true);
        BuildersKt.RemoteActionCompatParcelizer(we.a, null, null, new ka(triggerId, this, i9Var, null), 3);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        return handleLogClick$default(this, null, 1, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction) {
        clickAction.getClass();
        setClickBehavior(clickAction, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject jSONObject, i9 i9Var, boolean z) {
        this(jSONObject, i9Var, z, false, 8, null);
        jSONObject.getClass();
        i9Var.getClass();
    }

    public InAppMessageBase() {
        this.internalClickAction = ClickAction.NONE;
        this.extras = SimpleItemTouchHelperCallback.serializer;
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        this.orientation = Orientation.ANY;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
    }

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, i9 i9Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, i9Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject jSONObject, i9 i9Var) {
        this(jSONObject, i9Var, false, false, 12, null);
        jSONObject.getClass();
        i9Var.getClass();
    }
}
