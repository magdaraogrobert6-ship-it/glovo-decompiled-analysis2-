package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class OpenHours implements Serializable {
    private final List<ExceptionalPeriod> exceptionalClosings;
    private final List<ExceptionalPeriod> exceptionalOpenings;
    private final OpenMode mode;
    private final String note;
    private final List<OpenPeriod> periods;
    private final List<String> weekdayText;

    public List<ExceptionalPeriod> getExceptionalClosings() {
        return this.exceptionalClosings;
    }

    public List<ExceptionalPeriod> getExceptionalOpenings() {
        return this.exceptionalOpenings;
    }

    public OpenMode getMode() {
        return this.mode;
    }

    public String getNote() {
        return this.note;
    }

    public List<OpenPeriod> getPeriods() {
        return this.periods;
    }

    public List<String> getWeekdayText() {
        return this.weekdayText;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.mode, this.periods, this.weekdayText, this.note, this.exceptionalOpenings, this.exceptionalClosings);
    }

    public OpenHours(OpenMode openMode, List<OpenPeriod> list, List<String> list2, String str, List<ExceptionalPeriod> list3, List<ExceptionalPeriod> list4) {
        this.mode = openMode;
        this.periods = list;
        this.weekdayText = list2;
        this.note = str;
        this.exceptionalOpenings = list3;
        this.exceptionalClosings = list4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[mode: ");
        sb.append(RecordUtils.fieldToString(this.mode));
        sb.append(", periods: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.periods, ", weekdayText: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.weekdayText, ", note: ");
        IconCompatParcelizer.read(sb, this.note, ", exceptionalOpenings: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.exceptionalOpenings, ", exceptionalClosings: ");
        return MediaSessionCompatQueueItem.read(this.exceptionalClosings, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenHours openHours = (OpenHours) obj;
        return Objects.equals(this.mode, openHours.mode) && Objects.equals(this.periods, openHours.periods) && Objects.equals(this.weekdayText, openHours.weekdayText) && Objects.equals(this.note, openHours.note) && Objects.equals(this.exceptionalOpenings, openHours.exceptionalOpenings) && Objects.equals(this.exceptionalClosings, openHours.exceptionalClosings);
    }
}
