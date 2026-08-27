package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.logistics.rider.glovo.R;
import com.sentiance.core.model.thrift.k$c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import o.FocusOwnerImplmoveFocusfocusSearchSuccess1;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetModulatecp;

/* JADX INFO: loaded from: classes2.dex */
public final class MonthAdapter extends BaseAdapter {
    public final DateSelector IconCompatParcelizer;
    public final Month MediaBrowserCompatMediaItem;
    public ArrayList RatingCompat;
    public k$c RemoteActionCompatParcelizer;
    public final CalendarConstraints write;
    public static final int serializer = accessgetDeactivateOutOfFramecp.write((Calendar) null).getMaximum(4);
    public static final int read = (accessgetDeactivateOutOfFramecp.write((Calendar) null).getMaximum(7) + accessgetDeactivateOutOfFramecp.write((Calendar) null).getMaximum(5)) - 1;

    @Override // android.widget.Adapter
    public final int getCount() {
        return read;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.MediaBrowserCompatMediaItem.write;
    }

    public final int write() {
        int firstDayOfWeek = this.write.serializer;
        Month month = this.MediaBrowserCompatMediaItem;
        Calendar calendar = month.RemoteActionCompatParcelizer;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.write : i2;
    }

    public MonthAdapter(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
        this.MediaBrowserCompatMediaItem = month;
        this.IconCompatParcelizer = dateSelector;
        this.write = calendarConstraints;
        this.RatingCompat = ((SingleDateSelector) dateSelector).read();
    }

    public final void read(TextView textView, long j) {
        boolean z;
        boolean z2;
        String str;
        accessgetModulatecp accessgetmodulatecp;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = accessgetDeactivateOutOfFramecp.write().getTimeInMillis() == j;
        SingleDateSelector singleDateSelector = (SingleDateSelector) this.IconCompatParcelizer;
        singleDateSelector.getClass();
        Iterator it = new ArrayList().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((Long) ((FocusOwnerImplmoveFocusfocusSearchSuccess1) it.next()).IconCompatParcelizer).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = new ArrayList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj = ((FocusOwnerImplmoveFocusfocusSearchSuccess1) it2.next()).RemoteActionCompatParcelizer;
            if (obj != null && ((Long) obj).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write();
        Calendar calendarWrite2 = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        calendarWrite2.setTimeInMillis(j);
        if (calendarWrite.get(1) == calendarWrite2.get(1)) {
            str = accessgetDeactivateOutOfFramecp.read("MMMMEEEEd", Locale.getDefault()).format(new Date(j));
        } else {
            str = accessgetDeactivateOutOfFramecp.read("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        }
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.write.MediaSessionCompatQueueItem.serializer(j)) {
            textView.setEnabled(true);
            Iterator it3 = singleDateSelector.read().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (accessgetDeactivateOutOfFramecp.write(j) == accessgetDeactivateOutOfFramecp.write(((Long) it3.next()).longValue())) {
                        z3 = true;
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            if (z3) {
                accessgetmodulatecp = (accessgetModulatecp) this.RemoteActionCompatParcelizer.write;
            } else {
                boolean z5 = accessgetDeactivateOutOfFramecp.write().getTimeInMillis() == j;
                k$c k_c = this.RemoteActionCompatParcelizer;
                if (z5) {
                    accessgetmodulatecp = (accessgetModulatecp) k_c.IconCompatParcelizer;
                } else {
                    accessgetmodulatecp = (accessgetModulatecp) k_c.RemoteActionCompatParcelizer;
                }
            }
        } else {
            textView.setEnabled(false);
            accessgetmodulatecp = (accessgetModulatecp) this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
        }
        accessgetmodulatecp.RemoteActionCompatParcelizer(textView);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new k$c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iWrite = i - write();
        if (iWrite >= 0) {
            Month month = this.MediaBrowserCompatMediaItem;
            if (iWrite >= month.read) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iWrite + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        read(textView, item.longValue());
        return textView;
    }

    public final void read(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month month = Month.read(j);
        Month month2 = this.MediaBrowserCompatMediaItem;
        if (month.equals(month2)) {
            Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(month2.RemoteActionCompatParcelizer);
            calendarIconCompatParcelizer.setTimeInMillis(j);
            read((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().write() + (calendarIconCompatParcelizer.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public final int serializer() {
        return (write() + this.MediaBrowserCompatMediaItem.read) - 1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < write() || i > serializer()) {
            return null;
        }
        int iWrite = write();
        Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer);
        calendarIconCompatParcelizer.set(5, (i - iWrite) + 1);
        return Long.valueOf(calendarIconCompatParcelizer.getTimeInMillis());
    }
}
