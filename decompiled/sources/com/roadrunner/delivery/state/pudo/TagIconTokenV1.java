package com.roadrunner.delivery.state.pudo;

import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.ComposableSingletonsAndroidDialog_androidKtlambda2101488961;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.setGraphicModalMaxWidthDp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TagIconTokenV1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ TagIconTokenV1[] $VALUES;
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
    public static final Companion Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String token;
    public static final TagIconTokenV1 TimeIcon = new TagIconTokenV1("TimeIcon", 0, "essentials.time_circle");
    public static final TagIconTokenV1 BagIcon = new TagIconTokenV1("BagIcon", 1, "essentials.shopping_bag_check");
    public static final TagIconTokenV1 OpenInFullDefault = new TagIconTokenV1("OpenInFullDefault", 2, "openInFull.default");
    public static final TagIconTokenV1 SplitOrderIcon = new TagIconTokenV1("SplitOrderIcon", 3, "instructions.split_order");
    public static final TagIconTokenV1 CallOrChatIcon = new TagIconTokenV1("CallOrChatIcon", 4, "instructions.call_or_chat");
    public static final TagIconTokenV1 ChangeNeededIcon = new TagIconTokenV1("ChangeNeededIcon", 5, "instructions.change_needed");
    public static final TagIconTokenV1 ChatIcon = new TagIconTokenV1("ChatIcon", 6, "instructions.chat");
    public static final TagIconTokenV1 DoorIcon = new TagIconTokenV1("DoorIcon", 7, "instructions.door");
    public static final TagIconTokenV1 HalalOrderIcon = new TagIconTokenV1("HalalOrderIcon", 8, "instructions.halal_order");
    public static final TagIconTokenV1 HangOrderIcon = new TagIconTokenV1("HangOrderIcon", 9, "instructions.hang_order");
    public static final TagIconTokenV1 LeaveAtLobbyIcon = new TagIconTokenV1("LeaveAtLobbyIcon", 10, "instructions.leave_at_lobby");
    public static final TagIconTokenV1 MeetAtLobbyIcon = new TagIconTokenV1("MeetAtLobbyIcon", 11, "instructions.meet_at_lobby");
    public static final TagIconTokenV1 NonHalalOrderIcon = new TagIconTokenV1("NonHalalOrderIcon", 12, "instructions.non_halal_order");
    public static final TagIconTokenV1 NotificationIcon = new TagIconTokenV1("NotificationIcon", 13, "instructions.notification");
    public static final TagIconTokenV1 OutsideIcon = new TagIconTokenV1("OutsideIcon", 14, "instructions.outside");
    public static final TagIconTokenV1 PelicanOrderIcon = new TagIconTokenV1("PelicanOrderIcon", 15, "instructions.pelican_order");
    public static final TagIconTokenV1 PhoneIcon = new TagIconTokenV1("PhoneIcon", 16, "instructions.phone");
    public static final TagIconTokenV1 ReceptionIcon = new TagIconTokenV1("ReceptionIcon", 17, "instructions.reception");
    public static final TagIconTokenV1 RingDoorbellIcon = new TagIconTokenV1("RingDoorbellIcon", 18, "instructions.ring_doorbell");
    public static final TagIconTokenV1 SpecifiedLocationIcon = new TagIconTokenV1("SpecifiedLocationIcon", 19, "instructions.specified_location");
    public static final TagIconTokenV1 SyncIcon = new TagIconTokenV1("SyncIcon", 20, "instructions.sync");
    public static final TagIconTokenV1 LogoutIcon = new TagIconTokenV1("LogoutIcon", 21, "logout.logout");
    public static final TagIconTokenV1 FileNoteIcon = new TagIconTokenV1("FileNoteIcon", 22, "file.note");
    public static final TagIconTokenV1 PhoneNoCallingIcon = new TagIconTokenV1("PhoneNoCallingIcon", 23, "instructions.phone_no_calling");
    public static final TagIconTokenV1 StackedOrderIcon = new TagIconTokenV1("StackedOrderIcon", 24, "instructions.stacked_order");
    public static final TagIconTokenV1 PhoneDefaultIcon = new TagIconTokenV1("PhoneDefaultIcon", 25, "phone.default");
    public static final TagIconTokenV1 RefreshDefaultIcon = new TagIconTokenV1("RefreshDefaultIcon", 26, "refresh.default");
    public static final TagIconTokenV1 QrCodeIcon = new TagIconTokenV1("QrCodeIcon", 27, "qr-code");
    public static final TagIconTokenV1 WrongCircleIcon = new TagIconTokenV1("WrongCircleIcon", 28, "x-circle");
    public static final TagIconTokenV1 CheckCircleFilledIcon = new TagIconTokenV1("CheckCircleFilledIcon", 29, "check-circle-filled");
    public static final TagIconTokenV1 QrPaymentQrPhIcon = new TagIconTokenV1("QrPaymentQrPhIcon", 30, "qrph");
    public static final TagIconTokenV1 QrPaymentDuitNowIcon = new TagIconTokenV1("QrPaymentDuitNowIcon", 31, "duitnow");
    public static final TagIconTokenV1 Unknown = new TagIconTokenV1("Unknown", 32, "");

    public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
        int i = 2 % 2;
        int i2 = write + 1;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = $cachedSerializer$delegate;
        int i5 = i3 + 119;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return onviewdetachedfromwindowlambda1;
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 59;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.token;
        int i5 = i3 + 17;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TagIconTokenV1(String str, int i, String str2) {
        super(str, i);
        this.token = str2;
    }

    public static /* synthetic */ setGraphicModalMaxWidthDp $r8$lambda$0JBRLIaHd_RHeK7avFrELzPriBw() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp_init_$_anonymous_;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
            int i3 = 37 / 0;
        } else {
            setgraphicmodalmaxwidthdp_init_$_anonymous_ = _init_$_anonymous_();
        }
        int i4 = IconCompatParcelizer + 13;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdp_init_$_anonymous_;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [com.roadrunner.delivery.state.pudo.TagIconTokenV1$Companion] */
    static {
        TagIconTokenV1[] tagIconTokenV1Arr$values = $values();
        $VALUES = tagIconTokenV1Arr$values;
        $ENTRIES = UtilsKt.read((Enum[]) tagIconTokenV1Arr$values);
        Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.TagIconTokenV1.Companion
            private static int RemoteActionCompatParcelizer = 1;
            private static int write;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 59;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) TagIconTokenV1.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i4 = write + 87;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return setgraphicmodalmaxwidthdp;
            }
        };
        $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(21));
        int i = RemoteActionCompatParcelizer + 33;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static TagIconTokenV1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TagIconTokenV1 tagIconTokenV1 = (TagIconTokenV1) Enum.valueOf(TagIconTokenV1.class, str);
        int i4 = IconCompatParcelizer + 91;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return tagIconTokenV1;
        }
        throw null;
    }

    public static TagIconTokenV1[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TagIconTokenV1[] tagIconTokenV1Arr = (TagIconTokenV1[]) $VALUES.clone();
        int i4 = write + 63;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return tagIconTokenV1Arr;
    }

    private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
        int i = 2 % 2;
        TagIconTokenV1[] tagIconTokenV1ArrValues = values();
        tagIconTokenV1ArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.state.pudo.TagIconTokenV1", (Enum[]) tagIconTokenV1ArrValues);
        int i2 = write + 89;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return enumSerializer;
    }

    private static final /* synthetic */ TagIconTokenV1[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 1;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TagIconTokenV1[] tagIconTokenV1Arr = {TimeIcon, BagIcon, OpenInFullDefault, SplitOrderIcon, CallOrChatIcon, ChangeNeededIcon, ChatIcon, DoorIcon, HalalOrderIcon, HangOrderIcon, LeaveAtLobbyIcon, MeetAtLobbyIcon, NonHalalOrderIcon, NotificationIcon, OutsideIcon, PelicanOrderIcon, PhoneIcon, ReceptionIcon, RingDoorbellIcon, SpecifiedLocationIcon, SyncIcon, LogoutIcon, FileNoteIcon, PhoneNoCallingIcon, StackedOrderIcon, PhoneDefaultIcon, RefreshDefaultIcon, QrCodeIcon, WrongCircleIcon, CheckCircleFilledIcon, QrPaymentQrPhIcon, QrPaymentDuitNowIcon, Unknown};
        int i5 = i2 + 59;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return tagIconTokenV1Arr;
    }
}
