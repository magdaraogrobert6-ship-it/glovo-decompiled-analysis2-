package o;

import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyFocusedRect extends androidx.lifecycle.ViewModel {
    private static int ParcelableVolumeInfo = 0;
    private static int ResultReceiver = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final ReportPictureUseCase MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final ReportPictureUseCase MediaSessionCompatQueueItem;
    public final LinkedHashMap MediaSessionCompatResultReceiverWrapper;
    public final Vw$Vw MediaSessionCompatToken;
    public final UpdateStateUseCaseImpl PlaybackStateCompat;
    public final com.huawei.wisesecurity.ucs_credential.n0 PlaybackStateCompatCustomAction;
    public final setTransactionSuccessful RatingCompat;
    public final getDoneeUduSuo RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getQueryContext serializer;
    public final hasFlag write;

    public notifyFocusedRect(getQueryContext getquerycontext, Parser.Pair pair, Vw$Vw vw$Vw, ReportPictureUseCase reportPictureUseCase, ReportPictureUseCase reportPictureUseCase2, UpdateStateUseCaseImpl updateStateUseCaseImpl, setTransactionSuccessful settransactionsuccessful, com.huawei.wisesecurity.ucs_credential.n0 n0Var, getDoneeUduSuo getdoneeudusuo, hasFlag hasflag) {
        getquerycontext.getClass();
        pair.getClass();
        vw$Vw.getClass();
        reportPictureUseCase.getClass();
        reportPictureUseCase2.getClass();
        updateStateUseCaseImpl.getClass();
        settransactionsuccessful.getClass();
        n0Var.getClass();
        getdoneeudusuo.getClass();
        hasflag.getClass();
        this.serializer = getquerycontext;
        this.MediaSessionCompatToken = vw$Vw;
        this.MediaSessionCompatQueueItem = reportPictureUseCase;
        this.MediaBrowserCompatMediaItem = reportPictureUseCase2;
        this.PlaybackStateCompat = updateStateUseCaseImpl;
        this.RatingCompat = settransactionsuccessful;
        this.PlaybackStateCompatCustomAction = n0Var;
        this.RemoteActionCompatParcelizer = getdoneeudusuo;
        this.write = hasflag;
        this.read = StateFlowKt.read(new OffsetMappingCompanion("", null, false, SimpleItemTouchHelperCallback.serializer, null, false));
        this.MediaDescriptionCompat = FlowKt.write(FlowKt.serializer(new SignInDataStore$get$$inlined$map$1(FlowKt.serializer(((CrowdSourcingImageRepositoryImpl) pair.RemoteActionCompatParcelizer).serializer()), (com.huawei.wisesecurity.ucs_credential.g0) pair.write, 10)), toBitmapConfig1JJdX4A.IconCompatParcelizer(this), SharingStarted.Companion.RemoteActionCompatParcelizer, null);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(restartInput.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = new LinkedHashMap();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 4), 3);
    }

    public final void IconCompatParcelizer(ImeOptions imeOptions) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 119;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        updateExtractedText updateextractedtext = null;
        if (i2 % 2 == 0) {
            boolean z = this.MediaMetadataCompat.read() instanceof updateExtractedText;
            throw null;
        }
        Object obj = this.MediaMetadataCompat.read();
        if (obj instanceof updateExtractedText) {
            int i3 = ResultReceiver;
            int i4 = i3 + 99;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 33;
            ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            updateextractedtext = (updateExtractedText) obj;
        }
        if (updateextractedtext == null) {
            return;
        }
        this.RemoteActionCompatParcelizer.write(updateextractedtext.MediaSessionCompatQueueItem.size(), imeOptions);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r0
  0x002a: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v32 java.lang.Object) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void IconCompatParcelizer(PasswordVisualTransformation passwordVisualTransformation) {
        Object obj;
        updateExtractedText updateextractedtext;
        OffsetMappingCompanionIdentity1 offsetMappingCompanionIdentity1;
        Object next;
        PartialGapBuffer partialGapBuffer;
        OffsetMappingCompanionIdentity1 offsetMappingCompanionIdentity2;
        int i = 2 % 2;
        int i2 = ResultReceiver + 71;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj = this.IconCompatParcelizer.read();
            int i3 = 36 / 0;
            if (obj instanceof updateExtractedText) {
                updateextractedtext = (updateExtractedText) obj;
            } else {
                updateextractedtext = null;
            }
        } else {
            obj = this.IconCompatParcelizer.read();
            if (obj instanceof updateExtractedText) {
                updateextractedtext = (updateExtractedText) obj;
            } else {
                updateextractedtext = null;
            }
        }
        if (updateextractedtext == null) {
            return;
        }
        String str = updateextractedtext.PlaybackStateCompat;
        originalToTransformed originaltotransformed = (originalToTransformed) this.MediaDescriptionCompat.read();
        if (originaltotransformed != null) {
            Iterator<E> it = originaltotransformed.write.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getIdentity) next).RemoteActionCompatParcelizer, str}, getCieXyz.write())).booleanValue());
            getIdentity getidentity = (getIdentity) next;
            if (getidentity != null) {
                int i4 = hideSoftwareKeyboard.read[passwordVisualTransformation.ordinal()];
                if (i4 != 1) {
                    int i5 = ResultReceiver + 7;
                    int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    ParcelableVolumeInfo = i6;
                    if (i5 % 2 == 0 ? i4 == 2 : i4 == 5) {
                        partialGapBuffer = getidentity.read;
                        if (partialGapBuffer != null) {
                            offsetMappingCompanionIdentity2 = partialGapBuffer.RemoteActionCompatParcelizer;
                        } else {
                            offsetMappingCompanionIdentity2 = null;
                        }
                    } else {
                        if (i4 != 3) {
                            int i7 = i6 + 115;
                            ResultReceiver = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            if (i4 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                        }
                        PartialGapBuffer partialGapBuffer2 = getidentity.write;
                        if (partialGapBuffer2 != null) {
                            offsetMappingCompanionIdentity2 = partialGapBuffer2.RemoteActionCompatParcelizer;
                        } else {
                            offsetMappingCompanionIdentity2 = null;
                        }
                    }
                } else {
                    partialGapBuffer = getidentity.read;
                    if (partialGapBuffer != null) {
                        offsetMappingCompanionIdentity2 = partialGapBuffer.RemoteActionCompatParcelizer;
                    } else {
                        offsetMappingCompanionIdentity2 = null;
                    }
                }
                offsetMappingCompanionIdentity1 = offsetMappingCompanionIdentity2;
            } else {
                offsetMappingCompanionIdentity1 = null;
            }
        } else {
            offsetMappingCompanionIdentity1 = null;
        }
        if (offsetMappingCompanionIdentity1 == null) {
            Timber.RemoteActionCompatParcelizer.write(new IllegalStateException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Vote request not found for imageId=", str)));
        }
        if (offsetMappingCompanionIdentity1 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.MediaSessionCompatResultReceiverWrapper;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) linkedHashMap.get(str);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        linkedHashMap.put(str, BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new NavHostKt$NavHost$29$1(this, str, passwordVisualTransformation, offsetMappingCompanionIdentity1, null, 24), 3));
        int i9 = ResultReceiver + 61;
        ParcelableVolumeInfo = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
