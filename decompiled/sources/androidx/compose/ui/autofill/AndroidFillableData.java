package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidFillableData implements FillableData {
    public static final int $stable = 8;
    private final AutofillValue autofillValue;

    public final AutofillValue getAutofillValue$ui() {
        return this.autofillValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Boolean getBooleanValue() {
        if (this.autofillValue.isToggle()) {
            return Boolean.valueOf(this.autofillValue.getToggleValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Long getDateMillisValue() {
        if (this.autofillValue.isDate()) {
            return Long.valueOf(this.autofillValue.getDateValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public int getListIndexOrDefault(int i) {
        return this.autofillValue.isList() ? this.autofillValue.getListValue() : i;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Integer getListIndexValue() {
        if (this.autofillValue.isList()) {
            return Integer.valueOf(this.autofillValue.getListValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public CharSequence getTextValue() {
        if (this.autofillValue.isText()) {
            return this.autofillValue.getTextValue();
        }
        return null;
    }

    public AndroidFillableData(AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }
}
