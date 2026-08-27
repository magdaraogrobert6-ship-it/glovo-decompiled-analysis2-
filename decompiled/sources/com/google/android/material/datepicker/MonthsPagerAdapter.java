package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.Calendar;
import java.util.Iterator;
import o.BlockGraphicsLayerElement;
import o.SLOperation;
import o.accessgetDeactivateOutOfFramecp;
import o.provides;

/* JADX INFO: loaded from: classes2.dex */
public final class MonthsPagerAdapter extends RecyclerView.Adapter {
    public final CalendarConstraints RemoteActionCompatParcelizer;
    public final int read;
    public final DateSelector serializer;
    public final provides write;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.write;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        calendarIconCompatParcelizer.add(2, i);
        return new Month(calendarIconCompatParcelizer).RemoteActionCompatParcelizer.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SLOperation sLOperation = (SLOperation) viewHolder;
        CalendarConstraints calendarConstraints = this.RemoteActionCompatParcelizer;
        Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(calendarConstraints.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        calendarIconCompatParcelizer.add(2, i);
        Month month = new Month(calendarIconCompatParcelizer);
        sLOperation.read.setText(month.serializer());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sLOperation.write.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().MediaBrowserCompatMediaItem)) {
            MonthAdapter monthAdapter = new MonthAdapter(month, this.serializer, calendarConstraints);
            materialCalendarGridView.setNumColumns(month.write);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter adapter = materialCalendarGridView.getAdapter();
            DateSelector dateSelector = adapter.IconCompatParcelizer;
            Iterator it = adapter.RatingCompat.iterator();
            while (it.hasNext()) {
                adapter.read(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelector;
                Iterator it2 = singleDateSelector.read().iterator();
                while (it2.hasNext()) {
                    adapter.read(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                adapter.RatingCompat = singleDateSelector.read();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                MonthAdapter adapter2 = materialCalendarGridView2.getAdapter();
                if (i2 < adapter2.write() || i2 > adapter2.serializer()) {
                    return;
                }
                provides providesVar = MonthsPagerAdapter.this.write;
                Long item = materialCalendarGridView2.getAdapter().getItem(i2);
                long jLongValue = item.longValue();
                MaterialCalendar materialCalendar = providesVar.serializer;
                if (materialCalendar.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.serializer(jLongValue)) {
                    ((SingleDateSelector) materialCalendar.serializer).IconCompatParcelizer = item;
                    Iterator it3 = materialCalendar.MediaSessionCompatResultReceiverWrapper.iterator();
                    while (it3.hasNext()) {
                        ((MaterialDatePicker.AnonymousClass4) it3.next()).serializer(((SingleDateSelector) materialCalendar.serializer).IconCompatParcelizer);
                    }
                    materialCalendar.RatingCompat.getAdapter().notifyDataSetChanged();
                    RecyclerView recyclerView = materialCalendar.PlaybackStateCompat;
                    if (recyclerView != null) {
                        recyclerView.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
    }

    public MonthsPagerAdapter(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, provides providesVar) {
        Month month = calendarConstraints.RemoteActionCompatParcelizer;
        Month month2 = calendarConstraints.IconCompatParcelizer;
        Month month3 = calendarConstraints.read;
        if (month.compareTo(month3) > 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.compareTo(month2) > 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("currentPage cannot be after lastPage");
            throw null;
        }
        int i = MonthAdapter.serializer;
        this.read = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + (MaterialDatePicker.write(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.RemoteActionCompatParcelizer = calendarConstraints;
        this.serializer = dateSelector;
        this.write = providesVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.write(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new SLOperation(linearLayout, false);
        }
        linearLayout.setLayoutParams(new BlockGraphicsLayerElement(-1, this.read));
        return new SLOperation(linearLayout, true);
    }
}
