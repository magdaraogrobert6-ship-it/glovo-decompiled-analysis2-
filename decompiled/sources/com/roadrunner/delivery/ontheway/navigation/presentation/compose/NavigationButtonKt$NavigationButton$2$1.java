package com.roadrunner.delivery.ontheway.navigation.presentation.compose;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsViewModel$1;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesLinkUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesLinkUiModelImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import o.AndroidDefaultTypeface;
import o.DefaultImpl;
import o.KeyboardType;
import o.ShortNewsContentCardView;
import o.TextInputServiceAndroidTextInputCommand;
import o.TextInputServiceAndroidcreateInputConnection1;
import o.TextInputServiceAndroidstopInput2;
import o.accessgetBaseInputConnection;
import o.accessgetCharacterscp;
import o.accessgetCursorAnchorInfoControllerp;
import o.accessgetIcsp;
import o.createCharSequence;
import o.createFromParcel;
import o.getBaseInputConnection;
import o.getCharactersIUNYP9k;
import o.getNativeTypefacePYhJU0U;
import o.getPlatformLocaleDelegate;
import o.getQueryContext;
import o.getTextBeforeSelection;
import o.getUnspecifiedeUduSuo;
import o.getWordsIUNYP9kannotations;
import o.inCompatibilityMode;
import o.isEditorFocused;
import o.isIncludeFontPaddingEnabled;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.parseLanguageTag;
import o.prepareForActivityTransitionCarryover;
import o.processInputCommands;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdazNpvCQLl1ENH3QB4YtK5xCBYq3w;
import o.removeNodeAtDepth;
import o.resolveTextDirectionHeuristicsHklW4sAdefault;
import o.sendSynthesizedKeyEvent;
import o.toBitmapConfig1JJdX4A;
import o.toUrlLink;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NavigationButtonKt$NavigationButton$2$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationButtonKt$NavigationButton$2$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.write = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r14v14 */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        InAppCameraOverlay.Tags tags;
        getBaseInputConnection getbaseinputconnection;
        int i = 2 % 2;
        int i2 = this.write;
        getTextBeforeSelection gettextbeforeselection = getTextBeforeSelection.read;
        AndroidDefaultTypeface androidDefaultTypeface = AndroidDefaultTypeface.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 17;
        int i4 = R.drawable.ic_bold_large_open_in_full_default;
        int i5 = 1;
        getBaseInputConnection getbaseinputconnection2 = 0;
        TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2 = null;
        KeyboardType keyboardType = null;
        switch (i2) {
            case 0:
                ((NavigationButtonUiModelImpl) this.MediaMetadataCompat).serializer();
                return createfromparcel;
            case 1:
                ((sendSynthesizedKeyEvent) ((accessgetCharacterscp) this.MediaMetadataCompat)).RemoteActionCompatParcelizer();
                return createfromparcel;
            case 2:
                ((sendSynthesizedKeyEvent) ((accessgetCharacterscp) this.MediaMetadataCompat)).RemoteActionCompatParcelizer();
                return createfromparcel;
            case 3:
                isEditorFocused iseditorfocused = (isEditorFocused) this.MediaMetadataCompat;
                accessgetBaseInputConnection accessgetbaseinputconnection = (accessgetBaseInputConnection) iseditorfocused.IconCompatParcelizer.read();
                if (accessgetbaseinputconnection instanceof processInputCommands) {
                    tags = ((processInputCommands) accessgetbaseinputconnection).write;
                } else {
                    if (!(accessgetbaseinputconnection instanceof getBaseInputConnection)) {
                        if (accessgetbaseinputconnection instanceof r8lambdazNpvCQLl1ENH3QB4YtK5xCBYq3w) {
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i6 = serializer + 19;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        InAppCameraOverlay.Tags tags2 = ((getBaseInputConnection) accessgetbaseinputconnection).read;
                        getbaseinputconnection2.hashCode();
                        throw null;
                    }
                    tags = ((getBaseInputConnection) accessgetbaseinputconnection).read;
                }
                File cacheDir = iseditorfocused.RemoteActionCompatParcelizer.getCacheDir();
                cacheDir.getClass();
                String absolutePath = r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.RemoteActionCompatParcelizer(cacheDir, "content_sharing_" + System.currentTimeMillis() + ".jpg").getAbsolutePath();
                getQueryContext getquerycontext = iseditorfocused.MediaDescriptionCompat;
                absolutePath.getClass();
                getquerycontext.serializer(new accessgetIcsp(absolutePath, tags, ((FirebaseRemoteConfigImpl) iseditorfocused.MediaSessionCompatQueueItem).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CROWDSOURCING_ZOOM_CONTROLS_ENABLED.getFirebaseFlagName())));
                return createfromparcel;
            case 4:
                isEditorFocused iseditorfocused2 = (isEditorFocused) this.MediaMetadataCompat;
                if (iseditorfocused2.read.isEmpty()) {
                    iseditorfocused2.MediaDescriptionCompat.serializer(gettextbeforeselection);
                }
                return createfromparcel;
            case 5:
                isEditorFocused iseditorfocused3 = (isEditorFocused) this.MediaMetadataCompat;
                Object obj = iseditorfocused3.IconCompatParcelizer.read();
                if (obj instanceof getBaseInputConnection) {
                    getbaseinputconnection = (getBaseInputConnection) obj;
                }
                if (getbaseinputconnection2 != 0 && iseditorfocused3.read.size() < getbaseinputconnection2.IconCompatParcelizer) {
                    getbaseinputconnection2 = getbaseinputconnection;
                    iseditorfocused3.RatingCompat.read(getUnspecifiedeUduSuo.ADD_MORE_IMAGE);
                    iseditorfocused3.MediaDescriptionCompat.serializer(accessgetCursorAnchorInfoControllerp.serializer);
                }
                getbaseinputconnection2 = getbaseinputconnection;
                getbaseinputconnection2 = getbaseinputconnection;
                return createfromparcel;
            case 6:
                MutableStateFlow mutableStateFlow = ((isEditorFocused) this.MediaMetadataCompat).IconCompatParcelizer;
                Object obj2 = mutableStateFlow.read();
                getBaseInputConnection getbaseinputconnection3 = (obj2 instanceof getBaseInputConnection) ^ true ? null : (getBaseInputConnection) obj2;
                if (getbaseinputconnection3 != null) {
                    mutableStateFlow.IconCompatParcelizer(getBaseInputConnection.serializer(getbaseinputconnection3, null, true, 383));
                }
                return createfromparcel;
            case 7:
                isEditorFocused iseditorfocused4 = (isEditorFocused) this.MediaMetadataCompat;
                iseditorfocused4.RatingCompat.read(getUnspecifiedeUduSuo.CANCEL_WITHOUT_SAVING);
                iseditorfocused4.MediaDescriptionCompat.serializer(gettextbeforeselection);
                return createfromparcel;
            case 8:
                MutableStateFlow mutableStateFlow2 = ((isEditorFocused) this.MediaMetadataCompat).IconCompatParcelizer;
                Object obj3 = mutableStateFlow2.read();
                getBaseInputConnection getbaseinputconnection4 = obj3 instanceof getBaseInputConnection ? (getBaseInputConnection) obj3 : null;
                if (getbaseinputconnection4 != null) {
                    mutableStateFlow2.IconCompatParcelizer(getBaseInputConnection.serializer(getbaseinputconnection4, null, false, 383));
                }
                return createfromparcel;
            case 9:
                isEditorFocused iseditorfocused5 = (isEditorFocused) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(iseditorfocused5), null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(iseditorfocused5, removeNodeAtDepth.RemoteActionCompatParcelizer(iseditorfocused5.read), getbaseinputconnection2, 6), 3);
                return createfromparcel;
            case 10:
                TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommand = (TextInputServiceAndroidTextInputCommand) this.MediaMetadataCompat;
                textInputServiceAndroidTextInputCommand.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(textInputServiceAndroidTextInputCommand), null, null, new TermsAndConditionsViewModel$1(textInputServiceAndroidTextInputCommand, getbaseinputconnection2, i5), 3);
                return createfromparcel;
            case 11:
                ((TextInputServiceAndroidTextInputCommand) this.MediaMetadataCompat).serializer.serializer(getCharactersIUNYP9k.RemoteActionCompatParcelizer);
                return createfromparcel;
            case 12:
                TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommand2 = (TextInputServiceAndroidTextInputCommand) this.MediaMetadataCompat;
                Object obj4 = textInputServiceAndroidTextInputCommand2.write.read();
                if (obj4 instanceof KeyboardType) {
                    int i7 = serializer + 63;
                    read = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    keyboardType = (KeyboardType) obj4;
                }
                if (keyboardType != null) {
                    textInputServiceAndroidTextInputCommand2.serializer.serializer(new getWordsIUNYP9kannotations(keyboardType.RatingCompat, keyboardType.MediaMetadataCompat));
                }
                return createfromparcel;
            case 13:
                DeliveryNotesLinkUiModelImpl deliveryNotesLinkUiModelImpl = (DeliveryNotesLinkUiModelImpl) ((DeliveryNotesLinkUiModel) this.MediaMetadataCompat);
                Object obj5 = deliveryNotesLinkUiModelImpl.read.read();
                if (obj5 instanceof TextInputServiceAndroidstopInput2) {
                    int i8 = serializer + 71;
                    read = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        getbaseinputconnection2.hashCode();
                        throw null;
                    }
                    textInputServiceAndroidstopInput2 = (TextInputServiceAndroidstopInput2) obj5;
                }
                if (textInputServiceAndroidstopInput2 != null) {
                    deliveryNotesLinkUiModelImpl.serializer.serializer(new TextInputServiceAndroidcreateInputConnection1(textInputServiceAndroidstopInput2.read, textInputServiceAndroidstopInput2.RemoteActionCompatParcelizer));
                }
                return createfromparcel;
            case 14:
                isIncludeFontPaddingEnabled isincludefontpaddingenabled = (isIncludeFontPaddingEnabled) this.MediaMetadataCompat;
                getPlatformLocaleDelegate getplatformlocaledelegateSerializer = isincludefontpaddingenabled.serializer();
                if (getplatformlocaledelegateSerializer != null) {
                    int i9 = serializer + 119;
                    read = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        boolean z = getplatformlocaledelegateSerializer.MediaDescriptionCompat;
                        throw null;
                    }
                    if (getplatformlocaledelegateSerializer.MediaDescriptionCompat) {
                        isincludefontpaddingenabled.RemoteActionCompatParcelizer.IconCompatParcelizer(getPlatformLocaleDelegate.IconCompatParcelizer(getplatformlocaledelegateSerializer, 0, null, false, false, 127));
                    } else {
                        isincludefontpaddingenabled.write.serializer(parseLanguageTag.IconCompatParcelizer);
                    }
                }
                return createfromparcel;
            case 15:
                isIncludeFontPaddingEnabled isincludefontpaddingenabled2 = (isIncludeFontPaddingEnabled) this.MediaMetadataCompat;
                getPlatformLocaleDelegate getplatformlocaledelegateSerializer2 = isincludefontpaddingenabled2.serializer();
                if (getplatformlocaledelegateSerializer2 != null && getplatformlocaledelegateSerializer2.MediaSessionCompatQueueItem == null) {
                    isincludefontpaddingenabled2.RemoteActionCompatParcelizer.IconCompatParcelizer(getPlatformLocaleDelegate.IconCompatParcelizer(getplatformlocaledelegateSerializer2, 0, Integer.valueOf(R.drawable.ic_bold_large_open_in_full_default), false, false, Constant.ERROR_WSS_TIME_DIFF_LARGE));
                }
                return createfromparcel;
            case 16:
                isIncludeFontPaddingEnabled isincludefontpaddingenabled3 = (isIncludeFontPaddingEnabled) this.MediaMetadataCompat;
                getPlatformLocaleDelegate getplatformlocaledelegateSerializer3 = isincludefontpaddingenabled3.serializer();
                if (getplatformlocaledelegateSerializer3 != null) {
                    boolean z2 = getplatformlocaledelegateSerializer3.write;
                    if (!z2) {
                        i4 = R.drawable.ic_bold_large_collapse_default;
                    }
                    isincludefontpaddingenabled3.RemoteActionCompatParcelizer.IconCompatParcelizer(getPlatformLocaleDelegate.IconCompatParcelizer(getplatformlocaledelegateSerializer3, 0, Integer.valueOf(i4), !z2, false, 159));
                }
                return createfromparcel;
            case 17:
                createCharSequence createcharsequence = ((isIncludeFontPaddingEnabled) this.MediaMetadataCompat).IconCompatParcelizer;
                createcharsequence.serializer.logEvent("entrance_image_load_error", onMove.serializer(createcharsequence.write(), new onViewAttachedToWindowlambda0("is_detail_screen", String.valueOf(true))));
                int i10 = read + 17;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return createfromparcel;
            case 18:
                ((EntrancePictureIconUiModelImpl) this.MediaMetadataCompat).serializer.write(androidDefaultTypeface);
                return createfromparcel;
            case 19:
                EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl = (EntrancePictureIconUiModelImpl) this.MediaMetadataCompat;
                Object obj6 = entrancePictureIconUiModelImpl.RemoteActionCompatParcelizer.read();
                getNativeTypefacePYhJU0U getnativetypefacepyhju0u = (obj6 instanceof getNativeTypefacePYhJU0U) ^ true ? null : (getNativeTypefacePYhJU0U) obj6;
                if (getnativetypefacepyhju0u != null && getnativetypefacepyhju0u.serializer) {
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = entrancePictureIconUiModelImpl.PlaybackStateCompat;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    }
                    ContextScope contextScope = entrancePictureIconUiModelImpl.RatingCompat;
                    ((inCompatibilityMode) entrancePictureIconUiModelImpl.MediaBrowserCompatMediaItem).getClass();
                    entrancePictureIconUiModelImpl.PlaybackStateCompat = BuildersKt.RemoteActionCompatParcelizer(contextScope, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new DeliveryNotesUiModelImpl.AnonymousClass1(entrancePictureIconUiModelImpl, getnativetypefacepyhju0u, getbaseinputconnection2, 14), 2);
                }
                return createfromparcel;
            case 20:
                createCharSequence createcharsequence2 = ((EntrancePictureIconUiModelImpl) this.MediaMetadataCompat).MediaSessionCompatQueueItem;
                createcharsequence2.serializer.logEvent("entrance_image_load_error", onMove.serializer(createcharsequence2.write(), new onViewAttachedToWindowlambda0("is_detail_screen", String.valueOf(false))));
                return createfromparcel;
            case 21:
                ((resolveTextDirectionHeuristicsHklW4sAdefault) ((toUrlLink) this.MediaMetadataCompat)).IconCompatParcelizer.write(androidDefaultTypeface);
                return createfromparcel;
            case 22:
                createCharSequence createcharsequence3 = ((resolveTextDirectionHeuristicsHklW4sAdefault) ((toUrlLink) this.MediaMetadataCompat)).read;
                createcharsequence3.serializer.logEvent("entrance_image_load_error", onMove.serializer(createcharsequence3.write(), new onViewAttachedToWindowlambda0("is_detail_screen", String.valueOf(false))));
                return createfromparcel;
            case 23:
                ((resolveTextDirectionHeuristicsHklW4sAdefault) ((toUrlLink) this.MediaMetadataCompat)).IconCompatParcelizer.write(androidDefaultTypeface);
                return createfromparcel;
            case 24:
                NavigationButtonUiModelImpl navigationButtonUiModelImpl = (NavigationButtonUiModelImpl) this.MediaMetadataCompat;
                navigationButtonUiModelImpl.write.serializer(DefaultImpl.read);
                navigationButtonUiModelImpl.write(false);
                return createfromparcel;
            case 25:
                ((NavigationButtonUiModelImpl) this.MediaMetadataCompat).write(false);
                return createfromparcel;
            case 26:
                ((NavigationButtonUiModelImpl) this.MediaMetadataCompat).serializer();
                return createfromparcel;
            case 27:
                NavigationButtonUiModelImpl navigationButtonUiModelImpl2 = (NavigationButtonUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(navigationButtonUiModelImpl2.serializer, null, null, new HomeViewModel.AnonymousClass1(navigationButtonUiModelImpl2, null, 1), 3);
                return createfromparcel;
            case 28:
                NavigationButtonUiModelImpl navigationButtonUiModelImpl3 = (NavigationButtonUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(navigationButtonUiModelImpl3.serializer, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(navigationButtonUiModelImpl3, (ShortNewsContentCardView) getbaseinputconnection2, i3), 3);
                return createfromparcel;
            default:
                NavigationButtonUiModelImpl navigationButtonUiModelImpl4 = (NavigationButtonUiModelImpl) this.MediaMetadataCompat;
                BuildersKt.RemoteActionCompatParcelizer(navigationButtonUiModelImpl4.serializer, null, null, new HomeViewModel.AnonymousClass1(navigationButtonUiModelImpl4, null, 1), 3);
                return createfromparcel;
        }
    }
}
