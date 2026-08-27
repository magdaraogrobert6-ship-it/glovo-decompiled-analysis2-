package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.accessgetMediaPreviouscp;
import o.accessgetMediaRewindcp;
import o.accessgetMediaSkipBackwardcp;
import o.accessgetMediaSkipForwardcp;
import o.accessgetMediaStepForwardcp;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlexboxLayout extends ViewGroup implements accessgetMediaSkipForwardcp {
    public Drawable IconCompatParcelizer;
    public List MediaBrowserCompatMediaItem;
    public DeltaDecoder MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public accessgetMediaRewindcp MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public int[] PlaybackStateCompat;
    public SparseIntArray PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Drawable read;
    public int serializer;
    public int write;

    public class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new zzd(14);
        public int IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public boolean MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public int MediaSessionCompatQueueItem;
        public int RatingCompat;
        public float RemoteActionCompatParcelizer;
        public float read;
        public float serializer;
        public int write;

        @Override // com.google.android.flexbox.FlexItem
        public final float IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatMediaItem() {
            return this.IconCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaDescriptionCompat() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaMetadataCompat() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaSessionCompatQueueItem() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaSessionCompatResultReceiverWrapper() {
            return this.MediaBrowserCompatMediaItem;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaSessionCompatToken() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int ParcelableVolumeInfo() {
            return this.MediaSessionCompatQueueItem;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int PlaybackStateCompat() {
            return this.RatingCompat;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int PlaybackStateCompatCustomAction() {
            return this.MediaMetadataCompat;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int RatingCompat() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float RemoteActionCompatParcelizer() {
            return this.serializer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean ResultReceiver() {
            return this.MediaDescriptionCompat;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int read() {
            return this.write;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void read(int i) {
            this.MediaMetadataCompat = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int serializer() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void serializer(int i) {
            this.MediaBrowserCompatMediaItem = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float write() {
            return this.read;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.RatingCompat);
            parcel.writeFloat(this.serializer);
            parcel.writeFloat(this.read);
            parcel.writeInt(this.write);
            parcel.writeFloat(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.MediaBrowserCompatMediaItem);
            parcel.writeInt(this.MediaMetadataCompat);
            parcel.writeInt(this.MediaSessionCompatQueueItem);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void RemoteActionCompatParcelizer(int i, View view) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getAlignContent() {
        return this.serializer;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getAlignItems() {
        return this.RemoteActionCompatParcelizer;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.IconCompatParcelizer;
    }

    public Drawable getDividerDrawableVertical() {
        return this.read;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getFlexDirection() {
        return this.MediaMetadataCompat;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // o.accessgetMediaSkipForwardcp
    public List<accessgetMediaSkipBackwardcp> getFlexLinesInternal() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getFlexWrap() {
        return this.RatingCompat;
    }

    public int getJustifyContent() {
        return this.ParcelableVolumeInfo;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getMaxLine() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public int getShowDividerHorizontal() {
        return this.ResultReceiver;
    }

    public int getShowDividerVertical() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int read(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int read(View view) {
        return 0;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final View read(int i) {
        return getChildAt(i);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final boolean read() {
        int i = this.MediaMetadataCompat;
        return i == 0 || i == 1;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int serializer(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public void setFlexLines(List<accessgetMediaSkipBackwardcp> list) {
        this.MediaBrowserCompatMediaItem = list;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final View write(int i) {
        return serializer(i);
    }

    public List<accessgetMediaSkipBackwardcp> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.MediaBrowserCompatMediaItem.size());
        for (accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp : this.MediaBrowserCompatMediaItem) {
            if (accessgetmediaskipbackwardcp.serializer() != 0) {
                arrayList.add(accessgetmediaskipbackwardcp);
            }
        }
        return arrayList;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getLargestMainSize() {
        Iterator it = this.MediaBrowserCompatMediaItem.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((accessgetMediaSkipBackwardcp) it.next()).MediaSessionCompatResultReceiverWrapper);
        }
        return iMax;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public int getSumOfCrossSize() {
        int size = this.MediaBrowserCompatMediaItem.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i2);
            if (RemoteActionCompatParcelizer(i2)) {
                i += read() ? this.write : this.MediaSessionCompatQueueItem;
            }
            if (IconCompatParcelizer(i2)) {
                i += read() ? this.write : this.MediaSessionCompatQueueItem;
            }
            i += accessgetmediaskipbackwardcp.write;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        int i5 = this.MediaMetadataCompat;
        if (i5 == 0) {
            read(i, i2, i3, i4, layoutDirection == 1);
            return;
        }
        if (i5 == 1) {
            read(i, i2, i3, i4, layoutDirection != 1);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            serializer(this.RatingCompat == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 != 3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i5, "Invalid flex direction is set: ");
        } else {
            z2 = layoutDirection == 1;
            serializer(this.RatingCompat == 2 ? !z2 : z2, true, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        DeltaDecoder deltaDecoder = this.MediaDescriptionCompat;
        accessgetMediaRewindcp accessgetmediarewindcp = this.MediaSessionCompatToken;
        if (this.PlaybackStateCompatCustomAction == null) {
            this.PlaybackStateCompatCustomAction = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.PlaybackStateCompatCustomAction;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = accessgetmediarewindcp.write;
        int flexItemCount = accessgetmediaskipforwardcp.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.PlaybackStateCompatCustomAction;
            int flexItemCount2 = accessgetmediarewindcp.write.getFlexItemCount();
            this.PlaybackStateCompat = accessgetMediaRewindcp.RemoteActionCompatParcelizer(flexItemCount2, accessgetmediarewindcp.write(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View view = accessgetmediaskipforwardcp.read(i3);
            if (view != null && ((FlexItem) view.getLayoutParams()).PlaybackStateCompat() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.PlaybackStateCompatCustomAction;
                int flexItemCount3 = accessgetmediarewindcp.write.getFlexItemCount();
                this.PlaybackStateCompat = accessgetMediaRewindcp.RemoteActionCompatParcelizer(flexItemCount3, accessgetmediarewindcp.write(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.MediaMetadataCompat;
        int i5 = 2;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i4, "Invalid value for the flex direction is set: ");
                return;
            }
            this.MediaBrowserCompatMediaItem.clear();
            deltaDecoder.serializer = null;
            deltaDecoder.write = 0;
            this.MediaSessionCompatToken.read(this.MediaDescriptionCompat, i2, i, Integer.MAX_VALUE, 0, -1, (List) null);
            this.MediaBrowserCompatMediaItem = (List) deltaDecoder.serializer;
            accessgetmediarewindcp.RemoteActionCompatParcelizer(i, i2, 0);
            accessgetmediarewindcp.serializer(i, i2, getPaddingRight() + getPaddingLeft());
            accessgetmediarewindcp.IconCompatParcelizer(0);
            setMeasuredDimensionForFlex(this.MediaMetadataCompat, i, i2, deltaDecoder.write);
            return;
        }
        this.MediaBrowserCompatMediaItem.clear();
        deltaDecoder.serializer = null;
        deltaDecoder.write = 0;
        this.MediaSessionCompatToken.read(this.MediaDescriptionCompat, i, i2, Integer.MAX_VALUE, 0, -1, (List) null);
        this.MediaBrowserCompatMediaItem = (List) deltaDecoder.serializer;
        accessgetmediarewindcp.RemoteActionCompatParcelizer(i, i2, 0);
        if (this.RemoteActionCompatParcelizer == 3) {
            for (accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp : this.MediaBrowserCompatMediaItem) {
                int iMax = Integer.MIN_VALUE;
                int i6 = 0;
                while (i6 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
                    View viewSerializer = serializer(accessgetmediaskipbackwardcp.RatingCompat + i6);
                    if (viewSerializer != null && viewSerializer.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                        int i7 = this.RatingCompat;
                        int i8 = accessgetmediaskipbackwardcp.ParcelableVolumeInfo;
                        iMax = i7 != i5 ? Math.max(iMax, viewSerializer.getMeasuredHeight() + Math.max(i8 - viewSerializer.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewSerializer.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewSerializer.getBaseline() + (i8 - viewSerializer.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                    i6++;
                    i5 = 2;
                }
                accessgetmediaskipbackwardcp.write = iMax;
                i5 = 2;
            }
        }
        accessgetmediarewindcp.serializer(i, i2, getPaddingBottom() + getPaddingTop());
        accessgetmediarewindcp.IconCompatParcelizer(0);
        setMeasuredDimensionForFlex(this.MediaMetadataCompat, i, i2, deltaDecoder.write);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fc  */
    public final void read(int i, int i2, int i3, int i4, boolean z) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewSerializer;
        int i7;
        int i8;
        int i9;
        char c;
        LayoutParams layoutParams;
        float f3;
        float f4;
        float f5;
        int i10;
        char c2;
        int i11;
        LayoutParams layoutParams2;
        accessgetMediaRewindcp accessgetmediarewindcp;
        accessgetMediaRewindcp accessgetmediarewindcp2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.MediaBrowserCompatMediaItem.size();
        int i13 = 0;
        while (i13 < size) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i13);
            if (RemoteActionCompatParcelizer(i13)) {
                int i14 = this.write;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = this.ParcelableVolumeInfo;
            char c3 = 4;
            int i16 = 1;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i12 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    float f6 = (i12 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / 2.0f;
                    measuredWidth = paddingLeft + f6;
                    f = (i12 - paddingRight) - f6;
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iSerializer = accessgetmediaskipbackwardcp.serializer();
                    f2 = (i12 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / (iSerializer != 1 ? iSerializer - 1 : 1.0f);
                    f = i12 - paddingRight;
                } else if (i15 == 4) {
                    int iSerializer2 = accessgetmediaskipbackwardcp.serializer();
                    f2 = iSerializer2 != 0 ? (i12 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / iSerializer2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    f = (i12 - paddingRight) - f7;
                } else {
                    if (i15 != 5) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i15, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iSerializer3 = accessgetmediaskipbackwardcp.serializer();
                    f2 = iSerializer3 != 0 ? (i12 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / (iSerializer3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i12 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
                    i6 = accessgetmediaskipbackwardcp.RatingCompat + i5;
                    viewSerializer = serializer(i6);
                    if (viewSerializer != null) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c = c3;
                    } else if (viewSerializer.getVisibility() == 8) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c = 4;
                    } else {
                        layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (RemoteActionCompatParcelizer(i6, i5)) {
                            int i17 = this.MediaSessionCompatQueueItem;
                            float f8 = i17;
                            f3 += f8;
                            i10 = i17;
                            f5 = f4 - f8;
                        } else {
                            f5 = f4;
                            i10 = 0;
                        }
                        if (i5 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - i16) {
                            c2 = 4;
                            i11 = (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) > 0 ? this.MediaSessionCompatQueueItem : 0;
                            if (this.RatingCompat == 2) {
                                accessgetmediarewindcp2 = this.MediaSessionCompatToken;
                                if (z) {
                                    i8 = i16;
                                    i9 = i5;
                                    i7 = paddingLeft;
                                    layoutParams2 = layoutParams;
                                    c = c2;
                                    accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingBottom - viewSerializer.getMeasuredHeight(), Math.round(f5), paddingBottom);
                                } else {
                                    i7 = paddingLeft;
                                    i8 = i16;
                                    i9 = i5;
                                    layoutParams2 = layoutParams;
                                    c = c2;
                                    accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), paddingBottom - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + Math.round(f3), paddingBottom);
                                }
                            } else {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp = this.MediaSessionCompatToken;
                                if (z) {
                                    accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingTop, Math.round(f5), viewSerializer.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i18 = paddingTop;
                                    accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), i18, viewSerializer.getMeasuredWidth() + Math.round(f3), viewSerializer.getMeasuredHeight() + paddingTop);
                                }
                            }
                            measuredWidth = f3 + viewSerializer.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                            float measuredWidth2 = viewSerializer.getMeasuredWidth();
                            float f9 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                            if (z) {
                                accessgetmediaskipbackwardcp.read(viewSerializer, i11, 0, i10, 0);
                            } else {
                                accessgetmediaskipbackwardcp.read(viewSerializer, i10, 0, i11, 0);
                            }
                            f = f5 - ((measuredWidth2 + fMax) + f9);
                        } else {
                            c2 = 4;
                        }
                        if (this.RatingCompat == 2) {
                            accessgetmediarewindcp2 = this.MediaSessionCompatToken;
                            if (z) {
                                i8 = i16;
                                i9 = i5;
                                i7 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingBottom - viewSerializer.getMeasuredHeight(), Math.round(f5), paddingBottom);
                            } else {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), paddingBottom - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + Math.round(f3), paddingBottom);
                            }
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp = this.MediaSessionCompatToken;
                            if (z) {
                                accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingTop, Math.round(f5), viewSerializer.getMeasuredHeight() + paddingTop);
                            } else {
                                int i19 = paddingTop;
                                accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), i19, viewSerializer.getMeasuredWidth() + Math.round(f3), viewSerializer.getMeasuredHeight() + paddingTop);
                            }
                        }
                        measuredWidth = f3 + viewSerializer.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = viewSerializer.getMeasuredWidth();
                        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        if (z) {
                            accessgetmediaskipbackwardcp.read(viewSerializer, i11, 0, i10, 0);
                        } else {
                            accessgetmediaskipbackwardcp.read(viewSerializer, i10, 0, i11, 0);
                        }
                        f = f5 - ((measuredWidth3 + fMax) + f10);
                    }
                    i5 = i9 + 1;
                    paddingLeft = i7;
                    i16 = i8;
                    c3 = c;
                }
                int i20 = paddingLeft;
                int i21 = accessgetmediaskipbackwardcp.write;
                paddingTop += i21;
                paddingBottom -= i21;
                i13++;
                paddingLeft = i20;
            } else {
                int i22 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                f = i22 - paddingLeft;
                measuredWidth = (i12 - i22) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
                i6 = accessgetmediaskipbackwardcp.RatingCompat + i5;
                viewSerializer = serializer(i6);
                if (viewSerializer != null) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c = c3;
                } else if (viewSerializer.getVisibility() == 8) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c = 4;
                } else {
                    layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                    f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    if (RemoteActionCompatParcelizer(i6, i5)) {
                        int i110 = this.MediaSessionCompatQueueItem;
                        float f11 = i110;
                        f3 += f11;
                        i10 = i110;
                        f5 = f4 - f11;
                    } else {
                        f5 = f4;
                        i10 = 0;
                    }
                    if (i5 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - i16) {
                        c2 = 4;
                        if ((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) > 0) {
                        }
                        if (this.RatingCompat == 2) {
                            accessgetmediarewindcp2 = this.MediaSessionCompatToken;
                            if (z) {
                                i8 = i16;
                                i9 = i5;
                                i7 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingBottom - viewSerializer.getMeasuredHeight(), Math.round(f5), paddingBottom);
                            } else {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), paddingBottom - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + Math.round(f3), paddingBottom);
                            }
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp = this.MediaSessionCompatToken;
                            if (z) {
                                accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingTop, Math.round(f5), viewSerializer.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), i111, viewSerializer.getMeasuredWidth() + Math.round(f3), viewSerializer.getMeasuredHeight() + paddingTop);
                            }
                        }
                        measuredWidth = f3 + viewSerializer.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth4 = viewSerializer.getMeasuredWidth();
                        float f12 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        if (z) {
                            accessgetmediaskipbackwardcp.read(viewSerializer, i11, 0, i10, 0);
                        } else {
                            accessgetmediaskipbackwardcp.read(viewSerializer, i10, 0, i11, 0);
                        }
                        f = f5 - ((measuredWidth4 + fMax) + f12);
                    } else {
                        c2 = 4;
                    }
                    if (this.RatingCompat == 2) {
                        accessgetmediarewindcp2 = this.MediaSessionCompatToken;
                        if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingBottom - viewSerializer.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp2.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), paddingBottom - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + Math.round(f3), paddingBottom);
                        }
                    } else {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c = c2;
                        accessgetmediarewindcp = this.MediaSessionCompatToken;
                        if (z) {
                            accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f5) - viewSerializer.getMeasuredWidth(), paddingTop, Math.round(f5), viewSerializer.getMeasuredHeight() + paddingTop);
                        } else {
                            int i112 = paddingTop;
                            accessgetmediarewindcp.serializer(viewSerializer, accessgetmediaskipbackwardcp, Math.round(f3), i112, viewSerializer.getMeasuredWidth() + Math.round(f3), viewSerializer.getMeasuredHeight() + paddingTop);
                        }
                    }
                    measuredWidth = f3 + viewSerializer.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    float measuredWidth5 = viewSerializer.getMeasuredWidth();
                    float f13 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                    if (z) {
                        accessgetmediaskipbackwardcp.read(viewSerializer, i11, 0, i10, 0);
                    } else {
                        accessgetmediaskipbackwardcp.read(viewSerializer, i10, 0, i11, 0);
                    }
                    f = f5 - ((measuredWidth5 + fMax) + f13);
                }
                i5 = i9 + 1;
                paddingLeft = i7;
                i16 = i8;
                c3 = c;
            }
            int i23 = paddingLeft;
            int i24 = accessgetmediaskipbackwardcp.write;
            paddingTop += i24;
            paddingBottom -= i24;
            i13++;
            paddingLeft = i23;
        }
    }

    public final View serializer(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.PlaybackStateCompat;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    public final void serializer(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float fMax;
        int i5;
        int i6;
        View viewSerializer;
        int i7;
        boolean z3;
        char c;
        LayoutParams layoutParams;
        float f4;
        float f5;
        float f6;
        float f7;
        int i8;
        char c2;
        int i9;
        accessgetMediaRewindcp accessgetmediarewindcp;
        LayoutParams layoutParams2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i12 = 0; i12 < size; i12++) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i12);
            if (RemoteActionCompatParcelizer(i12)) {
                int i13 = this.MediaSessionCompatQueueItem;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = this.ParcelableVolumeInfo;
            char c3 = 4;
            boolean z4 = true;
            if (i14 == 0) {
                f = i10 - paddingBottom;
                f2 = paddingTop;
            } else if (i14 != 1) {
                if (i14 == 2) {
                    float f8 = (i10 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / 2.0f;
                    float f9 = (i10 - paddingBottom) - f8;
                    f2 = paddingTop + f8;
                    f = f9;
                } else if (i14 == 3) {
                    f2 = paddingTop;
                    int iSerializer = accessgetmediaskipbackwardcp.serializer();
                    f3 = (i10 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / (iSerializer != 1 ? iSerializer - 1 : 1.0f);
                    f = i10 - paddingBottom;
                } else if (i14 == 4) {
                    int iSerializer2 = accessgetmediaskipbackwardcp.serializer();
                    f3 = iSerializer2 != 0 ? (i10 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / iSerializer2 : 0.0f;
                    float f10 = f3 / 2.0f;
                    f2 = paddingTop + f10;
                    f = (i10 - paddingBottom) - f10;
                } else {
                    if (i14 != 5) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(i14, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iSerializer3 = accessgetmediaskipbackwardcp.serializer();
                    f3 = iSerializer3 != 0 ? (i10 - accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) / (iSerializer3 + 1) : 0.0f;
                    f2 = paddingTop + f3;
                    f = (i10 - paddingBottom) - f3;
                }
                fMax = Math.max(f3, 0.0f);
                i5 = 0;
                while (i5 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
                    i6 = accessgetmediaskipbackwardcp.RatingCompat + i5;
                    viewSerializer = serializer(i6);
                    if (viewSerializer != null) {
                        i7 = i5;
                        z3 = z4;
                        c = c3;
                    } else if (viewSerializer.getVisibility() == 8) {
                        i7 = i5;
                        z3 = true;
                        c = 4;
                    } else {
                        layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                        f4 = f2 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        f5 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if (RemoteActionCompatParcelizer(i6, i5)) {
                            int i15 = this.write;
                            float f11 = i15;
                            f6 = f4 + f11;
                            i8 = i15;
                            f7 = f5 - f11;
                        } else {
                            f6 = f4;
                            f7 = f5;
                            i8 = 0;
                        }
                        if (i5 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1) {
                            c2 = 4;
                            i9 = (this.ResultReceiver & 4) > 0 ? this.write : 0;
                            accessgetmediarewindcp = this.MediaSessionCompatToken;
                            if (z) {
                                i7 = i5;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                if (z2) {
                                    accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f7) - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + paddingLeft, Math.round(f7));
                                } else {
                                    accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f6), viewSerializer.getMeasuredWidth() + paddingLeft, viewSerializer.getMeasuredHeight() + Math.round(f6));
                                }
                            } else if (z2) {
                                i7 = i5;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f7) - viewSerializer.getMeasuredHeight(), i11, Math.round(f7));
                            } else {
                                i7 = i5;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c = c2;
                                accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f6), i11, viewSerializer.getMeasuredHeight() + Math.round(f6));
                            }
                            LayoutParams layoutParams3 = layoutParams2;
                            float measuredHeight = f6 + viewSerializer.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            float measuredHeight2 = viewSerializer.getMeasuredHeight();
                            float f12 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                            if (z2) {
                                accessgetmediaskipbackwardcp.read(viewSerializer, 0, i9, 0, i8);
                            } else {
                                accessgetmediaskipbackwardcp.read(viewSerializer, 0, i8, 0, i9);
                            }
                            f2 = measuredHeight;
                            f = f7 - ((measuredHeight2 + fMax) + f12);
                        } else {
                            c2 = 4;
                        }
                        accessgetmediarewindcp = this.MediaSessionCompatToken;
                        if (z) {
                            i7 = i5;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z2) {
                                accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f7) - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + paddingLeft, Math.round(f7));
                            } else {
                                accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f6), viewSerializer.getMeasuredWidth() + paddingLeft, viewSerializer.getMeasuredHeight() + Math.round(f6));
                            }
                        } else if (z2) {
                            i7 = i5;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f7) - viewSerializer.getMeasuredHeight(), i11, Math.round(f7));
                        } else {
                            i7 = i5;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f6), i11, viewSerializer.getMeasuredHeight() + Math.round(f6));
                        }
                        LayoutParams layoutParams4 = layoutParams2;
                        float measuredHeight3 = f6 + viewSerializer.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        float measuredHeight4 = viewSerializer.getMeasuredHeight();
                        float f13 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        if (z2) {
                            accessgetmediaskipbackwardcp.read(viewSerializer, 0, i9, 0, i8);
                        } else {
                            accessgetmediaskipbackwardcp.read(viewSerializer, 0, i8, 0, i9);
                        }
                        f2 = measuredHeight3;
                        f = f7 - ((measuredHeight4 + fMax) + f13);
                    }
                    i5 = i7 + 1;
                    z4 = z3;
                    c3 = c;
                }
                int i16 = accessgetmediaskipbackwardcp.write;
                paddingLeft += i16;
                i11 -= i16;
            } else {
                int i17 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                f2 = (i10 - i17) + paddingBottom;
                f = i17 - paddingTop;
            }
            f3 = 0.0f;
            fMax = Math.max(f3, 0.0f);
            i5 = 0;
            while (i5 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
                i6 = accessgetmediaskipbackwardcp.RatingCompat + i5;
                viewSerializer = serializer(i6);
                if (viewSerializer != null) {
                    i7 = i5;
                    z3 = z4;
                    c = c3;
                } else if (viewSerializer.getVisibility() == 8) {
                    i7 = i5;
                    z3 = true;
                    c = 4;
                } else {
                    layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                    f4 = f2 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    f5 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (RemoteActionCompatParcelizer(i6, i5)) {
                        int i18 = this.write;
                        float f14 = i18;
                        f6 = f4 + f14;
                        i8 = i18;
                        f7 = f5 - f14;
                    } else {
                        f6 = f4;
                        f7 = f5;
                        i8 = 0;
                    }
                    if (i5 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1) {
                        c2 = 4;
                        if ((this.ResultReceiver & 4) > 0) {
                        }
                        accessgetmediarewindcp = this.MediaSessionCompatToken;
                        if (z) {
                            i7 = i5;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            if (z2) {
                                accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f7) - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + paddingLeft, Math.round(f7));
                            } else {
                                accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f6), viewSerializer.getMeasuredWidth() + paddingLeft, viewSerializer.getMeasuredHeight() + Math.round(f6));
                            }
                        } else if (z2) {
                            i7 = i5;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f7) - viewSerializer.getMeasuredHeight(), i11, Math.round(f7));
                        } else {
                            i7 = i5;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c = c2;
                            accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f6), i11, viewSerializer.getMeasuredHeight() + Math.round(f6));
                        }
                        LayoutParams layoutParams5 = layoutParams2;
                        float measuredHeight5 = f6 + viewSerializer.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        float measuredHeight6 = viewSerializer.getMeasuredHeight();
                        float f15 = ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin;
                        if (z2) {
                            accessgetmediaskipbackwardcp.read(viewSerializer, 0, i9, 0, i8);
                        } else {
                            accessgetmediaskipbackwardcp.read(viewSerializer, 0, i8, 0, i9);
                        }
                        f2 = measuredHeight5;
                        f = f7 - ((measuredHeight6 + fMax) + f15);
                    } else {
                        c2 = 4;
                    }
                    accessgetmediarewindcp = this.MediaSessionCompatToken;
                    if (z) {
                        i7 = i5;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        if (z2) {
                            accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f7) - viewSerializer.getMeasuredHeight(), viewSerializer.getMeasuredWidth() + paddingLeft, Math.round(f7));
                        } else {
                            accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, false, paddingLeft, Math.round(f6), viewSerializer.getMeasuredWidth() + paddingLeft, viewSerializer.getMeasuredHeight() + Math.round(f6));
                        }
                    } else if (z2) {
                        i7 = i5;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f7) - viewSerializer.getMeasuredHeight(), i11, Math.round(f7));
                    } else {
                        i7 = i5;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c = c2;
                        accessgetmediarewindcp.read(viewSerializer, accessgetmediaskipbackwardcp, true, i11 - viewSerializer.getMeasuredWidth(), Math.round(f6), i11, viewSerializer.getMeasuredHeight() + Math.round(f6));
                    }
                    LayoutParams layoutParams6 = layoutParams2;
                    float measuredHeight7 = f6 + viewSerializer.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    float measuredHeight8 = viewSerializer.getMeasuredHeight();
                    float f16 = ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin;
                    if (z2) {
                        accessgetmediaskipbackwardcp.read(viewSerializer, 0, i9, 0, i8);
                    } else {
                        accessgetmediaskipbackwardcp.read(viewSerializer, 0, i8, 0, i9);
                    }
                    f2 = measuredHeight7;
                    f = f7 - ((measuredHeight8 + fMax) + f16);
                }
                i5 = i7 + 1;
                z4 = z3;
                c3 = c;
            }
            int i19 = accessgetmediaskipbackwardcp.write;
            paddingLeft += i19;
            i11 -= i19;
        }
    }

    public final boolean IconCompatParcelizer(int i) {
        if (i >= 0 && i < this.MediaBrowserCompatMediaItem.size()) {
            for (int i2 = i + 1; i2 < this.MediaBrowserCompatMediaItem.size(); i2++) {
                if (((accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i2)).serializer() > 0) {
                    return false;
                }
            }
            if (read()) {
                return (this.ResultReceiver & 4) != 0;
            }
            if ((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        if (i >= 0 && i < this.MediaBrowserCompatMediaItem.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i2)).serializer() > 0) {
                    if (read()) {
                        return (this.ResultReceiver & 2) != 0;
                    }
                    return (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 2) != 0;
                }
            }
            if (read()) {
                return (this.ResultReceiver & 1) != 0;
            }
            if ((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.read == null && this.IconCompatParcelizer == null) {
            return;
        }
        if (this.ResultReceiver == 0 && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 0) {
            return;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int layoutDirection = getLayoutDirection();
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            write(canvas, layoutDirection == 1, this.RatingCompat == 2);
            return;
        }
        if (i == 1) {
            write(canvas, layoutDirection != 1, this.RatingCompat == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.RatingCompat == 2) {
                z = !z;
            }
            serializer(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.RatingCompat == 2) {
            z2 = !z2;
        }
        serializer(canvas, z2, true);
    }

    public final void serializer(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i);
            for (int i2 = 0; i2 < accessgetmediaskipbackwardcp.MediaDescriptionCompat; i2++) {
                int i3 = accessgetmediaskipbackwardcp.RatingCompat + i2;
                View viewSerializer = serializer(i3);
                if (viewSerializer != null && viewSerializer.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                    if (RemoteActionCompatParcelizer(i3, i2)) {
                        write(canvas, accessgetmediaskipbackwardcp.PlaybackStateCompat, z2 ? viewSerializer.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewSerializer.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.write, accessgetmediaskipbackwardcp.write);
                    }
                    if (i2 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1 && (this.ResultReceiver & 4) > 0) {
                        write(canvas, accessgetmediaskipbackwardcp.PlaybackStateCompat, z2 ? (viewSerializer.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.write : viewSerializer.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, accessgetmediaskipbackwardcp.write);
                    }
                }
            }
            if (RemoteActionCompatParcelizer(i)) {
                serializer(canvas, z ? accessgetmediaskipbackwardcp.PlaybackStateCompatCustomAction : accessgetmediaskipbackwardcp.PlaybackStateCompat - this.MediaSessionCompatQueueItem, paddingTop, iMax);
            }
            if (IconCompatParcelizer(i) && (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) > 0) {
                serializer(canvas, z ? accessgetmediaskipbackwardcp.PlaybackStateCompat - this.MediaSessionCompatQueueItem : accessgetmediaskipbackwardcp.PlaybackStateCompatCustomAction, paddingTop, iMax);
            }
        }
    }

    public void setAlignContent(int i) {
        if (this.serializer != i) {
            this.serializer = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.RemoteActionCompatParcelizer != i) {
            this.RemoteActionCompatParcelizer = i;
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            requestLayout();
        }
    }

    public void setFlexWrap(int i) {
        if (this.RatingCompat != i) {
            this.RatingCompat = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.ParcelableVolumeInfo != i) {
            this.ParcelableVolumeInfo = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.MediaSessionCompatResultReceiverWrapper != i) {
            this.MediaSessionCompatResultReceiverWrapper = i;
            requestLayout();
        }
    }

    public final void setMeasuredDimensionForFlex(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            int sumOfCrossSize = getSumOfCrossSize();
            paddingBottom = getPaddingBottom() + getPaddingTop() + sumOfCrossSize;
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            int sumOfCrossSize2 = getSumOfCrossSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + sumOfCrossSize2;
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, Fields.RotationX);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, Fields.RotationX);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.ResultReceiver) {
            this.ResultReceiver = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
            requestLayout();
        }
    }

    public final void write(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i);
            for (int i2 = 0; i2 < accessgetmediaskipbackwardcp.MediaDescriptionCompat; i2++) {
                int i3 = accessgetmediaskipbackwardcp.RatingCompat + i2;
                View viewSerializer = serializer(i3);
                if (viewSerializer != null && viewSerializer.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewSerializer.getLayoutParams();
                    if (RemoteActionCompatParcelizer(i3, i2)) {
                        serializer(canvas, z ? viewSerializer.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewSerializer.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.MediaSessionCompatQueueItem, accessgetmediaskipbackwardcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, accessgetmediaskipbackwardcp.write);
                    }
                    if (i2 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1 && (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) > 0) {
                        serializer(canvas, z ? (viewSerializer.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.MediaSessionCompatQueueItem : viewSerializer.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, accessgetmediaskipbackwardcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, accessgetmediaskipbackwardcp.write);
                    }
                }
            }
            if (RemoteActionCompatParcelizer(i)) {
                write(canvas, paddingLeft, z2 ? accessgetmediaskipbackwardcp.serializer : accessgetmediaskipbackwardcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys - this.write, iMax);
            }
            if (IconCompatParcelizer(i) && (this.ResultReceiver & 4) > 0) {
                write(canvas, paddingLeft, z2 ? accessgetmediaskipbackwardcp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys - this.write : accessgetmediaskipbackwardcp.serializer, iMax);
            }
        }
    }

    public final void serializer(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.read;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.MediaSessionCompatQueueItem + i, i3 + i2);
        this.read.draw(canvas);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = drawable;
        if (drawable != null) {
            this.write = drawable.getIntrinsicHeight();
        } else {
            this.write = 0;
        }
        if (this.IconCompatParcelizer == null && this.read == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.read) {
            return;
        }
        this.read = drawable;
        if (drawable != null) {
            this.MediaSessionCompatQueueItem = drawable.getIntrinsicWidth();
        } else {
            this.MediaSessionCompatQueueItem = 0;
        }
        if (this.IconCompatParcelizer == null && this.read == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.PlaybackStateCompatCustomAction == null) {
            this.PlaybackStateCompatCustomAction = new SparseIntArray(getChildCount());
        }
        accessgetMediaRewindcp accessgetmediarewindcp = this.MediaSessionCompatToken;
        SparseIntArray sparseIntArray = this.PlaybackStateCompatCustomAction;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = accessgetmediarewindcp.write;
        int flexItemCount = accessgetmediaskipforwardcp.getFlexItemCount();
        ArrayList arrayListWrite = accessgetmediarewindcp.write(flexItemCount);
        accessgetMediaPreviouscp accessgetmediapreviouscp = new accessgetMediaPreviouscp();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            accessgetmediapreviouscp.write = 1;
        } else {
            accessgetmediapreviouscp.write = ((FlexItem) layoutParams).PlaybackStateCompat();
        }
        if (i == -1 || i == flexItemCount || i >= accessgetmediaskipforwardcp.getFlexItemCount()) {
            accessgetmediapreviouscp.RemoteActionCompatParcelizer = flexItemCount;
        } else {
            accessgetmediapreviouscp.RemoteActionCompatParcelizer = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((accessgetMediaPreviouscp) arrayListWrite.get(i2)).RemoteActionCompatParcelizer++;
            }
        }
        arrayListWrite.add(accessgetmediapreviouscp);
        this.PlaybackStateCompat = accessgetMediaRewindcp.RemoteActionCompatParcelizer(flexItemCount + 1, arrayListWrite, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void serializer(View view, int i, int i2, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp) {
        if (RemoteActionCompatParcelizer(i, i2)) {
            boolean z = read();
            int i3 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
            if (z) {
                int i4 = this.MediaSessionCompatQueueItem;
                accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i3 + i4;
                accessgetmediaskipbackwardcp.IconCompatParcelizer += i4;
            } else {
                int i5 = this.write;
                accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i3 + i5;
                accessgetmediaskipbackwardcp.IconCompatParcelizer += i5;
            }
        }
    }

    public final void write(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.write + i2);
        this.IconCompatParcelizer.draw(canvas);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void write(accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp) {
        if (read()) {
            if ((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) > 0) {
                int i = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                int i2 = this.MediaSessionCompatQueueItem;
                accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i + i2;
                accessgetmediaskipbackwardcp.IconCompatParcelizer += i2;
                return;
            }
            return;
        }
        if ((this.ResultReceiver & 4) > 0) {
            int i3 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
            int i4 = this.write;
            accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i3 + i4;
            accessgetmediaskipbackwardcp.IconCompatParcelizer += i4;
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewSerializer = serializer(i - i3);
            if (viewSerializer != null && viewSerializer.getVisibility() != 8) {
                if (read()) {
                    return (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 2) != 0;
                }
                return (this.ResultReceiver & 2) != 0;
            }
        }
        if (read()) {
            return (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 1) != 0;
        }
        return (this.ResultReceiver & 1) != 0;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int serializer(int i, int i2, View view) {
        int i3;
        int i4;
        if (read()) {
            i3 = RemoteActionCompatParcelizer(i, i2) ? this.MediaSessionCompatQueueItem : 0;
            if ((this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 4) <= 0) {
                return i3;
            }
            i4 = this.MediaSessionCompatQueueItem;
        } else {
            i3 = RemoteActionCompatParcelizer(i, i2) ? this.write : 0;
            if ((this.ResultReceiver & 4) <= 0) {
                return i3;
            }
            i4 = this.write;
        }
        return i3 + i4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams2);
            layoutParams3.RatingCompat = 1;
            layoutParams3.serializer = 0.0f;
            layoutParams3.read = 1.0f;
            layoutParams3.write = -1;
            layoutParams3.RemoteActionCompatParcelizer = -1.0f;
            layoutParams3.MediaBrowserCompatMediaItem = -1;
            layoutParams3.MediaMetadataCompat = -1;
            layoutParams3.MediaSessionCompatQueueItem = 16777215;
            layoutParams3.IconCompatParcelizer = 16777215;
            layoutParams3.RatingCompat = layoutParams2.RatingCompat;
            layoutParams3.serializer = layoutParams2.serializer;
            layoutParams3.read = layoutParams2.read;
            layoutParams3.write = layoutParams2.write;
            layoutParams3.RemoteActionCompatParcelizer = layoutParams2.RemoteActionCompatParcelizer;
            layoutParams3.MediaBrowserCompatMediaItem = layoutParams2.MediaBrowserCompatMediaItem;
            layoutParams3.MediaMetadataCompat = layoutParams2.MediaMetadataCompat;
            layoutParams3.MediaSessionCompatQueueItem = layoutParams2.MediaSessionCompatQueueItem;
            layoutParams3.IconCompatParcelizer = layoutParams2.IconCompatParcelizer;
            layoutParams3.MediaDescriptionCompat = layoutParams2.MediaDescriptionCompat;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.RatingCompat = 1;
            layoutParams4.serializer = 0.0f;
            layoutParams4.read = 1.0f;
            layoutParams4.write = -1;
            layoutParams4.RemoteActionCompatParcelizer = -1.0f;
            layoutParams4.MediaBrowserCompatMediaItem = -1;
            layoutParams4.MediaMetadataCompat = -1;
            layoutParams4.MediaSessionCompatQueueItem = 16777215;
            layoutParams4.IconCompatParcelizer = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.RatingCompat = 1;
        layoutParams5.serializer = 0.0f;
        layoutParams5.read = 1.0f;
        layoutParams5.write = -1;
        layoutParams5.RemoteActionCompatParcelizer = -1.0f;
        layoutParams5.MediaBrowserCompatMediaItem = -1;
        layoutParams5.MediaMetadataCompat = -1;
        layoutParams5.MediaSessionCompatQueueItem = 16777215;
        layoutParams5.IconCompatParcelizer = 16777215;
        return layoutParams5;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.RatingCompat = 1;
        layoutParams.serializer = 0.0f;
        layoutParams.read = 1.0f;
        layoutParams.write = -1;
        layoutParams.RemoteActionCompatParcelizer = -1.0f;
        layoutParams.MediaBrowserCompatMediaItem = -1;
        layoutParams.MediaMetadataCompat = -1;
        layoutParams.MediaSessionCompatQueueItem = 16777215;
        layoutParams.IconCompatParcelizer = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, accessgetMediaStepForwardcp.FlexboxLayout_Layout);
        layoutParams.RatingCompat = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.serializer = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.read = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.write = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }
}
