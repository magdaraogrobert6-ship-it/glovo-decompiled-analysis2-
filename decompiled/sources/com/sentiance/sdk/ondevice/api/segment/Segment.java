package com.sentiance.sdk.ondevice.api.segment;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Attribute;
import com.sentiance.sdk.util.DateTime;
import java.util.List;
import java.util.Objects;
import o.populatePushStoryPagelambda1;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Segment implements Parcelable {
    public static final Parcelable.Creator<Segment> CREATOR = new populatePushStoryPagelambda1();
    private final List<Attribute> mAttributes;
    private final SegmentCategory mCategory;
    private final DateTime mEndTime;
    private final DateTime mStartTime;
    private final SegmentSubcategory mSubcategory;
    private final SegmentType mType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Attribute> getAttributes() {
        return this.mAttributes;
    }

    public SegmentCategory getCategory() {
        return this.mCategory;
    }

    public DateTime getEndTime() {
        return this.mEndTime;
    }

    public DateTime getStartTime() {
        return this.mStartTime;
    }

    public SegmentSubcategory getSubcategory() {
        return this.mSubcategory;
    }

    public SegmentType getType() {
        return this.mType;
    }

    public int getSegmentId() {
        return this.mType.getUniqueId();
    }

    public int hashCode() {
        int iHashCode = this.mCategory.hashCode();
        int iHashCode2 = this.mSubcategory.hashCode();
        int iHashCode3 = this.mType.hashCode();
        int iHashCode4 = this.mStartTime.hashCode();
        DateTime dateTime = this.mEndTime;
        return this.mAttributes.hashCode() + ((((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + (dateTime != null ? dateTime.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCategory.ordinal());
        parcel.writeInt(this.mSubcategory.ordinal());
        parcel.writeInt(this.mType.ordinal());
        parcel.writeParcelable(this.mStartTime, i);
        parcel.writeTypedList(this.mAttributes);
        parcel.writeParcelable(this.mEndTime, i);
    }

    public Segment(Parcel parcel) {
        this.mCategory = SegmentCategory.values()[parcel.readInt()];
        this.mSubcategory = SegmentSubcategory.values()[parcel.readInt()];
        this.mType = SegmentType.values()[parcel.readInt()];
        this.mStartTime = (DateTime) parcel.readParcelable(DateTime.class.getClassLoader());
        this.mAttributes = parcel.createTypedArrayList(Attribute.CREATOR);
        this.mEndTime = (DateTime) parcel.readParcelable(DateTime.class.getClassLoader());
    }

    public String toString() {
        return "Segment{category=" + this.mCategory + ", subcategory=" + this.mSubcategory + ", type=" + this.mType + ", startTime=" + this.mStartTime + ", attributes=" + this.mAttributes + ", endTime=" + this.mEndTime + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Segment segment = (Segment) obj;
        if (this.mCategory == segment.mCategory && this.mSubcategory == segment.mSubcategory && this.mType == segment.mType && this.mStartTime.equals(segment.mStartTime) && Objects.equals(this.mEndTime, segment.mEndTime)) {
            return this.mAttributes.equals(segment.mAttributes);
        }
        return false;
    }

    public Segment(SegmentCategory segmentCategory, SegmentSubcategory segmentSubcategory, SegmentType segmentType, DateTime dateTime, DateTime dateTime2, List<Attribute> list) {
        this.mCategory = segmentCategory;
        this.mSubcategory = segmentSubcategory;
        this.mType = segmentType;
        this.mStartTime = dateTime;
        this.mEndTime = dateTime2;
        this.mAttributes = list;
    }
}
