package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ComposableSingletonsAndroidDialog_androidKt;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Trigger {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ Trigger[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;

    @getAppropriateFullView(serializer = "button_click")
    public static final Trigger BUTTON_CLICK = new Trigger("BUTTON_CLICK", 0);

    @getAppropriateFullView(serializer = "dialog_decline_button_click")
    public static final Trigger DIALOG_DECLINE_BUTTON_CLICK = new Trigger("DIALOG_DECLINE_BUTTON_CLICK", 1);

    @getAppropriateFullView(serializer = "dialog_accept_button_click")
    public static final Trigger DIALOG_ACCEPT_BUTTON_CLICK = new Trigger("DIALOG_ACCEPT_BUTTON_CLICK", 2);

    @getAppropriateFullView(serializer = "dialog_button_click")
    public static final Trigger DIALOG_BUTTON_CLICK = new Trigger("DIALOG_BUTTON_CLICK", 3);

    @getAppropriateFullView(serializer = "screen_opened")
    public static final Trigger SCREEN_OPENED = new Trigger("SCREEN_OPENED", 4);

    @getAppropriateFullView(serializer = "dispatch_mode_click")
    public static final Trigger DISPATCH_MODE_CLICK = new Trigger("DISPATCH_MODE_CLICK", 5);

    @getAppropriateFullView(serializer = "dispatch_mode_cancel")
    public static final Trigger DISPATCH_MODE_CANCEL = new Trigger("DISPATCH_MODE_CANCEL", 6);

    @getAppropriateFullView(serializer = "dispatch_mode_open")
    public static final Trigger DISPATCH_MODE_OPEN = new Trigger("DISPATCH_MODE_OPEN", 7);

    @getAppropriateFullView(serializer = "dispatch_mode_submit")
    public static final Trigger DISPATCH_MODE_SUBMIT = new Trigger("DISPATCH_MODE_SUBMIT", 8);

    @getAppropriateFullView(serializer = "deliveries_dropoff_ready")
    public static final Trigger DELIVERY_DROPOFF_READY = new Trigger("DELIVERY_DROPOFF_READY", 9);

    @getAppropriateFullView(serializer = "deliveries_dropoff_task_success")
    public static final Trigger DELIVERY_DROPOFF_TASK_SUCCESS = new Trigger("DELIVERY_DROPOFF_TASK_SUCCESS", 10);

    @getAppropriateFullView(serializer = "swipe_button_failed_attempt")
    public static final Trigger SWIPE_BUTTON_FAILED_ATTEMPT = new Trigger("SWIPE_BUTTON_FAILED_ATTEMPT", 11);

    @getAppropriateFullView(serializer = "auto_accept_toggle")
    public static final Trigger AUTO_ACCEPT_TOGGLE = new Trigger("AUTO_ACCEPT_TOGGLE", 12);

    @getAppropriateFullView(serializer = "back_to_back_popup_appear")
    public static final Trigger BACK_TO_BACK_POPUP_APPEAR = new Trigger("BACK_TO_BACK_POPUP_APPEAR", 13);

    @getAppropriateFullView(serializer = "back_to_back_popup_click")
    public static final Trigger BACK_TO_BACK_POPUP_CLICK = new Trigger("BACK_TO_BACK_POPUP_CLICK", 14);

    @getAppropriateFullView(serializer = "back_to_back_popup_dismiss")
    public static final Trigger BACK_TO_BACK_POPUP_DISMISS = new Trigger("BACK_TO_BACK_POPUP_DISMISS", 15);

    @getAppropriateFullView(serializer = "back_to_back_icon_click")
    public static final Trigger BACK_TO_BACK_ICON_CLICK = new Trigger("BACK_TO_BACK_ICON_CLICK", 16);

    @getAppropriateFullView(serializer = "task_success")
    public static final Trigger TASK_SUCCESS = new Trigger("TASK_SUCCESS", 17);

    @getAppropriateFullView(serializer = "deliveries_task_click")
    public static final Trigger DELIVERIES_TASK_CLICK = new Trigger("DELIVERIES_TASK_CLICK", 18);

    @getAppropriateFullView(serializer = "deliveries_task_ready")
    public static final Trigger DELIVERIES_TASK_READY = new Trigger("DELIVERIES_TASK_READY", 19);

    @getAppropriateFullView(serializer = "deliveries_task_success")
    public static final Trigger DELIVERIES_TASK_SUCCESS = new Trigger("DELIVERIES_TASK_SUCCESS", 20);

    @getAppropriateFullView(serializer = "deliveries_task_error")
    public static final Trigger DELIVERIES_TASK_ERROR = new Trigger("DELIVERIES_TASK_ERROR", 21);

    @getAppropriateFullView(serializer = "edit_button_click")
    public static final Trigger LAST_STOP_EDIT_BUTTON_CLICK = new Trigger("LAST_STOP_EDIT_BUTTON_CLICK", 22);

    @getAppropriateFullView(serializer = "remove_button_click")
    public static final Trigger LAST_STOP_REMOVE_BUTTON_CLICK = new Trigger("LAST_STOP_REMOVE_BUTTON_CLICK", 23);

    @getAppropriateFullView(serializer = "map_pin_change")
    public static final Trigger LAST_STOP_MAP_PIN_CHANGE = new Trigger("LAST_STOP_MAP_PIN_CHANGE", 24);

    @getAppropriateFullView(serializer = "select_recent_location")
    public static final Trigger LAST_STOP_SELECT_RECENT_LOCATION = new Trigger("LAST_STOP_SELECT_RECENT_LOCATION", 25);

    @getAppropriateFullView(serializer = "geocoding_failure")
    public static final Trigger LAST_STOP_GEOCODING_FAILURE = new Trigger("LAST_STOP_GEOCODING_FAILURE", 26);

    @getAppropriateFullView(serializer = "expanded_bubble_presentation")
    public static final Trigger EXPANDED_BUBBLE_PRESENTATION = new Trigger("EXPANDED_BUBBLE_PRESENTATION", 27);

    @getAppropriateFullView(serializer = "pin_offline_success")
    public static final Trigger PIN_OFFLINE_SUCCESS = new Trigger("PIN_OFFLINE_SUCCESS", 28);

    @getAppropriateFullView(serializer = "pin_offline_failure")
    public static final Trigger PIN_OFFLINE_FAILURE = new Trigger("PIN_OFFLINE_FAILURE", 29);

    @getAppropriateFullView(serializer = SystemUtils.UNKNOWN)
    public static final Trigger UNKNOWN = new Trigger(GrsBaseInfo.CountryCodeSource.UNKNOWN, 30);

    private Trigger(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return onviewdetachedfromwindowlambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 81 / 0;
        return $ENTRIES;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$2ZNmgWL4pjk_u18cARfqWrhs3Ec() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    static {
        Trigger[] triggerArr$values = $values();
        $VALUES = triggerArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) triggerArr$values);
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(0));
        int i = serializer + 61;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static Trigger valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }
        throw null;
    }

    public static Trigger[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Trigger[] triggerArr = (Trigger[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return triggerArr;
        }
        throw null;
    }

    public static final class Companion {
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 87;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) Trigger.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
            int i4 = read + 121;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }

        public static Trigger write(String str) {
            Object next;
            int i = 2 % 2;
            Iterator<E> it = Trigger.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i2 = read + 83;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    next = it.next();
                    int i3 = 7 / 0;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Trigger) next).getSerialName(), str}, getCieXyz.write())).booleanValue()) {
                        int i4 = write + 65;
                        read = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        break;
                    }
                } else {
                    next = it.next();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Trigger) next).getSerialName(), str}, getCieXyz.write())).booleanValue()) {
                        int i6 = write + 65;
                        read = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        break;
                    }
                }
            }
            Trigger trigger = (Trigger) next;
            return trigger == null ? Trigger.UNKNOWN : trigger;
        }
    }

    public final String getSerialName() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAppropriateFullView getappropriatefullview = (getAppropriateFullView) Trigger.class.getField(name()).getAnnotation(getAppropriateFullView.class);
        if (getappropriatefullview != null) {
            String strSerializer = getappropriatefullview.serializer();
            if (strSerializer != null) {
                return strSerializer;
            }
            int i4 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return SystemUtils.UNKNOWN;
    }

    private static final /* synthetic */ Trigger[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 17;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Trigger[] triggerArr = {BUTTON_CLICK, DIALOG_DECLINE_BUTTON_CLICK, DIALOG_ACCEPT_BUTTON_CLICK, DIALOG_BUTTON_CLICK, SCREEN_OPENED, DISPATCH_MODE_CLICK, DISPATCH_MODE_CANCEL, DISPATCH_MODE_OPEN, DISPATCH_MODE_SUBMIT, DELIVERY_DROPOFF_READY, DELIVERY_DROPOFF_TASK_SUCCESS, SWIPE_BUTTON_FAILED_ATTEMPT, AUTO_ACCEPT_TOGGLE, BACK_TO_BACK_POPUP_APPEAR, BACK_TO_BACK_POPUP_CLICK, BACK_TO_BACK_POPUP_DISMISS, BACK_TO_BACK_ICON_CLICK, TASK_SUCCESS, DELIVERIES_TASK_CLICK, DELIVERIES_TASK_READY, DELIVERIES_TASK_SUCCESS, DELIVERIES_TASK_ERROR, LAST_STOP_EDIT_BUTTON_CLICK, LAST_STOP_REMOVE_BUTTON_CLICK, LAST_STOP_MAP_PIN_CHANGE, LAST_STOP_SELECT_RECENT_LOCATION, LAST_STOP_GEOCODING_FAILURE, EXPANDED_BUBBLE_PRESENTATION, PIN_OFFLINE_SUCCESS, PIN_OFFLINE_FAILURE, UNKNOWN};
        int i5 = i2 + 115;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return triggerArr;
        }
        throw null;
    }

    private static final /* synthetic */ setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EnumSerializer enumSerializerSerializer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer("com.roadrunner.delivery.state.Trigger", values(), new String[]{"button_click", "dialog_decline_button_click", "dialog_accept_button_click", "dialog_button_click", "screen_opened", "dispatch_mode_click", "dispatch_mode_cancel", "dispatch_mode_open", "dispatch_mode_submit", "deliveries_dropoff_ready", "deliveries_dropoff_task_success", "swipe_button_failed_attempt", "auto_accept_toggle", "back_to_back_popup_appear", "back_to_back_popup_click", "back_to_back_popup_dismiss", "back_to_back_icon_click", "task_success", "deliveries_task_click", "deliveries_task_ready", "deliveries_task_success", "deliveries_task_error", "edit_button_click", "remove_button_click", "map_pin_change", "select_recent_location", "geocoding_failure", "expanded_bubble_presentation", "pin_offline_success", "pin_offline_failure", SystemUtils.UNKNOWN}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
        int i4 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return enumSerializerSerializer;
        }
        throw null;
    }
}
