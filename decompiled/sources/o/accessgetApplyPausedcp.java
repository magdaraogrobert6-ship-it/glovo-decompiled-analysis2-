package o;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateFormatTextWatcher;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetApplyPausedcp extends DateFormatTextWatcher {
    public final /* synthetic */ TextInputLayout MediaMetadataCompat;
    public final /* synthetic */ SingleDateSelector MediaSessionCompatQueueItem;
    public final /* synthetic */ MaterialDatePicker.AnonymousClass4 MediaSessionCompatResultReceiverWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetApplyPausedcp(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, MaterialDatePicker.AnonymousClass4 anonymousClass4, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.MediaSessionCompatQueueItem = singleDateSelector;
        this.MediaSessionCompatResultReceiverWrapper = anonymousClass4;
        this.MediaMetadataCompat = textInputLayout2;
    }
}
