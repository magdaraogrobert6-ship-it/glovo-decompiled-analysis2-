package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.logistics.rider.glovo.R;
import com.sentiance.core.model.thrift.k$c;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import o.accessgetDeactivateOutOfFrameCancelledcp;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetModulatecp;

/* JADX INFO: loaded from: classes2.dex */
public final class YearGridAdapter extends RecyclerView.Adapter {
    public final MaterialCalendar read;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.read.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        accessgetDeactivateOutOfFrameCancelledcp accessgetdeactivateoutofframecancelledcp = (accessgetDeactivateOutOfFrameCancelledcp) viewHolder;
        MaterialCalendar materialCalendar = this.read;
        final int i2 = materialCalendar.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RatingCompat + i;
        accessgetdeactivateoutofframecancelledcp.serializer.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = accessgetdeactivateoutofframecancelledcp.serializer;
        Context context = textView.getContext();
        textView.setContentDescription(accessgetDeactivateOutOfFramecp.write().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        k$c k_c = materialCalendar.IconCompatParcelizer;
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write();
        accessgetModulatecp accessgetmodulatecp = (accessgetModulatecp) (calendarWrite.get(1) == i2 ? k_c.MediaBrowserCompatMediaItem : k_c.read);
        Iterator it = ((SingleDateSelector) materialCalendar.serializer).read().iterator();
        while (it.hasNext()) {
            calendarWrite.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarWrite.get(1) == i2) {
                accessgetmodulatecp = (accessgetModulatecp) k_c.serializer;
            }
        }
        accessgetmodulatecp.RemoteActionCompatParcelizer(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialCalendar materialCalendar2 = YearGridAdapter.this.read;
                Month month = Month.read(i2, materialCalendar2.write.IconCompatParcelizer);
                CalendarConstraints calendarConstraints = materialCalendar2.RemoteActionCompatParcelizer;
                Month month2 = calendarConstraints.IconCompatParcelizer;
                Month month3 = calendarConstraints.RemoteActionCompatParcelizer;
                if (month.compareTo(month3) < 0) {
                    month = month3;
                } else if (month.compareTo(month2) > 0) {
                    month = month2;
                }
                materialCalendar2.write(month);
                materialCalendar2.read(MaterialCalendar.IconCompatParcelizer.DAY);
            }
        });
    }

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.read = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new accessgetDeactivateOutOfFrameCancelledcp((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
