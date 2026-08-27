package o;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class getKey2 implements PlatformTextInputMethodRequest {
    public android.graphics.Rect IconCompatParcelizer;
    public final accessgetGreencp MediaBrowserCompatMediaItem;
    public androidx.compose.foundation.text.LegacyTextFieldState MediaSessionCompatQueueItem;
    public androidx.compose.foundation.text.selection.TextFieldSelectionManager MediaSessionCompatToken;
    public androidx.compose.ui.platform.ViewConfiguration PlaybackStateCompat;
    public final View PlaybackStateCompatCustomAction;
    public final KeyedComposedModifier1 write;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat = new UiMediaScopeViewingDistance(6);
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat = new UiMediaScopeViewingDistance(7);
    public androidx.compose.ui.text.input.TextFieldValue RatingCompat = new androidx.compose.ui.text.input.TextFieldValue("", androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 4, (DefaultConstructorMarker) null);
    public androidx.compose.ui.text.input.ImeOptions read = androidx.compose.ui.text.input.ImeOptions.Companion.getDefault();
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final onViewDetachedFromWindowlambda1 serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new CoroutineLiveData$$ExternalSyntheticLambda0(19, this));

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        int i;
        String privateImeOptions;
        String text = this.RatingCompat.getText();
        long jM3330getSelectiond9O1mEE = this.RatingCompat.m3330getSelectiond9O1mEE();
        androidx.compose.ui.text.input.ImeOptions imeOptions = this.read;
        int iM3277getImeActioneUduSuo = imeOptions.m3277getImeActioneUduSuo();
        androidx.compose.ui.text.input.ImeAction.Companion companion = androidx.compose.ui.text.input.ImeAction.Companion;
        int i2 = 2;
        if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3261getDefaulteUduSuo())) {
            i = imeOptions.getSingleLine() ? 6 : 0;
        } else if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3265getNoneeUduSuo())) {
            i = 1;
        } else if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3263getGoeUduSuo())) {
            i = 2;
        } else if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3264getNexteUduSuo())) {
            i = 5;
        } else if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3266getPreviouseUduSuo())) {
            i = 7;
        } else if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3267getSearcheUduSuo())) {
            i = 3;
        } else if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3268getSendeUduSuo())) {
            i = 4;
        } else {
            if (!androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(iM3277getImeActioneUduSuo, companion.m3262getDoneeUduSuo())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        androidx.compose.ui.text.intl.LocaleList hintLocales = imeOptions.getHintLocales();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hintLocales, androidx.compose.ui.text.intl.LocaleList.Companion.getEmpty()}, getCieXyz.write())).booleanValue()) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(hintLocales, 10));
            Iterator<androidx.compose.ui.text.intl.Locale> it = hintLocales.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getPlatformLocale());
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        int iM3278getKeyboardTypePjHm6EE = imeOptions.m3278getKeyboardTypePjHm6EE();
        androidx.compose.ui.text.input.KeyboardType.Companion companion2 = androidx.compose.ui.text.input.KeyboardType.Companion;
        if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3322getTextPjHm6EE())) {
            i2 = 1;
        } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3315getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (!androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3318getNumberPjHm6EE())) {
            if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3321getPhonePjHm6EE())) {
                i2 = 3;
            } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3324getUriPjHm6EE())) {
                i2 = 17;
            } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3317getEmailPjHm6EE())) {
                i2 = 33;
            } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3320getPasswordPjHm6EE())) {
                i2 = 129;
            } else if (androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3319getNumberPasswordPjHm6EE())) {
                i2 = 18;
            } else {
                if (!androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(iM3278getKeyboardTypePjHm6EE, companion2.m3316getDecimalPjHm6EE())) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Invalid Keyboard Type");
                    return null;
                }
                i2 = 8194;
            }
        }
        editorInfo.inputType = i2;
        if (!imeOptions.getSingleLine()) {
            int i3 = editorInfo.inputType;
            if ((i3 & 1) == 1) {
                editorInfo.inputType = i3 | androidx.compose.ui.graphics.Fields.RenderEffect;
                if (androidx.compose.ui.text.input.ImeAction.m3248equalsimpl0(imeOptions.m3277getImeActioneUduSuo(), androidx.compose.ui.text.input.ImeAction.Companion.m3261getDefaulteUduSuo())) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int iM3276getCapitalizationIUNYP9k = imeOptions.m3276getCapitalizationIUNYP9k();
            androidx.compose.ui.text.input.KeyboardCapitalization.Companion companion3 = androidx.compose.ui.text.input.KeyboardCapitalization.Companion;
            if (androidx.compose.ui.text.input.KeyboardCapitalization.m3284equalsimpl0(iM3276getCapitalizationIUNYP9k, companion3.m3293getCharactersIUNYP9k())) {
                editorInfo.inputType |= androidx.compose.ui.graphics.Fields.TransformOrigin;
            } else if (androidx.compose.ui.text.input.KeyboardCapitalization.m3284equalsimpl0(iM3276getCapitalizationIUNYP9k, companion3.m3297getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.KeyboardCapitalization.m3284equalsimpl0(iM3276getCapitalizationIUNYP9k, companion3.m3295getSentencesIUNYP9k())) {
                editorInfo.inputType |= androidx.compose.ui.graphics.Fields.Clip;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= androidx.compose.ui.graphics.Fields.CompositingStrategy;
            }
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.TextRange.m3076getStartimpl(jM3330getSelectiond9O1mEE);
        editorInfo.initialSelEnd = androidx.compose.ui.text.TextRange.m3071getEndimpl(jM3330getSelectiond9O1mEE);
        DefaultInAppMessageViewWrapperCompanion.serializer(editorInfo, text);
        editorInfo.imeOptions |= 33554432;
        if (!FrameRateKt.RemoteActionCompatParcelizer || androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(imeOptions.m3278getKeyboardTypePjHm6EE(), companion2.m3320getPasswordPjHm6EE()) || androidx.compose.ui.text.input.KeyboardType.m3301equalsimpl0(imeOptions.m3278getKeyboardTypePjHm6EE(), companion2.m3319getNumberPasswordPjHm6EE())) {
            DefaultInAppMessageViewWrapperCompanion.serializer(editorInfo, false);
        } else {
            DefaultInAppMessageViewWrapperCompanion.serializer(editorInfo, true);
            invalidateFocusProperties.read(editorInfo);
        }
        keepScreenOn keepscreenon = KeepScreenOnKt.write;
        if (MutableRectKt.write()) {
            MutableRectKt.RemoteActionCompatParcelizer().read(editorInfo);
        }
        KeyedComposedModifier3 keyedComposedModifier3 = new KeyedComposedModifier3(this.RatingCompat, new androidx.camera.view.PendingValue(20, this), this.read.getAutoCorrect(), this.MediaSessionCompatQueueItem, this.MediaSessionCompatToken, this.PlaybackStateCompat);
        this.RemoteActionCompatParcelizer.add(new java.lang.ref.WeakReference(keyedComposedModifier3));
        return keyedComposedModifier3;
    }

    public getKey2(View view, getFrameRate getframerate, accessgetGreencp accessgetgreencp) {
        this.PlaybackStateCompatCustomAction = view;
        this.MediaBrowserCompatMediaItem = accessgetgreencp;
        this.write = new KeyedComposedModifier1(getframerate, accessgetgreencp);
    }
}
