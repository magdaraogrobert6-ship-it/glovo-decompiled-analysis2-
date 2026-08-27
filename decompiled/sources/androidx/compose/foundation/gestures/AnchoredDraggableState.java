package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda4;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.YieldKt;
import o.AndroidContentCaptureManager;
import o.CoreTextFieldKtTextFieldCursorHandle2111;
import o.HeightInLinesNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextFieldCursor_androidKt;
import o.TriStateCheckbox;
import o.accessanimateWithTarget;
import o.accessisRelatedToAutoCommit;
import o.applyMeasureResultfoundation;
import o.awaitScrollDependencies;
import o.createFromParcel;
import o.getCharSequenceBounds;
import o.getContentCaptureSessionui;
import o.getPersonFullName;
import o.getPersonLastName;
import o.instance_delegatelambda0;
import o.onShowTranslationui;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableState {
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final populate MediaBrowserCompatMediaItem;
    public MapApiError$$ExternalSyntheticLambda1 MediaDescriptionCompat;
    public final PopulateViewStructure_androidKtpopulate7 MediaMetadataCompat;
    public requiredWidthInVpY3zN4default MediaSessionCompatResultReceiverWrapper;
    public final getPersonLastName ParcelableVolumeInfo;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompat;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 PlaybackStateCompatCustomAction;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public accessanimateWithTarget read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final HeightInLinesNode write;
    public final awaitScrollDependencies MediaSessionCompatQueueItem = new awaitScrollDependencies();
    public final populate RatingCompat = getPersonFullName.RemoteActionCompatParcelizer(Float.NaN);

    public final TextFieldCursor_androidKt IconCompatParcelizer() {
        return (TextFieldCursor_androidKt) this.RemoteActionCompatParcelizer.getValue();
    }

    public final float RemoteActionCompatParcelizer() {
        return ((getContentCaptureSessionui) this.RatingCompat).serializer();
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        ((onShowTranslationui) this.IconCompatParcelizer).setValue(obj);
    }

    public final float IconCompatParcelizer(float f) {
        float fMin;
        float fRemoteActionCompatParcelizer = Float.isNaN(RemoteActionCompatParcelizer()) ? 0.0f : RemoteActionCompatParcelizer();
        float[] fArr = IconCompatParcelizer().write;
        float fMax = Float.NaN;
        int i = 1;
        if (fArr.length != 0) {
            fMin = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    fMin = Math.min(fMin, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            fMin = Float.NaN;
        }
        float[] fArr2 = IconCompatParcelizer().write;
        if (fArr2.length != 0) {
            fMax = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    fMax = Math.max(fMax, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return RangesKt.write(fRemoteActionCompatParcelizer + f, fMin, fMax);
    }

    public final boolean serializer() {
        return (this.MediaDescriptionCompat == null || this.PlaybackStateCompatCustomAction == null || this.MediaSessionCompatResultReceiverWrapper == null || this.read == null) ? false : true;
    }

    public final float write() {
        if (Float.isNaN(RemoteActionCompatParcelizer())) {
            TriStateCheckbox.RemoteActionCompatParcelizer("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object anchoredDrag(Object obj, applyMeasureResultfoundation applymeasureresultfoundation, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, ContinuationImpl continuationImpl) {
        CoreTextFieldKtTextFieldCursorHandle2111 coreTextFieldKtTextFieldCursorHandle2111;
        if (continuationImpl instanceof CoreTextFieldKtTextFieldCursorHandle2111) {
            coreTextFieldKtTextFieldCursorHandle2111 = (CoreTextFieldKtTextFieldCursorHandle2111) continuationImpl;
            int i = coreTextFieldKtTextFieldCursorHandle2111.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                coreTextFieldKtTextFieldCursorHandle2111.serializer = i - Integer.MIN_VALUE;
            } else {
                coreTextFieldKtTextFieldCursorHandle2111 = new CoreTextFieldKtTextFieldCursorHandle2111(this, continuationImpl);
            }
        } else {
            coreTextFieldKtTextFieldCursorHandle2111 = new CoreTextFieldKtTextFieldCursorHandle2111(this, continuationImpl);
        }
        CoreTextFieldKtTextFieldCursorHandle2111 coreTextFieldKtTextFieldCursorHandle2112 = coreTextFieldKtTextFieldCursorHandle2111;
        Object obj2 = coreTextFieldKtTextFieldCursorHandle2112.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = coreTextFieldKtTextFieldCursorHandle2112.serializer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.MediaMetadataCompat;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                if (IconCompatParcelizer().serializer.indexOf(obj) != -1) {
                    awaitScrollDependencies awaitscrolldependencies = this.MediaSessionCompatQueueItem;
                    TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, obj, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, null, 1);
                    coreTextFieldKtTextFieldCursorHandle2112.serializer = 1;
                    awaitscrolldependencies.getClass();
                    if (YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) awaitscrolldependencies, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) anonymousClass2, (ShortNewsContentCardView) null, 0), coreTextFieldKtTextFieldCursorHandle2112) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (((Boolean) this.serializer.invoke(obj)).booleanValue()) {
                    ((onShowTranslationui) this.PlaybackStateCompat).setValue(obj);
                    RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            populateViewStructure_androidKtpopulate7 = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
            populateViewStructure_androidKtpopulate7.setValue(null);
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(null);
            throw th;
        }
    }

    public AnchoredDraggableState(getCharSequenceBounds getcharsequencebounds, RoomDatabase$$ExternalSyntheticLambda4 roomDatabase$$ExternalSyntheticLambda4) {
        this.serializer = new accessisRelatedToAutoCommit(23);
        this.IconCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(getcharsequencebounds);
        this.PlaybackStateCompat = CompositionKt.RemoteActionCompatParcelizer(getcharsequencebounds);
        final int i = 0;
        this.ParcelableVolumeInfo = CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getEditsText
            public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState read;

            {
                this.read = this;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0049  */
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                float fWrite;
                int i2 = i;
                androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = this.read;
                if (i2 != 0) {
                    float fSerializer = anchoredDraggableState.IconCompatParcelizer().serializer(((onShowTranslationui) anchoredDraggableState.PlaybackStateCompat).getValue());
                    float fSerializer2 = anchoredDraggableState.IconCompatParcelizer().serializer(anchoredDraggableState.ParcelableVolumeInfo.getValue()) - fSerializer;
                    float fAbs = Math.abs(fSerializer2);
                    if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                        fWrite = 1.0f;
                    } else {
                        fWrite = (anchoredDraggableState.write() - fSerializer) / fSerializer2;
                        if (fWrite < 1.0E-6f) {
                            fWrite = 0.0f;
                        } else if (fWrite > 0.999999f) {
                            fWrite = 1.0f;
                        }
                    }
                    return Float.valueOf(fWrite);
                }
                Object value = ((onShowTranslationui) anchoredDraggableState.MediaMetadataCompat).getValue();
                if (value != null) {
                    return value;
                }
                float fRemoteActionCompatParcelizer = anchoredDraggableState.RemoteActionCompatParcelizer();
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = anchoredDraggableState.IconCompatParcelizer;
                if (Float.isNaN(fRemoteActionCompatParcelizer)) {
                    return ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue();
                }
                onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
                float fSerializer3 = anchoredDraggableState.IconCompatParcelizer().serializer(onshowtranslationui.getValue());
                if (Float.isNaN(fSerializer3) || fRemoteActionCompatParcelizer == fSerializer3) {
                    return onshowtranslationui.getValue();
                }
                Object obj = anchoredDraggableState.IconCompatParcelizer().read(fRemoteActionCompatParcelizer);
                return obj == null ? onshowtranslationui.getValue() : obj;
            }
        });
        final int i2 = 1;
        CompositionKt.serializer(AndroidContentCaptureManager.write, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getEditsText
            public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState read;

            {
                this.read = this;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0049  */
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                float fWrite;
                int i3 = i2;
                androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = this.read;
                if (i3 != 0) {
                    float fSerializer = anchoredDraggableState.IconCompatParcelizer().serializer(((onShowTranslationui) anchoredDraggableState.PlaybackStateCompat).getValue());
                    float fSerializer2 = anchoredDraggableState.IconCompatParcelizer().serializer(anchoredDraggableState.ParcelableVolumeInfo.getValue()) - fSerializer;
                    float fAbs = Math.abs(fSerializer2);
                    if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                        fWrite = 1.0f;
                    } else {
                        fWrite = (anchoredDraggableState.write() - fSerializer) / fSerializer2;
                        if (fWrite < 1.0E-6f) {
                            fWrite = 0.0f;
                        } else if (fWrite > 0.999999f) {
                            fWrite = 1.0f;
                        }
                    }
                    return Float.valueOf(fWrite);
                }
                Object value = ((onShowTranslationui) anchoredDraggableState.MediaMetadataCompat).getValue();
                if (value != null) {
                    return value;
                }
                float fRemoteActionCompatParcelizer = anchoredDraggableState.RemoteActionCompatParcelizer();
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = anchoredDraggableState.IconCompatParcelizer;
                if (Float.isNaN(fRemoteActionCompatParcelizer)) {
                    return ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue();
                }
                onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
                float fSerializer3 = anchoredDraggableState.IconCompatParcelizer().serializer(onshowtranslationui.getValue());
                if (Float.isNaN(fSerializer3) || fRemoteActionCompatParcelizer == fSerializer3) {
                    return onshowtranslationui.getValue();
                }
                Object obj = anchoredDraggableState.IconCompatParcelizer().read(fRemoteActionCompatParcelizer);
                return obj == null ? onshowtranslationui.getValue() : obj;
            }
        });
        this.MediaBrowserCompatMediaItem = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
        this.MediaMetadataCompat = CompositionKt.RemoteActionCompatParcelizer(null);
        this.RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(new TextFieldCursor_androidKt(instance_delegatelambda0.write, new float[0]));
        this.write = new HeightInLinesNode(this);
        this.serializer = roomDatabase$$ExternalSyntheticLambda4;
    }
}
