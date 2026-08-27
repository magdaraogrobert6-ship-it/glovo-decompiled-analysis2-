package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.i9;
import bo.app.ua;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageSlideup extends InAppMessageWithImageBase {
    private static final String CHEVRON_COLOR = "close_btn_color";
    public static final Companion Companion = new Companion(null);
    private static final String SLIDE_FROM = "slide_from";
    private int chevronColor;
    private SlideFrom slideFrom;

    public final int getChevronColor() {
        return this.chevronColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.SLIDEUP;
    }

    public final SlideFrom getSlideFrom() {
        return this.slideFrom;
    }

    public final void setChevronColor(int i) {
        this.chevronColor = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Error creating JSON.";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private InAppMessageSlideup(JSONObject jSONObject, i9 i9Var, SlideFrom slideFrom, int i) {
        super(jSONObject, i9Var);
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        if (slideFrom != null) {
            this.slideFrom = slideFrom;
        }
        this.chevronColor = i;
        setCropType((CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, CropType.class, CropType.FIT_CENTER));
        setMessageTextAlign((TextAlign) JsonUtils.optEnum(jSONObject, InAppMessageBase.MESSAGE_TEXT_ALIGN, TextAlign.class, TextAlign.START));
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        Integer num;
        super.enableDarkTheme();
        ua inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(4), 6, (Object) null);
            return;
        }
        Integer num2 = inAppMessageDarkThemeWrapper.c;
        if ((num2 != null && num2.intValue() == -1) || (num = inAppMessageDarkThemeWrapper.c) == null) {
            return;
        }
        this.chevronColor = num.intValue();
    }

    public final void setSlideFrom(SlideFrom slideFrom) {
        slideFrom.getClass();
        this.slideFrom = slideFrom;
    }

    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put(SLIDE_FROM, this.slideFrom.toString());
            jSONObjectForJsonPut.put(CHEVRON_COLOR, this.chevronColor);
            jSONObjectForJsonPut.put("type", getMessageType().name());
            return jSONObjectForJsonPut;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(5), 4, (Object) null);
            return jSONObjectForJsonPut;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(JSONObject jSONObject, i9 i9Var) {
        this(jSONObject, i9Var, (SlideFrom) JsonUtils.optEnum(jSONObject, SLIDE_FROM, SlideFrom.class, SlideFrom.BOTTOM), jSONObject.optInt(CHEVRON_COLOR));
        jSONObject.getClass();
        i9Var.getClass();
    }

    public InAppMessageSlideup() {
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        setMessageTextAlign(TextAlign.START);
    }
}
