package androidx.room;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import bo.app.ah$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.HomeRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.RegexKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.json.internal.JsonElementMarker;
import kotlinx.serialization.protobuf.internal.ProtobufDecoder;
import o.BottomSheetScaffoldKtStandardBottomSheet3;
import o.ButtonColors;
import o.LazyLayoutScrollDeltaBetweenPassesKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.executeRequest;
import o.f4;
import o.getCieXyz;
import o.getItemDecorInsetsForChild;
import o.hf;
import o.onItemDismiss;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$createConnectionManager$3 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$createConnectionManager$3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.IconCompatParcelizer = i3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        boolean zIsFocused;
        PinnableContainer.PinnedHandle pinnedHandlePin;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            return Options.Companion.RemoteActionCompatParcelizer((RoomDatabase) this.MediaMetadataCompat, (ShortNewsContentCardView) obj2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
        }
        int i5 = 4;
        int i6 = 3;
        boolean z = true;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 != 1) {
            if (i4 == 2) {
                Object objM4970access$validateAndSaveResponseLockgIAlus = HomeRepositoryImpl.m4970access$validateAndSaveResponseLockgIAlus((HomeRepositoryImpl) this.MediaMetadataCompat, (getItemDecorInsetsForChild) obj, (ShortNewsContentCardView) obj2);
                return objM4970access$validateAndSaveResponseLockgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? objM4970access$validateAndSaveResponseLockgIAlus : new onItemDismiss(objM4970access$validateAndSaveResponseLockgIAlus);
            }
            if (i4 == 3) {
                String str = (String) obj;
                String str2 = (String) obj2;
                hf hfVar = (hf) this.MediaMetadataCompat;
                hfVar.getClass();
                if (str != null) {
                    hfVar.IconCompatParcelizer.write(new f4(str, str2));
                }
                return createfromparcel;
            }
            if (i4 == 4) {
                r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
                int iIntValue = ((Number) obj2).intValue();
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                JsonElementMarker jsonElementMarker = (JsonElementMarker) this.MediaMetadataCompat;
                jsonElementMarker.getClass();
                if (r8lambda92m0p9sit5uf70mvjf4rwmruda.write(iIntValue) || !r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(iIntValue).MediaBrowserCompatMediaItem()) {
                    z = false;
                } else {
                    int i7 = serializer + 63;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }
                jsonElementMarker.read = z;
                return Boolean.valueOf(z);
            }
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            r8lambda92m0p9sit5uf70mvjf4rwmruda2.getClass();
            ProtobufDecoder protobufDecoder = (ProtobufDecoder) this.MediaMetadataCompat;
            protobufDecoder.getClass();
            if (!r8lambda92m0p9sit5uf70mvjf4rwmruda2.write(iIntValue2)) {
                r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda2.RemoteActionCompatParcelizer(iIntValue2);
                RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                    protobufDecoder.RatingCompat = false;
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        protobufDecoder.RatingCompat = false;
                    } else if (r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                        int i8 = RemoteActionCompatParcelizer + 7;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        protobufDecoder.RatingCompat = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        FocusState focusState = (FocusState) obj;
        FocusState focusState2 = (FocusState) obj2;
        FocusableNode focusableNode = (FocusableNode) this.MediaMetadataCompat;
        if (focusableNode.isAttached() && (zIsFocused = focusState2.isFocused()) != focusState.isFocused()) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = focusableNode.MediaDescriptionCompat;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                int i10 = RemoteActionCompatParcelizer + 93;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(zIsFocused));
            }
            executeRequest executerequest = LazyLayoutScrollDeltaBetweenPassesKt.RemoteActionCompatParcelizer;
            if (zIsFocused) {
                BuildersKt.RemoteActionCompatParcelizer(focusableNode.getCoroutineScope(), null, null, new BlockRunner$cancel$1(focusableNode, shortNewsContentCardView, i5), 3);
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                ObserverModifierNodeKt.observeReads(focusableNode, new ah$$ExternalSyntheticLambda0(createinappmessageeventsubscriber, i6, focusableNode));
                PinnableContainer pinnableContainer = (PinnableContainer) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (pinnableContainer != null) {
                    pinnedHandlePin = pinnableContainer.pin();
                    int i12 = serializer + 69;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    pinnedHandlePin = null;
                }
                focusableNode.MediaSessionCompatQueueItem = pinnedHandlePin;
                LayoutCoordinates layoutCoordinates = focusableNode.write;
                if (layoutCoordinates != null && layoutCoordinates.isAttached() && focusableNode.isAttached()) {
                    TraversableNodeKt.findNearestAncestor(focusableNode, executerequest);
                }
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = focusableNode.MediaSessionCompatQueueItem;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                focusableNode.MediaSessionCompatQueueItem = null;
                if (focusableNode.isAttached()) {
                    TraversableNodeKt.findNearestAncestor(focusableNode, executerequest);
                }
            }
            SemanticsModifierNodeKt.invalidateSemantics(focusableNode);
            MutableInteractionSourceImpl mutableInteractionSourceImpl = focusableNode.RemoteActionCompatParcelizer;
            if (mutableInteractionSourceImpl != null) {
                BottomSheetScaffoldKtStandardBottomSheet3 bottomSheetScaffoldKtStandardBottomSheet3 = focusableNode.serializer;
                if (zIsFocused) {
                    if (bottomSheetScaffoldKtStandardBottomSheet3 != null) {
                        focusableNode.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, new ButtonColors(bottomSheetScaffoldKtStandardBottomSheet3));
                        focusableNode.serializer = null;
                    }
                    BottomSheetScaffoldKtStandardBottomSheet3 bottomSheetScaffoldKtStandardBottomSheet4 = new BottomSheetScaffoldKtStandardBottomSheet3();
                    focusableNode.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, bottomSheetScaffoldKtStandardBottomSheet4);
                    focusableNode.serializer = bottomSheetScaffoldKtStandardBottomSheet4;
                } else if (bottomSheetScaffoldKtStandardBottomSheet3 != null) {
                    focusableNode.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, new ButtonColors(bottomSheetScaffoldKtStandardBottomSheet3));
                    focusableNode.serializer = null;
                }
            }
        }
        return createfromparcel;
    }
}
