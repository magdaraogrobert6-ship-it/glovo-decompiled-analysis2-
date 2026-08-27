package com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.sentiance.core.model.events.N$b;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidContentCaptureManager;
import o.GraphemeClusterSegmentFinderApi29;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SwitchDefaults;
import o.TextPainterKt;
import o.buildMapping;
import o.drawPatch;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getFile;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPlatformAndroidManager;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.onHideTranslationui;
import o.performMeasureDjhGOtQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.toAndroidVertexModeJOOmi9M;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OverlayBodyKt {
    private static int read = 1;
    private static int write;

    public static final void OverlayBody(getPlatformAndroidManager getplatformandroidmanager, getPlatformAndroidManager getplatformandroidmanager2, N$b n$b, TextPainterKt textPainterKt, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getplatformandroidmanager.getClass();
        getplatformandroidmanager2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(800660348);
        if ((i & 6) == 0) {
            int i5 = write + 19;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (!getpostalcode.read(getplatformandroidmanager) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(getplatformandroidmanager2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(n$b) ? Fields.RotationX : Fields.SpotShadowColor;
            int i7 = read + 17;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(textPainterKt)) {
                int i9 = read + 117;
                write = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 28232 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i10 = i2 | 24576;
        if (getpostalcode.write(i10 & 1, (i10 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i11 = write + 99;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                objComponentActivity = drawPatch.read;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getFile.read;
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = GraphemeClusterSegmentFinderApi29.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write((StateFlow) n$b.IconCompatParcelizer, getpostalcode, 0);
            float f = Dimensions.generateLayoutParams;
            SwitchDefaults switchDefaults = new SwitchDefaults(f, f, f, Dp.m3673constructorimpl(((onHideTranslationui) getplatformandroidmanager2).serializer()));
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(companion.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            boolean z2 = getpostalcode.read(populateViewStructure_androidKtpopulate7Write);
            if ((i10 & 14) == 4) {
                int i13 = read + 107;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((z2 | z) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new toAndroidVertexModeJOOmi9M(getplatformandroidmanager, populateViewStructure_androidKtpopulate7Write, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, 6);
                getpostalcode.write(objComponentActivity4);
            }
            LazyDslKt.LazyColumn(modifierM20backgroundbw27NRU, null, switchDefaults, null, null, null, false, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 0, 506);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) getplatformandroidmanager, (Object) getplatformandroidmanager2, (Object) n$b, (Object) textPainterKt, modifier2, i, 9);
        }
    }
}
