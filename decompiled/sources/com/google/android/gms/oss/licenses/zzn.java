package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.google.android.gms.internal.oss_licenses.zzg;
import o.TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111;
import o.getInflater;
import o.setExpandedActionViewsExclusive;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ zzn(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.read;
        Object obj = this.serializer;
        if (i2 == 0) {
            zzg zzgVar = (zzg) adapterView.getItemAtPosition(i);
            zzp zzpVar = (zzp) obj;
            Intent intent = new Intent(zzpVar.MediaSessionCompatQueueItem, (Class<?>) OssLicensesActivity.class);
            intent.putExtra("license", zzgVar);
            zzpVar.startActivity(intent);
            return;
        }
        if (i2 == 1) {
            getInflater getinflater = (getInflater) obj;
            AppCompatSpinner appCompatSpinner = getinflater.read;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(view, i, getinflater.write.getItemId(i));
            }
            getinflater.RemoteActionCompatParcelizer();
            return;
        }
        TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 = (TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111) obj;
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.MediaSessionCompatQueueItem;
        if (i < 0) {
            item = !setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing() ? null : setexpandedactionviewsexclusive.PlaybackStateCompat.getSelectedItem();
        } else {
            item = testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.getAdapter().getItem(i);
        }
        TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.serializer(testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111, item);
        AdapterView.OnItemClickListener onItemClickListener = testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = !setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing() ? null : setexpandedactionviewsexclusive.PlaybackStateCompat.getSelectedView();
                i = !setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing() ? -1 : setexpandedactionviewsexclusive.PlaybackStateCompat.getSelectedItemPosition();
                j = !setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing() ? Long.MIN_VALUE : setexpandedactionviewsexclusive.PlaybackStateCompat.getSelectedItemId();
            }
            onItemClickListener.onItemClick(setexpandedactionviewsexclusive.PlaybackStateCompat, view, i, j);
        }
        setexpandedactionviewsexclusive.RemoteActionCompatParcelizer();
    }
}
