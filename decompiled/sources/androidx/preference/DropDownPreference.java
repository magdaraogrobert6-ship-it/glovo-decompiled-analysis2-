package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.logistics.rider.glovo.R;
import o.evaluateQuadratic;
import o.getStartX;

/* JADX INFO: loaded from: classes4.dex */
public class DropDownPreference extends ListPreference {
    public final evaluateQuadratic MediaMetadataCompat;
    public Spinner MediaSessionCompatQueueItem;
    public final ArrayAdapter RatingCompat;

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void serializer() {
        this.MediaSessionCompatQueueItem.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.MediaMetadataCompat = new evaluateQuadratic(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.RatingCompat = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.MediaDescriptionCompat;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void write() {
        super.write();
        ArrayAdapter arrayAdapter = this.RatingCompat;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) getstartx.MediaSessionCompatQueueItem.findViewById(R.id.spinner);
        this.MediaSessionCompatQueueItem = spinner;
        spinner.setAdapter((SpinnerAdapter) this.RatingCompat);
        this.MediaSessionCompatQueueItem.setOnItemSelectedListener(this.MediaMetadataCompat);
        Spinner spinner2 = this.MediaSessionCompatQueueItem;
        String str = this.PlaybackStateCompatCustomAction;
        int i = -1;
        if (str != null && (charSequenceArr = this.MediaSessionCompatResultReceiverWrapper) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.serializer(getstartx);
    }
}
