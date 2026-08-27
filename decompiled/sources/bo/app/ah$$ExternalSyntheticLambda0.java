package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.material3.internal.BasicTooltipKt$anchorSemantics$1$1$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC0170getTimestamp;
import o.AlignmentCompanion;
import o.AlphaKt;
import o.AndroidContentCaptureManagersendContentCaptureAppearEvents1;
import o.BlurKtblur1;
import o.ComposedModifierKt;
import o.ExtendedFabSmallTokens;
import o.GapComposerKtExternalSyntheticLambda0;
import o.ImageBitmapDefaultImpls;
import o.LeftCompositionCancellationException;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SimpleItemTouchHelperCallback;
import o.addOnPictureInPictureModeChangedListener;
import o.addRoundRect;
import o.alpha;
import o.component11SzJe1aQ;
import o.component4;
import o.countTransparentColors;
import o.createFromAutofillValue;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.cubicTo;
import o.down;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.foldIn;
import o.getCameraDistance;
import o.getCieXyz;
import o.getColor;
import o.getContentViewGroupParentLayout;
import o.getCreditCardSecurityCode;
import o.getCurrent;
import o.getHandleruiannotations;
import o.getMax;
import o.getNonefpxItnM;
import o.getParent;
import o.getPersonLastName;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getRectangleGoahg;
import o.getSizeNHjbRc;
import o.hashCodeimpl;
import o.instance_delegatelambda0;
import o.isDocked;
import o.logUnregisterActivitylambda1;
import o.markAsAttachedui;
import o.onContentCardDismissed;
import o.onShowTranslationui;
import o.preferredFrameRate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setMax;
import o.setPath;
import o.setRootAutofillId;
import o.setRotationX;
import o.snapTo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ah$$ExternalSyntheticLambda0(cubicTo cubicto, addRoundRect addroundrect, countTransparentColors counttransparentcolors, Fragment fragment) {
        this.$r8$classId = 20;
        this.f$0 = addroundrect;
        this.f$1 = fragment;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:109:0x0210  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws PendingIntent.CanceledException {
        LinkInteractionListener linkInteractionListener;
        long jM492getUnspecifiedF1C5BW0;
        int iM3076getStartimpl;
        TextLayoutResultProxy textLayoutResultProxySerializer;
        LegacyTextFieldState legacyTextFieldState;
        AnnotatedString annotatedString;
        getCreditCardSecurityCode getcreditcardsecuritycode;
        getSizeNHjbRc getsizenhjbrc;
        List listIconCompatParcelizer;
        component4 component4VarSerializer;
        int i = 2;
        int i2 = 1;
        getSizeNHjbRc getsizenhjbrc2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                return ah.a((ah) this.f$0, (da) this.f$1);
            case 1:
                ((addOnPictureInPictureModeChangedListener) this.f$0).IconCompatParcelizer = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.f$1;
                return createFromParcel.INSTANCE;
            case 2:
                ((logUnregisterActivitylambda1) this.f$0).b_(this.f$1);
                return createFromParcel.INSTANCE;
            case 3:
                ((createInAppMessageEventSubscriber) this.f$0).IconCompatParcelizer = CompositionLocalConsumerModifierNodeKt.currentValueOf((FocusableNode) this.f$1, PinnableContainerKt.getLocalPinnableContainer());
                return createFromParcel.INSTANCE;
            case 4:
                return new getCurrent((alpha) this.f$0, SimpleItemTouchHelperCallback.serializer, (AlphaKt) this.f$1);
            case 5:
                getPersonLastName getpersonlastname = (getPersonLastName) this.f$0;
                PagerState pagerState = (PagerState) this.f$1;
                LeftCompositionCancellationException leftCompositionCancellationException = (LeftCompositionCancellationException) getpersonlastname.getValue();
                return new GapComposerKtExternalSyntheticLambda0(pagerState, leftCompositionCancellationException, new down((ensureSubscribedToInAppMessageEventslambda7) ((ExtendedFabSmallTokens) pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.IconCompatParcelizer).getValue(), leftCompositionCancellationException));
            case 6:
                TextFieldValue textFieldValue = (TextFieldValue) this.f$0;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.f$1;
                if (!TextRange.m3069equalsimpl0(textFieldValue.m3330getSelectiond9O1mEE(), ((TextFieldValue) populateViewStructure_androidKtpopulate7.getValue()).m3330getSelectiond9O1mEE())) {
                    populateViewStructure_androidKtpopulate7.setValue(textFieldValue);
                } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldValue.m3329getCompositionMzsxiRA(), ((TextFieldValue) populateViewStructure_androidKtpopulate7.getValue()).m3329getCompositionMzsxiRA()}, getCieXyz.write())).booleanValue()) {
                    populateViewStructure_androidKtpopulate7.setValue(textFieldValue);
                }
                return createFromParcel.INSTANCE;
            case 7:
                AnnotatedString.Range range = (AnnotatedString.Range) this.f$0;
                UriHandler uriHandler = (UriHandler) this.f$1;
                LinkAnnotation linkAnnotation = (LinkAnnotation) range.getItem();
                if (linkAnnotation instanceof LinkAnnotation.Url) {
                    LinkInteractionListener linkInteractionListener2 = ((LinkAnnotation.Url) linkAnnotation).getLinkInteractionListener();
                    if (linkInteractionListener2 != null) {
                        linkInteractionListener2.onClick(linkAnnotation);
                    } else {
                        try {
                            uriHandler.openUri(((LinkAnnotation.Url) linkAnnotation).getUrl());
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((linkAnnotation instanceof LinkAnnotation.Clickable) && (linkInteractionListener = ((LinkAnnotation.Clickable) linkAnnotation).getLinkInteractionListener()) != null) {
                    linkInteractionListener.onClick(linkAnnotation);
                }
                return createFromParcel.INSTANCE;
            case 8:
                ((createInAppMessageEventSubscriber) this.f$0).IconCompatParcelizer = ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$1).invoke();
                return createFromParcel.INSTANCE;
            case 9:
                return IntOffset.m3792boximpl(IntOffsetKt.m3818roundk4lQ0M(((hashCodeimpl) this.f$0).IconCompatParcelizer((LayoutCoordinates) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$1).invoke())));
            case 10:
                ((foldIn) this.f$0).IconCompatParcelizer.invoke((ComposedModifierKt) this.f$1);
                return createFromParcel.INSTANCE;
            case 11:
                Context context = (Context) this.f$0;
                TextClassification textClassification = (TextClassification) this.f$1;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    preferredFrameRate.read(activity);
                } else {
                    activity.send();
                }
                return createFromParcel.INSTANCE;
            case 12:
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.f$0, null, CoroutineStart.UNDISPATCHED, new ExecuteDatabaseRequest$invoke$2(i2, objArr == true ? 1 : 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$1), 1);
                return createFromParcel.INSTANCE;
            case 13:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.f$0;
                long jM3848unboximpl = ((IntSize) ((PopulateViewStructure_androidKtpopulate7) this.f$1).getValue()).m3848unboximpl();
                Offset offsetWrite = textFieldSelectionManager.write();
                if (offsetWrite != null) {
                    long jM487unboximpl = offsetWrite.m487unboximpl();
                    AnnotatedString annotatedStringSerializer = textFieldSelectionManager.serializer();
                    if (annotatedStringSerializer == null || annotatedStringSerializer.length() == 0) {
                        jM492getUnspecifiedF1C5BW0 = Offset.Companion.m492getUnspecifiedF1C5BW0();
                    } else {
                        AlignmentCompanion alignmentCompanion = (AlignmentCompanion) ((onShowTranslationui) textFieldSelectionManager.RatingCompat).getValue();
                        int i4 = alignmentCompanion == null ? -1 : markAsAttachedui.RemoteActionCompatParcelizer[alignmentCompanion.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1 || i4 == 2) {
                                iM3076getStartimpl = TextRange.m3076getStartimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE());
                            } else {
                                if (i4 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                iM3076getStartimpl = TextRange.m3071getEndimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE());
                            }
                            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (legacyTextFieldState2 == null || (textLayoutResultProxySerializer = legacyTextFieldState2.serializer()) == null || (legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) == null || (annotatedString = legacyTextFieldState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.MediaMetadataCompat) == null) {
                                jM492getUnspecifiedF1C5BW0 = Offset.Companion.m492getUnspecifiedF1C5BW0();
                            } else {
                                int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(iM3076getStartimpl), 0, annotatedString.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (textLayoutResultProxySerializer.IconCompatParcelizer(jM487unboximpl) >> 32));
                                TextLayoutResult textLayoutResult = textLayoutResultProxySerializer.RemoteActionCompatParcelizer;
                                int lineForOffset = textLayoutResult.getLineForOffset(iRemoteActionCompatParcelizer);
                                float lineLeft = textLayoutResult.getLineLeft(lineForOffset);
                                float lineRight = textLayoutResult.getLineRight(lineForOffset);
                                float fWrite = RangesKt.write(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
                                if (IntSize.m3842equalsimpl0(jM3848unboximpl, IntSize.Companion.m3849getZeroYbymL2g()) || Math.abs(fIntBitsToFloat - fWrite) <= ((int) (jM3848unboximpl >> 32)) / 2) {
                                    float lineTop = textLayoutResult.getLineTop(lineForOffset);
                                    jM492getUnspecifiedF1C5BW0 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fWrite)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((textLayoutResult.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop))));
                                } else {
                                    jM492getUnspecifiedF1C5BW0 = Offset.Companion.m492getUnspecifiedF1C5BW0();
                                }
                            }
                        } else {
                            jM492getUnspecifiedF1C5BW0 = Offset.Companion.m492getUnspecifiedF1C5BW0();
                        }
                    }
                } else {
                    jM492getUnspecifiedF1C5BW0 = Offset.Companion.m492getUnspecifiedF1C5BW0();
                }
                return Offset.m466boximpl(jM492getUnspecifiedF1C5BW0);
            case 14:
                setRootAutofillId setrootautofillid = (setRootAutofillId) this.f$0;
                getNonefpxItnM getnonefpxitnm = (getNonefpxItnM) this.f$1;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setrootautofillid, getnonefpxitnm.write}, getCieXyz.write())).booleanValue()) {
                    onContentCardDismissed.write((List) getnonefpxitnm.IconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new isDocked(i, setrootautofillid));
                    getHandleruiannotations gethandleruiannotations = getnonefpxitnm.serializer;
                    if (gethandleruiannotations != null && (getcreditcardsecuritycode = gethandleruiannotations.IconCompatParcelizer) != null) {
                        getcreditcardsecuritycode.IconCompatParcelizer(gethandleruiannotations, (Object) null);
                    }
                }
                return createFromParcel.INSTANCE;
            case 15:
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.f$0, null, null, new BasicTooltipKt$anchorSemantics$1$1$1((TooltipStateImpl) this.f$1, objArr2 == true ? 1 : 0, i3), 3);
                return Boolean.TRUE;
            case 16:
                getRectangleGoahg getrectanglegoahg = (getRectangleGoahg) this.f$0;
                Object obj = this.f$1;
                getPostalCode getpostalcode = getrectanglegoahg.RemoteActionCompatParcelizer;
                AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = getpostalcode.menuHostHelperlambda0;
                component4 component4VarSerializer2 = androidContentCaptureManagersendContentCaptureAppearEvents1.serializer();
                int i5 = 0;
                while (true) {
                    try {
                        if (i5 < androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer) {
                            if (component4VarSerializer2.MediaBrowserCompatMediaItem(i5)) {
                                Object objMediaMetadataCompat = component4VarSerializer2.MediaMetadataCompat(i5);
                                if (objMediaMetadataCompat != obj) {
                                    createFromAutofillValue createfromautofillvalue = objMediaMetadataCompat instanceof createFromAutofillValue ? (createFromAutofillValue) objMediaMetadataCompat : null;
                                    if ((createfromautofillvalue != null ? createfromautofillvalue.read : null) == obj) {
                                    }
                                }
                                getsizenhjbrc = new getSizeNHjbRc(null, i5);
                                component4VarSerializer2.write();
                                if (getsizenhjbrc != null) {
                                    int i6 = getsizenhjbrc.IconCompatParcelizer;
                                    Integer num = getsizenhjbrc.write;
                                    component4VarSerializer = androidContentCaptureManagersendContentCaptureAppearEvents1.serializer();
                                    try {
                                        ArrayList arrayListRemoteActionCompatParcelizer = com.sentiance.protobuf.j.RemoteActionCompatParcelizer(component4VarSerializer, i6, num);
                                        component4VarSerializer.write();
                                        listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(getpostalcode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(), arrayListRemoteActionCompatParcelizer);
                                    } catch (Throwable th) {
                                        component4VarSerializer.write();
                                        throw th;
                                    }
                                } else {
                                    listIconCompatParcelizer = instance_delegatelambda0.write;
                                }
                                return new BlurKtblur1(listIconCompatParcelizer, getpostalcode.fullyDrawnReporter_delegatelambda00);
                            }
                            int[] iArr = component4VarSerializer2.RatingCompat;
                            int i7 = AbstractC0170getTimestamp.read(iArr, i5);
                            int i8 = i5 + 1;
                            int i9 = i8 < component4VarSerializer2.MediaSessionCompatQueueItem ? iArr[(i8 * 5) + 4] : component4VarSerializer2.MediaSessionCompatToken;
                            int i10 = 0;
                            while (true) {
                                if (i10 < i9 - i7) {
                                    Object objSerializer = component4VarSerializer2.serializer(i5, i10);
                                    if (objSerializer != obj) {
                                        createFromAutofillValue createfromautofillvalue2 = objSerializer instanceof createFromAutofillValue ? (createFromAutofillValue) objSerializer : null;
                                        if ((createfromautofillvalue2 != null ? createfromautofillvalue2.read : null) != obj) {
                                            i10++;
                                        }
                                    }
                                    getsizenhjbrc2 = new getSizeNHjbRc(Integer.valueOf(i10), i5);
                                } else {
                                    i5 = i8;
                                }
                            }
                        }
                        component4VarSerializer2.write();
                        getsizenhjbrc = getsizenhjbrc2;
                        if (getsizenhjbrc != null) {
                            int i11 = getsizenhjbrc.IconCompatParcelizer;
                            Integer num2 = getsizenhjbrc.write;
                            component4VarSerializer = androidContentCaptureManagersendContentCaptureAppearEvents1.serializer();
                            ArrayList arrayListRemoteActionCompatParcelizer2 = com.sentiance.protobuf.j.RemoteActionCompatParcelizer(component4VarSerializer, i11, num2);
                            component4VarSerializer.write();
                            listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(getpostalcode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(), arrayListRemoteActionCompatParcelizer2);
                        } else {
                            listIconCompatParcelizer = instance_delegatelambda0.write;
                        }
                        return new BlurKtblur1(listIconCompatParcelizer, getpostalcode.fullyDrawnReporter_delegatelambda00);
                    } catch (Throwable th2) {
                        component4VarSerializer2.write();
                        throw th2;
                    }
                }
            case 17:
                return PreviewActivity.setParameterizedContent$lambda$0$1$0$0((getPlatformAndroidManager) this.f$0, (Object[]) this.f$1);
            case 18:
                addRoundRect addroundrect = (addRoundRect) this.f$0;
                cubicTo cubicto = (cubicTo) this.f$1;
                cubicto.getClass();
                synchronized (addroundrect.write) {
                    MutableStateFlow mutableStateFlow = addroundrect.read;
                    Iterable iterable = (Iterable) mutableStateFlow.read();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(cubicTo) obj2, cubicto}, getCieXyz.write())).booleanValue()) {
                            mutableStateFlow.IconCompatParcelizer(arrayList);
                        } else {
                            arrayList.add(obj2);
                        }
                    }
                    mutableStateFlow.IconCompatParcelizer(arrayList);
                }
                return createFromParcel.INSTANCE;
            case 19:
                ((setPath) this.f$0).write((cubicTo) this.f$1, false);
                return createFromParcel.INSTANCE;
            case 20:
                addRoundRect addroundrect2 = (addRoundRect) this.f$0;
                Fragment fragment = (Fragment) this.f$1;
                for (cubicTo cubicto2 : (Iterable) addroundrect2.MediaBrowserCompatMediaItem.read()) {
                    if (countTransparentColors.RemoteActionCompatParcelizer()) {
                        Objects.toString(cubicto2);
                        Objects.toString(fragment);
                    }
                    addroundrect2.IconCompatParcelizer(cubicto2);
                }
                return createFromParcel.INSTANCE;
            case 21:
                ((getCameraDistance) ((component11SzJe1aQ) this.f$0).MediaBrowserCompatMediaItem).read((snapTo) this.f$1);
                return createFromParcel.INSTANCE;
            case 22:
                getMax getmax = (getMax) this.f$0;
                getParent getparent = (getParent) this.f$1;
                getColor getcolor = getmax.write;
                getcolor.getClass();
                synchronized (getcolor.RatingCompat) {
                    if (getcolor.serializer.remove(getparent) && getcolor.serializer.isEmpty()) {
                        setRotationX setrotationx = setRotationX.read();
                        int i12 = setMax.write;
                        setrotationx.getClass();
                        getcolor.read.unregisterReceiver(getcolor.write);
                    }
                    break;
                }
                return createFromParcel.INSTANCE;
            case 23:
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.f$0;
                UUID uuid = (UUID) this.f$1;
                WorkDatabase workDatabase = workManagerImpl.PlaybackStateCompat;
                workDatabase.getClass();
                workDatabase.runInTransaction(new w4$$ExternalSyntheticLambda0(workManagerImpl, 8, uuid));
                ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(workManagerImpl.write, workManagerImpl.PlaybackStateCompat, workManagerImpl.MediaDescriptionCompat);
                return createFromParcel.INSTANCE;
            case 24:
                return b8.a((b8) this.f$0, (Set) this.f$1);
            case 25:
                return b8.a((b8) this.f$0, (g9) this.f$1);
            case 26:
                return d0.a((String) this.f$0, (View) this.f$1);
            case 27:
                return d0.a((a0) this.f$0, (String) this.f$1);
            case 28:
                return d4.a((Set) this.f$0, (Set) this.f$1);
            default:
                return g0.a((g0) this.f$0, (List) this.f$1);
        }
    }

    public /* synthetic */ ah$$ExternalSyntheticLambda0(TextLinkScope textLinkScope, AnnotatedString.Range range, UriHandler uriHandler) {
        this.$r8$classId = 7;
        this.f$0 = range;
        this.f$1 = uriHandler;
    }

    public /* synthetic */ ah$$ExternalSyntheticLambda0(addRoundRect addroundrect, cubicTo cubicto, boolean z) {
        this.$r8$classId = 18;
        this.f$0 = addroundrect;
        this.f$1 = cubicto;
    }

    public /* synthetic */ ah$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
