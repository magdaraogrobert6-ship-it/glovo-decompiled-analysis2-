package com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import o.AndroidPrefetchScheduler;
import o.IndentationFixSpan_androidKtWhenMappings;
import o.LineHeightSpan;
import o.chooseHeight;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHeightPx;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.updatePaint;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PayAtPickupContentKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:30:0x008a A[PHI: r3
  0x008a: PHI (r3v8 androidx.compose.ui.Modifier$Companion) = (r3v7 androidx.compose.ui.Modifier$Companion), (r3v14 androidx.compose.ui.Modifier$Companion) binds: [B:29:0x0088, B:26:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[PHI: r3 r5
  0x0095: PHI (r3v9 androidx.compose.ui.Modifier$Companion) = (r3v7 androidx.compose.ui.Modifier$Companion), (r3v14 androidx.compose.ui.Modifier$Companion) binds: [B:29:0x0088, B:26:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x0095: PHI (r5v6 o.IndentationFixSpan_androidKtWhenMappings) = (r5v5 o.IndentationFixSpan_androidKtWhenMappings), (r5v12 o.IndentationFixSpan_androidKtWhenMappings) binds: [B:29:0x0088, B:26:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    public static final void PayAtPickupContent(getHeightPx getheightpx, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier.Companion companion;
        IndentationFixSpan_androidKtWhenMappings indentationFixSpan_androidKtWhenMappings;
        Modifier modifier2;
        Object objComponentActivity;
        int i3;
        int i4 = 2 % 2;
        getheightpx.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(431450845);
        if ((i & 6) == 0) {
            if (getpostalcode.read(getheightpx)) {
                int i5 = IconCompatParcelizer + 29;
                write = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        boolean z2 = true;
        if ((i2 & 3) != 2) {
            int i6 = write + 41;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 % 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i8 = IconCompatParcelizer + 119;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                companion = Modifier.Companion;
                indentationFixSpan_androidKtWhenMappings = (IndentationFixSpan_androidKtWhenMappings) ExtrasKt.write(getheightpx.MediaBrowserCompatMediaItem, getpostalcode, 1).getValue();
                if (!(!(indentationFixSpan_androidKtWhenMappings instanceof updatePaint))) {
                    getpostalcode.serializer(-1484792992);
                    getpostalcode.IconCompatParcelizer(false);
                    modifier2 = companion;
                } else {
                    modifier2 = companion;
                    if (indentationFixSpan_androidKtWhenMappings instanceof LineHeightSpan) {
                        getpostalcode.serializer(-1987556645);
                        PayAtPickupKt.PayAtPickup((LineHeightSpan) indentationFixSpan_androidKtWhenMappings, null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (indentationFixSpan_androidKtWhenMappings instanceof chooseHeight) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1987562412, false);
                        }
                        getpostalcode.serializer(-1987553862);
                        chooseHeight chooseheight = (chooseHeight) indentationFixSpan_androidKtWhenMappings;
                        if ((i2 & 14) == 4) {
                            int i9 = write + 27;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                        } else {
                            z2 = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$2 = new ReportPictureUseCase$invoke$2(1, getheightpx, getHeightPx.class, "onPaymentToggle", "onPaymentToggle(Ljava/lang/String;)V", 0, 5);
                            getpostalcode.write(reportPictureUseCase$invoke$2);
                            objComponentActivity = reportPictureUseCase$invoke$2;
                        }
                        PayAtPickupWithPaymentOptionsKt.PayAtPickupWithPaymentOptions(chooseheight, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            } else {
                companion = Modifier.Companion;
                indentationFixSpan_androidKtWhenMappings = (IndentationFixSpan_androidKtWhenMappings) ExtrasKt.write(getheightpx.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
                if (indentationFixSpan_androidKtWhenMappings instanceof updatePaint) {
                    getpostalcode.serializer(-1484792992);
                    getpostalcode.IconCompatParcelizer(false);
                    modifier2 = companion;
                } else {
                    modifier2 = companion;
                    if (indentationFixSpan_androidKtWhenMappings instanceof LineHeightSpan) {
                        getpostalcode.serializer(-1987556645);
                        PayAtPickupKt.PayAtPickup((LineHeightSpan) indentationFixSpan_androidKtWhenMappings, null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (indentationFixSpan_androidKtWhenMappings instanceof chooseHeight) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1987562412, false);
                        }
                        getpostalcode.serializer(-1987553862);
                        chooseHeight chooseheight2 = (chooseHeight) indentationFixSpan_androidKtWhenMappings;
                        if ((i2 & 14) == 4) {
                            int i11 = write + 27;
                            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                        } else {
                            z2 = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z2) {
                            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$3 = new ReportPictureUseCase$invoke$2(1, getheightpx, getHeightPx.class, "onPaymentToggle", "onPaymentToggle(Ljava/lang/String;)V", 0, 5);
                            getpostalcode.write(reportPictureUseCase$invoke$3);
                            objComponentActivity = reportPictureUseCase$invoke$3;
                        } else {
                            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$4 = new ReportPictureUseCase$invoke$2(1, getheightpx, getHeightPx.class, "onPaymentToggle", "onPaymentToggle(Ljava/lang/String;)V", 0, 5);
                            getpostalcode.write(reportPictureUseCase$invoke$4);
                            objComponentActivity = reportPictureUseCase$invoke$4;
                        }
                        PayAtPickupWithPaymentOptionsKt.PayAtPickupWithPaymentOptions(chooseheight2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(getheightpx, modifier2, i, 27);
        }
    }
}
