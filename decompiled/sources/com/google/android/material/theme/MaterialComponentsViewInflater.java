package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import o.TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111;
import o.VerticalRulerCompanionminOf1;
import o.isSpecifiedFK8aYYs;
import o.setCheckable;
import o.supportInvalidateOptionsMenu;
import o.supportNavigateUpTo;
import o.supportShouldUpRecreateTask;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final setCheckable IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new isSpecifiedFK8aYYs(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatTextView RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new VerticalRulerCompanionminOf1(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final supportInvalidateOptionsMenu read(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final supportShouldUpRecreateTask serializer(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final supportNavigateUpTo write(Context context, AttributeSet attributeSet) {
        return new TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111(context, attributeSet);
    }
}
