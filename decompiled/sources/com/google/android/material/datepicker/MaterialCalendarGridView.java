package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.sentiance.core.model.thrift.k$c;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import o.FocusOwnerImplmoveFocusfocusSearchSuccess1;
import o.FocusPropertiesNode;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetModulatecp;
import o.getResumePausedNjRlDlw;
import o.providesRelative;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar IconCompatParcelizer;
    public final boolean write;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.IconCompatParcelizer = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        if (MaterialDatePicker.write(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.logistics.rider.glovo.R.id.cancel_button);
            setNextFocusRightId(com.logistics.rider.glovo.R.id.confirm_button);
        }
        this.write = MaterialDatePicker.write(getContext(), com.logistics.rider.glovo.R.attr.nestedScrollable);
        FocusPropertiesNode.write(this, new providesRelative(2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iWrite;
        int width;
        int iWrite2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter monthAdapter = (MonthAdapter) super.getAdapter();
        DateSelector dateSelector = monthAdapter.IconCompatParcelizer;
        Month month = monthAdapter.MediaBrowserCompatMediaItem;
        k$c k_c = monthAdapter.RemoteActionCompatParcelizer;
        int iMax = Math.max(monthAdapter.write(), getFirstVisiblePosition());
        int iMin = Math.min(monthAdapter.serializer(), getLastVisiblePosition());
        Long item = monthAdapter.getItem(iMax);
        Long item2 = monthAdapter.getItem(iMin);
        ((SingleDateSelector) dateSelector).getClass();
        Iterator it = new ArrayList().iterator();
        while (it.hasNext()) {
            FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 = (FocusOwnerImplmoveFocusfocusSearchSuccess1) it.next();
            Object obj = focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer;
            Object obj2 = focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer;
            if (obj2 != null) {
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj2;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    it = it;
                    month = month;
                    monthAdapter = monthAdapter;
                } else {
                    boolean zWrite = getResumePausedNjRlDlw.write(this);
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.IconCompatParcelizer;
                    Iterator it2 = it;
                    if (jLongValue < jLongValue3) {
                        if (iMax % month.write == 0) {
                            width = 0;
                        } else {
                            width = !zWrite ? materialCalendarGridView.read(iMax - 1).getRight() : materialCalendarGridView.read(iMax - 1).getLeft();
                        }
                        iWrite = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iWrite = monthAdapter.write() + (calendar.get(5) - 1);
                        View view = materialCalendarGridView.read(iWrite);
                        width = (view.getWidth() / 2) + view.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if ((iMin + 1) % month.write == 0) {
                            width2 = getWidth();
                        } else {
                            width2 = !zWrite ? materialCalendarGridView.read(iMin).getRight() : materialCalendarGridView.read(iMin).getLeft();
                        }
                        iWrite2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iWrite2 = monthAdapter.write() + (calendar.get(5) - 1);
                        View view2 = materialCalendarGridView.read(iWrite2);
                        width2 = (view2.getWidth() / 2) + view2.getLeft();
                    }
                    int itemId = (int) monthAdapter.getItemId(iWrite);
                    int itemId2 = (int) monthAdapter.getItemId(iWrite2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        MonthAdapter monthAdapter2 = monthAdapter;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View view3 = materialCalendarGridView.read(numColumns);
                        int top = view3.getTop();
                        int i2 = ((Rect) ((accessgetModulatecp) k_c.RemoteActionCompatParcelizer).MediaDescriptionCompat).top;
                        int bottom = view3.getBottom();
                        int i3 = width2;
                        int i4 = ((Rect) ((accessgetModulatecp) k_c.RemoteActionCompatParcelizer).MediaDescriptionCompat).bottom;
                        if (zWrite) {
                            int i5 = iWrite2 > numColumns2 ? 0 : i3;
                            if (numColumns > iWrite) {
                                i = i5;
                                width3 = getWidth();
                            } else {
                                i = i5;
                                width3 = width;
                            }
                        } else {
                            i = numColumns > iWrite ? 0 : width;
                            width3 = iWrite2 > numColumns2 ? getWidth() : i3;
                        }
                        canvas.drawRect(i, top + i2, width3, bottom - i4, (Paint) k_c.MediaDescriptionCompat);
                        itemId++;
                        materialCalendarGridView = this;
                        month = month;
                        monthAdapter = monthAdapter2;
                        width2 = i3;
                    }
                    materialCalendarGridView = this;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((MonthAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((MonthAdapter) super.getAdapter()).write()) {
            super.setSelection(((MonthAdapter) super.getAdapter()).write());
        } else {
            super.setSelection(i);
        }
    }

    public final View read(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((MonthAdapter) super.getAdapter()).serializer());
        } else if (i == 130) {
            setSelection(((MonthAdapter) super.getAdapter()).write());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((MonthAdapter) super.getAdapter()).write()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((MonthAdapter) super.getAdapter()).write());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.write) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }
}
