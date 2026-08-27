package o;

import com.roadrunner.delivery.state.pudo.TagIconTokenV1;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class invokeGetDesignInfo {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    static {
        int[] iArr = new int[TagIconTokenV1.values().length];
        try {
            iArr[TagIconTokenV1.TimeIcon.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TagIconTokenV1.BagIcon.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TagIconTokenV1.OpenInFullDefault.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TagIconTokenV1.SplitOrderIcon.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TagIconTokenV1.CallOrChatIcon.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TagIconTokenV1.ChangeNeededIcon.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TagIconTokenV1.ChatIcon.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TagIconTokenV1.DoorIcon.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TagIconTokenV1.HalalOrderIcon.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TagIconTokenV1.HangOrderIcon.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TagIconTokenV1.LeaveAtLobbyIcon.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TagIconTokenV1.MeetAtLobbyIcon.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TagIconTokenV1.NonHalalOrderIcon.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[TagIconTokenV1.NotificationIcon.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[TagIconTokenV1.OutsideIcon.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[TagIconTokenV1.PelicanOrderIcon.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[TagIconTokenV1.PhoneIcon.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[TagIconTokenV1.ReceptionIcon.ordinal()] = 18;
            int i = write + 121;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[TagIconTokenV1.RingDoorbellIcon.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[TagIconTokenV1.SpecifiedLocationIcon.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[TagIconTokenV1.SyncIcon.ordinal()] = 21;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[TagIconTokenV1.LogoutIcon.ordinal()] = 22;
            int i5 = write + 17;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[TagIconTokenV1.FileNoteIcon.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[TagIconTokenV1.PhoneNoCallingIcon.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[TagIconTokenV1.StackedOrderIcon.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[TagIconTokenV1.PhoneDefaultIcon.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[TagIconTokenV1.RefreshDefaultIcon.ordinal()] = 27;
            int i7 = write + 29;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[TagIconTokenV1.QrCodeIcon.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[TagIconTokenV1.WrongCircleIcon.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[TagIconTokenV1.CheckCircleFilledIcon.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[TagIconTokenV1.QrPaymentQrPhIcon.ordinal()] = 31;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[TagIconTokenV1.QrPaymentDuitNowIcon.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[TagIconTokenV1.Unknown.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        IconCompatParcelizer = iArr;
    }
}
