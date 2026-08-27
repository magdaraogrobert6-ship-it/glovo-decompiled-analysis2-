package androidx.navigation.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.google.android.gms.internal.mlkit_vision_face.zzlc;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.base.time.span.TextSpanItem;
import com.mapbox.navigation.ui.base.formatter.ValueFormatter;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import o.accessgetSystemNavigationDowncp;
import o.configureStrokePaintQ_0CZUIdefault;
import o.drawArcillE91I;
import o.drawImage9jGpkUE;
import o.drawImagegbVJVH8;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class NavContext implements drawImagegbVJVH8, ValueFormatter {
    public final Context IconCompatParcelizer;
    public final /* synthetic */ int read;

    public static String absolutePath(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.exists()) {
            LoggerProviderKt.logE("Unable to create a file, it may be the HistoryRecorderOptions " + file.getAbsolutePath(), "HistoryFiles");
            return null;
        }
        LoggerProviderKt.logI("Initial size is " + file.length() + " bytes", "HistoryFiles");
        return file.getAbsolutePath();
    }

    @Override // com.mapbox.navigation.ui.base.formatter.ValueFormatter
    public Object format(Object obj) {
        if (this.read == 12) {
            return format((Calendar) obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        Context context = this.IconCompatParcelizer;
        context.getClass();
        long j = (long) dDoubleValue;
        long j2 = 0;
        if (j < 0) {
            j = 0;
        }
        long j3 = j / ConstantsKt.DEFAULT_PROFILE_TTL;
        long seconds = j - TimeUnit.DAYS.toSeconds(j3);
        long j4 = seconds / 3600;
        long seconds2 = ((seconds - TimeUnit.HOURS.toSeconds(j4)) + 30) / 60;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = seconds2 == 60 ? new onViewAttachedToWindowlambda0(Long.valueOf(j4 + 1), 0L) : new onViewAttachedToWindowlambda0(Long.valueOf(j4), Long.valueOf(seconds2));
        long jLongValue = ((Number) onviewattachedtowindowlambda0.serializer).longValue();
        long jLongValue2 = ((Number) onviewattachedtowindowlambda0.write).longValue();
        ArrayList<TextSpanItem> arrayList = new ArrayList();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(null);
        Resources resources = context.createConfigurationContext(configuration).getResources();
        resources.getClass();
        if (j3 != 0) {
            String quantityString = resources.getQuantityString(R.plurals.mapbox_number_of_days, (int) j3);
            quantityString.getClass();
            String str = String.format(" %s ", Arrays.copyOf(new Object[]{quantityString}, 1));
            arrayList.add(new TextSpanItem(new StyleSpan(1), String.valueOf(j3)));
            arrayList.add(new TextSpanItem(new RelativeSizeSpan(1.0f), str));
            j2 = 0;
        }
        if (jLongValue != j2) {
            String str2 = String.format(" %s ", Arrays.copyOf(new Object[]{resources.getString(R.string.mapbox_unit_hr)}, 1));
            arrayList.add(new TextSpanItem(new StyleSpan(1), String.valueOf(jLongValue)));
            arrayList.add(new TextSpanItem(new RelativeSizeSpan(1.0f), str2));
        }
        if (jLongValue2 != 0) {
            String str3 = String.format(" %s ", Arrays.copyOf(new Object[]{resources.getString(R.string.mapbox_unit_min)}, 1));
            arrayList.add(new TextSpanItem(new StyleSpan(1), String.valueOf(jLongValue2)));
            arrayList.add(new TextSpanItem(new RelativeSizeSpan(1.0f), str3));
        }
        if (j3 == 0 && jLongValue == j2 && jLongValue2 == 0) {
            String str4 = String.format(" %s ", Arrays.copyOf(new Object[]{resources.getString(R.string.mapbox_unit_min)}, 1));
            arrayList.add(new TextSpanItem(new RelativeSizeSpan(1.0f), "< "));
            arrayList.add(new TextSpanItem(new StyleSpan(1), "1"));
            arrayList.add(new TextSpanItem(new RelativeSizeSpan(1.0f), str4));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (TextSpanItem textSpanItem : arrayList) {
            if (textSpanItem != null) {
                spannableStringBuilder.append(textSpanItem.spanText, textSpanItem.span, 33);
            }
        }
        int iWrite = -1;
        if (hideCurrentlyDisplayingInAppMessage.serializer(spannableStringBuilder, "<")) {
            int length = spannableStringBuilder.length();
            for (int i = 0; i < length; i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    iWrite = i;
                    break;
                }
            }
            iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) spannableStringBuilder, ' ', iWrite + 1, false, 4);
        } else {
            int length2 = spannableStringBuilder.length();
            for (int i2 = 0; i2 < length2; i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    iWrite = i2;
                    break;
                }
            }
        }
        int iWrite2 = hideCurrentlyDisplayingInAppMessage.write(hideCurrentlyDisplayingInAppMessage.read(spannableStringBuilder), ' ', iWrite + 1, false, 4);
        int i3 = iWrite2 + 1;
        int iWrite3 = hideCurrentlyDisplayingInAppMessage.write(hideCurrentlyDisplayingInAppMessage.read(spannableStringBuilder), ' ', i3, false, 4);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(2.0f), 0, iWrite, 33);
        if (iWrite2 > 0 && iWrite3 > 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(2.0f), i3, iWrite3, 33);
        }
        return new SpannableString(hideCurrentlyDisplayingInAppMessage.read(spannableStringBuilder));
    }

    @Override // o.drawImagegbVJVH8
    public drawImage9jGpkUE IconCompatParcelizer(MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = this.read;
        Context context = this.IconCompatParcelizer;
        switch (i) {
            case 2:
                return new configureStrokePaintQ_0CZUIdefault(context, this);
            case 3:
                return new configureStrokePaintQ_0CZUIdefault(context, this);
            case 4:
                return new configureStrokePaintQ_0CZUIdefault(context, this);
            case 5:
                return new drawArcillE91I(context, 0);
            case 6:
                return new configureStrokePaintQ_0CZUIdefault(context, multiModelLoaderFactory.serializer(Integer.class, AssetFileDescriptor.class));
            case 7:
                return new configureStrokePaintQ_0CZUIdefault(context, multiModelLoaderFactory.serializer(Integer.class, InputStream.class));
            case 8:
                return new drawArcillE91I(context, 1);
            default:
                return new drawArcillE91I(context, 2);
        }
    }

    public NavContext(Context context, int i) {
        this.read = i;
        switch (i) {
            case 10:
                accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
                Context applicationContext = context.getApplicationContext();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(applicationContext);
                this.IconCompatParcelizer = applicationContext;
                break;
            case 11:
                context.getClass();
                this.IconCompatParcelizer = context;
                break;
            case 12:
                this.IconCompatParcelizer = context.getApplicationContext();
                break;
            case 13:
                Context applicationContext2 = context.getApplicationContext();
                applicationContext2.getClass();
                this.IconCompatParcelizer = applicationContext2;
                break;
            default:
                this.IconCompatParcelizer = context.getApplicationContext();
                break;
        }
    }

    public /* synthetic */ NavContext(Context context, int i, boolean z) {
        this.read = i;
        this.IconCompatParcelizer = context;
    }

    public SpannableString format(Calendar calendar) {
        SpannableString spannableString = new SpannableString(zzlc.formatTime$default(calendar, -1, DateFormat.is24HourFormat(this.IconCompatParcelizer)));
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) spannableString, ' ', 0, false, 6);
        if (iWrite > 0) {
            spannableString.setSpan(new StyleSpan(1), 0, iWrite, 33);
        }
        return spannableString;
    }
}
