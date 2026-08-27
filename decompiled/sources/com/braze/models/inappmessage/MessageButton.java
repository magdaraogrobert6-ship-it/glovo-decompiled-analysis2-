package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.db;
import bo.app.eb;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    private static final String BG_COLOR = "bg_color";
    private static final String BORDER_COLOR = "border_color";
    private static final String CLICK_ACTION = "click_action";
    private static final String ID = "id";
    private static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    private static final String TEXT = "text";
    private static final String TEXT_COLOR = "text_color";
    private static final String URI = "uri";
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private eb darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;
    public static final db Companion = new db();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setOpenUriInWebview(boolean z) {
        this.openUriInWebview = z;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickBehavior$lambda$0() {
        return "A non-null URI is required in order to set the button ClickAction to URI.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickBehavior$lambda$1() {
        return "ClickAction of URI is required in order to set a non-null URI";
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt(TEXT, this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put(BORDER_COLOR, this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        eb ebVar = this.darkTheme;
        if (ebVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(6), 14, (Object) null);
            return;
        }
        Integer num = ebVar.a;
        if (num != null) {
            this.backgroundColor = num.intValue();
        }
        Integer num2 = ebVar.b;
        if (num2 != null) {
            this.textColor = num2.intValue();
        }
        Integer num3 = ebVar.c;
        if (num3 != null) {
            this.borderColor = num3.intValue();
        }
    }

    public final void setClickBehavior(ClickAction clickAction, Uri uri) {
        clickAction.getClass();
        if (uri == null && clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(7), 12, (Object) null);
        } else if (uri != null && clickAction != ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(8), 12, (Object) null);
        } else {
            this.clickAction = clickAction;
            this.uri = uri;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageButton(JSONObject jSONObject, JSONObject jSONObject2) {
        ClickAction clickAction;
        jSONObject.getClass();
        int iOptInt = jSONObject.optInt("id", -1);
        ClickAction clickAction2 = ClickAction.NONE;
        try {
            String string = jSONObject.getString("click_action");
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = string.toUpperCase(locale);
            upperCase.getClass();
            for (ClickAction clickAction3 : ClickAction.values()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{clickAction3.name(), upperCase}, getCieXyz.write())).booleanValue()) {
                    clickAction = clickAction3;
                    String strOptString = jSONObject.optString("uri");
                    String strOptString2 = jSONObject.optString(TEXT);
                    strOptString2.getClass();
                    this(jSONObject, jSONObject2, iOptInt, clickAction, strOptString, strOptString2, jSONObject.optInt("bg_color"), jSONObject.optInt("text_color"), jSONObject.optBoolean("use_webview", false), jSONObject.optInt(BORDER_COLOR));
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            clickAction = clickAction2;
        }
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public static /* synthetic */ void setClickBehavior$default(MessageButton messageButton, ClickAction clickAction, Uri uri, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                uri = null;
            }
            messageButton.setClickBehavior(clickAction, uri);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setClickBehavior");
    }

    public final void setClickBehavior(ClickAction clickAction) {
        clickAction.getClass();
        setClickBehavior$default(this, clickAction, null, 2, null);
    }

    public MessageButton() {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
    }

    public /* synthetic */ MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? null : jSONObject2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageButton(JSONObject jSONObject) {
        this(jSONObject, null, 2, 0 == true ? 1 : 0);
        jSONObject.getClass();
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i, ClickAction clickAction, String str, String str2, int i2, int i3, boolean z, int i4) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int color = Color.parseColor("#1B78CF");
        this.backgroundColor = color;
        this.textColor = -1;
        this.borderColor = color;
        this.jsonObject = jSONObject;
        this.id = i;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i2;
        this.textColor = i3;
        this.openUriInWebview = z;
        this.borderColor = i4;
        this.darkTheme = jSONObject2 != null ? new eb(jSONObject2) : null;
    }
}
