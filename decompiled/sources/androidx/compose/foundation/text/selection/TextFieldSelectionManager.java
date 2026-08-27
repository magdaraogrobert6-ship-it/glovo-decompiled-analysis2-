package androidx.compose.foundation.text.selection;

import android.content.ClipDescription;
import androidx.camera.video.Recorder$3;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import o.BiasAlignment;
import o.DataStoreUtilsc;
import o.Modifier;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TriStateCheckbox;
import o.accessalljd;
import o.accessanyjd;
import o.accessfoldInjd;
import o.alignKFBX0sM;
import o.boximpl;
import o.createFromParcel;
import o.equalsimpl0;
import o.getBrush;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getEnd;
import o.getHighNSsRyOo;
import o.getLocalUiMediaScope;
import o.getNodeannotations;
import o.getParentui;
import o.getRequestDisallowInterceptTouchEvent;
import o.getVerticalBias;
import o.getViewportSizeYbymL2g;
import o.isAppSetIdReadingEnabled;
import o.isKindH91voCIui;
import o.onReset;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.seekAnimationsanimation_core;
import o.setNativeShader;
import o.unboximpl;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public int ComponentActivity;
    public long IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public final PopulateViewStructure_androidKtpopulate7 MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public FocusRequester MediaSessionCompatQueueItem;
    public HapticFeedback MediaSessionCompatResultReceiverWrapper;
    public TextRange MediaSessionCompatToken;
    public final PopulateViewStructure_androidKtpopulate7 ParcelableVolumeInfo;
    public final ut PlaybackStateCompat;
    public final PopulateViewStructure_androidKtpopulate7 RatingCompat;
    public TextRange RemoteActionCompatParcelizer;
    public TextFieldValue ResultReceiver;
    public Modifier r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public ut r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public LegacyTextFieldState r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final Recorder$3 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public TextToolbar r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final isKindH91voCIui r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final getVerticalBias r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public getContentViewGroupParentLayout read;
    public Clipboard serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;
    public OffsetMapping PlaybackStateCompatCustomAction = BiasAlignment.write;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getViewportSizeYbymL2g(24);
    public final PopulateViewStructure_androidKtpopulate7 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = CompositionKt.RemoteActionCompatParcelizer(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null));
    public VisualTransformation r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = VisualTransformation.Companion.getNone();

    public final TextFieldValue MediaDescriptionCompat() {
        return (TextFieldValue) ((onShowTranslationui) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).getValue();
    }

    public final void MediaMetadataCompat() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        boximpl boximplVar = (boximpl) this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaBrowserCompatMediaItem;
        if (boximplVar == null || (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = boximplVar.MediaDescriptionCompat) == null) {
            return;
        }
        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        boximplVar.MediaDescriptionCompat = null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return ((Boolean) this.MediaDescriptionCompat.getValue()).booleanValue();
    }

    public final boolean read() {
        return ((Boolean) this.MediaBrowserCompatMediaItem.getValue()).booleanValue();
    }

    public final Offset write() {
        return (Offset) this.write.getValue();
    }

    public TextFieldSelectionManager(getVerticalBias getverticalbias) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = getverticalbias;
        Boolean bool = Boolean.TRUE;
        this.MediaBrowserCompatMediaItem = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaDescriptionCompat = CompositionKt.RemoteActionCompatParcelizer(bool);
        Offset.Companion companion = Offset.Companion;
        this.IconCompatParcelizer = companion.m493getZeroF1C5BW0();
        this.MediaMetadataCompat = companion.m493getZeroF1C5BW0();
        this.RatingCompat = CompositionKt.RemoteActionCompatParcelizer(null);
        this.write = CompositionKt.RemoteActionCompatParcelizer(null);
        this.ComponentActivity = -1;
        this.ResultReceiver = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.ParcelableVolumeInfo = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        Recorder$3 recorder$3 = new Recorder$3(8);
        recorder$3.RemoteActionCompatParcelizer = equalsimpl0.Uninitialized;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = recorder$3;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new isKindH91voCIui(this);
        this.PlaybackStateCompat = new ut(this);
    }

    public static final void write(TextFieldSelectionManager textFieldSelectionManager, TextRange textRange) {
        Modifier modifier;
        AnnotatedString annotatedStringSerializer;
        String text;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        if (textRange == null || (modifier = textFieldSelectionManager.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) == null || (annotatedStringSerializer = textFieldSelectionManager.serializer()) == null || (text = annotatedStringSerializer.getText()) == null) {
            return;
        }
        OffsetMapping offsetMapping = textFieldSelectionManager.PlaybackStateCompatCustomAction;
        long jTextRange = TextRangeKt.TextRange(offsetMapping.originalToTransformed(TextRange.m3076getStartimpl(textRange.m3080unboximpl())), offsetMapping.originalToTransformed(TextRange.m3071getEndimpl(textRange.m3080unboximpl())));
        if (text.length() <= 0 || TextRange.m3070getCollapsedimpl(jTextRange) || (getcontentviewgroupparentlayout = textFieldSelectionManager.read) == null) {
            return;
        }
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(modifier, text, jTextRange, textRange, textFieldSelectionManager, offsetMapping, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0208  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d7  */
    public static final long IconCompatParcelizer(TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, long j, boolean z, boolean z2, seekAnimationsanimation_core seekanimationsanimation_core, boolean z3, HapticFeedbackType hapticFeedbackType) {
        TextLayoutResultProxy textLayoutResultProxySerializer;
        accessalljd accessalljdVar;
        boolean z4;
        boolean z5;
        HapticFeedback hapticFeedback;
        accessfoldInjd accessfoldinjdWrite;
        accessfoldInjd accessfoldinjd;
        accessfoldInjd accessfoldinjd2;
        accessalljd accessalljdVar2;
        boolean z6;
        String text;
        int i;
        int length;
        boolean z7;
        int iWrite;
        int iSerializer;
        int iWrite2;
        int i2;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null && (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) != null) {
            long jTextRange = TextRangeKt.TextRange(textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3076getStartimpl(textFieldValue.m3330getSelectiond9O1mEE())), textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3071getEndimpl(textFieldValue.m3330getSelectiond9O1mEE())));
            int iIconCompatParcelizer = textLayoutResultProxySerializer.IconCompatParcelizer(j, false);
            int iM3076getStartimpl = (z2 || z) ? iIconCompatParcelizer : TextRange.m3076getStartimpl(jTextRange);
            int iM3071getEndimpl = (!z2 || z) ? iIconCompatParcelizer : TextRange.m3071getEndimpl(jTextRange);
            ut utVar = textFieldSelectionManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int i3 = -1;
            if (!z && utVar != null && (i2 = textFieldSelectionManager.ComponentActivity) != -1) {
                i3 = i2;
            }
            TextLayoutResult textLayoutResult = textLayoutResultProxySerializer.RemoteActionCompatParcelizer;
            accessalljd accessalljdVar3 = z ? null : new accessalljd(new accessfoldInjd(DataStoreUtilsc.write(textLayoutResult, TextRange.m3076getStartimpl(jTextRange)), TextRange.m3076getStartimpl(jTextRange), 1L), new accessfoldInjd(DataStoreUtilsc.write(textLayoutResult, TextRange.m3071getEndimpl(jTextRange)), TextRange.m3071getEndimpl(jTextRange), 1L), TextRange.m3075getReversedimpl(jTextRange));
            ut utVar2 = new ut(z2, accessalljdVar3, new accessanyjd(iM3076getStartimpl, iM3071getEndimpl, i3, textLayoutResult), 6);
            if (accessalljdVar3 != null && utVar != null && z2 == utVar.write) {
                accessanyjd accessanyjdVar = (accessanyjd) utVar.MediaBrowserCompatMediaItem;
                if (iM3076getStartimpl == accessanyjdVar.read && iM3071getEndimpl == accessanyjdVar.IconCompatParcelizer) {
                    return textFieldValue.m3330getSelectiond9O1mEE();
                }
            }
            textFieldSelectionManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = utVar2;
            textFieldSelectionManager.ComponentActivity = iIconCompatParcelizer;
            int i4 = seekanimationsanimation_core.write;
            if (i4 == 3) {
                accessanyjd accessanyjdVar2 = (accessanyjd) utVar2.MediaBrowserCompatMediaItem;
                accessalljdVar = new accessalljd(accessanyjdVar2.IconCompatParcelizer(accessanyjdVar2.read), accessanyjdVar2.IconCompatParcelizer(accessanyjdVar2.IconCompatParcelizer), utVar2.PlaybackStateCompatCustomAction() == getLocalUiMediaScope.CROSSED);
            } else if (i4 == 4) {
                accessalljdVar = getRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(utVar2, getNodeannotations.RemoteActionCompatParcelizer);
            } else if (i4 != 5) {
                accessalljdVar = (accessalljd) utVar2.RatingCompat;
                accessanyjd accessanyjdVar3 = (accessanyjd) utVar2.MediaBrowserCompatMediaItem;
                if (accessalljdVar == null) {
                    accessalljdVar = getRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(utVar2, getNodeannotations.RemoteActionCompatParcelizer);
                } else {
                    accessfoldInjd accessfoldinjd3 = accessalljdVar.read;
                    accessfoldInjd accessfoldinjd4 = accessalljdVar.serializer;
                    if (utVar2.write) {
                        accessfoldinjdWrite = getRequestDisallowInterceptTouchEvent.write(utVar2, accessanyjdVar3, accessfoldinjd4);
                        accessfoldinjd = accessfoldinjdWrite;
                        accessfoldinjd2 = accessfoldinjd3;
                        accessfoldinjd3 = accessfoldinjd4;
                    } else {
                        accessfoldinjdWrite = getRequestDisallowInterceptTouchEvent.write(utVar2, accessanyjdVar3, accessfoldinjd3);
                        accessfoldinjd = accessfoldinjd4;
                        accessfoldinjd2 = accessfoldinjdWrite;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessfoldinjdWrite, accessfoldinjd3}, getCieXyz.write())).booleanValue()) {
                        accessalljdVar = new accessalljd(accessfoldinjd, accessfoldinjd2, utVar2.PlaybackStateCompatCustomAction() == getLocalUiMediaScope.CROSSED || (utVar2.PlaybackStateCompatCustomAction() == getLocalUiMediaScope.COLLAPSED && accessfoldinjd.write > accessfoldinjd2.write));
                        accessanyjd accessanyjdVar4 = (accessanyjd) utVar2.MediaBrowserCompatMediaItem;
                        accessfoldInjd accessfoldinjd5 = accessalljdVar.serializer;
                        long j2 = accessfoldinjd5.IconCompatParcelizer;
                        accessfoldInjd accessfoldinjd6 = accessalljdVar.read;
                        if (j2 == accessfoldinjd6.IconCompatParcelizer) {
                            if (accessfoldinjd5.write == accessfoldinjd6.write) {
                                accessalljdVar2 = (accessalljd) utVar2.RatingCompat;
                                String text2 = accessanyjdVar4.serializer.getLayoutInput().getText().getText();
                                if (accessalljdVar2 != null && text2.length() != 0) {
                                    z6 = utVar2.write;
                                    text = accessanyjdVar4.serializer.getLayoutInput().getText().getText();
                                    i = accessanyjdVar4.read;
                                    length = text.length();
                                    if (i == 0) {
                                        iWrite2 = getEnd.write(text, 0);
                                        if (z6) {
                                            accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd5, accessanyjdVar4, iWrite2), null, true, 2);
                                        } else {
                                            accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, null, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd6, accessanyjdVar4, iWrite2), false, 1);
                                        }
                                    } else if (i == length) {
                                        iSerializer = getEnd.serializer(text, length);
                                        if (z6) {
                                            accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd5, accessanyjdVar4, iSerializer), null, false, 2);
                                        } else {
                                            accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, null, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd6, accessanyjdVar4, iSerializer), true, 1);
                                        }
                                    } else {
                                        if (accessalljdVar2.RemoteActionCompatParcelizer) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z6 ^ z7) {
                                            iWrite = getEnd.serializer(text, i);
                                        } else {
                                            iWrite = getEnd.write(text, i);
                                        }
                                        if (z6) {
                                            accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd5, accessanyjdVar4, iWrite), null, z7, 2);
                                        } else {
                                            accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, null, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd6, accessanyjdVar4, iWrite), z7, 1);
                                        }
                                    }
                                }
                            }
                        } else {
                            boolean z8 = accessalljdVar.RemoteActionCompatParcelizer;
                            if ((z8 ? accessfoldinjd5 : accessfoldinjd6).write == 0) {
                                if (accessanyjdVar4.serializer.getLayoutInput().getText().getText().length() == (z8 ? accessfoldinjd6 : accessfoldinjd5).write) {
                                    accessalljdVar2 = (accessalljd) utVar2.RatingCompat;
                                    String text3 = accessanyjdVar4.serializer.getLayoutInput().getText().getText();
                                    if (accessalljdVar2 != null) {
                                        z6 = utVar2.write;
                                        text = accessanyjdVar4.serializer.getLayoutInput().getText().getText();
                                        i = accessanyjdVar4.read;
                                        length = text.length();
                                        if (i == 0) {
                                            iWrite2 = getEnd.write(text, 0);
                                            if (z6) {
                                                accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd5, accessanyjdVar4, iWrite2), null, true, 2);
                                            } else {
                                                accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, null, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd6, accessanyjdVar4, iWrite2), false, 1);
                                            }
                                        } else if (i == length) {
                                            iSerializer = getEnd.serializer(text, length);
                                            if (z6) {
                                                accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd5, accessanyjdVar4, iSerializer), null, false, 2);
                                            } else {
                                                accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, null, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd6, accessanyjdVar4, iSerializer), true, 1);
                                            }
                                        } else {
                                            if (accessalljdVar2.RemoteActionCompatParcelizer) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z6 ^ z7) {
                                                iWrite = getEnd.serializer(text, i);
                                            } else {
                                                iWrite = getEnd.write(text, i);
                                            }
                                            if (z6) {
                                                accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd5, accessanyjdVar4, iWrite), null, z7, 2);
                                            } else {
                                                accessalljdVar = accessalljd.RemoteActionCompatParcelizer(accessalljdVar, null, getRequestDisallowInterceptTouchEvent.read(accessfoldinjd6, accessanyjdVar4, iWrite), z7, 1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                accessalljdVar = getRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(utVar2, getNodeannotations.IconCompatParcelizer);
            }
            long jTextRange2 = TextRangeKt.TextRange(textFieldSelectionManager.PlaybackStateCompatCustomAction.transformedToOriginal(accessalljdVar.serializer.write), textFieldSelectionManager.PlaybackStateCompatCustomAction.transformedToOriginal(accessalljdVar.read.write));
            if (TextRange.m3069equalsimpl0(jTextRange2, textFieldValue.m3330getSelectiond9O1mEE())) {
                return textFieldValue.m3330getSelectiond9O1mEE();
            }
            boolean z9 = TextRange.m3075getReversedimpl(jTextRange2) != TextRange.m3075getReversedimpl(textFieldValue.m3330getSelectiond9O1mEE()) && TextRange.m3069equalsimpl0(TextRangeKt.TextRange(TextRange.m3071getEndimpl(jTextRange2), TextRange.m3076getStartimpl(jTextRange2)), textFieldValue.m3330getSelectiond9O1mEE());
            boolean z10 = TextRange.m3070getCollapsedimpl(jTextRange2) && TextRange.m3070getCollapsedimpl(textFieldValue.m3330getSelectiond9O1mEE());
            if (z3 && textFieldValue.getText().length() > 0 && !z9 && !z10 && hapticFeedbackType != null && (hapticFeedback = textFieldSelectionManager.MediaSessionCompatResultReceiverWrapper) != null) {
                hapticFeedback.mo1501performHapticFeedbackCdsT49E(hapticFeedbackType.m1508unboximpl());
            }
            textFieldSelectionManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(serializer(textFieldValue.getAnnotatedString(), jTextRange2));
            textFieldSelectionManager.MediaSessionCompatToken = TextRange.m3064boximpl(jTextRange2);
            if (!z3) {
                textFieldSelectionManager.serializer(!TextRange.m3070getCollapsedimpl(jTextRange2));
            }
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState2 != null) {
                ((onShowTranslationui) legacyTextFieldState2.RatingCompat).setValue(Boolean.valueOf(z3));
            }
            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState3 != null) {
                ((onShowTranslationui) legacyTextFieldState3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).setValue(Boolean.valueOf(!TextRange.m3070getCollapsedimpl(jTextRange2) && onReset.IconCompatParcelizer(textFieldSelectionManager, true)));
            }
            LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState4 != null) {
                if (TextRange.m3070getCollapsedimpl(jTextRange2)) {
                    z4 = false;
                } else {
                    z4 = false;
                    if (onReset.IconCompatParcelizer(textFieldSelectionManager, false)) {
                        z5 = true;
                    }
                    ((onShowTranslationui) legacyTextFieldState4.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).setValue(Boolean.valueOf(z5));
                }
                z5 = z4;
                ((onShowTranslationui) legacyTextFieldState4.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).setValue(Boolean.valueOf(z5));
            } else {
                z4 = false;
            }
            LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState5 != null) {
                if (TextRange.m3070getCollapsedimpl(jTextRange2) && onReset.IconCompatParcelizer(textFieldSelectionManager, true)) {
                    z4 = true;
                }
                ((onShowTranslationui) legacyTextFieldState5.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4).setValue(Boolean.valueOf(z4));
            }
            return jTextRange2;
        }
        return TextRange.Companion.m3081getZerod9O1mEE();
    }

    public static final boolean RemoteActionCompatParcelizer(TextFieldSelectionManager textFieldSelectionManager) {
        return !TextRange.m3070getCollapsedimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE());
    }

    public final void IconCompatParcelizer() {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.read;
        if (getcontentviewgroupparentlayout != null) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null, 0), 1);
        }
    }

    public final void RatingCompat() {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.read;
        if (getcontentviewgroupparentlayout != null) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null, 1), 1);
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null && !legacyTextFieldState.write() && (focusRequester = this.MediaSessionCompatQueueItem) != null) {
            FocusRequester.m380requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.ResultReceiver = MediaDescriptionCompat();
        serializer(z);
        serializer(alignKFBX0sM.Selection);
    }

    public final long read(boolean z) {
        TextLayoutResultProxy textLayoutResultProxySerializer;
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState == null || (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) == null) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        TextLayoutResult textLayoutResult = textLayoutResultProxySerializer.RemoteActionCompatParcelizer;
        AnnotatedString annotatedStringSerializer = serializer();
        if (annotatedStringSerializer == null) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedStringSerializer.getText(), textLayoutResult.getLayoutInput().getText().getText()}, getCieXyz.write())).booleanValue()) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        long jM3330getSelectiond9O1mEE = MediaDescriptionCompat().m3330getSelectiond9O1mEE();
        int iOriginalToTransformed = this.PlaybackStateCompatCustomAction.originalToTransformed(z ? TextRange.m3076getStartimpl(jM3330getSelectiond9O1mEE) : TextRange.m3071getEndimpl(jM3330getSelectiond9O1mEE));
        boolean zM3075getReversedimpl = TextRange.m3075getReversedimpl(MediaDescriptionCompat().m3330getSelectiond9O1mEE());
        int lineForOffset = textLayoutResult.getLineForOffset(iOriginalToTransformed);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(RangesKt.write(textLayoutResult.getHorizontalPosition(iOriginalToTransformed, textLayoutResult.getBidiRunDirection(((!z || zM3075getReversedimpl) && (z || !zM3075getReversedimpl)) ? Math.max(iOriginalToTransformed + (-1), 0) : iOriginalToTransformed) == textLayoutResult.getParagraphDirection(iOriginalToTransformed)), 0.0f, (int) (textLayoutResult.m3047getSizeYbymL2g() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(RangesKt.write(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L)))) & 4294967295L));
    }

    public final AnnotatedString serializer() {
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null) {
            return legacyTextFieldState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.MediaMetadataCompat;
        }
        return null;
    }

    public final void serializer(long j) {
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null) {
            ((onShowTranslationui) legacyTextFieldState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).setValue(TextRange.m3064boximpl(j));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState2 != null) {
            long jM3081getZerod9O1mEE = TextRange.Companion.m3081getZerod9O1mEE();
            ((onShowTranslationui) legacyTextFieldState2.serializer).setValue(TextRange.m3064boximpl(jM3081getZerod9O1mEE));
        }
        if (TextRange.m3070getCollapsedimpl(j)) {
            return;
        }
        serializer(false);
        serializer(alignKFBX0sM.None);
    }

    public final void serializer(alignKFBX0sM alignkfbx0sm) {
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.IconCompatParcelizer() == alignkfbx0sm) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                ((onShowTranslationui) legacyTextFieldState.IconCompatParcelizer).setValue(alignkfbx0sm);
            }
        }
    }

    public final void serializer(boolean z) {
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null) {
            ((onShowTranslationui) legacyTextFieldState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg).setValue(Boolean.valueOf(z));
        }
        if (z) {
            MediaSessionCompatQueueItem();
        } else {
            MediaMetadataCompat();
        }
    }

    public final void write(long j) {
        LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null) {
            ((onShowTranslationui) legacyTextFieldState.serializer).setValue(TextRange.m3064boximpl(j));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState2 != null) {
            long jM3081getZerod9O1mEE = TextRange.Companion.m3081getZerod9O1mEE();
            ((onShowTranslationui) legacyTextFieldState2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).setValue(TextRange.m3064boximpl(jM3081getZerod9O1mEE));
        }
        if (TextRange.m3070getCollapsedimpl(j)) {
            return;
        }
        serializer(false);
        serializer(alignKFBX0sM.None);
    }

    public final void write(Offset offset) {
        if (!TextRange.m3070getCollapsedimpl(MediaDescriptionCompat().m3330getSelectiond9O1mEE())) {
            LegacyTextFieldState legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState != null ? legacyTextFieldState.serializer() : null;
            TextFieldValue textFieldValueM3325copy3r_uNRQ$default = TextFieldValue.m3325copy3r_uNRQ$default(MediaDescriptionCompat(), (AnnotatedString) null, TextRangeKt.TextRange((offset == null || textLayoutResultProxySerializer == null) ? TextRange.m3073getMaximpl(MediaDescriptionCompat().m3330getSelectiond9O1mEE()) : this.PlaybackStateCompatCustomAction.transformedToOriginal(textLayoutResultProxySerializer.IconCompatParcelizer(offset.m487unboximpl(), true))), (TextRange) null, 5, (Object) null);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(textFieldValueM3325copy3r_uNRQ$default);
            this.MediaSessionCompatToken = TextRange.m3064boximpl(textFieldValueM3325copy3r_uNRQ$default.m3330getSelectiond9O1mEE());
        }
        serializer((offset == null || MediaDescriptionCompat().getText().length() <= 0) ? alignKFBX0sM.None : alignKFBX0sM.Cursor);
        serializer(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateClipboardEntry$foundation(ContinuationImpl continuationImpl) {
        getParentui getparentui;
        TextFieldSelectionManager textFieldSelectionManager;
        if (continuationImpl instanceof getParentui) {
            getparentui = (getParentui) continuationImpl;
            int i = getparentui.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getparentui.serializer = i - Integer.MIN_VALUE;
            } else {
                getparentui = new getParentui(this, continuationImpl);
            }
        } else {
            getparentui = new getParentui(this, continuationImpl);
        }
        Object objValueOf = getparentui.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getparentui.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objValueOf);
            Clipboard clipboard = this.serializer;
            if (clipboard != null) {
                getparentui.read = this;
                getparentui.serializer = 1;
                ClipDescription primaryClipDescription = clipboard.getNativeClipboard().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
                textFieldSelectionManager = this;
            }
            return createFromParcel.INSTANCE;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        textFieldSelectionManager = getparentui.read;
        ExtrasKt.RemoteActionCompatParcelizer(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        ((onShowTranslationui) textFieldSelectionManager.ParcelableVolumeInfo).setValue(bool);
        return createFromParcel.INSTANCE;
    }

    public final r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write(boolean z) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (getcontentviewgroupparentlayout != null) {
            return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z, shortNewsContentCardView, 0), 1);
        }
        return null;
    }

    public static final onViewAttachedToWindowlambda0 read(TextFieldSelectionManager textFieldSelectionManager) {
        String text;
        TextRange textRange;
        AnnotatedString annotatedStringSerializer = textFieldSelectionManager.serializer();
        if (annotatedStringSerializer == null || (text = annotatedStringSerializer.getText()) == null || (textRange = textFieldSelectionManager.MediaSessionCompatToken) == null) {
            return null;
        }
        long jM3080unboximpl = textRange.m3080unboximpl();
        return new onViewAttachedToWindowlambda0(text, TextRange.m3064boximpl(TextRangeKt.TextRange(textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3076getStartimpl(jM3080unboximpl)), textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3071getEndimpl(jM3080unboximpl)))));
    }

    public static TextFieldValue serializer(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    public final void MediaSessionCompatQueueItem() {
        LegacyTextFieldState legacyTextFieldState;
        getHighNSsRyOo gethighnssryoo;
        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
        ShortNewsContentCardView shortNewsContentCardView = null;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
        try {
            if (!RemoteActionCompatParcelizer() || ((legacyTextFieldState = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null && !((Boolean) ((onShowTranslationui) legacyTextFieldState.RatingCompat).getValue()).booleanValue())) {
                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                return;
            }
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            Recorder$3 recorder$3 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (((equalsimpl0) recorder$3.RemoteActionCompatParcelizer) == equalsimpl0.Uninitialized) {
                TriStateCheckbox.RemoteActionCompatParcelizer("ToolbarRequester is not initialized.");
            }
            boximpl boximplVar = (boximpl) recorder$3.MediaBrowserCompatMediaItem;
            if (boximplVar == null || !boximplVar.isAttached()) {
                return;
            }
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = boximplVar.MediaDescriptionCompat;
            if ((r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) && (gethighnssryoo = (getHighNSsRyOo) CompositionLocalConsumerModifierNodeKt.currentValueOf(boximplVar, unboximpl.RemoteActionCompatParcelizer)) != null) {
                boximplVar.MediaDescriptionCompat = BuildersKt.RemoteActionCompatParcelizer(boximplVar.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new RealImageLoader.AnonymousClass2(boximplVar, gethighnssryoo, shortNewsContentCardView, 14), 1);
            }
        } catch (Throwable th) {
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            throw th;
        }
    }
}
