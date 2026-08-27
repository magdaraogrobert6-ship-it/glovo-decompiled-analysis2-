package com.braze.models.inappmessage;

import android.graphics.Color;
import androidx.sqlite.SQLite;
import bo.app.g9;
import bo.app.h2;
import bo.app.i9;
import bo.app.m1;
import bo.app.n1;
import bo.app.na;
import bo.app.pa;
import bo.app.qa;
import bo.app.qg;
import bo.app.ra;
import bo.app.ua;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils$$ExternalSyntheticLambda1;
import com.braze.support.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getContentCardsActionListener;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageCloselambda2;
import o.verifyOrientationStatuslambda1;
import o.verifyOrientationStatuslambda3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    private static final String BUTTONS = "btns";
    private static final String CLOSE_BUTTON_COLOR = "close_btn_color";
    public static final pa Companion = new pa();
    private static final String FRAME_COLOR = "frame_color";
    private static final String HEADER = "header";
    private static final String HEADER_TEXT_ALIGN = "text_align_header";
    private static final String HEADER_TEXT_COLOR = "header_text_color";
    private static final String IMAGE_STYLE = "image_style";
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public Integer getFrameColor() {
        return this.frameColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public String getHeader() {
        return this.header;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setCloseButtonColor(int i) {
        this.closeButtonColor = i;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeader(String str) {
        this.header = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextColor(int i) {
        this.headerTextColor = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0() {
        return "Trigger id not found (this is expected for test sends). Not logging button click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Button click already logged for this message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Cannot log a button click because the BrazeManager is null.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        ua inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(29), 7, (Object) null);
            return;
        }
        Integer num = inAppMessageDarkThemeWrapper.g;
        if (num != null) {
            setFrameColor(num);
        }
        Integer num2 = inAppMessageDarkThemeWrapper.c;
        if (num2 != null) {
            setCloseButtonColor(num2.intValue());
        }
        Integer num3 = inAppMessageDarkThemeWrapper.f;
        if (num3 != null) {
            setHeaderTextColor(num3.intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        messageButton.getClass();
        i9 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(3), 7, (Object) null);
            return false;
        }
        int i = 1;
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(i), 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(2), 6, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        m1 m1Var = n1.g;
        m1Var.getClass();
        g9 g9VarI = m1Var.i(triggerId, messageButton.getStringId());
        if (g9VarI != null) {
            ((h2) brazeManager).a(g9VarI);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        i9 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) triggerId) || (str = this.buttonIdClicked) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || brazeManager == null) {
            return;
        }
        ((h2) brazeManager).d.b(new qg(new na(getTriggerId(), this.buttonIdClicked)), qg.class);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        this.headerTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setImageStyle(ImageStyle imageStyle) {
        imageStyle.getClass();
        this.imageStyle = imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setMessageButtons(List<? extends MessageButton> list) {
        list.getClass();
        this.messageButtons = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessageImmersiveBase(JSONObject jSONObject, i9 i9Var) {
        ImageStyle imageStyle;
        TextAlign textAlign;
        TextAlign textAlign2;
        TextAlign textAlign3;
        JSONObject jSONObjectOptJSONObject;
        String upperCase;
        TextAlign[] textAlignArrValues;
        int length;
        int i;
        jSONObject.getClass();
        i9Var.getClass();
        String strOptString = jSONObject.optString(HEADER);
        strOptString.getClass();
        int iOptInt = jSONObject.optInt(HEADER_TEXT_COLOR);
        int iOptInt2 = jSONObject.optInt(CLOSE_BUTTON_COLOR);
        ImageStyle imageStyle2 = ImageStyle.TOP;
        int i2 = 0;
        try {
            try {
                String string = jSONObject.getString(IMAGE_STYLE);
                string.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase2 = string.toUpperCase(locale);
                upperCase2.getClass();
                ImageStyle[] imageStyleArrValues = ImageStyle.values();
                int length2 = imageStyleArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    ImageStyle imageStyle3 = imageStyleArrValues[i3];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{imageStyle3.name(), upperCase2}, getCieXyz.write())).booleanValue()) {
                        imageStyle = imageStyle3;
                        break;
                    }
                    i3++;
                }
                while (true) {
                    if (i >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    TextAlign textAlign4 = textAlignArrValues[i];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAlign4.name(), upperCase}, getCieXyz.write())).booleanValue()) {
                        textAlign2 = textAlign4;
                        break;
                    }
                    i++;
                }
            } catch (Exception unused) {
                imageStyle = imageStyle2;
            }
            String string2 = jSONObject.getString(HEADER_TEXT_ALIGN);
            string2.getClass();
            Locale locale2 = Locale.US;
            locale2.getClass();
            upperCase = string2.toUpperCase(locale2);
            upperCase.getClass();
            textAlignArrValues = TextAlign.values();
            length = textAlignArrValues.length;
            i = 0;
        } catch (Exception unused2) {
            textAlign2 = textAlign;
        }
        textAlign = TextAlign.CENTER;
        TextAlign textAlign5 = TextAlign.CENTER;
        try {
            String string3 = jSONObject.getString(InAppMessageBase.MESSAGE_TEXT_ALIGN);
            string3.getClass();
            Locale locale3 = Locale.US;
            locale3.getClass();
            String upperCase3 = string3.toUpperCase(locale3);
            upperCase3.getClass();
            TextAlign[] textAlignArrValues2 = TextAlign.values();
            int length3 = textAlignArrValues2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                TextAlign textAlign6 = textAlignArrValues2[i4];
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAlign6.name(), upperCase3}, getCieXyz.write())).booleanValue()) {
                    textAlign3 = textAlign6;
                    break;
                }
                i4++;
            }
        } catch (Exception unused3) {
            textAlign3 = textAlign5;
        }
        this(jSONObject, i9Var, strOptString, iOptInt, iOptInt2, imageStyle, textAlign2, textAlign3);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BUTTONS);
        String str = i.a;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("themes");
        JSONArray jSONArray = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("dark")) == null || (jSONArray = jSONObjectOptJSONObject.optJSONArray(BUTTONS)) == null) ? new JSONArray() : jSONArray;
        ArrayList arrayList = new ArrayList();
        Iterator verifyorientationstatuslambda1 = jSONArrayOptJSONArray == null ? getContentCardsActionListener.IconCompatParcelizer : new verifyOrientationStatuslambda1(new verifyOrientationStatuslambda3(resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(jSONArrayOptJSONArray.length())}, BackspaceCommand.write(), -281231677, BackspaceCommand.write())), new qa(jSONArrayOptJSONArray)), new ra(jSONArrayOptJSONArray)));
        while (verifyorientationstatuslambda1.hasNext()) {
            if (i2 < 0) {
                SQLite.serializer();
                throw null;
            }
            arrayList.add(new MessageButton((JSONObject) verifyorientationstatuslambda1.next(), jSONArray.optJSONObject(i2)));
            i2++;
        }
        setMessageButtons(arrayList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.putOpt(HEADER, getHeader());
            jSONObjectForJsonPut.put(HEADER_TEXT_COLOR, getHeaderTextColor());
            jSONObjectForJsonPut.put(CLOSE_BUTTON_COLOR, getCloseButtonColor());
            jSONObjectForJsonPut.putOpt(IMAGE_STYLE, getImageStyle().toString());
            jSONObjectForJsonPut.putOpt(HEADER_TEXT_ALIGN, getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                jSONObjectForJsonPut.put(FRAME_COLOR, frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().forJsonPut());
            }
            jSONObjectForJsonPut.put(BUTTONS, jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    public InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = instance_delegatelambda0.write;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, i9 i9Var, String str, int i, int i2, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, i9Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = instance_delegatelambda0.write;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i);
        setCloseButtonColor(i2);
        if (jSONObject.has(FRAME_COLOR)) {
            setFrameColor(Integer.valueOf(jSONObject.optInt(FRAME_COLOR)));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
