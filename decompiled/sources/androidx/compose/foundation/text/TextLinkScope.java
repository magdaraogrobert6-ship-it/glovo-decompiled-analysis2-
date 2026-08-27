package androidx.compose.foundation.text;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.lifecycle.BlockRunner$cancel$1;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.UiMediaScopeViewingDistance;
import o.accessgetReusableRectp;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.createFromParcel;
import o.execute;
import o.getBias;
import o.getBirthDateFull;
import o.getCenter;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHorizontalBias;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public final class TextLinkScope {
    public AnnotatedString IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(null);
    public final SnapshotStateList write = new SnapshotStateList();

    public TextLinkScope(AnnotatedString annotatedString) {
        this.IconCompatParcelizer = annotatedString.flatMapAnnotations(new UiMediaScopeViewingDistance(3));
    }

    public final void IconCompatParcelizer(Object[] objArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2083052099);
        int i2 = (i & 48) == 0 ? (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(this) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        getpostalcode.RemoteActionCompatParcelizer(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (getpostalcode.read(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= getpostalcode.IconCompatParcelizer(obj) ? 4 : 0;
        }
        getpostalcode.IconCompatParcelizer(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(2);
            applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            applydisplaycutoutmarginstocontentarealambda0.serializer(objArr);
            ArrayList arrayList = applydisplaycutoutmarginstocontentarealambda0.write;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(this);
            boolean z = (i3 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new waitForFirstLayout(this, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(array, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 4, this, objArr, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public final void LinksComposables(getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object objM;
        Object obj;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1154651354);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            UriHandler uriHandler = (UriHandler) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalUriHandler());
            AnnotatedString annotatedString = this.IconCompatParcelizer;
            List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
            int size = linkAnnotations.size();
            int i4 = 0;
            while (i4 < size) {
                AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i4);
                if (range.getStart() != range.getEnd()) {
                    getpostalcode.serializer(725478935);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objM = objComponentActivity;
                        objM = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                    }
                    objM = objComponentActivity;
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objM;
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new waitForFirstLayout(this, 27, range));
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    Object obj2 = objComponentActivity2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        UiMediaScopeViewingDistance uiMediaScopeViewingDistance = new UiMediaScopeViewingDistance(i3);
                        getpostalcode.write(uiMediaScopeViewingDistance);
                        obj2 = uiMediaScopeViewingDistance;
                    }
                    boolean z = false;
                    Modifier modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(execute.serializer(SemanticsModifierKt.semantics$default(modifierGraphicsLayer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, 1, null).then(new getBias(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 11, range))), mutableInteractionSourceImpl), PointerIcon.Companion.getHand(), false, 2, null);
                    boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(this);
                    boolean z2 = getpostalcode.read(range);
                    boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(uriHandler);
                    Object objComponentActivity3 = getpostalcode.ComponentActivity();
                    Object obj3 = objComponentActivity3;
                    if ((zIconCompatParcelizer | z2 | zIconCompatParcelizer2) || objComponentActivity3 == androidContentCaptureManager) {
                        ah$$ExternalSyntheticLambda0 ah__externalsyntheticlambda0 = new ah$$ExternalSyntheticLambda0(this, range, uriHandler);
                        getpostalcode.write(ah__externalsyntheticlambda0);
                        obj3 = ah__externalsyntheticlambda0;
                    }
                    BoxKt.Box(ClickableKt.RemoteActionCompatParcelizer(modifierPointerHoverIcon$default, mutableInteractionSourceImpl, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3), getpostalcode, 0);
                    if (!getHorizontalBias.RemoteActionCompatParcelizer(range.getItem().getStyles())) {
                        getpostalcode.serializer(726303039);
                        Object objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (objComponentActivity4 == androidContentCaptureManager) {
                            obj = objComponentActivity4;
                            getCenter getcenter = new getCenter(mutableInteractionSourceImpl);
                            getpostalcode.write(getcenter);
                            obj = getcenter;
                        }
                        obj = objComponentActivity4;
                        getCenter getcenter2 = (getCenter) obj;
                        Object objComponentActivity5 = getpostalcode.ComponentActivity();
                        Object obj4 = objComponentActivity5;
                        if (objComponentActivity5 == androidContentCaptureManager) {
                            BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1((Object) getcenter2, (ShortNewsContentCardView) (z ? 1 : 0), 10);
                            getpostalcode.write(blockRunner$cancel$1);
                            obj4 = blockRunner$cancel$1;
                        }
                        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4);
                        boolean zSerializer = getcenter2.serializer();
                        boolean zRemoteActionCompatParcelizer = getcenter2.RemoteActionCompatParcelizer();
                        boolean zIconCompatParcelizer3 = getcenter2.IconCompatParcelizer();
                        TextLinkStyles styles = range.getItem().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        TextLinkStyles styles2 = range.getItem().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        TextLinkStyles styles3 = range.getItem().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        TextLinkStyles styles4 = range.getItem().getStyles();
                        Object[] objArr = {Boolean.valueOf(zSerializer), Boolean.valueOf(zRemoteActionCompatParcelizer), Boolean.valueOf(zIconCompatParcelizer3), style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(this);
                        boolean z3 = getpostalcode.read(range);
                        Object objComponentActivity6 = getpostalcode.ComponentActivity();
                        Object obj5 = objComponentActivity6;
                        if ((zIconCompatParcelizer4 | z3) || objComponentActivity6 == androidContentCaptureManager) {
                            waitForFirstLayout waitforfirstlayout = new waitForFirstLayout(this, range, getcenter2);
                            getpostalcode.write(waitforfirstlayout);
                            obj5 = waitforfirstlayout;
                        }
                        IconCompatParcelizer(objArr, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, getpostalcode, (i2 << 6) & 896);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(728331710);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(728345598);
                    getpostalcode.IconCompatParcelizer(false);
                }
                i4++;
                i3 = 4;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(this, i, 5);
        }
    }

    public static AnnotatedString.Range serializer(AnnotatedString.Range range, TextLayoutResult textLayoutResult) {
        int lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult, textLayoutResult.getLineCount() - 1, false, 2, null);
        if (range.getStart() < lineEnd$default) {
            return AnnotatedString.Range.copy$default(range, null, 0, Math.min(range.getEnd(), lineEnd$default), null, 11, null);
        }
        return null;
    }
}
