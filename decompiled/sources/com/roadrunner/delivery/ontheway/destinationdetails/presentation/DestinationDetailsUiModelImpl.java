package com.roadrunner.delivery.ontheway.destinationdetails.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ImageLoader$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.re2j.Parser;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.address.presentation.DestinationAddressUiModelImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesLinkUiModelImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.destinationdetails.api.DestinationDetailsUiModel;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.FontVariationSettingInt;
import o.ShortNewsContentCardView;
import o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1;
import o.VisualTransformation;
import o.accessgetSendcp;
import o.gapLength;
import o.getHeadingrAG3T2k;
import o.getNoneeUduSuo;
import o.getOffsetMapping;
import o.getQueryContext;
import o.getSharedElementTargetNames;
import o.hasFlag;
import o.instance_delegatelambda0;
import o.isStateSaved;
import o.onViewCreated;
import o.performCreate;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.transformCanvas;

/* JADX INFO: loaded from: classes3.dex */
public final class DestinationDetailsUiModelImpl implements DestinationDetailsUiModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final ContextScope IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final StateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DestinationDetailsUiModelImpl(SignInDataStore signInDataStore, isStateSaved isstatesaved, getNoneeUduSuo getnoneeudusuo, ContextScope contextScope) {
        ShortNewsContentCardView shortNewsContentCardView;
        this.IconCompatParcelizer = contextScope;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(bool);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(instance_delegatelambda0.write);
        this.serializer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        ImageLoader$Builder imageLoader$Builder = ((accessgetSendcp) signInDataStore.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) imageLoader$Builder.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        gapLength gaplength = (gapLength) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) imageLoader$Builder.IconCompatParcelizer).write();
        objWrite2.getClass();
        performCreate performcreate = (performCreate) ((getSharedElementTargetNames) imageLoader$Builder.read).write();
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) imageLoader$Builder.serializer).write();
        objWrite3.getClass();
        DestinationAddressUiModelImpl destinationAddressUiModelImpl = new DestinationAddressUiModelImpl(gaplength, contextScope, (isStateSaved) objWrite2, performcreate, (getHeadingrAG3T2k) objWrite3);
        ProtobufEncoder protobufEncoder = ((getOffsetMapping) signInDataStore.serializer).RemoteActionCompatParcelizer;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
        objWrite4.getClass();
        TextInputServiceAndroid_androidKtExternalSyntheticLambda1 textInputServiceAndroid_androidKtExternalSyntheticLambda1 = (TextInputServiceAndroid_androidKtExternalSyntheticLambda1) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.serializer).write();
        objWrite5.getClass();
        List list = SQLite.read(destinationAddressUiModelImpl, new DeliveryNotesUiModelImpl(textInputServiceAndroid_androidKtExternalSyntheticLambda1, contextScope, (hasFlag) objWrite5, (Parser.Pair) ((transformCanvas) protobufEncoder.RemoteActionCompatParcelizer).write(), new getQueryContext()), new DeliveryNotesLinkUiModelImpl((SendTestPushUseCase) ((FontVariationSettingInt) ((VisualTransformation) signInDataStore.read).serializer.read).write(), contextScope, new getQueryContext()));
        this.MediaMetadataCompat = list;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(bool);
        this.read = mutableStateFlow3;
        this.MediaSessionCompatQueueItem = mutableStateFlow3;
        Iterator it = list.iterator();
        while (true) {
            shortNewsContentCardView = null;
            if (!it.hasNext()) {
                break;
            }
            BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1((onViewCreated) it.next(), this, shortNewsContentCardView, 8), 3);
            int i = MediaBrowserCompatMediaItem + 77;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        if (getnoneeudusuo.IconCompatParcelizer()) {
            BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(isstatesaved, this, shortNewsContentCardView, 9), 3);
            int i3 = RatingCompat + 119;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            int i4 = 2 % 2;
        }
    }
}
