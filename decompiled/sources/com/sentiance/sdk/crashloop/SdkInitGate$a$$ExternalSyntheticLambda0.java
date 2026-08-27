package com.sentiance.sdk.crashloop;

import com.google.android.material.datepicker.DateFormatTextWatcher;
import com.google.android.material.datepicker.SingleDateSelector;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o.accessgetApplyPausedcp;
import o.accessgetDeactivateOutOfFramecp;
import o.accessmergeRulerValues;
import o.r8lambdacjWcjm3stVKeZF_SundXc95EHE8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SdkInitGate$a$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SdkInitGate$a$$ExternalSyntheticLambda0(long j, int i, Object obj) {
        this.serializer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            ((r8lambdacjWcjm3stVKeZF_SundXc95EHE8) obj).read(j);
            return;
        }
        if (i == 1) {
            ((r8lambdacjWcjm3stVKeZF_SundXc95EHE8) obj).read(j);
            return;
        }
        DateFormatTextWatcher dateFormatTextWatcher = (DateFormatTextWatcher) obj;
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write();
        Calendar calendarWrite2 = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        calendarWrite2.setTimeInMillis(j);
        dateFormatTextWatcher.MediaDescriptionCompat.setError(String.format(dateFormatTextWatcher.read, (calendarWrite.get(1) == calendarWrite2.get(1) ? accessgetDeactivateOutOfFramecp.read("MMMd", Locale.getDefault()).format(new Date(j)) : accessmergeRulerValues.write(j)).replace(' ', (char) 160)));
        accessgetApplyPausedcp accessgetapplypausedcp = (accessgetApplyPausedcp) dateFormatTextWatcher;
        SingleDateSelector singleDateSelector = accessgetapplypausedcp.MediaSessionCompatQueueItem;
        accessgetapplypausedcp.MediaMetadataCompat.getError();
        singleDateSelector.getClass();
        accessgetapplypausedcp.MediaSessionCompatResultReceiverWrapper.read();
    }
}
