package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.glovo.R;
import com.sentiance.sdk.crashloop.SdkInitGate$a$$ExternalSyntheticLambda0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o.accessgetApplyPausedcp;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetTookFromPrecomposeMapcp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DateFormatTextWatcher extends accessgetTookFromPrecomposeMapcp {
    public final SimpleDateFormat IconCompatParcelizer;
    public final w4$$ExternalSyntheticLambda0 MediaBrowserCompatMediaItem;
    public final TextInputLayout MediaDescriptionCompat;
    public SdkInitGate$a$$ExternalSyntheticLambda0 RatingCompat;
    public int RemoteActionCompatParcelizer = 0;
    public final String read;
    public final CalendarConstraints serializer;
    public final String write;

    @Override // o.accessgetTookFromPrecomposeMapcp, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.serializer;
        TextInputLayout textInputLayout = this.MediaDescriptionCompat;
        w4$$ExternalSyntheticLambda0 w4__externalsyntheticlambda0 = this.MediaBrowserCompatMediaItem;
        textInputLayout.removeCallbacks(w4__externalsyntheticlambda0);
        textInputLayout.removeCallbacks(this.RatingCompat);
        textInputLayout.setError(null);
        accessgetApplyPausedcp accessgetapplypausedcp = (accessgetApplyPausedcp) this;
        SingleDateSelector singleDateSelector = accessgetapplypausedcp.MediaSessionCompatQueueItem;
        singleDateSelector.IconCompatParcelizer = null;
        singleDateSelector.getClass();
        accessgetapplypausedcp.MediaSessionCompatResultReceiverWrapper.serializer(singleDateSelector.IconCompatParcelizer);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.write.length()) {
            return;
        }
        try {
            Date date = this.IconCompatParcelizer.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (calendarConstraints.MediaSessionCompatQueueItem.serializer(time)) {
                Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(calendarConstraints.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
                calendarIconCompatParcelizer.set(5, 1);
                if (calendarIconCompatParcelizer.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.IconCompatParcelizer;
                    int i4 = month.read;
                    Calendar calendarIconCompatParcelizer2 = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(month.RemoteActionCompatParcelizer);
                    calendarIconCompatParcelizer2.set(5, i4);
                    if (time <= calendarIconCompatParcelizer2.getTimeInMillis()) {
                        long time2 = date.getTime();
                        accessgetApplyPausedcp accessgetapplypausedcp2 = (accessgetApplyPausedcp) this;
                        SingleDateSelector singleDateSelector2 = accessgetapplypausedcp2.MediaSessionCompatQueueItem;
                        singleDateSelector2.IconCompatParcelizer = Long.valueOf(time2);
                        singleDateSelector2.getClass();
                        accessgetapplypausedcp2.MediaSessionCompatResultReceiverWrapper.serializer(singleDateSelector2.IconCompatParcelizer);
                        return;
                    }
                }
            }
            SdkInitGate$a$$ExternalSyntheticLambda0 sdkInitGate$a$$ExternalSyntheticLambda0 = new SdkInitGate$a$$ExternalSyntheticLambda0(time, 2, this);
            this.RatingCompat = sdkInitGate$a$$ExternalSyntheticLambda0;
            textInputLayout.post(sdkInitGate$a$$ExternalSyntheticLambda0);
        } catch (ParseException unused) {
            textInputLayout.post(w4__externalsyntheticlambda0);
        }
    }

    public DateFormatTextWatcher(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.write = str;
        this.IconCompatParcelizer = simpleDateFormat;
        this.MediaDescriptionCompat = textInputLayout;
        this.serializer = calendarConstraints;
        this.read = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.MediaBrowserCompatMediaItem = new w4$$ExternalSyntheticLambda0(this, 13, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.write;
        if (length >= str.length() || editable.length() < this.RemoteActionCompatParcelizer) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // o.accessgetTookFromPrecomposeMapcp, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer = charSequence.length();
    }
}
