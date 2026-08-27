package o;

import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.TargetChange;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.Write;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class onRequestMeasuredefault {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] MediaBrowserCompatMediaItem;
    public static final /* synthetic */ int[] MediaDescriptionCompat;
    public static final /* synthetic */ int[] MediaMetadataCompat;
    public static final /* synthetic */ int[] MediaSessionCompatQueueItem;
    public static final /* synthetic */ int[] MediaSessionCompatResultReceiverWrapper;
    public static final /* synthetic */ int[] ParcelableVolumeInfo;
    public static final /* synthetic */ int[] PlaybackStateCompat;
    public static final /* synthetic */ int[] PlaybackStateCompatCustomAction;
    public static final /* synthetic */ int[] RatingCompat;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[ListenResponse.read.values().length];
        write = iArr;
        try {
            iArr[ListenResponse.read.TARGET_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[ListenResponse.read.DOCUMENT_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[ListenResponse.read.DOCUMENT_DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[ListenResponse.read.DOCUMENT_REMOVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[ListenResponse.read.FILTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[ListenResponse.read.RESPONSETYPE_NOT_SET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[TargetChange.RemoteActionCompatParcelizer.values().length];
        MediaSessionCompatResultReceiverWrapper = iArr2;
        try {
            iArr2[TargetChange.RemoteActionCompatParcelizer.NO_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            MediaSessionCompatResultReceiverWrapper[TargetChange.RemoteActionCompatParcelizer.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            MediaSessionCompatResultReceiverWrapper[TargetChange.RemoteActionCompatParcelizer.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            MediaSessionCompatResultReceiverWrapper[TargetChange.RemoteActionCompatParcelizer.CURRENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            MediaSessionCompatResultReceiverWrapper[TargetChange.RemoteActionCompatParcelizer.RESET.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            MediaSessionCompatResultReceiverWrapper[TargetChange.RemoteActionCompatParcelizer.UNRECOGNIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr3 = new int[StructuredQuery.IconCompatParcelizer.values().length];
        RatingCompat = iArr3;
        try {
            iArr3[StructuredQuery.IconCompatParcelizer.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            RatingCompat[StructuredQuery.IconCompatParcelizer.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        int[] iArr4 = new int[StructuredQuery.FieldFilter.read.values().length];
        MediaDescriptionCompat = iArr4;
        try {
            iArr4[StructuredQuery.FieldFilter.read.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.GREATER_THAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.ARRAY_CONTAINS_ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            MediaDescriptionCompat[StructuredQuery.FieldFilter.read.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr5 = new int[updateUnsafe.values().length];
        serializer = iArr5;
        try {
            iArr5[updateUnsafe.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            serializer[updateUnsafe.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            serializer[updateUnsafe.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            serializer[updateUnsafe.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            serializer[updateUnsafe.GREATER_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            serializer[updateUnsafe.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            serializer[updateUnsafe.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            serializer[updateUnsafe.IN.ordinal()] = 8;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            serializer[updateUnsafe.ARRAY_CONTAINS_ANY.ordinal()] = 9;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            serializer[updateUnsafe.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused34) {
        }
        int[] iArr6 = new int[StructuredQuery.UnaryFilter.write.values().length];
        ParcelableVolumeInfo = iArr6;
        try {
            iArr6[StructuredQuery.UnaryFilter.write.IS_NAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            ParcelableVolumeInfo[StructuredQuery.UnaryFilter.write.IS_NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            ParcelableVolumeInfo[StructuredQuery.UnaryFilter.write.IS_NOT_NAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            ParcelableVolumeInfo[StructuredQuery.UnaryFilter.write.IS_NOT_NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused38) {
        }
        int[] iArr7 = new int[StructuredQuery.Filter.write.values().length];
        MediaMetadataCompat = iArr7;
        try {
            iArr7[StructuredQuery.Filter.write.COMPOSITE_FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            MediaMetadataCompat[StructuredQuery.Filter.write.FIELD_FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            MediaMetadataCompat[StructuredQuery.Filter.write.UNARY_FILTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused41) {
        }
        int[] iArr8 = new int[StructuredQuery.CompositeFilter.read.values().length];
        MediaSessionCompatQueueItem = iArr8;
        try {
            iArr8[StructuredQuery.CompositeFilter.read.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            MediaSessionCompatQueueItem[StructuredQuery.CompositeFilter.read.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused43) {
        }
        int[] iArr9 = new int[linearDiffAborted.values().length];
        RemoteActionCompatParcelizer = iArr9;
        try {
            iArr9[linearDiffAborted.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            RemoteActionCompatParcelizer[linearDiffAborted.OR.ordinal()] = 2;
        } catch (NoSuchFieldError unused45) {
        }
        int[] iArr10 = new int[Value.RemoteActionCompatParcelizer.values().length];
        PlaybackStateCompat = iArr10;
        try {
            iArr10[Value.RemoteActionCompatParcelizer.FIELD_REFERENCE_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            PlaybackStateCompat[Value.RemoteActionCompatParcelizer.FUNCTION_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused47) {
        }
        int[] iArr11 = new int[getWasLayerBlockInvokedui.values().length];
        read = iArr11;
        try {
            iArr11[getWasLayerBlockInvokedui.LISTEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            read[getWasLayerBlockInvokedui.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            read[getWasLayerBlockInvokedui.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            read[getWasLayerBlockInvokedui.LIMBO_RESOLUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused51) {
        }
        int[] iArr12 = new int[DocumentTransform.FieldTransform.IconCompatParcelizer.values().length];
        IconCompatParcelizer = iArr12;
        try {
            iArr12[DocumentTransform.FieldTransform.IconCompatParcelizer.SET_TO_SERVER_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            IconCompatParcelizer[DocumentTransform.FieldTransform.IconCompatParcelizer.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            IconCompatParcelizer[DocumentTransform.FieldTransform.IconCompatParcelizer.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            IconCompatParcelizer[DocumentTransform.FieldTransform.IconCompatParcelizer.INCREMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused55) {
        }
        int[] iArr13 = new int[Precondition.write.values().length];
        MediaBrowserCompatMediaItem = iArr13;
        try {
            iArr13[Precondition.write.UPDATE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            MediaBrowserCompatMediaItem[Precondition.write.EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            MediaBrowserCompatMediaItem[Precondition.write.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused58) {
        }
        int[] iArr14 = new int[Write.write.values().length];
        PlaybackStateCompatCustomAction = iArr14;
        try {
            iArr14[Write.write.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            PlaybackStateCompatCustomAction[Write.write.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            PlaybackStateCompatCustomAction[Write.write.VERIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused61) {
        }
    }
}
