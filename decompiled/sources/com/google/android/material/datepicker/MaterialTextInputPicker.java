package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.adjust.sdk.Constants;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.glovo.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.accessgetApplyPausedcp;
import o.accessgetDeactivateOutOfFramecp;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public CalendarConstraints IconCompatParcelizer;
    public DateSelector RemoteActionCompatParcelizer;
    public int read;

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.read);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.RemoteActionCompatParcelizer);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.IconCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String lowerCase;
        String lowerCase2;
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.read));
        DateSelector dateSelector = this.RemoteActionCompatParcelizer;
        CalendarConstraints calendarConstraints = this.IconCompatParcelizer;
        MaterialDatePicker.AnonymousClass4 anonymousClass4 = new MaterialDatePicker.AnonymousClass4(this, 1);
        SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelector;
        singleDateSelector.getClass();
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        String str = Build.MANUFACTURER;
        if (str == null) {
            lowerCase = "";
        } else {
            lowerCase = str.toLowerCase(Locale.ENGLISH);
        }
        if (!lowerCase.equals("lge")) {
            if (str == null) {
                lowerCase2 = "";
            } else {
                lowerCase2 = str.toLowerCase(Locale.ENGLISH);
            }
            if (lowerCase2.equals(Constants.REFERRER_API_SAMSUNG)) {
                editText.setInputType(17);
            }
        } else {
            editText.setInputType(17);
        }
        AtomicReference atomicReference = accessgetDeactivateOutOfFramecp.IconCompatParcelizer;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = viewInflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE).replaceAll("M+", "M").replaceAll("y+", "y");
        }
        String strReplace = pattern.replace(com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, string3).replace("M", string2).replace("y", string);
        textInputLayout.setPlaceholderText(strReplace);
        Long l = singleDateSelector.IconCompatParcelizer;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new accessgetApplyPausedcp(singleDateSelector, strReplace, simpleDateFormat, textInputLayout, calendarConstraints, anonymousClass4, textInputLayout));
        EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new DateSelector$$ExternalSyntheticLambda0(0, editTextArr));
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new ViewUtils$$ExternalSyntheticLambda0(3, editText2), 100L);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.read = bundle.getInt("THEME_RES_ID_KEY");
        this.RemoteActionCompatParcelizer = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.IconCompatParcelizer = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
