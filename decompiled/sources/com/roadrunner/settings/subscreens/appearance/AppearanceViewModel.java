package com.roadrunner.settings.subscreens.appearance;

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
import androidx.lifecycle.ViewModel;
import androidx.sqlite.SQLite;
import com.logistics.rider.glovo.R;
import com.roadrunner.login.logging.OtpLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ConstraintReferenceIncorrectConstraintException;
import o.getQueryContext;
import o.r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg;
import o.r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY;
import o.setFirstHorizontalBias;
import o.setFirstVerticalBias;
import o.setFirstVerticalStyle;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class AppearanceViewModel extends ViewModel {
    public final MutableStateFlow IconCompatParcelizer;
    public final setFirstHorizontalBias RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final getQueryContext serializer;
    public final OtpLogger write;

    public AppearanceViewModel(setTransactionSuccessful settransactionsuccessful, setFirstVerticalBias setfirstverticalbias, setFirstHorizontalBias setfirsthorizontalbias, getQueryContext getquerycontext, OtpLogger otpLogger) {
        settransactionsuccessful.getClass();
        setfirstverticalbias.getClass();
        setfirsthorizontalbias.getClass();
        getquerycontext.getClass();
        otpLogger.getClass();
        this.RemoteActionCompatParcelizer = setfirsthorizontalbias;
        this.serializer = getquerycontext;
        this.write = otpLogger;
        setFirstVerticalStyle setfirstverticalstyleRemoteActionCompatParcelizer = ((ConstraintReferenceIncorrectConstraintException) setfirstverticalbias).RemoteActionCompatParcelizer();
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.settings_appearance_title);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_appearance_ui_mode_description));
        builder.append(" ");
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
        try {
            builder.append(settransactionsuccessful.IconCompatParcelizer(R.string.settings_appearance_ui_mode_description_incentive));
            builder.pop(iPushStyle);
            MutableStateFlow mutableStateFlow = StateFlowKt.read(new r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY(strIconCompatParcelizer, builder.toAnnotatedString(), setfirstverticalstyleRemoteActionCompatParcelizer, SQLite.read(new r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg(setFirstVerticalStyle.LIGHT, settransactionsuccessful.IconCompatParcelizer(R.string.settings_appearance_ui_mode_light)), new r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg(setFirstVerticalStyle.DARK, settransactionsuccessful.IconCompatParcelizer(R.string.settings_appearance_ui_mode_dark)), new r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg(setFirstVerticalStyle.SYSTEM, settransactionsuccessful.IconCompatParcelizer(R.string.settings_appearance_ui_mode_system)))));
            this.IconCompatParcelizer = mutableStateFlow;
            this.read = mutableStateFlow;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }
}
