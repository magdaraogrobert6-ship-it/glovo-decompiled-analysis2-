package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Locale;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class bga implements PG {
    public final B60 BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final sjz mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[Catch: all -> 0x011c, TryCatch #1 {all -> 0x011c, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0016, B:11:0x002c, B:15:0x0039, B:17:0x004c, B:19:0x0054, B:21:0x006e, B:23:0x0077, B:25:0x00bb, B:27:0x00c3, B:29:0x00ef, B:31:0x00fa, B:9:0x0020), top: B:39:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e A[Catch: all -> 0x011c, TryCatch #1 {all -> 0x011c, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0016, B:11:0x002c, B:15:0x0039, B:17:0x004c, B:19:0x0054, B:21:0x006e, B:23:0x0077, B:25:0x00bb, B:27:0x00c3, B:29:0x00ef, B:31:0x00fa, B:9:0x0020), top: B:39:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb A[Catch: all -> 0x011c, TryCatch #1 {all -> 0x011c, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0016, B:11:0x002c, B:15:0x0039, B:17:0x004c, B:19:0x0054, B:21:0x006e, B:23:0x0077, B:25:0x00bb, B:27:0x00c3, B:29:0x00ef, B:31:0x00fa, B:9:0x0020), top: B:39:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ef A[Catch: all -> 0x011c, TryCatch #1 {all -> 0x011c, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0016, B:11:0x002c, B:15:0x0039, B:17:0x004c, B:19:0x0054, B:21:0x006e, B:23:0x0077, B:25:0x00bb, B:27:0x00c3, B:29:0x00ef, B:31:0x00fa, B:9:0x0020), top: B:39:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        String strValueOf;
        String str;
        String language;
        B60 b60;
        XUh xUh;
        String strMbG;
        B60 b61;
        String strHQ;
        B60 b62;
        String strHQ2;
        B60 b63;
        String strBGx;
        try {
            XUh xUh2 = XUh.BGx;
            try {
                if (XUh.BGx(xUh2, 0, 31, 1)) {
                    B60 b64 = this.BGx;
                    if (XUh.BGx(xUh2, 0, 31, 1)) {
                        strValueOf = b64.BGx("data_roaming");
                    } else {
                        str = null;
                    }
                    language = Locale.getDefault().getLanguage();
                    Integer numBGx = this.BGx.BGx();
                    b60 = this.BGx;
                    xUh = XUh.BGx;
                    if (XUh.BGx(xUh, 21, 0, 2)) {
                        strMbG = b60.mbG("accessibility_display_inversion_enabled");
                    } else {
                        strMbG = null;
                    }
                    String strHQ3 = this.BGx.HQ("screen_brightness");
                    String strHQ4 = this.BGx.HQ("screen_brightness_mode");
                    b61 = this.BGx;
                    if (XUh.BGx(xUh, 23, 0, 2)) {
                        strHQ = b61.HQ("dtmf_tone_type");
                    } else {
                        strHQ = null;
                    }
                    String strHQ5 = this.BGx.HQ("dtmf_tone");
                    String strHQ6 = this.BGx.HQ("sound_effects_enabled");
                    String strHQ7 = this.BGx.HQ("user_rotation");
                    String strHQ8 = this.BGx.HQ("time_12_24");
                    String strHQ9 = this.BGx.HQ("font_scale");
                    String strHQ10 = this.BGx.HQ("end_button_behavior");
                    String strHQ11 = this.BGx.HQ("vibrate_on");
                    b62 = this.BGx;
                    if (XUh.BGx(xUh, 23, 0, 2)) {
                        strHQ2 = b62.HQ("vibrate_when_ringing");
                    } else {
                        strHQ2 = null;
                    }
                    String strBGx2 = this.BGx.BGx("device_provisioned");
                    String strBGx3 = this.BGx.BGx("http_proxy");
                    String strBGx4 = this.BGx.BGx("auto_time");
                    String strBGx5 = this.BGx.BGx("airplane_mode_radios");
                    b63 = this.BGx;
                    if (XUh.BGx(xUh, 0, 29, 1)) {
                        strBGx = b63.BGx("wifi_sleep_policy");
                    } else {
                        strBGx = null;
                    }
                    isitemdismissable = new RJ((String) W4i.A3.MediaSessionCompatResultReceiverWrapper(), new yVB(language, numBGx, strMbG, strHQ3, strHQ4, strHQ, strHQ5, strHQ6, strHQ7, strHQ8, strHQ9, strHQ10, strHQ11, strHQ2, strBGx2, strBGx3, strBGx4, strBGx5, str, strBGx));
                    Bq.BGx(isitemdismissable, ltx);
                }
                strValueOf = String.valueOf(this.mbG.hs());
                language = Locale.getDefault().getLanguage();
            } catch (Throwable unused) {
                language = null;
            }
            str = strValueOf;
            Integer numBGx2 = this.BGx.BGx();
            b60 = this.BGx;
            xUh = XUh.BGx;
            if (XUh.BGx(xUh, 21, 0, 2)) {
                strMbG = b60.mbG("accessibility_display_inversion_enabled");
            } else {
                strMbG = null;
            }
            String strHQ12 = this.BGx.HQ("screen_brightness");
            String strHQ13 = this.BGx.HQ("screen_brightness_mode");
            b61 = this.BGx;
            if (XUh.BGx(xUh, 23, 0, 2)) {
                strHQ = b61.HQ("dtmf_tone_type");
            } else {
                strHQ = null;
            }
            String strHQ14 = this.BGx.HQ("dtmf_tone");
            String strHQ15 = this.BGx.HQ("sound_effects_enabled");
            String strHQ16 = this.BGx.HQ("user_rotation");
            String strHQ17 = this.BGx.HQ("time_12_24");
            String strHQ18 = this.BGx.HQ("font_scale");
            String strHQ19 = this.BGx.HQ("end_button_behavior");
            String strHQ110 = this.BGx.HQ("vibrate_on");
            b62 = this.BGx;
            if (XUh.BGx(xUh, 23, 0, 2)) {
                strHQ2 = b62.HQ("vibrate_when_ringing");
            } else {
                strHQ2 = null;
            }
            String strBGx6 = this.BGx.BGx("device_provisioned");
            String strBGx7 = this.BGx.BGx("http_proxy");
            String strBGx8 = this.BGx.BGx("auto_time");
            String strBGx9 = this.BGx.BGx("airplane_mode_radios");
            b63 = this.BGx;
            if (XUh.BGx(xUh, 0, 29, 1)) {
                strBGx = b63.BGx("wifi_sleep_policy");
            } else {
                strBGx = null;
            }
            isitemdismissable = new RJ((String) W4i.A3.MediaSessionCompatResultReceiverWrapper(), new yVB(language, numBGx2, strMbG, strHQ12, strHQ13, strHQ, strHQ14, strHQ15, strHQ16, strHQ17, strHQ18, strHQ19, strHQ110, strHQ2, strBGx6, strBGx7, strBGx8, strBGx9, str, strBGx));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public bga(zQE zqe, B60 b60, sjz sjzVar) {
        this.BGx = b60;
        this.mbG = sjzVar;
        Object[] objArr = {hO.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
