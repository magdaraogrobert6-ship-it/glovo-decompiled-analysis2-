package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import o.getCenterStart;
import o.getEnd;
import o.runAttachLifecycleui;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextPreparedSelection {
    public final AnnotatedString IconCompatParcelizer;
    public final runAttachLifecycleui MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public final long RemoteActionCompatParcelizer;
    public final AnnotatedString read;
    public final TextLayoutResult serializer;
    public final OffsetMapping write;

    public final void ComponentActivity() {
        if (this.IconCompatParcelizer.getText().length() > 0) {
            this.MediaDescriptionCompat = TextRangeKt.TextRange(TextRange.m3076getStartimpl(this.RemoteActionCompatParcelizer), TextRange.m3071getEndimpl(this.MediaDescriptionCompat));
        }
    }

    public final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int iM3071getEndimpl = TextRange.m3071getEndimpl(this.MediaDescriptionCompat);
        OffsetMapping offsetMapping = this.write;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3071getEndimpl);
        runAttachLifecycleui runattachlifecycleui = this.MediaBrowserCompatMediaItem;
        if (runattachlifecycleui.serializer == null) {
            runattachlifecycleui.serializer = Float.valueOf(textLayoutResult.getCursorRect(iOriginalToTransformed).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iOriginalToTransformed) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.IconCompatParcelizer.getText().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset);
        Float f = runattachlifecycleui.serializer;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((write() && fFloatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!write() && fFloatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return offsetMapping.transformedToOriginal(textLayoutResult.m3046getOffsetForPositionk4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f.floatValue())) << 32) | (((long) Float.floatToRawIntBits(lineBottom - 1.0f)) & 4294967295L))));
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, runAttachLifecycleui runattachlifecycleui) {
        this.read = annotatedString;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = textLayoutResult;
        this.write = offsetMapping;
        this.MediaBrowserCompatMediaItem = runattachlifecycleui;
        this.MediaDescriptionCompat = j;
        this.IconCompatParcelizer = annotatedString;
    }

    public final void MediaBrowserCompatMediaItem() {
        int iSerializer;
        this.MediaBrowserCompatMediaItem.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() <= 0 || (iSerializer = getEnd.serializer(annotatedString.getText(), TextRange.m3071getEndimpl(this.MediaDescriptionCompat))) == -1) {
            return;
        }
        read(iSerializer, iSerializer);
    }

    public final void MediaDescriptionCompat() {
        Integer num;
        Integer numIconCompatParcelizer;
        runAttachLifecycleui runattachlifecycleui = this.MediaBrowserCompatMediaItem;
        runattachlifecycleui.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() > 0) {
            if (write()) {
                runattachlifecycleui.serializer = null;
                if (annotatedString.getText().length() <= 0 || (numIconCompatParcelizer = IconCompatParcelizer()) == null) {
                    return;
                }
                int iIntValue = numIconCompatParcelizer.intValue();
                read(iIntValue, iIntValue);
                return;
            }
            runattachlifecycleui.serializer = null;
            if (annotatedString.getText().length() <= 0 || (num = read()) == null) {
                return;
            }
            int iIntValue2 = num.intValue();
            read(iIntValue2, iIntValue2);
        }
    }

    public final void MediaMetadataCompat() {
        this.MediaBrowserCompatMediaItem.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() > 0) {
            int iIconCompatParcelizer = getCenterStart.IconCompatParcelizer(TextRange.m3073getMaximpl(this.MediaDescriptionCompat), annotatedString.getText());
            if (iIconCompatParcelizer == TextRange.m3073getMaximpl(this.MediaDescriptionCompat) && iIconCompatParcelizer != annotatedString.getText().length()) {
                iIconCompatParcelizer = getCenterStart.IconCompatParcelizer(iIconCompatParcelizer + 1, annotatedString.getText());
            }
            read(iIconCompatParcelizer, iIconCompatParcelizer);
        }
    }

    public final void MediaSessionCompatQueueItem() {
        this.MediaBrowserCompatMediaItem.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() > 0) {
            int iSerializer = getCenterStart.serializer(TextRange.m3074getMinimpl(this.MediaDescriptionCompat), annotatedString.getText());
            if (iSerializer == TextRange.m3074getMinimpl(this.MediaDescriptionCompat) && iSerializer != 0) {
                iSerializer = getCenterStart.serializer(iSerializer - 1, annotatedString.getText());
            }
            read(iSerializer, iSerializer);
        }
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        Integer numValueOf = null;
        this.MediaBrowserCompatMediaItem.serializer = null;
        if (this.IconCompatParcelizer.getText().length() > 0) {
            TextLayoutResult textLayoutResult = this.serializer;
            if (textLayoutResult != null) {
                int iM3074getMinimpl = TextRange.m3074getMinimpl(this.MediaDescriptionCompat);
                OffsetMapping offsetMapping = this.write;
                numValueOf = Integer.valueOf(offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(offsetMapping.originalToTransformed(iM3074getMinimpl)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                read(iIntValue, iIntValue);
            }
        }
    }

    public final void MediaSessionCompatToken() {
        this.MediaBrowserCompatMediaItem.serializer = null;
        if (this.IconCompatParcelizer.getText().length() > 0) {
            if (write()) {
                MediaSessionCompatResultReceiverWrapper();
            } else {
                PlaybackStateCompat();
            }
        }
    }

    public final void ParcelableVolumeInfo() {
        this.MediaBrowserCompatMediaItem.serializer = null;
        if (this.IconCompatParcelizer.getText().length() > 0) {
            if (write()) {
                PlaybackStateCompat();
            } else {
                MediaSessionCompatResultReceiverWrapper();
            }
        }
    }

    public final void PlaybackStateCompat() {
        Integer numSerializer;
        this.MediaBrowserCompatMediaItem.serializer = null;
        if (this.IconCompatParcelizer.getText().length() <= 0 || (numSerializer = serializer()) == null) {
            return;
        }
        int iIntValue = numSerializer.intValue();
        read(iIntValue, iIntValue);
    }

    public final void PlaybackStateCompatCustomAction() {
        Integer numIconCompatParcelizer;
        Integer num;
        runAttachLifecycleui runattachlifecycleui = this.MediaBrowserCompatMediaItem;
        runattachlifecycleui.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() > 0) {
            if (write()) {
                runattachlifecycleui.serializer = null;
                if (annotatedString.getText().length() <= 0 || (num = read()) == null) {
                    return;
                }
                int iIntValue = num.intValue();
                read(iIntValue, iIntValue);
                return;
            }
            runattachlifecycleui.serializer = null;
            if (annotatedString.getText().length() <= 0 || (numIconCompatParcelizer = IconCompatParcelizer()) == null) {
                return;
            }
            int iIntValue2 = numIconCompatParcelizer.intValue();
            read(iIntValue2, iIntValue2);
        }
    }

    public final void RatingCompat() {
        int iWrite;
        runAttachLifecycleui runattachlifecycleui = this.MediaBrowserCompatMediaItem;
        runattachlifecycleui.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() > 0) {
            if (!write()) {
                MediaBrowserCompatMediaItem();
                return;
            }
            runattachlifecycleui.serializer = null;
            if (annotatedString.getText().length() <= 0 || (iWrite = getEnd.write(annotatedString.getText(), TextRange.m3071getEndimpl(this.MediaDescriptionCompat))) == -1) {
                return;
            }
            read(iWrite, iWrite);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int iWrite;
        runAttachLifecycleui runattachlifecycleui = this.MediaBrowserCompatMediaItem;
        runattachlifecycleui.serializer = null;
        AnnotatedString annotatedString = this.IconCompatParcelizer;
        if (annotatedString.getText().length() > 0) {
            if (write()) {
                MediaBrowserCompatMediaItem();
                return;
            }
            runattachlifecycleui.serializer = null;
            if (annotatedString.getText().length() <= 0 || (iWrite = getEnd.write(annotatedString.getText(), TextRange.m3071getEndimpl(this.MediaDescriptionCompat))) == -1) {
                return;
            }
            read(iWrite, iWrite);
        }
    }

    public final Integer IconCompatParcelizer() {
        int iTransformedToOriginal;
        TextLayoutResult textLayoutResult = this.serializer;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3071getEndimpl = TextRange.m3071getEndimpl(this.MediaDescriptionCompat);
        OffsetMapping offsetMapping = this.write;
        for (int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3071getEndimpl); iOriginalToTransformed > 0; iOriginalToTransformed--) {
            int length = this.IconCompatParcelizer.getText().length() - 1;
            if (iOriginalToTransformed <= length) {
                length = iOriginalToTransformed;
            }
            long jM3048getWordBoundaryjx7JFs = textLayoutResult.m3048getWordBoundaryjx7JFs(length);
            if (TextRange.m3076getStartimpl(jM3048getWordBoundaryjx7JFs) < iOriginalToTransformed) {
                iTransformedToOriginal = offsetMapping.transformedToOriginal(TextRange.m3076getStartimpl(jM3048getWordBoundaryjx7JFs));
                return Integer.valueOf(iTransformedToOriginal);
            }
        }
        iTransformedToOriginal = 0;
        return Integer.valueOf(iTransformedToOriginal);
    }

    public final Integer read() {
        int length;
        TextLayoutResult textLayoutResult = this.serializer;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3071getEndimpl = TextRange.m3071getEndimpl(this.MediaDescriptionCompat);
        OffsetMapping offsetMapping = this.write;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(iM3071getEndimpl);
        while (true) {
            AnnotatedString annotatedString = this.read;
            if (iOriginalToTransformed < annotatedString.length()) {
                int length2 = this.IconCompatParcelizer.getText().length() - 1;
                if (iOriginalToTransformed <= length2) {
                    length2 = iOriginalToTransformed;
                }
                long jM3048getWordBoundaryjx7JFs = textLayoutResult.m3048getWordBoundaryjx7JFs(length2);
                if (TextRange.m3071getEndimpl(jM3048getWordBoundaryjx7JFs) > iOriginalToTransformed) {
                    length = offsetMapping.transformedToOriginal(TextRange.m3071getEndimpl(jM3048getWordBoundaryjx7JFs));
                    break;
                }
                iOriginalToTransformed++;
            } else {
                length = annotatedString.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final void read(int i, int i2) {
        this.MediaDescriptionCompat = TextRangeKt.TextRange(i, i2);
    }

    public final Integer serializer() {
        TextLayoutResult textLayoutResult = this.serializer;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3073getMaximpl = TextRange.m3073getMaximpl(this.MediaDescriptionCompat);
        OffsetMapping offsetMapping = this.write;
        return Integer.valueOf(offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(offsetMapping.originalToTransformed(iM3073getMaximpl)), true)));
    }

    public final boolean write() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.serializer;
        if (textLayoutResult != null) {
            paragraphDirection = textLayoutResult.getParagraphDirection(this.write.originalToTransformed(TextRange.m3071getEndimpl(this.MediaDescriptionCompat)));
        } else {
            paragraphDirection = null;
        }
        return paragraphDirection != ResolvedTextDirection.Rtl;
    }
}
