package com.roadrunner.diagnostics.presentation.view;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.data.error.ApiException;
import com.logistics.rider.glovo.R;
import io.socket.emitter.Emitter;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.addID;
import o.getMaxHeight;
import o.getSharedValues;
import o.setReferencedIds;
import o.setTransactionSuccessful;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DiagnosticsUiStateMapper {
    private static int read = 1;
    private static int write;
    public final setTransactionSuccessful IconCompatParcelizer;

    public DiagnosticsUiStateMapper(setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        this.IconCompatParcelizer = settransactionsuccessful;
    }

    public final AnnotatedString getPermissionExplanationText() {
        int i = 2 % 2;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        setTransactionSuccessful settransactionsuccessful = this.IconCompatParcelizer;
        builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_app_permission_failure_description_sentence_one));
        builder.append(" ");
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
        try {
            builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_app_permission_failure_description_sentence_two));
            builder.pop(iPushStyle);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            int i2 = read + 61;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 59 / 0;
            }
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    public final AnnotatedString getTestNotificationExplanationText(Throwable th) {
        int i = 2 % 2;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        setTransactionSuccessful settransactionsuccessful = this.IconCompatParcelizer;
        builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_test_notification_try_reinstall_text_sentence_one));
        builder.append(" ");
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
        try {
            builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_test_notification_try_reinstall_text_sentence_two));
            builder.pop(iPushStyle);
            AnnotatedString annotatedStringMapError = mapError(th, builder.toAnnotatedString());
            int i2 = write + 103;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return annotatedStringMapError;
        } catch (Throwable th2) {
            builder.pop(iPushStyle);
            throw th2;
        }
    }

    public final getMaxHeight serializer(getMaxHeight getmaxheight) {
        int i = 2 % 2;
        boolean z = getmaxheight.RemoteActionCompatParcelizer instanceof setReferencedIds;
        setTransactionSuccessful settransactionsuccessful = this.IconCompatParcelizer;
        if (!z) {
            int i2 = read + 13;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!(getmaxheight.serializer instanceof setReferencedIds)) {
                int i4 = read + 9;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Emitter emitter = getmaxheight.IconCompatParcelizer;
                if (!(emitter instanceof setReferencedIds)) {
                    if (!(emitter instanceof getSharedValues)) {
                        return getMaxHeight.read(getmaxheight, settransactionsuccessful.IconCompatParcelizer(R.string.notifications_diagnostics_title), null, null, null, null, 28);
                    }
                    int i6 = write + 91;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return getMaxHeight.read(getmaxheight, settransactionsuccessful.read(R.string.settings_notifications_diagnostics_succeed_title, "🎉"), settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_succeed_description), null, null, null, 28);
                    }
                    Object[] objArr = new Object[1];
                    objArr[1] = "🎉";
                    return getMaxHeight.read(getmaxheight, settransactionsuccessful.read(R.string.settings_notifications_diagnostics_succeed_title, objArr), settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_succeed_description), null, null, null, 52);
                }
            }
        }
        return getMaxHeight.read(getmaxheight, settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_failed_title).concat("❗"), settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_failed_description), null, null, null, 28);
    }

    public final AnnotatedString getDeviceTokenExplanationText(addID addid, Throwable th) {
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        addID addid2 = addID.CORRUPT;
        setTransactionSuccessful settransactionsuccessful = this.IconCompatParcelizer;
        Object obj = null;
        if (addid != addid2) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_device_confirmation_try_again_text));
            return mapError(th, builder.toAnnotatedString());
        }
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        builder2.append(settransactionsuccessful.IconCompatParcelizer(R.string.notifications_diagnostics_token_registration_corrupt_token));
        builder2.append(" ");
        int iPushStyle = builder2.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
        try {
            builder2.append(settransactionsuccessful.IconCompatParcelizer(R.string.notifications_diagnostics_token_registration_corrupt_token_fix));
            builder2.pop(iPushStyle);
            AnnotatedString annotatedString = builder2.toAnnotatedString();
            int i4 = write + 105;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return annotatedString;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            builder2.pop(iPushStyle);
            throw th2;
        }
    }

    public final AnnotatedString mapError(Throwable th, AnnotatedString annotatedString) {
        int i = 2 % 2;
        boolean z = th instanceof IOException;
        setTransactionSuccessful settransactionsuccessful = this.IconCompatParcelizer;
        Object obj = null;
        if (z) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Connection error", new Object[0]);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_no_internet_sentence_one));
            builder.append(" ");
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_notifications_diagnostics_no_internet_sentence_two));
                builder.pop(iPushStyle);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                int i2 = read + 5;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return annotatedString2;
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        }
        if (!(!(th instanceof ApiException))) {
            int i4 = write + 69;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (((ApiException) th).RemoteActionCompatParcelizer() >= 400) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Server error", new Object[0]);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                builder2.append(settransactionsuccessful.IconCompatParcelizer(R.string.notifications_diagnostics_server_issue));
                AnnotatedString annotatedString3 = builder2.toAnnotatedString();
                int i6 = write + 59;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return annotatedString3;
                }
                obj.hashCode();
                throw null;
            }
        }
        return annotatedString;
    }
}
